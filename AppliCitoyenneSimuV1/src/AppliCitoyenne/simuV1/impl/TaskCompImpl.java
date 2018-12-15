/**
 */
package AppliCitoyenne.simuV1.impl;

import AppliCitoyenne.simuV1.Action2Detect;
import AppliCitoyenne.simuV1.SimuV1Package;
import AppliCitoyenne.simuV1.Target;
import AppliCitoyenne.simuV1.TaskComp;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Comp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.impl.TaskCompImpl#getAction2detect <em>Action2detect</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.TaskCompImpl#getNewspeciessurvey <em>Newspeciessurvey</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskCompImpl extends MinimalEObjectImpl.Container implements TaskComp {
	/**
	 * The cached value of the '{@link #getAction2detect() <em>Action2detect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction2detect()
	 * @generated
	 * @ordered
	 */
	protected Action2Detect action2detect;

	/**
	 * The cached value of the '{@link #getNewspeciessurvey() <em>Newspeciessurvey</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewspeciessurvey()
	 * @generated
	 * @ordered
	 */
	protected Target newspeciessurvey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskCompImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimuV1Package.Literals.TASK_COMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action2Detect getAction2detect() {
		if (action2detect != null && action2detect.eIsProxy()) {
			InternalEObject oldAction2detect = (InternalEObject)action2detect;
			action2detect = (Action2Detect)eResolveProxy(oldAction2detect);
			if (action2detect != oldAction2detect) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimuV1Package.TASK_COMP__ACTION2DETECT, oldAction2detect, action2detect));
			}
		}
		return action2detect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action2Detect basicGetAction2detect() {
		return action2detect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction2detect(Action2Detect newAction2detect) {
		Action2Detect oldAction2detect = action2detect;
		action2detect = newAction2detect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.TASK_COMP__ACTION2DETECT, oldAction2detect, action2detect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Target getNewspeciessurvey() {
		if (newspeciessurvey != null && newspeciessurvey.eIsProxy()) {
			InternalEObject oldNewspeciessurvey = (InternalEObject)newspeciessurvey;
			newspeciessurvey = (Target)eResolveProxy(oldNewspeciessurvey);
			if (newspeciessurvey != oldNewspeciessurvey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimuV1Package.TASK_COMP__NEWSPECIESSURVEY, oldNewspeciessurvey, newspeciessurvey));
			}
		}
		return newspeciessurvey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Target basicGetNewspeciessurvey() {
		return newspeciessurvey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewspeciessurvey(Target newNewspeciessurvey) {
		Target oldNewspeciessurvey = newspeciessurvey;
		newspeciessurvey = newNewspeciessurvey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.TASK_COMP__NEWSPECIESSURVEY, oldNewspeciessurvey, newspeciessurvey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimuV1Package.TASK_COMP__ACTION2DETECT:
				if (resolve) return getAction2detect();
				return basicGetAction2detect();
			case SimuV1Package.TASK_COMP__NEWSPECIESSURVEY:
				if (resolve) return getNewspeciessurvey();
				return basicGetNewspeciessurvey();
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
			case SimuV1Package.TASK_COMP__ACTION2DETECT:
				setAction2detect((Action2Detect)newValue);
				return;
			case SimuV1Package.TASK_COMP__NEWSPECIESSURVEY:
				setNewspeciessurvey((Target)newValue);
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
			case SimuV1Package.TASK_COMP__ACTION2DETECT:
				setAction2detect((Action2Detect)null);
				return;
			case SimuV1Package.TASK_COMP__NEWSPECIESSURVEY:
				setNewspeciessurvey((Target)null);
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
			case SimuV1Package.TASK_COMP__ACTION2DETECT:
				return action2detect != null;
			case SimuV1Package.TASK_COMP__NEWSPECIESSURVEY:
				return newspeciessurvey != null;
		}
		return super.eIsSet(featureID);
	}

} //TaskCompImpl
