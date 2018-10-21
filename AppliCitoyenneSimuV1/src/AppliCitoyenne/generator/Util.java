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

	private Data root;
	private Context context;
	private AppDesc appRoot;
	private List<InventoryObjective> reducedInventoryObjectiveList;
	private List<LearningObjective> reducedLearningObjectiveList;

	public Util(Data dataRoot, Context contextRoot, AppDesc appRoot) {
		root = dataRoot;
		context = contextRoot;
		this.appRoot = appRoot;

		reducedInventoryObjectiveList = new ArrayList<InventoryObjective>();
		reducedLearningObjectiveList = new ArrayList<LearningObjective>();

		for (Object o : appRoot.getObjective().getInventoryobjective()) {
			InventoryObjective obj = (InventoryObjective) o;
			reducedInventoryObjectiveList.add(obj);
		}
		
		for (Object o : appRoot.getObjective().getLearningobjective()) {
			LearningObjective obj = (LearningObjective) o;
			reducedLearningObjectiveList.add(obj);
		}
	}

	public List<BotanicalSurvey> getSurveysInZone() {
		List<BotanicalSurvey> res = new ArrayList<BotanicalSurvey>();
		List<BotanicalSurvey> list = root.getBotanicalsurveys();
		for (BotanicalSurvey surv : list) {
			if (isPOIinContext(surv.getPoi())) {
				if (!surv.getProfile().equals(context.getProfile())) {
					res.add(surv);
				}

			}
		}

		return res;
	}

	public List<BasicSurvey> getBasicSurveysInZone() {
		List<BasicSurvey> res = new ArrayList<BasicSurvey>();
		List<BotanicalSurvey> list = getSurveysInZone();
		for (BotanicalSurvey surv : list) {
			if (surv instanceof BasicSurvey) {
				res.add((BasicSurvey) surv);
			}
		}
		return res;
	}

	public List<ConfirmationSurvey> getConfirmationSurveysInZone() {
		List<ConfirmationSurvey> res = new ArrayList<ConfirmationSurvey>();
		List<BotanicalSurvey> list = getSurveysInZone();
		for (BotanicalSurvey surv : list) {
			if (surv instanceof ConfirmationSurvey) {
				res.add((ConfirmationSurvey) surv);
			}
		}
		return res;
	}

	public List<AdditionalSurvey> getAdditionalSurveysInZone() {
		List<AdditionalSurvey> res = new ArrayList<AdditionalSurvey>();
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

	public List<GameObjective> weightedGameObjectives() {
		List<GameObjective> res = new ArrayList<GameObjective>();
		GameProfile profile = context.getProfile().getGameprofile();
		for (Object pref : profile.getGametypepref()) {
			GameTypePref cpref = (GameTypePref) pref;
			for (int i = 0; i < cpref.getPonderation(); i++)
				res.add(cpref.getGameobjective());
		}

		return res;
	}

	public void analysis(Context contextRoot) {
		// pas de relevés fiables ? => pas de relevés additionnels ET pas de 
		List<BasicSurvey> basicReliableSurveys = getReliableFrom(getBasicSurveysInZone());  
		if (basicReliableSurveys.size() == 0) {
			reducedInventoryObjectiveList.remove(appRoot.getObjective().getInventoryobjective().get(2));
			reducedLearningObjectiveList.remove(appRoot.getObjective().getLearningobjective().get(0));
			reducedLearningObjectiveList.remove(appRoot.getObjective().getLearningobjective().get(1));
		} else {
			// verifier que l'on n'est ni à l'origine des relevés ni que l'on a deja fourni des données additionnelles
			if (getBasicSurveysToCompleteForMe(basicReliableSurveys).size() == 0) {
				reducedInventoryObjectiveList.remove(appRoot.getObjective().getInventoryobjective().get(2));
				reducedLearningObjectiveList.remove(appRoot.getObjective().getLearningobjective().get(0));
				reducedLearningObjectiveList.remove(appRoot.getObjective().getLearningobjective().get(1));
			}
		}
		// pas de relevés non fiables ? => pas de relevés de confirmation/infirmation
		if (getNonReliableFrom(getBasicSurveysInZone()).size() == 0) {
			reducedInventoryObjectiveList.remove(appRoot.getObjective().getInventoryobjective().get(1));
		} else {
			// verifier que l'on n'est ni à l'origine des relevés ni que l'on a deja fourni des données additionnelles
			if (getBasicSurveysToConfirmForMe(basicReliableSurveys).size() == 0) {
				reducedInventoryObjectiveList.remove(appRoot.getObjective().getInventoryobjective().get(1));
			}
		}
		
	}

	private List<BasicSurvey> getBasicSurveysToCompleteForMe(List<BasicSurvey> basicReliableSurveys) {
		List<BasicSurvey> res = new ArrayList<BasicSurvey>();
		for (BasicSurvey surv: basicReliableSurveys) {
			if (surv.getProfile().equals(context.getProfile()))
				continue;
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
		List<BasicSurvey> res = new ArrayList<BasicSurvey>();
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
		List<BasicSurvey> res = new ArrayList<BasicSurvey>();
		for (BasicSurvey surv: basicSurveysInZone)
			if (getCalculatedReliabilityScore(surv) < 6)
				res.add(surv);
		return res;
	}

	private List<BasicSurvey> getReliableFrom(List<BasicSurvey> basicSurveysInZone) {
		List<BasicSurvey> res = new ArrayList<BasicSurvey>();
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
		// generatedActivity.setInventoryobjective(objCit);
		res.setiObj(objCit);

		LearningObjective objBot = (LearningObjective) pickOneRandomizedElementFrom(reducedLearningObjectiveList);
		// generatedActivity.setLearningobjective(objBot);
		res.setlObj(objBot);

		GameObjective objGame = (GameObjective) pickOneRandomizedElementFrom(weightedGameObjectives());
		// generatedActivity.setGameobjective(objGame);
		res.setgObj(objGame);

		return res;
	}

}
