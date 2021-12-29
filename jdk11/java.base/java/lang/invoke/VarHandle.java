/*******************************************************************************
 * Copyright (c) 2017, 2021 IBM Corp. and others
 *
 * This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License 2.0 which accompanies this
 * distribution and is available at https://www.eclipse.org/legal/epl-2.0/
 * or the Apache License, Version 2.0 which accompanies this distribution and
 * is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * This Source Code may also be made available under the following
 * Secondary Licenses when the conditions for such availability set
 * forth in the Eclipse Public License, v. 2.0 are satisfied: GNU
 * General Public License, version 2 with the GNU Classpath
 * Exception [1] and GNU General Public License, version 2 with the
 * OpenJDK Assembly Exception [2].
 *
 * [1] https://www.gnu.org/software/classpath/license.html
 * [2] http://openjdk.java.net/legal/assembly-exception.html
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0 OR GPL-2.0 WITH Classpath-exception-2.0 OR LicenseRef-GPL-2.0 WITH Assembly-exception
 *******************************************************************************/
package java.lang.invoke;

import java.lang.invoke.MethodHandle.PolymorphicSignature;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import jdk.internal.misc.Unsafe;

import java.util.Map;
import java.util.HashMap;

/**
 * Dynamically typed reference to a field, allowing read and write operations, 
 * both atomic and with/without memory barriers. See {@link AccessMode} for
 * supported operations.
 * 
 * VarHandle instances are created through the MethodHandles factory API.
 * 
 */
public abstract class VarHandle extends VarHandleInternal 
{
	/**
	 * Access mode identifiers for VarHandle operations.
	 */
	public enum AccessMode {
		/**
		 * The {@link AccessMode} corresponding to {@link VarHandle#get(Object...) get(Object...)}.
		 */
		GET("get", AccessType.GET, false), //$NON-NLS-1$
		
		/**
		 * The {@link AccessMode} corresponding to {@link VarHandle#set(Object...) set(Object...)}.
		 */
		SET("set", AccessType.SET, true), //$NON-NLS-1$
		
		/**
		 * The {@link AccessMode} corresponding to {@link VarHandle#getVolatile(Object...) getVolatile(Object...)}.
		 */
		GET_VOLATILE("getVolatile", AccessType.GET, false), //$NON-NLS-1$
		
		/**
		 * The {@link AccessMode} corresponding to {@link VarHandle#setVolatile(Object...) setVolatile(Object...)}.
		 */
		SET_VOLATILE("setVolatile", AccessType.SET, true), //$NON-NLS-1$
		
		/**
		 * The {@link AccessMode} corresponding to {@link VarHandle#getOpaque(Object...) getOpaque(Object...)}.
		 */
		GET_OPAQUE("getOpaque", AccessType.GET, false), //$NON-NLS-1$
		
		/**
		 * The {@link AccessMode} corresponding to {@link VarHandle#setOpaque(Object...) setOpaque(Object...)}.
		 */
		SET_OPAQUE("setOpaque", AccessType.SET, true), //$NON-NLS-1$
		
		/**
		 * The {@link AccessMode} corresponding to {@link VarHandle#getAcquire(Object...) getAcquire(Object...)}.
		 */
		GET_ACQUIRE("getAcquire", AccessType.GET, false), //$NON-NLS-1$
		
		/**
		 * The {@link AccessMode} corresponding to {@link VarHandle#setRelease(Object...) setRelease(Object...)}.
		 */
		SET_RELEASE("setRelease", AccessType.SET, true), //$NON-NLS-1$
		
		/**
		 * The {@link AccessMode} corresponding to {@link VarHandle#compareAndSet(Object...) compareAndSet(Object...)}.
		 */
		COMPARE_AND_SET("compareAndSet", AccessType.COMPARE_AND_SET, true), //$NON-NLS-1$
		
		/**
		 * The {@link AccessMode} corresponding to {@link VarHandle#compareAndExchange(Object...) compareAndExchange(Object...)}.
		 */
		COMPARE_AND_EXCHANGE("compareAndExchange", AccessType.COMPARE_AND_EXCHANGE, true), //$NON-NLS-1$
		
		/**
		 * The {@link AccessMode} corresponding to {@link VarHandle#compareAndExchangeAcquire(Object...) compareAndExchangeAcquire(Object...)}.
		 */
		COMPARE_AND_EXCHANGE_ACQUIRE("compareAndExchangeAcquire", AccessType.COMPARE_AND_EXCHANGE, true), //$NON-NLS-1$
		
		/**
		 * The {@link AccessMode} corresponding to {@link VarHandle#compareAndExchangeRelease(Object...) compareAndExchangeRelease(Object...)}.
		 */
		COMPARE_AND_EXCHANGE_RELEASE("compareAndExchangeRelease", AccessType.COMPARE_AND_EXCHANGE, true), //$NON-NLS-1$
		
		/**
		 * The {@link AccessMode} corresponding to {@link VarHandle#weakCompareAndSet(Object...) weakCompareAndSet(Object...)}.
		 */
		WEAK_COMPARE_AND_SET("weakCompareAndSet", AccessType.COMPARE_AND_SET, true), //$NON-NLS-1$
		
		/**
		 * The {@link AccessMode} corresponding to {@link VarHandle#weakCompareAndSetAcquire(Object...) weakCompareAndSetAcquire(Object...)}.
		 */
		WEAK_COMPARE_AND_SET_ACQUIRE("weakCompareAndSetAcquire", AccessType.COMPARE_AND_SET, true), //$NON-NLS-1$
		
		/**
		 * The {@link AccessMode} corresponding to {@link VarHandle#weakCompareAndSetRelease(Object...) weakCompareAndSetRelease(Object...)}.
		 */
		WEAK_COMPARE_AND_SET_RELEASE("weakCompareAndSetRelease", AccessType.COMPARE_AND_SET, true), //$NON-NLS-1$
		
		/**
		 * The {@link AccessMode} corresponding to {@link VarHandle#weakCompareAndSetPlain(Object...) weakCompareAndSetPlain(Object...)}.
		 */
		WEAK_COMPARE_AND_SET_PLAIN("weakCompareAndSetPlain", AccessType.COMPARE_AND_SET, true), //$NON-NLS-1$
		
		/**
		 * The {@link AccessMode} corresponding to {@link VarHandle#getAndSet(Object...) getAndSet(Object...)}.
		 */
		GET_AND_SET("getAndSet", AccessType.GET_AND_UPDATE, true), //$NON-NLS-1$
		
		/**
		 * The {@link AccessMode} corresponding to {@link VarHandle#getAndSetAcquire(Object...) getAndSetAcquire(Object...)}.
		 */
		GET_AND_SET_ACQUIRE("getAndSetAcquire", AccessType.GET_AND_UPDATE, true), //$NON-NLS-1$
		
		/**
		 * The {@link AccessMode} corresponding to {@link VarHandle#getAndSetRelease(Object...) getAndSetRelease(Object...)}.
		 */
		GET_AND_SET_RELEASE("getAndSetRelease", AccessType.GET_AND_UPDATE, true), //$NON-NLS-1$
		
		/**
		 * The {@link AccessMode} corresponding to {@link VarHandle#getAndAdd(Object...) getAndAdd(Object...)}.
		 */
		GET_AND_ADD("getAndAdd", AccessType.GET_AND_UPDATE, true), //$NON-NLS-1$
		
		/**
		 * The {@link AccessMode} corresponding to {@link VarHandle#getAndAddAcquire(Object...) getAndAddAcquire(Object...)}.
		 */
		GET_AND_ADD_ACQUIRE("getAndAddAcquire", AccessType.GET_AND_UPDATE, true), //$NON-NLS-1$
		
		/**
		 * The {@link AccessMode} corresponding to {@link VarHandle#getAndAddRelease(Object...) getAndAddRelease(Object...)}.
		 */
		GET_AND_ADD_RELEASE("getAndAddRelease", AccessType.GET_AND_UPDATE, true), //$NON-NLS-1$
		
		/**
		 * The {@link AccessMode} corresponding to {@link VarHandle#getAndBitwiseAnd(Object...) getAndBitwiseAnd(Object...)}.
		 */
		GET_AND_BITWISE_AND("getAndBitwiseAnd", AccessType.GET_AND_UPDATE, true), //$NON-NLS-1$
		
		/**
		 * The {@link AccessMode} corresponding to {@link VarHandle#getAndBitwiseAndAcquire(Object...) getAndBitwiseAndAcquire(Object...)}.
		 */
		GET_AND_BITWISE_AND_ACQUIRE("getAndBitwiseAndAcquire", AccessType.GET_AND_UPDATE, true), //$NON-NLS-1$
		
		/**
		 * The {@link AccessMode} corresponding to {@link VarHandle#getAndBitwiseAndRelease(Object...) getAndBitwiseAndRelease(Object...)}.
		 */
		GET_AND_BITWISE_AND_RELEASE("getAndBitwiseAndRelease", AccessType.GET_AND_UPDATE, true), //$NON-NLS-1$
		
		/**
		 * The {@link AccessMode} corresponding to {@link VarHandle#getAndBitwiseOr(Object...) getAndBitwiseOr(Object...)}.
		 */
		GET_AND_BITWISE_OR("getAndBitwiseOr", AccessType.GET_AND_UPDATE, true), //$NON-NLS-1$
		
		/**
		 * The {@link AccessMode} corresponding to {@link VarHandle#getAndBitwiseOrAcquire(Object...) getAndBitwiseOrAcquire(Object...)}.
		 */
		GET_AND_BITWISE_OR_ACQUIRE("getAndBitwiseOrAcquire", AccessType.GET_AND_UPDATE, true), //$NON-NLS-1$
		
		/**
		 * The {@link AccessMode} corresponding to {@link VarHandle#getAndBitwiseOrRelease(Object...) getAndBitwiseOrRelease(Object...)}.
		 */
		GET_AND_BITWISE_OR_RELEASE("getAndBitwiseOrRelease", AccessType.GET_AND_UPDATE, true), //$NON-NLS-1$
		
		/**
		 * The {@link AccessMode} corresponding to {@link VarHandle#getAndBitwiseXor(Object...) getAndBitwiseXor(Object...)}.
		 */
		GET_AND_BITWISE_XOR("getAndBitwiseXor", AccessType.GET_AND_UPDATE, true), //$NON-NLS-1$
		
		/**
		 * The {@link AccessMode} corresponding to {@link VarHandle#getAndBitwiseXorAcquire(Object...) getAndBitwiseXorAcquire(Object...)}.
		 */
		GET_AND_BITWISE_XOR_ACQUIRE("getAndBitwiseXorAcquire", AccessType.GET_AND_UPDATE, true), //$NON-NLS-1$
		
		/**
		 * The {@link AccessMode} corresponding to {@link VarHandle#getAndBitwiseXorRelease(Object...) getAndBitwiseXorRelease(Object...)}.
		 */
		GET_AND_BITWISE_XOR_RELEASE("getAndBitwiseXorRelease", AccessType.GET_AND_UPDATE, true); //$NON-NLS-1$
		
		AccessType at;
		boolean isSetter;
		private String methodName;

		static final Map<String, AccessMode> methodNameToAccessMode;
		static {
			methodNameToAccessMode = new HashMap<>();
			for (AccessMode accessMode : values()) {
				methodNameToAccessMode.put(accessMode.methodName, accessMode);
			}
		}

		AccessMode(String methodName, AccessType signatureType, boolean isSetter) {
			this.methodName = methodName;
			this.at = signatureType;
			this.isSetter = isSetter;
		}
		
		/**
		 * @return The name of the method associated with this AccessMode.
		 */
		public String methodName() {
			return methodName;
		}

		/**
		 * Gets the AccessMode associated with the provided method name.
		 * 
		 * @param methodName The name of the method associated with the AccessMode being requested.
		 * @return The AccessMode associated with the provided method name.
		 */
		public static AccessMode valueFromMethodName(String methodName) {
			AccessMode accessMode = methodNameToAccessMode.get(methodName);
			if (accessMode != null) {
				return accessMode;
			}

			// K0633 = {0} is not a valid AccessMode.
			throw new IllegalArgumentException(com.ibm.oti.util.Msg.getString("K0633", methodName)); //$NON-NLS-1$
		}
	}
	
	enum AccessType {
		GET(Object.class),
		SET(void.class),
		COMPARE_AND_SET(boolean.class),
		COMPARE_AND_EXCHANGE(Object.class),
		GET_AND_UPDATE(Object.class);

		final boolean isMonomorphicInReturnType;
		final Class<?> returnType;

		AccessType(Class<?> returnType) {
			this.returnType = returnType;
			this.isMonomorphicInReturnType = (returnType != Object.class);
		}

		/**
		 * Gets the MethodType associated with the AccessType.
		 * 
		 * This method gets invoked by the derived VarHandle classes through accessModeTypeUncached.
		 * 
		 * OpenJ9 only uses it to retrieve the receiver class, which is not available from VarForm.
		 * 
		 * @param receiver class of the derived VarHandle.
		 * @param type is the field type or value type.
		 * @param args is the list of intermediate argument classes in the derived VarHandle's
		 * AccessMode methods.
		 * @return the MethodType for the corresponding AccessType.
		 */
		MethodType accessModeType(Class<?> receiver, Class<?> type, Class<?>... args) {
			List<Class<?>> paramList = new ArrayList<>();
			Class<?> returnType = null;
			switch (this) {
			case GET:
				returnType = type;
				paramList.add(receiver);
				Collections.addAll(paramList, args);
				break;
			case SET:
				returnType = void.class;
				paramList.add(receiver);
				Collections.addAll(paramList, args);
				paramList.add(type);
				break;
			case COMPARE_AND_SET:
				returnType = boolean.class;
				paramList.add(receiver);
				Collections.addAll(paramList, args);
				Collections.addAll(paramList, type, type);
				break;
			case COMPARE_AND_EXCHANGE:
				returnType = type;
				paramList.add(receiver);
				Collections.addAll(paramList, args);
				Collections.addAll(paramList, type, type);
				break;
			case GET_AND_UPDATE:
				returnType = type;
				paramList.add(receiver);
				Collections.addAll(paramList, args);
				paramList.add(type);
				break;
			default:
				throw new InternalError("Invalid AccessType.");
			}
			return MethodType.methodType(returnType, paramList);
		}
	}
	
	static final Unsafe _unsafe = Unsafe.getUnsafe();
	static final Lookup _lookup = Lookup.IMPL_LOOKUP;

	
	private final MethodHandle[] handleTable;

	final Class<?> fieldType;
	final Class<?>[] coordinateTypes;
	final int modifiers;

	/**
	 * Constructs a generic VarHandle instance. 
	 * 
	 * @param fieldType The type of the field referenced by this VarHandle.
	 * @param coordinateTypes An array of the argument types required to utilize the access modes on this VarHandle.
	 * @param handleTable An array of MethodHandles referencing the methods corresponding to this VarHandle's access modes.
	 * @param modifiers The field's modifiers.
	 */
	VarHandle(Class<?> fieldType, Class<?>[] coordinateTypes, MethodHandle[] handleTable, int modifiers) {
		this.fieldType = fieldType;
		this.coordinateTypes = coordinateTypes;
		this.handleTable = handleTable;
		this.modifiers = modifiers;
	}

	Class<?> getDefiningClass() {
		// K0627 = Expected override of this method.
		throw new InternalError(com.ibm.oti.util.Msg.getString("K0627")); //$NON-NLS-1$
	}
	
	String getFieldName() {
		// K0627 = Expected override of this method.
		throw new InternalError(com.ibm.oti.util.Msg.getString("K0627")); //$NON-NLS-1$
	}
	
	int getModifiers() {
		return modifiers;
	}
	
	/**
	 * Get the type of the field this {@link VarHandle} refers to.
	 * 
	 * @return The field type
	 */
	public final Class<?> varType() {
		return this.fieldType;
	}
	
	/**
	 * Different parameters are required in order to access the field referenced
	 * by this {@link VarHandle} depending on the type of the {@link VarHandle}, 
	 * e.g. instance field, static field, or array element. This method provides
	 * a list of the access parameters for this {@link VarHandle} instance.
	 * 
	 * @return The parameters required to access the field.
	 */
	public final List<Class<?>> coordinateTypes() {
		return Collections.unmodifiableList(Arrays.<Class<?>>asList(coordinateTypes));
	}

	/**
	 * Each {@link AccessMode}, e.g. get and set, requires different parameters
	 * in addition to the {@link VarHandle#coordinateTypes() coordinateTypes()}. 
	 * This method provides the {@link MethodType} for a specific {@link AccessMode},
	 * including the {@link VarHandle#coordinateTypes() coordinateTypes()}.
	 * 
	 * @param accessMode The {@link AccessMode} to get the {@link MethodType} for. 
	 * @return The {@link MethodType} corresponding to the provided {@link AccessMode}.
	 */
	public final MethodType accessModeType(AccessMode accessMode) {
		MethodType modifiedType = null;
		MethodHandle internalHandle = handleTable[accessMode.ordinal()];
		if (internalHandle == null) {
			modifiedType = accessModeTypeUncached(
					accessMode
				);
		} else {
			MethodType internalType = internalHandle.type();
			int numOfArguments = internalType.parameterCount();

			/* Drop the internal VarHandle argument. */
			modifiedType = internalType.dropParameterTypes(numOfArguments - 1, numOfArguments);
		}
		return modifiedType;
	}
	
	/**
	 * This is a helper method to allow sub-class ViewVarHandle provide its own implementation
	 * while making isAccessModeSupported(accessMode) final to satisfy signature tests.
	 * 
	 * @param accessMode The {@link AccessMode} to check support for.
	 * @return A boolean value indicating whether the {@link AccessMode} is supported.
	 */
	boolean isAccessModeSupportedHelper(AccessMode accessMode) {

		switch (accessMode) {
		case GET:
		case GET_VOLATILE:
		case GET_OPAQUE:
		case GET_ACQUIRE:
			return true;
		case SET:
		case SET_VOLATILE:
		case SET_OPAQUE:
		case SET_RELEASE:
		case COMPARE_AND_SET:
		case COMPARE_AND_EXCHANGE_ACQUIRE:
		case COMPARE_AND_EXCHANGE_RELEASE:
		case COMPARE_AND_EXCHANGE:
		case WEAK_COMPARE_AND_SET:
		case WEAK_COMPARE_AND_SET_ACQUIRE:
		case WEAK_COMPARE_AND_SET_RELEASE:
		case WEAK_COMPARE_AND_SET_PLAIN:
		case GET_AND_SET:
		case GET_AND_SET_ACQUIRE:
		case GET_AND_SET_RELEASE:
			return !Modifier.isFinal(modifiers);
		case GET_AND_ADD:
		case GET_AND_ADD_ACQUIRE:
		case GET_AND_ADD_RELEASE:
			return ((!Modifier.isFinal(modifiers)) && fieldType.isPrimitive() && (boolean.class != fieldType));
		case GET_AND_BITWISE_AND:
		case GET_AND_BITWISE_AND_ACQUIRE:
		case GET_AND_BITWISE_AND_RELEASE:
		case GET_AND_BITWISE_OR:
		case GET_AND_BITWISE_OR_ACQUIRE:
		case GET_AND_BITWISE_OR_RELEASE:
		case GET_AND_BITWISE_XOR:
		case GET_AND_BITWISE_XOR_ACQUIRE:
		case GET_AND_BITWISE_XOR_RELEASE:
			return ((!Modifier.isFinal(modifiers)) && (double.class != fieldType) && (float.class != fieldType) && fieldType.isPrimitive());
		default:
			throw new InternalError("Invalid AccessMode"); //$NON-NLS-1$
		}
	}
	
	/**
	 * Not all AccessMode are supported for all {@link VarHandle} instances, e.g. 
	 * because of the field type and/or field modifiers. This method indicates whether 
	 * a specific {@link AccessMode} is supported by this {@link VarHandle} instance.
	 * 
	 * @param accessMode The {@link AccessMode} to check support for.
	 * @return A boolean value indicating whether the {@link AccessMode} is supported.
	 */
	public final boolean isAccessModeSupported(AccessMode accessMode) {
		return isAccessModeSupportedHelper(accessMode);
	}
	
	/**
	 * This method creates a {@link MethodHandle} for a specific {@link AccessMode}.
	 * The {@link MethodHandle} is bound to this {@link VarHandle} instance.
	 * 
	 * @param accessMode The {@link AccessMode} to create a {@link MethodHandle} for.
	 * @return A {@link MethodHandle} for the specified {@link AccessMode}, bound to
	 * 			this {@link VarHandle} instance.
	 */
	public final MethodHandle toMethodHandle(AccessMode accessMode) {
		MethodHandle mh = handleTable[accessMode.ordinal()];

		if (mh != null) {
			mh = MethodHandles.insertArguments(mh, mh.type().parameterCount() - 1, this);
		}

		if ((mh == null) || !isAccessModeSupported(accessMode)) {
			MethodType mt = null;

			if (mh != null) {
				mt = mh.type();
			} else {

				mt = accessModeTypeUncached(
						accessMode
					);

				/* accessModeTypeUncached does not return null. It throws InternalError if the method type
				 * cannot be determined.
				 */
				mt = mt.appendParameterTypes(this.getClass());
			}

			try {
				mh = _lookup.findStatic(VarHandle.class, "throwUnsupportedOperationException", MethodType.methodType(void.class)); //$NON-NLS-1$
			} catch (Throwable e) {
				InternalError error = new InternalError("The method throwUnsupportedOperationException should be accessible and defined in this class."); //$NON-NLS-1$
				error.initCause(e);
				throw error;
			}

			/* The resulting method handle must come with the same signature as the requested access mode method
			 * so as to throw out UnsupportedOperationException from that method.
			 */
			mh = mh.asType(MethodType.methodType(mt.returnType()));
			mh = MethodHandles.dropArguments(mh, 0, mt.ptypes());
		}
		
		return mh;
	}
	
	private final static void throwUnsupportedOperationException() {
		// K0629 = Modification access modes are not allowed on final fields.
		throw new UnsupportedOperationException(com.ibm.oti.util.Msg.getString("K0629")); //$NON-NLS-1$
	}
	
	/**
	 * Inserts a complete memory fence, ensuring that no loads/stores before this
	 * fence are reordered with any loads/stores after the fence.
	 */
	public static void fullFence() {
		_unsafe.fullFence();
	}
	
	/**
	 * Inserts an acquire memory fence, ensuring that no loads before this fence
	 * are reordered with any loads/stores after the fence. 
	 */
	public static void acquireFence() {
		// TODO: loadLoad + loadStore
		_unsafe.loadFence();
	}
	
	/**
	 * Inserts a release memory fence, ensuring that no stores before this fence
	 * are reordered with any loads/stores after the fence. 
	 */
	public static void releaseFence() {
		// TODO: storeStore + loadStore
		_unsafe.storeFence();
	}
	
	/**
	 * Inserts a load memory fence, ensuring that no loads before the fence are
	 * reordered with any loads after the fence.
	 */
	public static void loadLoadFence() {
		_unsafe.loadLoadFence();
	}
	
	/**
	 * Inserts a store memory fence, ensuring that no stores before the fence are
	 * reordered with any stores after the fence.
	 */
	public static void storeStoreFence() {
		_unsafe.storeStoreFence();
	}
	
	/**
	 * Gets the value of the field referenced by this {@link VarHandle}. 
	 * This is a non-volatile operation.
	 * 
	 * @param args The arguments for this operation are determined by the field type
	 * 				(see {@link VarHandle#accessModeType(AccessMode) accessModeType()}) 
	 * 				and the access parameters (see {@link VarHandle#coordinateTypes() coordinateTypes()}).
	 * @return The value stored in the field
	 */
	public final native @PolymorphicSignature Object get(Object... args);
	
	/**
	 * Sets the value of the field referenced by this {@link VarHandle}. 
	 * This is a non-volatile operation.
	 * 
	 * @param args The arguments for this operation are determined by the field type
	 * 				(see {@link VarHandle#accessModeType(AccessMode) accessModeType()}) 
	 * 				and the access parameters (see {@link VarHandle#coordinateTypes() coordinateTypes()}).
	 */
	public final native @PolymorphicSignature void set(Object... args);
	
	/**
	 * Atomically gets the value of the field referenced by this {@link VarHandle}.
	 * 
	 * @param args The arguments for this operation are determined by the field type
	 * 				(see {@link VarHandle#accessModeType(AccessMode) accessModeType()}) 
	 * 				and the access parameters (see {@link VarHandle#coordinateTypes() coordinateTypes()}).
	 * @return The value stored in the field
	 */
	public final native @PolymorphicSignature Object getVolatile(Object... args);
	
	/**
	 * Atomically sets the value of the field referenced by this {@link VarHandle}.
	 * 
	 * @param args The arguments for this operation are determined by the field type
	 * 				(see {@link VarHandle#accessModeType(AccessMode) accessModeType()}) 
	 * 				and the access parameters (see {@link VarHandle#coordinateTypes() coordinateTypes()}).
	 */
	public final native @PolymorphicSignature void setVolatile(Object... args);
	
	/**
	 * Gets the value of the field referenced by this {@link VarHandle}.
	 * The operation is in program order, but does enforce ordering with respect to other threads.
	 * 
	 * @param args The arguments for this operation are determined by the field type
	 * 				(see {@link VarHandle#accessModeType(AccessMode) accessModeType()}) 
	 * 				and the access parameters (see {@link VarHandle#coordinateTypes() coordinateTypes()}).
	 * @return The value stored in the field
	 */
	public final native @PolymorphicSignature Object getOpaque(Object... args);
	
	/**
	 * Sets the value of the field referenced by this {@link VarHandle}.
	 * The operation is in program order, but does enforce ordering with respect to other threads.
	 * 
	 * @param args The arguments for this operation are determined by the field type
	 * 				(see {@link VarHandle#accessModeType(AccessMode) accessModeType()}) 
	 * 				and the access parameters (see {@link VarHandle#coordinateTypes() coordinateTypes()}).
	 */
	public final native @PolymorphicSignature void setOpaque(Object... args);
	
	/**
	 * Gets the value of the field referenced by this {@link VarHandle} using acquire semantics.
	 * Preceding loads will not be reordered with subsequent loads/stores.
	 * 
	 * @param args The arguments for this operation are determined by the field type
	 * 				(see {@link VarHandle#accessModeType(AccessMode) accessModeType()}) 
	 * 				and the access parameters (see {@link VarHandle#coordinateTypes() coordinateTypes()}).
	 * @return The value stored in the field
	 */
	public final native @PolymorphicSignature Object getAcquire(Object... args);
		
	/**
	 * Sets the value of the field referenced by this {@link VarHandle} using acquire semantics.
	 * Preceding stores will not be reordered with subsequent loads/stores.
	 * 
	 * @param args The arguments for this operation are determined by the field type
	 * 				(see {@link VarHandle#accessModeType(AccessMode) accessModeType()}) 
	 * 				and the access parameters (see {@link VarHandle#coordinateTypes() coordinateTypes()}).
	 */
	public final native @PolymorphicSignature void setRelease(Object... args);
	
	/**
	 * Atomically sets the value of the field referenced by this {@link VarHandle} if the
	 * field value before this operation equaled the expected value.
	 * The get operation has the memory semantics of {@link VarHandle#getVolatile(Object...) getVolatile(Object...)}.
	 * The set operation has the memory semantics of {@link VarHandle#setVolatile(Object...) setVolatile(Object...)}.
	 * 
	 * @param args The arguments for this operation are determined by the field type
	 * 				(see {@link VarHandle#accessModeType(AccessMode) accessModeType()}) 
	 * 				and the access parameters (see {@link VarHandle#coordinateTypes() coordinateTypes()}).
	 * @return A boolean value indicating whether the field was updated
	 */
	public final native @PolymorphicSignature boolean compareAndSet(Object... args);
	
	/**
	 * Atomically sets the value of the field referenced by this {@link VarHandle} if the
	 * field value before this operation equaled the expected value.
	 * The get operation has the memory semantics of {@link VarHandle#getVolatile(Object...) getVolatile(Object...)}.
	 * The set operation has the memory semantics of {@link VarHandle#setVolatile(Object...) setVolatile(Object...)}.
	 * 
	 * @param args The arguments for this operation are determined by the field type
	 * 				(see {@link VarHandle#accessModeType(AccessMode) accessModeType()}) 
	 * 				and the access parameters (see {@link VarHandle#coordinateTypes() coordinateTypes()}).
	 * @return The value of the field before this operation
	 */
	public final native @PolymorphicSignature Object compareAndExchange(Object... args);
	
	/**
	 * Atomically sets the value of the field referenced by this {@link VarHandle} if the
	 * field value before this operation equaled the expected value.
	 * The get operation has the memory semantics of {@link VarHandle#getAcquire(Object...) getAcquire(Object...)}.
	 * The set operation has the memory semantics of {@link VarHandle#set(Object...) set(Object...)}.
	 * 
	 * @param args The arguments for this operation are determined by the field type
	 * 				(see {@link VarHandle#accessModeType(AccessMode) accessModeType()}) 
	 * 				and the access parameters (see {@link VarHandle#coordinateTypes() coordinateTypes()}).
	 * @return The value of the field before this operation
	 */
	public final native @PolymorphicSignature Object compareAndExchangeAcquire(Object... args);
	
	/**
	 * Atomically sets the value of the field referenced by this {@link VarHandle} if the
	 * field value before this operation equaled the expected value.
	 * The get operation has the memory semantics of {@link VarHandle#get(Object...) get(Object...)}.
	 * The set operation has the memory semantics of {@link VarHandle#setRelease(Object...) setRelease(Object...)}.
	 * 
	 * @param args The arguments for this operation are determined by the field type
	 * 				(see {@link VarHandle#accessModeType(AccessMode) accessModeType()}) 
	 * 				and the access parameters (see {@link VarHandle#coordinateTypes() coordinateTypes()}).
	 * @return The value of the field before this operation
	 */
	public final native @PolymorphicSignature Object compareAndExchangeRelease(Object... args);
	
	/**
	 * Sets the value of the field referenced by this {@link VarHandle} if the
	 * field value before this operation equaled the expected value.
	 * The get operation has the memory semantics of {@link VarHandle#get(Object...) get(Object...)}.
	 * The set operation has the memory semantics of {@link VarHandle#set(Object...) set(Object...)}.
	 * 
	 * @param args The arguments for this operation are determined by the field type
	 * 				(see {@link VarHandle#accessModeType(AccessMode) accessModeType()}) 
	 * 				and the access parameters (see {@link VarHandle#coordinateTypes() coordinateTypes()}).
	 * @return A boolean value indicating whether the field was updated
	 */
	public final native @PolymorphicSignature boolean weakCompareAndSet(Object... args);
	
	/**
	 * Sets the value of the field referenced by this {@link VarHandle} if the
	 * field value before this operation equaled the expected value.
	 * The get operation has the memory semantics of {@link VarHandle#getAcquire(Object...) getAcquire(Object...)}.
	 * The set operation has the memory semantics of {@link VarHandle#set(Object...) set(Object...)}.
	 * 
	 * @param args The arguments for this operation are determined by the field type
	 * 				(see {@link VarHandle#accessModeType(AccessMode) accessModeType()}) 
	 * 				and the access parameters (see {@link VarHandle#coordinateTypes() coordinateTypes()}).
	 * @return A boolean value indicating whether the field was updated
	 */
	public final native @PolymorphicSignature boolean weakCompareAndSetAcquire(Object... args);
	
	/**
	 * Sets the value of the field referenced by this {@link VarHandle} if the
	 * field value before this operation equaled the expected value.
	 * The get operation has the memory semantics of {@link VarHandle#get(Object...) get(Object...)}.
	 * The set operation has the memory semantics of {@link VarHandle#setRelease(Object...) setRelease(Object...)}.
	 * 
	 * @param args The arguments for this operation are determined by the field type
	 * 				(see {@link VarHandle#accessModeType(AccessMode) accessModeType()}) 
	 * 				and the access parameters (see {@link VarHandle#coordinateTypes() coordinateTypes()}).
	 * @return A boolean value indicating whether the field was updated
	 */
	public final native @PolymorphicSignature boolean weakCompareAndSetRelease(Object... args);
	
	/**
	 * Sets the value of the field referenced by this {@link VarHandle} if the
	 * field value before this operation equaled the expected value.
	 * The get operation has the memory semantics of {@link VarHandle#get(Object...) get(Object...)}.
	 * The set operation has the memory semantics of {@link VarHandle#set(Object...) set(Object...)}.
	 * 
	 * @param args The arguments for this operation are determined by the field type
	 * 				(see {@link VarHandle#accessModeType(AccessMode) accessModeType()}) 
	 * 				and the access parameters (see {@link VarHandle#coordinateTypes() coordinateTypes()}).
	 * @return A boolean value indicating whether the field was updated
	 */
	public final native @PolymorphicSignature boolean weakCompareAndSetPlain(Object... args);
	
	/**
	 * Atomically sets the value of the field referenced by this {@link VarHandle}
	 * and returns the value of the field prior to the update.
	 * The get operation has the memory semantics of {@link VarHandle#getVolatile(Object...) getVolatile(Object...)}.
	 * The set operation has the memory semantics of {@link VarHandle#setVolatile(Object...) setVolatile(Object...)}.
	 * 
	 * @param args The arguments for this operation are determined by the field type
	 * 				(see {@link VarHandle#accessModeType(AccessMode) accessModeType()}) 
	 * 				and the access parameters (see {@link VarHandle#coordinateTypes() coordinateTypes()}).
	 * @return The value stored in the field prior to the update
	 */
	public final native @PolymorphicSignature Object getAndSet(Object... args);
	
	/**
	 * Atomically sets the value of the field referenced by this {@link VarHandle}
	 * and returns the value of the field prior to the update.
	 * The get operation has the memory semantics of {@link VarHandle#getAcquire(Object...) getAcquire(Object...)}.
	 * The set operation has the memory semantics of {@link VarHandle#set(Object...) set(Object...)}.
	 * 
	 * @param args The arguments for this operation are determined by the field type
	 * 				(see {@link VarHandle#accessModeType(AccessMode) accessModeType()}) 
	 * 				and the access parameters (see {@link VarHandle#coordinateTypes() coordinateTypes()}).
	 * @return The value stored in the field prior to the update
	 */
	public final native @PolymorphicSignature Object getAndSetAcquire(Object... args);
	
	/**
	 * Atomically sets the value of the field referenced by this {@link VarHandle}
	 * and returns the value of the field prior to the update.
	 * The get operation has the memory semantics of {@link VarHandle#set(Object...) get(Object...)}.
	 * The set operation has the memory semantics of {@link VarHandle#setRelease(Object...) setRelease(Object...)}.
	 * 
	 * @param args The arguments for this operation are determined by the field type
	 * 				(see {@link VarHandle#accessModeType(AccessMode) accessModeType()}) 
	 * 				and the access parameters (see {@link VarHandle#coordinateTypes() coordinateTypes()}).
	 * @return The value stored in the field prior to the update
	 */
	public final native @PolymorphicSignature Object getAndSetRelease(Object... args);
	
	/**
	 * Atomically adds to the current value of the field referenced by this {@link VarHandle}
	 * and returns the value of the field prior to the update.
	 * The get operation has the memory semantics of {@link VarHandle#getVolatile(Object...) getVolatile(Object...)}.
	 * The set operation has the memory semantics of {@link VarHandle#setVolatile(Object...) setVolatile(Object...)}.
	 * 
	 * @param args The arguments for this operation are determined by the field type
	 * 				(see {@link VarHandle#accessModeType(AccessMode) accessModeType()}) 
	 * 				and the access parameters (see {@link VarHandle#coordinateTypes() coordinateTypes()}).
	 * @return The value stored in the field prior to the update
	 */
	public final native @PolymorphicSignature Object getAndAdd(Object... args);
	
	/**
	 * Atomically adds to the current value of the field referenced by this {@link VarHandle}
	 * and returns the value of the field prior to the update.
	 * The get operation has the memory semantics of {@link VarHandle#getAcquire(Object...) getAcquire(Object...)}.
	 * The set operation has the memory semantics of {@link VarHandle#set(Object...) set(Object...)}.
	 * 
	 * @param args The arguments for this operation are determined by the field type
	 * 				(see {@link VarHandle#accessModeType(AccessMode) accessModeType()}) 
	 * 				and the access parameters (see {@link VarHandle#coordinateTypes() coordinateTypes()}).
	 * @return The value stored in the field prior to the update
	 */
	public final native @PolymorphicSignature Object getAndAddAcquire(Object... args);
	
	/**
	 * Atomically adds to the current value of the field referenced by this {@link VarHandle}
	 * and returns the value of the field prior to the update.
	 * The get operation has the memory semantics of {@link VarHandle#get(Object...) get(Object...)}.
	 * The set operation has the memory semantics of {@link VarHandle#setRelease(Object...) setRelease(Object...)}.
	 * 
	 * @param args The arguments for this operation are determined by the field type
	 * 				(see {@link VarHandle#accessModeType(AccessMode) accessModeType()}) 
	 * 				and the access parameters (see {@link VarHandle#coordinateTypes() coordinateTypes()}).
	 * @return The value stored in the field prior to the update
	 */
	public final native @PolymorphicSignature Object getAndAddRelease(Object... args);
	
	/**
	 * Atomically ANDs the provided value and the current value of the field referenced by this {@link VarHandle}
	 * and returns the value of the field prior to the update.
	 * The get operation has the memory semantics of {@link VarHandle#getVolatile(Object...) getVolatile(Object...)}.
	 * The set operation has the memory semantics of {@link VarHandle#setVolatile(Object...) setVolatile(Object...)}.
	 * 
	 * @param args The arguments for this operation are determined by the field type
	 * 				(see {@link VarHandle#accessModeType(AccessMode) accessModeType()}) 
	 * 				and the access parameters (see {@link VarHandle#coordinateTypes() coordinateTypes()}).
	 * @return The value stored in the field prior to the update
	 */
	public final native @PolymorphicSignature Object getAndBitwiseAnd(Object... args);
	
	/**
	 * Atomically ANDs the provided value and the current value of the field referenced by this {@link VarHandle}
	 * and returns the value of the field prior to the update.
	 * The get operation has the memory semantics of {@link VarHandle#getAcquire(Object...) getAcquire(Object...)}.
	 * The set operation has the memory semantics of {@link VarHandle#set(Object...) set(Object...)}.
	 * 
	 * @param args The arguments for this operation are determined by the field type
	 * 				(see {@link VarHandle#accessModeType(AccessMode) accessModeType()}) 
	 * 				and the access parameters (see {@link VarHandle#coordinateTypes() coordinateTypes()}).
	 * @return The value stored in the field prior to the update
	 */
	public final native @PolymorphicSignature Object getAndBitwiseAndAcquire(Object... args);
	
	/**
	 * Atomically ANDs the provided value and the current value of the field referenced by this {@link VarHandle}
	 * and returns the value of the field prior to the update.
	 * The get operation has the memory semantics of {@link VarHandle#get(Object...) (Object...)}.
	 * The set operation has the memory semantics of {@link VarHandle#setRelease(Object...) setRelease(Object...)}.
	 * 
	 * @param args The arguments for this operation are determined by the field type
	 * 				(see {@link VarHandle#accessModeType(AccessMode) accessModeType()}) 
	 * 				and the access parameters (see {@link VarHandle#coordinateTypes() coordinateTypes()}).
	 * @return The value stored in the field prior to the update
	 */
	public final native @PolymorphicSignature Object getAndBitwiseAndRelease(Object... args);
	
	/**
	 * Atomically ORs the provided value and the current value of the field referenced by this {@link VarHandle}
	 * and returns the value of the field prior to the update.
	 * The get operation has the memory semantics of {@link VarHandle#getVolatile(Object...) getVolatile(Object...)}.
	 * The set operation has the memory semantics of {@link VarHandle#setVolatile(Object...) setVolatile(Object...)}.
	 * 
	 * @param args The arguments for this operation are determined by the field type
	 * 				(see {@link VarHandle#accessModeType(AccessMode) accessModeType()}) 
	 * 				and the access parameters (see {@link VarHandle#coordinateTypes() coordinateTypes()}).
	 * @return The value stored in the field prior to the update
	 */
	public final native @PolymorphicSignature Object getAndBitwiseOr(Object... args);
	
	/**
	 * Atomically ORs the provided value and the current value of the field referenced by this {@link VarHandle}
	 * and returns the value of the field prior to the update.
	 * The get operation has the memory semantics of {@link VarHandle#getAcquire(Object...) getAcquire(Object...)}.
	 * The set operation has the memory semantics of {@link VarHandle#set(Object...) set(Object...)}.
	 * 
	 * @param args The arguments for this operation are determined by the field type
	 * 				(see {@link VarHandle#accessModeType(AccessMode) accessModeType()}) 
	 * 				and the access parameters (see {@link VarHandle#coordinateTypes() coordinateTypes()}).
	 * @return The value stored in the field prior to the update
	 */
	public final native @PolymorphicSignature Object getAndBitwiseOrAcquire(Object... args);
	
	/**
	 * Atomically ORs the provided value and the current value of the field referenced by this {@link VarHandle}
	 * and returns the value of the field prior to the update.
	 * The get operation has the memory semantics of {@link VarHandle#get(Object...) get(Object...)}.
	 * The set operation has the memory semantics of {@link VarHandle#setRelease(Object...) setRelease(Object...)}.
	 * 
	 * @param args The arguments for this operation are determined by the field type
	 * 				(see {@link VarHandle#accessModeType(AccessMode) accessModeType()}) 
	 * 				and the access parameters (see {@link VarHandle#coordinateTypes() coordinateTypes()}).
	 * @return The value stored in the field prior to the update
	 */
	public final native @PolymorphicSignature Object getAndBitwiseOrRelease(Object... args);
	
	/**
	 * Atomically XORs the provided value and the current value of the field referenced by this {@link VarHandle}
	 * and returns the value of the field prior to the update.
	 * The get operation has the memory semantics of {@link VarHandle#getVolatile(Object...) getVolatile(Object...)}.
	 * The set operation has the memory semantics of {@link VarHandle#setVolatile(Object...) setVolatile(Object...)}.
	 * 
	 * @param args The arguments for this operation are determined by the field type
	 * 				(see {@link VarHandle#accessModeType(AccessMode) accessModeType()}) 
	 * 				and the access parameters (see {@link VarHandle#coordinateTypes() coordinateTypes()}).
	 * @return The value stored in the field prior to the update
	 */
	public final native @PolymorphicSignature Object getAndBitwiseXor(Object... args);
	
	/**
	 * Atomically XORs the provided value and the current value of the field referenced by this {@link VarHandle}
	 * and returns the value of the field prior to the update.
	 * The get operation has the memory semantics of {@link VarHandle#getAcquire(Object...) getAcquire(Object...)}.
	 * The set operation has the memory semantics of {@link VarHandle#set(Object...) set(Object...)}.
	 * 
	 * @param args The arguments for this operation are determined by the field type
	 * 				(see {@link VarHandle#accessModeType(AccessMode) accessModeType()}) 
	 * 				and the access parameters (see {@link VarHandle#coordinateTypes() coordinateTypes()}).
	 * @return The value stored in the field prior to the update
	 */
	public final native @PolymorphicSignature Object getAndBitwiseXorAcquire(Object... args);
	
	/**
	 * Atomically XORs the provided value and the current value of the field referenced by this {@link VarHandle}
	 * and returns the value of the field prior to the update.
	 * The get operation has the memory semantics of {@link VarHandle#get(Object...) get(Object...)}.
	 * The set operation has the memory semantics of {@link VarHandle#setRelease(Object...) setRelease(Object...)}.
	 * 
	 * @param args The arguments for this operation are determined by the field type
	 * 				(see {@link VarHandle#accessModeType(AccessMode) accessModeType()}) 
	 * 				and the access parameters (see {@link VarHandle#coordinateTypes() coordinateTypes()}).
	 * @return The value stored in the field prior to the update
	 */
	public final native @PolymorphicSignature Object getAndBitwiseXorRelease(Object... args);
	
	static MethodHandle[] populateMHs(
			Class<? extends VarHandleOperations> operationsClass, MethodType[] lookupTypes, MethodType[] exactTypes) {
		MethodHandle[] operationMHs = new MethodHandle[AccessMode.values().length];
		
		try {
			/* Lookup the MethodHandles corresponding to access modes. */
			for (AccessMode accessMode : AccessMode.values()) {
				int index = accessMode.ordinal();
				operationMHs[index] = _lookup.findStatic(operationsClass, accessMode.methodName(), lookupTypes[index]);
			}
			
			/* If we provided a different set of exactTypes, clone the MethodHandles with the exact types. */
			if (lookupTypes != exactTypes) {
				for (AccessMode accessMode : AccessMode.values()) {
					int index = accessMode.ordinal();
					operationMHs[index] = operationMHs[index].cloneWithNewType(exactTypes[index]);
				}
			}
		} catch (IllegalAccessException | NoSuchMethodException e) {
			// K0623 = Unable to create MethodHandle to VarHandle operation.
			InternalError error = new InternalError(com.ibm.oti.util.Msg.getString("K0623")); //$NON-NLS-1$
			error.initCause(e);
			throw error;
		}
		
		return operationMHs;
	}
	
	static MethodType[] populateMTs(MethodType getter, MethodType setter, MethodType compareAndSet, MethodType compareAndExchange, MethodType getAndSet) {
		MethodType[] operationMTs = new MethodType[AccessMode.values().length];
		
		operationMTs[AccessMode.GET.ordinal()] = getter;
		operationMTs[AccessMode.SET.ordinal()] = setter;
		operationMTs[AccessMode.GET_VOLATILE.ordinal()] = getter;
		operationMTs[AccessMode.SET_VOLATILE.ordinal()] = setter;
		operationMTs[AccessMode.GET_OPAQUE.ordinal()] = getter;
		operationMTs[AccessMode.SET_OPAQUE.ordinal()] = setter;
		operationMTs[AccessMode.GET_ACQUIRE.ordinal()] = getter;
		operationMTs[AccessMode.SET_RELEASE.ordinal()] = setter;
		operationMTs[AccessMode.COMPARE_AND_SET.ordinal()] = compareAndSet;
		operationMTs[AccessMode.COMPARE_AND_EXCHANGE.ordinal()] = compareAndExchange;
		operationMTs[AccessMode.COMPARE_AND_EXCHANGE_ACQUIRE.ordinal()] = compareAndExchange;
		operationMTs[AccessMode.COMPARE_AND_EXCHANGE_RELEASE.ordinal()] = compareAndExchange;
		operationMTs[AccessMode.WEAK_COMPARE_AND_SET.ordinal()] = compareAndSet;
		operationMTs[AccessMode.WEAK_COMPARE_AND_SET_ACQUIRE.ordinal()] = compareAndSet;
		operationMTs[AccessMode.WEAK_COMPARE_AND_SET_RELEASE.ordinal()] = compareAndSet;
		operationMTs[AccessMode.WEAK_COMPARE_AND_SET_PLAIN.ordinal()] = compareAndSet;
		operationMTs[AccessMode.GET_AND_SET.ordinal()] = getAndSet;
		operationMTs[AccessMode.GET_AND_SET_ACQUIRE.ordinal()] = getAndSet;
		operationMTs[AccessMode.GET_AND_SET_RELEASE.ordinal()] = getAndSet;
		operationMTs[AccessMode.GET_AND_ADD.ordinal()] = getAndSet;
		operationMTs[AccessMode.GET_AND_ADD_ACQUIRE.ordinal()] = getAndSet;
		operationMTs[AccessMode.GET_AND_ADD_RELEASE.ordinal()] = getAndSet;
		operationMTs[AccessMode.GET_AND_BITWISE_AND.ordinal()] = getAndSet;
		operationMTs[AccessMode.GET_AND_BITWISE_AND_ACQUIRE.ordinal()] = getAndSet;
		operationMTs[AccessMode.GET_AND_BITWISE_AND_RELEASE.ordinal()] = getAndSet;
		operationMTs[AccessMode.GET_AND_BITWISE_OR.ordinal()] = getAndSet;
		operationMTs[AccessMode.GET_AND_BITWISE_OR_ACQUIRE.ordinal()] = getAndSet;
		operationMTs[AccessMode.GET_AND_BITWISE_OR_RELEASE.ordinal()] = getAndSet;
		operationMTs[AccessMode.GET_AND_BITWISE_XOR.ordinal()] = getAndSet;
		operationMTs[AccessMode.GET_AND_BITWISE_XOR_ACQUIRE.ordinal()] = getAndSet;
		operationMTs[AccessMode.GET_AND_BITWISE_XOR_RELEASE.ordinal()] = getAndSet;
		
		return operationMTs;
	}
	
	static class VarHandleOperations {
		static UnsupportedOperationException operationNotSupported(VarHandle varHandle) {
			// K0620 = This VarHandle operation is not supported by type {0}.
			return new UnsupportedOperationException(com.ibm.oti.util.Msg.getString("K0620", varHandle.fieldType)); //$NON-NLS-1$
		}
	}

	MethodHandle getFromHandleTable(int operation) {
		return handleTable[operation];
	}

	MethodType accessModeTypeUncached(
		AccessMode accessMode
	) {
		throw OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}

}
