/**
 */
package AppliCitoyenne.simuV1.impl;

import AppliCitoyenne.simuV1.Constraint;
import AppliCitoyenne.simuV1.GameObjective;
import AppliCitoyenne.simuV1.GameType;
import AppliCitoyenne.simuV1.InventoryObjective;
import AppliCitoyenne.simuV1.LearningObjective;
import AppliCitoyenne.simuV1.SimuV1Package;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.impl.GameTypeImpl#getCompatiblegameobjective <em>Compatiblegameobjective</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.GameTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.GameTypeImpl#getCompatibleinventoryobjective <em>Compatibleinventoryobjective</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.GameTypeImpl#getCompatiblelearningobjective <em>Compatiblelearningobjective</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.GameTypeImpl#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.GameTypeImpl#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameTypeImpl extends MinimalEObjectImpl.Container implements GameType {
	/**
	 * The cached value of the '{@link #getCompatiblegameobjective() <em>Compatiblegameobjective</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompatiblegameobjective()
	 * @generated
	 * @ordered
	 */
	protected EList<GameObjective> compatiblegameobjective;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCompatibleinventoryobjective() <em>Compatibleinventoryobjective</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompatibleinventoryobjective()
	 * @generated
	 * @ordered
	 */
	protected EList<InventoryObjective> compatibleinventoryobjective;

	/**
	 * The cached value of the '{@link #getCompatiblelearningobjective() <em>Compatiblelearningobjective</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompatiblelearningobjective()
	 * @generated
	 * @ordered
	 */
	protected EList<LearningObjective> compatiblelearningobjective;

	/**
	 * The default value of the '{@link #getInstruction() <em>Instruction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTRUCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstruction() <em>Instruction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction()
	 * @generated
	 * @ordered
	 */
	protected String instruction = INSTRUCTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimuV1Package.Literals.GAME_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GameObjective> getCompatiblegameobjective() {
		if (compatiblegameobjective == null) {
			compatiblegameobjective = new EObjectResolvingEList<GameObjective>(GameObjective.class, this, SimuV1Package.GAME_TYPE__COMPATIBLEGAMEOBJECTIVE);
		}
		return compatiblegameobjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.GAME_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InventoryObjective> getCompatibleinventoryobjective() {
		if (compatibleinventoryobjective == null) {
			compatibleinventoryobjective = new EObjectResolvingEList<InventoryObjective>(InventoryObjective.class, this, SimuV1Package.GAME_TYPE__COMPATIBLEINVENTORYOBJECTIVE);
		}
		return compatibleinventoryobjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LearningObjective> getCompatiblelearningobjective() {
		if (compatiblelearningobjective == null) {
			compatiblelearningobjective = new EObjectResolvingEList<LearningObjective>(LearningObjective.class, this, SimuV1Package.GAME_TYPE__COMPATIBLELEARNINGOBJECTIVE);
		}
		return compatiblelearningobjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstruction() {
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstruction(String newInstruction) {
		String oldInstruction = instruction;
		instruction = newInstruction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.GAME_TYPE__INSTRUCTION, oldInstruction, instruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<Constraint>(Constraint.class, this, SimuV1Package.GAME_TYPE__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimuV1Package.GAME_TYPE__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimuV1Package.GAME_TYPE__COMPATIBLEGAMEOBJECTIVE:
				return getCompatiblegameobjective();
			case SimuV1Package.GAME_TYPE__NAME:
				return getName();
			case SimuV1Package.GAME_TYPE__COMPATIBLEINVENTORYOBJECTIVE:
				return getCompatibleinventoryobjective();
			case SimuV1Package.GAME_TYPE__COMPATIBLELEARNINGOBJECTIVE:
				return getCompatiblelearningobjective();
			case SimuV1Package.GAME_TYPE__INSTRUCTION:
				return getInstruction();
			case SimuV1Package.GAME_TYPE__CONSTRAINT:
				return getConstraint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimuV1Package.GAME_TYPE__COMPATIBLEGAMEOBJECTIVE:
				getCompatiblegameobjective().clear();
				getCompatiblegameobjective().addAll((Collection<? extends GameObjective>)newValue);
				return;
			case SimuV1Package.GAME_TYPE__NAME:
				setName((String)newValue);
				return;
			case SimuV1Package.GAME_TYPE__COMPATIBLEINVENTORYOBJECTIVE:
				getCompatibleinventoryobjective().clear();
				getCompatibleinventoryobjective().addAll((Collection<? extends InventoryObjective>)newValue);
				return;
			case SimuV1Package.GAME_TYPE__COMPATIBLELEARNINGOBJECTIVE:
				getCompatiblelearningobjective().clear();
				getCompatiblelearningobjective().addAll((Collection<? extends LearningObjective>)newValue);
				return;
			case SimuV1Package.GAME_TYPE__INSTRUCTION:
				setInstruction((String)newValue);
				return;
			case SimuV1Package.GAME_TYPE__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends Constraint>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimuV1Package.GAME_TYPE__COMPATIBLEGAMEOBJECTIVE:
				getCompatiblegameobjective().clear();
				return;
			case SimuV1Package.GAME_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SimuV1Package.GAME_TYPE__COMPATIBLEINVENTORYOBJECTIVE:
				getCompatibleinventoryobjective().clear();
				return;
			case SimuV1Package.GAME_TYPE__COMPATIBLELEARNINGOBJECTIVE:
				getCompatiblelearningobjective().clear();
				return;
			case SimuV1Package.GAME_TYPE__INSTRUCTION:
				setInstruction(INSTRUCTION_EDEFAULT);
				return;
			case SimuV1Package.GAME_TYPE__CONSTRAINT:
				getConstraint().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimuV1Package.GAME_TYPE__COMPATIBLEGAMEOBJECTIVE:
				return compatiblegameobjective != null && !compatiblegameobjective.isEmpty();
			case SimuV1Package.GAME_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SimuV1Package.GAME_TYPE__COMPATIBLEINVENTORYOBJECTIVE:
				return compatibleinventoryobjective != null && !compatibleinventoryobjective.isEmpty();
			case SimuV1Package.GAME_TYPE__COMPATIBLELEARNINGOBJECTIVE:
				return compatiblelearningobjective != null && !compatiblelearningobjective.isEmpty();
			case SimuV1Package.GAME_TYPE__INSTRUCTION:
				return INSTRUCTION_EDEFAULT == null ? instruction != null : !INSTRUCTION_EDEFAULT.equals(instruction);
			case SimuV1Package.GAME_TYPE__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", instruction: ");
		result.append(instruction);
		result.append(')');
		return result.toString();
	}

} //GameTypeImpl
