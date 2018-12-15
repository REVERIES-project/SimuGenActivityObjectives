package AppliCitoyenne.generator;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import AppliCitoyenne.simuV1.*;

public class Generator {

	private static final int NB_GENERATIONS = 1;

	private ResourceSet resSet;

	private Data dataRoot = null;
	private AppDesc appDescRoot = null;
	private Context contextRoot = null;

	private Activity generatedActivity;

	private Util util;
	private UtilStructural utilStruct;

	public static void main(String[] args) {
		new Generator().start();
	}

	public void start() {
		init("data", "appData", "context");

		displayContext();

		generateSeveralObjectiveScenario(NB_GENERATIONS);

		displayObjectiveScenario();
		
		generateStructuralScenario(generatedActivity);
		
		displayStructuralScenario();

		displayTripletsWithoutActivityType();
		
		// TODO : other perspectives

		save("Activity_gen");
	}  

	private void displayTripletsWithoutActivityType() {
		MyLogger.displayHeader("Triplet Coverage with activity Types");
		
		for (GameObjective go : appDescRoot.getObjective().getGameobjective()) {
			for (InventoryObjective io : appDescRoot.getObjective().getInventoryobjective()) {
				for (LearningObjective lo : appDescRoot.getObjective().getLearningobjective()) {
					
					MyLogger.display("( " + go.getName() + " , " + io.getName() + " , " + lo.getName() + " ) ");
					
					int cpt = 0;
					//System.out.println(generatedActivity.getGameobjective());
					for (GameType gt : appDescRoot.getGametypes().getGametype()) {
						if ( gt.getCompatiblegameobjective().contains(go) 
								&& gt.getCompatibleinventoryobjective().contains(io)
								&& gt.getCompatiblelearningobjective().contains(lo)) {
							cpt++;
						}
					}
					MyLogger.displayln(" => [" + cpt + "]");
				}
			}
		}
	}

	private void init(String dataFic, String appDataFic, String contextFic) {
		MyLogger.displayHeader("INIT");

		MyLogger.display("Application data model loading...");
		appDescRoot = loadAppDescription(appDataFic);
		MyLogger.displayln("done");

		MyLogger.display("Data model loading...");
		dataRoot = loadData(dataFic);
		MyLogger.displayln("done");

		MyLogger.display("Context model loading...");
		contextRoot = loadContext(contextFic);
		MyLogger.displayln("done");
		EcoreUtil.resolveAll(resSet);

		util = new Util(dataRoot, contextRoot, appDescRoot);
		utilStruct = new UtilStructural(dataRoot, contextRoot, appDescRoot, util);
	}

	private Context loadContext(String contextFic) {
		return (Context) load(contextFic).getContents().get(0);
	}

	private Data loadData(String fic) {
		return (Data) load(fic).getContents().get(0);
	}

	private AppDesc loadAppDescription(String fic) {
		return (AppDesc) load(fic).getContents().get(0);
	}

	private Resource load(String fic) {
		if (resSet == null) {
			SimuV1Package.eINSTANCE.eClass();
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("simuv1", new XMIResourceFactoryImpl());
			resSet = new ResourceSetImpl();
		}
		Resource resource = resSet.getResource(URI.createURI(fic + ".simuv1"), true);
		try {
			resource.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		EcoreUtil.resolveAll(resSet);

		return resource;
	}

	private void displayObjectiveScenario() {
		MyLogger.displayHeader("Objectives for the generated activity");
		MyLogger.display("Citizen objective  = ");
		MyLogger.displayln(generatedActivity.getInventoryobjective().getName());
		MyLogger.display("Learning objective  = ");
		MyLogger.displayln(generatedActivity.getLearningobjective().getName());
		MyLogger.display("Game objective  = ");
		MyLogger.displayln(generatedActivity.getGameobjective().getName());

	}
	
	private void displayStructuralScenario() {
		MyLogger.displayHeader("Structure for the generated activity");
		MyLogger.display("Game type = ");
		GameType gt = generatedActivity.getGametype();
		if (gt == null) {
			MyLogger.displayln(" pas de type d'activité trouvé");
		} else {
			MyLogger.displayln(gt.getName());
			//if (generatedActivity.getGametypecomp().getTaskcomp().get(0) != null) {
				
			//	MyLogger.display("Action = " + ((TaskComp)(generatedActivity.getGametypecomp().getTaskcomp().get(0))).getAction2detect().getName());
			//}
		}
		// TODO : complete

	}

	private void displayContext() {
		MyLogger.displayHeader("Context");
		MyLogger.displayln("Position = " + contextRoot.getZone());
		MyLogger.displayln(
				"Citizen  = " + contextRoot.getProfile().getFirstname() + " " + contextRoot.getProfile().getLastname());
	}

	public void save(String fic) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		XMIResourceFactoryImpl fact = new XMIResourceFactoryImpl();
		m.put("simuv1", fact);
		m.put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createURI(fic + ".simuv1"));
		MyLogger.displayln("");
		MyLogger.displayHeader("Backup");
		MyLogger.display("Save...");
		resource.getContents().add(generatedActivity);
		try {
			resource.save(m);
		} catch (IOException e) {
			MyLogger.displayln("KO  :(");
			e.printStackTrace();
			return;
		}
		MyLogger.displayln("OK");
	}

	private Activity generateObjectiveScenario() {
		generatedActivity = SimuV1Factory.eINSTANCE.createActivity();
		generatedActivity.setProfile(contextRoot.getProfile());
		ObjectivesTriplet triplet;

		util.analysis(contextRoot);
		do {
			triplet = util.getTriplet();

		} while (!triplet.compliant(appDescRoot));

		generatedActivity.setInventoryobjective(triplet.getiObj());
		generatedActivity.setGameobjective(triplet.getgObj());
		generatedActivity.setLearningobjective(triplet.getlObj());
		
		return generatedActivity;
	}

	private void generateSeveralObjectiveScenario(int nb) {
		
		MyLogger.displayHeader("Generation of the 'objective' perspective");
		
		ObjectiveAnalyzer analyzer = new ObjectiveAnalyzer(appDescRoot);
		
		for (int i = 0; i < nb; i++) {
			MyLogger.display("(" + (i +1)+ ")");
			Activity activity = generateObjectiveScenario();
			analyzer.addActivity(activity);
		}
		MyLogger.displayln("\n\nStatisticals:");
		analyzer.displayStats();
		MyLogger.displayln("\n\n");
		MyLogger.displayln("\n\nFound combinations:");
		analyzer.displayResultTriplet();
		MyLogger.displayln("\n\n");
		
	}
	
	private void generateStructuralScenario(Activity activity) {
		
		utilStruct.filterGameTypes(activity);
		
		utilStruct.ponderateGameTypes();

		utilStruct.selectOneGameType();
		
		//GameTypeComp gtc = SimuV1Factory.eINSTANCE.createGameTypeComp();
		//gtc.setGametype(utilStruct.getChosenGameType());
		//generatedActivity.setGametypecomp(gtc);
		
		generatedActivity.setGametype(utilStruct.getChosenGameType());
		
	/*	if (gtc.getGametype() != null) {
		
			utilStruct.filterAction2Detect(activity);
			utilStruct.ponderateAction2Detect();
			Action2Detect action = utilStruct.selectOneAction2Detect();
			
			TaskComp tc = SimuV1Factory.eINSTANCE.createTaskComp();
			if (action != null) {
				tc.setAction2detect(action);
				gtc.getTaskcomp().add(tc);
			}
		}
		*/
		
		
	}
}
