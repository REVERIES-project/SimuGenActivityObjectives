/**
 */
package AppliCitoyenne.simuV1.util;

import AppliCitoyenne.simuV1.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see AppliCitoyenne.simuV1.SimuV1Package
 * @generated
 */
public class SimuV1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimuV1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimuV1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SimuV1Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimuV1Switch<Adapter> modelSwitch =
		new SimuV1Switch<Adapter>() {
			@Override
			public Adapter caseContext(Context object) {
				return createContextAdapter();
			}
			@Override
			public Adapter caseAppDesc(AppDesc object) {
				return createAppDescAdapter();
			}
			@Override
			public Adapter caseInventoryObjective(InventoryObjective object) {
				return createInventoryObjectiveAdapter();
			}
			@Override
			public Adapter caseLearningObjective(LearningObjective object) {
				return createLearningObjectiveAdapter();
			}
			@Override
			public Adapter caseZone(Zone object) {
				return createZoneAdapter();
			}
			@Override
			public Adapter caseZoneCirculaire(ZoneCirculaire object) {
				return createZoneCirculaireAdapter();
			}
			@Override
			public Adapter caseProfile(Profile object) {
				return createProfileAdapter();
			}
			@Override
			public Adapter caseData(Data object) {
				return createDataAdapter();
			}
			@Override
			public Adapter caseInventoryProfile(InventoryProfile object) {
				return createInventoryProfileAdapter();
			}
			@Override
			public Adapter caseBotanicalProfile(BotanicalProfile object) {
				return createBotanicalProfileAdapter();
			}
			@Override
			public Adapter caseGameProfile(GameProfile object) {
				return createGameProfileAdapter();
			}
			@Override
			public Adapter caseBotanicalSurvey(BotanicalSurvey object) {
				return createBotanicalSurveyAdapter();
			}
			@Override
			public Adapter caseBasicSurvey(BasicSurvey object) {
				return createBasicSurveyAdapter();
			}
			@Override
			public Adapter caseConfirmationSurvey(ConfirmationSurvey object) {
				return createConfirmationSurveyAdapter();
			}
			@Override
			public Adapter caseAdditionalSurvey(AdditionalSurvey object) {
				return createAdditionalSurveyAdapter();
			}
			@Override
			public Adapter casePOI(POI object) {
				return createPOIAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseBotanicalFlore(BotanicalFlore object) {
				return createBotanicalFloreAdapter();
			}
			@Override
			public Adapter caseObjectives(Objectives object) {
				return createObjectivesAdapter();
			}
			@Override
			public Adapter caseSpecies(Species object) {
				return createSpeciesAdapter();
			}
			@Override
			public Adapter caseGender(Gender object) {
				return createGenderAdapter();
			}
			@Override
			public Adapter caseFamily(Family object) {
				return createFamilyAdapter();
			}
			@Override
			public Adapter caseTarget(Target object) {
				return createTargetAdapter();
			}
			@Override
			public Adapter caseGameObjective(GameObjective object) {
				return createGameObjectiveAdapter();
			}
			@Override
			public Adapter caseBotanicalStat(BotanicalStat object) {
				return createBotanicalStatAdapter();
			}
			@Override
			public Adapter caseGameTypePref(GameTypePref object) {
				return createGameTypePrefAdapter();
			}
			@Override
			public Adapter caseObjective(Objective object) {
				return createObjectiveAdapter();
			}
			@Override
			public Adapter caseGameType(GameType object) {
				return createGameTypeAdapter();
			}
			@Override
			public Adapter caseAction2Detect(Action2Detect object) {
				return createAction2DetectAdapter();
			}
			@Override
			public Adapter caseGameTypeComp(GameTypeComp object) {
				return createGameTypeCompAdapter();
			}
			@Override
			public Adapter caseStructuredTask(StructuredTask object) {
				return createStructuredTaskAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseSimpleTask(SimpleTask object) {
				return createSimpleTaskAdapter();
			}
			@Override
			public Adapter caseRecurrentTask(RecurrentTask object) {
				return createRecurrentTaskAdapter();
			}
			@Override
			public Adapter caseGameTypes(GameTypes object) {
				return createGameTypesAdapter();
			}
			@Override
			public Adapter caseActions2Detect(Actions2Detect object) {
				return createActions2DetectAdapter();
			}
			@Override
			public Adapter caseTaskComp(TaskComp object) {
				return createTaskCompAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseBasicSurveyExistence(BasicSurveyExistence object) {
				return createBasicSurveyExistenceAdapter();
			}
			@Override
			public Adapter caseSimpleSurveyExistence(SimpleSurveyExistence object) {
				return createSimpleSurveyExistenceAdapter();
			}
			@Override
			public Adapter caseReliableBasicSurveyExistence(ReliableBasicSurveyExistence object) {
				return createReliableBasicSurveyExistenceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.Context
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.AppDesc <em>App Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.AppDesc
	 * @generated
	 */
	public Adapter createAppDescAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.InventoryObjective <em>Inventory Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.InventoryObjective
	 * @generated
	 */
	public Adapter createInventoryObjectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.LearningObjective <em>Learning Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.LearningObjective
	 * @generated
	 */
	public Adapter createLearningObjectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.Zone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.Zone
	 * @generated
	 */
	public Adapter createZoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.ZoneCirculaire <em>Zone Circulaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.ZoneCirculaire
	 * @generated
	 */
	public Adapter createZoneCirculaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.Profile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.Profile
	 * @generated
	 */
	public Adapter createProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.InventoryProfile <em>Inventory Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.InventoryProfile
	 * @generated
	 */
	public Adapter createInventoryProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.BotanicalProfile <em>Botanical Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.BotanicalProfile
	 * @generated
	 */
	public Adapter createBotanicalProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.GameProfile <em>Game Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.GameProfile
	 * @generated
	 */
	public Adapter createGameProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.BotanicalSurvey <em>Botanical Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.BotanicalSurvey
	 * @generated
	 */
	public Adapter createBotanicalSurveyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.BasicSurvey <em>Basic Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.BasicSurvey
	 * @generated
	 */
	public Adapter createBasicSurveyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.ConfirmationSurvey <em>Confirmation Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.ConfirmationSurvey
	 * @generated
	 */
	public Adapter createConfirmationSurveyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.AdditionalSurvey <em>Additional Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.AdditionalSurvey
	 * @generated
	 */
	public Adapter createAdditionalSurveyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.POI <em>POI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.POI
	 * @generated
	 */
	public Adapter createPOIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.BotanicalFlore <em>Botanical Flore</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.BotanicalFlore
	 * @generated
	 */
	public Adapter createBotanicalFloreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.Objectives <em>Objectives</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.Objectives
	 * @generated
	 */
	public Adapter createObjectivesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.Species <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.Species
	 * @generated
	 */
	public Adapter createSpeciesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.Gender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.Gender
	 * @generated
	 */
	public Adapter createGenderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.Family <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.Family
	 * @generated
	 */
	public Adapter createFamilyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.Target <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.Target
	 * @generated
	 */
	public Adapter createTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.GameObjective <em>Game Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.GameObjective
	 * @generated
	 */
	public Adapter createGameObjectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.BotanicalStat <em>Botanical Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.BotanicalStat
	 * @generated
	 */
	public Adapter createBotanicalStatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.GameTypePref <em>Game Type Pref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.GameTypePref
	 * @generated
	 */
	public Adapter createGameTypePrefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.Objective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.Objective
	 * @generated
	 */
	public Adapter createObjectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.GameType <em>Game Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.GameType
	 * @generated
	 */
	public Adapter createGameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.Action2Detect <em>Action2 Detect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.Action2Detect
	 * @generated
	 */
	public Adapter createAction2DetectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.GameTypeComp <em>Game Type Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.GameTypeComp
	 * @generated
	 */
	public Adapter createGameTypeCompAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.StructuredTask <em>Structured Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.StructuredTask
	 * @generated
	 */
	public Adapter createStructuredTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.SimpleTask <em>Simple Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.SimpleTask
	 * @generated
	 */
	public Adapter createSimpleTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.RecurrentTask <em>Recurrent Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.RecurrentTask
	 * @generated
	 */
	public Adapter createRecurrentTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.GameTypes <em>Game Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.GameTypes
	 * @generated
	 */
	public Adapter createGameTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.Actions2Detect <em>Actions2 Detect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.Actions2Detect
	 * @generated
	 */
	public Adapter createActions2DetectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.TaskComp <em>Task Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.TaskComp
	 * @generated
	 */
	public Adapter createTaskCompAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.BasicSurveyExistence <em>Basic Survey Existence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.BasicSurveyExistence
	 * @generated
	 */
	public Adapter createBasicSurveyExistenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.SimpleSurveyExistence <em>Simple Survey Existence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.SimpleSurveyExistence
	 * @generated
	 */
	public Adapter createSimpleSurveyExistenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AppliCitoyenne.simuV1.ReliableBasicSurveyExistence <em>Reliable Basic Survey Existence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AppliCitoyenne.simuV1.ReliableBasicSurveyExistence
	 * @generated
	 */
	public Adapter createReliableBasicSurveyExistenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SimuV1AdapterFactory
