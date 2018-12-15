/**
 */
package AppliCitoyenne.simuV1.impl;

import AppliCitoyenne.simuV1.BasicSurvey;
import AppliCitoyenne.simuV1.ConfirmationSurvey;
import AppliCitoyenne.simuV1.SimuV1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Confirmation Survey</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.impl.ConfirmationSurveyImpl#getBasicsurvey <em>Basicsurvey</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfirmationSurveyImpl extends BotanicalSurveyImpl implements ConfirmationSurvey {
	/**
	 * The cached value of the '{@link #getBasicsurvey() <em>Basicsurvey</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicsurvey()
	 * @generated
	 * @ordered
	 */
	protected BasicSurvey basicsurvey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfirmationSurveyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimuV1Package.Literals.CONFIRMATION_SURVEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicSurvey getBasicsurvey() {
		if (basicsurvey != null && basicsurvey.eIsProxy()) {
			InternalEObject oldBasicsurvey = (InternalEObject)basicsurvey;
			basicsurvey = (BasicSurvey)eResolveProxy(oldBasicsurvey);
			if (basicsurvey != oldBasicsurvey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimuV1Package.CONFIRMATION_SURVEY__BASICSURVEY, oldBasicsurvey, basicsurvey));
			}
		}
		return basicsurvey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicSurvey basicGetBasicsurvey() {
		return basicsurvey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasicsurvey(BasicSurvey newBasicsurvey, NotificationChain msgs) {
		BasicSurvey oldBasicsurvey = basicsurvey;
		basicsurvey = newBasicsurvey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimuV1Package.CONFIRMATION_SURVEY__BASICSURVEY, oldBasicsurvey, newBasicsurvey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasicsurvey(BasicSurvey newBasicsurvey) {
		if (newBasicsurvey != basicsurvey) {
			NotificationChain msgs = null;
			if (basicsurvey != null)
				msgs = ((InternalEObject)basicsurvey).eInverseRemove(this, SimuV1Package.BASIC_SURVEY__CONFIRMATIONSURVEY, BasicSurvey.class, msgs);
			if (newBasicsurvey != null)
				msgs = ((InternalEObject)newBasicsurvey).eInverseAdd(this, SimuV1Package.BASIC_SURVEY__CONFIRMATIONSURVEY, BasicSurvey.class, msgs);
			msgs = basicSetBasicsurvey(newBasicsurvey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimuV1Package.CONFIRMATION_SURVEY__BASICSURVEY, newBasicsurvey, newBasicsurvey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimuV1Package.CONFIRMATION_SURVEY__BASICSURVEY:
				if (basicsurvey != null)
					msgs = ((InternalEObject)basicsurvey).eInverseRemove(this, SimuV1Package.BASIC_SURVEY__CONFIRMATIONSURVEY, BasicSurvey.class, msgs);
				return basicSetBasicsurvey((BasicSurvey)otherEnd, msgs);
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
			case SimuV1Package.CONFIRMATION_SURVEY__BASICSURVEY:
				return basicSetBasicsurvey(null, msgs);
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
			case SimuV1Package.CONFIRMATION_SURVEY__BASICSURVEY:
				if (resolve) return getBasicsurvey();
				return basicGetBasicsurvey();
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
			case SimuV1Package.CONFIRMATION_SURVEY__BASICSURVEY:
				setBasicsurvey((BasicSurvey)newValue);
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
			case SimuV1Package.CONFIRMATION_SURVEY__BASICSURVEY:
				setBasicsurvey((BasicSurvey)null);
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
			case SimuV1Package.CONFIRMATION_SURVEY__BASICSURVEY:
				return basicsurvey != null;
		}
		return super.eIsSet(featureID);
	}

} //ConfirmationSurveyImpl
