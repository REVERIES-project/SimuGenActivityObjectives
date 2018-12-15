/**
 */
package AppliCitoyenne.simuV1.impl;

import AppliCitoyenne.simuV1.Action2Detect;
import AppliCitoyenne.simuV1.Actions2Detect;
import AppliCitoyenne.simuV1.Activity;
import AppliCitoyenne.simuV1.AdditionalSurvey;
import AppliCitoyenne.simuV1.AppDesc;
import AppliCitoyenne.simuV1.BasicSurvey;
import AppliCitoyenne.simuV1.BasicSurveyExistence;
import AppliCitoyenne.simuV1.BotanicalFlore;
import AppliCitoyenne.simuV1.BotanicalProfile;
import AppliCitoyenne.simuV1.BotanicalStat;
import AppliCitoyenne.simuV1.BotanicalSurvey;
import AppliCitoyenne.simuV1.ConfirmationSurvey;
import AppliCitoyenne.simuV1.Constraint;
import AppliCitoyenne.simuV1.Context;
import AppliCitoyenne.simuV1.Data;
import AppliCitoyenne.simuV1.Family;
import AppliCitoyenne.simuV1.GameObjective;
import AppliCitoyenne.simuV1.GameProfile;
import AppliCitoyenne.simuV1.GameType;
import AppliCitoyenne.simuV1.GameTypeComp;
import AppliCitoyenne.simuV1.GameTypePref;
import AppliCitoyenne.simuV1.GameTypes;
import AppliCitoyenne.simuV1.Gender;
import AppliCitoyenne.simuV1.InventoryObjective;
import AppliCitoyenne.simuV1.InventoryProfile;
import AppliCitoyenne.simuV1.LearningObjective;
import AppliCitoyenne.simuV1.Objective;
import AppliCitoyenne.simuV1.Objectives;
import AppliCitoyenne.simuV1.Profile;
import AppliCitoyenne.simuV1.RecurrentTask;
import AppliCitoyenne.simuV1.ReliableBasicSurveyExistence;
import AppliCitoyenne.simuV1.SimpleSurveyExistence;
import AppliCitoyenne.simuV1.SimpleTask;
import AppliCitoyenne.simuV1.SimuV1Factory;
import AppliCitoyenne.simuV1.SimuV1Package;
import AppliCitoyenne.simuV1.Species;
import AppliCitoyenne.simuV1.StructuredTask;
import AppliCitoyenne.simuV1.Target;
import AppliCitoyenne.simuV1.Task;
import AppliCitoyenne.simuV1.TaskComp;
import AppliCitoyenne.simuV1.Zone;
import AppliCitoyenne.simuV1.ZoneCirculaire;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimuV1PackageImpl extends EPackageImpl implements SimuV1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appDescEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventoryObjectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass learningObjectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zoneCirculaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventoryProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass botanicalProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass botanicalSurveyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicSurveyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass confirmationSurveyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalSurveyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass botanicalFloreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectivesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speciesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameObjectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass botanicalStatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameTypePrefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass action2DetectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameTypeCompEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recurrentTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actions2DetectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskCompEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicSurveyExistenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleSurveyExistenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reliableBasicSurveyExistenceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see AppliCitoyenne.simuV1.SimuV1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimuV1PackageImpl() {
		super(eNS_URI, SimuV1Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SimuV1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimuV1Package init() {
		if (isInited) return (SimuV1Package)EPackage.Registry.INSTANCE.getEPackage(SimuV1Package.eNS_URI);

		// Obtain or create and register package
		SimuV1PackageImpl theSimuV1Package = (SimuV1PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimuV1PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimuV1PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSimuV1Package.createPackageContents();

		// Initialize created meta-data
		theSimuV1Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimuV1Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimuV1Package.eNS_URI, theSimuV1Package);
		return theSimuV1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_Zone() {
		return (EReference)contextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_Profile() {
		return (EReference)contextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppDesc() {
		return appDescEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppDesc_Objective() {
		return (EReference)appDescEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppDesc_Botanicalflore() {
		return (EReference)appDescEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppDesc_Gametypes() {
		return (EReference)appDescEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppDesc_Actions2detect() {
		return (EReference)appDescEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInventoryObjective() {
		return inventoryObjectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLearningObjective() {
		return learningObjectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZone() {
		return zoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZoneCirculaire() {
		return zoneCirculaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZoneCirculaire_Rayon() {
		return (EAttribute)zoneCirculaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZoneCirculaire_X() {
		return (EAttribute)zoneCirculaireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZoneCirculaire_Y() {
		return (EAttribute)zoneCirculaireEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfile() {
		return profileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfile_Firstname() {
		return (EAttribute)profileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfile_Lastname() {
		return (EAttribute)profileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfile_Inventoryprofile() {
		return (EReference)profileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfile_Botanicalprofile() {
		return (EReference)profileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfile_Gameprofile() {
		return (EReference)profileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfile_Botanicalsurvey() {
		return (EReference)profileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_Profiles() {
		return (EReference)dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_Botanicalsurveys() {
		return (EReference)dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInventoryProfile() {
		return inventoryProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBotanicalProfile() {
		return botanicalProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBotanicalProfile_Botanicalstat() {
		return (EReference)botanicalProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBotanicalProfile_NoInterest() {
		return (EAttribute)botanicalProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameProfile() {
		return gameProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameProfile_Gametypepref() {
		return (EReference)gameProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameProfile_NoInterest() {
		return (EAttribute)gameProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBotanicalSurvey() {
		return botanicalSurveyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBotanicalSurvey_Profile() {
		return (EReference)botanicalSurveyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBotanicalSurvey_Date() {
		return (EAttribute)botanicalSurveyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBotanicalSurvey_Poi() {
		return (EReference)botanicalSurveyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBotanicalSurvey_Target() {
		return (EReference)botanicalSurveyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBotanicalSurvey_Id() {
		return (EAttribute)botanicalSurveyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBotanicalSurvey_ReliabilityScore() {
		return (EAttribute)botanicalSurveyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicSurvey() {
		return basicSurveyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicSurvey_Confirmationsurvey() {
		return (EReference)basicSurveyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicSurvey_Additionalsurvey() {
		return (EReference)basicSurveyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfirmationSurvey() {
		return confirmationSurveyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfirmationSurvey_Basicsurvey() {
		return (EReference)confirmationSurveyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionalSurvey() {
		return additionalSurveyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdditionalSurvey_Basicsurvey() {
		return (EReference)additionalSurveyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPOI() {
		return poiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPOI_Y() {
		return (EAttribute)poiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPOI_X() {
		return (EAttribute)poiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Inventoryobjective() {
		return (EReference)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Learningobjective() {
		return (EReference)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Profile() {
		return (EReference)activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Gameobjective() {
		return (EReference)activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Instruction() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_GameZone() {
		return (EReference)activityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Gametypecomp() {
		return (EReference)activityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Gametype() {
		return (EReference)activityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBotanicalFlore() {
		return botanicalFloreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBotanicalFlore_Family() {
		return (EReference)botanicalFloreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectives() {
		return objectivesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectives_Learningobjective() {
		return (EReference)objectivesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectives_Inventoryobjective() {
		return (EReference)objectivesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectives_Gameobjective() {
		return (EReference)objectivesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecies() {
		return speciesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGender() {
		return genderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGender_Species() {
		return (EReference)genderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamily() {
		return familyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFamily_Name() {
		return (EAttribute)familyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamily_Gender() {
		return (EReference)familyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTarget() {
		return targetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget_Name() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameObjective() {
		return gameObjectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBotanicalStat() {
		return botanicalStatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBotanicalStat_DirectIdentification() {
		return (EAttribute)botanicalStatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBotanicalStat_Target() {
		return (EReference)botanicalStatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameTypePref() {
		return gameTypePrefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameTypePref_Ponderation() {
		return (EAttribute)gameTypePrefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameTypePref_Gameobjective() {
		return (EReference)gameTypePrefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjective() {
		return objectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjective_Name() {
		return (EAttribute)objectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjective_IncompatibleObjectives() {
		return (EReference)objectiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameType() {
		return gameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameType_Compatiblegameobjective() {
		return (EReference)gameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameType_Name() {
		return (EAttribute)gameTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameType_Compatibleinventoryobjective() {
		return (EReference)gameTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameType_Compatiblelearningobjective() {
		return (EReference)gameTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameType_Instruction() {
		return (EAttribute)gameTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameType_Constraint() {
		return (EReference)gameTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction2Detect() {
		return action2DetectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction2Detect_Name() {
		return (EAttribute)action2DetectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction2Detect_Compatibleinventoryobjective() {
		return (EReference)action2DetectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction2Detect_Optionaltarget() {
		return (EReference)action2DetectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameTypeComp() {
		return gameTypeCompEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameTypeComp_Gametype() {
		return (EReference)gameTypeCompEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameTypeComp_Times() {
		return (EAttribute)gameTypeCompEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredTask() {
		return structuredTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Name() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleTask() {
		return simpleTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleTask_Compatibleaction2detect() {
		return (EReference)simpleTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecurrentTask() {
		return recurrentTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecurrentTask_Subtask() {
		return (EReference)recurrentTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameTypes() {
		return gameTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameTypes_Gametype() {
		return (EReference)gameTypesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActions2Detect() {
		return actions2DetectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActions2Detect_Action2detect() {
		return (EReference)actions2DetectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskComp() {
		return taskCompEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskComp_Action2detect() {
		return (EReference)taskCompEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskComp_Newspeciessurvey() {
		return (EReference)taskCompEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicSurveyExistence() {
		return basicSurveyExistenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleSurveyExistence() {
		return simpleSurveyExistenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReliableBasicSurveyExistence() {
		return reliableBasicSurveyExistenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimuV1Factory getSimuV1Factory() {
		return (SimuV1Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		contextEClass = createEClass(CONTEXT);
		createEReference(contextEClass, CONTEXT__ZONE);
		createEReference(contextEClass, CONTEXT__PROFILE);

		appDescEClass = createEClass(APP_DESC);
		createEReference(appDescEClass, APP_DESC__OBJECTIVE);
		createEReference(appDescEClass, APP_DESC__BOTANICALFLORE);
		createEReference(appDescEClass, APP_DESC__GAMETYPES);
		createEReference(appDescEClass, APP_DESC__ACTIONS2DETECT);

		inventoryObjectiveEClass = createEClass(INVENTORY_OBJECTIVE);

		learningObjectiveEClass = createEClass(LEARNING_OBJECTIVE);

		zoneEClass = createEClass(ZONE);

		zoneCirculaireEClass = createEClass(ZONE_CIRCULAIRE);
		createEAttribute(zoneCirculaireEClass, ZONE_CIRCULAIRE__RAYON);
		createEAttribute(zoneCirculaireEClass, ZONE_CIRCULAIRE__X);
		createEAttribute(zoneCirculaireEClass, ZONE_CIRCULAIRE__Y);

		profileEClass = createEClass(PROFILE);
		createEAttribute(profileEClass, PROFILE__FIRSTNAME);
		createEAttribute(profileEClass, PROFILE__LASTNAME);
		createEReference(profileEClass, PROFILE__INVENTORYPROFILE);
		createEReference(profileEClass, PROFILE__BOTANICALPROFILE);
		createEReference(profileEClass, PROFILE__GAMEPROFILE);
		createEReference(profileEClass, PROFILE__BOTANICALSURVEY);

		dataEClass = createEClass(DATA);
		createEReference(dataEClass, DATA__PROFILES);
		createEReference(dataEClass, DATA__BOTANICALSURVEYS);

		inventoryProfileEClass = createEClass(INVENTORY_PROFILE);

		botanicalProfileEClass = createEClass(BOTANICAL_PROFILE);
		createEReference(botanicalProfileEClass, BOTANICAL_PROFILE__BOTANICALSTAT);
		createEAttribute(botanicalProfileEClass, BOTANICAL_PROFILE__NO_INTEREST);

		gameProfileEClass = createEClass(GAME_PROFILE);
		createEReference(gameProfileEClass, GAME_PROFILE__GAMETYPEPREF);
		createEAttribute(gameProfileEClass, GAME_PROFILE__NO_INTEREST);

		botanicalSurveyEClass = createEClass(BOTANICAL_SURVEY);
		createEReference(botanicalSurveyEClass, BOTANICAL_SURVEY__PROFILE);
		createEAttribute(botanicalSurveyEClass, BOTANICAL_SURVEY__DATE);
		createEReference(botanicalSurveyEClass, BOTANICAL_SURVEY__POI);
		createEReference(botanicalSurveyEClass, BOTANICAL_SURVEY__TARGET);
		createEAttribute(botanicalSurveyEClass, BOTANICAL_SURVEY__ID);
		createEAttribute(botanicalSurveyEClass, BOTANICAL_SURVEY__RELIABILITY_SCORE);

		basicSurveyEClass = createEClass(BASIC_SURVEY);
		createEReference(basicSurveyEClass, BASIC_SURVEY__CONFIRMATIONSURVEY);
		createEReference(basicSurveyEClass, BASIC_SURVEY__ADDITIONALSURVEY);

		confirmationSurveyEClass = createEClass(CONFIRMATION_SURVEY);
		createEReference(confirmationSurveyEClass, CONFIRMATION_SURVEY__BASICSURVEY);

		additionalSurveyEClass = createEClass(ADDITIONAL_SURVEY);
		createEReference(additionalSurveyEClass, ADDITIONAL_SURVEY__BASICSURVEY);

		poiEClass = createEClass(POI);
		createEAttribute(poiEClass, POI__Y);
		createEAttribute(poiEClass, POI__X);

		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__INVENTORYOBJECTIVE);
		createEReference(activityEClass, ACTIVITY__LEARNINGOBJECTIVE);
		createEReference(activityEClass, ACTIVITY__PROFILE);
		createEReference(activityEClass, ACTIVITY__GAMEOBJECTIVE);
		createEAttribute(activityEClass, ACTIVITY__INSTRUCTION);
		createEReference(activityEClass, ACTIVITY__GAME_ZONE);
		createEReference(activityEClass, ACTIVITY__GAMETYPECOMP);
		createEReference(activityEClass, ACTIVITY__GAMETYPE);

		botanicalFloreEClass = createEClass(BOTANICAL_FLORE);
		createEReference(botanicalFloreEClass, BOTANICAL_FLORE__FAMILY);

		objectivesEClass = createEClass(OBJECTIVES);
		createEReference(objectivesEClass, OBJECTIVES__LEARNINGOBJECTIVE);
		createEReference(objectivesEClass, OBJECTIVES__INVENTORYOBJECTIVE);
		createEReference(objectivesEClass, OBJECTIVES__GAMEOBJECTIVE);

		speciesEClass = createEClass(SPECIES);

		genderEClass = createEClass(GENDER);
		createEReference(genderEClass, GENDER__SPECIES);

		familyEClass = createEClass(FAMILY);
		createEAttribute(familyEClass, FAMILY__NAME);
		createEReference(familyEClass, FAMILY__GENDER);

		targetEClass = createEClass(TARGET);
		createEAttribute(targetEClass, TARGET__NAME);

		gameObjectiveEClass = createEClass(GAME_OBJECTIVE);

		botanicalStatEClass = createEClass(BOTANICAL_STAT);
		createEAttribute(botanicalStatEClass, BOTANICAL_STAT__DIRECT_IDENTIFICATION);
		createEReference(botanicalStatEClass, BOTANICAL_STAT__TARGET);

		gameTypePrefEClass = createEClass(GAME_TYPE_PREF);
		createEAttribute(gameTypePrefEClass, GAME_TYPE_PREF__PONDERATION);
		createEReference(gameTypePrefEClass, GAME_TYPE_PREF__GAMEOBJECTIVE);

		objectiveEClass = createEClass(OBJECTIVE);
		createEAttribute(objectiveEClass, OBJECTIVE__NAME);
		createEReference(objectiveEClass, OBJECTIVE__INCOMPATIBLE_OBJECTIVES);

		gameTypeEClass = createEClass(GAME_TYPE);
		createEReference(gameTypeEClass, GAME_TYPE__COMPATIBLEGAMEOBJECTIVE);
		createEAttribute(gameTypeEClass, GAME_TYPE__NAME);
		createEReference(gameTypeEClass, GAME_TYPE__COMPATIBLEINVENTORYOBJECTIVE);
		createEReference(gameTypeEClass, GAME_TYPE__COMPATIBLELEARNINGOBJECTIVE);
		createEAttribute(gameTypeEClass, GAME_TYPE__INSTRUCTION);
		createEReference(gameTypeEClass, GAME_TYPE__CONSTRAINT);

		action2DetectEClass = createEClass(ACTION2_DETECT);
		createEAttribute(action2DetectEClass, ACTION2_DETECT__NAME);
		createEReference(action2DetectEClass, ACTION2_DETECT__COMPATIBLEINVENTORYOBJECTIVE);
		createEReference(action2DetectEClass, ACTION2_DETECT__OPTIONALTARGET);

		gameTypeCompEClass = createEClass(GAME_TYPE_COMP);
		createEReference(gameTypeCompEClass, GAME_TYPE_COMP__GAMETYPE);
		createEAttribute(gameTypeCompEClass, GAME_TYPE_COMP__TIMES);

		structuredTaskEClass = createEClass(STRUCTURED_TASK);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__NAME);

		simpleTaskEClass = createEClass(SIMPLE_TASK);
		createEReference(simpleTaskEClass, SIMPLE_TASK__COMPATIBLEACTION2DETECT);

		recurrentTaskEClass = createEClass(RECURRENT_TASK);
		createEReference(recurrentTaskEClass, RECURRENT_TASK__SUBTASK);

		gameTypesEClass = createEClass(GAME_TYPES);
		createEReference(gameTypesEClass, GAME_TYPES__GAMETYPE);

		actions2DetectEClass = createEClass(ACTIONS2_DETECT);
		createEReference(actions2DetectEClass, ACTIONS2_DETECT__ACTION2DETECT);

		taskCompEClass = createEClass(TASK_COMP);
		createEReference(taskCompEClass, TASK_COMP__ACTION2DETECT);
		createEReference(taskCompEClass, TASK_COMP__NEWSPECIESSURVEY);

		constraintEClass = createEClass(CONSTRAINT);

		basicSurveyExistenceEClass = createEClass(BASIC_SURVEY_EXISTENCE);

		simpleSurveyExistenceEClass = createEClass(SIMPLE_SURVEY_EXISTENCE);

		reliableBasicSurveyExistenceEClass = createEClass(RELIABLE_BASIC_SURVEY_EXISTENCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		inventoryObjectiveEClass.getESuperTypes().add(this.getObjective());
		learningObjectiveEClass.getESuperTypes().add(this.getObjective());
		zoneCirculaireEClass.getESuperTypes().add(this.getZone());
		basicSurveyEClass.getESuperTypes().add(this.getBotanicalSurvey());
		confirmationSurveyEClass.getESuperTypes().add(this.getBotanicalSurvey());
		additionalSurveyEClass.getESuperTypes().add(this.getBotanicalSurvey());
		speciesEClass.getESuperTypes().add(this.getTarget());
		genderEClass.getESuperTypes().add(this.getTarget());
		gameObjectiveEClass.getESuperTypes().add(this.getObjective());
		structuredTaskEClass.getESuperTypes().add(this.getTask());
		simpleTaskEClass.getESuperTypes().add(this.getTask());
		recurrentTaskEClass.getESuperTypes().add(this.getStructuredTask());
		basicSurveyExistenceEClass.getESuperTypes().add(this.getConstraint());
		simpleSurveyExistenceEClass.getESuperTypes().add(this.getConstraint());
		reliableBasicSurveyExistenceEClass.getESuperTypes().add(this.getConstraint());

		// Initialize classes and features; add operations and parameters
		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContext_Zone(), this.getZone(), null, "zone", null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContext_Profile(), this.getProfile(), null, "profile", null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appDescEClass, AppDesc.class, "AppDesc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAppDesc_Objective(), this.getObjectives(), null, "objective", null, 0, 1, AppDesc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppDesc_Botanicalflore(), this.getBotanicalFlore(), null, "botanicalflore", null, 0, 1, AppDesc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppDesc_Gametypes(), this.getGameTypes(), null, "gametypes", null, 0, 1, AppDesc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppDesc_Actions2detect(), this.getActions2Detect(), null, "actions2detect", null, 0, 1, AppDesc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inventoryObjectiveEClass, InventoryObjective.class, "InventoryObjective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(learningObjectiveEClass, LearningObjective.class, "LearningObjective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(zoneEClass, Zone.class, "Zone", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(zoneCirculaireEClass, ZoneCirculaire.class, "ZoneCirculaire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZoneCirculaire_Rayon(), ecorePackage.getEInt(), "rayon", null, 0, 1, ZoneCirculaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZoneCirculaire_X(), ecorePackage.getEInt(), "x", null, 0, 1, ZoneCirculaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZoneCirculaire_Y(), ecorePackage.getEInt(), "y", null, 0, 1, ZoneCirculaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(profileEClass, Profile.class, "Profile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProfile_Firstname(), ecorePackage.getEString(), "firstname", null, 0, 1, Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProfile_Lastname(), ecorePackage.getEString(), "lastname", null, 0, 1, Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProfile_Inventoryprofile(), this.getInventoryProfile(), null, "inventoryprofile", null, 0, 1, Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProfile_Botanicalprofile(), this.getBotanicalProfile(), null, "botanicalprofile", null, 0, 1, Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProfile_Gameprofile(), this.getGameProfile(), null, "gameprofile", null, 0, 1, Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProfile_Botanicalsurvey(), this.getBotanicalSurvey(), this.getBotanicalSurvey_Profile(), "botanicalsurvey", null, 0, -1, Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getData_Profiles(), this.getProfile(), null, "profiles", null, 0, -1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_Botanicalsurveys(), this.getBotanicalSurvey(), null, "botanicalsurveys", null, 0, -1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inventoryProfileEClass, InventoryProfile.class, "InventoryProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(botanicalProfileEClass, BotanicalProfile.class, "BotanicalProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBotanicalProfile_Botanicalstat(), this.getBotanicalStat(), null, "botanicalstat", null, 0, -1, BotanicalProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBotanicalProfile_NoInterest(), ecorePackage.getEBoolean(), "noInterest", null, 0, 1, BotanicalProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameProfileEClass, GameProfile.class, "GameProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGameProfile_Gametypepref(), this.getGameTypePref(), null, "gametypepref", null, 0, -1, GameProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameProfile_NoInterest(), ecorePackage.getEBoolean(), "noInterest", null, 0, 1, GameProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(botanicalSurveyEClass, BotanicalSurvey.class, "BotanicalSurvey", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBotanicalSurvey_Profile(), this.getProfile(), this.getProfile_Botanicalsurvey(), "profile", null, 0, 1, BotanicalSurvey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBotanicalSurvey_Date(), ecorePackage.getEDate(), "date", null, 0, 1, BotanicalSurvey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBotanicalSurvey_Poi(), this.getPOI(), null, "poi", null, 0, 1, BotanicalSurvey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBotanicalSurvey_Target(), this.getTarget(), null, "target", null, 0, 1, BotanicalSurvey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBotanicalSurvey_Id(), ecorePackage.getEString(), "id", null, 0, 1, BotanicalSurvey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBotanicalSurvey_ReliabilityScore(), ecorePackage.getEInt(), "reliabilityScore", null, 0, 1, BotanicalSurvey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicSurveyEClass, BasicSurvey.class, "BasicSurvey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasicSurvey_Confirmationsurvey(), this.getConfirmationSurvey(), this.getConfirmationSurvey_Basicsurvey(), "confirmationsurvey", null, 0, -1, BasicSurvey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicSurvey_Additionalsurvey(), this.getAdditionalSurvey(), this.getAdditionalSurvey_Basicsurvey(), "additionalsurvey", null, 0, -1, BasicSurvey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(confirmationSurveyEClass, ConfirmationSurvey.class, "ConfirmationSurvey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfirmationSurvey_Basicsurvey(), this.getBasicSurvey(), this.getBasicSurvey_Confirmationsurvey(), "basicsurvey", null, 0, 1, ConfirmationSurvey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(additionalSurveyEClass, AdditionalSurvey.class, "AdditionalSurvey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdditionalSurvey_Basicsurvey(), this.getBasicSurvey(), this.getBasicSurvey_Additionalsurvey(), "basicsurvey", null, 0, 1, AdditionalSurvey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(poiEClass, AppliCitoyenne.simuV1.POI.class, "POI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPOI_Y(), ecorePackage.getEInt(), "y", null, 0, 1, AppliCitoyenne.simuV1.POI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPOI_X(), ecorePackage.getEInt(), "x", null, 0, 1, AppliCitoyenne.simuV1.POI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_Inventoryobjective(), this.getInventoryObjective(), null, "inventoryobjective", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Learningobjective(), this.getLearningObjective(), null, "learningobjective", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Profile(), this.getProfile(), null, "profile", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Gameobjective(), this.getGameObjective(), null, "gameobjective", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_Instruction(), ecorePackage.getEString(), "instruction", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_GameZone(), this.getZone(), null, "gameZone", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Gametypecomp(), this.getGameTypeComp(), null, "gametypecomp", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Gametype(), this.getGameType(), null, "gametype", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(botanicalFloreEClass, BotanicalFlore.class, "BotanicalFlore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBotanicalFlore_Family(), this.getFamily(), null, "family", null, 0, -1, BotanicalFlore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectivesEClass, Objectives.class, "Objectives", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectives_Learningobjective(), this.getLearningObjective(), null, "learningobjective", null, 0, -1, Objectives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectives_Inventoryobjective(), this.getInventoryObjective(), null, "inventoryobjective", null, 0, -1, Objectives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectives_Gameobjective(), this.getGameObjective(), null, "gameobjective", null, 0, -1, Objectives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(speciesEClass, Species.class, "Species", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genderEClass, Gender.class, "Gender", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGender_Species(), this.getSpecies(), null, "species", null, 0, -1, Gender.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(familyEClass, Family.class, "Family", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFamily_Name(), ecorePackage.getEString(), "name", null, 0, 1, Family.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFamily_Gender(), this.getGender(), null, "gender", null, 0, -1, Family.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetEClass, Target.class, "Target", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTarget_Name(), ecorePackage.getEString(), "name", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameObjectiveEClass, GameObjective.class, "GameObjective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(botanicalStatEClass, BotanicalStat.class, "BotanicalStat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBotanicalStat_DirectIdentification(), ecorePackage.getEInt(), "directIdentification", null, 0, 1, BotanicalStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBotanicalStat_Target(), this.getTarget(), null, "target", null, 0, 1, BotanicalStat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameTypePrefEClass, GameTypePref.class, "GameTypePref", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGameTypePref_Ponderation(), ecorePackage.getEInt(), "ponderation", null, 0, 1, GameTypePref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameTypePref_Gameobjective(), this.getGameObjective(), null, "gameobjective", null, 0, 1, GameTypePref.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectiveEClass, Objective.class, "Objective", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjective_Name(), ecorePackage.getEString(), "name", null, 0, 1, Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjective_IncompatibleObjectives(), this.getObjective(), null, "incompatibleObjectives", null, 0, -1, Objective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameTypeEClass, GameType.class, "GameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGameType_Compatiblegameobjective(), this.getGameObjective(), null, "compatiblegameobjective", null, 0, -1, GameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameType_Name(), ecorePackage.getEString(), "name", null, 0, 1, GameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameType_Compatibleinventoryobjective(), this.getInventoryObjective(), null, "compatibleinventoryobjective", null, 0, -1, GameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameType_Compatiblelearningobjective(), this.getLearningObjective(), null, "compatiblelearningobjective", null, 0, -1, GameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameType_Instruction(), ecorePackage.getEString(), "instruction", null, 0, 1, GameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameType_Constraint(), this.getConstraint(), null, "constraint", null, 0, -1, GameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(action2DetectEClass, Action2Detect.class, "Action2Detect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction2Detect_Name(), ecorePackage.getEString(), "name", null, 0, 1, Action2Detect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction2Detect_Compatibleinventoryobjective(), this.getInventoryObjective(), null, "compatibleinventoryobjective", null, 0, -1, Action2Detect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction2Detect_Optionaltarget(), this.getTarget(), null, "optionaltarget", null, 0, -1, Action2Detect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameTypeCompEClass, GameTypeComp.class, "GameTypeComp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGameTypeComp_Gametype(), this.getGameType(), null, "gametype", null, 0, 1, GameTypeComp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameTypeComp_Times(), ecorePackage.getEInt(), "times", null, 0, 1, GameTypeComp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuredTaskEClass, StructuredTask.class, "StructuredTask", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskEClass, Task.class, "Task", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Name(), ecorePackage.getEString(), "name", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleTaskEClass, SimpleTask.class, "SimpleTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleTask_Compatibleaction2detect(), this.getAction2Detect(), null, "compatibleaction2detect", null, 0, -1, SimpleTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recurrentTaskEClass, RecurrentTask.class, "RecurrentTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecurrentTask_Subtask(), this.getSimpleTask(), null, "subtask", null, 0, 1, RecurrentTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameTypesEClass, GameTypes.class, "GameTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGameTypes_Gametype(), this.getGameType(), null, "gametype", null, 0, -1, GameTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actions2DetectEClass, Actions2Detect.class, "Actions2Detect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActions2Detect_Action2detect(), this.getAction2Detect(), null, "action2detect", null, 0, -1, Actions2Detect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskCompEClass, TaskComp.class, "TaskComp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskComp_Action2detect(), this.getAction2Detect(), null, "action2detect", null, 0, 1, TaskComp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskComp_Newspeciessurvey(), this.getTarget(), null, "newspeciessurvey", null, 0, 1, TaskComp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(basicSurveyExistenceEClass, BasicSurveyExistence.class, "BasicSurveyExistence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleSurveyExistenceEClass, SimpleSurveyExistence.class, "SimpleSurveyExistence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reliableBasicSurveyExistenceEClass, ReliableBasicSurveyExistence.class, "ReliableBasicSurveyExistence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// exeed
		createExeedAnnotations();
	}

	/**
	 * Initializes the annotations for <b>exeed</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExeedAnnotations() {
		String source = "exeed";	
		addAnnotation
		  (contextEClass, 
		   source, 
		   new String[] {
			 "classIcon", "emfmodel"
		   });	
		addAnnotation
		  (appDescEClass, 
		   source, 
		   new String[] {
			 "classIcon", "emfmodel"
		   });	
		addAnnotation
		  (inventoryObjectiveEClass, 
		   source, 
		   new String[] {
			 "classIcon", "public",
			 "label", "return self.name;"
		   });	
		addAnnotation
		  (learningObjectiveEClass, 
		   source, 
		   new String[] {
			 "classIcon", "resource",
			 "label", "return self.name;"
		   });	
		addAnnotation
		  (profileEClass, 
		   source, 
		   new String[] {
			 "classIcon", "user"
		   });	
		addAnnotation
		  (dataEClass, 
		   source, 
		   new String[] {
			 "classIcon", "emfmodel"
		   });	
		addAnnotation
		  (inventoryProfileEClass, 
		   source, 
		   new String[] {
			 "classIcon", "public"
		   });	
		addAnnotation
		  (botanicalProfileEClass, 
		   source, 
		   new String[] {
			 "classIcon", "resource"
		   });	
		addAnnotation
		  (gameProfileEClass, 
		   source, 
		   new String[] {
			 "classIcon", "competitor"
		   });	
		addAnnotation
		  (botanicalSurveyEClass, 
		   source, 
		   new String[] {
			 "classIcon", "file"
		   });	
		addAnnotation
		  (basicSurveyEClass, 
		   source, 
		   new String[] {
			 "classIcon", "file"
		   });	
		addAnnotation
		  (confirmationSurveyEClass, 
		   source, 
		   new String[] {
			 "classIcon", "file"
		   });	
		addAnnotation
		  (poiEClass, 
		   source, 
		   new String[] {
			 "classIcon", "object"
		   });	
		addAnnotation
		  (activityEClass, 
		   source, 
		   new String[] {
			 "icon", "emfmodel"
		   });	
		addAnnotation
		  (botanicalFloreEClass, 
		   source, 
		   new String[] {
			 "classIcon", "class"
		   });	
		addAnnotation
		  (objectivesEClass, 
		   source, 
		   new String[] {
			 "classIcon", "package"
		   });	
		addAnnotation
		  (speciesEClass, 
		   source, 
		   new String[] {
			 "classIcon", "class"
		   });	
		addAnnotation
		  (genderEClass, 
		   source, 
		   new String[] {
			 "classIcon", "class"
		   });	
		addAnnotation
		  (familyEClass, 
		   source, 
		   new String[] {
			 "classIcon", "class"
		   });	
		addAnnotation
		  (gameObjectiveEClass, 
		   source, 
		   new String[] {
			 "classIcon", "competitor",
			 "label", "return self.name;"
		   });	
		addAnnotation
		  (gameTypePrefEClass, 
		   source, 
		   new String[] {
			 "classIcon", "competitor"
		   });
	}

} //SimuV1PackageImpl
