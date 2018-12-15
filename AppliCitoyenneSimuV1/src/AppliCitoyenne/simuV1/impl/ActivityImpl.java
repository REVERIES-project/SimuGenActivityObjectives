/**
 */
package AppliCitoyenne.simuV1.impl;

import AppliCitoyenne.simuV1.Activity;
import AppliCitoyenne.simuV1.GameObjective;
import AppliCitoyenne.simuV1.GameType;
import AppliCitoyenne.simuV1.GameTypeComp;
import AppliCitoyenne.simuV1.InventoryObjective;
import AppliCitoyenne.simuV1.LearningObjective;
import AppliCitoyenne.simuV1.Profile;
import AppliCitoyenne.simuV1.SimuV1Package;
import AppliCitoyenne.simuV1.Zone;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
 *   <li>{@link AppliCitoyenne.simuV1.impl.ActivityImpl#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.ActivityImpl#getGameZone <em>Game Zone</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.ActivityImpl#getGametypecomp <em>Gametypecomp</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.ActivityImpl#getGametype <em>Gametype</em>}</li>
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
	 * The default value of the '{@link #getInstruction() <em>Instruction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTRUCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstruction() <em>Instruction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction()
	 * @generated
	 * @ordered
	 */
	protected String instruction = INSTRUCTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGameZone() <em>Game Zone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameZone()
	 * @generated
	 * @ordered
	 */
	protected Zone gameZone;

	/**
	 * The cached value of the '{@link #getGametypecomp() <em>Gametypecomp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGametypecomp()
	 * @generated
	 * @ordered
	 */
	protected GameTypeComp gametypecomp;

	/**
	 * The cached value of the '{@link #getGametype() <em>Gametype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGametype()
	 * @generated
	 * @ordered
	 */
	protected GameType gametype;

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
	@Override
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
	public String getInstruction() {
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstruction(String newInstruction) {
		String oldInstruction = instruction;
		instruction = newInstruction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.ACTIVITY__INSTRUCTION, oldInstruction, instruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zone getGameZone() {
		return gameZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGameZone(Zone newGameZone, NotificationChain msgs) {
		Zone oldGameZone = gameZone;
		gameZone = newGameZone;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimuV1Package.ACTIVITY__GAME_ZONE, oldGameZone, newGameZone);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGameZone(Zone newGameZone) {
		if (newGameZone != gameZone) {
			NotificationChain msgs = null;
			if (gameZone != null)
				msgs = ((InternalEObject)gameZone).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimuV1Package.ACTIVITY__GAME_ZONE, null, msgs);
			if (newGameZone != null)
				msgs = ((InternalEObject)newGameZone).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimuV1Package.ACTIVITY__GAME_ZONE, null, msgs);
			msgs = basicSetGameZone(newGameZone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.ACTIVITY__GAME_ZONE, newGameZone, newGameZone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameTypeComp getGametypecomp() {
		return gametypecomp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGametypecomp(GameTypeComp newGametypecomp, NotificationChain msgs) {
		GameTypeComp oldGametypecomp = gametypecomp;
		gametypecomp = newGametypecomp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimuV1Package.ACTIVITY__GAMETYPECOMP, oldGametypecomp, newGametypecomp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGametypecomp(GameTypeComp newGametypecomp) {
		if (newGametypecomp != gametypecomp) {
			NotificationChain msgs = null;
			if (gametypecomp != null)
				msgs = ((InternalEObject)gametypecomp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimuV1Package.ACTIVITY__GAMETYPECOMP, null, msgs);
			if (newGametypecomp != null)
				msgs = ((InternalEObject)newGametypecomp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimuV1Package.ACTIVITY__GAMETYPECOMP, null, msgs);
			msgs = basicSetGametypecomp(newGametypecomp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.ACTIVITY__GAMETYPECOMP, newGametypecomp, newGametypecomp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameType getGametype() {
		if (gametype != null && gametype.eIsProxy()) {
			InternalEObject oldGametype = (InternalEObject)gametype;
			gametype = (GameType)eResolveProxy(oldGametype);
			if (gametype != oldGametype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimuV1Package.ACTIVITY__GAMETYPE, oldGametype, gametype));
			}
		}
		return gametype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameType basicGetGametype() {
		return gametype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGametype(GameType newGametype) {
		GameType oldGametype = gametype;
		gametype = newGametype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.ACTIVITY__GAMETYPE, oldGametype, gametype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimuV1Package.ACTIVITY__GAME_ZONE:
				return basicSetGameZone(null, msgs);
			case SimuV1Package.ACTIVITY__GAMETYPECOMP:
				return basicSetGametypecomp(null, msgs);
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
			case SimuV1Package.ACTIVITY__INSTRUCTION:
				return getInstruction();
			case SimuV1Package.ACTIVITY__GAME_ZONE:
				return getGameZone();
			case SimuV1Package.ACTIVITY__GAMETYPECOMP:
				return getGametypecomp();
			case SimuV1Package.ACTIVITY__GAMETYPE:
				if (resolve) return getGametype();
				return basicGetGametype();
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
			case SimuV1Package.ACTIVITY__INSTRUCTION:
				setInstruction((String)newValue);
				return;
			case SimuV1Package.ACTIVITY__GAME_ZONE:
				setGameZone((Zone)newValue);
				return;
			case SimuV1Package.ACTIVITY__GAMETYPECOMP:
				setGametypecomp((GameTypeComp)newValue);
				return;
			case SimuV1Package.ACTIVITY__GAMETYPE:
				setGametype((GameType)newValue);
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
			case SimuV1Package.ACTIVITY__INSTRUCTION:
				setInstruction(INSTRUCTION_EDEFAULT);
				return;
			case SimuV1Package.ACTIVITY__GAME_ZONE:
				setGameZone((Zone)null);
				return;
			case SimuV1Package.ACTIVITY__GAMETYPECOMP:
				setGametypecomp((GameTypeComp)null);
				return;
			case SimuV1Package.ACTIVITY__GAMETYPE:
				setGametype((GameType)null);
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
			case SimuV1Package.ACTIVITY__INVENTORYOBJECTIVE:
				return inventoryobjective != null;
			case SimuV1Package.ACTIVITY__LEARNINGOBJECTIVE:
				return learningobjective != null;
			case SimuV1Package.ACTIVITY__PROFILE:
				return profile != null;
			case SimuV1Package.ACTIVITY__GAMEOBJECTIVE:
				return gameobjective != null;
			case SimuV1Package.ACTIVITY__INSTRUCTION:
				return INSTRUCTION_EDEFAULT == null ? instruction != null : !INSTRUCTION_EDEFAULT.equals(instruction);
			case SimuV1Package.ACTIVITY__GAME_ZONE:
				return gameZone != null;
			case SimuV1Package.ACTIVITY__GAMETYPECOMP:
				return gametypecomp != null;
			case SimuV1Package.ACTIVITY__GAMETYPE:
				return gametype != null;
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
		result.append(" (instruction: ");
		result.append(instruction);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
