package AppliCitoyenne.generator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import AppliCitoyenne.simuV1.Activity;
import AppliCitoyenne.simuV1.AppDesc;
import AppliCitoyenne.simuV1.GameObjective;
import AppliCitoyenne.simuV1.InventoryObjective;
import AppliCitoyenne.simuV1.LearningObjective;

public class ObjectiveAnalyzer {

	private Set<ObjectivesTriplet> results;
	private Map<InventoryObjective, Integer> inventoryObjectiveCounter;
	private Map<GameObjective, Integer> gameObjectiveCounter;
	private Map<LearningObjective, Integer> learningObjectiveCounter;
	private int cptActivity = 0;
	
	
	public ObjectiveAnalyzer(AppDesc appRoot) {
		
		results = new HashSet<>();
		
		inventoryObjectiveCounter = new HashMap<>();
		for (Object obj: appRoot.getObjective().getInventoryobjective()) {
			InventoryObjective inVObj = (InventoryObjective) obj;
			inventoryObjectiveCounter.put(inVObj, 0);
		}
		
		gameObjectiveCounter = new HashMap<>();
		for (Object obj: appRoot.getObjective().getGameobjective()) {
			GameObjective inVObj = (GameObjective) obj;
			gameObjectiveCounter.put(inVObj, 0);
		}
		
		learningObjectiveCounter = new HashMap<>();
		for (Object obj: appRoot.getObjective().getLearningobjective()) {
			LearningObjective inVObj = (LearningObjective) obj;
			learningObjectiveCounter.put(inVObj, 0);
		}
	}
	
	
	public void addActivity(Activity activity) {
		InventoryObjective key = activity.getInventoryobjective();
		Integer newValue = new Integer(inventoryObjectiveCounter.get(key).intValue() + 1); 
		inventoryObjectiveCounter.put(key, newValue);
		
		GameObjective keyG = activity.getGameobjective();
		Integer newValueG = new Integer(gameObjectiveCounter.get(keyG).intValue() + 1); 
		gameObjectiveCounter.put(keyG, newValueG);
		
		LearningObjective keyL = activity.getLearningobjective();
		Integer newValueL = new Integer(learningObjectiveCounter.get(keyL).intValue() + 1); 
		learningObjectiveCounter.put(keyL, newValueL);
		
		cptActivity ++;
		
		ObjectivesTriplet newTriplet = new ObjectivesTriplet(key, keyL, keyG);
		if (!results.contains(newTriplet))
			results.add(newTriplet);
	}
	
	public void displayStats() {
		MyLogger.displayln("Inventory Objectives:");
		for (InventoryObjective obj: inventoryObjectiveCounter.keySet()) {
			MyLogger.displayln("  - " + obj.getName() + ": " + ((int)(((double)inventoryObjectiveCounter.get(obj).intValue() / cptActivity) * 100)) + " %");
		}
		
		MyLogger.displayln("Learning Objectives:");
		for (LearningObjective obj: learningObjectiveCounter.keySet()) {
			MyLogger.displayln("  - " + obj.getName() + ": " + ((int)(((double)learningObjectiveCounter.get(obj).intValue() / cptActivity) * 100)) + " %");
		}
		
		MyLogger.displayln("Game Objectives:");
		for (GameObjective obj: gameObjectiveCounter.keySet()) {
			MyLogger.displayln("  - " + obj.getName() + ": " + ((int)(((double)gameObjectiveCounter.get(obj).intValue() / cptActivity) * 100)) + " %");
		}
	}


	public void displayResultTriplet() {
		MyLogger.displayln("[[" + results.size() + "]]");
		for (ObjectivesTriplet res: results) {
			MyLogger.displayln("  - [" + res.getiObj().getName() + " + " + res.getlObj().getName() + " + " + res.getgObj().getName() + "]");
		}
	}

}
