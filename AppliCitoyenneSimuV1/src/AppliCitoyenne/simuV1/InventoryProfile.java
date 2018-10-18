/**
 */
package AppliCitoyenne.simuV1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inventory Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.InventoryProfile#getInventorypref <em>Inventorypref</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.InventoryProfile#getBotanicalstat <em>Botanicalstat</em>}</li>
 * </ul>
 *
 * @see AppliCitoyenne.simuV1.SimuV1Package#getInventoryProfile()
 * @model annotation="exeed classIcon='public'"
 * @generated
 */
public interface InventoryProfile extends EObject {
	/**
	 * Returns the value of the '<em><b>Inventorypref</b></em>' containment reference list.
	 * The list contents are of type {@link AppliCitoyenne.simuV1.InventoryPref}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventorypref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventorypref</em>' containment reference list.
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getInventoryProfile_Inventorypref()
	 * @model type="AppliCitoyenne.simuV1.InventoryPref" containment="true"
	 * @generated
	 */
	EList getInventorypref();

	/**
	 * Returns the value of the '<em><b>Botanicalstat</b></em>' containment reference list.
	 * The list contents are of type {@link AppliCitoyenne.simuV1.BotanicalStat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Botanicalstat</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Botanicalstat</em>' containment reference list.
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getInventoryProfile_Botanicalstat()
	 * @model type="AppliCitoyenne.simuV1.BotanicalStat" containment="true"
	 * @generated
	 */
	EList getBotanicalstat();

} // InventoryProfile
