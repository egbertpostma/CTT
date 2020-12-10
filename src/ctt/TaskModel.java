/**
 */
package ctt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ctt.TaskModel#getRoot <em>Root</em>}</li>
 *   <li>{@link ctt.TaskModel#getTasks <em>Tasks</em>}</li>
 *   <li>{@link ctt.TaskModel#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ctt.CttPackage#getTaskModel()
 * @model
 * @generated
 */
public interface TaskModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' reference.
	 * @see #setRoot(Task)
	 * @see ctt.CttPackage#getTaskModel_Root()
	 * @model required="true"
	 * @generated
	 */
	Task getRoot();

	/**
	 * Sets the value of the '{@link ctt.TaskModel#getRoot <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Task value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link ctt.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see ctt.CttPackage#getTaskModel_Tasks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ctt.CttPackage#getTaskModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ctt.TaskModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TaskModel
