/**
 */
package AppliCitoyenne.simuV1.impl;

import AppliCitoyenne.simuV1.BotanicalStat;
import AppliCitoyenne.simuV1.SimuV1Package;
import AppliCitoyenne.simuV1.Target;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Botanical Stat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.impl.BotanicalStatImpl#getDirectIdentification <em>Direct Identification</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.BotanicalStatImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BotanicalStatImpl extends MinimalEObjectImpl.Container implements BotanicalStat {
	/**
	 * The default value of the '{@link #getDirectIdentification() <em>Direct Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectIdentification()
	 * @generated
	 * @ordered
	 */
	protected static final int DIRECT_IDENTIFICATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDirectIdentification() <em>Direct Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectIdentification()
	 * @generated
	 * @ordered
	 */
	protected int directIdentification = DIRECT_IDENTIFICATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Target target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BotanicalStatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimuV1Package.Literals.BOTANICAL_STAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDirectIdentification() {
		return directIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectIdentification(int newDirectIdentification) {
		int oldDirectIdentification = directIdentification;
		directIdentification = newDirectIdentification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.BOTANICAL_STAT__DIRECT_IDENTIFICATION, oldDirectIdentification, directIdentification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Target getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Target)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimuV1Package.BOTANICAL_STAT__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Target basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Target newTarget) {
		Target oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.BOTANICAL_STAT__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimuV1Package.BOTANICAL_STAT__DIRECT_IDENTIFICATION:
				return new Integer(getDirectIdentification());
			case SimuV1Package.BOTANICAL_STAT__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case SimuV1Package.BOTANICAL_STAT__DIRECT_IDENTIFICATION:
				setDirectIdentification(((Integer)newValue).intValue());
				return;
			case SimuV1Package.BOTANICAL_STAT__TARGET:
				setTarget((Target)newValue);
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
			case SimuV1Package.BOTANICAL_STAT__DIRECT_IDENTIFICATION:
				setDirectIdentification(DIRECT_IDENTIFICATION_EDEFAULT);
				return;
			case SimuV1Package.BOTANICAL_STAT__TARGET:
				setTarget((Target)null);
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
			case SimuV1Package.BOTANICAL_STAT__DIRECT_IDENTIFICATION:
				return directIdentification != DIRECT_IDENTIFICATION_EDEFAULT;
			case SimuV1Package.BOTANICAL_STAT__TARGET:
				return target != null;
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
		result.append(" (directIdentification: ");
		result.append(directIdentification);
		result.append(')');
		return result.toString();
	}

} //BotanicalStatImpl
