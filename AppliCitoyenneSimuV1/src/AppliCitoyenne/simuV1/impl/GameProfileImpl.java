/**
 */
package AppliCitoyenne.simuV1.impl;

import AppliCitoyenne.simuV1.GameProfile;
import AppliCitoyenne.simuV1.GameTypePref;
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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.impl.GameProfileImpl#getGametypepref <em>Gametypepref</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.GameProfileImpl#isNoInterest <em>No Interest</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameProfileImpl extends MinimalEObjectImpl.Container implements GameProfile {
	/**
	 * The cached value of the '{@link #getGametypepref() <em>Gametypepref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGametypepref()
	 * @generated
	 * @ordered
	 */
	protected EList<GameTypePref> gametypepref;

	/**
	 * The default value of the '{@link #isNoInterest() <em>No Interest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoInterest()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_INTEREST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoInterest() <em>No Interest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoInterest()
	 * @generated
	 * @ordered
	 */
	protected boolean noInterest = NO_INTEREST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimuV1Package.Literals.GAME_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GameTypePref> getGametypepref() {
		if (gametypepref == null) {
			gametypepref = new EObjectContainmentEList<GameTypePref>(GameTypePref.class, this, SimuV1Package.GAME_PROFILE__GAMETYPEPREF);
		}
		return gametypepref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNoInterest() {
		return noInterest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoInterest(boolean newNoInterest) {
		boolean oldNoInterest = noInterest;
		noInterest = newNoInterest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.GAME_PROFILE__NO_INTEREST, oldNoInterest, noInterest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimuV1Package.GAME_PROFILE__GAMETYPEPREF:
				return ((InternalEList<?>)getGametypepref()).basicRemove(otherEnd, msgs);
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
			case SimuV1Package.GAME_PROFILE__GAMETYPEPREF:
				return getGametypepref();
			case SimuV1Package.GAME_PROFILE__NO_INTEREST:
				return isNoInterest();
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
			case SimuV1Package.GAME_PROFILE__GAMETYPEPREF:
				getGametypepref().clear();
				getGametypepref().addAll((Collection<? extends GameTypePref>)newValue);
				return;
			case SimuV1Package.GAME_PROFILE__NO_INTEREST:
				setNoInterest((Boolean)newValue);
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
			case SimuV1Package.GAME_PROFILE__GAMETYPEPREF:
				getGametypepref().clear();
				return;
			case SimuV1Package.GAME_PROFILE__NO_INTEREST:
				setNoInterest(NO_INTEREST_EDEFAULT);
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
			case SimuV1Package.GAME_PROFILE__GAMETYPEPREF:
				return gametypepref != null && !gametypepref.isEmpty();
			case SimuV1Package.GAME_PROFILE__NO_INTEREST:
				return noInterest != NO_INTEREST_EDEFAULT;
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
		result.append(" (noInterest: ");
		result.append(noInterest);
		result.append(')');
		return result.toString();
	}

} //GameProfileImpl
