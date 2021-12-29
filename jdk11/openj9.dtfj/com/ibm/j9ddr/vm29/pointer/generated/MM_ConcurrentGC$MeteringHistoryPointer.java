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
 * Structure: MM_ConcurrentGC$MeteringHistoryPointer
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
 * The generated code will provide getters for all elements in the MM_ConcurrentGC$MeteringHistoryPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ConcurrentGC$MeteringHistory.class)
public class MM_ConcurrentGC$MeteringHistoryPointer extends StructurePointer {

	// NULL
	public static final MM_ConcurrentGC$MeteringHistoryPointer NULL = new MM_ConcurrentGC$MeteringHistoryPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ConcurrentGC$MeteringHistoryPointer(long address) {
		super(address);
	}

	public static MM_ConcurrentGC$MeteringHistoryPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ConcurrentGC$MeteringHistoryPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ConcurrentGC$MeteringHistoryPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ConcurrentGC$MeteringHistoryPointer(address);
	}

	public MM_ConcurrentGC$MeteringHistoryPointer add(long count) {
		return MM_ConcurrentGC$MeteringHistoryPointer.cast(address + (MM_ConcurrentGC$MeteringHistory.SIZEOF * count));
	}

	public MM_ConcurrentGC$MeteringHistoryPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ConcurrentGC$MeteringHistoryPointer addOffset(long offset) {
		return MM_ConcurrentGC$MeteringHistoryPointer.cast(address + offset);
	}

	public MM_ConcurrentGC$MeteringHistoryPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ConcurrentGC$MeteringHistoryPointer sub(long count) {
		return MM_ConcurrentGC$MeteringHistoryPointer.cast(address - (MM_ConcurrentGC$MeteringHistory.SIZEOF * count));
	}

	public MM_ConcurrentGC$MeteringHistoryPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ConcurrentGC$MeteringHistoryPointer subOffset(long offset) {
		return MM_ConcurrentGC$MeteringHistoryPointer.cast(address - offset);
	}

	public MM_ConcurrentGC$MeteringHistoryPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ConcurrentGC$MeteringHistoryPointer untag(long mask) {
		return MM_ConcurrentGC$MeteringHistoryPointer.cast(address & ~mask);
	}

	public MM_ConcurrentGC$MeteringHistoryPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ConcurrentGC$MeteringHistory.SIZEOF;
	}

	// Implementation methods

	// U64 loaFreeAfterGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_loaFreeAfterGCOffset_", declaredType="U64")
	public UDATA loaFreeAfterGC() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGC$MeteringHistory._loaFreeAfterGCOffset_));
	}

	// U64 loaFreeAfterGC
	public UDATAPointer loaFreeAfterGCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGC$MeteringHistory._loaFreeAfterGCOffset_));
	}

	// U64 loaFreeBeforeGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_loaFreeBeforeGCOffset_", declaredType="U64")
	public UDATA loaFreeBeforeGC() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGC$MeteringHistory._loaFreeBeforeGCOffset_));
	}

	// U64 loaFreeBeforeGC
	public UDATAPointer loaFreeBeforeGCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGC$MeteringHistory._loaFreeBeforeGCOffset_));
	}

	// U64 soaFreeAfterGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_soaFreeAfterGCOffset_", declaredType="U64")
	public UDATA soaFreeAfterGC() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGC$MeteringHistory._soaFreeAfterGCOffset_));
	}

	// U64 soaFreeAfterGC
	public UDATAPointer soaFreeAfterGCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGC$MeteringHistory._soaFreeAfterGCOffset_));
	}

	// U64 soaFreeBeforeGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_soaFreeBeforeGCOffset_", declaredType="U64")
	public UDATA soaFreeBeforeGC() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ConcurrentGC$MeteringHistory._soaFreeBeforeGCOffset_));
	}

	// U64 soaFreeBeforeGC
	public UDATAPointer soaFreeBeforeGCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ConcurrentGC$MeteringHistory._soaFreeBeforeGCOffset_));
	}

	// MeteringVote vote
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_voteOffset_", declaredType="MeteringVote")
	public long vote() throws CorruptDataException {
		if (MM_ConcurrentGC$MeteringVote.SIZEOF == 1) {
			return getByteAtOffset(MM_ConcurrentGC$MeteringHistory._voteOffset_);
		} else if (MM_ConcurrentGC$MeteringVote.SIZEOF == 2) {
			return getShortAtOffset(MM_ConcurrentGC$MeteringHistory._voteOffset_);
		} else if (MM_ConcurrentGC$MeteringVote.SIZEOF == 4) {
			return getIntAtOffset(MM_ConcurrentGC$MeteringHistory._voteOffset_);
		} else if (MM_ConcurrentGC$MeteringVote.SIZEOF == 8) {
			return getLongAtOffset(MM_ConcurrentGC$MeteringHistory._voteOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// MeteringVote vote
	public EnumPointer voteEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_ConcurrentGC$MeteringHistory._voteOffset_), MM_ConcurrentGC$MeteringVote.class);
	}

}
