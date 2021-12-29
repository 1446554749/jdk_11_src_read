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
 * Structure: RasGlobalStoragePointer
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
 * The generated code will provide getters for all elements in the RasGlobalStoragePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=RasGlobalStorage.class)
public class RasGlobalStoragePointer extends StructurePointer {

	// NULL
	public static final RasGlobalStoragePointer NULL = new RasGlobalStoragePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected RasGlobalStoragePointer(long address) {
		super(address);
	}

	public static RasGlobalStoragePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static RasGlobalStoragePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static RasGlobalStoragePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new RasGlobalStoragePointer(address);
	}

	public RasGlobalStoragePointer add(long count) {
		return RasGlobalStoragePointer.cast(address + (RasGlobalStorage.SIZEOF * count));
	}

	public RasGlobalStoragePointer add(Scalar count) {
		return add(count.longValue());
	}

	public RasGlobalStoragePointer addOffset(long offset) {
		return RasGlobalStoragePointer.cast(address + offset);
	}

	public RasGlobalStoragePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public RasGlobalStoragePointer sub(long count) {
		return RasGlobalStoragePointer.cast(address - (RasGlobalStorage.SIZEOF * count));
	}

	public RasGlobalStoragePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public RasGlobalStoragePointer subOffset(long offset) {
		return RasGlobalStoragePointer.cast(address - offset);
	}

	public RasGlobalStoragePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public RasGlobalStoragePointer untag(long mask) {
		return RasGlobalStoragePointer.cast(address & ~mask);
	}

	public RasGlobalStoragePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return RasGlobalStorage.SIZEOF;
	}

	// Implementation methods

	// ConfigureTraceFunction configureTraceEngine
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_configureTraceEngineOffset_", declaredType="ConfigureTraceFunction")
	public VoidPointer configureTraceEngine() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(RasGlobalStorage._configureTraceEngineOffset_));
	}

	// ConfigureTraceFunction configureTraceEngine
	public PointerPointer configureTraceEngineEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(RasGlobalStorage._configureTraceEngineOffset_));
	}

	// void* deferredJVMRIThreads
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_deferredJVMRIThreadsOffset_", declaredType="void*")
	public VoidPointer deferredJVMRIThreads() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(RasGlobalStorage._deferredJVMRIThreadsOffset_));
	}

	// void* deferredJVMRIThreads
	public PointerPointer deferredJVMRIThreadsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(RasGlobalStorage._deferredJVMRIThreadsOffset_));
	}

	// void* jvmriInterface
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jvmriInterfaceOffset_", declaredType="void*")
	public VoidPointer jvmriInterface() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(RasGlobalStorage._jvmriInterfaceOffset_));
	}

	// void* jvmriInterface
	public PointerPointer jvmriInterfaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(RasGlobalStorage._jvmriInterfaceOffset_));
	}

	// U32 stackCompressionLevel
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackCompressionLevelOffset_", declaredType="U32")
	public UDATA stackCompressionLevel() throws CorruptDataException {
		return new U32(getIntAtOffset(RasGlobalStorage._stackCompressionLevelOffset_));
	}

	// U32 stackCompressionLevel
	public UDATAPointer stackCompressionLevelEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(RasGlobalStorage._stackCompressionLevelOffset_));
	}

	// I32 stackdepth
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stackdepthOffset_", declaredType="I32")
	public IDATA stackdepth() throws CorruptDataException {
		return new I32(getIntAtOffset(RasGlobalStorage._stackdepthOffset_));
	}

	// I32 stackdepth
	public IDATAPointer stackdepthEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(RasGlobalStorage._stackdepthOffset_));
	}

	// void* traceMethodTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_traceMethodTableOffset_", declaredType="void*")
	public VoidPointer traceMethodTable() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(RasGlobalStorage._traceMethodTableOffset_));
	}

	// void* traceMethodTable
	public PointerPointer traceMethodTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(RasGlobalStorage._traceMethodTableOffset_));
	}

	// void* triggerOnMethods
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_triggerOnMethodsOffset_", declaredType="void*")
	public VoidPointer triggerOnMethods() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(RasGlobalStorage._triggerOnMethodsOffset_));
	}

	// void* triggerOnMethods
	public PointerPointer triggerOnMethodsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(RasGlobalStorage._triggerOnMethodsOffset_));
	}

	// void* utGlobalData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_utGlobalDataOffset_", declaredType="void*")
	public VoidPointer utGlobalData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(RasGlobalStorage._utGlobalDataOffset_));
	}

	// void* utGlobalData
	public PointerPointer utGlobalDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(RasGlobalStorage._utGlobalDataOffset_));
	}

	// UtInterface* utIntf
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_utIntfOffset_", declaredType="UtInterface*")
	public UtInterfacePointer utIntf() throws CorruptDataException {
		return UtInterfacePointer.cast(getPointerAtOffset(RasGlobalStorage._utIntfOffset_));
	}

	// UtInterface* utIntf
	public PointerPointer utIntfEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(RasGlobalStorage._utIntfOffset_));
	}

}
