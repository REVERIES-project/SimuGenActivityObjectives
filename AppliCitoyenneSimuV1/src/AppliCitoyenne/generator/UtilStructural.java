package AppliCitoyenne.generator;

import java.util.ArrayList;
import java.util.List;

import AppliCitoyenne.simuV1.Action2Detect;
import AppliCitoyenne.simuV1.Activity;
import AppliCitoyenne.simuV1.AppDesc;
import AppliCitoyenne.simuV1.Context;
import AppliCitoyenne.simuV1.Data;
import AppliCitoyenne.simuV1.GameType;
import AppliCitoyenne.simuV1.InventoryObjective;
import AppliCitoyenne.simuV1.RecurrentTask;
import AppliCitoyenne.simuV1.SimpleTask;
import AppliCitoyenne.simuV1.Target;
import AppliCitoyenne.simuV1.Task;

public class UtilStructural {

	private Data root;
	private Context context;
	private AppDesc appRoot;
	
	private List<GameType> reducedGameTypesList;
	private List<Action2Detect> reducedActionsList;
	
	private GameType chosenGT;
	private Util util;

	public UtilStructural(Data dataRoot, Context contextRoot, AppDesc appRoot, Util util) {
		root = dataRoot;
		context = contextRoot;
		this.appRoot = appRoot;
		this.util = util;
		
		reducedGameTypesList = new ArrayList<>();
		
		for (Object o : appRoot.getGametypes().getGametype()) {
			GameType obj = (GameType) o;
			reducedGameTypesList.add(obj);
		}
	}


	public void filterGameTypes(Activity activity) {
		List<GameType> elemsToRemove = new ArrayList<GameType>();
		for (GameType gt: reducedGameTypesList) {
			
			MyLogger.displayln(gt.getName());
			
			if (compatibleActivity(gt, activity)) {
				System.out.println(" OK");
				
				/*List<Action2Detect> listA2D = collectAllActions2Detect(gt.getTask());
				
				for (Action2Detect action: listA2D) {
					for (InventoryObjective obj: (List<InventoryObjective>) action.getCompatibleinventoryobjective()) {
						if (!obj.equals(activity.getInventoryobjective())) {
							System.out.println("Action '" + action.getName() + "' requires an " + obj.getName());
							elemsToRemove.add(gt);
							
						}
					}
				}*/
			}
			else { 
				System.out.println(" KO");
				elemsToRemove.add(gt);
			}
			
		}
		reducedGameTypesList.removeAll(elemsToRemove);
		
	}


	public boolean compatibleActivity(GameType gt, Activity activity) {
		if (!gt.getCompatiblegameobjective().contains(activity.getGameobjective()))
			return false;
		if (!gt.getCompatibleinventoryobjective().contains(activity.getInventoryobjective()))
			return false;
		if (!gt.getCompatiblelearningobjective().contains(activity.getLearningobjective()))
			return false;
		return true;
	}


	private List<Action2Detect> collectAllActions2Detect(Task task) {
		List<Action2Detect> res = new ArrayList<>();
		if (task instanceof SimpleTask) {
			res.addAll(((SimpleTask) task).getCompatibleaction2detect());
		} else {
			if (task instanceof RecurrentTask) {
				res.addAll( collectAllActions2Detect(((RecurrentTask) task).getSubtask()) );
			}
		}
		return res;
	}


	public void ponderateGameTypes() {
		if (reducedGameTypesList.size() == 1) {
			System.out.println("No ponderation because only one choice !");
			return;
		}
		
	}


	public void selectOneGameType() {
		if (reducedGameTypesList.isEmpty())
			return;
		int index = (int) (Math.random()*reducedGameTypesList.size());
		chosenGT = reducedGameTypesList.get(index);
	}


	public GameType getChosenGameType() {
		return chosenGT;
	}


	/*public void filterAction2Detect(Activity activity) {
		Task tk = activity.getGametypecomp().getGametype().getTask();
		reducedActionsList = collectAllActions2Detect(tk);
		
		for (Action2Detect action: reducedActionsList) {
			if (action.getOptionaltarget() != null) {
				for (Target target: action.getOptionaltarget()) {
					System.out.println(target.getName());
				}
			}
		}
	}*/


	public void ponderateAction2Detect() {
		// TODO Auto-generated method stub
		
	}


	public Action2Detect selectOneAction2Detect() {
		if (reducedActionsList.isEmpty())
			return null;
		int index = (int) (Math.random()*reducedActionsList.size());
		return reducedActionsList.get(index);
	}
	
}
