/**
 */
package AppliCitoyenne.simuV1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Type Pref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.GameTypePref#getPonderation <em>Ponderation</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.GameTypePref#getGameobjective <em>Gameobjective</em>}</li>
 * </ul>
 *
 * @see AppliCitoyenne.simuV1.SimuV1Package#getGameTypePref()
 * @model
 * @generated
 */
public interface GameTypePref extends EObject {
	/**
	 * Returns the value of the '<em><b>Ponderation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ponderation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ponderation</em>' attribute.
	 * @see #setPonderation(int)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getGameTypePref_Ponderation()
	 * @model
	 * @generated
	 */
	int getPonderation();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.GameTypePref#getPonderation <em>Ponderation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ponderation</em>' attribute.
	 * @see #getPonderation()
	 * @generated
	 */
	void setPonderation(int value);

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
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getGameTypePref_Gameobjective()
	 * @model
	 * @generated
	 */
	GameObjective getGameobjective();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.GameTypePref#getGameobjective <em>Gameobjective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gameobjective</em>' reference.
	 * @see #getGameobjective()
	 * @generated
	 */
	void setGameobjective(GameObjective value);

} // GameTypePref
