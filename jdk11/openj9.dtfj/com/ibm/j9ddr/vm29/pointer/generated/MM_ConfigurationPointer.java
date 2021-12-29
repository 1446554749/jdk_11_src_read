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
 * Structure: MM_ConfigurationPointer
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
 * The generated code will provide getters for all elements in the MM_ConfigurationPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_Configuration.class)
public class MM_ConfigurationPointer extends MM_BaseVirtualPointer {

	// NULL
	public static final MM_ConfigurationPointer NULL = new MM_ConfigurationPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ConfigurationPointer(long address) {
		super(address);
	}

	public static MM_ConfigurationPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ConfigurationPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ConfigurationPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ConfigurationPointer(address);
	}

	public MM_ConfigurationPointer add(long count) {
		return MM_ConfigurationPointer.cast(address + (MM_Configuration.SIZEOF * count));
	}

	public MM_ConfigurationPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ConfigurationPointer addOffset(long offset) {
		return MM_ConfigurationPointer.cast(address + offset);
	}

	public MM_ConfigurationPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ConfigurationPointer sub(long count) {
		return MM_ConfigurationPointer.cast(address - (MM_Configuration.SIZEOF * count));
	}

	public MM_ConfigurationPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ConfigurationPointer subOffset(long offset) {
		return MM_ConfigurationPointer.cast(address - offset);
	}

	public MM_ConfigurationPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ConfigurationPointer untag(long mask) {
		return MM_ConfigurationPointer.cast(address & ~mask);
	}

	public MM_ConfigurationPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_Configuration.SIZEOF;
	}

	// Implementation methods

	// const MM_AlignmentType _alignmentType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__alignmentTypeOffset_", declaredType="const MM_AlignmentType")
	public long _alignmentType() throws CorruptDataException {
		if (MM_AlignmentType.SIZEOF == 1) {
			return getByteAtOffset(MM_Configuration.__alignmentTypeOffset_);
		} else if (MM_AlignmentType.SIZEOF == 2) {
			return getShortAtOffset(MM_Configuration.__alignmentTypeOffset_);
		} else if (MM_AlignmentType.SIZEOF == 4) {
			return getIntAtOffset(MM_Configuration.__alignmentTypeOffset_);
		} else if (MM_AlignmentType.SIZEOF == 8) {
			return getLongAtOffset(MM_Configuration.__alignmentTypeOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// const MM_AlignmentType _alignmentType
	public EnumPointer _alignmentTypeEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_Configuration.__alignmentTypeOffset_), MM_AlignmentType.class);
	}

	// const MM_GCAllocationType _allocationType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocationTypeOffset_", declaredType="const MM_GCAllocationType")
	public long _allocationType() throws CorruptDataException {
		if (MM_GCAllocationType.SIZEOF == 1) {
			return getByteAtOffset(MM_Configuration.__allocationTypeOffset_);
		} else if (MM_GCAllocationType.SIZEOF == 2) {
			return getShortAtOffset(MM_Configuration.__allocationTypeOffset_);
		} else if (MM_GCAllocationType.SIZEOF == 4) {
			return getIntAtOffset(MM_Configuration.__allocationTypeOffset_);
		} else if (MM_GCAllocationType.SIZEOF == 8) {
			return getLongAtOffset(MM_Configuration.__allocationTypeOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// const MM_GCAllocationType _allocationType
	public EnumPointer _allocationTypeEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_Configuration.__allocationTypeOffset_), MM_GCAllocationType.class);
	}

	// const U64 _defaultArrayletLeafSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__defaultArrayletLeafSizeOffset_", declaredType="const U64")
	public UDATA _defaultArrayletLeafSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_Configuration.__defaultArrayletLeafSizeOffset_));
	}

	// const U64 _defaultArrayletLeafSize
	public UDATAPointer _defaultArrayletLeafSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_Configuration.__defaultArrayletLeafSizeOffset_));
	}

	// const U64 _defaultRegionSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__defaultRegionSizeOffset_", declaredType="const U64")
	public UDATA _defaultRegionSize() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_Configuration.__defaultRegionSizeOffset_));
	}

	// const U64 _defaultRegionSize
	public UDATAPointer _defaultRegionSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_Configuration.__defaultRegionSizeOffset_));
	}

	// MM_ConfigurationDelegate _delegate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__delegateOffset_", declaredType="MM_ConfigurationDelegate")
	public MM_ConfigurationDelegatePointer _delegate() throws CorruptDataException {
		return MM_ConfigurationDelegatePointer.cast(nonNullFieldEA(MM_Configuration.__delegateOffset_));
	}

	// MM_ConfigurationDelegate _delegate
	public PointerPointer _delegateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_Configuration.__delegateOffset_));
	}

	// const MM_GCWriteBarrierType _writeBarrierType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__writeBarrierTypeOffset_", declaredType="const MM_GCWriteBarrierType")
	public long _writeBarrierType() throws CorruptDataException {
		if (MM_GCWriteBarrierType.SIZEOF == 1) {
			return getByteAtOffset(MM_Configuration.__writeBarrierTypeOffset_);
		} else if (MM_GCWriteBarrierType.SIZEOF == 2) {
			return getShortAtOffset(MM_Configuration.__writeBarrierTypeOffset_);
		} else if (MM_GCWriteBarrierType.SIZEOF == 4) {
			return getIntAtOffset(MM_Configuration.__writeBarrierTypeOffset_);
		} else if (MM_GCWriteBarrierType.SIZEOF == 8) {
			return getLongAtOffset(MM_Configuration.__writeBarrierTypeOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// const MM_GCWriteBarrierType _writeBarrierType
	public EnumPointer _writeBarrierTypeEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_Configuration.__writeBarrierTypeOffset_), MM_GCWriteBarrierType.class);
	}

}
