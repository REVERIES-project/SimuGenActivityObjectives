/**
 */
package AppliCitoyenne.simuV1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Botanical Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.BotanicalProfile#getBotanicalstat <em>Botanicalstat</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.BotanicalProfile#isNoInterest <em>No Interest</em>}</li>
 * </ul>
 *
 * @see AppliCitoyenne.simuV1.SimuV1Package#getBotanicalProfile()
 * @model annotation="exeed classIcon='resource'"
 * @generated
 */
public interface BotanicalProfile extends EObject {
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
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getBotanicalProfile_Botanicalstat()
	 * @model type="AppliCitoyenne.simuV1.BotanicalStat" containment="true"
	 * @generated
	 */
	EList getBotanicalstat();

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
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getBotanicalProfile_NoInterest()
	 * @model
	 * @generated
	 */
	boolean isNoInterest();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.BotanicalProfile#isNoInterest <em>No Interest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Interest</em>' attribute.
	 * @see #isNoInterest()
	 * @generated
	 */
	void setNoInterest(boolean value);

} // BotanicalProfile
