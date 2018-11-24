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
	protected SimuV1Switch modelSwitch =
		new SimuV1Switch() {
			public Object caseContext(Context object) {
				return createContextAdapter();
			}
			public Object caseAppDesc(AppDesc object) {
				return createAppDescAdapter();
			}
			public Object caseInventoryObjective(InventoryObjective object) {
				return createInventoryObjectiveAdapter();
			}
			public Object caseLearningObjective(LearningObjective object) {
				return createLearningObjectiveAdapter();
			}
			public Object caseZone(Zone object) {
				return createZoneAdapter();
			}
			public Object caseZoneCirculaire(ZoneCirculaire object) {
				return createZoneCirculaireAdapter();
			}
			public Object caseProfile(Profile object) {
				return createProfileAdapter();
			}
			public Object caseData(Data object) {
				return createDataAdapter();
			}
			public Object caseInventoryProfile(InventoryProfile object) {
				return createInventoryProfileAdapter();
			}
			public Object caseBotanicalProfile(BotanicalProfile object) {
				return createBotanicalProfileAdapter();
			}
			public Object caseGameProfile(GameProfile object) {
				return createGameProfileAdapter();
			}
			public Object caseBotanicalSurvey(BotanicalSurvey object) {
				return createBotanicalSurveyAdapter();
			}
			public Object caseBasicSurvey(BasicSurvey object) {
				return createBasicSurveyAdapter();
			}
			public Object caseConfirmationSurvey(ConfirmationSurvey object) {
				return createConfirmationSurveyAdapter();
			}
			public Object caseAdditionalSurvey(AdditionalSurvey object) {
				return createAdditionalSurveyAdapter();
			}
			public Object casePOI(POI object) {
				return createPOIAdapter();
			}
			public Object caseActivity(Activity object) {
				return createActivityAdapter();
			}
			public Object caseBotanicalFlore(BotanicalFlore object) {
				return createBotanicalFloreAdapter();
			}
			public Object caseObjectives(Objectives object) {
				return createObjectivesAdapter();
			}
			public Object caseSpecies(Species object) {
				return createSpeciesAdapter();
			}
			public Object caseGender(Gender object) {
				return createGenderAdapter();
			}
			public Object caseFamily(Family object) {
				return createFamilyAdapter();
			}
			public Object caseTarget(Target object) {
				return createTargetAdapter();
			}
			public Object caseGameObjective(GameObjective object) {
				return createGameObjectiveAdapter();
			}
			public Object caseBotanicalStat(BotanicalStat object) {
				return createBotanicalStatAdapter();
			}
			public Object caseGameTypePref(GameTypePref object) {
				return createGameTypePrefAdapter();
			}
			public Object caseObjective(Objective object) {
				return createObjectiveAdapter();
			}
			public Object defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
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
