/**
 */
package AppliCitoyenne.simuV1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.Profile#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.Profile#getLastname <em>Lastname</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.Profile#getInventoryprofile <em>Inventoryprofile</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.Profile#getBotanicalprofile <em>Botanicalprofile</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.Profile#getGameprofile <em>Gameprofile</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.Profile#getBotanicalsurvey <em>Botanicalsurvey</em>}</li>
 * </ul>
 *
 * @see AppliCitoyenne.simuV1.SimuV1Package#getProfile()
 * @model annotation="exeed classIcon='user'"
 * @generated
 */
public interface Profile extends EObject {
	/**
	 * Returns the value of the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firstname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firstname</em>' attribute.
	 * @see #setFirstname(String)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getProfile_Firstname()
	 * @model
	 * @generated
	 */
	String getFirstname();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.Profile#getFirstname <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firstname</em>' attribute.
	 * @see #getFirstname()
	 * @generated
	 */
	void setFirstname(String value);

	/**
	 * Returns the value of the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lastname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lastname</em>' attribute.
	 * @see #setLastname(String)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getProfile_Lastname()
	 * @model
	 * @generated
	 */
	String getLastname();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.Profile#getLastname <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lastname</em>' attribute.
	 * @see #getLastname()
	 * @generated
	 */
	void setLastname(String value);

	/**
	 * Returns the value of the '<em><b>Inventoryprofile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventoryprofile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventoryprofile</em>' containment reference.
	 * @see #setInventoryprofile(InventoryProfile)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getProfile_Inventoryprofile()
	 * @model containment="true"
	 * @generated
	 */
	InventoryProfile getInventoryprofile();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.Profile#getInventoryprofile <em>Inventoryprofile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventoryprofile</em>' containment reference.
	 * @see #getInventoryprofile()
	 * @generated
	 */
	void setInventoryprofile(InventoryProfile value);

	/**
	 * Returns the value of the '<em><b>Botanicalprofile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Botanicalprofile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Botanicalprofile</em>' containment reference.
	 * @see #setBotanicalprofile(BotanicalProfile)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getProfile_Botanicalprofile()
	 * @model containment="true"
	 * @generated
	 */
	BotanicalProfile getBotanicalprofile();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.Profile#getBotanicalprofile <em>Botanicalprofile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Botanicalprofile</em>' containment reference.
	 * @see #getBotanicalprofile()
	 * @generated
	 */
	void setBotanicalprofile(BotanicalProfile value);

	/**
	 * Returns the value of the '<em><b>Gameprofile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gameprofile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gameprofile</em>' containment reference.
	 * @see #setGameprofile(GameProfile)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getProfile_Gameprofile()
	 * @model containment="true"
	 * @generated
	 */
	GameProfile getGameprofile();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.Profile#getGameprofile <em>Gameprofile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gameprofile</em>' containment reference.
	 * @see #getGameprofile()
	 * @generated
	 */
	void setGameprofile(GameProfile value);

	/**
	 * Returns the value of the '<em><b>Botanicalsurvey</b></em>' reference list.
	 * The list contents are of type {@link AppliCitoyenne.simuV1.BotanicalSurvey}.
	 * It is bidirectional and its opposite is '{@link AppliCitoyenne.simuV1.BotanicalSurvey#getProfile <em>Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Botanicalsurvey</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Botanicalsurvey</em>' reference list.
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getProfile_Botanicalsurvey()
	 * @see AppliCitoyenne.simuV1.BotanicalSurvey#getProfile
	 * @model opposite="profile"
	 * @generated
	 */
	EList<BotanicalSurvey> getBotanicalsurvey();

} // Profile
