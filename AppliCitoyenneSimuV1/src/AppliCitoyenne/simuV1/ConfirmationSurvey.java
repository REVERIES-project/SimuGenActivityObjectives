/**
 */
package AppliCitoyenne.simuV1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Confirmation Survey</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.ConfirmationSurvey#getBasicsurvey <em>Basicsurvey</em>}</li>
 * </ul>
 *
 * @see AppliCitoyenne.simuV1.SimuV1Package#getConfirmationSurvey()
 * @model annotation="exeed classIcon='file'"
 * @generated
 */
public interface ConfirmationSurvey extends BotanicalSurvey {
	/**
	 * Returns the value of the '<em><b>Basicsurvey</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link AppliCitoyenne.simuV1.BasicSurvey#getConfirmationsurvey <em>Confirmationsurvey</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basicsurvey</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basicsurvey</em>' reference.
	 * @see #setBasicsurvey(BasicSurvey)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getConfirmationSurvey_Basicsurvey()
	 * @see AppliCitoyenne.simuV1.BasicSurvey#getConfirmationsurvey
	 * @model opposite="confirmationsurvey"
	 * @generated
	 */
	BasicSurvey getBasicsurvey();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.ConfirmationSurvey#getBasicsurvey <em>Basicsurvey</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basicsurvey</em>' reference.
	 * @see #getBasicsurvey()
	 * @generated
	 */
	void setBasicsurvey(BasicSurvey value);

} // ConfirmationSurvey
