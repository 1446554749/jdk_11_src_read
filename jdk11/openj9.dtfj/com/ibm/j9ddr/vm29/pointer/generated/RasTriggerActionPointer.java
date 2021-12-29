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
 * Structure: RasTriggerActionPointer
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
 * The generated code will provide getters for all elements in the RasTriggerActionPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=RasTriggerAction.class)
public class RasTriggerActionPointer extends StructurePointer {

	// NULL
	public static final RasTriggerActionPointer NULL = new RasTriggerActionPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected RasTriggerActionPointer(long address) {
		super(address);
	}

	public static RasTriggerActionPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static RasTriggerActionPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static RasTriggerActionPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new RasTriggerActionPointer(address);
	}

	public RasTriggerActionPointer add(long count) {
		return RasTriggerActionPointer.cast(address + (RasTriggerAction.SIZEOF * count));
	}

	public RasTriggerActionPointer add(Scalar count) {
		return add(count.longValue());
	}

	public RasTriggerActionPointer addOffset(long offset) {
		return RasTriggerActionPointer.cast(address + offset);
	}

	public RasTriggerActionPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public RasTriggerActionPointer sub(long count) {
		return RasTriggerActionPointer.cast(address - (RasTriggerAction.SIZEOF * count));
	}

	public RasTriggerActionPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public RasTriggerActionPointer subOffset(long offset) {
		return RasTriggerActionPointer.cast(address - offset);
	}

	public RasTriggerActionPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public RasTriggerActionPointer untag(long mask) {
		return RasTriggerActionPointer.cast(address & ~mask);
	}

	public RasTriggerActionPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return RasTriggerAction.SIZEOF;
	}

	// Implementation methods

	// TriggerActionFunc fn
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fnOffset_", declaredType="TriggerActionFunc")
	public VoidPointer fn() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(RasTriggerAction._fnOffset_));
	}

	// TriggerActionFunc fn
	public PointerPointer fnEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(RasTriggerAction._fnOffset_));
	}

	// const U8* name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nameOffset_", declaredType="const U8*")
	public U8Pointer name() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(RasTriggerAction._nameOffset_));
	}

	// const U8* name
	public PointerPointer nameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(RasTriggerAction._nameOffset_));
	}

	// TriggerPhase phase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_phaseOffset_", declaredType="TriggerPhase")
	public long phase() throws CorruptDataException {
		if (TriggerPhase.SIZEOF == 1) {
			return getByteAtOffset(RasTriggerAction._phaseOffset_);
		} else if (TriggerPhase.SIZEOF == 2) {
			return getShortAtOffset(RasTriggerAction._phaseOffset_);
		} else if (TriggerPhase.SIZEOF == 4) {
			return getIntAtOffset(RasTriggerAction._phaseOffset_);
		} else if (TriggerPhase.SIZEOF == 8) {
			return getLongAtOffset(RasTriggerAction._phaseOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// TriggerPhase phase
	public EnumPointer phaseEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(RasTriggerAction._phaseOffset_), TriggerPhase.class);
	}

}
