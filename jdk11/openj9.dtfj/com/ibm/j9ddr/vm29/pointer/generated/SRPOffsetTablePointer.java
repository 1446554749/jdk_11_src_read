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
 * Structure: SRPOffsetTablePointer
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
 * The generated code will provide getters for all elements in the SRPOffsetTablePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=SRPOffsetTable.class)
public class SRPOffsetTablePointer extends StructurePointer {

	// NULL
	public static final SRPOffsetTablePointer NULL = new SRPOffsetTablePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected SRPOffsetTablePointer(long address) {
		super(address);
	}

	public static SRPOffsetTablePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static SRPOffsetTablePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static SRPOffsetTablePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new SRPOffsetTablePointer(address);
	}

	public SRPOffsetTablePointer add(long count) {
		return SRPOffsetTablePointer.cast(address + (SRPOffsetTable.SIZEOF * count));
	}

	public SRPOffsetTablePointer add(Scalar count) {
		return add(count.longValue());
	}

	public SRPOffsetTablePointer addOffset(long offset) {
		return SRPOffsetTablePointer.cast(address + offset);
	}

	public SRPOffsetTablePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public SRPOffsetTablePointer sub(long count) {
		return SRPOffsetTablePointer.cast(address - (SRPOffsetTable.SIZEOF * count));
	}

	public SRPOffsetTablePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public SRPOffsetTablePointer subOffset(long offset) {
		return SRPOffsetTablePointer.cast(address - offset);
	}

	public SRPOffsetTablePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public SRPOffsetTablePointer untag(long mask) {
		return SRPOffsetTablePointer.cast(address & ~mask);
	}

	public SRPOffsetTablePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return SRPOffsetTable.SIZEOF;
	}

	// Implementation methods

	// void** _baseAddresses
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__baseAddressesOffset_", declaredType="void**")
	public PointerPointer _baseAddresses() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(SRPOffsetTable.__baseAddressesOffset_));
	}

	// void** _baseAddresses
	public PointerPointer _baseAddressesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SRPOffsetTable.__baseAddressesOffset_));
	}

	// BufferManager* _bufferManager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bufferManagerOffset_", declaredType="BufferManager*")
	public BufferManagerPointer _bufferManager() throws CorruptDataException {
		return BufferManagerPointer.cast(getPointerAtOffset(SRPOffsetTable.__bufferManagerOffset_));
	}

	// BufferManager* _bufferManager
	public PointerPointer _bufferManagerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SRPOffsetTable.__bufferManagerOffset_));
	}

	// BuildResult _buildResult
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__buildResultOffset_", declaredType="BuildResult")
	public long _buildResult() throws CorruptDataException {
		if (BuildResult.SIZEOF == 1) {
			return getByteAtOffset(SRPOffsetTable.__buildResultOffset_);
		} else if (BuildResult.SIZEOF == 2) {
			return getShortAtOffset(SRPOffsetTable.__buildResultOffset_);
		} else if (BuildResult.SIZEOF == 4) {
			return getIntAtOffset(SRPOffsetTable.__buildResultOffset_);
		} else if (BuildResult.SIZEOF == 8) {
			return getLongAtOffset(SRPOffsetTable.__buildResultOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// BuildResult _buildResult
	public EnumPointer _buildResultEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(SRPOffsetTable.__buildResultOffset_), BuildResult.class);
	}

	// UDATA _maxKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxKeyOffset_", declaredType="UDATA")
	public UDATA _maxKey() throws CorruptDataException {
		return getUDATAAtOffset(SRPOffsetTable.__maxKeyOffset_);
	}

	// UDATA _maxKey
	public UDATAPointer _maxKeyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SRPOffsetTable.__maxKeyOffset_));
	}

	// UDATA _maxTag
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxTagOffset_", declaredType="UDATA")
	public UDATA _maxTag() throws CorruptDataException {
		return getUDATAAtOffset(SRPOffsetTable.__maxTagOffset_);
	}

	// UDATA _maxTag
	public UDATAPointer _maxTagEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SRPOffsetTable.__maxTagOffset_));
	}

	// SRPOffsetTable$Entry* _table
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tableOffset_", declaredType="SRPOffsetTable$Entry*")
	public SRPOffsetTable$EntryPointer _table() throws CorruptDataException {
		return SRPOffsetTable$EntryPointer.cast(getPointerAtOffset(SRPOffsetTable.__tableOffset_));
	}

	// SRPOffsetTable$Entry* _table
	public PointerPointer _tableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SRPOffsetTable.__tableOffset_));
	}

}
