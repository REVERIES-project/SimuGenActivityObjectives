/**
 */
package AppliCitoyenne.simuV1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.GameTypes#getGametype <em>Gametype</em>}</li>
 * </ul>
 *
 * @see AppliCitoyenne.simuV1.SimuV1Package#getGameTypes()
 * @model
 * @generated
 */
public interface GameTypes extends EObject {
	/**
	 * Returns the value of the '<em><b>Gametype</b></em>' containment reference list.
	 * The list contents are of type {@link AppliCitoyenne.simuV1.GameType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gametype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gametype</em>' containment reference list.
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getGameTypes_Gametype()
	 * @model containment="true"
	 * @generated
	 */
	EList<GameType> getGametype();

} // GameTypes
