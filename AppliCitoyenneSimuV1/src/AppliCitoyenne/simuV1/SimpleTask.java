/**
 */
package AppliCitoyenne.simuV1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.SimpleTask#getCompatibleaction2detect <em>Compatibleaction2detect</em>}</li>
 * </ul>
 *
 * @see AppliCitoyenne.simuV1.SimuV1Package#getSimpleTask()
 * @model
 * @generated
 */
public interface SimpleTask extends Task {
	/**
	 * Returns the value of the '<em><b>Compatibleaction2detect</b></em>' reference list.
	 * The list contents are of type {@link AppliCitoyenne.simuV1.Action2Detect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compatibleaction2detect</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatibleaction2detect</em>' reference list.
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getSimpleTask_Compatibleaction2detect()
	 * @model
	 * @generated
	 */
	EList<Action2Detect> getCompatibleaction2detect();

} // SimpleTask
