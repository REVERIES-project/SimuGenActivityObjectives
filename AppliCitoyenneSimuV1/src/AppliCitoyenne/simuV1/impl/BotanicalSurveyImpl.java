/**
 */
package AppliCitoyenne.simuV1.impl;

import AppliCitoyenne.simuV1.BotanicalSurvey;
import AppliCitoyenne.simuV1.POI;
import AppliCitoyenne.simuV1.Profile;
import AppliCitoyenne.simuV1.SimuV1Package;
import AppliCitoyenne.simuV1.Target;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Botanical Survey</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.impl.BotanicalSurveyImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.BotanicalSurveyImpl#getDate <em>Date</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.BotanicalSurveyImpl#getPoi <em>Poi</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.BotanicalSurveyImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.BotanicalSurveyImpl#getId <em>Id</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.BotanicalSurveyImpl#getReliabilityScore <em>Reliability Score</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BotanicalSurveyImpl extends MinimalEObjectImpl.Container implements BotanicalSurvey {
	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected Profile profile;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPoi() <em>Poi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoi()
	 * @generated
	 * @ordered
	 */
	protected POI poi;

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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReliabilityScore() <em>Reliability Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliabilityScore()
	 * @generated
	 * @ordered
	 */
	protected static final int RELIABILITY_SCORE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReliabilityScore() <em>Reliability Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliabilityScore()
	 * @generated
	 * @ordered
	 */
	protected int reliabilityScore = RELIABILITY_SCORE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BotanicalSurveyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimuV1Package.Literals.BOTANICAL_SURVEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile getProfile() {
		if (profile != null && profile.eIsProxy()) {
			InternalEObject oldProfile = (InternalEObject)profile;
			profile = (Profile)eResolveProxy(oldProfile);
			if (profile != oldProfile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimuV1Package.BOTANICAL_SURVEY__PROFILE, oldProfile, profile));
			}
		}
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile basicGetProfile() {
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfile(Profile newProfile, NotificationChain msgs) {
		Profile oldProfile = profile;
		profile = newProfile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimuV1Package.BOTANICAL_SURVEY__PROFILE, oldProfile, newProfile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfile(Profile newProfile) {
		if (newProfile != profile) {
			NotificationChain msgs = null;
			if (profile != null)
				msgs = ((InternalEObject)profile).eInverseRemove(this, SimuV1Package.PROFILE__BOTANICALSURVEY, Profile.class, msgs);
			if (newProfile != null)
				msgs = ((InternalEObject)newProfile).eInverseAdd(this, SimuV1Package.PROFILE__BOTANICALSURVEY, Profile.class, msgs);
			msgs = basicSetProfile(newProfile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.BOTANICAL_SURVEY__PROFILE, newProfile, newProfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.BOTANICAL_SURVEY__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POI getPoi() {
		return poi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPoi(POI newPoi, NotificationChain msgs) {
		POI oldPoi = poi;
		poi = newPoi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimuV1Package.BOTANICAL_SURVEY__POI, oldPoi, newPoi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoi(POI newPoi) {
		if (newPoi != poi) {
			NotificationChain msgs = null;
			if (poi != null)
				msgs = ((InternalEObject)poi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimuV1Package.BOTANICAL_SURVEY__POI, null, msgs);
			if (newPoi != null)
				msgs = ((InternalEObject)newPoi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimuV1Package.BOTANICAL_SURVEY__POI, null, msgs);
			msgs = basicSetPoi(newPoi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.BOTANICAL_SURVEY__POI, newPoi, newPoi));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimuV1Package.BOTANICAL_SURVEY__TARGET, oldTarget, target));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.BOTANICAL_SURVEY__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.BOTANICAL_SURVEY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReliabilityScore() {
		return reliabilityScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReliabilityScore(int newReliabilityScore) {
		int oldReliabilityScore = reliabilityScore;
		reliabilityScore = newReliabilityScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.BOTANICAL_SURVEY__RELIABILITY_SCORE, oldReliabilityScore, reliabilityScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimuV1Package.BOTANICAL_SURVEY__PROFILE:
				if (profile != null)
					msgs = ((InternalEObject)profile).eInverseRemove(this, SimuV1Package.PROFILE__BOTANICALSURVEY, Profile.class, msgs);
				return basicSetProfile((Profile)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimuV1Package.BOTANICAL_SURVEY__PROFILE:
				return basicSetProfile(null, msgs);
			case SimuV1Package.BOTANICAL_SURVEY__POI:
				return basicSetPoi(null, msgs);
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
			case SimuV1Package.BOTANICAL_SURVEY__PROFILE:
				if (resolve) return getProfile();
				return basicGetProfile();
			case SimuV1Package.BOTANICAL_SURVEY__DATE:
				return getDate();
			case SimuV1Package.BOTANICAL_SURVEY__POI:
				return getPoi();
			case SimuV1Package.BOTANICAL_SURVEY__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case SimuV1Package.BOTANICAL_SURVEY__ID:
				return getId();
			case SimuV1Package.BOTANICAL_SURVEY__RELIABILITY_SCORE:
				return new Integer(getReliabilityScore());
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
			case SimuV1Package.BOTANICAL_SURVEY__PROFILE:
				setProfile((Profile)newValue);
				return;
			case SimuV1Package.BOTANICAL_SURVEY__DATE:
				setDate((Date)newValue);
				return;
			case SimuV1Package.BOTANICAL_SURVEY__POI:
				setPoi((POI)newValue);
				return;
			case SimuV1Package.BOTANICAL_SURVEY__TARGET:
				setTarget((Target)newValue);
				return;
			case SimuV1Package.BOTANICAL_SURVEY__ID:
				setId((String)newValue);
				return;
			case SimuV1Package.BOTANICAL_SURVEY__RELIABILITY_SCORE:
				setReliabilityScore(((Integer)newValue).intValue());
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
			case SimuV1Package.BOTANICAL_SURVEY__PROFILE:
				setProfile((Profile)null);
				return;
			case SimuV1Package.BOTANICAL_SURVEY__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case SimuV1Package.BOTANICAL_SURVEY__POI:
				setPoi((POI)null);
				return;
			case SimuV1Package.BOTANICAL_SURVEY__TARGET:
				setTarget((Target)null);
				return;
			case SimuV1Package.BOTANICAL_SURVEY__ID:
				setId(ID_EDEFAULT);
				return;
			case SimuV1Package.BOTANICAL_SURVEY__RELIABILITY_SCORE:
				setReliabilityScore(RELIABILITY_SCORE_EDEFAULT);
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
			case SimuV1Package.BOTANICAL_SURVEY__PROFILE:
				return profile != null;
			case SimuV1Package.BOTANICAL_SURVEY__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case SimuV1Package.BOTANICAL_SURVEY__POI:
				return poi != null;
			case SimuV1Package.BOTANICAL_SURVEY__TARGET:
				return target != null;
			case SimuV1Package.BOTANICAL_SURVEY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SimuV1Package.BOTANICAL_SURVEY__RELIABILITY_SCORE:
				return reliabilityScore != RELIABILITY_SCORE_EDEFAULT;
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
		result.append(" (date: ");
		result.append(date);
		result.append(", id: ");
		result.append(id);
		result.append(", reliabilityScore: ");
		result.append(reliabilityScore);
		result.append(')');
		return result.toString();
	}

} //BotanicalSurveyImpl
