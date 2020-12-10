/**
 */
package ctt.util;

import ctt.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ctt.CttPackage
 * @generated
 */
public class CttSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CttPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CttSwitch() {
		if (modelPackage == null) {
			modelPackage = CttPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CttPackage.TASK_MODEL: {
				TaskModel taskModel = (TaskModel)theEObject;
				T result = caseTaskModel(taskModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CttPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CttPackage.USER_TASK: {
				UserTask userTask = (UserTask)theEObject;
				T result = caseUserTask(userTask);
				if (result == null) result = caseTask(userTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CttPackage.APPLICATION_TASK: {
				ApplicationTask applicationTask = (ApplicationTask)theEObject;
				T result = caseApplicationTask(applicationTask);
				if (result == null) result = caseTask(applicationTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CttPackage.INTERACTION_TASK: {
				InteractionTask interactionTask = (InteractionTask)theEObject;
				T result = caseInteractionTask(interactionTask);
				if (result == null) result = caseTask(interactionTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CttPackage.ABSTRACTION_TASK: {
				AbstractionTask abstractionTask = (AbstractionTask)theEObject;
				T result = caseAbstractionTask(abstractionTask);
				if (result == null) result = caseTask(abstractionTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CttPackage.NULL_TASK: {
				NullTask nullTask = (NullTask)theEObject;
				T result = caseNullTask(nullTask);
				if (result == null) result = caseTask(nullTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CttPackage.TEMPORAL_OPERATOR: {
				TemporalOperator temporalOperator = (TemporalOperator)theEObject;
				T result = caseTemporalOperator(temporalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CttPackage.CHOICE_OPERATOR: {
				ChoiceOperator choiceOperator = (ChoiceOperator)theEObject;
				T result = caseChoiceOperator(choiceOperator);
				if (result == null) result = caseTemporalOperator(choiceOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CttPackage.ORDER_INDEPENDENCE_OPERATOR: {
				OrderIndependenceOperator orderIndependenceOperator = (OrderIndependenceOperator)theEObject;
				T result = caseOrderIndependenceOperator(orderIndependenceOperator);
				if (result == null) result = caseTemporalOperator(orderIndependenceOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CttPackage.INTERLEAVING_OPERATOR: {
				InterleavingOperator interleavingOperator = (InterleavingOperator)theEObject;
				T result = caseInterleavingOperator(interleavingOperator);
				if (result == null) result = caseTemporalOperator(interleavingOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CttPackage.SYNCHRONIZATION_OPERATOR: {
				SynchronizationOperator synchronizationOperator = (SynchronizationOperator)theEObject;
				T result = caseSynchronizationOperator(synchronizationOperator);
				if (result == null) result = caseTemporalOperator(synchronizationOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CttPackage.PARALLEL_OPERATOR: {
				ParallelOperator parallelOperator = (ParallelOperator)theEObject;
				T result = caseParallelOperator(parallelOperator);
				if (result == null) result = caseTemporalOperator(parallelOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CttPackage.DISABLING_OPERATOR: {
				DisablingOperator disablingOperator = (DisablingOperator)theEObject;
				T result = caseDisablingOperator(disablingOperator);
				if (result == null) result = caseTemporalOperator(disablingOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CttPackage.SEQUENTIAL_ENABLING_INFO_OPERATOR: {
				SequentialEnablingInfoOperator sequentialEnablingInfoOperator = (SequentialEnablingInfoOperator)theEObject;
				T result = caseSequentialEnablingInfoOperator(sequentialEnablingInfoOperator);
				if (result == null) result = caseTemporalOperator(sequentialEnablingInfoOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CttPackage.SEQUENTIAL_ENABLING_OPERATOR: {
				SequentialEnablingOperator sequentialEnablingOperator = (SequentialEnablingOperator)theEObject;
				T result = caseSequentialEnablingOperator(sequentialEnablingOperator);
				if (result == null) result = caseTemporalOperator(sequentialEnablingOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CttPackage.SUSPEND_RESUME_OPERATOR: {
				SuspendResumeOperator suspendResumeOperator = (SuspendResumeOperator)theEObject;
				T result = caseSuspendResumeOperator(suspendResumeOperator);
				if (result == null) result = caseTemporalOperator(suspendResumeOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskModel(TaskModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserTask(UserTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationTask(ApplicationTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionTask(InteractionTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstraction Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstraction Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractionTask(AbstractionTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullTask(NullTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalOperator(TemporalOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoiceOperator(ChoiceOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order Independence Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order Independence Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderIndependenceOperator(OrderIndependenceOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interleaving Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interleaving Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterleavingOperator(InterleavingOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronization Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronization Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronizationOperator(SynchronizationOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelOperator(ParallelOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disabling Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disabling Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisablingOperator(DisablingOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequential Enabling Info Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequential Enabling Info Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequentialEnablingInfoOperator(SequentialEnablingInfoOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequential Enabling Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequential Enabling Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequentialEnablingOperator(SequentialEnablingOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suspend Resume Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suspend Resume Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuspendResumeOperator(SuspendResumeOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CttSwitch
