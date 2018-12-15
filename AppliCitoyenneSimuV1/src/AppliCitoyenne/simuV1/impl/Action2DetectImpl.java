/**
 */
package AppliCitoyenne.simuV1.impl;

import AppliCitoyenne.simuV1.Action2Detect;
import AppliCitoyenne.simuV1.InventoryObjective;
import AppliCitoyenne.simuV1.SimuV1Package;
import AppliCitoyenne.simuV1.Target;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action2 Detect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.impl.Action2DetectImpl#getName <em>Name</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.Action2DetectImpl#getCompatibleinventoryobjective <em>Compatibleinventoryobjective</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.Action2DetectImpl#getOptionaltarget <em>Optionaltarget</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Action2DetectImpl extends MinimalEObjectImpl.Container implements Action2Detect {
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
	 * The cached value of the '{@link #getOptionaltarget() <em>Optionaltarget</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionaltarget()
	 * @generated
	 * @ordered
	 */
	protected EList<Target> optionaltarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Action2DetectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimuV1Package.Literals.ACTION2_DETECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.ACTION2_DETECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InventoryObjective> getCompatibleinventoryobjective() {
		if (compatibleinventoryobjective == null) {
			compatibleinventoryobjective = new EObjectResolvingEList<InventoryObjective>(InventoryObjective.class, this, SimuV1Package.ACTION2_DETECT__COMPATIBLEINVENTORYOBJECTIVE);
		}
		return compatibleinventoryobjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Target> getOptionaltarget() {
		if (optionaltarget == null) {
			optionaltarget = new EObjectResolvingEList<Target>(Target.class, this, SimuV1Package.ACTION2_DETECT__OPTIONALTARGET);
		}
		return optionaltarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimuV1Package.ACTION2_DETECT__NAME:
				return getName();
			case SimuV1Package.ACTION2_DETECT__COMPATIBLEINVENTORYOBJECTIVE:
				return getCompatibleinventoryobjective();
			case SimuV1Package.ACTION2_DETECT__OPTIONALTARGET:
				return getOptionaltarget();
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
			case SimuV1Package.ACTION2_DETECT__NAME:
				setName((String)newValue);
				return;
			case SimuV1Package.ACTION2_DETECT__COMPATIBLEINVENTORYOBJECTIVE:
				getCompatibleinventoryobjective().clear();
				getCompatibleinventoryobjective().addAll((Collection<? extends InventoryObjective>)newValue);
				return;
			case SimuV1Package.ACTION2_DETECT__OPTIONALTARGET:
				getOptionaltarget().clear();
				getOptionaltarget().addAll((Collection<? extends Target>)newValue);
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
			case SimuV1Package.ACTION2_DETECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SimuV1Package.ACTION2_DETECT__COMPATIBLEINVENTORYOBJECTIVE:
				getCompatibleinventoryobjective().clear();
				return;
			case SimuV1Package.ACTION2_DETECT__OPTIONALTARGET:
				getOptionaltarget().clear();
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
			case SimuV1Package.ACTION2_DETECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SimuV1Package.ACTION2_DETECT__COMPATIBLEINVENTORYOBJECTIVE:
				return compatibleinventoryobjective != null && !compatibleinventoryobjective.isEmpty();
			case SimuV1Package.ACTION2_DETECT__OPTIONALTARGET:
				return optionaltarget != null && !optionaltarget.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //Action2DetectImpl
