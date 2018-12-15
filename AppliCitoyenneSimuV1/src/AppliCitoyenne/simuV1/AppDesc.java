/**
 */
package AppliCitoyenne.simuV1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App Desc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.AppDesc#getObjective <em>Objective</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.AppDesc#getBotanicalflore <em>Botanicalflore</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.AppDesc#getGametypes <em>Gametypes</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.AppDesc#getActions2detect <em>Actions2detect</em>}</li>
 * </ul>
 *
 * @see AppliCitoyenne.simuV1.SimuV1Package#getAppDesc()
 * @model annotation="exeed classIcon='emfmodel'"
 * @generated
 */
public interface AppDesc extends EObject {
	/**
	 * Returns the value of the '<em><b>Objective</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objective</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objective</em>' containment reference.
	 * @see #setObjective(Objectives)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getAppDesc_Objective()
	 * @model containment="true"
	 * @generated
	 */
	Objectives getObjective();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.AppDesc#getObjective <em>Objective</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective</em>' containment reference.
	 * @see #getObjective()
	 * @generated
	 */
	void setObjective(Objectives value);

	/**
	 * Returns the value of the '<em><b>Botanicalflore</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Botanicalflore</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Botanicalflore</em>' containment reference.
	 * @see #setBotanicalflore(BotanicalFlore)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getAppDesc_Botanicalflore()
	 * @model containment="true"
	 * @generated
	 */
	BotanicalFlore getBotanicalflore();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.AppDesc#getBotanicalflore <em>Botanicalflore</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Botanicalflore</em>' containment reference.
	 * @see #getBotanicalflore()
	 * @generated
	 */
	void setBotanicalflore(BotanicalFlore value);

	/**
	 * Returns the value of the '<em><b>Gametypes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gametypes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gametypes</em>' containment reference.
	 * @see #setGametypes(GameTypes)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getAppDesc_Gametypes()
	 * @model containment="true"
	 * @generated
	 */
	GameTypes getGametypes();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.AppDesc#getGametypes <em>Gametypes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gametypes</em>' containment reference.
	 * @see #getGametypes()
	 * @generated
	 */
	void setGametypes(GameTypes value);

	/**
	 * Returns the value of the '<em><b>Actions2detect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions2detect</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions2detect</em>' containment reference.
	 * @see #setActions2detect(Actions2Detect)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getAppDesc_Actions2detect()
	 * @model containment="true"
	 * @generated
	 */
	Actions2Detect getActions2detect();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.AppDesc#getActions2detect <em>Actions2detect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actions2detect</em>' containment reference.
	 * @see #getActions2detect()
	 * @generated
	 */
	void setActions2detect(Actions2Detect value);

} // AppDesc
