/**
 */
package ctt.impl;

import ctt.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CttFactoryImpl extends EFactoryImpl implements CttFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CttFactory init() {
		try {
			CttFactory theCttFactory = (CttFactory)EPackage.Registry.INSTANCE.getEFactory(CttPackage.eNS_URI);
			if (theCttFactory != null) {
				return theCttFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CttFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CttFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CttPackage.TASK_MODEL: return createTaskModel();
			case CttPackage.USER_TASK: return createUserTask();
			case CttPackage.APPLICATION_TASK: return createApplicationTask();
			case CttPackage.INTERACTION_TASK: return createInteractionTask();
			case CttPackage.ABSTRACTION_TASK: return createAbstractionTask();
			case CttPackage.NULL_TASK: return createNullTask();
			case CttPackage.CHOICE_OPERATOR: return createChoiceOperator();
			case CttPackage.ORDER_INDEPENDENCE_OPERATOR: return createOrderIndependenceOperator();
			case CttPackage.INTERLEAVING_OPERATOR: return createInterleavingOperator();
			case CttPackage.SYNCHRONIZATION_OPERATOR: return createSynchronizationOperator();
			case CttPackage.PARALLEL_OPERATOR: return createParallelOperator();
			case CttPackage.DISABLING_OPERATOR: return createDisablingOperator();
			case CttPackage.SEQUENTIAL_ENABLING_INFO_OPERATOR: return createSequentialEnablingInfoOperator();
			case CttPackage.SEQUENTIAL_ENABLING_OPERATOR: return createSequentialEnablingOperator();
			case CttPackage.SUSPEND_RESUME_OPERATOR: return createSuspendResumeOperator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskModel createTaskModel() {
		TaskModelImpl taskModel = new TaskModelImpl();
		return taskModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserTask createUserTask() {
		UserTaskImpl userTask = new UserTaskImpl();
		return userTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationTask createApplicationTask() {
		ApplicationTaskImpl applicationTask = new ApplicationTaskImpl();
		return applicationTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InteractionTask createInteractionTask() {
		InteractionTaskImpl interactionTask = new InteractionTaskImpl();
		return interactionTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractionTask createAbstractionTask() {
		AbstractionTaskImpl abstractionTask = new AbstractionTaskImpl();
		return abstractionTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NullTask createNullTask() {
		NullTaskImpl nullTask = new NullTaskImpl();
		return nullTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChoiceOperator createChoiceOperator() {
		ChoiceOperatorImpl choiceOperator = new ChoiceOperatorImpl();
		return choiceOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderIndependenceOperator createOrderIndependenceOperator() {
		OrderIndependenceOperatorImpl orderIndependenceOperator = new OrderIndependenceOperatorImpl();
		return orderIndependenceOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterleavingOperator createInterleavingOperator() {
		InterleavingOperatorImpl interleavingOperator = new InterleavingOperatorImpl();
		return interleavingOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SynchronizationOperator createSynchronizationOperator() {
		SynchronizationOperatorImpl synchronizationOperator = new SynchronizationOperatorImpl();
		return synchronizationOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParallelOperator createParallelOperator() {
		ParallelOperatorImpl parallelOperator = new ParallelOperatorImpl();
		return parallelOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DisablingOperator createDisablingOperator() {
		DisablingOperatorImpl disablingOperator = new DisablingOperatorImpl();
		return disablingOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SequentialEnablingInfoOperator createSequentialEnablingInfoOperator() {
		SequentialEnablingInfoOperatorImpl sequentialEnablingInfoOperator = new SequentialEnablingInfoOperatorImpl();
		return sequentialEnablingInfoOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SequentialEnablingOperator createSequentialEnablingOperator() {
		SequentialEnablingOperatorImpl sequentialEnablingOperator = new SequentialEnablingOperatorImpl();
		return sequentialEnablingOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuspendResumeOperator createSuspendResumeOperator() {
		SuspendResumeOperatorImpl suspendResumeOperator = new SuspendResumeOperatorImpl();
		return suspendResumeOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CttPackage getCttPackage() {
		return (CttPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CttPackage getPackage() {
		return CttPackage.eINSTANCE;
	}

} //CttFactoryImpl
