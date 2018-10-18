/**
 */
package AppliCitoyenne.simuV1.impl;

import AppliCitoyenne.simuV1.Activity;
import AppliCitoyenne.simuV1.GameObjective;
import AppliCitoyenne.simuV1.InventoryObjective;
import AppliCitoyenne.simuV1.LearningObjective;
import AppliCitoyenne.simuV1.Profile;
import AppliCitoyenne.simuV1.SimuV1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.impl.ActivityImpl#getInventoryobjective <em>Inventoryobjective</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.ActivityImpl#getLearningobjective <em>Learningobjective</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.ActivityImpl#getProfile <em>Profile</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.ActivityImpl#getGameobjective <em>Gameobjective</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends MinimalEObjectImpl.Container implements Activity {
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
	 * The cached value of the '{@link #getLearningobjective() <em>Learningobjective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLearningobjective()
	 * @generated
	 * @ordered
	 */
	protected LearningObjective learningobjective;

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
	 * The cached value of the '{@link #getGameobjective() <em>Gameobjective</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameobjective()
	 * @generated
	 * @ordered
	 */
	protected GameObjective gameobjective;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimuV1Package.Literals.ACTIVITY;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimuV1Package.ACTIVITY__INVENTORYOBJECTIVE, oldInventoryobjective, inventoryobjective));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.ACTIVITY__INVENTORYOBJECTIVE, oldInventoryobjective, inventoryobjective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningObjective getLearningobjective() {
		if (learningobjective != null && learningobjective.eIsProxy()) {
			InternalEObject oldLearningobjective = (InternalEObject)learningobjective;
			learningobjective = (LearningObjective)eResolveProxy(oldLearningobjective);
			if (learningobjective != oldLearningobjective) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimuV1Package.ACTIVITY__LEARNINGOBJECTIVE, oldLearningobjective, learningobjective));
			}
		}
		return learningobjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LearningObjective basicGetLearningobjective() {
		return learningobjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLearningobjective(LearningObjective newLearningobjective) {
		LearningObjective oldLearningobjective = learningobjective;
		learningobjective = newLearningobjective;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.ACTIVITY__LEARNINGOBJECTIVE, oldLearningobjective, learningobjective));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimuV1Package.ACTIVITY__PROFILE, oldProfile, profile));
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
	public void setProfile(Profile newProfile) {
		Profile oldProfile = profile;
		profile = newProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.ACTIVITY__PROFILE, oldProfile, profile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameObjective getGameobjective() {
		if (gameobjective != null && gameobjective.eIsProxy()) {
			InternalEObject oldGameobjective = (InternalEObject)gameobjective;
			gameobjective = (GameObjective)eResolveProxy(oldGameobjective);
			if (gameobjective != oldGameobjective) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimuV1Package.ACTIVITY__GAMEOBJECTIVE, oldGameobjective, gameobjective));
			}
		}
		return gameobjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameObjective basicGetGameobjective() {
		return gameobjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGameobjective(GameObjective newGameobjective) {
		GameObjective oldGameobjective = gameobjective;
		gameobjective = newGameobjective;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.ACTIVITY__GAMEOBJECTIVE, oldGameobjective, gameobjective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimuV1Package.ACTIVITY__INVENTORYOBJECTIVE:
				if (resolve) return getInventoryobjective();
				return basicGetInventoryobjective();
			case SimuV1Package.ACTIVITY__LEARNINGOBJECTIVE:
				if (resolve) return getLearningobjective();
				return basicGetLearningobjective();
			case SimuV1Package.ACTIVITY__PROFILE:
				if (resolve) return getProfile();
				return basicGetProfile();
			case SimuV1Package.ACTIVITY__GAMEOBJECTIVE:
				if (resolve) return getGameobjective();
				return basicGetGameobjective();
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
			case SimuV1Package.ACTIVITY__INVENTORYOBJECTIVE:
				setInventoryobjective((InventoryObjective)newValue);
				return;
			case SimuV1Package.ACTIVITY__LEARNINGOBJECTIVE:
				setLearningobjective((LearningObjective)newValue);
				return;
			case SimuV1Package.ACTIVITY__PROFILE:
				setProfile((Profile)newValue);
				return;
			case SimuV1Package.ACTIVITY__GAMEOBJECTIVE:
				setGameobjective((GameObjective)newValue);
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
			case SimuV1Package.ACTIVITY__INVENTORYOBJECTIVE:
				setInventoryobjective((InventoryObjective)null);
				return;
			case SimuV1Package.ACTIVITY__LEARNINGOBJECTIVE:
				setLearningobjective((LearningObjective)null);
				return;
			case SimuV1Package.ACTIVITY__PROFILE:
				setProfile((Profile)null);
				return;
			case SimuV1Package.ACTIVITY__GAMEOBJECTIVE:
				setGameobjective((GameObjective)null);
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
			case SimuV1Package.ACTIVITY__INVENTORYOBJECTIVE:
				return inventoryobjective != null;
			case SimuV1Package.ACTIVITY__LEARNINGOBJECTIVE:
				return learningobjective != null;
			case SimuV1Package.ACTIVITY__PROFILE:
				return profile != null;
			case SimuV1Package.ACTIVITY__GAMEOBJECTIVE:
				return gameobjective != null;
		}
		return super.eIsSet(featureID);
	}

} //ActivityImpl
