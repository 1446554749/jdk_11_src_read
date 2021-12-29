/*******************************************************************************
 * Copyright (c) 1991, 2021 IBM Corp. and others
 *
 * This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License 2.0 which accompanies this
 * distribution and is available at https://www.eclipse.org/legal/epl-2.0/
 * or the Apache License, Version 2.0 which accompanies this distribution
 * and is available at https://www.apache.org/licenses/LICENSE-2.0.
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
 *  SPDX-License-Identifier: EPL-2.0 OR Apache-2.0 OR GPL-2.0 WITH Classpath-exception-2.0 OR LicenseRef-GPL-2.0 WITH Assembly-exception
 *******************************************************************************/

/**
 * WARNING!!! GENERATED FILE
 *
 * This class is generated.
 * Do not use the Eclipse "Organize Imports" feature on this class.
 *
 * It can contain user content, but that content must be delimited with the
 * the tags
 * [BEGIN USER IMPORTS]
 * [END USER IMPORTS]
 *
 * or
 *
 * [BEGIN USER CODE]
 * [END USER CODE]
 *
 * These tags are entered as comments.  Characters before [ and after ] are ignored.
 * Lines between the tags are inserted into the newly generated file.
 *
 * IMPORTS are combined and inserted above newly generated imports.  CODE is combined
 * and inserted immediately after the class declaration
 *
 * All lines outside these tags are lost and replaced with newly generated code.
 */
package com.ibm.j9ddr.vm29.pointer.generated;

/*[BEGIN USER IMPORTS]*/
/*[END USER IMPORTS]*/

import com.ibm.j9ddr.CorruptDataException;
import com.ibm.j9ddr.vm29.pointer.*;
import com.ibm.j9ddr.vm29.structure.*;
import com.ibm.j9ddr.vm29.types.*;

/**
 * Structure: MM_MainGCThreadPointer
 *
 * A generated implementation of a VM structure
 *
 * This class contains generated code and MAY contain hand written user code.
 *
 * Hand written user code must be contained at the top of
 * the class file, specifically above
 * the comment line containing WARNING!!! GENERATED CODE
 *
 * ALL code below the GENERATED warning will be replaced with new generated code
 * each time the PointerGenerator utility is run.
 *
 * The generated code will provide getters for all elements in the MM_MainGCThreadPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_MainGCThread.class)
public class MM_MainGCThreadPointer extends MM_BaseNonVirtualPointer {

	// NULL
	public static final MM_MainGCThreadPointer NULL = new MM_MainGCThreadPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_MainGCThreadPointer(long address) {
		super(address);
	}

	public static MM_MainGCThreadPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_MainGCThreadPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_MainGCThreadPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_MainGCThreadPointer(address);
	}

	public MM_MainGCThreadPointer add(long count) {
		return MM_MainGCThreadPointer.cast(address + (MM_MainGCThread.SIZEOF * count));
	}

	public MM_MainGCThreadPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_MainGCThreadPointer addOffset(long offset) {
		return MM_MainGCThreadPointer.cast(address + offset);
	}

	public MM_MainGCThreadPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_MainGCThreadPointer sub(long count) {
		return MM_MainGCThreadPointer.cast(address - (MM_MainGCThread.SIZEOF * count));
	}

	public MM_MainGCThreadPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_MainGCThreadPointer subOffset(long offset) {
		return MM_MainGCThreadPointer.cast(address - offset);
	}

	public MM_MainGCThreadPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_MainGCThreadPointer untag(long mask) {
		return MM_MainGCThreadPointer.cast(address & ~mask);
	}

	public MM_MainGCThreadPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_MainGCThread.SIZEOF;
	}

	// Implementation methods

	// bool _acquireVMAccessDuringConcurrent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__acquireVMAccessDuringConcurrentOffset_", declaredType="bool")
	public boolean _acquireVMAccessDuringConcurrent() throws CorruptDataException {
		return getBoolAtOffset(MM_MainGCThread.__acquireVMAccessDuringConcurrentOffset_);
	}

	// bool _acquireVMAccessDuringConcurrent
	public BoolPointer _acquireVMAccessDuringConcurrentEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_MainGCThread.__acquireVMAccessDuringConcurrentOffset_));
	}

	// MM_AllocateDescription* _allocDesc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocDescOffset_", declaredType="MM_AllocateDescription*")
	public MM_AllocateDescriptionPointer _allocDesc() throws CorruptDataException {
		return MM_AllocateDescriptionPointer.cast(getPointerAtOffset(MM_MainGCThread.__allocDescOffset_));
	}

	// MM_AllocateDescription* _allocDesc
	public PointerPointer _allocDescEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MainGCThread.__allocDescOffset_));
	}

	// MM_Collector* _collector
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__collectorOffset_", declaredType="MM_Collector*")
	public MM_CollectorPointer _collector() throws CorruptDataException {
		return MM_CollectorPointer.cast(getPointerAtOffset(MM_MainGCThread.__collectorOffset_));
	}

	// MM_Collector* _collector
	public PointerPointer _collectorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MainGCThread.__collectorOffset_));
	}

	// omrthread_monitor_t _collectorControlMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__collectorControlMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _collectorControlMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(MM_MainGCThread.__collectorControlMutexOffset_));
	}

	// omrthread_monitor_t _collectorControlMutex
	public PointerPointer _collectorControlMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MainGCThread.__collectorControlMutexOffset_));
	}

	// bool _concurrentResumable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__concurrentResumableOffset_", declaredType="bool")
	public boolean _concurrentResumable() throws CorruptDataException {
		return getBoolAtOffset(MM_MainGCThread.__concurrentResumableOffset_);
	}

	// bool _concurrentResumable
	public BoolPointer _concurrentResumableEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_MainGCThread.__concurrentResumableOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensionsBase*")
	public MM_GCExtensionsBasePointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsBasePointer.cast(getPointerAtOffset(MM_MainGCThread.__extensionsOffset_));
	}

	// MM_GCExtensionsBase* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MainGCThread.__extensionsOffset_));
	}

	// MM_CycleState* _incomingCycleState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__incomingCycleStateOffset_", declaredType="MM_CycleState*")
	public MM_CycleStatePointer _incomingCycleState() throws CorruptDataException {
		return MM_CycleStatePointer.cast(getPointerAtOffset(MM_MainGCThread.__incomingCycleStateOffset_));
	}

	// MM_CycleState* _incomingCycleState
	public PointerPointer _incomingCycleStateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MainGCThread.__incomingCycleStateOffset_));
	}

	// omrthread_t _mainGCThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__mainGCThreadOffset_", declaredType="omrthread_t")
	public J9ThreadPointer _mainGCThread() throws CorruptDataException {
		return J9ThreadPointer.cast(getPointerAtOffset(MM_MainGCThread.__mainGCThreadOffset_));
	}

	// omrthread_t _mainGCThread
	public PointerPointer _mainGCThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_MainGCThread.__mainGCThreadOffset_));
	}

	// volatile MainGCThreadState _mainThreadState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__mainThreadStateOffset_", declaredType="volatile MainGCThreadState")
	public long _mainThreadState() throws CorruptDataException {
		if (MM_MainGCThread$MainGCThreadState.SIZEOF == 1) {
			return getByteAtOffset(MM_MainGCThread.__mainThreadStateOffset_);
		} else if (MM_MainGCThread$MainGCThreadState.SIZEOF == 2) {
			return getShortAtOffset(MM_MainGCThread.__mainThreadStateOffset_);
		} else if (MM_MainGCThread$MainGCThreadState.SIZEOF == 4) {
			return getIntAtOffset(MM_MainGCThread.__mainThreadStateOffset_);
		} else if (MM_MainGCThread$MainGCThreadState.SIZEOF == 8) {
			return getLongAtOffset(MM_MainGCThread.__mainThreadStateOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// volatile MainGCThreadState _mainThreadState
	public EnumPointer _mainThreadStateEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_MainGCThread.__mainThreadStateOffset_), MM_MainGCThread$MainGCThreadState.class);
	}

	// bool _runAsImplicit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__runAsImplicitOffset_", declaredType="bool")
	public boolean _runAsImplicit() throws CorruptDataException {
		return getBoolAtOffset(MM_MainGCThread.__runAsImplicitOffset_);
	}

	// bool _runAsImplicit
	public BoolPointer _runAsImplicitEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_MainGCThread.__runAsImplicitOffset_));
	}

}
