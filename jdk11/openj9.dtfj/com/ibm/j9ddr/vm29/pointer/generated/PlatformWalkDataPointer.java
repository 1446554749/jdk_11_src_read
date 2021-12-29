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
 * Structure: PlatformWalkDataPointer
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
 * The generated code will provide getters for all elements in the PlatformWalkDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=PlatformWalkData.class)
public class PlatformWalkDataPointer extends StructurePointer {

	// NULL
	public static final PlatformWalkDataPointer NULL = new PlatformWalkDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected PlatformWalkDataPointer(long address) {
		super(address);
	}

	public static PlatformWalkDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static PlatformWalkDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static PlatformWalkDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new PlatformWalkDataPointer(address);
	}

	public PlatformWalkDataPointer add(long count) {
		return PlatformWalkDataPointer.cast(address + (PlatformWalkData.SIZEOF * count));
	}

	public PlatformWalkDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public PlatformWalkDataPointer addOffset(long offset) {
		return PlatformWalkDataPointer.cast(address + offset);
	}

	public PlatformWalkDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public PlatformWalkDataPointer sub(long count) {
		return PlatformWalkDataPointer.cast(address - (PlatformWalkData.SIZEOF * count));
	}

	public PlatformWalkDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public PlatformWalkDataPointer subOffset(long offset) {
		return PlatformWalkDataPointer.cast(address - offset);
	}

	public PlatformWalkDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public PlatformWalkDataPointer untag(long mask) {
		return PlatformWalkDataPointer.cast(address & ~mask);
	}

	public PlatformWalkDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return PlatformWalkData.SIZEOF;
	}

	// Implementation methods

	// U8 cleanupRequired
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cleanupRequiredOffset_", declaredType="U8")
	public U8 cleanupRequired() throws CorruptDataException {
		return new U8(getByteAtOffset(PlatformWalkData._cleanupRequiredOffset_));
	}

	// U8 cleanupRequired
	public U8Pointer cleanupRequiredEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(PlatformWalkData._cleanupRequiredOffset_));
	}

	// thread_port_t filterThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_filterThreadOffset_", declaredType="thread_port_t")
	public UDATA filterThread() throws CorruptDataException {
		return new U32(getIntAtOffset(PlatformWalkData._filterThreadOffset_));
	}

	// thread_port_t filterThread
	public UDATAPointer filterThreadEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(PlatformWalkData._filterThreadOffset_));
	}

	// sigaction oldHandler
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_oldHandlerOffset_", declaredType="sigaction")
	public sigactionPointer oldHandler() throws CorruptDataException {
		return sigactionPointer.cast(nonNullFieldEA(PlatformWalkData._oldHandlerOffset_));
	}

	// sigaction oldHandler
	public PointerPointer oldHandlerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(PlatformWalkData._oldHandlerOffset_));
	}

	// J9ThreadWalkState* state
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stateOffset_", declaredType="J9ThreadWalkState*")
	public J9ThreadWalkStatePointer state() throws CorruptDataException {
		return J9ThreadWalkStatePointer.cast(getPointerAtOffset(PlatformWalkData._stateOffset_));
	}

	// J9ThreadWalkState* state
	public PointerPointer stateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(PlatformWalkData._stateOffset_));
	}

	// I64 threadCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadCountOffset_", declaredType="I64")
	public IDATA threadCount() throws CorruptDataException {
		return new I64(getLongAtOffset(PlatformWalkData._threadCountOffset_));
	}

	// I64 threadCount
	public IDATAPointer threadCountEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(PlatformWalkData._threadCountOffset_));
	}

	// I32 threadIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadIndexOffset_", declaredType="I32")
	public IDATA threadIndex() throws CorruptDataException {
		return new I32(getIntAtOffset(PlatformWalkData._threadIndexOffset_));
	}

	// I32 threadIndex
	public IDATAPointer threadIndexEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(PlatformWalkData._threadIndexOffset_));
	}

	// thread_act_port_array_t threadList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadListOffset_", declaredType="thread_act_port_array_t")
	public UDATAPointer threadList() throws CorruptDataException {
		return U32Pointer.cast(getPointerAtOffset(PlatformWalkData._threadListOffset_));
	}

	// thread_act_port_array_t threadList
	public PointerPointer threadListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(PlatformWalkData._threadListOffset_));
	}

}
