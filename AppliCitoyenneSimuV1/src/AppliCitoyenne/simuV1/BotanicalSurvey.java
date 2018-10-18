/**
 */
package AppliCitoyenne.simuV1;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Botanical Survey</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.BotanicalSurvey#getProfile <em>Profile</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.BotanicalSurvey#getDate <em>Date</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.BotanicalSurvey#getPoi <em>Poi</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.BotanicalSurvey#getTarget <em>Target</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.BotanicalSurvey#getId <em>Id</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.BotanicalSurvey#getReliabilityScore <em>Reliability Score</em>}</li>
 * </ul>
 *
 * @see AppliCitoyenne.simuV1.SimuV1Package#getBotanicalSurvey()
 * @model abstract="true"
 *        annotation="exeed classIcon='file'"
 * @generated
 */
public interface BotanicalSurvey extends EObject {
	/**
	 * Returns the value of the '<em><b>Profile</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link AppliCitoyenne.simuV1.Profile#getBotanicalsurvey <em>Botanicalsurvey</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile</em>' reference.
	 * @see #setProfile(Profile)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getBotanicalSurvey_Profile()
	 * @see AppliCitoyenne.simuV1.Profile#getBotanicalsurvey
	 * @model opposite="botanicalsurvey"
	 * @generated
	 */
	Profile getProfile();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.BotanicalSurvey#getProfile <em>Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' reference.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(Profile value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getBotanicalSurvey_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.BotanicalSurvey#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Poi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poi</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poi</em>' containment reference.
	 * @see #setPoi(POI)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getBotanicalSurvey_Poi()
	 * @model containment="true"
	 * @generated
	 */
	POI getPoi();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.BotanicalSurvey#getPoi <em>Poi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poi</em>' containment reference.
	 * @see #getPoi()
	 * @generated
	 */
	void setPoi(POI value);

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
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getBotanicalSurvey_Target()
	 * @model
	 * @generated
	 */
	Target getTarget();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.BotanicalSurvey#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Target value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getBotanicalSurvey_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.BotanicalSurvey#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Reliability Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reliability Score</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reliability Score</em>' attribute.
	 * @see #setReliabilityScore(int)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getBotanicalSurvey_ReliabilityScore()
	 * @model
	 * @generated
	 */
	int getReliabilityScore();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.BotanicalSurvey#getReliabilityScore <em>Reliability Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reliability Score</em>' attribute.
	 * @see #getReliabilityScore()
	 * @generated
	 */
	void setReliabilityScore(int value);

} // BotanicalSurvey
