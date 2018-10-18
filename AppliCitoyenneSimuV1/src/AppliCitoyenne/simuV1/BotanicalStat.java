/**
 */
package AppliCitoyenne.simuV1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Botanical Stat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.BotanicalStat#getDirectIdentification <em>Direct Identification</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.BotanicalStat#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see AppliCitoyenne.simuV1.SimuV1Package#getBotanicalStat()
 * @model
 * @generated
 */
public interface BotanicalStat extends EObject {
	/**
	 * Returns the value of the '<em><b>Direct Identification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direct Identification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direct Identification</em>' attribute.
	 * @see #setDirectIdentification(int)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getBotanicalStat_DirectIdentification()
	 * @model
	 * @generated
	 */
	int getDirectIdentification();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.BotanicalStat#getDirectIdentification <em>Direct Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direct Identification</em>' attribute.
	 * @see #getDirectIdentification()
	 * @generated
	 */
	void setDirectIdentification(int value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Target)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getBotanicalStat_Target()
	 * @model
	 * @generated
	 */
	Target getTarget();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.BotanicalStat#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Target value);

} // BotanicalStat
