/**
 */
package AppliCitoyenne.simuV1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gender</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AppliCitoyenne.simuV1.Gender#getSpecies <em>Species</em>}</li>
 * </ul>
 *
 * @see AppliCitoyenne.simuV1.SimuV1Package#getGender()
 * @model annotation="exeed classIcon='class'"
 * @generated
 */
public interface Gender extends Target {
	/**
	 * Returns the value of the '<em><b>Species</b></em>' containment reference list.
	 * The list contents are of type {@link AppliCitoyenne.simuV1.Species}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Species</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Species</em>' containment reference list.
	 * @see AppliCitoyenne.simuV1.SimuV1Package#getGender_Species()
	 * @model containment="true"
	 * @generated
	 */
	EList<Species> getSpecies();

} // Gender
