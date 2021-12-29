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
 * Structure: MM_TLHAllocationSupportPointer
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
 * The generated code will provide getters for all elements in the MM_TLHAllocationSupportPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_TLHAllocationSupport.class)
public class MM_TLHAllocationSupportPointer extends StructurePointer {

	// NULL
	public static final MM_TLHAllocationSupportPointer NULL = new MM_TLHAllocationSupportPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_TLHAllocationSupportPointer(long address) {
		super(address);
	}

	public static MM_TLHAllocationSupportPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_TLHAllocationSupportPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_TLHAllocationSupportPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_TLHAllocationSupportPointer(address);
	}

	public MM_TLHAllocationSupportPointer add(long count) {
		return MM_TLHAllocationSupportPointer.cast(address + (MM_TLHAllocationSupport.SIZEOF * count));
	}

	public MM_TLHAllocationSupportPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_TLHAllocationSupportPointer addOffset(long offset) {
		return MM_TLHAllocationSupportPointer.cast(address + offset);
	}

	public MM_TLHAllocationSupportPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_TLHAllocationSupportPointer sub(long count) {
		return MM_TLHAllocationSupportPointer.cast(address - (MM_TLHAllocationSupport.SIZEOF * count));
	}

	public MM_TLHAllocationSupportPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_TLHAllocationSupportPointer subOffset(long offset) {
		return MM_TLHAllocationSupportPointer.cast(address - offset);
	}

	public MM_TLHAllocationSupportPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_TLHAllocationSupportPointer untag(long mask) {
		return MM_TLHAllocationSupportPointer.cast(address & ~mask);
	}

	public MM_TLHAllocationSupportPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_TLHAllocationSupport.SIZEOF;
	}

	// Implementation methods

	// MM_HeapLinkedFreeHeaderTLH* _abandonedList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__abandonedListOffset_", declaredType="MM_HeapLinkedFreeHeaderTLH*")
	public MM_HeapLinkedFreeHeaderTLHPointer _abandonedList() throws CorruptDataException {
		return MM_HeapLinkedFreeHeaderTLHPointer.cast(getPointerAtOffset(MM_TLHAllocationSupport.__abandonedListOffset_));
	}

	// MM_HeapLinkedFreeHeaderTLH* _abandonedList
	public PointerPointer _abandonedListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_TLHAllocationSupport.__abandonedListOffset_));
	}

	// U64 _abandonedListSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__abandonedListSizeOffset_", declaredType="U64")
	public UDATA _abandonedListSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_TLHAllocationSupport.__abandonedListSizeOffset_));
	}

	// U64 _abandonedListSize
	public UDATAPointer _abandonedListSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_TLHAllocationSupport.__abandonedListSizeOffset_));
	}

	// MM_LanguageThreadLocalHeap _languageTLH
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__languageTLHOffset_", declaredType="MM_LanguageThreadLocalHeap")
	public MM_LanguageThreadLocalHeapPointer _languageTLH() throws CorruptDataException {
		return MM_LanguageThreadLocalHeapPointer.cast(nonNullFieldEA(MM_TLHAllocationSupport.__languageTLHOffset_));
	}

	// MM_LanguageThreadLocalHeap _languageTLH
	public PointerPointer _languageTLHEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_TLHAllocationSupport.__languageTLHOffset_));
	}

	// MM_ObjectAllocationInterface* _objectAllocationInterface
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__objectAllocationInterfaceOffset_", declaredType="MM_ObjectAllocationInterface*")
	public MM_ObjectAllocationInterfacePointer _objectAllocationInterface() throws CorruptDataException {
		return MM_ObjectAllocationInterfacePointer.cast(getPointerAtOffset(MM_TLHAllocationSupport.__objectAllocationInterfaceOffset_));
	}

	// MM_ObjectAllocationInterface* _objectAllocationInterface
	public PointerPointer _objectAllocationInterfaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_TLHAllocationSupport.__objectAllocationInterfaceOffset_));
	}

	// const OMR_VMThread* _omrVMThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__omrVMThreadOffset_", declaredType="const OMR_VMThread*")
	public OMR_VMThreadPointer _omrVMThread() throws CorruptDataException {
		return OMR_VMThreadPointer.cast(getPointerAtOffset(MM_TLHAllocationSupport.__omrVMThreadOffset_));
	}

	// const OMR_VMThread* _omrVMThread
	public PointerPointer _omrVMThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_TLHAllocationSupport.__omrVMThreadOffset_));
	}

	// const void** _pointerToHeapAlloc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__pointerToHeapAllocOffset_", declaredType="const void**")
	public PointerPointer _pointerToHeapAlloc() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(MM_TLHAllocationSupport.__pointerToHeapAllocOffset_));
	}

	// const void** _pointerToHeapAlloc
	public PointerPointer _pointerToHeapAllocEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_TLHAllocationSupport.__pointerToHeapAllocOffset_));
	}

	// const void** _pointerToHeapTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__pointerToHeapTopOffset_", declaredType="const void**")
	public PointerPointer _pointerToHeapTop() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(MM_TLHAllocationSupport.__pointerToHeapTopOffset_));
	}

	// const void** _pointerToHeapTop
	public PointerPointer _pointerToHeapTopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_TLHAllocationSupport.__pointerToHeapTopOffset_));
	}

	// const I64* _pointerToTlhPrefetchFTA
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__pointerToTlhPrefetchFTAOffset_", declaredType="const I64*")
	public IDATAPointer _pointerToTlhPrefetchFTA() throws CorruptDataException {
		return I64Pointer.cast(getPointerAtOffset(MM_TLHAllocationSupport.__pointerToTlhPrefetchFTAOffset_));
	}

	// const I64* _pointerToTlhPrefetchFTA
	public PointerPointer _pointerToTlhPrefetchFTAEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_TLHAllocationSupport.__pointerToTlhPrefetchFTAOffset_));
	}

	// const LanguageThreadLocalHeapStruct* _tlh
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tlhOffset_", declaredType="const LanguageThreadLocalHeapStruct*")
	public J9ModronThreadLocalHeapPointer _tlh() throws CorruptDataException {
		return J9ModronThreadLocalHeapPointer.cast(getPointerAtOffset(MM_TLHAllocationSupport.__tlhOffset_));
	}

	// const LanguageThreadLocalHeapStruct* _tlh
	public PointerPointer _tlhEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_TLHAllocationSupport.__tlhOffset_));
	}

	// const bool _zeroTLH
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__zeroTLHOffset_", declaredType="const bool")
	public boolean _zeroTLH() throws CorruptDataException {
		return getBoolAtOffset(MM_TLHAllocationSupport.__zeroTLHOffset_);
	}

	// const bool _zeroTLH
	public BoolPointer _zeroTLHEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_TLHAllocationSupport.__zeroTLHOffset_));
	}

}
