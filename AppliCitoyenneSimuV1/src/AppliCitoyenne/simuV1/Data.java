/**
 */
package AppliCitoyenne.simuV1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.Data#getProfiles <em>Profiles</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.Data#getBotanicalsurveys <em>Botanicalsurveys</em>}</li>
 * </ul>
 *
 * @see AppliCitoyenne.simuV1.SimuV1Package#getData()
 * @model annotation="exeed classIcon='emfmodel'"
 * @generated
 */
public interface Data extends EObject {
	/**
	 * Returns the value of the '<em><b>Profiles</b></em>' containment reference list.
	 * The list contents are of type {@link AppliCitoyenne.simuV1.Profile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profiles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profiles</em>' containment reference list.
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getData_Profiles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Profile> getProfiles();

	/**
	 * Returns the value of the '<em><b>Botanicalsurveys</b></em>' containment reference list.
	 * The list contents are of type {@link AppliCitoyenne.simuV1.BotanicalSurvey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Botanicalsurveys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Botanicalsurveys</em>' containment reference list.
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getData_Botanicalsurveys()
	 * @model containment="true"
	 * @generated
	 */
	EList<BotanicalSurvey> getBotanicalsurveys();

} // Data
