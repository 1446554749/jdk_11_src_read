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
 * Structure: GC_ConstantDynamicSlotIteratorPointer
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
 * The generated code will provide getters for all elements in the GC_ConstantDynamicSlotIteratorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=GC_ConstantDynamicSlotIterator.class)
public class GC_ConstantDynamicSlotIteratorPointer extends StructurePointer {

	// NULL
	public static final GC_ConstantDynamicSlotIteratorPointer NULL = new GC_ConstantDynamicSlotIteratorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected GC_ConstantDynamicSlotIteratorPointer(long address) {
		super(address);
	}

	public static GC_ConstantDynamicSlotIteratorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static GC_ConstantDynamicSlotIteratorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static GC_ConstantDynamicSlotIteratorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new GC_ConstantDynamicSlotIteratorPointer(address);
	}

	public GC_ConstantDynamicSlotIteratorPointer add(long count) {
		return GC_ConstantDynamicSlotIteratorPointer.cast(address + (GC_ConstantDynamicSlotIterator.SIZEOF * count));
	}

	public GC_ConstantDynamicSlotIteratorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public GC_ConstantDynamicSlotIteratorPointer addOffset(long offset) {
		return GC_ConstantDynamicSlotIteratorPointer.cast(address + offset);
	}

	public GC_ConstantDynamicSlotIteratorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public GC_ConstantDynamicSlotIteratorPointer sub(long count) {
		return GC_ConstantDynamicSlotIteratorPointer.cast(address - (GC_ConstantDynamicSlotIterator.SIZEOF * count));
	}

	public GC_ConstantDynamicSlotIteratorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public GC_ConstantDynamicSlotIteratorPointer subOffset(long offset) {
		return GC_ConstantDynamicSlotIteratorPointer.cast(address - offset);
	}

	public GC_ConstantDynamicSlotIteratorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public GC_ConstantDynamicSlotIteratorPointer untag(long mask) {
		return GC_ConstantDynamicSlotIteratorPointer.cast(address & ~mask);
	}

	public GC_ConstantDynamicSlotIteratorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return GC_ConstantDynamicSlotIterator.SIZEOF;
	}

	// Implementation methods

	// CondySlotState _condySlotState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__condySlotStateOffset_", declaredType="CondySlotState")
	public long _condySlotState() throws CorruptDataException {
		if (GC_ConstantDynamicSlotIterator$CondySlotState.SIZEOF == 1) {
			return getByteAtOffset(GC_ConstantDynamicSlotIterator.__condySlotStateOffset_);
		} else if (GC_ConstantDynamicSlotIterator$CondySlotState.SIZEOF == 2) {
			return getShortAtOffset(GC_ConstantDynamicSlotIterator.__condySlotStateOffset_);
		} else if (GC_ConstantDynamicSlotIterator$CondySlotState.SIZEOF == 4) {
			return getIntAtOffset(GC_ConstantDynamicSlotIterator.__condySlotStateOffset_);
		} else if (GC_ConstantDynamicSlotIterator$CondySlotState.SIZEOF == 8) {
			return getLongAtOffset(GC_ConstantDynamicSlotIterator.__condySlotStateOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// CondySlotState _condySlotState
	public EnumPointer _condySlotStateEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(GC_ConstantDynamicSlotIterator.__condySlotStateOffset_), GC_ConstantDynamicSlotIterator$CondySlotState.class);
	}

}
