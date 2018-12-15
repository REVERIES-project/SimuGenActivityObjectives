/**
 */
package AppliCitoyenne.simuV1.impl;

import AppliCitoyenne.simuV1.GameObjective;
import AppliCitoyenne.simuV1.InventoryObjective;
import AppliCitoyenne.simuV1.LearningObjective;
import AppliCitoyenne.simuV1.Objectives;
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
 * An implementation of the model object '<em><b>Objectives</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.impl.ObjectivesImpl#getLearningobjective <em>Learningobjective</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.ObjectivesImpl#getInventoryobjective <em>Inventoryobjective</em>}</li>
 *   <li>{@link AppliCitoyenne.simuV1.impl.ObjectivesImpl#getGameobjective <em>Gameobjective</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectivesImpl extends MinimalEObjectImpl.Container implements Objectives {
	/**
	 * The cached value of the '{@link #getLearningobjective() <em>Learningobjective</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLearningobjective()
	 * @generated
	 * @ordered
	 */
	protected EList<LearningObjective> learningobjective;

	/**
	 * The cached value of the '{@link #getInventoryobjective() <em>Inventoryobjective</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryobjective()
	 * @generated
	 * @ordered
	 */
	protected EList<InventoryObjective> inventoryobjective;

	/**
	 * The cached value of the '{@link #getGameobjective() <em>Gameobjective</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameobjective()
	 * @generated
	 * @ordered
	 */
	protected EList<GameObjective> gameobjective;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectivesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimuV1Package.Literals.OBJECTIVES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LearningObjective> getLearningobjective() {
		if (learningobjective == null) {
			learningobjective = new EObjectContainmentEList<LearningObjective>(LearningObjective.class, this, SimuV1Package.OBJECTIVES__LEARNINGOBJECTIVE);
		}
		return learningobjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InventoryObjective> getInventoryobjective() {
		if (inventoryobjective == null) {
			inventoryobjective = new EObjectContainmentEList<InventoryObjective>(InventoryObjective.class, this, SimuV1Package.OBJECTIVES__INVENTORYOBJECTIVE);
		}
		return inventoryobjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GameObjective> getGameobjective() {
		if (gameobjective == null) {
			gameobjective = new EObjectContainmentEList<GameObjective>(GameObjective.class, this, SimuV1Package.OBJECTIVES__GAMEOBJECTIVE);
		}
		return gameobjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimuV1Package.OBJECTIVES__LEARNINGOBJECTIVE:
				return ((InternalEList<?>)getLearningobjective()).basicRemove(otherEnd, msgs);
			case SimuV1Package.OBJECTIVES__INVENTORYOBJECTIVE:
				return ((InternalEList<?>)getInventoryobjective()).basicRemove(otherEnd, msgs);
			case SimuV1Package.OBJECTIVES__GAMEOBJECTIVE:
				return ((InternalEList<?>)getGameobjective()).basicRemove(otherEnd, msgs);
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
			case SimuV1Package.OBJECTIVES__LEARNINGOBJECTIVE:
				return getLearningobjective();
			case SimuV1Package.OBJECTIVES__INVENTORYOBJECTIVE:
				return getInventoryobjective();
			case SimuV1Package.OBJECTIVES__GAMEOBJECTIVE:
				return getGameobjective();
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
			case SimuV1Package.OBJECTIVES__LEARNINGOBJECTIVE:
				getLearningobjective().clear();
				getLearningobjective().addAll((Collection<? extends LearningObjective>)newValue);
				return;
			case SimuV1Package.OBJECTIVES__INVENTORYOBJECTIVE:
				getInventoryobjective().clear();
				getInventoryobjective().addAll((Collection<? extends InventoryObjective>)newValue);
				return;
			case SimuV1Package.OBJECTIVES__GAMEOBJECTIVE:
				getGameobjective().clear();
				getGameobjective().addAll((Collection<? extends GameObjective>)newValue);
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
			case SimuV1Package.OBJECTIVES__LEARNINGOBJECTIVE:
				getLearningobjective().clear();
				return;
			case SimuV1Package.OBJECTIVES__INVENTORYOBJECTIVE:
				getInventoryobjective().clear();
				return;
			case SimuV1Package.OBJECTIVES__GAMEOBJECTIVE:
				getGameobjective().clear();
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
			case SimuV1Package.OBJECTIVES__LEARNINGOBJECTIVE:
				return learningobjective != null && !learningobjective.isEmpty();
			case SimuV1Package.OBJECTIVES__INVENTORYOBJECTIVE:
				return inventoryobjective != null && !inventoryobjective.isEmpty();
			case SimuV1Package.OBJECTIVES__GAMEOBJECTIVE:
				return gameobjective != null && !gameobjective.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObjectivesImpl
