/**
 */
package ctt.impl;

import ctt.AbstractionTask;
import ctt.ApplicationTask;
import ctt.ChoiceOperator;
import ctt.CttFactory;
import ctt.CttPackage;
import ctt.DisablingOperator;
import ctt.InteractionTask;
import ctt.InterleavingOperator;
import ctt.NullTask;
import ctt.OrderIndependenceOperator;
import ctt.ParallelOperator;
import ctt.SequentialEnablingInfoOperator;
import ctt.SequentialEnablingOperator;
import ctt.SuspendResumeOperator;
import ctt.SynchronizationOperator;
import ctt.Task;
import ctt.TaskModel;
import ctt.TemporalOperator;
import ctt.UserTask;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CttPackageImpl extends EPackageImpl implements CttPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractionTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderIndependenceOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interleavingOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizationOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disablingOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequentialEnablingInfoOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequentialEnablingOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suspendResumeOperatorEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ctt.CttPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CttPackageImpl() {
		super(eNS_URI, CttFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CttPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CttPackage init() {
		if (isInited) return (CttPackage)EPackage.Registry.INSTANCE.getEPackage(CttPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCttPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CttPackageImpl theCttPackage = registeredCttPackage instanceof CttPackageImpl ? (CttPackageImpl)registeredCttPackage : new CttPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCttPackage.createPackageContents();

		// Initialize created meta-data
		theCttPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCttPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CttPackage.eNS_URI, theCttPackage);
		return theCttPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskModel() {
		return taskModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskModel_Root() {
		return (EReference)taskModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskModel_Tasks() {
		return (EReference)taskModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskModel_Name() {
		return (EAttribute)taskModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTask_Id() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTask_Name() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTask_Operator() {
		return (EReference)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTask_Subtasks() {
		return (EReference)taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTask_Parent() {
		return (EReference)taskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTask_Min() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTask_Max() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTask_Iterative() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUserTask() {
		return userTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApplicationTask() {
		return applicationTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInteractionTask() {
		return interactionTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractionTask() {
		return abstractionTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNullTask() {
		return nullTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemporalOperator() {
		return temporalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChoiceOperator() {
		return choiceOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderIndependenceOperator() {
		return orderIndependenceOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterleavingOperator() {
		return interleavingOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSynchronizationOperator() {
		return synchronizationOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParallelOperator() {
		return parallelOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDisablingOperator() {
		return disablingOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSequentialEnablingInfoOperator() {
		return sequentialEnablingInfoOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSequentialEnablingOperator() {
		return sequentialEnablingOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuspendResumeOperator() {
		return suspendResumeOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CttFactory getCttFactory() {
		return (CttFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		taskModelEClass = createEClass(TASK_MODEL);
		createEReference(taskModelEClass, TASK_MODEL__ROOT);
		createEReference(taskModelEClass, TASK_MODEL__TASKS);
		createEAttribute(taskModelEClass, TASK_MODEL__NAME);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__ID);
		createEAttribute(taskEClass, TASK__NAME);
		createEReference(taskEClass, TASK__OPERATOR);
		createEReference(taskEClass, TASK__SUBTASKS);
		createEReference(taskEClass, TASK__PARENT);
		createEAttribute(taskEClass, TASK__MIN);
		createEAttribute(taskEClass, TASK__MAX);
		createEAttribute(taskEClass, TASK__ITERATIVE);

		userTaskEClass = createEClass(USER_TASK);

		applicationTaskEClass = createEClass(APPLICATION_TASK);

		interactionTaskEClass = createEClass(INTERACTION_TASK);

		abstractionTaskEClass = createEClass(ABSTRACTION_TASK);

		nullTaskEClass = createEClass(NULL_TASK);

		temporalOperatorEClass = createEClass(TEMPORAL_OPERATOR);

		choiceOperatorEClass = createEClass(CHOICE_OPERATOR);

		orderIndependenceOperatorEClass = createEClass(ORDER_INDEPENDENCE_OPERATOR);

		interleavingOperatorEClass = createEClass(INTERLEAVING_OPERATOR);

		synchronizationOperatorEClass = createEClass(SYNCHRONIZATION_OPERATOR);

		parallelOperatorEClass = createEClass(PARALLEL_OPERATOR);

		disablingOperatorEClass = createEClass(DISABLING_OPERATOR);

		sequentialEnablingInfoOperatorEClass = createEClass(SEQUENTIAL_ENABLING_INFO_OPERATOR);

		sequentialEnablingOperatorEClass = createEClass(SEQUENTIAL_ENABLING_OPERATOR);

		suspendResumeOperatorEClass = createEClass(SUSPEND_RESUME_OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		userTaskEClass.getESuperTypes().add(this.getTask());
		applicationTaskEClass.getESuperTypes().add(this.getTask());
		interactionTaskEClass.getESuperTypes().add(this.getTask());
		abstractionTaskEClass.getESuperTypes().add(this.getTask());
		nullTaskEClass.getESuperTypes().add(this.getTask());
		choiceOperatorEClass.getESuperTypes().add(this.getTemporalOperator());
		orderIndependenceOperatorEClass.getESuperTypes().add(this.getTemporalOperator());
		interleavingOperatorEClass.getESuperTypes().add(this.getTemporalOperator());
		synchronizationOperatorEClass.getESuperTypes().add(this.getTemporalOperator());
		parallelOperatorEClass.getESuperTypes().add(this.getTemporalOperator());
		disablingOperatorEClass.getESuperTypes().add(this.getTemporalOperator());
		sequentialEnablingInfoOperatorEClass.getESuperTypes().add(this.getTemporalOperator());
		sequentialEnablingOperatorEClass.getESuperTypes().add(this.getTemporalOperator());
		suspendResumeOperatorEClass.getESuperTypes().add(this.getTemporalOperator());

		// Initialize classes and features; add operations and parameters
		initEClass(taskModelEClass, TaskModel.class, "TaskModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskModel_Root(), this.getTask(), null, "root", null, 1, 1, TaskModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskModel_Tasks(), this.getTask(), null, "tasks", null, 1, -1, TaskModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, TaskModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Id(), ecorePackage.getEString(), "id", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Name(), ecorePackage.getEString(), "name", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Operator(), this.getTemporalOperator(), null, "operator", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Subtasks(), this.getTask(), this.getTask_Parent(), "subtasks", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Parent(), this.getTask(), this.getTask_Subtasks(), "parent", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Min(), ecorePackage.getEIntegerObject(), "min", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Max(), ecorePackage.getEIntegerObject(), "max", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Iterative(), ecorePackage.getEBooleanObject(), "iterative", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userTaskEClass, UserTask.class, "UserTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(applicationTaskEClass, ApplicationTask.class, "ApplicationTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interactionTaskEClass, InteractionTask.class, "InteractionTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractionTaskEClass, AbstractionTask.class, "AbstractionTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nullTaskEClass, NullTask.class, "NullTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(temporalOperatorEClass, TemporalOperator.class, "TemporalOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(choiceOperatorEClass, ChoiceOperator.class, "ChoiceOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orderIndependenceOperatorEClass, OrderIndependenceOperator.class, "OrderIndependenceOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interleavingOperatorEClass, InterleavingOperator.class, "InterleavingOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(synchronizationOperatorEClass, SynchronizationOperator.class, "SynchronizationOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parallelOperatorEClass, ParallelOperator.class, "ParallelOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(disablingOperatorEClass, DisablingOperator.class, "DisablingOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequentialEnablingInfoOperatorEClass, SequentialEnablingInfoOperator.class, "SequentialEnablingInfoOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequentialEnablingOperatorEClass, SequentialEnablingOperator.class, "SequentialEnablingOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(suspendResumeOperatorEClass, SuspendResumeOperator.class, "SuspendResumeOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CttPackageImpl
