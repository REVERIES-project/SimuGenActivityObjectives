/**
 */
package AppliCitoyenne.simuV1.impl;

import AppliCitoyenne.simuV1.Action2Detect;
import AppliCitoyenne.simuV1.Actions2Detect;
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
 * An implementation of the model object '<em><b>Actions2 Detect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.impl.Actions2DetectImpl#getAction2detect <em>Action2detect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Actions2DetectImpl extends MinimalEObjectImpl.Container implements Actions2Detect {
	/**
	 * The cached value of the '{@link #getAction2detect() <em>Action2detect</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction2detect()
	 * @generated
	 * @ordered
	 */
	protected EList<Action2Detect> action2detect;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Actions2DetectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimuV1Package.Literals.ACTIONS2_DETECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action2Detect> getAction2detect() {
		if (action2detect == null) {
			action2detect = new EObjectContainmentEList<Action2Detect>(Action2Detect.class, this, SimuV1Package.ACTIONS2_DETECT__ACTION2DETECT);
		}
		return action2detect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimuV1Package.ACTIONS2_DETECT__ACTION2DETECT:
				return ((InternalEList<?>)getAction2detect()).basicRemove(otherEnd, msgs);
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
			case SimuV1Package.ACTIONS2_DETECT__ACTION2DETECT:
				return getAction2detect();
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
			case SimuV1Package.ACTIONS2_DETECT__ACTION2DETECT:
				getAction2detect().clear();
				getAction2detect().addAll((Collection<? extends Action2Detect>)newValue);
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
			case SimuV1Package.ACTIONS2_DETECT__ACTION2DETECT:
				getAction2detect().clear();
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
			case SimuV1Package.ACTIONS2_DETECT__ACTION2DETECT:
				return action2detect != null && !action2detect.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Actions2DetectImpl
