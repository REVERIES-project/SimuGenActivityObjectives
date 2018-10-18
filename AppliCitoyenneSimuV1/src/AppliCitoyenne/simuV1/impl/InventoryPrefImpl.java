/**
 */
package AppliCitoyenne.simuV1.impl;

import AppliCitoyenne.simuV1.InventoryObjective;
import AppliCitoyenne.simuV1.InventoryPref;
import AppliCitoyenne.simuV1.SimuV1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory Pref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.impl.InventoryPrefImpl#getInventoryobjective <em>Inventoryobjective</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.InventoryPrefImpl#getPonderation <em>Ponderation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InventoryPrefImpl extends MinimalEObjectImpl.Container implements InventoryPref {
	/**
	 * The cached value of the '{@link #getInventoryobjective() <em>Inventoryobjective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryobjective()
	 * @generated
	 * @ordered
	 */
	protected InventoryObjective inventoryobjective;

	/**
	 * The default value of the '{@link #getPonderation() <em>Ponderation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPonderation()
	 * @generated
	 * @ordered
	 */
	protected static final int PONDERATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPonderation() <em>Ponderation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPonderation()
	 * @generated
	 * @ordered
	 */
	protected int ponderation = PONDERATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventoryPrefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimuV1Package.Literals.INVENTORY_PREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryObjective getInventoryobjective() {
		if (inventoryobjective != null && inventoryobjective.eIsProxy()) {
			InternalEObject oldInventoryobjective = (InternalEObject)inventoryobjective;
			inventoryobjective = (InventoryObjective)eResolveProxy(oldInventoryobjective);
			if (inventoryobjective != oldInventoryobjective) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimuV1Package.INVENTORY_PREF__INVENTORYOBJECTIVE, oldInventoryobjective, inventoryobjective));
			}
		}
		return inventoryobjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryObjective basicGetInventoryobjective() {
		return inventoryobjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInventoryobjective(InventoryObjective newInventoryobjective) {
		InventoryObjective oldInventoryobjective = inventoryobjective;
		inventoryobjective = newInventoryobjective;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.INVENTORY_PREF__INVENTORYOBJECTIVE, oldInventoryobjective, inventoryobjective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPonderation() {
		return ponderation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPonderation(int newPonderation) {
		int oldPonderation = ponderation;
		ponderation = newPonderation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.INVENTORY_PREF__PONDERATION, oldPonderation, ponderation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimuV1Package.INVENTORY_PREF__INVENTORYOBJECTIVE:
				if (resolve) return getInventoryobjective();
				return basicGetInventoryobjective();
			case SimuV1Package.INVENTORY_PREF__PONDERATION:
				return new Integer(getPonderation());
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
			case SimuV1Package.INVENTORY_PREF__INVENTORYOBJECTIVE:
				setInventoryobjective((InventoryObjective)newValue);
				return;
			case SimuV1Package.INVENTORY_PREF__PONDERATION:
				setPonderation(((Integer)newValue).intValue());
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
			case SimuV1Package.INVENTORY_PREF__INVENTORYOBJECTIVE:
				setInventoryobjective((InventoryObjective)null);
				return;
			case SimuV1Package.INVENTORY_PREF__PONDERATION:
				setPonderation(PONDERATION_EDEFAULT);
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
			case SimuV1Package.INVENTORY_PREF__INVENTORYOBJECTIVE:
				return inventoryobjective != null;
			case SimuV1Package.INVENTORY_PREF__PONDERATION:
				return ponderation != PONDERATION_EDEFAULT;
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
		result.append(" (ponderation: ");
		result.append(ponderation);
		result.append(')');
		return result.toString();
	}

} //InventoryPrefImpl
