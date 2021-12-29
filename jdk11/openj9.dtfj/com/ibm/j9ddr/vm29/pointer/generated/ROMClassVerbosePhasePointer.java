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
 * Structure: ROMClassVerbosePhasePointer
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
 * The generated code will provide getters for all elements in the ROMClassVerbosePhasePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=ROMClassVerbosePhase.class)
public class ROMClassVerbosePhasePointer extends StructurePointer {

	// NULL
	public static final ROMClassVerbosePhasePointer NULL = new ROMClassVerbosePhasePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected ROMClassVerbosePhasePointer(long address) {
		super(address);
	}

	public static ROMClassVerbosePhasePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static ROMClassVerbosePhasePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static ROMClassVerbosePhasePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new ROMClassVerbosePhasePointer(address);
	}

	public ROMClassVerbosePhasePointer add(long count) {
		return ROMClassVerbosePhasePointer.cast(address + (ROMClassVerbosePhase.SIZEOF * count));
	}

	public ROMClassVerbosePhasePointer add(Scalar count) {
		return add(count.longValue());
	}

	public ROMClassVerbosePhasePointer addOffset(long offset) {
		return ROMClassVerbosePhasePointer.cast(address + offset);
	}

	public ROMClassVerbosePhasePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public ROMClassVerbosePhasePointer sub(long count) {
		return ROMClassVerbosePhasePointer.cast(address - (ROMClassVerbosePhase.SIZEOF * count));
	}

	public ROMClassVerbosePhasePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public ROMClassVerbosePhasePointer subOffset(long offset) {
		return ROMClassVerbosePhasePointer.cast(address - offset);
	}

	public ROMClassVerbosePhasePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public ROMClassVerbosePhasePointer untag(long mask) {
		return ROMClassVerbosePhasePointer.cast(address & ~mask);
	}

	public ROMClassVerbosePhasePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return ROMClassVerbosePhase.SIZEOF;
	}

	// Implementation methods

	// ROMClassCreationContext* _context
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__contextOffset_", declaredType="ROMClassCreationContext*")
	public ROMClassCreationContextPointer _context() throws CorruptDataException {
		return ROMClassCreationContextPointer.cast(getPointerAtOffset(ROMClassVerbosePhase.__contextOffset_));
	}

	// ROMClassCreationContext* _context
	public PointerPointer _contextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassVerbosePhase.__contextOffset_));
	}

	// ROMClassCreationPhase _phase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__phaseOffset_", declaredType="ROMClassCreationPhase")
	public long _phase() throws CorruptDataException {
		if (ROMClassCreationPhase.SIZEOF == 1) {
			return getByteAtOffset(ROMClassVerbosePhase.__phaseOffset_);
		} else if (ROMClassCreationPhase.SIZEOF == 2) {
			return getShortAtOffset(ROMClassVerbosePhase.__phaseOffset_);
		} else if (ROMClassCreationPhase.SIZEOF == 4) {
			return getIntAtOffset(ROMClassVerbosePhase.__phaseOffset_);
		} else if (ROMClassCreationPhase.SIZEOF == 8) {
			return getLongAtOffset(ROMClassVerbosePhase.__phaseOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// ROMClassCreationPhase _phase
	public EnumPointer _phaseEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(ROMClassVerbosePhase.__phaseOffset_), ROMClassCreationPhase.class);
	}

	// BuildResult* _result
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__resultOffset_", declaredType="BuildResult*")
	public EnumPointer _result() throws CorruptDataException {
		return EnumPointer.cast(getPointerAtOffset(ROMClassVerbosePhase.__resultOffset_), BuildResult.class);
	}

	// BuildResult* _result
	public PointerPointer _resultEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassVerbosePhase.__resultOffset_));
	}

}
