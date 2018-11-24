/**
 */
package AppliCitoyenne.simuV1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.Objective#getIncompatibleObjectives <em>Incompatible Objectives</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.Objective#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see AppliCitoyenne.simuV1.SimuV1Package#getObjective()
 * @model abstract="true"
 * @generated
 */
public interface Objective extends EObject {
	/**
	 * Returns the value of the '<em><b>Incompatible Objectives</b></em>' reference list.
	 * The list contents are of type {@link AppliCitoyenne.simuV1.Objective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incompatible Objectives</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incompatible Objectives</em>' reference list.
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getObjective_IncompatibleObjectives()
	 * @model type="AppliCitoyenne.simuV1.Objective"
	 * @generated
	 */
	EList getIncompatibleObjectives();

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
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getObjective_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.Objective#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Objective
