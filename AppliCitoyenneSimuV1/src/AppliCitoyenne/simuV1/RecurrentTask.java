/**
 */
package AppliCitoyenne.simuV1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recurrent Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.RecurrentTask#getSubtask <em>Subtask</em>}</li>
 * </ul>
 *
 * @see AppliCitoyenne.simuV1.SimuV1Package#getRecurrentTask()
 * @model
 * @generated
 */
public interface RecurrentTask extends StructuredTask {
	/**
	 * Returns the value of the '<em><b>Subtask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtask</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtask</em>' containment reference.
	 * @see #setSubtask(SimpleTask)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getRecurrentTask_Subtask()
	 * @model containment="true"
	 * @generated
	 */
	SimpleTask getSubtask();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.RecurrentTask#getSubtask <em>Subtask</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtask</em>' containment reference.
	 * @see #getSubtask()
	 * @generated
	 */
	void setSubtask(SimpleTask value);

} // RecurrentTask
