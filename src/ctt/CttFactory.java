/**
 */
package ctt;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ctt.CttPackage
 * @generated
 */
public interface CttFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CttFactory eINSTANCE = ctt.impl.CttFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Task Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Model</em>'.
	 * @generated
	 */
	TaskModel createTaskModel();

	/**
	 * Returns a new object of class '<em>User Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Task</em>'.
	 * @generated
	 */
	UserTask createUserTask();

	/**
	 * Returns a new object of class '<em>Application Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Task</em>'.
	 * @generated
	 */
	ApplicationTask createApplicationTask();

	/**
	 * Returns a new object of class '<em>Interaction Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction Task</em>'.
	 * @generated
	 */
	InteractionTask createInteractionTask();

	/**
	 * Returns a new object of class '<em>Abstraction Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstraction Task</em>'.
	 * @generated
	 */
	AbstractionTask createAbstractionTask();

	/**
	 * Returns a new object of class '<em>Null Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Null Task</em>'.
	 * @generated
	 */
	NullTask createNullTask();

	/**
	 * Returns a new object of class '<em>Choice Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choice Operator</em>'.
	 * @generated
	 */
	ChoiceOperator createChoiceOperator();

	/**
	 * Returns a new object of class '<em>Order Independence Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order Independence Operator</em>'.
	 * @generated
	 */
	OrderIndependenceOperator createOrderIndependenceOperator();

	/**
	 * Returns a new object of class '<em>Interleaving Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interleaving Operator</em>'.
	 * @generated
	 */
	InterleavingOperator createInterleavingOperator();

	/**
	 * Returns a new object of class '<em>Synchronization Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synchronization Operator</em>'.
	 * @generated
	 */
	SynchronizationOperator createSynchronizationOperator();

	/**
	 * Returns a new object of class '<em>Parallel Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel Operator</em>'.
	 * @generated
	 */
	ParallelOperator createParallelOperator();

	/**
	 * Returns a new object of class '<em>Disabling Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disabling Operator</em>'.
	 * @generated
	 */
	DisablingOperator createDisablingOperator();

	/**
	 * Returns a new object of class '<em>Sequential Enabling Info Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequential Enabling Info Operator</em>'.
	 * @generated
	 */
	SequentialEnablingInfoOperator createSequentialEnablingInfoOperator();

	/**
	 * Returns a new object of class '<em>Sequential Enabling Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequential Enabling Operator</em>'.
	 * @generated
	 */
	SequentialEnablingOperator createSequentialEnablingOperator();

	/**
	 * Returns a new object of class '<em>Suspend Resume Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Suspend Resume Operator</em>'.
	 * @generated
	 */
	SuspendResumeOperator createSuspendResumeOperator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CttPackage getCttPackage();

} //CttFactory
