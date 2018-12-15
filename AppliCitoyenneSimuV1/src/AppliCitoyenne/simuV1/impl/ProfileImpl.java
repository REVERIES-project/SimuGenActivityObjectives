/**
 */
package AppliCitoyenne.simuV1.impl;

import AppliCitoyenne.simuV1.BotanicalProfile;
import AppliCitoyenne.simuV1.BotanicalSurvey;
import AppliCitoyenne.simuV1.GameProfile;
import AppliCitoyenne.simuV1.InventoryProfile;
import AppliCitoyenne.simuV1.Profile;
import AppliCitoyenne.simuV1.SimuV1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.impl.ProfileImpl#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.ProfileImpl#getLastname <em>Lastname</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.ProfileImpl#getInventoryprofile <em>Inventoryprofile</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.ProfileImpl#getBotanicalprofile <em>Botanicalprofile</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.ProfileImpl#getGameprofile <em>Gameprofile</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.ProfileImpl#getBotanicalsurvey <em>Botanicalsurvey</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProfileImpl extends MinimalEObjectImpl.Container implements Profile {
	/**
	 * The default value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected String firstname = FIRSTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastname()
	 * @generated
	 * @ordered
	 */
	protected static final String LASTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastname()
	 * @generated
	 * @ordered
	 */
	protected String lastname = LASTNAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInventoryprofile() <em>Inventoryprofile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryprofile()
	 * @generated
	 * @ordered
	 */
	protected InventoryProfile inventoryprofile;

	/**
	 * The cached value of the '{@link #getBotanicalprofile() <em>Botanicalprofile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBotanicalprofile()
	 * @generated
	 * @ordered
	 */
	protected BotanicalProfile botanicalprofile;

	/**
	 * The cached value of the '{@link #getGameprofile() <em>Gameprofile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameprofile()
	 * @generated
	 * @ordered
	 */
	protected GameProfile gameprofile;

	/**
	 * The cached value of the '{@link #getBotanicalsurvey() <em>Botanicalsurvey</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBotanicalsurvey()
	 * @generated
	 * @ordered
	 */
	protected EList<BotanicalSurvey> botanicalsurvey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimuV1Package.Literals.PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstname(String newFirstname) {
		String oldFirstname = firstname;
		firstname = newFirstname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.PROFILE__FIRSTNAME, oldFirstname, firstname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastname(String newLastname) {
		String oldLastname = lastname;
		lastname = newLastname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.PROFILE__LASTNAME, oldLastname, lastname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryProfile getInventoryprofile() {
		return inventoryprofile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInventoryprofile(InventoryProfile newInventoryprofile, NotificationChain msgs) {
		InventoryProfile oldInventoryprofile = inventoryprofile;
		inventoryprofile = newInventoryprofile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimuV1Package.PROFILE__INVENTORYPROFILE, oldInventoryprofile, newInventoryprofile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInventoryprofile(InventoryProfile newInventoryprofile) {
		if (newInventoryprofile != inventoryprofile) {
			NotificationChain msgs = null;
			if (inventoryprofile != null)
				msgs = ((InternalEObject)inventoryprofile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimuV1Package.PROFILE__INVENTORYPROFILE, null, msgs);
			if (newInventoryprofile != null)
				msgs = ((InternalEObject)newInventoryprofile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimuV1Package.PROFILE__INVENTORYPROFILE, null, msgs);
			msgs = basicSetInventoryprofile(newInventoryprofile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.PROFILE__INVENTORYPROFILE, newInventoryprofile, newInventoryprofile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BotanicalProfile getBotanicalprofile() {
		return botanicalprofile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBotanicalprofile(BotanicalProfile newBotanicalprofile, NotificationChain msgs) {
		BotanicalProfile oldBotanicalprofile = botanicalprofile;
		botanicalprofile = newBotanicalprofile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimuV1Package.PROFILE__BOTANICALPROFILE, oldBotanicalprofile, newBotanicalprofile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBotanicalprofile(BotanicalProfile newBotanicalprofile) {
		if (newBotanicalprofile != botanicalprofile) {
			NotificationChain msgs = null;
			if (botanicalprofile != null)
				msgs = ((InternalEObject)botanicalprofile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimuV1Package.PROFILE__BOTANICALPROFILE, null, msgs);
			if (newBotanicalprofile != null)
				msgs = ((InternalEObject)newBotanicalprofile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimuV1Package.PROFILE__BOTANICALPROFILE, null, msgs);
			msgs = basicSetBotanicalprofile(newBotanicalprofile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.PROFILE__BOTANICALPROFILE, newBotanicalprofile, newBotanicalprofile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameProfile getGameprofile() {
		return gameprofile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGameprofile(GameProfile newGameprofile, NotificationChain msgs) {
		GameProfile oldGameprofile = gameprofile;
		gameprofile = newGameprofile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimuV1Package.PROFILE__GAMEPROFILE, oldGameprofile, newGameprofile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGameprofile(GameProfile newGameprofile) {
		if (newGameprofile != gameprofile) {
			NotificationChain msgs = null;
			if (gameprofile != null)
				msgs = ((InternalEObject)gameprofile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimuV1Package.PROFILE__GAMEPROFILE, null, msgs);
			if (newGameprofile != null)
				msgs = ((InternalEObject)newGameprofile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimuV1Package.PROFILE__GAMEPROFILE, null, msgs);
			msgs = basicSetGameprofile(newGameprofile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.PROFILE__GAMEPROFILE, newGameprofile, newGameprofile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BotanicalSurvey> getBotanicalsurvey() {
		if (botanicalsurvey == null) {
			botanicalsurvey = new EObjectWithInverseResolvingEList<BotanicalSurvey>(BotanicalSurvey.class, this, SimuV1Package.PROFILE__BOTANICALSURVEY, SimuV1Package.BOTANICAL_SURVEY__PROFILE);
		}
		return botanicalsurvey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimuV1Package.PROFILE__BOTANICALSURVEY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBotanicalsurvey()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimuV1Package.PROFILE__INVENTORYPROFILE:
				return basicSetInventoryprofile(null, msgs);
			case SimuV1Package.PROFILE__BOTANICALPROFILE:
				return basicSetBotanicalprofile(null, msgs);
			case SimuV1Package.PROFILE__GAMEPROFILE:
				return basicSetGameprofile(null, msgs);
			case SimuV1Package.PROFILE__BOTANICALSURVEY:
				return ((InternalEList<?>)getBotanicalsurvey()).basicRemove(otherEnd, msgs);
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
			case SimuV1Package.PROFILE__FIRSTNAME:
				return getFirstname();
			case SimuV1Package.PROFILE__LASTNAME:
				return getLastname();
			case SimuV1Package.PROFILE__INVENTORYPROFILE:
				return getInventoryprofile();
			case SimuV1Package.PROFILE__BOTANICALPROFILE:
				return getBotanicalprofile();
			case SimuV1Package.PROFILE__GAMEPROFILE:
				return getGameprofile();
			case SimuV1Package.PROFILE__BOTANICALSURVEY:
				return getBotanicalsurvey();
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
			case SimuV1Package.PROFILE__FIRSTNAME:
				setFirstname((String)newValue);
				return;
			case SimuV1Package.PROFILE__LASTNAME:
				setLastname((String)newValue);
				return;
			case SimuV1Package.PROFILE__INVENTORYPROFILE:
				setInventoryprofile((InventoryProfile)newValue);
				return;
			case SimuV1Package.PROFILE__BOTANICALPROFILE:
				setBotanicalprofile((BotanicalProfile)newValue);
				return;
			case SimuV1Package.PROFILE__GAMEPROFILE:
				setGameprofile((GameProfile)newValue);
				return;
			case SimuV1Package.PROFILE__BOTANICALSURVEY:
				getBotanicalsurvey().clear();
				getBotanicalsurvey().addAll((Collection<? extends BotanicalSurvey>)newValue);
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
			case SimuV1Package.PROFILE__FIRSTNAME:
				setFirstname(FIRSTNAME_EDEFAULT);
				return;
			case SimuV1Package.PROFILE__LASTNAME:
				setLastname(LASTNAME_EDEFAULT);
				return;
			case SimuV1Package.PROFILE__INVENTORYPROFILE:
				setInventoryprofile((InventoryProfile)null);
				return;
			case SimuV1Package.PROFILE__BOTANICALPROFILE:
				setBotanicalprofile((BotanicalProfile)null);
				return;
			case SimuV1Package.PROFILE__GAMEPROFILE:
				setGameprofile((GameProfile)null);
				return;
			case SimuV1Package.PROFILE__BOTANICALSURVEY:
				getBotanicalsurvey().clear();
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
			case SimuV1Package.PROFILE__FIRSTNAME:
				return FIRSTNAME_EDEFAULT == null ? firstname != null : !FIRSTNAME_EDEFAULT.equals(firstname);
			case SimuV1Package.PROFILE__LASTNAME:
				return LASTNAME_EDEFAULT == null ? lastname != null : !LASTNAME_EDEFAULT.equals(lastname);
			case SimuV1Package.PROFILE__INVENTORYPROFILE:
				return inventoryprofile != null;
			case SimuV1Package.PROFILE__BOTANICALPROFILE:
				return botanicalprofile != null;
			case SimuV1Package.PROFILE__GAMEPROFILE:
				return gameprofile != null;
			case SimuV1Package.PROFILE__BOTANICALSURVEY:
				return botanicalsurvey != null && !botanicalsurvey.isEmpty();
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
		result.append(" (firstname: ");
		result.append(firstname);
		result.append(", lastname: ");
		result.append(lastname);
		result.append(')');
		return result.toString();
	}

} //ProfileImpl
