/**
 */
package AppliCitoyenne.simuV1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Survey</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.BasicSurvey#getConfirmationsurvey <em>Confirmationsurvey</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.BasicSurvey#getAdditionalsurvey <em>Additionalsurvey</em>}</li>
 * </ul>
 *
 * @see AppliCitoyenne.simuV1.SimuV1Package#getBasicSurvey()
 * @model annotation="exeed classIcon='file'"
 * @generated
 */
public interface BasicSurvey extends BotanicalSurvey {
	/**
	 * Returns the value of the '<em><b>Confirmationsurvey</b></em>' reference list.
	 * The list contents are of type {@link AppliCitoyenne.simuV1.ConfirmationSurvey}.
	 * It is bidirectional and its opposite is '{@link AppliCitoyenne.simuV1.ConfirmationSurvey#getBasicsurvey <em>Basicsurvey</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confirmationsurvey</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirmationsurvey</em>' reference list.
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getBasicSurvey_Confirmationsurvey()
	 * @see AppliCitoyenne.simuV1.ConfirmationSurvey#getBasicsurvey
	 * @model type="AppliCitoyenne.simuV1.ConfirmationSurvey" opposite="basicsurvey"
	 * @generated
	 */
	EList getConfirmationsurvey();

	/**
	 * Returns the value of the '<em><b>Additionalsurvey</b></em>' reference list.
	 * The list contents are of type {@link AppliCitoyenne.simuV1.AdditionalSurvey}.
	 * It is bidirectional and its opposite is '{@link AppliCitoyenne.simuV1.AdditionalSurvey#getBasicsurvey <em>Basicsurvey</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additionalsurvey</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additionalsurvey</em>' reference list.
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getBasicSurvey_Additionalsurvey()
	 * @see AppliCitoyenne.simuV1.AdditionalSurvey#getBasicsurvey
	 * @model type="AppliCitoyenne.simuV1.AdditionalSurvey" opposite="basicsurvey"
	 * @generated
	 */
	EList getAdditionalsurvey();

} // BasicSurvey
