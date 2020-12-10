/**
 */
package ctt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ctt.CttFactory
 * @model kind="package"
 * @generated
 */
public interface CttPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ctt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ctt";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CttPackage eINSTANCE = ctt.impl.CttPackageImpl.init();

	/**
	 * The meta object id for the '{@link ctt.impl.TaskModelImpl <em>Task Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctt.impl.TaskModelImpl
	 * @see ctt.impl.CttPackageImpl#getTaskModel()
	 * @generated
	 */
	int TASK_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_MODEL__ROOT = 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_MODEL__TASKS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_MODEL__NAME = 2;

	/**
	 * The number of structural features of the '<em>Task Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_MODEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ctt.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctt.impl.TaskImpl
	 * @see ctt.impl.CttPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OPERATOR = 2;

	/**
	 * The feature id for the '<em><b>Subtasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SUBTASKS = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PARENT = 4;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__MIN = 5;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__MAX = 6;

	/**
	 * The feature id for the '<em><b>Iterative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ITERATIVE = 7;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link ctt.impl.UserTaskImpl <em>User Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctt.impl.UserTaskImpl
	 * @see ctt.impl.CttPackageImpl#getUserTask()
	 * @generated
	 */
	int USER_TASK = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__OPERATOR = TASK__OPERATOR;

	/**
	 * The feature id for the '<em><b>Subtasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__SUBTASKS = TASK__SUBTASKS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__PARENT = TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__MIN = TASK__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__MAX = TASK__MAX;

	/**
	 * The feature id for the '<em><b>Iterative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__ITERATIVE = TASK__ITERATIVE;

	/**
	 * The number of structural features of the '<em>User Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ctt.impl.ApplicationTaskImpl <em>Application Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctt.impl.ApplicationTaskImpl
	 * @see ctt.impl.CttPackageImpl#getApplicationTask()
	 * @generated
	 */
	int APPLICATION_TASK = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TASK__OPERATOR = TASK__OPERATOR;

	/**
	 * The feature id for the '<em><b>Subtasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TASK__SUBTASKS = TASK__SUBTASKS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TASK__PARENT = TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TASK__MIN = TASK__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TASK__MAX = TASK__MAX;

	/**
	 * The feature id for the '<em><b>Iterative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TASK__ITERATIVE = TASK__ITERATIVE;

	/**
	 * The number of structural features of the '<em>Application Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ctt.impl.InteractionTaskImpl <em>Interaction Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctt.impl.InteractionTaskImpl
	 * @see ctt.impl.CttPackageImpl#getInteractionTask()
	 * @generated
	 */
	int INTERACTION_TASK = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_TASK__OPERATOR = TASK__OPERATOR;

	/**
	 * The feature id for the '<em><b>Subtasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_TASK__SUBTASKS = TASK__SUBTASKS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_TASK__PARENT = TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_TASK__MIN = TASK__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_TASK__MAX = TASK__MAX;

	/**
	 * The feature id for the '<em><b>Iterative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_TASK__ITERATIVE = TASK__ITERATIVE;

	/**
	 * The number of structural features of the '<em>Interaction Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ctt.impl.AbstractionTaskImpl <em>Abstraction Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctt.impl.AbstractionTaskImpl
	 * @see ctt.impl.CttPackageImpl#getAbstractionTask()
	 * @generated
	 */
	int ABSTRACTION_TASK = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_TASK__OPERATOR = TASK__OPERATOR;

	/**
	 * The feature id for the '<em><b>Subtasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_TASK__SUBTASKS = TASK__SUBTASKS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_TASK__PARENT = TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_TASK__MIN = TASK__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_TASK__MAX = TASK__MAX;

	/**
	 * The feature id for the '<em><b>Iterative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_TASK__ITERATIVE = TASK__ITERATIVE;

	/**
	 * The number of structural features of the '<em>Abstraction Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACTION_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ctt.impl.NullTaskImpl <em>Null Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctt.impl.NullTaskImpl
	 * @see ctt.impl.CttPackageImpl#getNullTask()
	 * @generated
	 */
	int NULL_TASK = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_TASK__OPERATOR = TASK__OPERATOR;

	/**
	 * The feature id for the '<em><b>Subtasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_TASK__SUBTASKS = TASK__SUBTASKS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_TASK__PARENT = TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_TASK__MIN = TASK__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_TASK__MAX = TASK__MAX;

	/**
	 * The feature id for the '<em><b>Iterative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_TASK__ITERATIVE = TASK__ITERATIVE;

	/**
	 * The number of structural features of the '<em>Null Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ctt.impl.TemporalOperatorImpl <em>Temporal Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctt.impl.TemporalOperatorImpl
	 * @see ctt.impl.CttPackageImpl#getTemporalOperator()
	 * @generated
	 */
	int TEMPORAL_OPERATOR = 7;

	/**
	 * The number of structural features of the '<em>Temporal Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_OPERATOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link ctt.impl.ChoiceOperatorImpl <em>Choice Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctt.impl.ChoiceOperatorImpl
	 * @see ctt.impl.CttPackageImpl#getChoiceOperator()
	 * @generated
	 */
	int CHOICE_OPERATOR = 8;

	/**
	 * The number of structural features of the '<em>Choice Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_OPERATOR_FEATURE_COUNT = TEMPORAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ctt.impl.OrderIndependenceOperatorImpl <em>Order Independence Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctt.impl.OrderIndependenceOperatorImpl
	 * @see ctt.impl.CttPackageImpl#getOrderIndependenceOperator()
	 * @generated
	 */
	int ORDER_INDEPENDENCE_OPERATOR = 9;

	/**
	 * The number of structural features of the '<em>Order Independence Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_INDEPENDENCE_OPERATOR_FEATURE_COUNT = TEMPORAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ctt.impl.InterleavingOperatorImpl <em>Interleaving Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctt.impl.InterleavingOperatorImpl
	 * @see ctt.impl.CttPackageImpl#getInterleavingOperator()
	 * @generated
	 */
	int INTERLEAVING_OPERATOR = 10;

	/**
	 * The number of structural features of the '<em>Interleaving Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERLEAVING_OPERATOR_FEATURE_COUNT = TEMPORAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ctt.impl.SynchronizationOperatorImpl <em>Synchronization Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctt.impl.SynchronizationOperatorImpl
	 * @see ctt.impl.CttPackageImpl#getSynchronizationOperator()
	 * @generated
	 */
	int SYNCHRONIZATION_OPERATOR = 11;

	/**
	 * The number of structural features of the '<em>Synchronization Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_OPERATOR_FEATURE_COUNT = TEMPORAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ctt.impl.ParallelOperatorImpl <em>Parallel Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctt.impl.ParallelOperatorImpl
	 * @see ctt.impl.CttPackageImpl#getParallelOperator()
	 * @generated
	 */
	int PARALLEL_OPERATOR = 12;

	/**
	 * The number of structural features of the '<em>Parallel Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_OPERATOR_FEATURE_COUNT = TEMPORAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ctt.impl.DisablingOperatorImpl <em>Disabling Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctt.impl.DisablingOperatorImpl
	 * @see ctt.impl.CttPackageImpl#getDisablingOperator()
	 * @generated
	 */
	int DISABLING_OPERATOR = 13;

	/**
	 * The number of structural features of the '<em>Disabling Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLING_OPERATOR_FEATURE_COUNT = TEMPORAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ctt.impl.SequentialEnablingInfoOperatorImpl <em>Sequential Enabling Info Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctt.impl.SequentialEnablingInfoOperatorImpl
	 * @see ctt.impl.CttPackageImpl#getSequentialEnablingInfoOperator()
	 * @generated
	 */
	int SEQUENTIAL_ENABLING_INFO_OPERATOR = 14;

	/**
	 * The number of structural features of the '<em>Sequential Enabling Info Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_ENABLING_INFO_OPERATOR_FEATURE_COUNT = TEMPORAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ctt.impl.SequentialEnablingOperatorImpl <em>Sequential Enabling Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctt.impl.SequentialEnablingOperatorImpl
	 * @see ctt.impl.CttPackageImpl#getSequentialEnablingOperator()
	 * @generated
	 */
	int SEQUENTIAL_ENABLING_OPERATOR = 15;

	/**
	 * The number of structural features of the '<em>Sequential Enabling Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_ENABLING_OPERATOR_FEATURE_COUNT = TEMPORAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ctt.impl.SuspendResumeOperatorImpl <em>Suspend Resume Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ctt.impl.SuspendResumeOperatorImpl
	 * @see ctt.impl.CttPackageImpl#getSuspendResumeOperator()
	 * @generated
	 */
	int SUSPEND_RESUME_OPERATOR = 16;

	/**
	 * The number of structural features of the '<em>Suspend Resume Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSPEND_RESUME_OPERATOR_FEATURE_COUNT = TEMPORAL_OPERATOR_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link ctt.TaskModel <em>Task Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Model</em>'.
	 * @see ctt.TaskModel
	 * @generated
	 */
	EClass getTaskModel();

	/**
	 * Returns the meta object for the reference '{@link ctt.TaskModel#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root</em>'.
	 * @see ctt.TaskModel#getRoot()
	 * @see #getTaskModel()
	 * @generated
	 */
	EReference getTaskModel_Root();

	/**
	 * Returns the meta object for the containment reference list '{@link ctt.TaskModel#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see ctt.TaskModel#getTasks()
	 * @see #getTaskModel()
	 * @generated
	 */
	EReference getTaskModel_Tasks();

	/**
	 * Returns the meta object for the attribute '{@link ctt.TaskModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ctt.TaskModel#getName()
	 * @see #getTaskModel()
	 * @generated
	 */
	EAttribute getTaskModel_Name();

	/**
	 * Returns the meta object for class '{@link ctt.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see ctt.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link ctt.Task#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ctt.Task#getId()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Id();

	/**
	 * Returns the meta object for the attribute '{@link ctt.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ctt.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the containment reference '{@link ctt.Task#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operator</em>'.
	 * @see ctt.Task#getOperator()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Operator();

	/**
	 * Returns the meta object for the reference list '{@link ctt.Task#getSubtasks <em>Subtasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subtasks</em>'.
	 * @see ctt.Task#getSubtasks()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Subtasks();

	/**
	 * Returns the meta object for the reference '{@link ctt.Task#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see ctt.Task#getParent()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Parent();

	/**
	 * Returns the meta object for the attribute '{@link ctt.Task#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see ctt.Task#getMin()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Min();

	/**
	 * Returns the meta object for the attribute '{@link ctt.Task#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see ctt.Task#getMax()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Max();

	/**
	 * Returns the meta object for the attribute '{@link ctt.Task#getIterative <em>Iterative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iterative</em>'.
	 * @see ctt.Task#getIterative()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Iterative();

	/**
	 * Returns the meta object for class '{@link ctt.UserTask <em>User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Task</em>'.
	 * @see ctt.UserTask
	 * @generated
	 */
	EClass getUserTask();

	/**
	 * Returns the meta object for class '{@link ctt.ApplicationTask <em>Application Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Task</em>'.
	 * @see ctt.ApplicationTask
	 * @generated
	 */
	EClass getApplicationTask();

	/**
	 * Returns the meta object for class '{@link ctt.InteractionTask <em>Interaction Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Task</em>'.
	 * @see ctt.InteractionTask
	 * @generated
	 */
	EClass getInteractionTask();

	/**
	 * Returns the meta object for class '{@link ctt.AbstractionTask <em>Abstraction Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstraction Task</em>'.
	 * @see ctt.AbstractionTask
	 * @generated
	 */
	EClass getAbstractionTask();

	/**
	 * Returns the meta object for class '{@link ctt.NullTask <em>Null Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Task</em>'.
	 * @see ctt.NullTask
	 * @generated
	 */
	EClass getNullTask();

	/**
	 * Returns the meta object for class '{@link ctt.TemporalOperator <em>Temporal Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Operator</em>'.
	 * @see ctt.TemporalOperator
	 * @generated
	 */
	EClass getTemporalOperator();

	/**
	 * Returns the meta object for class '{@link ctt.ChoiceOperator <em>Choice Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice Operator</em>'.
	 * @see ctt.ChoiceOperator
	 * @generated
	 */
	EClass getChoiceOperator();

	/**
	 * Returns the meta object for class '{@link ctt.OrderIndependenceOperator <em>Order Independence Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Independence Operator</em>'.
	 * @see ctt.OrderIndependenceOperator
	 * @generated
	 */
	EClass getOrderIndependenceOperator();

	/**
	 * Returns the meta object for class '{@link ctt.InterleavingOperator <em>Interleaving Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interleaving Operator</em>'.
	 * @see ctt.InterleavingOperator
	 * @generated
	 */
	EClass getInterleavingOperator();

	/**
	 * Returns the meta object for class '{@link ctt.SynchronizationOperator <em>Synchronization Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronization Operator</em>'.
	 * @see ctt.SynchronizationOperator
	 * @generated
	 */
	EClass getSynchronizationOperator();

	/**
	 * Returns the meta object for class '{@link ctt.ParallelOperator <em>Parallel Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Operator</em>'.
	 * @see ctt.ParallelOperator
	 * @generated
	 */
	EClass getParallelOperator();

	/**
	 * Returns the meta object for class '{@link ctt.DisablingOperator <em>Disabling Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disabling Operator</em>'.
	 * @see ctt.DisablingOperator
	 * @generated
	 */
	EClass getDisablingOperator();

	/**
	 * Returns the meta object for class '{@link ctt.SequentialEnablingInfoOperator <em>Sequential Enabling Info Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequential Enabling Info Operator</em>'.
	 * @see ctt.SequentialEnablingInfoOperator
	 * @generated
	 */
	EClass getSequentialEnablingInfoOperator();

	/**
	 * Returns the meta object for class '{@link ctt.SequentialEnablingOperator <em>Sequential Enabling Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequential Enabling Operator</em>'.
	 * @see ctt.SequentialEnablingOperator
	 * @generated
	 */
	EClass getSequentialEnablingOperator();

	/**
	 * Returns the meta object for class '{@link ctt.SuspendResumeOperator <em>Suspend Resume Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suspend Resume Operator</em>'.
	 * @see ctt.SuspendResumeOperator
	 * @generated
	 */
	EClass getSuspendResumeOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CttFactory getCttFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ctt.impl.TaskModelImpl <em>Task Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctt.impl.TaskModelImpl
		 * @see ctt.impl.CttPackageImpl#getTaskModel()
		 * @generated
		 */
		EClass TASK_MODEL = eINSTANCE.getTaskModel();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_MODEL__ROOT = eINSTANCE.getTaskModel_Root();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_MODEL__TASKS = eINSTANCE.getTaskModel_Tasks();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_MODEL__NAME = eINSTANCE.getTaskModel_Name();

		/**
		 * The meta object literal for the '{@link ctt.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctt.impl.TaskImpl
		 * @see ctt.impl.CttPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__ID = eINSTANCE.getTask_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__OPERATOR = eINSTANCE.getTask_Operator();

		/**
		 * The meta object literal for the '<em><b>Subtasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__SUBTASKS = eINSTANCE.getTask_Subtasks();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PARENT = eINSTANCE.getTask_Parent();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__MIN = eINSTANCE.getTask_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__MAX = eINSTANCE.getTask_Max();

		/**
		 * The meta object literal for the '<em><b>Iterative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__ITERATIVE = eINSTANCE.getTask_Iterative();

		/**
		 * The meta object literal for the '{@link ctt.impl.UserTaskImpl <em>User Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctt.impl.UserTaskImpl
		 * @see ctt.impl.CttPackageImpl#getUserTask()
		 * @generated
		 */
		EClass USER_TASK = eINSTANCE.getUserTask();

		/**
		 * The meta object literal for the '{@link ctt.impl.ApplicationTaskImpl <em>Application Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctt.impl.ApplicationTaskImpl
		 * @see ctt.impl.CttPackageImpl#getApplicationTask()
		 * @generated
		 */
		EClass APPLICATION_TASK = eINSTANCE.getApplicationTask();

		/**
		 * The meta object literal for the '{@link ctt.impl.InteractionTaskImpl <em>Interaction Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctt.impl.InteractionTaskImpl
		 * @see ctt.impl.CttPackageImpl#getInteractionTask()
		 * @generated
		 */
		EClass INTERACTION_TASK = eINSTANCE.getInteractionTask();

		/**
		 * The meta object literal for the '{@link ctt.impl.AbstractionTaskImpl <em>Abstraction Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctt.impl.AbstractionTaskImpl
		 * @see ctt.impl.CttPackageImpl#getAbstractionTask()
		 * @generated
		 */
		EClass ABSTRACTION_TASK = eINSTANCE.getAbstractionTask();

		/**
		 * The meta object literal for the '{@link ctt.impl.NullTaskImpl <em>Null Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctt.impl.NullTaskImpl
		 * @see ctt.impl.CttPackageImpl#getNullTask()
		 * @generated
		 */
		EClass NULL_TASK = eINSTANCE.getNullTask();

		/**
		 * The meta object literal for the '{@link ctt.impl.TemporalOperatorImpl <em>Temporal Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctt.impl.TemporalOperatorImpl
		 * @see ctt.impl.CttPackageImpl#getTemporalOperator()
		 * @generated
		 */
		EClass TEMPORAL_OPERATOR = eINSTANCE.getTemporalOperator();

		/**
		 * The meta object literal for the '{@link ctt.impl.ChoiceOperatorImpl <em>Choice Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctt.impl.ChoiceOperatorImpl
		 * @see ctt.impl.CttPackageImpl#getChoiceOperator()
		 * @generated
		 */
		EClass CHOICE_OPERATOR = eINSTANCE.getChoiceOperator();

		/**
		 * The meta object literal for the '{@link ctt.impl.OrderIndependenceOperatorImpl <em>Order Independence Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctt.impl.OrderIndependenceOperatorImpl
		 * @see ctt.impl.CttPackageImpl#getOrderIndependenceOperator()
		 * @generated
		 */
		EClass ORDER_INDEPENDENCE_OPERATOR = eINSTANCE.getOrderIndependenceOperator();

		/**
		 * The meta object literal for the '{@link ctt.impl.InterleavingOperatorImpl <em>Interleaving Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctt.impl.InterleavingOperatorImpl
		 * @see ctt.impl.CttPackageImpl#getInterleavingOperator()
		 * @generated
		 */
		EClass INTERLEAVING_OPERATOR = eINSTANCE.getInterleavingOperator();

		/**
		 * The meta object literal for the '{@link ctt.impl.SynchronizationOperatorImpl <em>Synchronization Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctt.impl.SynchronizationOperatorImpl
		 * @see ctt.impl.CttPackageImpl#getSynchronizationOperator()
		 * @generated
		 */
		EClass SYNCHRONIZATION_OPERATOR = eINSTANCE.getSynchronizationOperator();

		/**
		 * The meta object literal for the '{@link ctt.impl.ParallelOperatorImpl <em>Parallel Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctt.impl.ParallelOperatorImpl
		 * @see ctt.impl.CttPackageImpl#getParallelOperator()
		 * @generated
		 */
		EClass PARALLEL_OPERATOR = eINSTANCE.getParallelOperator();

		/**
		 * The meta object literal for the '{@link ctt.impl.DisablingOperatorImpl <em>Disabling Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctt.impl.DisablingOperatorImpl
		 * @see ctt.impl.CttPackageImpl#getDisablingOperator()
		 * @generated
		 */
		EClass DISABLING_OPERATOR = eINSTANCE.getDisablingOperator();

		/**
		 * The meta object literal for the '{@link ctt.impl.SequentialEnablingInfoOperatorImpl <em>Sequential Enabling Info Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctt.impl.SequentialEnablingInfoOperatorImpl
		 * @see ctt.impl.CttPackageImpl#getSequentialEnablingInfoOperator()
		 * @generated
		 */
		EClass SEQUENTIAL_ENABLING_INFO_OPERATOR = eINSTANCE.getSequentialEnablingInfoOperator();

		/**
		 * The meta object literal for the '{@link ctt.impl.SequentialEnablingOperatorImpl <em>Sequential Enabling Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctt.impl.SequentialEnablingOperatorImpl
		 * @see ctt.impl.CttPackageImpl#getSequentialEnablingOperator()
		 * @generated
		 */
		EClass SEQUENTIAL_ENABLING_OPERATOR = eINSTANCE.getSequentialEnablingOperator();

		/**
		 * The meta object literal for the '{@link ctt.impl.SuspendResumeOperatorImpl <em>Suspend Resume Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ctt.impl.SuspendResumeOperatorImpl
		 * @see ctt.impl.CttPackageImpl#getSuspendResumeOperator()
		 * @generated
		 */
		EClass SUSPEND_RESUME_OPERATOR = eINSTANCE.getSuspendResumeOperator();

	}

} //CttPackage
