/**
 */
package AppliCitoyenne.simuV1.util;

import AppliCitoyenne.simuV1.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see AppliCitoyenne.simuV1.SimuV1Package
 * @generated
 */
public class SimuV1Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimuV1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimuV1Switch() {
		if (modelPackage == null) {
			modelPackage = SimuV1Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SimuV1Package.CONTEXT: {
				Context context = (Context)theEObject;
				T result = caseContext(context);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.APP_DESC: {
				AppDesc appDesc = (AppDesc)theEObject;
				T result = caseAppDesc(appDesc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.INVENTORY_OBJECTIVE: {
				InventoryObjective inventoryObjective = (InventoryObjective)theEObject;
				T result = caseInventoryObjective(inventoryObjective);
				if (result == null) result = caseObjective(inventoryObjective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.LEARNING_OBJECTIVE: {
				LearningObjective learningObjective = (LearningObjective)theEObject;
				T result = caseLearningObjective(learningObjective);
				if (result == null) result = caseObjective(learningObjective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.ZONE: {
				Zone zone = (Zone)theEObject;
				T result = caseZone(zone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.ZONE_CIRCULAIRE: {
				ZoneCirculaire zoneCirculaire = (ZoneCirculaire)theEObject;
				T result = caseZoneCirculaire(zoneCirculaire);
				if (result == null) result = caseZone(zoneCirculaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.PROFILE: {
				Profile profile = (Profile)theEObject;
				T result = caseProfile(profile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.DATA: {
				Data data = (Data)theEObject;
				T result = caseData(data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.INVENTORY_PROFILE: {
				InventoryProfile inventoryProfile = (InventoryProfile)theEObject;
				T result = caseInventoryProfile(inventoryProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.BOTANICAL_PROFILE: {
				BotanicalProfile botanicalProfile = (BotanicalProfile)theEObject;
				T result = caseBotanicalProfile(botanicalProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.GAME_PROFILE: {
				GameProfile gameProfile = (GameProfile)theEObject;
				T result = caseGameProfile(gameProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.BOTANICAL_SURVEY: {
				BotanicalSurvey botanicalSurvey = (BotanicalSurvey)theEObject;
				T result = caseBotanicalSurvey(botanicalSurvey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.BASIC_SURVEY: {
				BasicSurvey basicSurvey = (BasicSurvey)theEObject;
				T result = caseBasicSurvey(basicSurvey);
				if (result == null) result = caseBotanicalSurvey(basicSurvey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.CONFIRMATION_SURVEY: {
				ConfirmationSurvey confirmationSurvey = (ConfirmationSurvey)theEObject;
				T result = caseConfirmationSurvey(confirmationSurvey);
				if (result == null) result = caseBotanicalSurvey(confirmationSurvey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.ADDITIONAL_SURVEY: {
				AdditionalSurvey additionalSurvey = (AdditionalSurvey)theEObject;
				T result = caseAdditionalSurvey(additionalSurvey);
				if (result == null) result = caseBotanicalSurvey(additionalSurvey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.POI: {
				POI poi = (POI)theEObject;
				T result = casePOI(poi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.BOTANICAL_FLORE: {
				BotanicalFlore botanicalFlore = (BotanicalFlore)theEObject;
				T result = caseBotanicalFlore(botanicalFlore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.OBJECTIVES: {
				Objectives objectives = (Objectives)theEObject;
				T result = caseObjectives(objectives);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.SPECIES: {
				Species species = (Species)theEObject;
				T result = caseSpecies(species);
				if (result == null) result = caseTarget(species);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.GENDER: {
				Gender gender = (Gender)theEObject;
				T result = caseGender(gender);
				if (result == null) result = caseTarget(gender);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.FAMILY: {
				Family family = (Family)theEObject;
				T result = caseFamily(family);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.TARGET: {
				Target target = (Target)theEObject;
				T result = caseTarget(target);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.GAME_OBJECTIVE: {
				GameObjective gameObjective = (GameObjective)theEObject;
				T result = caseGameObjective(gameObjective);
				if (result == null) result = caseObjective(gameObjective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.BOTANICAL_STAT: {
				BotanicalStat botanicalStat = (BotanicalStat)theEObject;
				T result = caseBotanicalStat(botanicalStat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.GAME_TYPE_PREF: {
				GameTypePref gameTypePref = (GameTypePref)theEObject;
				T result = caseGameTypePref(gameTypePref);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.OBJECTIVE: {
				Objective objective = (Objective)theEObject;
				T result = caseObjective(objective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.GAME_TYPE: {
				GameType gameType = (GameType)theEObject;
				T result = caseGameType(gameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.ACTION2_DETECT: {
				Action2Detect action2Detect = (Action2Detect)theEObject;
				T result = caseAction2Detect(action2Detect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.GAME_TYPE_COMP: {
				GameTypeComp gameTypeComp = (GameTypeComp)theEObject;
				T result = caseGameTypeComp(gameTypeComp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.STRUCTURED_TASK: {
				StructuredTask structuredTask = (StructuredTask)theEObject;
				T result = caseStructuredTask(structuredTask);
				if (result == null) result = caseTask(structuredTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.SIMPLE_TASK: {
				SimpleTask simpleTask = (SimpleTask)theEObject;
				T result = caseSimpleTask(simpleTask);
				if (result == null) result = caseTask(simpleTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.RECURRENT_TASK: {
				RecurrentTask recurrentTask = (RecurrentTask)theEObject;
				T result = caseRecurrentTask(recurrentTask);
				if (result == null) result = caseStructuredTask(recurrentTask);
				if (result == null) result = caseTask(recurrentTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.GAME_TYPES: {
				GameTypes gameTypes = (GameTypes)theEObject;
				T result = caseGameTypes(gameTypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.ACTIONS2_DETECT: {
				Actions2Detect actions2Detect = (Actions2Detect)theEObject;
				T result = caseActions2Detect(actions2Detect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.TASK_COMP: {
				TaskComp taskComp = (TaskComp)theEObject;
				T result = caseTaskComp(taskComp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.BASIC_SURVEY_EXISTENCE: {
				BasicSurveyExistence basicSurveyExistence = (BasicSurveyExistence)theEObject;
				T result = caseBasicSurveyExistence(basicSurveyExistence);
				if (result == null) result = caseConstraint(basicSurveyExistence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.SIMPLE_SURVEY_EXISTENCE: {
				SimpleSurveyExistence simpleSurveyExistence = (SimpleSurveyExistence)theEObject;
				T result = caseSimpleSurveyExistence(simpleSurveyExistence);
				if (result == null) result = caseConstraint(simpleSurveyExistence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.RELIABLE_BASIC_SURVEY_EXISTENCE: {
				ReliableBasicSurveyExistence reliableBasicSurveyExistence = (ReliableBasicSurveyExistence)theEObject;
				T result = caseReliableBasicSurveyExistence(reliableBasicSurveyExistence);
				if (result == null) result = caseConstraint(reliableBasicSurveyExistence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContext(Context object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Desc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Desc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppDesc(AppDesc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inventory Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inventory Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInventoryObjective(InventoryObjective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Learning Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Learning Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLearningObjective(LearningObjective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZone(Zone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zone Circulaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zone Circulaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZoneCirculaire(ZoneCirculaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfile(Profile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inventory Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inventory Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInventoryProfile(InventoryProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Botanical Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Botanical Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBotanicalProfile(BotanicalProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameProfile(GameProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Botanical Survey</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Botanical Survey</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBotanicalSurvey(BotanicalSurvey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Survey</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Survey</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicSurvey(BasicSurvey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confirmation Survey</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confirmation Survey</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfirmationSurvey(ConfirmationSurvey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Survey</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Survey</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalSurvey(AdditionalSurvey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>POI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>POI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePOI(POI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Botanical Flore</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Botanical Flore</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBotanicalFlore(BotanicalFlore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objectives</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objectives</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectives(Objectives object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Species</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Species</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecies(Species object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gender</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gender</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGender(Gender object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamily(Family object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTarget(Target object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameObjective(GameObjective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Botanical Stat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Botanical Stat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBotanicalStat(BotanicalStat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game Type Pref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game Type Pref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameTypePref(GameTypePref object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjective(Objective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameType(GameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action2 Detect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action2 Detect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction2Detect(Action2Detect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game Type Comp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game Type Comp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameTypeComp(GameTypeComp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredTask(StructuredTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleTask(SimpleTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recurrent Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recurrent Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecurrentTask(RecurrentTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameTypes(GameTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actions2 Detect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actions2 Detect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActions2Detect(Actions2Detect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Comp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Comp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskComp(TaskComp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Survey Existence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Survey Existence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicSurveyExistence(BasicSurveyExistence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Survey Existence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Survey Existence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleSurveyExistence(SimpleSurveyExistence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reliable Basic Survey Existence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reliable Basic Survey Existence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReliableBasicSurveyExistence(ReliableBasicSurveyExistence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SimuV1Switch
