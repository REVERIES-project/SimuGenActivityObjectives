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

} // Activity
