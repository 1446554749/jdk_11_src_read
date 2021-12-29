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
 * Structure: SH_OSCachemmapPointer
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
 * The generated code will provide getters for all elements in the SH_OSCachemmapPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=SH_OSCachemmap.class)
public class SH_OSCachemmapPointer extends SH_OSCacheFilePointer {

	// NULL
	public static final SH_OSCachemmapPointer NULL = new SH_OSCachemmapPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected SH_OSCachemmapPointer(long address) {
		super(address);
	}

	public static SH_OSCachemmapPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static SH_OSCachemmapPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static SH_OSCachemmapPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new SH_OSCachemmapPointer(address);
	}

	public SH_OSCachemmapPointer add(long count) {
		return SH_OSCachemmapPointer.cast(address + (SH_OSCachemmap.SIZEOF * count));
	}

	public SH_OSCachemmapPointer add(Scalar count) {
		return add(count.longValue());
	}

	public SH_OSCachemmapPointer addOffset(long offset) {
		return SH_OSCachemmapPointer.cast(address + offset);
	}

	public SH_OSCachemmapPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public SH_OSCachemmapPointer sub(long count) {
		return SH_OSCachemmapPointer.cast(address - (SH_OSCachemmap.SIZEOF * count));
	}

	public SH_OSCachemmapPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public SH_OSCachemmapPointer subOffset(long offset) {
		return SH_OSCachemmapPointer.cast(address - offset);
	}

	public SH_OSCachemmapPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public SH_OSCachemmapPointer untag(long mask) {
		return SH_OSCachemmapPointer.cast(address & ~mask);
	}

	public SH_OSCachemmapPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return SH_OSCachemmap.SIZEOF;
	}

	// Implementation methods

	// I64 _actualFileLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__actualFileLengthOffset_", declaredType="I64")
	public IDATA _actualFileLength() throws CorruptDataException {
		return new I64(getLongAtOffset(SH_OSCachemmap.__actualFileLengthOffset_));
	}

	// I64 _actualFileLength
	public IDATAPointer _actualFileLengthEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(SH_OSCachemmap.__actualFileLengthOffset_));
	}

	// SH_CacheFileAccess _cacheFileAccess
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cacheFileAccessOffset_", declaredType="SH_CacheFileAccess")
	public long _cacheFileAccess() throws CorruptDataException {
		if (SH_CacheFileAccess.SIZEOF == 1) {
			return getByteAtOffset(SH_OSCachemmap.__cacheFileAccessOffset_);
		} else if (SH_CacheFileAccess.SIZEOF == 2) {
			return getShortAtOffset(SH_OSCachemmap.__cacheFileAccessOffset_);
		} else if (SH_CacheFileAccess.SIZEOF == 4) {
			return getIntAtOffset(SH_OSCachemmap.__cacheFileAccessOffset_);
		} else if (SH_CacheFileAccess.SIZEOF == 8) {
			return getLongAtOffset(SH_OSCachemmap.__cacheFileAccessOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// SH_CacheFileAccess _cacheFileAccess
	public EnumPointer _cacheFileAccessEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(SH_OSCachemmap.__cacheFileAccessOffset_), SH_CacheFileAccess.class);
	}

	// UDATA _finalised
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__finalisedOffset_", declaredType="UDATA")
	public UDATA _finalised() throws CorruptDataException {
		return getUDATAAtOffset(SH_OSCachemmap.__finalisedOffset_);
	}

	// UDATA _finalised
	public UDATAPointer _finalisedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SH_OSCachemmap.__finalisedOffset_));
	}

	// omrthread_monitor_t[] _lockMutex
	public PointerPointer _lockMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_OSCachemmap.__lockMutexOffset_));
	}

	// J9MmapHandle* _mapFileHandle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__mapFileHandleOffset_", declaredType="J9MmapHandle*")
	public J9MmapHandlePointer _mapFileHandle() throws CorruptDataException {
		return J9MmapHandlePointer.cast(getPointerAtOffset(SH_OSCachemmap.__mapFileHandleOffset_));
	}

	// J9MmapHandle* _mapFileHandle
	public PointerPointer _mapFileHandleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SH_OSCachemmap.__mapFileHandleOffset_));
	}

}
