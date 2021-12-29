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
 * Structure: VerboseRecordPointer
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
 * The generated code will provide getters for all elements in the VerboseRecordPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=VerboseRecord.class)
public class VerboseRecordPointer extends StructurePointer {

	// NULL
	public static final VerboseRecordPointer NULL = new VerboseRecordPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected VerboseRecordPointer(long address) {
		super(address);
	}

	public static VerboseRecordPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static VerboseRecordPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static VerboseRecordPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new VerboseRecordPointer(address);
	}

	public VerboseRecordPointer add(long count) {
		return VerboseRecordPointer.cast(address + (VerboseRecord.SIZEOF * count));
	}

	public VerboseRecordPointer add(Scalar count) {
		return add(count.longValue());
	}

	public VerboseRecordPointer addOffset(long offset) {
		return VerboseRecordPointer.cast(address + offset);
	}

	public VerboseRecordPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public VerboseRecordPointer sub(long count) {
		return VerboseRecordPointer.cast(address - (VerboseRecord.SIZEOF * count));
	}

	public VerboseRecordPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public VerboseRecordPointer subOffset(long offset) {
		return VerboseRecordPointer.cast(address - offset);
	}

	public VerboseRecordPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public VerboseRecordPointer untag(long mask) {
		return VerboseRecordPointer.cast(address & ~mask);
	}

	public VerboseRecordPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return VerboseRecord.SIZEOF;
	}

	// Implementation methods

	// UDATA accumulatedTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_accumulatedTimeOffset_", declaredType="UDATA")
	public UDATA accumulatedTime() throws CorruptDataException {
		return getUDATAAtOffset(VerboseRecord._accumulatedTimeOffset_);
	}

	// UDATA accumulatedTime
	public UDATAPointer accumulatedTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(VerboseRecord._accumulatedTimeOffset_));
	}

	// BuildResult buildResult
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_buildResultOffset_", declaredType="BuildResult")
	public long buildResult() throws CorruptDataException {
		if (BuildResult.SIZEOF == 1) {
			return getByteAtOffset(VerboseRecord._buildResultOffset_);
		} else if (BuildResult.SIZEOF == 2) {
			return getShortAtOffset(VerboseRecord._buildResultOffset_);
		} else if (BuildResult.SIZEOF == 4) {
			return getIntAtOffset(VerboseRecord._buildResultOffset_);
		} else if (BuildResult.SIZEOF == 8) {
			return getLongAtOffset(VerboseRecord._buildResultOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// BuildResult buildResult
	public EnumPointer buildResultEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(VerboseRecord._buildResultOffset_), BuildResult.class);
	}

	// UDATA failureTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_failureTimeOffset_", declaredType="UDATA")
	public UDATA failureTime() throws CorruptDataException {
		return getUDATAAtOffset(VerboseRecord._failureTimeOffset_);
	}

	// UDATA failureTime
	public UDATAPointer failureTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(VerboseRecord._failureTimeOffset_));
	}

	// UDATA lastStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastStartTimeOffset_", declaredType="UDATA")
	public UDATA lastStartTime() throws CorruptDataException {
		return getUDATAAtOffset(VerboseRecord._lastStartTimeOffset_);
	}

	// UDATA lastStartTime
	public UDATAPointer lastStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(VerboseRecord._lastStartTimeOffset_));
	}

	// ROMClassCreationPhase parentPhase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_parentPhaseOffset_", declaredType="ROMClassCreationPhase")
	public long parentPhase() throws CorruptDataException {
		if (ROMClassCreationPhase.SIZEOF == 1) {
			return getByteAtOffset(VerboseRecord._parentPhaseOffset_);
		} else if (ROMClassCreationPhase.SIZEOF == 2) {
			return getShortAtOffset(VerboseRecord._parentPhaseOffset_);
		} else if (ROMClassCreationPhase.SIZEOF == 4) {
			return getIntAtOffset(VerboseRecord._parentPhaseOffset_);
		} else if (ROMClassCreationPhase.SIZEOF == 8) {
			return getLongAtOffset(VerboseRecord._parentPhaseOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// ROMClassCreationPhase parentPhase
	public EnumPointer parentPhaseEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(VerboseRecord._parentPhaseOffset_), ROMClassCreationPhase.class);
	}

}
