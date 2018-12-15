/**
 */
package AppliCitoyenne.simuV1.impl;

import AppliCitoyenne.simuV1.BotanicalProfile;
import AppliCitoyenne.simuV1.BotanicalStat;
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
 * An implementation of the model object '<em><b>Botanical Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.impl.BotanicalProfileImpl#getBotanicalstat <em>Botanicalstat</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.BotanicalProfileImpl#isNoInterest <em>No Interest</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BotanicalProfileImpl extends MinimalEObjectImpl.Container implements BotanicalProfile {
	/**
	 * The cached value of the '{@link #getBotanicalstat() <em>Botanicalstat</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBotanicalstat()
	 * @generated
	 * @ordered
	 */
	protected EList<BotanicalStat> botanicalstat;

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
	protected BotanicalProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimuV1Package.Literals.BOTANICAL_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BotanicalStat> getBotanicalstat() {
		if (botanicalstat == null) {
			botanicalstat = new EObjectContainmentEList<BotanicalStat>(BotanicalStat.class, this, SimuV1Package.BOTANICAL_PROFILE__BOTANICALSTAT);
		}
		return botanicalstat;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.BOTANICAL_PROFILE__NO_INTEREST, oldNoInterest, noInterest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimuV1Package.BOTANICAL_PROFILE__BOTANICALSTAT:
				return ((InternalEList<?>)getBotanicalstat()).basicRemove(otherEnd, msgs);
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
			case SimuV1Package.BOTANICAL_PROFILE__BOTANICALSTAT:
				return getBotanicalstat();
			case SimuV1Package.BOTANICAL_PROFILE__NO_INTEREST:
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
			case SimuV1Package.BOTANICAL_PROFILE__BOTANICALSTAT:
				getBotanicalstat().clear();
				getBotanicalstat().addAll((Collection<? extends BotanicalStat>)newValue);
				return;
			case SimuV1Package.BOTANICAL_PROFILE__NO_INTEREST:
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
			case SimuV1Package.BOTANICAL_PROFILE__BOTANICALSTAT:
				getBotanicalstat().clear();
				return;
			case SimuV1Package.BOTANICAL_PROFILE__NO_INTEREST:
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
			case SimuV1Package.BOTANICAL_PROFILE__BOTANICALSTAT:
				return botanicalstat != null && !botanicalstat.isEmpty();
			case SimuV1Package.BOTANICAL_PROFILE__NO_INTEREST:
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

} //BotanicalProfileImpl
