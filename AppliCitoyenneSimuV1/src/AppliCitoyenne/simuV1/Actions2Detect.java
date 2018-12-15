/**
 */
package AppliCitoyenne.simuV1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actions2 Detect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.Actions2Detect#getAction2detect <em>Action2detect</em>}</li>
 * </ul>
 *
 * @see AppliCitoyenne.simuV1.SimuV1Package#getActions2Detect()
 * @model
 * @generated
 */
public interface Actions2Detect extends EObject {
	/**
	 * Returns the value of the '<em><b>Action2detect</b></em>' containment reference list.
	 * The list contents are of type {@link AppliCitoyenne.simuV1.Action2Detect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action2detect</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action2detect</em>' containment reference list.
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getActions2Detect_Action2detect()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action2Detect> getAction2detect();

} // Actions2Detect
