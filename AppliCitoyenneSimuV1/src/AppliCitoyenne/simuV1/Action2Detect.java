/**
 */
package AppliCitoyenne.simuV1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action2 Detect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.Action2Detect#getName <em>Name</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.Action2Detect#getCompatibleinventoryobjective <em>Compatibleinventoryobjective</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.Action2Detect#getOptionaltarget <em>Optionaltarget</em>}</li>
 * </ul>
 *
 * @see AppliCitoyenne.simuV1.SimuV1Package#getAction2Detect()
 * @model
 * @generated
 */
public interface Action2Detect extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getAction2Detect_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.Action2Detect#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Compatibleinventoryobjective</b></em>' reference list.
	 * The list contents are of type {@link AppliCitoyenne.simuV1.InventoryObjective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compatibleinventoryobjective</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatibleinventoryobjective</em>' reference list.
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getAction2Detect_Compatibleinventoryobjective()
	 * @model
	 * @generated
	 */
	EList<InventoryObjective> getCompatibleinventoryobjective();

	/**
	 * Returns the value of the '<em><b>Optionaltarget</b></em>' reference list.
	 * The list contents are of type {@link AppliCitoyenne.simuV1.Target}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optionaltarget</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optionaltarget</em>' reference list.
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getAction2Detect_Optionaltarget()
	 * @model
	 * @generated
	 */
	EList<Target> getOptionaltarget();

} // Action2Detect
