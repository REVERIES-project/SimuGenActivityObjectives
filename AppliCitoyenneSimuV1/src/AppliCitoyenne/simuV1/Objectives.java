/**
 */
package AppliCitoyenne.simuV1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objectives</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.Objectives#getLearningobjective <em>Learningobjective</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.Objectives#getInventoryobjective <em>Inventoryobjective</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.Objectives#getGameobjective <em>Gameobjective</em>}</li>
 * </ul>
 *
 * @see AppliCitoyenne.simuV1.SimuV1Package#getObjectives()
 * @model annotation="exeed classIcon='package'"
 * @generated
 */
public interface Objectives extends EObject {
	/**
	 * Returns the value of the '<em><b>Learningobjective</b></em>' containment reference list.
	 * The list contents are of type {@link AppliCitoyenne.simuV1.LearningObjective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Learningobjective</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Learningobjective</em>' containment reference list.
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getObjectives_Learningobjective()
	 * @model containment="true"
	 * @generated
	 */
	EList<LearningObjective> getLearningobjective();

	/**
	 * Returns the value of the '<em><b>Inventoryobjective</b></em>' containment reference list.
	 * The list contents are of type {@link AppliCitoyenne.simuV1.InventoryObjective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inventoryobjective</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventoryobjective</em>' containment reference list.
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getObjectives_Inventoryobjective()
	 * @model containment="true"
	 * @generated
	 */
	EList<InventoryObjective> getInventoryobjective();

	/**
	 * Returns the value of the '<em><b>Gameobjective</b></em>' containment reference list.
	 * The list contents are of type {@link AppliCitoyenne.simuV1.GameObjective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gameobjective</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gameobjective</em>' containment reference list.
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getObjectives_Gameobjective()
	 * @model containment="true"
	 * @generated
	 */
	EList<GameObjective> getGameobjective();

} // Objectives
