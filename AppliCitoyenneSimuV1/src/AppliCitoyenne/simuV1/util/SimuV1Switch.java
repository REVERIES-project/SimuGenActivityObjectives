/**
 */
package AppliCitoyenne.simuV1.util;

import AppliCitoyenne.simuV1.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
public class SimuV1Switch {
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
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SimuV1Package.CONTEXT: {
				Context context = (Context)theEObject;
				Object result = caseContext(context);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.APP_DESC: {
				AppDesc appDesc = (AppDesc)theEObject;
				Object result = caseAppDesc(appDesc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.INVENTORY_OBJECTIVE: {
				InventoryObjective inventoryObjective = (InventoryObjective)theEObject;
				Object result = caseInventoryObjective(inventoryObjective);
				if (result == null) result = caseObjective(inventoryObjective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.LEARNING_OBJECTIVE: {
				LearningObjective learningObjective = (LearningObjective)theEObject;
				Object result = caseLearningObjective(learningObjective);
				if (result == null) result = caseObjective(learningObjective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.ZONE: {
				Zone zone = (Zone)theEObject;
				Object result = caseZone(zone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.ZONE_CIRCULAIRE: {
				ZoneCirculaire zoneCirculaire = (ZoneCirculaire)theEObject;
				Object result = caseZoneCirculaire(zoneCirculaire);
				if (result == null) result = caseZone(zoneCirculaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.PROFILE: {
				Profile profile = (Profile)theEObject;
				Object result = caseProfile(profile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.DATA: {
				Data data = (Data)theEObject;
				Object result = caseData(data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.INVENTORY_PROFILE: {
				InventoryProfile inventoryProfile = (InventoryProfile)theEObject;
				Object result = caseInventoryProfile(inventoryProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.BOTANICAL_PROFILE: {
				BotanicalProfile botanicalProfile = (BotanicalProfile)theEObject;
				Object result = caseBotanicalProfile(botanicalProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.GAME_PROFILE: {
				GameProfile gameProfile = (GameProfile)theEObject;
				Object result = caseGameProfile(gameProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.BOTANICAL_SURVEY: {
				BotanicalSurvey botanicalSurvey = (BotanicalSurvey)theEObject;
				Object result = caseBotanicalSurvey(botanicalSurvey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.BASIC_SURVEY: {
				BasicSurvey basicSurvey = (BasicSurvey)theEObject;
				Object result = caseBasicSurvey(basicSurvey);
				if (result == null) result = caseBotanicalSurvey(basicSurvey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.CONFIRMATION_SURVEY: {
				ConfirmationSurvey confirmationSurvey = (ConfirmationSurvey)theEObject;
				Object result = caseConfirmationSurvey(confirmationSurvey);
				if (result == null) result = caseBotanicalSurvey(confirmationSurvey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.ADDITIONAL_SURVEY: {
				AdditionalSurvey additionalSurvey = (AdditionalSurvey)theEObject;
				Object result = caseAdditionalSurvey(additionalSurvey);
				if (result == null) result = caseBotanicalSurvey(additionalSurvey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.POI: {
				POI poi = (POI)theEObject;
				Object result = casePOI(poi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				Object result = caseActivity(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.BOTANICAL_FLORE: {
				BotanicalFlore botanicalFlore = (BotanicalFlore)theEObject;
				Object result = caseBotanicalFlore(botanicalFlore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.OBJECTIVES: {
				Objectives objectives = (Objectives)theEObject;
				Object result = caseObjectives(objectives);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.SPECIES: {
				Species species = (Species)theEObject;
				Object result = caseSpecies(species);
				if (result == null) result = caseTarget(species);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.GENDER: {
				Gender gender = (Gender)theEObject;
				Object result = caseGender(gender);
				if (result == null) result = caseTarget(gender);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.FAMILY: {
				Family family = (Family)theEObject;
				Object result = caseFamily(family);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.TARGET: {
				Target target = (Target)theEObject;
				Object result = caseTarget(target);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.GAME_OBJECTIVE: {
				GameObjective gameObjective = (GameObjective)theEObject;
				Object result = caseGameObjective(gameObjective);
				if (result == null) result = caseObjective(gameObjective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.BOTANICAL_STAT: {
				BotanicalStat botanicalStat = (BotanicalStat)theEObject;
				Object result = caseBotanicalStat(botanicalStat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.GAME_TYPE_PREF: {
				GameTypePref gameTypePref = (GameTypePref)theEObject;
				Object result = caseGameTypePref(gameTypePref);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimuV1Package.OBJECTIVE: {
				Objective objective = (Objective)theEObject;
				Object result = caseObjective(objective);
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
	public Object caseContext(Context object) {
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
	public Object caseAppDesc(AppDesc object) {
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
	public Object caseInventoryObjective(InventoryObjective object) {
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
	public Object caseLearningObjective(LearningObjective object) {
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
	public Object caseZone(Zone object) {
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
	public Object caseZoneCirculaire(ZoneCirculaire object) {
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
	public Object caseProfile(Profile object) {
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
	public Object caseData(Data object) {
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
	public Object caseInventoryProfile(InventoryProfile object) {
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
	public Object caseBotanicalProfile(BotanicalProfile object) {
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
	public Object caseGameProfile(GameProfile object) {
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
	public Object caseBotanicalSurvey(BotanicalSurvey object) {
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
	public Object caseBasicSurvey(BasicSurvey object) {
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
	public Object caseConfirmationSurvey(ConfirmationSurvey object) {
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
	public Object caseAdditionalSurvey(AdditionalSurvey object) {
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
	public Object casePOI(POI object) {
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
	public Object caseActivity(Activity object) {
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
	public Object caseBotanicalFlore(BotanicalFlore object) {
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
	public Object caseObjectives(Objectives object) {
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
	public Object caseSpecies(Species object) {
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
	public Object caseGender(Gender object) {
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
	public Object caseFamily(Family object) {
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
	public Object caseTarget(Target object) {
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
	public Object caseGameObjective(GameObjective object) {
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
	public Object caseBotanicalStat(BotanicalStat object) {
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
	public Object caseGameTypePref(GameTypePref object) {
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
	public Object caseObjective(Objective object) {
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
	public Object defaultCase(EObject object) {
		return null;
	}

} //SimuV1Switch
