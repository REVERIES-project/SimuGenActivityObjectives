/**
 */
package AppliCitoyenne.simuV1.impl;

import AppliCitoyenne.simuV1.AdditionalSurvey;
import AppliCitoyenne.simuV1.BasicSurvey;
import AppliCitoyenne.simuV1.ConfirmationSurvey;
import AppliCitoyenne.simuV1.SimuV1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Survey</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.impl.BasicSurveyImpl#getConfirmationsurvey <em>Confirmationsurvey</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.BasicSurveyImpl#getAdditionalsurvey <em>Additionalsurvey</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicSurveyImpl extends BotanicalSurveyImpl implements BasicSurvey {
	/**
	 * The cached value of the '{@link #getConfirmationsurvey() <em>Confirmationsurvey</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmationsurvey()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfirmationSurvey> confirmationsurvey;

	/**
	 * The cached value of the '{@link #getAdditionalsurvey() <em>Additionalsurvey</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalsurvey()
	 * @generated
	 * @ordered
	 */
	protected EList<AdditionalSurvey> additionalsurvey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicSurveyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimuV1Package.Literals.BASIC_SURVEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfirmationSurvey> getConfirmationsurvey() {
		if (confirmationsurvey == null) {
			confirmationsurvey = new EObjectWithInverseResolvingEList<ConfirmationSurvey>(ConfirmationSurvey.class, this, SimuV1Package.BASIC_SURVEY__CONFIRMATIONSURVEY, SimuV1Package.CONFIRMATION_SURVEY__BASICSURVEY);
		}
		return confirmationsurvey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdditionalSurvey> getAdditionalsurvey() {
		if (additionalsurvey == null) {
			additionalsurvey = new EObjectWithInverseResolvingEList<AdditionalSurvey>(AdditionalSurvey.class, this, SimuV1Package.BASIC_SURVEY__ADDITIONALSURVEY, SimuV1Package.ADDITIONAL_SURVEY__BASICSURVEY);
		}
		return additionalsurvey;
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
			case SimuV1Package.BASIC_SURVEY__CONFIRMATIONSURVEY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConfirmationsurvey()).basicAdd(otherEnd, msgs);
			case SimuV1Package.BASIC_SURVEY__ADDITIONALSURVEY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAdditionalsurvey()).basicAdd(otherEnd, msgs);
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
			case SimuV1Package.BASIC_SURVEY__CONFIRMATIONSURVEY:
				return ((InternalEList<?>)getConfirmationsurvey()).basicRemove(otherEnd, msgs);
			case SimuV1Package.BASIC_SURVEY__ADDITIONALSURVEY:
				return ((InternalEList<?>)getAdditionalsurvey()).basicRemove(otherEnd, msgs);
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
			case SimuV1Package.BASIC_SURVEY__CONFIRMATIONSURVEY:
				return getConfirmationsurvey();
			case SimuV1Package.BASIC_SURVEY__ADDITIONALSURVEY:
				return getAdditionalsurvey();
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
			case SimuV1Package.BASIC_SURVEY__CONFIRMATIONSURVEY:
				getConfirmationsurvey().clear();
				getConfirmationsurvey().addAll((Collection<? extends ConfirmationSurvey>)newValue);
				return;
			case SimuV1Package.BASIC_SURVEY__ADDITIONALSURVEY:
				getAdditionalsurvey().clear();
				getAdditionalsurvey().addAll((Collection<? extends AdditionalSurvey>)newValue);
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
			case SimuV1Package.BASIC_SURVEY__CONFIRMATIONSURVEY:
				getConfirmationsurvey().clear();
				return;
			case SimuV1Package.BASIC_SURVEY__ADDITIONALSURVEY:
				getAdditionalsurvey().clear();
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
			case SimuV1Package.BASIC_SURVEY__CONFIRMATIONSURVEY:
				return confirmationsurvey != null && !confirmationsurvey.isEmpty();
			case SimuV1Package.BASIC_SURVEY__ADDITIONALSURVEY:
				return additionalsurvey != null && !additionalsurvey.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BasicSurveyImpl
