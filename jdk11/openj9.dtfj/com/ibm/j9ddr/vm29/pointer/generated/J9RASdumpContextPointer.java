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
 * Structure: J9RASdumpContextPointer
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
 * The generated code will provide getters for all elements in the J9RASdumpContextPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9RASdumpContext.class)
public class J9RASdumpContextPointer extends StructurePointer {

	// NULL
	public static final J9RASdumpContextPointer NULL = new J9RASdumpContextPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9RASdumpContextPointer(long address) {
		super(address);
	}

	public static J9RASdumpContextPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9RASdumpContextPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9RASdumpContextPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9RASdumpContextPointer(address);
	}

	public J9RASdumpContextPointer add(long count) {
		return J9RASdumpContextPointer.cast(address + (J9RASdumpContext.SIZEOF * count));
	}

	public J9RASdumpContextPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9RASdumpContextPointer addOffset(long offset) {
		return J9RASdumpContextPointer.cast(address + offset);
	}

	public J9RASdumpContextPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9RASdumpContextPointer sub(long count) {
		return J9RASdumpContextPointer.cast(address - (J9RASdumpContext.SIZEOF * count));
	}

	public J9RASdumpContextPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9RASdumpContextPointer subOffset(long offset) {
		return J9RASdumpContextPointer.cast(address - offset);
	}

	public J9RASdumpContextPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9RASdumpContextPointer untag(long mask) {
		return J9RASdumpContextPointer.cast(address & ~mask);
	}

	public J9RASdumpContextPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9RASdumpContext.SIZEOF;
	}

	// Implementation methods

	// U8* dumpList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dumpListOffset_", declaredType="U8*")
	public U8Pointer dumpList() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9RASdumpContext._dumpListOffset_));
	}

	// U8* dumpList
	public PointerPointer dumpListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9RASdumpContext._dumpListOffset_));
	}

	// UDATA dumpListIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dumpListIndexOffset_", declaredType="UDATA")
	public UDATA dumpListIndex() throws CorruptDataException {
		return getUDATAAtOffset(J9RASdumpContext._dumpListIndexOffset_);
	}

	// UDATA dumpListIndex
	public UDATAPointer dumpListIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9RASdumpContext._dumpListIndexOffset_));
	}

	// UDATA dumpListSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dumpListSizeOffset_", declaredType="UDATA")
	public UDATA dumpListSize() throws CorruptDataException {
		return getUDATAAtOffset(J9RASdumpContext._dumpListSizeOffset_);
	}

	// UDATA dumpListSize
	public UDATAPointer dumpListSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9RASdumpContext._dumpListSizeOffset_));
	}

	// J9RASdumpEventData* eventData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_eventDataOffset_", declaredType="J9RASdumpEventData*")
	public J9RASdumpEventDataPointer eventData() throws CorruptDataException {
		return J9RASdumpEventDataPointer.cast(getPointerAtOffset(J9RASdumpContext._eventDataOffset_));
	}

	// J9RASdumpEventData* eventData
	public PointerPointer eventDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9RASdumpContext._eventDataOffset_));
	}

	// UDATA eventFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_eventFlagsOffset_", declaredType="UDATA")
	public UDATA eventFlags() throws CorruptDataException {
		return getUDATAAtOffset(J9RASdumpContext._eventFlagsOffset_);
	}

	// UDATA eventFlags
	public UDATAPointer eventFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9RASdumpContext._eventFlagsOffset_));
	}

	// J9JavaVM* javaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_javaVMOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer javaVM() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(J9RASdumpContext._javaVMOffset_));
	}

	// J9JavaVM* javaVM
	public PointerPointer javaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9RASdumpContext._javaVMOffset_));
	}

	// J9VMThread* onThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_onThreadOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer onThread() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(J9RASdumpContext._onThreadOffset_));
	}

	// J9VMThread* onThread
	public PointerPointer onThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9RASdumpContext._onThreadOffset_));
	}

}
