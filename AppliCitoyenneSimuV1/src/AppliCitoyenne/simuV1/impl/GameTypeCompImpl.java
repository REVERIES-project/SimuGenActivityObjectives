/**
 */
package AppliCitoyenne.simuV1.impl;

import AppliCitoyenne.simuV1.GameType;
import AppliCitoyenne.simuV1.GameTypeComp;
import AppliCitoyenne.simuV1.SimuV1Package;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Type Comp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.impl.GameTypeCompImpl#getGametype <em>Gametype</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.GameTypeCompImpl#getTimes <em>Times</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameTypeCompImpl extends MinimalEObjectImpl.Container implements GameTypeComp {
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
	 * The default value of the '{@link #getTimes() <em>Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimes()
	 * @generated
	 * @ordered
	 */
	protected static final int TIMES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimes() <em>Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimes()
	 * @generated
	 * @ordered
	 */
	protected int times = TIMES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameTypeCompImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimuV1Package.Literals.GAME_TYPE_COMP;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimuV1Package.GAME_TYPE_COMP__GAMETYPE, oldGametype, gametype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.GAME_TYPE_COMP__GAMETYPE, oldGametype, gametype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimes() {
		return times;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimes(int newTimes) {
		int oldTimes = times;
		times = newTimes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.GAME_TYPE_COMP__TIMES, oldTimes, times));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimuV1Package.GAME_TYPE_COMP__GAMETYPE:
				if (resolve) return getGametype();
				return basicGetGametype();
			case SimuV1Package.GAME_TYPE_COMP__TIMES:
				return getTimes();
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
			case SimuV1Package.GAME_TYPE_COMP__GAMETYPE:
				setGametype((GameType)newValue);
				return;
			case SimuV1Package.GAME_TYPE_COMP__TIMES:
				setTimes((Integer)newValue);
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
			case SimuV1Package.GAME_TYPE_COMP__GAMETYPE:
				setGametype((GameType)null);
				return;
			case SimuV1Package.GAME_TYPE_COMP__TIMES:
				setTimes(TIMES_EDEFAULT);
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
			case SimuV1Package.GAME_TYPE_COMP__GAMETYPE:
				return gametype != null;
			case SimuV1Package.GAME_TYPE_COMP__TIMES:
				return times != TIMES_EDEFAULT;
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
		result.append(" (times: ");
		result.append(times);
		result.append(')');
		return result.toString();
	}

} //GameTypeCompImpl
