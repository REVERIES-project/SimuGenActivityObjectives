/**
 */
package AppliCitoyenne.simuV1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Botanical Flore</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.BotanicalFlore#getFamily <em>Family</em>}</li>
 * </ul>
 *
 * @see AppliCitoyenne.simuV1.SimuV1Package#getBotanicalFlore()
 * @model annotation="exeed classIcon='class'"
 * @generated
 */
public interface BotanicalFlore extends EObject {
	/**
	 * Returns the value of the '<em><b>Family</b></em>' containment reference list.
	 * The list contents are of type {@link AppliCitoyenne.simuV1.Family}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family</em>' containment reference list.
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getBotanicalFlore_Family()
	 * @model containment="true"
	 * @generated
	 */
	EList<Family> getFamily();

} // BotanicalFlore
