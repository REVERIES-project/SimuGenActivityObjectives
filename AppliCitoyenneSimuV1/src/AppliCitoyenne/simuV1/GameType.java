/**
 */
package AppliCitoyenne.simuV1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.GameType#getCompatiblegameobjective <em>Compatiblegameobjective</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.GameType#getName <em>Name</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.GameType#getCompatibleinventoryobjective <em>Compatibleinventoryobjective</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.GameType#getCompatiblelearningobjective <em>Compatiblelearningobjective</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.GameType#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.GameType#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see AppliCitoyenne.simuV1.SimuV1Package#getGameType()
 * @model
 * @generated
 */
public interface GameType extends EObject {
	/**
	 * Returns the value of the '<em><b>Compatiblegameobjective</b></em>' reference list.
	 * The list contents are of type {@link AppliCitoyenne.simuV1.GameObjective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compatiblegameobjective</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatiblegameobjective</em>' reference list.
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getGameType_Compatiblegameobjective()
	 * @model
	 * @generated
	 */
	EList<GameObjective> getCompatiblegameobjective();

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
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getGameType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.GameType#getName <em>Name</em>}' attribute.
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
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getGameType_Compatibleinventoryobjective()
	 * @model
	 * @generated
	 */
	EList<InventoryObjective> getCompatibleinventoryobjective();

	/**
	 * Returns the value of the '<em><b>Compatiblelearningobjective</b></em>' reference list.
	 * The list contents are of type {@link AppliCitoyenne.simuV1.LearningObjective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compatiblelearningobjective</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatiblelearningobjective</em>' reference list.
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getGameType_Compatiblelearningobjective()
	 * @model
	 * @generated
	 */
	EList<LearningObjective> getCompatiblelearningobjective();

	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instruction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction</em>' attribute.
	 * @see #setInstruction(String)
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getGameType_Instruction()
	 * @model
	 * @generated
	 */
	String getInstruction();

	/**
	 * Sets the value of the '{@link AppliCitoyenne.simuV1.GameType#getInstruction <em>Instruction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction</em>' attribute.
	 * @see #getInstruction()
	 * @generated
	 */
	void setInstruction(String value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link AppliCitoyenne.simuV1.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getGameType_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraint();

} // GameType
