/**
 */
package AppliCitoyenne.simuV1.impl;

import AppliCitoyenne.simuV1.BotanicalStat;
import AppliCitoyenne.simuV1.InventoryPref;
import AppliCitoyenne.simuV1.InventoryProfile;
import AppliCitoyenne.simuV1.SimuV1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.impl.InventoryProfileImpl#getInventorypref <em>Inventorypref</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.InventoryProfileImpl#getBotanicalstat <em>Botanicalstat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InventoryProfileImpl extends MinimalEObjectImpl.Container implements InventoryProfile {
	/**
	 * The cached value of the '{@link #getInventorypref() <em>Inventorypref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventorypref()
	 * @generated
	 * @ordered
	 */
	protected EList inventorypref;

	/**
	 * The cached value of the '{@link #getBotanicalstat() <em>Botanicalstat</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBotanicalstat()
	 * @generated
	 * @ordered
	 */
	protected EList botanicalstat;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventoryProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimuV1Package.Literals.INVENTORY_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInventorypref() {
		if (inventorypref == null) {
			inventorypref = new EObjectContainmentEList(InventoryPref.class, this, SimuV1Package.INVENTORY_PROFILE__INVENTORYPREF);
		}
		return inventorypref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBotanicalstat() {
		if (botanicalstat == null) {
			botanicalstat = new EObjectContainmentEList(BotanicalStat.class, this, SimuV1Package.INVENTORY_PROFILE__BOTANICALSTAT);
		}
		return botanicalstat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimuV1Package.INVENTORY_PROFILE__INVENTORYPREF:
				return ((InternalEList)getInventorypref()).basicRemove(otherEnd, msgs);
			case SimuV1Package.INVENTORY_PROFILE__BOTANICALSTAT:
				return ((InternalEList)getBotanicalstat()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimuV1Package.INVENTORY_PROFILE__INVENTORYPREF:
				return getInventorypref();
			case SimuV1Package.INVENTORY_PROFILE__BOTANICALSTAT:
				return getBotanicalstat();
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
			case SimuV1Package.INVENTORY_PROFILE__INVENTORYPREF:
				getInventorypref().clear();
				getInventorypref().addAll((Collection)newValue);
				return;
			case SimuV1Package.INVENTORY_PROFILE__BOTANICALSTAT:
				getBotanicalstat().clear();
				getBotanicalstat().addAll((Collection)newValue);
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
			case SimuV1Package.INVENTORY_PROFILE__INVENTORYPREF:
				getInventorypref().clear();
				return;
			case SimuV1Package.INVENTORY_PROFILE__BOTANICALSTAT:
				getBotanicalstat().clear();
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
			case SimuV1Package.INVENTORY_PROFILE__INVENTORYPREF:
				return inventorypref != null && !inventorypref.isEmpty();
			case SimuV1Package.INVENTORY_PROFILE__BOTANICALSTAT:
				return botanicalstat != null && !botanicalstat.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InventoryProfileImpl
