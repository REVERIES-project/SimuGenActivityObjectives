/**
 */
package AppliCitoyenne.simuV1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventory Pref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.InventoryPref#getInventoryobjective <em>Inventoryobjective</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.InventoryPref#getPonderation <em>Ponderation</em>}</li>
 * </ul>
 *
 * @see AppliCitoyenne.simuV1.SimuV1Package#getInventoryPref()
 * @model annotation="exeed classIcon='public'"
 * @generated
 */
public interface InventoryPref extends EObject {
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
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getInventoryPref_Inventoryobjective()
	 * @model
	 * @generated
	 */
	InventoryObjective getInventoryobjective();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.InventoryPref#getInventoryobjective <em>Inventoryobjective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventoryobjective</em>' reference.
	 * @see #getInventoryobjective()
	 * @generated
	 */
	void setInventoryobjective(InventoryObjective value);

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
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getInventoryPref_Ponderation()
	 * @model
	 * @generated
	 */
	int getPonderation();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.InventoryPref#getPonderation <em>Ponderation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ponderation</em>' attribute.
	 * @see #getPonderation()
	 * @generated
	 */
	void setPonderation(int value);

} // InventoryPref
