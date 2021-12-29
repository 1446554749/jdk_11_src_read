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
 * Structure: UtProcessorInfoPointer
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
 * The generated code will provide getters for all elements in the UtProcessorInfoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=UtProcessorInfo.class)
public class UtProcessorInfoPointer extends StructurePointer {

	// NULL
	public static final UtProcessorInfoPointer NULL = new UtProcessorInfoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected UtProcessorInfoPointer(long address) {
		super(address);
	}

	public static UtProcessorInfoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static UtProcessorInfoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static UtProcessorInfoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new UtProcessorInfoPointer(address);
	}

	public UtProcessorInfoPointer add(long count) {
		return UtProcessorInfoPointer.cast(address + (UtProcessorInfo.SIZEOF * count));
	}

	public UtProcessorInfoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public UtProcessorInfoPointer addOffset(long offset) {
		return UtProcessorInfoPointer.cast(address + offset);
	}

	public UtProcessorInfoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public UtProcessorInfoPointer sub(long count) {
		return UtProcessorInfoPointer.cast(address - (UtProcessorInfo.SIZEOF * count));
	}

	public UtProcessorInfoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public UtProcessorInfoPointer subOffset(long offset) {
		return UtProcessorInfoPointer.cast(address - offset);
	}

	public UtProcessorInfoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public UtProcessorInfoPointer untag(long mask) {
		return UtProcessorInfoPointer.cast(address & ~mask);
	}

	public UtProcessorInfoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return UtProcessorInfo.SIZEOF;
	}

	// Implementation methods

	// UtArchitecture architecture
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_architectureOffset_", declaredType="UtArchitecture")
	public long architecture() throws CorruptDataException {
		if (UtArchitecture.SIZEOF == 1) {
			return getByteAtOffset(UtProcessorInfo._architectureOffset_);
		} else if (UtArchitecture.SIZEOF == 2) {
			return getShortAtOffset(UtProcessorInfo._architectureOffset_);
		} else if (UtArchitecture.SIZEOF == 4) {
			return getIntAtOffset(UtProcessorInfo._architectureOffset_);
		} else if (UtArchitecture.SIZEOF == 8) {
			return getLongAtOffset(UtProcessorInfo._architectureOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// UtArchitecture architecture
	public EnumPointer architectureEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(UtProcessorInfo._architectureOffset_), UtArchitecture.class);
	}

	// I32 cpuCountVaries
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cpuCountVariesOffset_", declaredType="I32")
	public IDATA cpuCountVaries() throws CorruptDataException {
		return new I32(getIntAtOffset(UtProcessorInfo._cpuCountVariesOffset_));
	}

	// I32 cpuCountVaries
	public IDATAPointer cpuCountVariesEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtProcessorInfo._cpuCountVariesOffset_));
	}

	// UtDataHeader header
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_headerOffset_", declaredType="UtDataHeader")
	public UtDataHeaderPointer header() throws CorruptDataException {
		return UtDataHeaderPointer.cast(nonNullFieldEA(UtProcessorInfo._headerOffset_));
	}

	// UtDataHeader header
	public PointerPointer headerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtProcessorInfo._headerOffset_));
	}

	// I32 isBigEndian
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isBigEndianOffset_", declaredType="I32")
	public IDATA isBigEndian() throws CorruptDataException {
		return new I32(getIntAtOffset(UtProcessorInfo._isBigEndianOffset_));
	}

	// I32 isBigEndian
	public IDATAPointer isBigEndianEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtProcessorInfo._isBigEndianOffset_));
	}

	// U32 onlineProcessors
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_onlineProcessorsOffset_", declaredType="U32")
	public UDATA onlineProcessors() throws CorruptDataException {
		return new U32(getIntAtOffset(UtProcessorInfo._onlineProcessorsOffset_));
	}

	// U32 onlineProcessors
	public UDATAPointer onlineProcessorsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtProcessorInfo._onlineProcessorsOffset_));
	}

	// U32 pagesize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pagesizeOffset_", declaredType="U32")
	public UDATA pagesize() throws CorruptDataException {
		return new U32(getIntAtOffset(UtProcessorInfo._pagesizeOffset_));
	}

	// U32 pagesize
	public UDATAPointer pagesizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtProcessorInfo._pagesizeOffset_));
	}

	// UtProcInfo procInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_procInfoOffset_", declaredType="UtProcInfo")
	public UtProcInfoPointer procInfo() throws CorruptDataException {
		return UtProcInfoPointer.cast(nonNullFieldEA(UtProcessorInfo._procInfoOffset_));
	}

	// UtProcInfo procInfo
	public PointerPointer procInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtProcessorInfo._procInfoOffset_));
	}

	// U32 wordsize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_wordsizeOffset_", declaredType="U32")
	public UDATA wordsize() throws CorruptDataException {
		return new U32(getIntAtOffset(UtProcessorInfo._wordsizeOffset_));
	}

	// U32 wordsize
	public UDATAPointer wordsizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtProcessorInfo._wordsizeOffset_));
	}

}
