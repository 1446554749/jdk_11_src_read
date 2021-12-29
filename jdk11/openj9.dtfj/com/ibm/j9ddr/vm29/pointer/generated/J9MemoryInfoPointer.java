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
 * Structure: J9MemoryInfoPointer
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
 * The generated code will provide getters for all elements in the J9MemoryInfoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9MemoryInfo.class)
public class J9MemoryInfoPointer extends StructurePointer {

	// NULL
	public static final J9MemoryInfoPointer NULL = new J9MemoryInfoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9MemoryInfoPointer(long address) {
		super(address);
	}

	public static J9MemoryInfoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9MemoryInfoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9MemoryInfoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9MemoryInfoPointer(address);
	}

	public J9MemoryInfoPointer add(long count) {
		return J9MemoryInfoPointer.cast(address + (J9MemoryInfo.SIZEOF * count));
	}

	public J9MemoryInfoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9MemoryInfoPointer addOffset(long offset) {
		return J9MemoryInfoPointer.cast(address + offset);
	}

	public J9MemoryInfoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9MemoryInfoPointer sub(long count) {
		return J9MemoryInfoPointer.cast(address - (J9MemoryInfo.SIZEOF * count));
	}

	public J9MemoryInfoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9MemoryInfoPointer subOffset(long offset) {
		return J9MemoryInfoPointer.cast(address - offset);
	}

	public J9MemoryInfoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9MemoryInfoPointer untag(long mask) {
		return J9MemoryInfoPointer.cast(address & ~mask);
	}

	public J9MemoryInfoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9MemoryInfo.SIZEOF;
	}

	// Implementation methods

	// U64 availPhysical
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_availPhysicalOffset_", declaredType="U64")
	public UDATA availPhysical() throws CorruptDataException {
		return new U64(getLongAtOffset(J9MemoryInfo._availPhysicalOffset_));
	}

	// U64 availPhysical
	public UDATAPointer availPhysicalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MemoryInfo._availPhysicalOffset_));
	}

	// U64 availSwap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_availSwapOffset_", declaredType="U64")
	public UDATA availSwap() throws CorruptDataException {
		return new U64(getLongAtOffset(J9MemoryInfo._availSwapOffset_));
	}

	// U64 availSwap
	public UDATAPointer availSwapEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MemoryInfo._availSwapOffset_));
	}

	// U64 availVirtual
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_availVirtualOffset_", declaredType="U64")
	public UDATA availVirtual() throws CorruptDataException {
		return new U64(getLongAtOffset(J9MemoryInfo._availVirtualOffset_));
	}

	// U64 availVirtual
	public UDATAPointer availVirtualEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MemoryInfo._availVirtualOffset_));
	}

	// U64 buffered
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bufferedOffset_", declaredType="U64")
	public UDATA buffered() throws CorruptDataException {
		return new U64(getLongAtOffset(J9MemoryInfo._bufferedOffset_));
	}

	// U64 buffered
	public UDATAPointer bufferedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MemoryInfo._bufferedOffset_));
	}

	// U64 cached
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cachedOffset_", declaredType="U64")
	public UDATA cached() throws CorruptDataException {
		return new U64(getLongAtOffset(J9MemoryInfo._cachedOffset_));
	}

	// U64 cached
	public UDATAPointer cachedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MemoryInfo._cachedOffset_));
	}

	// U64 hostAvailPhysical
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hostAvailPhysicalOffset_", declaredType="U64")
	public UDATA hostAvailPhysical() throws CorruptDataException {
		return new U64(getLongAtOffset(J9MemoryInfo._hostAvailPhysicalOffset_));
	}

	// U64 hostAvailPhysical
	public UDATAPointer hostAvailPhysicalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MemoryInfo._hostAvailPhysicalOffset_));
	}

	// U64 hostBuffered
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hostBufferedOffset_", declaredType="U64")
	public UDATA hostBuffered() throws CorruptDataException {
		return new U64(getLongAtOffset(J9MemoryInfo._hostBufferedOffset_));
	}

	// U64 hostBuffered
	public UDATAPointer hostBufferedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MemoryInfo._hostBufferedOffset_));
	}

	// U64 hostCached
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hostCachedOffset_", declaredType="U64")
	public UDATA hostCached() throws CorruptDataException {
		return new U64(getLongAtOffset(J9MemoryInfo._hostCachedOffset_));
	}

	// U64 hostCached
	public UDATAPointer hostCachedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MemoryInfo._hostCachedOffset_));
	}

	// I64 timestamp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_timestampOffset_", declaredType="I64")
	public IDATA timestamp() throws CorruptDataException {
		return new I64(getLongAtOffset(J9MemoryInfo._timestampOffset_));
	}

	// I64 timestamp
	public IDATAPointer timestampEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9MemoryInfo._timestampOffset_));
	}

	// U64 totalPhysical
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_totalPhysicalOffset_", declaredType="U64")
	public UDATA totalPhysical() throws CorruptDataException {
		return new U64(getLongAtOffset(J9MemoryInfo._totalPhysicalOffset_));
	}

	// U64 totalPhysical
	public UDATAPointer totalPhysicalEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MemoryInfo._totalPhysicalOffset_));
	}

	// U64 totalSwap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_totalSwapOffset_", declaredType="U64")
	public UDATA totalSwap() throws CorruptDataException {
		return new U64(getLongAtOffset(J9MemoryInfo._totalSwapOffset_));
	}

	// U64 totalSwap
	public UDATAPointer totalSwapEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MemoryInfo._totalSwapOffset_));
	}

	// U64 totalVirtual
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_totalVirtualOffset_", declaredType="U64")
	public UDATA totalVirtual() throws CorruptDataException {
		return new U64(getLongAtOffset(J9MemoryInfo._totalVirtualOffset_));
	}

	// U64 totalVirtual
	public UDATAPointer totalVirtualEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9MemoryInfo._totalVirtualOffset_));
	}

}
