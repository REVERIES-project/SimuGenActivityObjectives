/**
 */
package AppliCitoyenne.simuV1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see AppliCitoyenne.simuV1.SimuV1Factory
 * @model kind="package"
 * @generated
 */
public interface SimuV1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simuV1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "simuV1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simuV1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimuV1Package eINSTANCE = AppliCitoyenne.simuV1.impl.SimuV1PackageImpl.init();

	/**
	 * The meta object id for the '{@link AppliCitoyenne.simuV1.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AppliCitoyenne.simuV1.impl.ContextImpl
	 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__ZONE = 0;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__PROFILE = 1;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link AppliCitoyenne.simuV1.impl.AppDescImpl <em>App Desc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AppliCitoyenne.simuV1.impl.AppDescImpl
	 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getAppDesc()
	 * @generated
	 */
	int APP_DESC = 1;

	/**
	 * The feature id for the '<em><b>Objective</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_DESC__OBJECTIVE = 0;

	/**
	 * The feature id for the '<em><b>Botanicalflore</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_DESC__BOTANICALFLORE = 1;

	/**
	 * The number of structural features of the '<em>App Desc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_DESC_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link AppliCitoyenne.simuV1.impl.ObjectiveImpl <em>Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AppliCitoyenne.simuV1.impl.ObjectiveImpl
	 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getObjective()
	 * @generated
	 */
	int OBJECTIVE = 26;

	/**
	 * The feature id for the '<em><b>Incompatible Objectives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__INCOMPATIBLE_OBJECTIVES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link AppliCitoyenne.simuV1.impl.InventoryObjectiveImpl <em>Inventory Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AppliCitoyenne.simuV1.impl.InventoryObjectiveImpl
	 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getInventoryObjective()
	 * @generated
	 */
	int INVENTORY_OBJECTIVE = 2;

	/**
	 * The feature id for the '<em><b>Incompatible Objectives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_OBJECTIVE__INCOMPATIBLE_OBJECTIVES = OBJECTIVE__INCOMPATIBLE_OBJECTIVES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_OBJECTIVE__NAME = OBJECTIVE__NAME;

	/**
	 * The number of structural features of the '<em>Inventory Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_OBJECTIVE_FEATURE_COUNT = OBJECTIVE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link AppliCitoyenne.simuV1.impl.LearningObjectiveImpl <em>Learning Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AppliCitoyenne.simuV1.impl.LearningObjectiveImpl
	 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getLearningObjective()
	 * @generated
	 */
	int LEARNING_OBJECTIVE = 3;

	/**
	 * The feature id for the '<em><b>Incompatible Objectives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_OBJECTIVE__INCOMPATIBLE_OBJECTIVES = OBJECTIVE__INCOMPATIBLE_OBJECTIVES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_OBJECTIVE__NAME = OBJECTIVE__NAME;

	/**
	 * The number of structural features of the '<em>Learning Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEARNING_OBJECTIVE_FEATURE_COUNT = OBJECTIVE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link AppliCitoyenne.simuV1.impl.ZoneImpl <em>Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AppliCitoyenne.simuV1.impl.ZoneImpl
	 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getZone()
	 * @generated
	 */
	int ZONE = 4;

	/**
	 * The number of structural features of the '<em>Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link AppliCitoyenne.simuV1.impl.ZoneCirculaireImpl <em>Zone Circulaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AppliCitoyenne.simuV1.impl.ZoneCirculaireImpl
	 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getZoneCirculaire()
	 * @generated
	 */
	int ZONE_CIRCULAIRE = 5;

	/**
	 * The feature id for the '<em><b>Rayon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_CIRCULAIRE__RAYON = ZONE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_CIRCULAIRE__X = ZONE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_CIRCULAIRE__Y = ZONE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Zone Circulaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_CIRCULAIRE_FEATURE_COUNT = ZONE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link AppliCitoyenne.simuV1.impl.ProfileImpl <em>Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AppliCitoyenne.simuV1.impl.ProfileImpl
	 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getProfile()
	 * @generated
	 */
	int PROFILE = 6;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__FIRSTNAME = 0;

	/**
	 * The feature id for the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__LASTNAME = 1;

	/**
	 * The feature id for the '<em><b>Inventoryprofile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__INVENTORYPROFILE = 2;

	/**
	 * The feature id for the '<em><b>Botanicalprofile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__BOTANICALPROFILE = 3;

	/**
	 * The feature id for the '<em><b>Gameprofile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__GAMEPROFILE = 4;

	/**
	 * The feature id for the '<em><b>Botanicalsurvey</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE__BOTANICALSURVEY = 5;

	/**
	 * The number of structural features of the '<em>Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFILE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link AppliCitoyenne.simuV1.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AppliCitoyenne.simuV1.impl.DataImpl
	 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getData()
	 * @generated
	 */
	int DATA = 7;

	/**
	 * The feature id for the '<em><b>Profiles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__PROFILES = 0;

	/**
	 * The feature id for the '<em><b>Botanicalsurveys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__BOTANICALSURVEYS = 1;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link AppliCitoyenne.simuV1.impl.InventoryProfileImpl <em>Inventory Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AppliCitoyenne.simuV1.impl.InventoryProfileImpl
	 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getInventoryProfile()
	 * @generated
	 */
	int INVENTORY_PROFILE = 8;

	/**
	 * The number of structural features of the '<em>Inventory Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_PROFILE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link AppliCitoyenne.simuV1.impl.BotanicalProfileImpl <em>Botanical Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AppliCitoyenne.simuV1.impl.BotanicalProfileImpl
	 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getBotanicalProfile()
	 * @generated
	 */
	int BOTANICAL_PROFILE = 9;

	/**
	 * The feature id for the '<em><b>Botanicalstat</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTANICAL_PROFILE__BOTANICALSTAT = 0;

	/**
	 * The feature id for the '<em><b>No Interest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTANICAL_PROFILE__NO_INTEREST = 1;

	/**
	 * The number of structural features of the '<em>Botanical Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTANICAL_PROFILE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link AppliCitoyenne.simuV1.impl.GameProfileImpl <em>Game Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AppliCitoyenne.simuV1.impl.GameProfileImpl
	 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getGameProfile()
	 * @generated
	 */
	int GAME_PROFILE = 10;

	/**
	 * The feature id for the '<em><b>Gametypepref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PROFILE__GAMETYPEPREF = 0;

	/**
	 * The feature id for the '<em><b>No Interest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PROFILE__NO_INTEREST = 1;

	/**
	 * The number of structural features of the '<em>Game Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_PROFILE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link AppliCitoyenne.simuV1.impl.BotanicalSurveyImpl <em>Botanical Survey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AppliCitoyenne.simuV1.impl.BotanicalSurveyImpl
	 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getBotanicalSurvey()
	 * @generated
	 */
	int BOTANICAL_SURVEY = 11;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTANICAL_SURVEY__PROFILE = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTANICAL_SURVEY__DATE = 1;

	/**
	 * The feature id for the '<em><b>Poi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTANICAL_SURVEY__POI = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTANICAL_SURVEY__TARGET = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTANICAL_SURVEY__ID = 4;

	/**
	 * The feature id for the '<em><b>Reliability Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTANICAL_SURVEY__RELIABILITY_SCORE = 5;

	/**
	 * The number of structural features of the '<em>Botanical Survey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTANICAL_SURVEY_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link AppliCitoyenne.simuV1.impl.BasicSurveyImpl <em>Basic Survey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AppliCitoyenne.simuV1.impl.BasicSurveyImpl
	 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getBasicSurvey()
	 * @generated
	 */
	int BASIC_SURVEY = 12;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SURVEY__PROFILE = BOTANICAL_SURVEY__PROFILE;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SURVEY__DATE = BOTANICAL_SURVEY__DATE;

	/**
	 * The feature id for the '<em><b>Poi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SURVEY__POI = BOTANICAL_SURVEY__POI;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SURVEY__TARGET = BOTANICAL_SURVEY__TARGET;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SURVEY__ID = BOTANICAL_SURVEY__ID;

	/**
	 * The feature id for the '<em><b>Reliability Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SURVEY__RELIABILITY_SCORE = BOTANICAL_SURVEY__RELIABILITY_SCORE;

	/**
	 * The feature id for the '<em><b>Confirmationsurvey</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SURVEY__CONFIRMATIONSURVEY = BOTANICAL_SURVEY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Additionalsurvey</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SURVEY__ADDITIONALSURVEY = BOTANICAL_SURVEY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Basic Survey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SURVEY_FEATURE_COUNT = BOTANICAL_SURVEY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link AppliCitoyenne.simuV1.impl.ConfirmationSurveyImpl <em>Confirmation Survey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AppliCitoyenne.simuV1.impl.ConfirmationSurveyImpl
	 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getConfirmationSurvey()
	 * @generated
	 */
	int CONFIRMATION_SURVEY = 13;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRMATION_SURVEY__PROFILE = BOTANICAL_SURVEY__PROFILE;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRMATION_SURVEY__DATE = BOTANICAL_SURVEY__DATE;

	/**
	 * The feature id for the '<em><b>Poi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRMATION_SURVEY__POI = BOTANICAL_SURVEY__POI;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRMATION_SURVEY__TARGET = BOTANICAL_SURVEY__TARGET;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRMATION_SURVEY__ID = BOTANICAL_SURVEY__ID;

	/**
	 * The feature id for the '<em><b>Reliability Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRMATION_SURVEY__RELIABILITY_SCORE = BOTANICAL_SURVEY__RELIABILITY_SCORE;

	/**
	 * The feature id for the '<em><b>Basicsurvey</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRMATION_SURVEY__BASICSURVEY = BOTANICAL_SURVEY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Confirmation Survey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIRMATION_SURVEY_FEATURE_COUNT = BOTANICAL_SURVEY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link AppliCitoyenne.simuV1.impl.AdditionalSurveyImpl <em>Additional Survey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AppliCitoyenne.simuV1.impl.AdditionalSurveyImpl
	 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getAdditionalSurvey()
	 * @generated
	 */
	int ADDITIONAL_SURVEY = 14;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SURVEY__PROFILE = BOTANICAL_SURVEY__PROFILE;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SURVEY__DATE = BOTANICAL_SURVEY__DATE;

	/**
	 * The feature id for the '<em><b>Poi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SURVEY__POI = BOTANICAL_SURVEY__POI;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SURVEY__TARGET = BOTANICAL_SURVEY__TARGET;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SURVEY__ID = BOTANICAL_SURVEY__ID;

	/**
	 * The feature id for the '<em><b>Reliability Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SURVEY__RELIABILITY_SCORE = BOTANICAL_SURVEY__RELIABILITY_SCORE;

	/**
	 * The feature id for the '<em><b>Basicsurvey</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SURVEY__BASICSURVEY = BOTANICAL_SURVEY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Additional Survey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_SURVEY_FEATURE_COUNT = BOTANICAL_SURVEY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link AppliCitoyenne.simuV1.impl.POIImpl <em>POI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AppliCitoyenne.simuV1.impl.POIImpl
	 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getPOI()
	 * @generated
	 */
	int POI = 15;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POI__Y = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POI__X = 1;

	/**
	 * The number of structural features of the '<em>POI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POI_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link AppliCitoyenne.simuV1.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AppliCitoyenne.simuV1.impl.ActivityImpl
	 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 16;

	/**
	 * The feature id for the '<em><b>Inventoryobjective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INVENTORYOBJECTIVE = 0;

	/**
	 * The feature id for the '<em><b>Learningobjective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__LEARNINGOBJECTIVE = 1;

	/**
	 * The feature id for the '<em><b>Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PROFILE = 2;

	/**
	 * The feature id for the '<em><b>Gameobjective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__GAMEOBJECTIVE = 3;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link AppliCitoyenne.simuV1.impl.BotanicalFloreImpl <em>Botanical Flore</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AppliCitoyenne.simuV1.impl.BotanicalFloreImpl
	 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getBotanicalFlore()
	 * @generated
	 */
	int BOTANICAL_FLORE = 17;

	/**
	 * The feature id for the '<em><b>Family</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTANICAL_FLORE__FAMILY = 0;

	/**
	 * The number of structural features of the '<em>Botanical Flore</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTANICAL_FLORE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link AppliCitoyenne.simuV1.impl.ObjectivesImpl <em>Objectives</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AppliCitoyenne.simuV1.impl.ObjectivesImpl
	 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getObjectives()
	 * @generated
	 */
	int OBJECTIVES = 18;

	/**
	 * The feature id for the '<em><b>Learningobjective</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVES__LEARNINGOBJECTIVE = 0;

	/**
	 * The feature id for the '<em><b>Inventoryobjective</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVES__INVENTORYOBJECTIVE = 1;

	/**
	 * The feature id for the '<em><b>Gameobjective</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVES__GAMEOBJECTIVE = 2;

	/**
	 * The number of structural features of the '<em>Objectives</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIVES_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link AppliCitoyenne.simuV1.impl.TargetImpl <em>Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AppliCitoyenne.simuV1.impl.TargetImpl
	 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getTarget()
	 * @generated
	 */
	int TARGET = 22;

	/**
	 * The number of structural features of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link AppliCitoyenne.simuV1.impl.SpeciesImpl <em>Species</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AppliCitoyenne.simuV1.impl.SpeciesImpl
	 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getSpecies()
	 * @generated
	 */
	int SPECIES = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__NAME = TARGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Species</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES_FEATURE_COUNT = TARGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link AppliCitoyenne.simuV1.impl.GenderImpl <em>Gender</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AppliCitoyenne.simuV1.impl.GenderImpl
	 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getGender()
	 * @generated
	 */
	int GENDER = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENDER__NAME = TARGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Species</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENDER__SPECIES = TARGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENDER_FEATURE_COUNT = TARGET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link AppliCitoyenne.simuV1.impl.FamilyImpl <em>Family</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AppliCitoyenne.simuV1.impl.FamilyImpl
	 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getFamily()
	 * @generated
	 */
	int FAMILY = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY__GENDER = 1;

	/**
	 * The number of structural features of the '<em>Family</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link AppliCitoyenne.simuV1.impl.GameObjectiveImpl <em>Game Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AppliCitoyenne.simuV1.impl.GameObjectiveImpl
	 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getGameObjective()
	 * @generated
	 */
	int GAME_OBJECTIVE = 23;

	/**
	 * The feature id for the '<em><b>Incompatible Objectives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OBJECTIVE__INCOMPATIBLE_OBJECTIVES = OBJECTIVE__INCOMPATIBLE_OBJECTIVES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OBJECTIVE__NAME = OBJECTIVE__NAME;

	/**
	 * The number of structural features of the '<em>Game Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OBJECTIVE_FEATURE_COUNT = OBJECTIVE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link AppliCitoyenne.simuV1.impl.BotanicalStatImpl <em>Botanical Stat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AppliCitoyenne.simuV1.impl.BotanicalStatImpl
	 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getBotanicalStat()
	 * @generated
	 */
	int BOTANICAL_STAT = 24;

	/**
	 * The feature id for the '<em><b>Direct Identification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTANICAL_STAT__DIRECT_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTANICAL_STAT__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Botanical Stat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTANICAL_STAT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link AppliCitoyenne.simuV1.impl.GameTypePrefImpl <em>Game Type Pref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AppliCitoyenne.simuV1.impl.GameTypePrefImpl
	 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getGameTypePref()
	 * @generated
	 */
	int GAME_TYPE_PREF = 25;

	/**
	 * The feature id for the '<em><b>Ponderation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_TYPE_PREF__PONDERATION = 0;

	/**
	 * The feature id for the '<em><b>Gameobjective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_TYPE_PREF__GAMEOBJECTIVE = 1;

	/**
	 * The number of structural features of the '<em>Game Type Pref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_TYPE_PREF_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link AppliCitoyenne.simuV1.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see AppliCitoyenne.simuV1.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the containment reference '{@link AppliCitoyenne.simuV1.Context#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zone</em>'.
	 * @see AppliCitoyenne.simuV1.Context#getZone()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Zone();

	/**
	 * Returns the meta object for the reference '{@link AppliCitoyenne.simuV1.Context#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Profile</em>'.
	 * @see AppliCitoyenne.simuV1.Context#getProfile()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Profile();

	/**
	 * Returns the meta object for class '{@link AppliCitoyenne.simuV1.AppDesc <em>App Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Desc</em>'.
	 * @see AppliCitoyenne.simuV1.AppDesc
	 * @generated
	 */
	EClass getAppDesc();

	/**
	 * Returns the meta object for the containment reference '{@link AppliCitoyenne.simuV1.AppDesc#getObjective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Objective</em>'.
	 * @see AppliCitoyenne.simuV1.AppDesc#getObjective()
	 * @see #getAppDesc()
	 * @generated
	 */
	EReference getAppDesc_Objective();

	/**
	 * Returns the meta object for the containment reference '{@link AppliCitoyenne.simuV1.AppDesc#getBotanicalflore <em>Botanicalflore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Botanicalflore</em>'.
	 * @see AppliCitoyenne.simuV1.AppDesc#getBotanicalflore()
	 * @see #getAppDesc()
	 * @generated
	 */
	EReference getAppDesc_Botanicalflore();

	/**
	 * Returns the meta object for class '{@link AppliCitoyenne.simuV1.InventoryObjective <em>Inventory Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inventory Objective</em>'.
	 * @see AppliCitoyenne.simuV1.InventoryObjective
	 * @generated
	 */
	EClass getInventoryObjective();

	/**
	 * Returns the meta object for class '{@link AppliCitoyenne.simuV1.LearningObjective <em>Learning Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Learning Objective</em>'.
	 * @see AppliCitoyenne.simuV1.LearningObjective
	 * @generated
	 */
	EClass getLearningObjective();

	/**
	 * Returns the meta object for class '{@link AppliCitoyenne.simuV1.Zone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone</em>'.
	 * @see AppliCitoyenne.simuV1.Zone
	 * @generated
	 */
	EClass getZone();

	/**
	 * Returns the meta object for class '{@link AppliCitoyenne.simuV1.ZoneCirculaire <em>Zone Circulaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone Circulaire</em>'.
	 * @see AppliCitoyenne.simuV1.ZoneCirculaire
	 * @generated
	 */
	EClass getZoneCirculaire();

	/**
	 * Returns the meta object for the attribute '{@link AppliCitoyenne.simuV1.ZoneCirculaire#getRayon <em>Rayon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rayon</em>'.
	 * @see AppliCitoyenne.simuV1.ZoneCirculaire#getRayon()
	 * @see #getZoneCirculaire()
	 * @generated
	 */
	EAttribute getZoneCirculaire_Rayon();

	/**
	 * Returns the meta object for the attribute '{@link AppliCitoyenne.simuV1.ZoneCirculaire#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see AppliCitoyenne.simuV1.ZoneCirculaire#getX()
	 * @see #getZoneCirculaire()
	 * @generated
	 */
	EAttribute getZoneCirculaire_X();

	/**
	 * Returns the meta object for the attribute '{@link AppliCitoyenne.simuV1.ZoneCirculaire#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see AppliCitoyenne.simuV1.ZoneCirculaire#getY()
	 * @see #getZoneCirculaire()
	 * @generated
	 */
	EAttribute getZoneCirculaire_Y();

	/**
	 * Returns the meta object for class '{@link AppliCitoyenne.simuV1.Profile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Profile</em>'.
	 * @see AppliCitoyenne.simuV1.Profile
	 * @generated
	 */
	EClass getProfile();

	/**
	 * Returns the meta object for the attribute '{@link AppliCitoyenne.simuV1.Profile#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstname</em>'.
	 * @see AppliCitoyenne.simuV1.Profile#getFirstname()
	 * @see #getProfile()
	 * @generated
	 */
	EAttribute getProfile_Firstname();

	/**
	 * Returns the meta object for the attribute '{@link AppliCitoyenne.simuV1.Profile#getLastname <em>Lastname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lastname</em>'.
	 * @see AppliCitoyenne.simuV1.Profile#getLastname()
	 * @see #getProfile()
	 * @generated
	 */
	EAttribute getProfile_Lastname();

	/**
	 * Returns the meta object for the containment reference '{@link AppliCitoyenne.simuV1.Profile#getInventoryprofile <em>Inventoryprofile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inventoryprofile</em>'.
	 * @see AppliCitoyenne.simuV1.Profile#getInventoryprofile()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Inventoryprofile();

	/**
	 * Returns the meta object for the containment reference '{@link AppliCitoyenne.simuV1.Profile#getBotanicalprofile <em>Botanicalprofile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Botanicalprofile</em>'.
	 * @see AppliCitoyenne.simuV1.Profile#getBotanicalprofile()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Botanicalprofile();

	/**
	 * Returns the meta object for the containment reference '{@link AppliCitoyenne.simuV1.Profile#getGameprofile <em>Gameprofile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gameprofile</em>'.
	 * @see AppliCitoyenne.simuV1.Profile#getGameprofile()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Gameprofile();

	/**
	 * Returns the meta object for the reference list '{@link AppliCitoyenne.simuV1.Profile#getBotanicalsurvey <em>Botanicalsurvey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Botanicalsurvey</em>'.
	 * @see AppliCitoyenne.simuV1.Profile#getBotanicalsurvey()
	 * @see #getProfile()
	 * @generated
	 */
	EReference getProfile_Botanicalsurvey();

	/**
	 * Returns the meta object for class '{@link AppliCitoyenne.simuV1.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see AppliCitoyenne.simuV1.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the containment reference list '{@link AppliCitoyenne.simuV1.Data#getProfiles <em>Profiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Profiles</em>'.
	 * @see AppliCitoyenne.simuV1.Data#getProfiles()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Profiles();

	/**
	 * Returns the meta object for the containment reference list '{@link AppliCitoyenne.simuV1.Data#getBotanicalsurveys <em>Botanicalsurveys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Botanicalsurveys</em>'.
	 * @see AppliCitoyenne.simuV1.Data#getBotanicalsurveys()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Botanicalsurveys();

	/**
	 * Returns the meta object for class '{@link AppliCitoyenne.simuV1.InventoryProfile <em>Inventory Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inventory Profile</em>'.
	 * @see AppliCitoyenne.simuV1.InventoryProfile
	 * @generated
	 */
	EClass getInventoryProfile();

	/**
	 * Returns the meta object for class '{@link AppliCitoyenne.simuV1.BotanicalProfile <em>Botanical Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Botanical Profile</em>'.
	 * @see AppliCitoyenne.simuV1.BotanicalProfile
	 * @generated
	 */
	EClass getBotanicalProfile();

	/**
	 * Returns the meta object for the containment reference list '{@link AppliCitoyenne.simuV1.BotanicalProfile#getBotanicalstat <em>Botanicalstat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Botanicalstat</em>'.
	 * @see AppliCitoyenne.simuV1.BotanicalProfile#getBotanicalstat()
	 * @see #getBotanicalProfile()
	 * @generated
	 */
	EReference getBotanicalProfile_Botanicalstat();

	/**
	 * Returns the meta object for the attribute '{@link AppliCitoyenne.simuV1.BotanicalProfile#isNoInterest <em>No Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Interest</em>'.
	 * @see AppliCitoyenne.simuV1.BotanicalProfile#isNoInterest()
	 * @see #getBotanicalProfile()
	 * @generated
	 */
	EAttribute getBotanicalProfile_NoInterest();

	/**
	 * Returns the meta object for class '{@link AppliCitoyenne.simuV1.GameProfile <em>Game Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Profile</em>'.
	 * @see AppliCitoyenne.simuV1.GameProfile
	 * @generated
	 */
	EClass getGameProfile();

	/**
	 * Returns the meta object for the containment reference list '{@link AppliCitoyenne.simuV1.GameProfile#getGametypepref <em>Gametypepref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gametypepref</em>'.
	 * @see AppliCitoyenne.simuV1.GameProfile#getGametypepref()
	 * @see #getGameProfile()
	 * @generated
	 */
	EReference getGameProfile_Gametypepref();

	/**
	 * Returns the meta object for the attribute '{@link AppliCitoyenne.simuV1.GameProfile#isNoInterest <em>No Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Interest</em>'.
	 * @see AppliCitoyenne.simuV1.GameProfile#isNoInterest()
	 * @see #getGameProfile()
	 * @generated
	 */
	EAttribute getGameProfile_NoInterest();

	/**
	 * Returns the meta object for class '{@link AppliCitoyenne.simuV1.BotanicalSurvey <em>Botanical Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Botanical Survey</em>'.
	 * @see AppliCitoyenne.simuV1.BotanicalSurvey
	 * @generated
	 */
	EClass getBotanicalSurvey();

	/**
	 * Returns the meta object for the reference '{@link AppliCitoyenne.simuV1.BotanicalSurvey#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Profile</em>'.
	 * @see AppliCitoyenne.simuV1.BotanicalSurvey#getProfile()
	 * @see #getBotanicalSurvey()
	 * @generated
	 */
	EReference getBotanicalSurvey_Profile();

	/**
	 * Returns the meta object for the attribute '{@link AppliCitoyenne.simuV1.BotanicalSurvey#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see AppliCitoyenne.simuV1.BotanicalSurvey#getDate()
	 * @see #getBotanicalSurvey()
	 * @generated
	 */
	EAttribute getBotanicalSurvey_Date();

	/**
	 * Returns the meta object for the containment reference '{@link AppliCitoyenne.simuV1.BotanicalSurvey#getPoi <em>Poi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Poi</em>'.
	 * @see AppliCitoyenne.simuV1.BotanicalSurvey#getPoi()
	 * @see #getBotanicalSurvey()
	 * @generated
	 */
	EReference getBotanicalSurvey_Poi();

	/**
	 * Returns the meta object for the reference '{@link AppliCitoyenne.simuV1.BotanicalSurvey#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see AppliCitoyenne.simuV1.BotanicalSurvey#getTarget()
	 * @see #getBotanicalSurvey()
	 * @generated
	 */
	EReference getBotanicalSurvey_Target();

	/**
	 * Returns the meta object for the attribute '{@link AppliCitoyenne.simuV1.BotanicalSurvey#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see AppliCitoyenne.simuV1.BotanicalSurvey#getId()
	 * @see #getBotanicalSurvey()
	 * @generated
	 */
	EAttribute getBotanicalSurvey_Id();

	/**
	 * Returns the meta object for the attribute '{@link AppliCitoyenne.simuV1.BotanicalSurvey#getReliabilityScore <em>Reliability Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reliability Score</em>'.
	 * @see AppliCitoyenne.simuV1.BotanicalSurvey#getReliabilityScore()
	 * @see #getBotanicalSurvey()
	 * @generated
	 */
	EAttribute getBotanicalSurvey_ReliabilityScore();

	/**
	 * Returns the meta object for class '{@link AppliCitoyenne.simuV1.BasicSurvey <em>Basic Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Survey</em>'.
	 * @see AppliCitoyenne.simuV1.BasicSurvey
	 * @generated
	 */
	EClass getBasicSurvey();

	/**
	 * Returns the meta object for the reference list '{@link AppliCitoyenne.simuV1.BasicSurvey#getConfirmationsurvey <em>Confirmationsurvey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Confirmationsurvey</em>'.
	 * @see AppliCitoyenne.simuV1.BasicSurvey#getConfirmationsurvey()
	 * @see #getBasicSurvey()
	 * @generated
	 */
	EReference getBasicSurvey_Confirmationsurvey();

	/**
	 * Returns the meta object for the reference list '{@link AppliCitoyenne.simuV1.BasicSurvey#getAdditionalsurvey <em>Additionalsurvey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Additionalsurvey</em>'.
	 * @see AppliCitoyenne.simuV1.BasicSurvey#getAdditionalsurvey()
	 * @see #getBasicSurvey()
	 * @generated
	 */
	EReference getBasicSurvey_Additionalsurvey();

	/**
	 * Returns the meta object for class '{@link AppliCitoyenne.simuV1.ConfirmationSurvey <em>Confirmation Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Confirmation Survey</em>'.
	 * @see AppliCitoyenne.simuV1.ConfirmationSurvey
	 * @generated
	 */
	EClass getConfirmationSurvey();

	/**
	 * Returns the meta object for the reference '{@link AppliCitoyenne.simuV1.ConfirmationSurvey#getBasicsurvey <em>Basicsurvey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Basicsurvey</em>'.
	 * @see AppliCitoyenne.simuV1.ConfirmationSurvey#getBasicsurvey()
	 * @see #getConfirmationSurvey()
	 * @generated
	 */
	EReference getConfirmationSurvey_Basicsurvey();

	/**
	 * Returns the meta object for class '{@link AppliCitoyenne.simuV1.AdditionalSurvey <em>Additional Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Survey</em>'.
	 * @see AppliCitoyenne.simuV1.AdditionalSurvey
	 * @generated
	 */
	EClass getAdditionalSurvey();

	/**
	 * Returns the meta object for the reference '{@link AppliCitoyenne.simuV1.AdditionalSurvey#getBasicsurvey <em>Basicsurvey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Basicsurvey</em>'.
	 * @see AppliCitoyenne.simuV1.AdditionalSurvey#getBasicsurvey()
	 * @see #getAdditionalSurvey()
	 * @generated
	 */
	EReference getAdditionalSurvey_Basicsurvey();

	/**
	 * Returns the meta object for class '{@link AppliCitoyenne.simuV1.POI <em>POI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>POI</em>'.
	 * @see AppliCitoyenne.simuV1.POI
	 * @generated
	 */
	EClass getPOI();

	/**
	 * Returns the meta object for the attribute '{@link AppliCitoyenne.simuV1.POI#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see AppliCitoyenne.simuV1.POI#getY()
	 * @see #getPOI()
	 * @generated
	 */
	EAttribute getPOI_Y();

	/**
	 * Returns the meta object for the attribute '{@link AppliCitoyenne.simuV1.POI#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see AppliCitoyenne.simuV1.POI#getX()
	 * @see #getPOI()
	 * @generated
	 */
	EAttribute getPOI_X();

	/**
	 * Returns the meta object for class '{@link AppliCitoyenne.simuV1.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see AppliCitoyenne.simuV1.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the reference '{@link AppliCitoyenne.simuV1.Activity#getInventoryobjective <em>Inventoryobjective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inventoryobjective</em>'.
	 * @see AppliCitoyenne.simuV1.Activity#getInventoryobjective()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Inventoryobjective();

	/**
	 * Returns the meta object for the reference '{@link AppliCitoyenne.simuV1.Activity#getLearningobjective <em>Learningobjective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Learningobjective</em>'.
	 * @see AppliCitoyenne.simuV1.Activity#getLearningobjective()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Learningobjective();

	/**
	 * Returns the meta object for the reference '{@link AppliCitoyenne.simuV1.Activity#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Profile</em>'.
	 * @see AppliCitoyenne.simuV1.Activity#getProfile()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Profile();

	/**
	 * Returns the meta object for the reference '{@link AppliCitoyenne.simuV1.Activity#getGameobjective <em>Gameobjective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gameobjective</em>'.
	 * @see AppliCitoyenne.simuV1.Activity#getGameobjective()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Gameobjective();

	/**
	 * Returns the meta object for class '{@link AppliCitoyenne.simuV1.BotanicalFlore <em>Botanical Flore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Botanical Flore</em>'.
	 * @see AppliCitoyenne.simuV1.BotanicalFlore
	 * @generated
	 */
	EClass getBotanicalFlore();

	/**
	 * Returns the meta object for the containment reference list '{@link AppliCitoyenne.simuV1.BotanicalFlore#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Family</em>'.
	 * @see AppliCitoyenne.simuV1.BotanicalFlore#getFamily()
	 * @see #getBotanicalFlore()
	 * @generated
	 */
	EReference getBotanicalFlore_Family();

	/**
	 * Returns the meta object for class '{@link AppliCitoyenne.simuV1.Objectives <em>Objectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objectives</em>'.
	 * @see AppliCitoyenne.simuV1.Objectives
	 * @generated
	 */
	EClass getObjectives();

	/**
	 * Returns the meta object for the containment reference list '{@link AppliCitoyenne.simuV1.Objectives#getLearningobjective <em>Learningobjective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Learningobjective</em>'.
	 * @see AppliCitoyenne.simuV1.Objectives#getLearningobjective()
	 * @see #getObjectives()
	 * @generated
	 */
	EReference getObjectives_Learningobjective();

	/**
	 * Returns the meta object for the containment reference list '{@link AppliCitoyenne.simuV1.Objectives#getInventoryobjective <em>Inventoryobjective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inventoryobjective</em>'.
	 * @see AppliCitoyenne.simuV1.Objectives#getInventoryobjective()
	 * @see #getObjectives()
	 * @generated
	 */
	EReference getObjectives_Inventoryobjective();

	/**
	 * Returns the meta object for the containment reference list '{@link AppliCitoyenne.simuV1.Objectives#getGameobjective <em>Gameobjective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gameobjective</em>'.
	 * @see AppliCitoyenne.simuV1.Objectives#getGameobjective()
	 * @see #getObjectives()
	 * @generated
	 */
	EReference getObjectives_Gameobjective();

	/**
	 * Returns the meta object for class '{@link AppliCitoyenne.simuV1.Species <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Species</em>'.
	 * @see AppliCitoyenne.simuV1.Species
	 * @generated
	 */
	EClass getSpecies();

	/**
	 * Returns the meta object for the attribute '{@link AppliCitoyenne.simuV1.Species#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AppliCitoyenne.simuV1.Species#getName()
	 * @see #getSpecies()
	 * @generated
	 */
	EAttribute getSpecies_Name();

	/**
	 * Returns the meta object for class '{@link AppliCitoyenne.simuV1.Gender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gender</em>'.
	 * @see AppliCitoyenne.simuV1.Gender
	 * @generated
	 */
	EClass getGender();

	/**
	 * Returns the meta object for the attribute '{@link AppliCitoyenne.simuV1.Gender#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AppliCitoyenne.simuV1.Gender#getName()
	 * @see #getGender()
	 * @generated
	 */
	EAttribute getGender_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link AppliCitoyenne.simuV1.Gender#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Species</em>'.
	 * @see AppliCitoyenne.simuV1.Gender#getSpecies()
	 * @see #getGender()
	 * @generated
	 */
	EReference getGender_Species();

	/**
	 * Returns the meta object for class '{@link AppliCitoyenne.simuV1.Family <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Family</em>'.
	 * @see AppliCitoyenne.simuV1.Family
	 * @generated
	 */
	EClass getFamily();

	/**
	 * Returns the meta object for the attribute '{@link AppliCitoyenne.simuV1.Family#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AppliCitoyenne.simuV1.Family#getName()
	 * @see #getFamily()
	 * @generated
	 */
	EAttribute getFamily_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link AppliCitoyenne.simuV1.Family#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gender</em>'.
	 * @see AppliCitoyenne.simuV1.Family#getGender()
	 * @see #getFamily()
	 * @generated
	 */
	EReference getFamily_Gender();

	/**
	 * Returns the meta object for class '{@link AppliCitoyenne.simuV1.Target <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target</em>'.
	 * @see AppliCitoyenne.simuV1.Target
	 * @generated
	 */
	EClass getTarget();

	/**
	 * Returns the meta object for class '{@link AppliCitoyenne.simuV1.GameObjective <em>Game Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Objective</em>'.
	 * @see AppliCitoyenne.simuV1.GameObjective
	 * @generated
	 */
	EClass getGameObjective();

	/**
	 * Returns the meta object for class '{@link AppliCitoyenne.simuV1.BotanicalStat <em>Botanical Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Botanical Stat</em>'.
	 * @see AppliCitoyenne.simuV1.BotanicalStat
	 * @generated
	 */
	EClass getBotanicalStat();

	/**
	 * Returns the meta object for the attribute '{@link AppliCitoyenne.simuV1.BotanicalStat#getDirectIdentification <em>Direct Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direct Identification</em>'.
	 * @see AppliCitoyenne.simuV1.BotanicalStat#getDirectIdentification()
	 * @see #getBotanicalStat()
	 * @generated
	 */
	EAttribute getBotanicalStat_DirectIdentification();

	/**
	 * Returns the meta object for the reference '{@link AppliCitoyenne.simuV1.BotanicalStat#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see AppliCitoyenne.simuV1.BotanicalStat#getTarget()
	 * @see #getBotanicalStat()
	 * @generated
	 */
	EReference getBotanicalStat_Target();

	/**
	 * Returns the meta object for class '{@link AppliCitoyenne.simuV1.GameTypePref <em>Game Type Pref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Type Pref</em>'.
	 * @see AppliCitoyenne.simuV1.GameTypePref
	 * @generated
	 */
	EClass getGameTypePref();

	/**
	 * Returns the meta object for the attribute '{@link AppliCitoyenne.simuV1.GameTypePref#getPonderation <em>Ponderation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ponderation</em>'.
	 * @see AppliCitoyenne.simuV1.GameTypePref#getPonderation()
	 * @see #getGameTypePref()
	 * @generated
	 */
	EAttribute getGameTypePref_Ponderation();

	/**
	 * Returns the meta object for the reference '{@link AppliCitoyenne.simuV1.GameTypePref#getGameobjective <em>Gameobjective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gameobjective</em>'.
	 * @see AppliCitoyenne.simuV1.GameTypePref#getGameobjective()
	 * @see #getGameTypePref()
	 * @generated
	 */
	EReference getGameTypePref_Gameobjective();

	/**
	 * Returns the meta object for class '{@link AppliCitoyenne.simuV1.Objective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objective</em>'.
	 * @see AppliCitoyenne.simuV1.Objective
	 * @generated
	 */
	EClass getObjective();

	/**
	 * Returns the meta object for the reference list '{@link AppliCitoyenne.simuV1.Objective#getIncompatibleObjectives <em>Incompatible Objectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incompatible Objectives</em>'.
	 * @see AppliCitoyenne.simuV1.Objective#getIncompatibleObjectives()
	 * @see #getObjective()
	 * @generated
	 */
	EReference getObjective_IncompatibleObjectives();

	/**
	 * Returns the meta object for the attribute '{@link AppliCitoyenne.simuV1.Objective#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AppliCitoyenne.simuV1.Objective#getName()
	 * @see #getObjective()
	 * @generated
	 */
	EAttribute getObjective_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimuV1Factory getSimuV1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link AppliCitoyenne.simuV1.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AppliCitoyenne.simuV1.impl.ContextImpl
		 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Zone</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__ZONE = eINSTANCE.getContext_Zone();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__PROFILE = eINSTANCE.getContext_Profile();

		/**
		 * The meta object literal for the '{@link AppliCitoyenne.simuV1.impl.AppDescImpl <em>App Desc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AppliCitoyenne.simuV1.impl.AppDescImpl
		 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getAppDesc()
		 * @generated
		 */
		EClass APP_DESC = eINSTANCE.getAppDesc();

		/**
		 * The meta object literal for the '<em><b>Objective</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_DESC__OBJECTIVE = eINSTANCE.getAppDesc_Objective();

		/**
		 * The meta object literal for the '<em><b>Botanicalflore</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_DESC__BOTANICALFLORE = eINSTANCE.getAppDesc_Botanicalflore();

		/**
		 * The meta object literal for the '{@link AppliCitoyenne.simuV1.impl.InventoryObjectiveImpl <em>Inventory Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AppliCitoyenne.simuV1.impl.InventoryObjectiveImpl
		 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getInventoryObjective()
		 * @generated
		 */
		EClass INVENTORY_OBJECTIVE = eINSTANCE.getInventoryObjective();

		/**
		 * The meta object literal for the '{@link AppliCitoyenne.simuV1.impl.LearningObjectiveImpl <em>Learning Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AppliCitoyenne.simuV1.impl.LearningObjectiveImpl
		 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getLearningObjective()
		 * @generated
		 */
		EClass LEARNING_OBJECTIVE = eINSTANCE.getLearningObjective();

		/**
		 * The meta object literal for the '{@link AppliCitoyenne.simuV1.impl.ZoneImpl <em>Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AppliCitoyenne.simuV1.impl.ZoneImpl
		 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getZone()
		 * @generated
		 */
		EClass ZONE = eINSTANCE.getZone();

		/**
		 * The meta object literal for the '{@link AppliCitoyenne.simuV1.impl.ZoneCirculaireImpl <em>Zone Circulaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AppliCitoyenne.simuV1.impl.ZoneCirculaireImpl
		 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getZoneCirculaire()
		 * @generated
		 */
		EClass ZONE_CIRCULAIRE = eINSTANCE.getZoneCirculaire();

		/**
		 * The meta object literal for the '<em><b>Rayon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONE_CIRCULAIRE__RAYON = eINSTANCE.getZoneCirculaire_Rayon();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONE_CIRCULAIRE__X = eINSTANCE.getZoneCirculaire_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONE_CIRCULAIRE__Y = eINSTANCE.getZoneCirculaire_Y();

		/**
		 * The meta object literal for the '{@link AppliCitoyenne.simuV1.impl.ProfileImpl <em>Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AppliCitoyenne.simuV1.impl.ProfileImpl
		 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getProfile()
		 * @generated
		 */
		EClass PROFILE = eINSTANCE.getProfile();

		/**
		 * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFILE__FIRSTNAME = eINSTANCE.getProfile_Firstname();

		/**
		 * The meta object literal for the '<em><b>Lastname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROFILE__LASTNAME = eINSTANCE.getProfile_Lastname();

		/**
		 * The meta object literal for the '<em><b>Inventoryprofile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__INVENTORYPROFILE = eINSTANCE.getProfile_Inventoryprofile();

		/**
		 * The meta object literal for the '<em><b>Botanicalprofile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__BOTANICALPROFILE = eINSTANCE.getProfile_Botanicalprofile();

		/**
		 * The meta object literal for the '<em><b>Gameprofile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__GAMEPROFILE = eINSTANCE.getProfile_Gameprofile();

		/**
		 * The meta object literal for the '<em><b>Botanicalsurvey</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROFILE__BOTANICALSURVEY = eINSTANCE.getProfile_Botanicalsurvey();

		/**
		 * The meta object literal for the '{@link AppliCitoyenne.simuV1.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AppliCitoyenne.simuV1.impl.DataImpl
		 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Profiles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__PROFILES = eINSTANCE.getData_Profiles();

		/**
		 * The meta object literal for the '<em><b>Botanicalsurveys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__BOTANICALSURVEYS = eINSTANCE.getData_Botanicalsurveys();

		/**
		 * The meta object literal for the '{@link AppliCitoyenne.simuV1.impl.InventoryProfileImpl <em>Inventory Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AppliCitoyenne.simuV1.impl.InventoryProfileImpl
		 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getInventoryProfile()
		 * @generated
		 */
		EClass INVENTORY_PROFILE = eINSTANCE.getInventoryProfile();

		/**
		 * The meta object literal for the '{@link AppliCitoyenne.simuV1.impl.BotanicalProfileImpl <em>Botanical Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AppliCitoyenne.simuV1.impl.BotanicalProfileImpl
		 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getBotanicalProfile()
		 * @generated
		 */
		EClass BOTANICAL_PROFILE = eINSTANCE.getBotanicalProfile();

		/**
		 * The meta object literal for the '<em><b>Botanicalstat</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOTANICAL_PROFILE__BOTANICALSTAT = eINSTANCE.getBotanicalProfile_Botanicalstat();

		/**
		 * The meta object literal for the '<em><b>No Interest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOTANICAL_PROFILE__NO_INTEREST = eINSTANCE.getBotanicalProfile_NoInterest();

		/**
		 * The meta object literal for the '{@link AppliCitoyenne.simuV1.impl.GameProfileImpl <em>Game Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AppliCitoyenne.simuV1.impl.GameProfileImpl
		 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getGameProfile()
		 * @generated
		 */
		EClass GAME_PROFILE = eINSTANCE.getGameProfile();

		/**
		 * The meta object literal for the '<em><b>Gametypepref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_PROFILE__GAMETYPEPREF = eINSTANCE.getGameProfile_Gametypepref();

		/**
		 * The meta object literal for the '<em><b>No Interest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_PROFILE__NO_INTEREST = eINSTANCE.getGameProfile_NoInterest();

		/**
		 * The meta object literal for the '{@link AppliCitoyenne.simuV1.impl.BotanicalSurveyImpl <em>Botanical Survey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AppliCitoyenne.simuV1.impl.BotanicalSurveyImpl
		 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getBotanicalSurvey()
		 * @generated
		 */
		EClass BOTANICAL_SURVEY = eINSTANCE.getBotanicalSurvey();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOTANICAL_SURVEY__PROFILE = eINSTANCE.getBotanicalSurvey_Profile();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOTANICAL_SURVEY__DATE = eINSTANCE.getBotanicalSurvey_Date();

		/**
		 * The meta object literal for the '<em><b>Poi</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOTANICAL_SURVEY__POI = eINSTANCE.getBotanicalSurvey_Poi();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOTANICAL_SURVEY__TARGET = eINSTANCE.getBotanicalSurvey_Target();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOTANICAL_SURVEY__ID = eINSTANCE.getBotanicalSurvey_Id();

		/**
		 * The meta object literal for the '<em><b>Reliability Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOTANICAL_SURVEY__RELIABILITY_SCORE = eINSTANCE.getBotanicalSurvey_ReliabilityScore();

		/**
		 * The meta object literal for the '{@link AppliCitoyenne.simuV1.impl.BasicSurveyImpl <em>Basic Survey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AppliCitoyenne.simuV1.impl.BasicSurveyImpl
		 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getBasicSurvey()
		 * @generated
		 */
		EClass BASIC_SURVEY = eINSTANCE.getBasicSurvey();

		/**
		 * The meta object literal for the '<em><b>Confirmationsurvey</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_SURVEY__CONFIRMATIONSURVEY = eINSTANCE.getBasicSurvey_Confirmationsurvey();

		/**
		 * The meta object literal for the '<em><b>Additionalsurvey</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_SURVEY__ADDITIONALSURVEY = eINSTANCE.getBasicSurvey_Additionalsurvey();

		/**
		 * The meta object literal for the '{@link AppliCitoyenne.simuV1.impl.ConfirmationSurveyImpl <em>Confirmation Survey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AppliCitoyenne.simuV1.impl.ConfirmationSurveyImpl
		 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getConfirmationSurvey()
		 * @generated
		 */
		EClass CONFIRMATION_SURVEY = eINSTANCE.getConfirmationSurvey();

		/**
		 * The meta object literal for the '<em><b>Basicsurvey</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIRMATION_SURVEY__BASICSURVEY = eINSTANCE.getConfirmationSurvey_Basicsurvey();

		/**
		 * The meta object literal for the '{@link AppliCitoyenne.simuV1.impl.AdditionalSurveyImpl <em>Additional Survey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AppliCitoyenne.simuV1.impl.AdditionalSurveyImpl
		 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getAdditionalSurvey()
		 * @generated
		 */
		EClass ADDITIONAL_SURVEY = eINSTANCE.getAdditionalSurvey();

		/**
		 * The meta object literal for the '<em><b>Basicsurvey</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_SURVEY__BASICSURVEY = eINSTANCE.getAdditionalSurvey_Basicsurvey();

		/**
		 * The meta object literal for the '{@link AppliCitoyenne.simuV1.impl.POIImpl <em>POI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AppliCitoyenne.simuV1.impl.POIImpl
		 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getPOI()
		 * @generated
		 */
		EClass POI = eINSTANCE.getPOI();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POI__Y = eINSTANCE.getPOI_Y();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POI__X = eINSTANCE.getPOI_X();

		/**
		 * The meta object literal for the '{@link AppliCitoyenne.simuV1.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AppliCitoyenne.simuV1.impl.ActivityImpl
		 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Inventoryobjective</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__INVENTORYOBJECTIVE = eINSTANCE.getActivity_Inventoryobjective();

		/**
		 * The meta object literal for the '<em><b>Learningobjective</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__LEARNINGOBJECTIVE = eINSTANCE.getActivity_Learningobjective();

		/**
		 * The meta object literal for the '<em><b>Profile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__PROFILE = eINSTANCE.getActivity_Profile();

		/**
		 * The meta object literal for the '<em><b>Gameobjective</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__GAMEOBJECTIVE = eINSTANCE.getActivity_Gameobjective();

		/**
		 * The meta object literal for the '{@link AppliCitoyenne.simuV1.impl.BotanicalFloreImpl <em>Botanical Flore</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AppliCitoyenne.simuV1.impl.BotanicalFloreImpl
		 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getBotanicalFlore()
		 * @generated
		 */
		EClass BOTANICAL_FLORE = eINSTANCE.getBotanicalFlore();

		/**
		 * The meta object literal for the '<em><b>Family</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOTANICAL_FLORE__FAMILY = eINSTANCE.getBotanicalFlore_Family();

		/**
		 * The meta object literal for the '{@link AppliCitoyenne.simuV1.impl.ObjectivesImpl <em>Objectives</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AppliCitoyenne.simuV1.impl.ObjectivesImpl
		 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getObjectives()
		 * @generated
		 */
		EClass OBJECTIVES = eINSTANCE.getObjectives();

		/**
		 * The meta object literal for the '<em><b>Learningobjective</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECTIVES__LEARNINGOBJECTIVE = eINSTANCE.getObjectives_Learningobjective();

		/**
		 * The meta object literal for the '<em><b>Inventoryobjective</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECTIVES__INVENTORYOBJECTIVE = eINSTANCE.getObjectives_Inventoryobjective();

		/**
		 * The meta object literal for the '<em><b>Gameobjective</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECTIVES__GAMEOBJECTIVE = eINSTANCE.getObjectives_Gameobjective();

		/**
		 * The meta object literal for the '{@link AppliCitoyenne.simuV1.impl.SpeciesImpl <em>Species</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AppliCitoyenne.simuV1.impl.SpeciesImpl
		 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getSpecies()
		 * @generated
		 */
		EClass SPECIES = eINSTANCE.getSpecies();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIES__NAME = eINSTANCE.getSpecies_Name();

		/**
		 * The meta object literal for the '{@link AppliCitoyenne.simuV1.impl.GenderImpl <em>Gender</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AppliCitoyenne.simuV1.impl.GenderImpl
		 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getGender()
		 * @generated
		 */
		EClass GENDER = eINSTANCE.getGender();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENDER__NAME = eINSTANCE.getGender_Name();

		/**
		 * The meta object literal for the '<em><b>Species</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENDER__SPECIES = eINSTANCE.getGender_Species();

		/**
		 * The meta object literal for the '{@link AppliCitoyenne.simuV1.impl.FamilyImpl <em>Family</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AppliCitoyenne.simuV1.impl.FamilyImpl
		 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getFamily()
		 * @generated
		 */
		EClass FAMILY = eINSTANCE.getFamily();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAMILY__NAME = eINSTANCE.getFamily_Name();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILY__GENDER = eINSTANCE.getFamily_Gender();

		/**
		 * The meta object literal for the '{@link AppliCitoyenne.simuV1.impl.TargetImpl <em>Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AppliCitoyenne.simuV1.impl.TargetImpl
		 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getTarget()
		 * @generated
		 */
		EClass TARGET = eINSTANCE.getTarget();

		/**
		 * The meta object literal for the '{@link AppliCitoyenne.simuV1.impl.GameObjectiveImpl <em>Game Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AppliCitoyenne.simuV1.impl.GameObjectiveImpl
		 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getGameObjective()
		 * @generated
		 */
		EClass GAME_OBJECTIVE = eINSTANCE.getGameObjective();

		/**
		 * The meta object literal for the '{@link AppliCitoyenne.simuV1.impl.BotanicalStatImpl <em>Botanical Stat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AppliCitoyenne.simuV1.impl.BotanicalStatImpl
		 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getBotanicalStat()
		 * @generated
		 */
		EClass BOTANICAL_STAT = eINSTANCE.getBotanicalStat();

		/**
		 * The meta object literal for the '<em><b>Direct Identification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOTANICAL_STAT__DIRECT_IDENTIFICATION = eINSTANCE.getBotanicalStat_DirectIdentification();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOTANICAL_STAT__TARGET = eINSTANCE.getBotanicalStat_Target();

		/**
		 * The meta object literal for the '{@link AppliCitoyenne.simuV1.impl.GameTypePrefImpl <em>Game Type Pref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AppliCitoyenne.simuV1.impl.GameTypePrefImpl
		 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getGameTypePref()
		 * @generated
		 */
		EClass GAME_TYPE_PREF = eINSTANCE.getGameTypePref();

		/**
		 * The meta object literal for the '<em><b>Ponderation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_TYPE_PREF__PONDERATION = eINSTANCE.getGameTypePref_Ponderation();

		/**
		 * The meta object literal for the '<em><b>Gameobjective</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_TYPE_PREF__GAMEOBJECTIVE = eINSTANCE.getGameTypePref_Gameobjective();

		/**
		 * The meta object literal for the '{@link AppliCitoyenne.simuV1.impl.ObjectiveImpl <em>Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AppliCitoyenne.simuV1.impl.ObjectiveImpl
		 * @see AppliCitoyenne.simuV1.impl.SimuV1PackageImpl#getObjective()
		 * @generated
		 */
		EClass OBJECTIVE = eINSTANCE.getObjective();

		/**
		 * The meta object literal for the '<em><b>Incompatible Objectives</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECTIVE__INCOMPATIBLE_OBJECTIVES = eINSTANCE.getObjective_IncompatibleObjectives();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECTIVE__NAME = eINSTANCE.getObjective_Name();

	}

} //SimuV1Package
