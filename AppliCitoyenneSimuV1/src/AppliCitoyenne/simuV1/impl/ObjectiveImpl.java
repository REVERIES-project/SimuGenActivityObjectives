/**
 */
package AppliCitoyenne.simuV1.impl;

import AppliCitoyenne.simuV1.Objective;
import AppliCitoyenne.simuV1.SimuV1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.impl.ObjectiveImpl#getIncompatibleObjectives <em>Incompatible Objectives</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.ObjectiveImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ObjectiveImpl extends MinimalEObjectImpl.Container implements Objective {
	/**
	 * The cached value of the '{@link #getIncompatibleObjectives() <em>Incompatible Objectives</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncompatibleObjectives()
	 * @generated
	 * @ordered
	 */
	protected EList incompatibleObjectives;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimuV1Package.Literals.OBJECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getIncompatibleObjectives() {
		if (incompatibleObjectives == null) {
			incompatibleObjectives = new EObjectResolvingEList(Objective.class, this, SimuV1Package.OBJECTIVE__INCOMPATIBLE_OBJECTIVES);
		}
		return incompatibleObjectives;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.OBJECTIVE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimuV1Package.OBJECTIVE__INCOMPATIBLE_OBJECTIVES:
				return getIncompatibleObjectives();
			case SimuV1Package.OBJECTIVE__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimuV1Package.OBJECTIVE__INCOMPATIBLE_OBJECTIVES:
				getIncompatibleObjectives().clear();
				getIncompatibleObjectives().addAll((Collection)newValue);
				return;
			case SimuV1Package.OBJECTIVE__NAME:
				setName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimuV1Package.OBJECTIVE__INCOMPATIBLE_OBJECTIVES:
				getIncompatibleObjectives().clear();
				return;
			case SimuV1Package.OBJECTIVE__NAME:
				setName(NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimuV1Package.OBJECTIVE__INCOMPATIBLE_OBJECTIVES:
				return incompatibleObjectives != null && !incompatibleObjectives.isEmpty();
			case SimuV1Package.OBJECTIVE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ObjectiveImpl
