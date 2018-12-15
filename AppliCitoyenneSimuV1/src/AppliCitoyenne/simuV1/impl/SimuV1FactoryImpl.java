/**
 */
package AppliCitoyenne.simuV1.impl;

import AppliCitoyenne.simuV1.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimuV1FactoryImpl extends EFactoryImpl implements SimuV1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimuV1Factory init() {
		try {
			SimuV1Factory theSimuV1Factory = (SimuV1Factory)EPackage.Registry.INSTANCE.getEFactory(SimuV1Package.eNS_URI);
			if (theSimuV1Factory != null) {
				return theSimuV1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimuV1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimuV1FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SimuV1Package.CONTEXT: return createContext();
			case SimuV1Package.APP_DESC: return createAppDesc();
			case SimuV1Package.INVENTORY_OBJECTIVE: return createInventoryObjective();
			case SimuV1Package.LEARNING_OBJECTIVE: return createLearningObjective();
			case SimuV1Package.ZONE_CIRCULAIRE: return createZoneCirculaire();
			case SimuV1Package.PROFILE: return createProfile();
			case SimuV1Package.DATA: return createData();
			case SimuV1Package.INVENTORY_PROFILE: return createInventoryProfile();
			case SimuV1Package.BOTANICAL_PROFILE: return createBotanicalProfile();
			case SimuV1Package.GAME_PROFILE: return createGameProfile();
			case SimuV1Package.BASIC_SURVEY: return createBasicSurvey();
			case SimuV1Package.CONFIRMATION_SURVEY: return createConfirmationSurvey();
			case SimuV1Package.ADDITIONAL_SURVEY: return createAdditionalSurvey();
			case SimuV1Package.POI: return createPOI();
			case SimuV1Package.ACTIVITY: return createActivity();
			case SimuV1Package.BOTANICAL_FLORE: return createBotanicalFlore();
			case SimuV1Package.OBJECTIVES: return createObjectives();
			case SimuV1Package.SPECIES: return createSpecies();
			case SimuV1Package.GENDER: return createGender();
			case SimuV1Package.FAMILY: return createFamily();
			case SimuV1Package.GAME_OBJECTIVE: return createGameObjective();
			case SimuV1Package.BOTANICAL_STAT: return createBotanicalStat();
			case SimuV1Package.GAME_TYPE_PREF: return createGameTypePref();
			case SimuV1Package.GAME_TYPE: return createGameType();
			case SimuV1Package.ACTION2_DETECT: return createAction2Detect();
			case SimuV1Package.GAME_TYPE_COMP: return createGameTypeComp();
			case SimuV1Package.SIMPLE_TASK: return createSimpleTask();
			case SimuV1Package.RECURRENT_TASK: return createRecurrentTask();
			case SimuV1Package.GAME_TYPES: return createGameTypes();
			case SimuV1Package.ACTIONS2_DETECT: return createActions2Detect();
			case SimuV1Package.TASK_COMP: return createTaskComp();
			case SimuV1Package.BASIC_SURVEY_EXISTENCE: return createBasicSurveyExistence();
			case SimuV1Package.SIMPLE_SURVEY_EXISTENCE: return createSimpleSurveyExistence();
			case SimuV1Package.RELIABLE_BASIC_SURVEY_EXISTENCE: return createReliableBasicSurveyExistence();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppDesc createAppDesc() {
		AppDescImpl appDesc = new AppDescImpl();
		return appDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryObjective createInventoryObjective() {
		InventoryObjectiveImpl inventoryObjective = new InventoryObjectiveImpl();
		return inventoryObjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningObjective createLearningObjective() {
		LearningObjectiveImpl learningObjective = new LearningObjectiveImpl();
		return learningObjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZoneCirculaire createZoneCirculaire() {
		ZoneCirculaireImpl zoneCirculaire = new ZoneCirculaireImpl();
		return zoneCirculaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile createProfile() {
		ProfileImpl profile = new ProfileImpl();
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryProfile createInventoryProfile() {
		InventoryProfileImpl inventoryProfile = new InventoryProfileImpl();
		return inventoryProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BotanicalProfile createBotanicalProfile() {
		BotanicalProfileImpl botanicalProfile = new BotanicalProfileImpl();
		return botanicalProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameProfile createGameProfile() {
		GameProfileImpl gameProfile = new GameProfileImpl();
		return gameProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicSurvey createBasicSurvey() {
		BasicSurveyImpl basicSurvey = new BasicSurveyImpl();
		return basicSurvey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfirmationSurvey createConfirmationSurvey() {
		ConfirmationSurveyImpl confirmationSurvey = new ConfirmationSurveyImpl();
		return confirmationSurvey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalSurvey createAdditionalSurvey() {
		AdditionalSurveyImpl additionalSurvey = new AdditionalSurveyImpl();
		return additionalSurvey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POI createPOI() {
		POIImpl poi = new POIImpl();
		return poi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BotanicalFlore createBotanicalFlore() {
		BotanicalFloreImpl botanicalFlore = new BotanicalFloreImpl();
		return botanicalFlore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objectives createObjectives() {
		ObjectivesImpl objectives = new ObjectivesImpl();
		return objectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Species createSpecies() {
		SpeciesImpl species = new SpeciesImpl();
		return species;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gender createGender() {
		GenderImpl gender = new GenderImpl();
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Family createFamily() {
		FamilyImpl family = new FamilyImpl();
		return family;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameObjective createGameObjective() {
		GameObjectiveImpl gameObjective = new GameObjectiveImpl();
		return gameObjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BotanicalStat createBotanicalStat() {
		BotanicalStatImpl botanicalStat = new BotanicalStatImpl();
		return botanicalStat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameTypePref createGameTypePref() {
		GameTypePrefImpl gameTypePref = new GameTypePrefImpl();
		return gameTypePref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameType createGameType() {
		GameTypeImpl gameType = new GameTypeImpl();
		return gameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action2Detect createAction2Detect() {
		Action2DetectImpl action2Detect = new Action2DetectImpl();
		return action2Detect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameTypeComp createGameTypeComp() {
		GameTypeCompImpl gameTypeComp = new GameTypeCompImpl();
		return gameTypeComp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTask createSimpleTask() {
		SimpleTaskImpl simpleTask = new SimpleTaskImpl();
		return simpleTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecurrentTask createRecurrentTask() {
		RecurrentTaskImpl recurrentTask = new RecurrentTaskImpl();
		return recurrentTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameTypes createGameTypes() {
		GameTypesImpl gameTypes = new GameTypesImpl();
		return gameTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actions2Detect createActions2Detect() {
		Actions2DetectImpl actions2Detect = new Actions2DetectImpl();
		return actions2Detect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskComp createTaskComp() {
		TaskCompImpl taskComp = new TaskCompImpl();
		return taskComp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicSurveyExistence createBasicSurveyExistence() {
		BasicSurveyExistenceImpl basicSurveyExistence = new BasicSurveyExistenceImpl();
		return basicSurveyExistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleSurveyExistence createSimpleSurveyExistence() {
		SimpleSurveyExistenceImpl simpleSurveyExistence = new SimpleSurveyExistenceImpl();
		return simpleSurveyExistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliableBasicSurveyExistence createReliableBasicSurveyExistence() {
		ReliableBasicSurveyExistenceImpl reliableBasicSurveyExistence = new ReliableBasicSurveyExistenceImpl();
		return reliableBasicSurveyExistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimuV1Package getSimuV1Package() {
		return (SimuV1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimuV1Package getPackage() {
		return SimuV1Package.eINSTANCE;
	}

} //SimuV1FactoryImpl
