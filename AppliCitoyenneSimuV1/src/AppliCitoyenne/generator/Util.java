package AppliCitoyenne.generator;

import java.util.ArrayList;
import java.util.List;

import AppliCitoyenne.simuV1.AdditionalSurvey;
import AppliCitoyenne.simuV1.AppDesc;
import AppliCitoyenne.simuV1.BotanicalSurvey;
import AppliCitoyenne.simuV1.ConfirmationSurvey;
import AppliCitoyenne.simuV1.Context;
import AppliCitoyenne.simuV1.Data;
import AppliCitoyenne.simuV1.GameObjective;
import AppliCitoyenne.simuV1.GameProfile;
import AppliCitoyenne.simuV1.GameTypePref;
import AppliCitoyenne.simuV1.Gender;
import AppliCitoyenne.simuV1.InventoryObjective;
import AppliCitoyenne.simuV1.LearningObjective;
import AppliCitoyenne.simuV1.BasicSurvey;
import AppliCitoyenne.simuV1.POI;
import AppliCitoyenne.simuV1.Species;
import AppliCitoyenne.simuV1.Target;
import AppliCitoyenne.simuV1.ZoneCirculaire;

public class Util {

	public static final int IDENTIFY_SPECIES = 0;
	public static final int IDENTIFY_GENDER = 1;
	public static final int USE_FOLIA = 2;
	public static final int USE_KEYS = 3;
	public static final int NO_LEARNING = 4;
	
	public static final int BASIC_SURVEY = 0;
	public static final int CONFIRM_SURVEY = 1;
	public static final int ADD_SURVEY = 2;
	public static final int TREE_SURVEY = 3;
	
	public static final int SOLO_SIMPLE = 0;
	public static final int SOLO_COMPOSED = 1;
	public static final int COLLAB_SIMPLE = 2;
	public static final int COMPET_SIMPLE = 3;
	public static final int COLLAB_COMPOSED = 4;
	public static final int COMPET_COMPOSED = 5;
	public static final int NO_GAME = 6;
	
	
	private Data root;
	private Context context;
	private AppDesc appRoot;
	private List<InventoryObjective> reducedInventoryObjectiveList;
	private List<LearningObjective> reducedLearningObjectiveList;
	private List<GameObjective> reducedGameObjectiveList;

	public Util(Data dataRoot, Context contextRoot, AppDesc appRoot) {
		root = dataRoot;
		context = contextRoot;
		this.appRoot = appRoot;

		reducedInventoryObjectiveList = new ArrayList<>();
		reducedLearningObjectiveList = new ArrayList<>();
		reducedGameObjectiveList = new ArrayList<>();

		for (Object o : appRoot.getObjective().getInventoryobjective()) {
			InventoryObjective obj = (InventoryObjective) o;
			reducedInventoryObjectiveList.add(obj);
		}
		
		for (Object o : appRoot.getObjective().getLearningobjective()) {
			LearningObjective obj = (LearningObjective) o;
			reducedLearningObjectiveList.add(obj);
		}
		
		for (Object o : appRoot.getObjective().getGameobjective()) {
			GameObjective obj = (GameObjective) o;
			reducedGameObjectiveList.add(obj);
		}
		
		
	}

	public List<BotanicalSurvey> getSurveysInZone() {
		List<BotanicalSurvey> res = new ArrayList<>();
		List<BotanicalSurvey> list = root.getBotanicalsurveys();
		for (BotanicalSurvey surv : list) {
			if (isPOIinContext(surv.getPoi())) {
				//if (!surv.getProfile().equals(context.getProfile())) {
					res.add(surv);
				//}
			}
		}
		return res;
	}

	public List<BasicSurvey> getBasicSurveysInZone() {
		List<BasicSurvey> res = new ArrayList<>();
		List<BotanicalSurvey> list = getSurveysInZone();
		//System.out.println("Bsic Surveys in zone: ");
		for (BotanicalSurvey surv : list) {
			if (surv instanceof BasicSurvey) {
				res.add((BasicSurvey) surv);
				//System.out.print(surv.getId());
			}
		}
		return res;
	}

	public List<ConfirmationSurvey> getConfirmationSurveysInZone() {
		List<ConfirmationSurvey> res = new ArrayList<>();
		List<BotanicalSurvey> list = getSurveysInZone();
		for (BotanicalSurvey surv : list) {
			if (surv instanceof ConfirmationSurvey) {
				res.add((ConfirmationSurvey) surv);
			}
		}
		return res;
	}

	public List<AdditionalSurvey> getAdditionalSurveysInZone() {
		List<AdditionalSurvey> res = new ArrayList<>();
		List<BotanicalSurvey> list = getSurveysInZone();
		for (BotanicalSurvey surv : list) {
			if (surv instanceof AdditionalSurvey) {
				res.add((AdditionalSurvey) surv);
			}
		}
		return res;
	}

	private boolean isPOIinContext(POI poi) {
		int distEucl = (int) Math.sqrt(Math.pow(poi.getX() - ((ZoneCirculaire) context.getZone()).getX(), 2)
				+ Math.pow(poi.getY() - ((ZoneCirculaire) context.getZone()).getY(), 2));

		return distEucl <= ((ZoneCirculaire) context.getZone()).getRayon();
	}

	public Object pickOneRandomizedElementFrom(List list) {
		if (list.isEmpty())
			return null;
		int index = (int) (Math.random() * list.size());
		return list.get(index);
	}

	public List<GameObjective> weightedGameObjectives(boolean notConcerned) {
		if (notConcerned) {
			return reducedGameObjectiveList;
		}
		
		List<GameObjective> res = new ArrayList<>();
		GameProfile profile = context.getProfile().getGameprofile();
		for (Object pref : profile.getGametypepref()) {
			GameTypePref cpref = (GameTypePref) pref;
			for (int i = 0; i < cpref.getPonderation(); i++)
				res.add(cpref.getGameobjective());
		}
		return res;
	}

	public void analysis(Context contextRoot) {
		
		// pas de relevés fiables ? => pas de relevés additionnels
		List<BasicSurvey> basicReliableSurveys = getReliableFrom(getBasicSurveysInZone());  
		if (basicReliableSurveys.isEmpty()) {
			reducedInventoryObjectiveList.remove(appRoot.getObjective().getInventoryobjective().get(ADD_SURVEY));
			reducedLearningObjectiveList.remove(appRoot.getObjective().getLearningobjective().get(IDENTIFY_SPECIES));
			reducedLearningObjectiveList.remove(appRoot.getObjective().getLearningobjective().get(IDENTIFY_GENDER));
		} else {
			// verifier que l'on n'a deja fourni des données additionnelles
			if (getBasicSurveysToCompleteForMe(basicReliableSurveys).isEmpty()) {
				reducedInventoryObjectiveList.remove(appRoot.getObjective().getInventoryobjective().get(ADD_SURVEY));
				reducedLearningObjectiveList.remove(appRoot.getObjective().getLearningobjective().get(IDENTIFY_GENDER));
				reducedLearningObjectiveList.remove(appRoot.getObjective().getLearningobjective().get(IDENTIFY_SPECIES));
			}
		}
		// pas de relevés non fiables ? => pas de relevés de confirmation/infirmation
		if (getNonReliableFrom(getBasicSurveysInZone()).isEmpty()) {
			reducedInventoryObjectiveList.remove(appRoot.getObjective().getInventoryobjective().get(CONFIRM_SURVEY));
		} else {
			// verifier que l'on n'est ni à l'origine des relevés ni que l'on a deja fourni des données additionnelles
			if (getBasicSurveysToConfirmForMe(basicReliableSurveys).isEmpty()) {
				reducedInventoryObjectiveList.remove(appRoot.getObjective().getInventoryobjective().get(ADD_SURVEY));
			}
		}
		
		if (contextRoot.getProfile().getGameprofile().isNoInterest()) {
			reducedGameObjectiveList.clear();
			reducedGameObjectiveList.add((GameObjective)appRoot.getObjective().getGameobjective().get(NO_GAME));
		} else {
			reducedGameObjectiveList.remove(appRoot.getObjective().getGameobjective().get(NO_GAME));
		}
		
		if (contextRoot.getProfile().getBotanicalprofile().isNoInterest()) {
			reducedLearningObjectiveList.clear();
			reducedLearningObjectiveList.add((LearningObjective)appRoot.getObjective().getLearningobjective().get(NO_LEARNING));
		} /*else {
			reducedLearningObjectiveList.remove(appRoot.getObjective().getLearningobjective().get(NO_LEARNING));
		}*/
	}

	private List<BasicSurvey> getBasicSurveysToCompleteForMe(List<BasicSurvey> basicReliableSurveys) {
		List<BasicSurvey> res = new ArrayList<>();
		for (BasicSurvey surv: basicReliableSurveys) {
			/*if (surv.getProfile().equals(context.getProfile()))
				continue;*/
			boolean found = false;
			for (AdditionalSurvey addS: (List<AdditionalSurvey>)surv.getAdditionalsurvey()) {
				if (addS.getProfile().equals(context.getProfile())) {
					found = true;
					break;
				}
			}
			if (!found)
				res.add(surv);
		}
		return res;
	}

	private List<BasicSurvey> getBasicSurveysToConfirmForMe(List<BasicSurvey> basicReliableSurveys) {
		List<BasicSurvey> res = new ArrayList<>();
		for (BasicSurvey surv: basicReliableSurveys) {
			if (surv.getProfile().equals(context.getProfile()))
				continue;
			boolean found = false;
			for (ConfirmationSurvey addS: (List<ConfirmationSurvey>)surv.getConfirmationsurvey()) {
				if (!addS.getProfile().equals(context.getProfile())) {
					found = true;
					break;
				}
			}
			if (!found)
				res.add(surv);
		}
		return res;
	}
	
	private List<BasicSurvey> getNonReliableFrom(List<BasicSurvey> basicSurveysInZone) {
		List<BasicSurvey> res = new ArrayList<>();
		for (BasicSurvey surv: basicSurveysInZone)
			if (getCalculatedReliabilityScore(surv) < 6)
				res.add(surv);
		return res;
	}

	private List<BasicSurvey> getReliableFrom(List<BasicSurvey> basicSurveysInZone) {
		List<BasicSurvey> res = new ArrayList<>();
		for (BasicSurvey surv: basicSurveysInZone)
			if (getCalculatedReliabilityScore(surv) >= 6)
				res.add(surv);
		return res;
	}

	private int getCalculatedReliabilityScore(BasicSurvey surv) {
		int res = surv.getReliabilityScore();
		for (ConfirmationSurvey cs: (List<ConfirmationSurvey>) surv.getConfirmationsurvey()) {
			if (compliantTarget(cs.getTarget(), surv.getTarget())) {
				res += cs.getReliabilityScore();
			}
		}
		return res;
	}

	private boolean compliantTarget(Target firstTarget, Target confirmationTarget) {
		if (firstTarget instanceof Species) {
			if (confirmationTarget instanceof Species) {
				return (((Species) firstTarget).getName().equals(((Species) confirmationTarget).getName()));
			} else return false;
		} else {
			if (confirmationTarget instanceof Species) {
				return (((Gender) firstTarget).getName().equals(((Gender)((Species) confirmationTarget).eContainer()).getName()));
			} else return (((Gender) firstTarget).getName().equals(((Species) confirmationTarget).getName()));
		}
	}

	public ObjectivesTriplet getTriplet() {
		ObjectivesTriplet res = new ObjectivesTriplet();

		InventoryObjective objCit = (InventoryObjective) pickOneRandomizedElementFrom(reducedInventoryObjectiveList);
		res.setiObj(objCit);

		LearningObjective objBot = (LearningObjective) pickOneRandomizedElementFrom(reducedLearningObjectiveList);
		res.setlObj(objBot);

		GameObjective objGame = (GameObjective) pickOneRandomizedElementFrom(weightedGameObjectives(context.getProfile().getGameprofile().isNoInterest()));
		res.setgObj(objGame);

		return res;
	}

}
