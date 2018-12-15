/**
 */
package AppliCitoyenne.simuV1.impl;

import AppliCitoyenne.simuV1.Actions2Detect;
import AppliCitoyenne.simuV1.AppDesc;
import AppliCitoyenne.simuV1.BotanicalFlore;
import AppliCitoyenne.simuV1.GameTypes;
import AppliCitoyenne.simuV1.Objectives;
import AppliCitoyenne.simuV1.SimuV1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App Desc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.impl.AppDescImpl#getObjective <em>Objective</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.AppDescImpl#getBotanicalflore <em>Botanicalflore</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.AppDescImpl#getGametypes <em>Gametypes</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.AppDescImpl#getActions2detect <em>Actions2detect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppDescImpl extends MinimalEObjectImpl.Container implements AppDesc {
	/**
	 * The cached value of the '{@link #getObjective() <em>Objective</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjective()
	 * @generated
	 * @ordered
	 */
	protected Objectives objective;

	/**
	 * The cached value of the '{@link #getBotanicalflore() <em>Botanicalflore</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBotanicalflore()
	 * @generated
	 * @ordered
	 */
	protected BotanicalFlore botanicalflore;

	/**
	 * The cached value of the '{@link #getGametypes() <em>Gametypes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGametypes()
	 * @generated
	 * @ordered
	 */
	protected GameTypes gametypes;

	/**
	 * The cached value of the '{@link #getActions2detect() <em>Actions2detect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions2detect()
	 * @generated
	 * @ordered
	 */
	protected Actions2Detect actions2detect;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppDescImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimuV1Package.Literals.APP_DESC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objectives getObjective() {
		return objective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjective(Objectives newObjective, NotificationChain msgs) {
		Objectives oldObjective = objective;
		objective = newObjective;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimuV1Package.APP_DESC__OBJECTIVE, oldObjective, newObjective);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjective(Objectives newObjective) {
		if (newObjective != objective) {
			NotificationChain msgs = null;
			if (objective != null)
				msgs = ((InternalEObject)objective).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimuV1Package.APP_DESC__OBJECTIVE, null, msgs);
			if (newObjective != null)
				msgs = ((InternalEObject)newObjective).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimuV1Package.APP_DESC__OBJECTIVE, null, msgs);
			msgs = basicSetObjective(newObjective, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.APP_DESC__OBJECTIVE, newObjective, newObjective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BotanicalFlore getBotanicalflore() {
		return botanicalflore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBotanicalflore(BotanicalFlore newBotanicalflore, NotificationChain msgs) {
		BotanicalFlore oldBotanicalflore = botanicalflore;
		botanicalflore = newBotanicalflore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimuV1Package.APP_DESC__BOTANICALFLORE, oldBotanicalflore, newBotanicalflore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBotanicalflore(BotanicalFlore newBotanicalflore) {
		if (newBotanicalflore != botanicalflore) {
			NotificationChain msgs = null;
			if (botanicalflore != null)
				msgs = ((InternalEObject)botanicalflore).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimuV1Package.APP_DESC__BOTANICALFLORE, null, msgs);
			if (newBotanicalflore != null)
				msgs = ((InternalEObject)newBotanicalflore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimuV1Package.APP_DESC__BOTANICALFLORE, null, msgs);
			msgs = basicSetBotanicalflore(newBotanicalflore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.APP_DESC__BOTANICALFLORE, newBotanicalflore, newBotanicalflore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameTypes getGametypes() {
		return gametypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGametypes(GameTypes newGametypes, NotificationChain msgs) {
		GameTypes oldGametypes = gametypes;
		gametypes = newGametypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimuV1Package.APP_DESC__GAMETYPES, oldGametypes, newGametypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGametypes(GameTypes newGametypes) {
		if (newGametypes != gametypes) {
			NotificationChain msgs = null;
			if (gametypes != null)
				msgs = ((InternalEObject)gametypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimuV1Package.APP_DESC__GAMETYPES, null, msgs);
			if (newGametypes != null)
				msgs = ((InternalEObject)newGametypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimuV1Package.APP_DESC__GAMETYPES, null, msgs);
			msgs = basicSetGametypes(newGametypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.APP_DESC__GAMETYPES, newGametypes, newGametypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actions2Detect getActions2detect() {
		return actions2detect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActions2detect(Actions2Detect newActions2detect, NotificationChain msgs) {
		Actions2Detect oldActions2detect = actions2detect;
		actions2detect = newActions2detect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimuV1Package.APP_DESC__ACTIONS2DETECT, oldActions2detect, newActions2detect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActions2detect(Actions2Detect newActions2detect) {
		if (newActions2detect != actions2detect) {
			NotificationChain msgs = null;
			if (actions2detect != null)
				msgs = ((InternalEObject)actions2detect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimuV1Package.APP_DESC__ACTIONS2DETECT, null, msgs);
			if (newActions2detect != null)
				msgs = ((InternalEObject)newActions2detect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimuV1Package.APP_DESC__ACTIONS2DETECT, null, msgs);
			msgs = basicSetActions2detect(newActions2detect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.APP_DESC__ACTIONS2DETECT, newActions2detect, newActions2detect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimuV1Package.APP_DESC__OBJECTIVE:
				return basicSetObjective(null, msgs);
			case SimuV1Package.APP_DESC__BOTANICALFLORE:
				return basicSetBotanicalflore(null, msgs);
			case SimuV1Package.APP_DESC__GAMETYPES:
				return basicSetGametypes(null, msgs);
			case SimuV1Package.APP_DESC__ACTIONS2DETECT:
				return basicSetActions2detect(null, msgs);
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
			case SimuV1Package.APP_DESC__OBJECTIVE:
				return getObjective();
			case SimuV1Package.APP_DESC__BOTANICALFLORE:
				return getBotanicalflore();
			case SimuV1Package.APP_DESC__GAMETYPES:
				return getGametypes();
			case SimuV1Package.APP_DESC__ACTIONS2DETECT:
				return getActions2detect();
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
			case SimuV1Package.APP_DESC__OBJECTIVE:
				setObjective((Objectives)newValue);
				return;
			case SimuV1Package.APP_DESC__BOTANICALFLORE:
				setBotanicalflore((BotanicalFlore)newValue);
				return;
			case SimuV1Package.APP_DESC__GAMETYPES:
				setGametypes((GameTypes)newValue);
				return;
			case SimuV1Package.APP_DESC__ACTIONS2DETECT:
				setActions2detect((Actions2Detect)newValue);
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
			case SimuV1Package.APP_DESC__OBJECTIVE:
				setObjective((Objectives)null);
				return;
			case SimuV1Package.APP_DESC__BOTANICALFLORE:
				setBotanicalflore((BotanicalFlore)null);
				return;
			case SimuV1Package.APP_DESC__GAMETYPES:
				setGametypes((GameTypes)null);
				return;
			case SimuV1Package.APP_DESC__ACTIONS2DETECT:
				setActions2detect((Actions2Detect)null);
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
			case SimuV1Package.APP_DESC__OBJECTIVE:
				return objective != null;
			case SimuV1Package.APP_DESC__BOTANICALFLORE:
				return botanicalflore != null;
			case SimuV1Package.APP_DESC__GAMETYPES:
				return gametypes != null;
			case SimuV1Package.APP_DESC__ACTIONS2DETECT:
				return actions2detect != null;
		}
		return super.eIsSet(featureID);
	}

} //AppDescImpl
