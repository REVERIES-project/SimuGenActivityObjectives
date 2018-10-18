/**
 */
package AppliCitoyenne.simuV1;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.GameProfile#getGametypepref <em>Gametypepref</em>}</li>
 * </ul>
 *
 * @see AppliCitoyenne.simuV1.SimuV1Package#getGameProfile()
 * @model annotation="exeed classIcon='competitor'"
 * @generated
 */
public interface GameProfile extends EObject {

	/**
	 * Returns the value of the '<em><b>Gametypepref</b></em>' containment reference list.
	 * The list contents are of type {@link AppliCitoyenne.simuV1.GameTypePref}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gametypepref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gametypepref</em>' containment reference list.
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getGameProfile_Gametypepref()
	 * @model type="AppliCitoyenne.simuV1.GameTypePref" containment="true"
	 * @generated
	 */
	EList getGametypepref();
} // GameProfile
