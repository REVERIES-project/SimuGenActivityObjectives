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
 *   <li>{@link AppliCitoyenne.simuV1.GameProfile#isNoInterest <em>No Interest</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>No Interest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Interest</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Interest</em>' attribute.
	 * @see #setNoInterest(boolean)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getGameProfile_NoInterest()
	 * @model
	 * @generated
	 */
	boolean isNoInterest();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.GameProfile#isNoInterest <em>No Interest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Interest</em>' attribute.
	 * @see #isNoInterest()
	 * @generated
	 */
	void setNoInterest(boolean value);

} // GameProfile
