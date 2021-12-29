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
 * Structure: UtServerInterfacePointer
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
 * The generated code will provide getters for all elements in the UtServerInterfacePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=UtServerInterface.class)
public class UtServerInterfacePointer extends StructurePointer {

	// NULL
	public static final UtServerInterfacePointer NULL = new UtServerInterfacePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected UtServerInterfacePointer(long address) {
		super(address);
	}

	public static UtServerInterfacePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static UtServerInterfacePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static UtServerInterfacePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new UtServerInterfacePointer(address);
	}

	public UtServerInterfacePointer add(long count) {
		return UtServerInterfacePointer.cast(address + (UtServerInterface.SIZEOF * count));
	}

	public UtServerInterfacePointer add(Scalar count) {
		return add(count.longValue());
	}

	public UtServerInterfacePointer addOffset(long offset) {
		return UtServerInterfacePointer.cast(address + offset);
	}

	public UtServerInterfacePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public UtServerInterfacePointer sub(long count) {
		return UtServerInterfacePointer.cast(address - (UtServerInterface.SIZEOF * count));
	}

	public UtServerInterfacePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public UtServerInterfacePointer subOffset(long offset) {
		return UtServerInterfacePointer.cast(address - offset);
	}

	public UtServerInterfacePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public UtServerInterfacePointer untag(long mask) {
		return UtServerInterfacePointer.cast(address & ~mask);
	}

	public UtServerInterfacePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return UtServerInterface.SIZEOF;
	}

	// Implementation methods

	// void* AddComponent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_AddComponentOffset_", declaredType="void*")
	public VoidPointer AddComponent() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtServerInterface._AddComponentOffset_));
	}

	// void* AddComponent
	public PointerPointer AddComponentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtServerInterface._AddComponentOffset_));
	}

	// void* DeregisterRecordSubscriber
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_DeregisterRecordSubscriberOffset_", declaredType="void*")
	public VoidPointer DeregisterRecordSubscriber() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtServerInterface._DeregisterRecordSubscriberOffset_));
	}

	// void* DeregisterRecordSubscriber
	public PointerPointer DeregisterRecordSubscriberEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtServerInterface._DeregisterRecordSubscriberOffset_));
	}

	// void* DeregisterTracePointSubscriber
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_DeregisterTracePointSubscriberOffset_", declaredType="void*")
	public VoidPointer DeregisterTracePointSubscriber() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtServerInterface._DeregisterTracePointSubscriberOffset_));
	}

	// void* DeregisterTracePointSubscriber
	public PointerPointer DeregisterTracePointSubscriberEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtServerInterface._DeregisterTracePointSubscriberOffset_));
	}

	// void* DisableTrace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_DisableTraceOffset_", declaredType="void*")
	public VoidPointer DisableTrace() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtServerInterface._DisableTraceOffset_));
	}

	// void* DisableTrace
	public PointerPointer DisableTraceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtServerInterface._DisableTraceOffset_));
	}

	// void* EnableTrace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_EnableTraceOffset_", declaredType="void*")
	public VoidPointer EnableTrace() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtServerInterface._EnableTraceOffset_));
	}

	// void* EnableTrace
	public PointerPointer EnableTraceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtServerInterface._EnableTraceOffset_));
	}

	// void* FlushTraceData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_FlushTraceDataOffset_", declaredType="void*")
	public VoidPointer FlushTraceData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtServerInterface._FlushTraceDataOffset_));
	}

	// void* FlushTraceData
	public PointerPointer FlushTraceDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtServerInterface._FlushTraceDataOffset_));
	}

	// void* FormatNextTracePoint
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_FormatNextTracePointOffset_", declaredType="void*")
	public VoidPointer FormatNextTracePoint() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtServerInterface._FormatNextTracePointOffset_));
	}

	// void* FormatNextTracePoint
	public PointerPointer FormatNextTracePointEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtServerInterface._FormatNextTracePointOffset_));
	}

	// void* FreeTracePointIterator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_FreeTracePointIteratorOffset_", declaredType="void*")
	public VoidPointer FreeTracePointIterator() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtServerInterface._FreeTracePointIteratorOffset_));
	}

	// void* FreeTracePointIterator
	public PointerPointer FreeTracePointIteratorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtServerInterface._FreeTracePointIteratorOffset_));
	}

	// void* GetComponent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetComponentOffset_", declaredType="void*")
	public VoidPointer GetComponent() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtServerInterface._GetComponentOffset_));
	}

	// void* GetComponent
	public PointerPointer GetComponentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtServerInterface._GetComponentOffset_));
	}

	// void* GetComponents
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetComponentsOffset_", declaredType="void*")
	public VoidPointer GetComponents() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtServerInterface._GetComponentsOffset_));
	}

	// void* GetComponents
	public PointerPointer GetComponentsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtServerInterface._GetComponentsOffset_));
	}

	// void* GetTraceMetadata
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetTraceMetadataOffset_", declaredType="void*")
	public VoidPointer GetTraceMetadata() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtServerInterface._GetTraceMetadataOffset_));
	}

	// void* GetTraceMetadata
	public PointerPointer GetTraceMetadataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtServerInterface._GetTraceMetadataOffset_));
	}

	// void* GetTracePointIteratorForBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetTracePointIteratorForBufferOffset_", declaredType="void*")
	public VoidPointer GetTracePointIteratorForBuffer() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtServerInterface._GetTracePointIteratorForBufferOffset_));
	}

	// void* GetTracePointIteratorForBuffer
	public PointerPointer GetTracePointIteratorForBufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtServerInterface._GetTracePointIteratorForBufferOffset_));
	}

	// void* RegisterRecordSubscriber
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_RegisterRecordSubscriberOffset_", declaredType="void*")
	public VoidPointer RegisterRecordSubscriber() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtServerInterface._RegisterRecordSubscriberOffset_));
	}

	// void* RegisterRecordSubscriber
	public PointerPointer RegisterRecordSubscriberEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtServerInterface._RegisterRecordSubscriberOffset_));
	}

	// void* RegisterTracePointSubscriber
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_RegisterTracePointSubscriberOffset_", declaredType="void*")
	public VoidPointer RegisterTracePointSubscriber() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtServerInterface._RegisterTracePointSubscriberOffset_));
	}

	// void* RegisterTracePointSubscriber
	public PointerPointer RegisterTracePointSubscriberEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtServerInterface._RegisterTracePointSubscriberOffset_));
	}

	// void* Resume
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ResumeOffset_", declaredType="void*")
	public VoidPointer Resume() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtServerInterface._ResumeOffset_));
	}

	// void* Resume
	public PointerPointer ResumeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtServerInterface._ResumeOffset_));
	}

	// void* SetOptions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetOptionsOffset_", declaredType="void*")
	public VoidPointer SetOptions() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtServerInterface._SetOptionsOffset_));
	}

	// void* SetOptions
	public PointerPointer SetOptionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtServerInterface._SetOptionsOffset_));
	}

	// void* Suspend
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SuspendOffset_", declaredType="void*")
	public VoidPointer Suspend() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtServerInterface._SuspendOffset_));
	}

	// void* Suspend
	public PointerPointer SuspendEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtServerInterface._SuspendOffset_));
	}

	// void* TraceDeregister
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_TraceDeregisterOffset_", declaredType="void*")
	public VoidPointer TraceDeregister() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtServerInterface._TraceDeregisterOffset_));
	}

	// void* TraceDeregister
	public PointerPointer TraceDeregisterEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtServerInterface._TraceDeregisterOffset_));
	}

	// void* TraceRegister
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_TraceRegisterOffset_", declaredType="void*")
	public VoidPointer TraceRegister() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtServerInterface._TraceRegisterOffset_));
	}

	// void* TraceRegister
	public PointerPointer TraceRegisterEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtServerInterface._TraceRegisterOffset_));
	}

	// void* TraceSnap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_TraceSnapOffset_", declaredType="void*")
	public VoidPointer TraceSnap() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtServerInterface._TraceSnapOffset_));
	}

	// void* TraceSnap
	public PointerPointer TraceSnapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtServerInterface._TraceSnapOffset_));
	}

	// void* TraceSnapWithPriority
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_TraceSnapWithPriorityOffset_", declaredType="void*")
	public VoidPointer TraceSnapWithPriority() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtServerInterface._TraceSnapWithPriorityOffset_));
	}

	// void* TraceSnapWithPriority
	public PointerPointer TraceSnapWithPriorityEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtServerInterface._TraceSnapWithPriorityOffset_));
	}

	// void* TraceVNoThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_TraceVNoThreadOffset_", declaredType="void*")
	public VoidPointer TraceVNoThread() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtServerInterface._TraceVNoThreadOffset_));
	}

	// void* TraceVNoThread
	public PointerPointer TraceVNoThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtServerInterface._TraceVNoThreadOffset_));
	}

}
