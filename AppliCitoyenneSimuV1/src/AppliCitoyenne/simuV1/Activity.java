/**
 */
package AppliCitoyenne.simuV1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.Activity#getInventoryobjective <em>Inventoryobjective</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.Activity#getLearningobjective <em>Learningobjective</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.Activity#getProfile <em>Profile</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.Activity#getGameobjective <em>Gameobjective</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.Activity#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.Activity#getGameZone <em>Game Zone</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.Activity#getGametypecomp <em>Gametypecomp</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.Activity#getGametype <em>Gametype</em>}</li>
 * </ul>
 *
 * @see AppliCitoyenne.simuV1.SimuV1Package#getActivity()
 * @model annotation="exeed icon='emfmodel'"
 * @generated
 */
public interface Activity extends EObject {
	/**
	 * Returns the value of the '<em><b>Inventoryobjective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventoryobjective</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventoryobjective</em>' reference.
	 * @see #setInventoryobjective(InventoryObjective)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getActivity_Inventoryobjective()
	 * @model
	 * @generated
	 */
	InventoryObjective getInventoryobjective();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.Activity#getInventoryobjective <em>Inventoryobjective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventoryobjective</em>' reference.
	 * @see #getInventoryobjective()
	 * @generated
	 */
	void setInventoryobjective(InventoryObjective value);

	/**
	 * Returns the value of the '<em><b>Learningobjective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Learningobjective</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Learningobjective</em>' reference.
	 * @see #setLearningobjective(LearningObjective)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getActivity_Learningobjective()
	 * @model
	 * @generated
	 */
	LearningObjective getLearningobjective();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.Activity#getLearningobjective <em>Learningobjective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Learningobjective</em>' reference.
	 * @see #getLearningobjective()
	 * @generated
	 */
	void setLearningobjective(LearningObjective value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile</em>' reference.
	 * @see #setProfile(Profile)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getActivity_Profile()
	 * @model
	 * @generated
	 */
	Profile getProfile();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.Activity#getProfile <em>Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' reference.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(Profile value);

	/**
	 * Returns the value of the '<em><b>Gameobjective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gameobjective</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gameobjective</em>' reference.
	 * @see #setGameobjective(GameObjective)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getActivity_Gameobjective()
	 * @model
	 * @generated
	 */
	GameObjective getGameobjective();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.Activity#getGameobjective <em>Gameobjective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gameobjective</em>' reference.
	 * @see #getGameobjective()
	 * @generated
	 */
	void setGameobjective(GameObjective value);

	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instruction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction</em>' attribute.
	 * @see #setInstruction(String)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getActivity_Instruction()
	 * @model
	 * @generated
	 */
	String getInstruction();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.Activity#getInstruction <em>Instruction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction</em>' attribute.
	 * @see #getInstruction()
	 * @generated
	 */
	void setInstruction(String value);

	/**
	 * Returns the value of the '<em><b>Game Zone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Game Zone</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Zone</em>' containment reference.
	 * @see #setGameZone(Zone)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getActivity_GameZone()
	 * @model containment="true"
	 * @generated
	 */
	Zone getGameZone();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.Activity#getGameZone <em>Game Zone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game Zone</em>' containment reference.
	 * @see #getGameZone()
	 * @generated
	 */
	void setGameZone(Zone value);

	/**
	 * Returns the value of the '<em><b>Gametypecomp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gametypecomp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gametypecomp</em>' containment reference.
	 * @see #setGametypecomp(GameTypeComp)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getActivity_Gametypecomp()
	 * @model containment="true"
	 * @generated
	 */
	GameTypeComp getGametypecomp();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.Activity#getGametypecomp <em>Gametypecomp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gametypecomp</em>' containment reference.
	 * @see #getGametypecomp()
	 * @generated
	 */
	void setGametypecomp(GameTypeComp value);

	/**
	 * Returns the value of the '<em><b>Gametype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gametype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gametype</em>' reference.
	 * @see #setGametype(GameType)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getActivity_Gametype()
	 * @model
	 * @generated
	 */
	GameType getGametype();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.Activity#getGametype <em>Gametype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gametype</em>' reference.
	 * @see #getGametype()
	 * @generated
	 */
	void setGametype(GameType value);

} // Activity
