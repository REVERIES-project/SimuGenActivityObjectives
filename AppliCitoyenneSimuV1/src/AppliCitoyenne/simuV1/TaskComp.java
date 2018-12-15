/**
 */
package AppliCitoyenne.simuV1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Comp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.TaskComp#getAction2detect <em>Action2detect</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.TaskComp#getNewspeciessurvey <em>Newspeciessurvey</em>}</li>
 * </ul>
 *
 * @see AppliCitoyenne.simuV1.SimuV1Package#getTaskComp()
 * @model
 * @generated
 */
public interface TaskComp extends EObject {
	/**
	 * Returns the value of the '<em><b>Action2detect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action2detect</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action2detect</em>' reference.
	 * @see #setAction2detect(Action2Detect)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getTaskComp_Action2detect()
	 * @model
	 * @generated
	 */
	Action2Detect getAction2detect();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.TaskComp#getAction2detect <em>Action2detect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action2detect</em>' reference.
	 * @see #getAction2detect()
	 * @generated
	 */
	void setAction2detect(Action2Detect value);

	/**
	 * Returns the value of the '<em><b>Newspeciessurvey</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Newspeciessurvey</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Newspeciessurvey</em>' reference.
	 * @see #setNewspeciessurvey(Target)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getTaskComp_Newspeciessurvey()
	 * @model
	 * @generated
	 */
	Target getNewspeciessurvey();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.TaskComp#getNewspeciessurvey <em>Newspeciessurvey</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Newspeciessurvey</em>' reference.
	 * @see #getNewspeciessurvey()
	 * @generated
	 */
	void setNewspeciessurvey(Target value);

} // TaskComp
