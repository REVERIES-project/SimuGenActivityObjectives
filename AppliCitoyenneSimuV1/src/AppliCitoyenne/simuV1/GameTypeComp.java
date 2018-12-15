/**
 */
package AppliCitoyenne.simuV1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Type Comp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.GameTypeComp#getGametype <em>Gametype</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.GameTypeComp#getTimes <em>Times</em>}</li>
 * </ul>
 *
 * @see AppliCitoyenne.simuV1.SimuV1Package#getGameTypeComp()
 * @model
 * @generated
 */
public interface GameTypeComp extends EObject {
	/**
	 * Returns the value of the '<em><b>Gametype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gametype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gametype</em>' reference.
	 * @see #setGametype(GameType)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getGameTypeComp_Gametype()
	 * @model
	 * @generated
	 */
	GameType getGametype();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.GameTypeComp#getGametype <em>Gametype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gametype</em>' reference.
	 * @see #getGametype()
	 * @generated
	 */
	void setGametype(GameType value);

	/**
	 * Returns the value of the '<em><b>Times</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Times</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Times</em>' attribute.
	 * @see #setTimes(int)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getGameTypeComp_Times()
	 * @model
	 * @generated
	 */
	int getTimes();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.GameTypeComp#getTimes <em>Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Times</em>' attribute.
	 * @see #getTimes()
	 * @generated
	 */
	void setTimes(int value);

} // GameTypeComp
