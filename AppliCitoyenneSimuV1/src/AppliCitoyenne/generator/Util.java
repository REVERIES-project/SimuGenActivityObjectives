package AppliCitoyenne.generator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import AppliCitoyenne.simuV1.AdditionalSurvey;
import AppliCitoyenne.simuV1.AppDesc;
import AppliCitoyenne.simuV1.BotanicalSurvey;
import AppliCitoyenne.simuV1.ConfirmationSurvey;
import AppliCitoyenne.simuV1.Context;
import AppliCitoyenne.simuV1.Data;
import AppliCitoyenne.simuV1.GameObjective;
import AppliCitoyenne.simuV1.GameProfile;
import AppliCitoyenne.simuV1.GameTypePref;
import AppliCitoyenne.simuV1.InventoryObjective;
import AppliCitoyenne.simuV1.InventoryPref;
import AppliCitoyenne.simuV1.InventoryProfile;
import AppliCitoyenne.simuV1.LearningObjective;
import AppliCitoyenne.simuV1.NewSurvey;
import AppliCitoyenne.simuV1.POI;
import AppliCitoyenne.simuV1.ZoneCirculaire;

public class Util {

	private Data root;
	private Context context;
	private AppDesc appRoot;
	private EList<InventoryObjective> reducedInventoryObjectiveList;

	public Util(Data dataRoot, Context contextRoot, AppDesc appRoot) {
		root = dataRoot;
		context = contextRoot;
		this.appRoot = appRoot;

		reducedInventoryObjectiveList = new BasicEList<>();

		for (Object o : appRoot.getObjective().getInventoryobjective()) {
			InventoryObjective obj = (InventoryObjective) o;
			reducedInventoryObjectiveList.add(obj);
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

	public List<NewSurvey> getNewSurveysInZone() {
		List<NewSurvey> res = new ArrayList<NewSurvey>();
		List<BotanicalSurvey> list = getSurveysInZone();
		for (BotanicalSurvey surv : list) {
			if (surv instanceof NewSurvey) {
				res.add((NewSurvey) surv);
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

	public Object pickOneRandomizedElementFrom(EList list) {
		if (list.isEmpty())
			return null;
		int index = (int) (Math.random() * list.size());
		return list.get(index);
	}

	public EList<InventoryObjective> weightedInventoryObjectives() {
		EList<InventoryObjective> res = new BasicEList<>();

		for (Object pref : context.getProfile().getInventoryprofile().getInventorypref()) {
			InventoryPref cpref = (InventoryPref) pref;

			if (!reducedInventoryObjectiveList.contains(cpref.getInventoryobjective()))
				continue;
			for (int i = 0; i < cpref.getPonderation(); i++)
				res.add(cpref.getInventoryobjective());
		}

		return res;
	}

	public EList<GameObjective> weightedGameObjectives() {
		EList<GameObjective> res = new BasicEList<>();
		GameProfile profile = context.getProfile().getGameprofile();
		for (Object pref : profile.getGametypepref()) {
			GameTypePref cpref = (GameTypePref) pref;
			for (int i = 0; i < cpref.getPonderation(); i++)
				res.add(cpref.getGameobjective());
		}

		return res;
	}

	public void analysis(Context contextRoot) {
		if (getReliableFrom(getNewSurveysInZone()).size() == 0) {
			//reducedInventoryObjectiveList.remove(appRoot.getObjective().getInventoryobjective().get(1));
			reducedInventoryObjectiveList.remove(appRoot.getObjective().getInventoryobjective().get(2));
		}
	}

	private List<NewSurvey> getReliableFrom(List<NewSurvey> newSurveysInZone) {
		List<NewSurvey> res = new ArrayList<NewSurvey>();
		for (NewSurvey surv: newSurveysInZone)
			if (surv.getReliabilityScore() >= 6)
				res.add(surv);
		return res;
	}

	public ObjectivesTriplet getTriplet() {
		ObjectivesTriplet res = new ObjectivesTriplet();

		InventoryObjective objCit = (InventoryObjective) pickOneRandomizedElementFrom(weightedInventoryObjectives());
		// generatedActivity.setInventoryobjective(objCit);
		res.setiObj(objCit);

		LearningObjective objBot = (LearningObjective) pickOneRandomizedElementFrom(
				appRoot.getObjective().getLearningobjective());
		// generatedActivity.setLearningobjective(objBot);
		res.setlObj(objBot);

		GameObjective objGame = (GameObjective) pickOneRandomizedElementFrom(weightedGameObjectives());
		// generatedActivity.setGameobjective(objGame);
		res.setgObj(objGame);

		return res;
	}

}
