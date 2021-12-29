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
 * Structure: J9RASPointer
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
 * The generated code will provide getters for all elements in the J9RASPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9RAS.class)
public class J9RASPointer extends StructurePointer {

	// NULL
	public static final J9RASPointer NULL = new J9RASPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9RASPointer(long address) {
		super(address);
	}

	public static J9RASPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9RASPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9RASPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9RASPointer(address);
	}

	public J9RASPointer add(long count) {
		return J9RASPointer.cast(address + (J9RAS.SIZEOF * count));
	}

	public J9RASPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9RASPointer addOffset(long offset) {
		return J9RASPointer.cast(address + offset);
	}

	public J9RASPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9RASPointer sub(long count) {
		return J9RASPointer.cast(address - (J9RAS.SIZEOF * count));
	}

	public J9RASPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9RASPointer subOffset(long offset) {
		return J9RASPointer.cast(address - offset);
	}

	public J9RASPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9RASPointer untag(long mask) {
		return J9RASPointer.cast(address & ~mask);
	}

	public J9RASPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9RAS.SIZEOF;
	}

	// Implementation methods

	// U32 bitpattern1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bitpattern1Offset_", declaredType="U32")
	public UDATA bitpattern1() throws CorruptDataException {
		return new U32(getIntAtOffset(J9RAS._bitpattern1Offset_));
	}

	// U32 bitpattern1
	public UDATAPointer bitpattern1EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9RAS._bitpattern1Offset_));
	}

	// U32 bitpattern2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bitpattern2Offset_", declaredType="U32")
	public UDATA bitpattern2() throws CorruptDataException {
		return new U32(getIntAtOffset(J9RAS._bitpattern2Offset_));
	}

	// U32 bitpattern2
	public UDATAPointer bitpattern2EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9RAS._bitpattern2Offset_));
	}

	// U64 buildID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_buildIDOffset_", declaredType="U64")
	public UDATA buildID() throws CorruptDataException {
		return new U64(getLongAtOffset(J9RAS._buildIDOffset_));
	}

	// U64 buildID
	public UDATAPointer buildIDEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9RAS._buildIDOffset_));
	}

	// U32 cpus
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cpusOffset_", declaredType="U32")
	public UDATA cpus() throws CorruptDataException {
		return new U32(getIntAtOffset(J9RAS._cpusOffset_));
	}

	// U32 cpus
	public UDATAPointer cpusEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9RAS._cpusOffset_));
	}

	// J9RASCrashInfo* crashInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_crashInfoOffset_", declaredType="J9RASCrashInfo*")
	public J9RASCrashInfoPointer crashInfo() throws CorruptDataException {
		return J9RASCrashInfoPointer.cast(getPointerAtOffset(J9RAS._crashInfoOffset_));
	}

	// J9RASCrashInfo* crashInfo
	public PointerPointer crashInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9RAS._crashInfoOffset_));
	}

	// void* ddrData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ddrDataOffset_", declaredType="void*")
	public VoidPointer ddrData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9RAS._ddrDataOffset_));
	}

	// void* ddrData
	public PointerPointer ddrDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9RAS._ddrDataOffset_));
	}

	// I64 dumpTimeMillis
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dumpTimeMillisOffset_", declaredType="I64")
	public IDATA dumpTimeMillis() throws CorruptDataException {
		return new I64(getLongAtOffset(J9RAS._dumpTimeMillisOffset_));
	}

	// I64 dumpTimeMillis
	public IDATAPointer dumpTimeMillisEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9RAS._dumpTimeMillisOffset_));
	}

	// I64 dumpTimeNanos
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dumpTimeNanosOffset_", declaredType="I64")
	public IDATA dumpTimeNanos() throws CorruptDataException {
		return new I64(getLongAtOffset(J9RAS._dumpTimeNanosOffset_));
	}

	// I64 dumpTimeNanos
	public IDATAPointer dumpTimeNanosEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9RAS._dumpTimeNanosOffset_));
	}

	// UDATA env
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_envOffset_", declaredType="UDATA")
	public UDATA env() throws CorruptDataException {
		return getUDATAAtOffset(J9RAS._envOffset_);
	}

	// UDATA env
	public UDATAPointer envEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9RAS._envOffset_));
	}

	// void* environment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_environmentOffset_", declaredType="void*")
	public VoidPointer environment() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9RAS._environmentOffset_));
	}

	// void* environment
	public PointerPointer environmentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9RAS._environmentOffset_));
	}

	// U8[] eyecatcher
	public U8Pointer eyecatcherEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9RAS._eyecatcherOffset_));
	}

	// U8[] hostname
	public U8Pointer hostnameEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9RAS._hostnameOffset_));
	}

	// UDATA idOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_idOffsetOffset_", declaredType="UDATA")
	public UDATA idOffset() throws CorruptDataException {
		return getUDATAAtOffset(J9RAS._idOffsetOffset_);
	}

	// UDATA idOffset
	public UDATAPointer idOffsetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9RAS._idOffsetOffset_));
	}

	// U8[] ipAddresses
	public U8Pointer ipAddressesEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9RAS._ipAddressesOffset_));
	}

	// I32 length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lengthOffset_", declaredType="I32")
	public IDATA length() throws CorruptDataException {
		return new I32(getIntAtOffset(J9RAS._lengthOffset_));
	}

	// I32 length
	public IDATAPointer lengthEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9RAS._lengthOffset_));
	}

	// UDATA mainThreadOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mainThreadOffsetOffset_", declaredType="UDATA")
	public UDATA mainThreadOffset() throws CorruptDataException {
		return getUDATAAtOffset(J9RAS._mainThreadOffsetOffset_);
	}

	// UDATA mainThreadOffset
	public UDATAPointer mainThreadOffsetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9RAS._mainThreadOffsetOffset_));
	}

	// U64 memory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_memoryOffset_", declaredType="U64")
	public UDATA memory() throws CorruptDataException {
		return new U64(getLongAtOffset(J9RAS._memoryOffset_));
	}

	// U64 memory
	public UDATAPointer memoryEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9RAS._memoryOffset_));
	}

	// void** nextStatistic
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextStatisticOffset_", declaredType="void**")
	public PointerPointer nextStatistic() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(J9RAS._nextStatisticOffset_));
	}

	// void** nextStatistic
	public PointerPointer nextStatisticEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9RAS._nextStatisticOffset_));
	}

	// UDATA omrthreadNextOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_omrthreadNextOffsetOffset_", declaredType="UDATA")
	public UDATA omrthreadNextOffset() throws CorruptDataException {
		return getUDATAAtOffset(J9RAS._omrthreadNextOffsetOffset_);
	}

	// UDATA omrthreadNextOffset
	public UDATAPointer omrthreadNextOffsetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9RAS._omrthreadNextOffsetOffset_));
	}

	// U8[] osarch
	public U8Pointer osarchEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9RAS._osarchOffset_));
	}

	// U8[] osname
	public U8Pointer osnameEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9RAS._osnameOffset_));
	}

	// UDATA osthreadOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_osthreadOffsetOffset_", declaredType="UDATA")
	public UDATA osthreadOffset() throws CorruptDataException {
		return getUDATAAtOffset(J9RAS._osthreadOffsetOffset_);
	}

	// UDATA osthreadOffset
	public UDATAPointer osthreadOffsetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9RAS._osthreadOffsetOffset_));
	}

	// U8[] osversion
	public U8Pointer osversionEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9RAS._osversionOffset_));
	}

	// UDATA pid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pidOffset_", declaredType="UDATA")
	public UDATA pid() throws CorruptDataException {
		return getUDATAAtOffset(J9RAS._pidOffset_);
	}

	// UDATA pid
	public UDATAPointer pidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9RAS._pidOffset_));
	}

	// U8* serviceLevel
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_serviceLevelOffset_", declaredType="U8*")
	public U8Pointer serviceLevel() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9RAS._serviceLevelOffset_));
	}

	// U8* serviceLevel
	public PointerPointer serviceLevelEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9RAS._serviceLevelOffset_));
	}

	// I64 startTimeMillis
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_startTimeMillisOffset_", declaredType="I64")
	public IDATA startTimeMillis() throws CorruptDataException {
		return new I64(getLongAtOffset(J9RAS._startTimeMillisOffset_));
	}

	// I64 startTimeMillis
	public IDATAPointer startTimeMillisEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9RAS._startTimeMillisOffset_));
	}

	// I64 startTimeNanos
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_startTimeNanosOffset_", declaredType="I64")
	public IDATA startTimeNanos() throws CorruptDataException {
		return new I64(getLongAtOffset(J9RAS._startTimeNanosOffset_));
	}

	// I64 startTimeNanos
	public IDATAPointer startTimeNanosEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9RAS._startTimeNanosOffset_));
	}

	// J9RASSystemInfo* systemInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_systemInfoOffset_", declaredType="J9RASSystemInfo*")
	public J9RASSystemInfoPointer systemInfo() throws CorruptDataException {
		return J9RASSystemInfoPointer.cast(getPointerAtOffset(J9RAS._systemInfoOffset_));
	}

	// J9RASSystemInfo* systemInfo
	public PointerPointer systemInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9RAS._systemInfoOffset_));
	}

	// UDATA tid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tidOffset_", declaredType="UDATA")
	public UDATA tid() throws CorruptDataException {
		return getUDATAAtOffset(J9RAS._tidOffset_);
	}

	// UDATA tid
	public UDATAPointer tidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9RAS._tidOffset_));
	}

	// UDATA typedefs
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_typedefsOffset_", declaredType="UDATA")
	public UDATA typedefs() throws CorruptDataException {
		return getUDATAAtOffset(J9RAS._typedefsOffset_);
	}

	// UDATA typedefs
	public UDATAPointer typedefsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9RAS._typedefsOffset_));
	}

	// UDATA typedefsLen
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_typedefsLenOffset_", declaredType="UDATA")
	public UDATA typedefsLen() throws CorruptDataException {
		return getUDATAAtOffset(J9RAS._typedefsLenOffset_);
	}

	// UDATA typedefsLen
	public UDATAPointer typedefsLenEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9RAS._typedefsLenOffset_));
	}

	// I32 version
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_versionOffset_", declaredType="I32")
	public IDATA version() throws CorruptDataException {
		return new I32(getIntAtOffset(J9RAS._versionOffset_));
	}

	// I32 version
	public IDATAPointer versionEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9RAS._versionOffset_));
	}

	// UDATA vm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmOffset_", declaredType="UDATA")
	public UDATA vm() throws CorruptDataException {
		return getUDATAAtOffset(J9RAS._vmOffset_);
	}

	// UDATA vm
	public UDATAPointer vmEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9RAS._vmOffset_));
	}

}
