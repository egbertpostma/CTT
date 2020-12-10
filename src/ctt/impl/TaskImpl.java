/**
 */
package ctt.impl;

import ctt.CttPackage;
import ctt.Task;
import ctt.TemporalOperator;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ctt.impl.TaskImpl#getId <em>Id</em>}</li>
 *   <li>{@link ctt.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link ctt.impl.TaskImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link ctt.impl.TaskImpl#getSubtasks <em>Subtasks</em>}</li>
 *   <li>{@link ctt.impl.TaskImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link ctt.impl.TaskImpl#getMin <em>Min</em>}</li>
 *   <li>{@link ctt.impl.TaskImpl#getMax <em>Max</em>}</li>
 *   <li>{@link ctt.impl.TaskImpl#getIterative <em>Iterative</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TaskImpl extends EObjectImpl implements Task {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected TemporalOperator operator;

	/**
	 * The cached value of the '{@link #getSubtasks() <em>Subtasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> subtasks;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Task parent;

	/**
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected Integer min = MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected Integer max = MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getIterative() <em>Iterative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterative()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ITERATIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIterative() <em>Iterative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterative()
	 * @generated
	 * @ordered
	 */
	protected Boolean iterative = ITERATIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CttPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CttPackage.TASK__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CttPackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperator(TemporalOperator newOperator, NotificationChain msgs) {
		TemporalOperator oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CttPackage.TASK__OPERATOR, oldOperator, newOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperator(TemporalOperator newOperator) {
		if (newOperator != operator) {
			NotificationChain msgs = null;
			if (operator != null)
				msgs = ((InternalEObject)operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CttPackage.TASK__OPERATOR, null, msgs);
			if (newOperator != null)
				msgs = ((InternalEObject)newOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CttPackage.TASK__OPERATOR, null, msgs);
			msgs = basicSetOperator(newOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CttPackage.TASK__OPERATOR, newOperator, newOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Task> getSubtasks() {
		if (subtasks == null) {
			subtasks = new EObjectWithInverseResolvingEList<Task>(Task.class, this, CttPackage.TASK__SUBTASKS, CttPackage.TASK__PARENT);
		}
		return subtasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Task getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (Task)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CttPackage.TASK__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Task newParent, NotificationChain msgs) {
		Task oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CttPackage.TASK__PARENT, oldParent, newParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(Task newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, CttPackage.TASK__SUBTASKS, Task.class, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, CttPackage.TASK__SUBTASKS, Task.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CttPackage.TASK__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMin(Integer newMin) {
		Integer oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CttPackage.TASK__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMax(Integer newMax) {
		Integer oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CttPackage.TASK__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIterative() {
		return iterative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIterative(Boolean newIterative) {
		Boolean oldIterative = iterative;
		iterative = newIterative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CttPackage.TASK__ITERATIVE, oldIterative, iterative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CttPackage.TASK__SUBTASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubtasks()).basicAdd(otherEnd, msgs);
			case CttPackage.TASK__PARENT:
				if (parent != null)
					msgs = ((InternalEObject)parent).eInverseRemove(this, CttPackage.TASK__SUBTASKS, Task.class, msgs);
				return basicSetParent((Task)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CttPackage.TASK__OPERATOR:
				return basicSetOperator(null, msgs);
			case CttPackage.TASK__SUBTASKS:
				return ((InternalEList<?>)getSubtasks()).basicRemove(otherEnd, msgs);
			case CttPackage.TASK__PARENT:
				return basicSetParent(null, msgs);
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
			case CttPackage.TASK__ID:
				return getId();
			case CttPackage.TASK__NAME:
				return getName();
			case CttPackage.TASK__OPERATOR:
				return getOperator();
			case CttPackage.TASK__SUBTASKS:
				return getSubtasks();
			case CttPackage.TASK__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CttPackage.TASK__MIN:
				return getMin();
			case CttPackage.TASK__MAX:
				return getMax();
			case CttPackage.TASK__ITERATIVE:
				return getIterative();
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
			case CttPackage.TASK__ID:
				setId((String)newValue);
				return;
			case CttPackage.TASK__NAME:
				setName((String)newValue);
				return;
			case CttPackage.TASK__OPERATOR:
				setOperator((TemporalOperator)newValue);
				return;
			case CttPackage.TASK__SUBTASKS:
				getSubtasks().clear();
				getSubtasks().addAll((Collection<? extends Task>)newValue);
				return;
			case CttPackage.TASK__PARENT:
				setParent((Task)newValue);
				return;
			case CttPackage.TASK__MIN:
				setMin((Integer)newValue);
				return;
			case CttPackage.TASK__MAX:
				setMax((Integer)newValue);
				return;
			case CttPackage.TASK__ITERATIVE:
				setIterative((Boolean)newValue);
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
			case CttPackage.TASK__ID:
				setId(ID_EDEFAULT);
				return;
			case CttPackage.TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CttPackage.TASK__OPERATOR:
				setOperator((TemporalOperator)null);
				return;
			case CttPackage.TASK__SUBTASKS:
				getSubtasks().clear();
				return;
			case CttPackage.TASK__PARENT:
				setParent((Task)null);
				return;
			case CttPackage.TASK__MIN:
				setMin(MIN_EDEFAULT);
				return;
			case CttPackage.TASK__MAX:
				setMax(MAX_EDEFAULT);
				return;
			case CttPackage.TASK__ITERATIVE:
				setIterative(ITERATIVE_EDEFAULT);
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
			case CttPackage.TASK__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CttPackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CttPackage.TASK__OPERATOR:
				return operator != null;
			case CttPackage.TASK__SUBTASKS:
				return subtasks != null && !subtasks.isEmpty();
			case CttPackage.TASK__PARENT:
				return parent != null;
			case CttPackage.TASK__MIN:
				return MIN_EDEFAULT == null ? min != null : !MIN_EDEFAULT.equals(min);
			case CttPackage.TASK__MAX:
				return MAX_EDEFAULT == null ? max != null : !MAX_EDEFAULT.equals(max);
			case CttPackage.TASK__ITERATIVE:
				return ITERATIVE_EDEFAULT == null ? iterative != null : !ITERATIVE_EDEFAULT.equals(iterative);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", min: ");
		result.append(min);
		result.append(", max: ");
		result.append(max);
		result.append(", iterative: ");
		result.append(iterative);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
