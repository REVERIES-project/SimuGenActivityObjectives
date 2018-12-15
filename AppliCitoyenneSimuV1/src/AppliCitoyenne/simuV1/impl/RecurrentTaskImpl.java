/**
 */
package AppliCitoyenne.simuV1.impl;

import AppliCitoyenne.simuV1.RecurrentTask;
import AppliCitoyenne.simuV1.SimpleTask;
import AppliCitoyenne.simuV1.SimuV1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recurrent Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.impl.RecurrentTaskImpl#getSubtask <em>Subtask</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecurrentTaskImpl extends StructuredTaskImpl implements RecurrentTask {
	/**
	 * The cached value of the '{@link #getSubtask() <em>Subtask</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtask()
	 * @generated
	 * @ordered
	 */
	protected SimpleTask subtask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecurrentTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimuV1Package.Literals.RECURRENT_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTask getSubtask() {
		return subtask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubtask(SimpleTask newSubtask, NotificationChain msgs) {
		SimpleTask oldSubtask = subtask;
		subtask = newSubtask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimuV1Package.RECURRENT_TASK__SUBTASK, oldSubtask, newSubtask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtask(SimpleTask newSubtask) {
		if (newSubtask != subtask) {
			NotificationChain msgs = null;
			if (subtask != null)
				msgs = ((InternalEObject)subtask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimuV1Package.RECURRENT_TASK__SUBTASK, null, msgs);
			if (newSubtask != null)
				msgs = ((InternalEObject)newSubtask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimuV1Package.RECURRENT_TASK__SUBTASK, null, msgs);
			msgs = basicSetSubtask(newSubtask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.RECURRENT_TASK__SUBTASK, newSubtask, newSubtask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimuV1Package.RECURRENT_TASK__SUBTASK:
				return basicSetSubtask(null, msgs);
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
			case SimuV1Package.RECURRENT_TASK__SUBTASK:
				return getSubtask();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimuV1Package.RECURRENT_TASK__SUBTASK:
				setSubtask((SimpleTask)newValue);
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
			case SimuV1Package.RECURRENT_TASK__SUBTASK:
				setSubtask((SimpleTask)null);
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
			case SimuV1Package.RECURRENT_TASK__SUBTASK:
				return subtask != null;
		}
		return super.eIsSet(featureID);
	}

} //RecurrentTaskImpl
