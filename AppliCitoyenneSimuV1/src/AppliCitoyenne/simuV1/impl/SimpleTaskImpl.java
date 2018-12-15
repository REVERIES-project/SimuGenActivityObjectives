/**
 */
package AppliCitoyenne.simuV1.impl;

import AppliCitoyenne.simuV1.Action2Detect;
import AppliCitoyenne.simuV1.SimpleTask;
import AppliCitoyenne.simuV1.SimuV1Package;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.impl.SimpleTaskImpl#getCompatibleaction2detect <em>Compatibleaction2detect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleTaskImpl extends TaskImpl implements SimpleTask {
	/**
	 * The cached value of the '{@link #getCompatibleaction2detect() <em>Compatibleaction2detect</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompatibleaction2detect()
	 * @generated
	 * @ordered
	 */
	protected EList<Action2Detect> compatibleaction2detect;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimuV1Package.Literals.SIMPLE_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action2Detect> getCompatibleaction2detect() {
		if (compatibleaction2detect == null) {
			compatibleaction2detect = new EObjectResolvingEList<Action2Detect>(Action2Detect.class, this, SimuV1Package.SIMPLE_TASK__COMPATIBLEACTION2DETECT);
		}
		return compatibleaction2detect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimuV1Package.SIMPLE_TASK__COMPATIBLEACTION2DETECT:
				return getCompatibleaction2detect();
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
			case SimuV1Package.SIMPLE_TASK__COMPATIBLEACTION2DETECT:
				getCompatibleaction2detect().clear();
				getCompatibleaction2detect().addAll((Collection<? extends Action2Detect>)newValue);
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
			case SimuV1Package.SIMPLE_TASK__COMPATIBLEACTION2DETECT:
				getCompatibleaction2detect().clear();
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
			case SimuV1Package.SIMPLE_TASK__COMPATIBLEACTION2DETECT:
				return compatibleaction2detect != null && !compatibleaction2detect.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SimpleTaskImpl
