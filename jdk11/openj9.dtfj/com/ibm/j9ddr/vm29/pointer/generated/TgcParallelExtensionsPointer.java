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
 * Structure: TgcParallelExtensionsPointer
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
 * The generated code will provide getters for all elements in the TgcParallelExtensionsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=TgcParallelExtensions.class)
public class TgcParallelExtensionsPointer extends StructurePointer {

	// NULL
	public static final TgcParallelExtensionsPointer NULL = new TgcParallelExtensionsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected TgcParallelExtensionsPointer(long address) {
		super(address);
	}

	public static TgcParallelExtensionsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static TgcParallelExtensionsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static TgcParallelExtensionsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new TgcParallelExtensionsPointer(address);
	}

	public TgcParallelExtensionsPointer add(long count) {
		return TgcParallelExtensionsPointer.cast(address + (TgcParallelExtensions.SIZEOF * count));
	}

	public TgcParallelExtensionsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public TgcParallelExtensionsPointer addOffset(long offset) {
		return TgcParallelExtensionsPointer.cast(address + offset);
	}

	public TgcParallelExtensionsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public TgcParallelExtensionsPointer sub(long count) {
		return TgcParallelExtensionsPointer.cast(address - (TgcParallelExtensions.SIZEOF * count));
	}

	public TgcParallelExtensionsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public TgcParallelExtensionsPointer subOffset(long offset) {
		return TgcParallelExtensionsPointer.cast(address - offset);
	}

	public TgcParallelExtensionsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public TgcParallelExtensionsPointer untag(long mask) {
		return TgcParallelExtensionsPointer.cast(address & ~mask);
	}

	public TgcParallelExtensionsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return TgcParallelExtensions.SIZEOF;
	}

	// Implementation methods

	// U64 RSScanEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_RSScanEndTimeOffset_", declaredType="U64")
	public UDATA RSScanEndTime() throws CorruptDataException {
		return new U64(getLongAtOffset(TgcParallelExtensions._RSScanEndTimeOffset_));
	}

	// U64 RSScanEndTime
	public UDATAPointer RSScanEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(TgcParallelExtensions._RSScanEndTimeOffset_));
	}

	// U64 RSScanStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_RSScanStartTimeOffset_", declaredType="U64")
	public UDATA RSScanStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(TgcParallelExtensions._RSScanStartTimeOffset_));
	}

	// U64 RSScanStartTime
	public UDATAPointer RSScanStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(TgcParallelExtensions._RSScanStartTimeOffset_));
	}

	// U64 markEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_markEndTimeOffset_", declaredType="U64")
	public UDATA markEndTime() throws CorruptDataException {
		return new U64(getLongAtOffset(TgcParallelExtensions._markEndTimeOffset_));
	}

	// U64 markEndTime
	public UDATAPointer markEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(TgcParallelExtensions._markEndTimeOffset_));
	}

	// U64 markStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_markStartTimeOffset_", declaredType="U64")
	public UDATA markStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(TgcParallelExtensions._markStartTimeOffset_));
	}

	// U64 markStartTime
	public UDATAPointer markStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(TgcParallelExtensions._markStartTimeOffset_));
	}

	// U64 sweepEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sweepEndTimeOffset_", declaredType="U64")
	public UDATA sweepEndTime() throws CorruptDataException {
		return new U64(getLongAtOffset(TgcParallelExtensions._sweepEndTimeOffset_));
	}

	// U64 sweepEndTime
	public UDATAPointer sweepEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(TgcParallelExtensions._sweepEndTimeOffset_));
	}

	// U64 sweepStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sweepStartTimeOffset_", declaredType="U64")
	public UDATA sweepStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(TgcParallelExtensions._sweepStartTimeOffset_));
	}

	// U64 sweepStartTime
	public UDATAPointer sweepStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(TgcParallelExtensions._sweepStartTimeOffset_));
	}

}
