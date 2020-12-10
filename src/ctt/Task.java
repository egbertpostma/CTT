/**
 */
package ctt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ctt.Task#getId <em>Id</em>}</li>
 *   <li>{@link ctt.Task#getName <em>Name</em>}</li>
 *   <li>{@link ctt.Task#getOperator <em>Operator</em>}</li>
 *   <li>{@link ctt.Task#getSubtasks <em>Subtasks</em>}</li>
 *   <li>{@link ctt.Task#getParent <em>Parent</em>}</li>
 *   <li>{@link ctt.Task#getMin <em>Min</em>}</li>
 *   <li>{@link ctt.Task#getMax <em>Max</em>}</li>
 *   <li>{@link ctt.Task#getIterative <em>Iterative</em>}</li>
 * </ul>
 *
 * @see ctt.CttPackage#getTask()
 * @model abstract="true"
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see ctt.CttPackage#getTask_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link ctt.Task#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ctt.CttPackage#getTask_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ctt.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' containment reference.
	 * @see #setOperator(TemporalOperator)
	 * @see ctt.CttPackage#getTask_Operator()
	 * @model containment="true"
	 * @generated
	 */
	TemporalOperator getOperator();

	/**
	 * Sets the value of the '{@link ctt.Task#getOperator <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' containment reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(TemporalOperator value);

	/**
	 * Returns the value of the '<em><b>Subtasks</b></em>' reference list.
	 * The list contents are of type {@link ctt.Task}.
	 * It is bidirectional and its opposite is '{@link ctt.Task#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtasks</em>' reference list.
	 * @see ctt.CttPackage#getTask_Subtasks()
	 * @see ctt.Task#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<Task> getSubtasks();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ctt.Task#getSubtasks <em>Subtasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Task)
	 * @see ctt.CttPackage#getTask_Parent()
	 * @see ctt.Task#getSubtasks
	 * @model opposite="subtasks"
	 * @generated
	 */
	Task getParent();

	/**
	 * Sets the value of the '{@link ctt.Task#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Task value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(Integer)
	 * @see ctt.CttPackage#getTask_Min()
	 * @model
	 * @generated
	 */
	Integer getMin();

	/**
	 * Sets the value of the '{@link ctt.Task#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(Integer value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(Integer)
	 * @see ctt.CttPackage#getTask_Max()
	 * @model
	 * @generated
	 */
	Integer getMax();

	/**
	 * Sets the value of the '{@link ctt.Task#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(Integer value);

	/**
	 * Returns the value of the '<em><b>Iterative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterative</em>' attribute.
	 * @see #setIterative(Boolean)
	 * @see ctt.CttPackage#getTask_Iterative()
	 * @model
	 * @generated
	 */
	Boolean getIterative();

	/**
	 * Sets the value of the '{@link ctt.Task#getIterative <em>Iterative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterative</em>' attribute.
	 * @see #getIterative()
	 * @generated
	 */
	void setIterative(Boolean value);

} // Task
