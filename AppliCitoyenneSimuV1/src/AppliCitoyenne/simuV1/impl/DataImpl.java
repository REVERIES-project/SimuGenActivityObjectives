/**
 */
package AppliCitoyenne.simuV1.impl;

import AppliCitoyenne.simuV1.BotanicalSurvey;
import AppliCitoyenne.simuV1.Data;
import AppliCitoyenne.simuV1.Profile;
import AppliCitoyenne.simuV1.SimuV1Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.impl.DataImpl#getProfiles <em>Profiles</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.DataImpl#getBotanicalsurveys <em>Botanicalsurveys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataImpl extends MinimalEObjectImpl.Container implements Data {
	/**
	 * The cached value of the '{@link #getProfiles() <em>Profiles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfiles()
	 * @generated
	 * @ordered
	 */
	protected EList profiles;

	/**
	 * The cached value of the '{@link #getBotanicalsurveys() <em>Botanicalsurveys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBotanicalsurveys()
	 * @generated
	 * @ordered
	 */
	protected EList botanicalsurveys;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SimuV1Package.Literals.DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProfiles() {
		if (profiles == null) {
			profiles = new EObjectContainmentEList(Profile.class, this, SimuV1Package.DATA__PROFILES);
		}
		return profiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBotanicalsurveys() {
		if (botanicalsurveys == null) {
			botanicalsurveys = new EObjectContainmentEList(BotanicalSurvey.class, this, SimuV1Package.DATA__BOTANICALSURVEYS);
		}
		return botanicalsurveys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimuV1Package.DATA__PROFILES:
				return ((InternalEList)getProfiles()).basicRemove(otherEnd, msgs);
			case SimuV1Package.DATA__BOTANICALSURVEYS:
				return ((InternalEList)getBotanicalsurveys()).basicRemove(otherEnd, msgs);
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
			case SimuV1Package.DATA__PROFILES:
				return getProfiles();
			case SimuV1Package.DATA__BOTANICALSURVEYS:
				return getBotanicalsurveys();
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
			case SimuV1Package.DATA__PROFILES:
				getProfiles().clear();
				getProfiles().addAll((Collection)newValue);
				return;
			case SimuV1Package.DATA__BOTANICALSURVEYS:
				getBotanicalsurveys().clear();
				getBotanicalsurveys().addAll((Collection)newValue);
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
			case SimuV1Package.DATA__PROFILES:
				getProfiles().clear();
				return;
			case SimuV1Package.DATA__BOTANICALSURVEYS:
				getBotanicalsurveys().clear();
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
			case SimuV1Package.DATA__PROFILES:
				return profiles != null && !profiles.isEmpty();
			case SimuV1Package.DATA__BOTANICALSURVEYS:
				return botanicalsurveys != null && !botanicalsurveys.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataImpl
