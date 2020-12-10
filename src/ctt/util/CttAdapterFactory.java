/**
 */
package ctt.util;

import ctt.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ctt.CttPackage
 * @generated
 */
public class CttAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CttPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CttAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CttPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CttSwitch<Adapter> modelSwitch =
		new CttSwitch<Adapter>() {
			@Override
			public Adapter caseTaskModel(TaskModel object) {
				return createTaskModelAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseUserTask(UserTask object) {
				return createUserTaskAdapter();
			}
			@Override
			public Adapter caseApplicationTask(ApplicationTask object) {
				return createApplicationTaskAdapter();
			}
			@Override
			public Adapter caseInteractionTask(InteractionTask object) {
				return createInteractionTaskAdapter();
			}
			@Override
			public Adapter caseAbstractionTask(AbstractionTask object) {
				return createAbstractionTaskAdapter();
			}
			@Override
			public Adapter caseNullTask(NullTask object) {
				return createNullTaskAdapter();
			}
			@Override
			public Adapter caseTemporalOperator(TemporalOperator object) {
				return createTemporalOperatorAdapter();
			}
			@Override
			public Adapter caseChoiceOperator(ChoiceOperator object) {
				return createChoiceOperatorAdapter();
			}
			@Override
			public Adapter caseOrderIndependenceOperator(OrderIndependenceOperator object) {
				return createOrderIndependenceOperatorAdapter();
			}
			@Override
			public Adapter caseInterleavingOperator(InterleavingOperator object) {
				return createInterleavingOperatorAdapter();
			}
			@Override
			public Adapter caseSynchronizationOperator(SynchronizationOperator object) {
				return createSynchronizationOperatorAdapter();
			}
			@Override
			public Adapter caseParallelOperator(ParallelOperator object) {
				return createParallelOperatorAdapter();
			}
			@Override
			public Adapter caseDisablingOperator(DisablingOperator object) {
				return createDisablingOperatorAdapter();
			}
			@Override
			public Adapter caseSequentialEnablingInfoOperator(SequentialEnablingInfoOperator object) {
				return createSequentialEnablingInfoOperatorAdapter();
			}
			@Override
			public Adapter caseSequentialEnablingOperator(SequentialEnablingOperator object) {
				return createSequentialEnablingOperatorAdapter();
			}
			@Override
			public Adapter caseSuspendResumeOperator(SuspendResumeOperator object) {
				return createSuspendResumeOperatorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ctt.TaskModel <em>Task Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ctt.TaskModel
	 * @generated
	 */
	public Adapter createTaskModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ctt.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ctt.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ctt.UserTask <em>User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ctt.UserTask
	 * @generated
	 */
	public Adapter createUserTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ctt.ApplicationTask <em>Application Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ctt.ApplicationTask
	 * @generated
	 */
	public Adapter createApplicationTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ctt.InteractionTask <em>Interaction Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ctt.InteractionTask
	 * @generated
	 */
	public Adapter createInteractionTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ctt.AbstractionTask <em>Abstraction Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ctt.AbstractionTask
	 * @generated
	 */
	public Adapter createAbstractionTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ctt.NullTask <em>Null Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ctt.NullTask
	 * @generated
	 */
	public Adapter createNullTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ctt.TemporalOperator <em>Temporal Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ctt.TemporalOperator
	 * @generated
	 */
	public Adapter createTemporalOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ctt.ChoiceOperator <em>Choice Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ctt.ChoiceOperator
	 * @generated
	 */
	public Adapter createChoiceOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ctt.OrderIndependenceOperator <em>Order Independence Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ctt.OrderIndependenceOperator
	 * @generated
	 */
	public Adapter createOrderIndependenceOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ctt.InterleavingOperator <em>Interleaving Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ctt.InterleavingOperator
	 * @generated
	 */
	public Adapter createInterleavingOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ctt.SynchronizationOperator <em>Synchronization Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ctt.SynchronizationOperator
	 * @generated
	 */
	public Adapter createSynchronizationOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ctt.ParallelOperator <em>Parallel Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ctt.ParallelOperator
	 * @generated
	 */
	public Adapter createParallelOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ctt.DisablingOperator <em>Disabling Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ctt.DisablingOperator
	 * @generated
	 */
	public Adapter createDisablingOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ctt.SequentialEnablingInfoOperator <em>Sequential Enabling Info Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ctt.SequentialEnablingInfoOperator
	 * @generated
	 */
	public Adapter createSequentialEnablingInfoOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ctt.SequentialEnablingOperator <em>Sequential Enabling Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ctt.SequentialEnablingOperator
	 * @generated
	 */
	public Adapter createSequentialEnablingOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ctt.SuspendResumeOperator <em>Suspend Resume Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ctt.SuspendResumeOperator
	 * @generated
	 */
	public Adapter createSuspendResumeOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CttAdapterFactory
