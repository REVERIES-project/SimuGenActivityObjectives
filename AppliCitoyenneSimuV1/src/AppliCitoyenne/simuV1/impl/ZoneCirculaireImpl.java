/**
 */
package AppliCitoyenne.simuV1.impl;

import AppliCitoyenne.simuV1.SimuV1Package;
import AppliCitoyenne.simuV1.ZoneCirculaire;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zone Circulaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.impl.ZoneCirculaireImpl#getRayon <em>Rayon</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.ZoneCirculaireImpl#getX <em>X</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.ZoneCirculaireImpl#getY <em>Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZoneCirculaireImpl extends ZoneImpl implements ZoneCirculaire {
	/**
	 * The default value of the '{@link #getRayon() <em>Rayon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRayon()
	 * @generated
	 * @ordered
	 */
	protected static final int RAYON_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRayon() <em>Rayon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRayon()
	 * @generated
	 * @ordered
	 */
	protected int rayon = RAYON_EDEFAULT;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final int X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected int x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final int Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected int y = Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZoneCirculaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimuV1Package.Literals.ZONE_CIRCULAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRayon() {
		return rayon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRayon(int newRayon) {
		int oldRayon = rayon;
		rayon = newRayon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.ZONE_CIRCULAIRE__RAYON, oldRayon, rayon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(int newX) {
		int oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.ZONE_CIRCULAIRE__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(int newY) {
		int oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.ZONE_CIRCULAIRE__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimuV1Package.ZONE_CIRCULAIRE__RAYON:
				return getRayon();
			case SimuV1Package.ZONE_CIRCULAIRE__X:
				return getX();
			case SimuV1Package.ZONE_CIRCULAIRE__Y:
				return getY();
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
			case SimuV1Package.ZONE_CIRCULAIRE__RAYON:
				setRayon((Integer)newValue);
				return;
			case SimuV1Package.ZONE_CIRCULAIRE__X:
				setX((Integer)newValue);
				return;
			case SimuV1Package.ZONE_CIRCULAIRE__Y:
				setY((Integer)newValue);
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
			case SimuV1Package.ZONE_CIRCULAIRE__RAYON:
				setRayon(RAYON_EDEFAULT);
				return;
			case SimuV1Package.ZONE_CIRCULAIRE__X:
				setX(X_EDEFAULT);
				return;
			case SimuV1Package.ZONE_CIRCULAIRE__Y:
				setY(Y_EDEFAULT);
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
			case SimuV1Package.ZONE_CIRCULAIRE__RAYON:
				return rayon != RAYON_EDEFAULT;
			case SimuV1Package.ZONE_CIRCULAIRE__X:
				return x != X_EDEFAULT;
			case SimuV1Package.ZONE_CIRCULAIRE__Y:
				return y != Y_EDEFAULT;
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
		result.append(" (rayon: ");
		result.append(rayon);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(')');
		return result.toString();
	}

} //ZoneCirculaireImpl
