/**
 */
package AppliCitoyenne.simuV1.impl;

import AppliCitoyenne.simuV1.GameObjective;
import AppliCitoyenne.simuV1.GameTypePref;
import AppliCitoyenne.simuV1.SimuV1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Type Pref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.impl.GameTypePrefImpl#getPonderation <em>Ponderation</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.GameTypePrefImpl#getGameobjective <em>Gameobjective</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameTypePrefImpl extends MinimalEObjectImpl.Container implements GameTypePref {
	/**
	 * The default value of the '{@link #getPonderation() <em>Ponderation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPonderation()
	 * @generated
	 * @ordered
	 */
	protected static final int PONDERATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPonderation() <em>Ponderation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPonderation()
	 * @generated
	 * @ordered
	 */
	protected int ponderation = PONDERATION_EDEFAULT;

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
	protected GameTypePrefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimuV1Package.Literals.GAME_TYPE_PREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPonderation() {
		return ponderation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPonderation(int newPonderation) {
		int oldPonderation = ponderation;
		ponderation = newPonderation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.GAME_TYPE_PREF__PONDERATION, oldPonderation, ponderation));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimuV1Package.GAME_TYPE_PREF__GAMEOBJECTIVE, oldGameobjective, gameobjective));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.GAME_TYPE_PREF__GAMEOBJECTIVE, oldGameobjective, gameobjective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimuV1Package.GAME_TYPE_PREF__PONDERATION:
				return getPonderation();
			case SimuV1Package.GAME_TYPE_PREF__GAMEOBJECTIVE:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimuV1Package.GAME_TYPE_PREF__PONDERATION:
				setPonderation((Integer)newValue);
				return;
			case SimuV1Package.GAME_TYPE_PREF__GAMEOBJECTIVE:
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
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimuV1Package.GAME_TYPE_PREF__PONDERATION:
				setPonderation(PONDERATION_EDEFAULT);
				return;
			case SimuV1Package.GAME_TYPE_PREF__GAMEOBJECTIVE:
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimuV1Package.GAME_TYPE_PREF__PONDERATION:
				return ponderation != PONDERATION_EDEFAULT;
			case SimuV1Package.GAME_TYPE_PREF__GAMEOBJECTIVE:
				return gameobjective != null;
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
		result.append(" (ponderation: ");
		result.append(ponderation);
		result.append(')');
		return result.toString();
	}

} //GameTypePrefImpl
