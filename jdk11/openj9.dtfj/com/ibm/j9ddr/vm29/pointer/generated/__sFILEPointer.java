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
 * Structure: __sFILEPointer
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
 * The generated code will provide getters for all elements in the __sFILEPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=__sFILE.class)
public class __sFILEPointer extends StructurePointer {

	// NULL
	public static final __sFILEPointer NULL = new __sFILEPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected __sFILEPointer(long address) {
		super(address);
	}

	public static __sFILEPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static __sFILEPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static __sFILEPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new __sFILEPointer(address);
	}

	public __sFILEPointer add(long count) {
		return __sFILEPointer.cast(address + (__sFILE.SIZEOF * count));
	}

	public __sFILEPointer add(Scalar count) {
		return add(count.longValue());
	}

	public __sFILEPointer addOffset(long offset) {
		return __sFILEPointer.cast(address + offset);
	}

	public __sFILEPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public __sFILEPointer sub(long count) {
		return __sFILEPointer.cast(address - (__sFILE.SIZEOF * count));
	}

	public __sFILEPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public __sFILEPointer subOffset(long offset) {
		return __sFILEPointer.cast(address - offset);
	}

	public __sFILEPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public __sFILEPointer untag(long mask) {
		return __sFILEPointer.cast(address & ~mask);
	}

	public __sFILEPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return __sFILE.SIZEOF;
	}

	// Implementation methods

	// __sbuf _bf
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bfOffset_", declaredType="__sbuf")
	public __sbufPointer _bf() throws CorruptDataException {
		return __sbufPointer.cast(nonNullFieldEA(__sFILE.__bfOffset_));
	}

	// __sbuf _bf
	public PointerPointer _bfEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__sFILE.__bfOffset_));
	}

	// I32 _blksize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__blksizeOffset_", declaredType="I32")
	public IDATA _blksize() throws CorruptDataException {
		return new I32(getIntAtOffset(__sFILE.__blksizeOffset_));
	}

	// I32 _blksize
	public IDATAPointer _blksizeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(__sFILE.__blksizeOffset_));
	}

	// void* _close
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__closeOffset_", declaredType="void*")
	public VoidPointer _close() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(__sFILE.__closeOffset_));
	}

	// void* _close
	public PointerPointer _closeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__sFILE.__closeOffset_));
	}

	// void* _cookie
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cookieOffset_", declaredType="void*")
	public VoidPointer _cookie() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(__sFILE.__cookieOffset_));
	}

	// void* _cookie
	public PointerPointer _cookieEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__sFILE.__cookieOffset_));
	}

	// __sFILEX* _extra
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extraOffset_", declaredType="__sFILEX*")
	public __sFILEXPointer _extra() throws CorruptDataException {
		return __sFILEXPointer.cast(getPointerAtOffset(__sFILE.__extraOffset_));
	}

	// __sFILEX* _extra
	public PointerPointer _extraEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__sFILE.__extraOffset_));
	}

	// I16 _file
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__fileOffset_", declaredType="I16")
	public I16 _file() throws CorruptDataException {
		return new I16(getShortAtOffset(__sFILE.__fileOffset_));
	}

	// I16 _file
	public I16Pointer _fileEA() throws CorruptDataException {
		return I16Pointer.cast(nonNullFieldEA(__sFILE.__fileOffset_));
	}

	// I16 _flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__flagsOffset_", declaredType="I16")
	public I16 _flags() throws CorruptDataException {
		return new I16(getShortAtOffset(__sFILE.__flagsOffset_));
	}

	// I16 _flags
	public I16Pointer _flagsEA() throws CorruptDataException {
		return I16Pointer.cast(nonNullFieldEA(__sFILE.__flagsOffset_));
	}

	// __sbuf _lb
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lbOffset_", declaredType="__sbuf")
	public __sbufPointer _lb() throws CorruptDataException {
		return __sbufPointer.cast(nonNullFieldEA(__sFILE.__lbOffset_));
	}

	// __sbuf _lb
	public PointerPointer _lbEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__sFILE.__lbOffset_));
	}

	// I32 _lbfsize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lbfsizeOffset_", declaredType="I32")
	public IDATA _lbfsize() throws CorruptDataException {
		return new I32(getIntAtOffset(__sFILE.__lbfsizeOffset_));
	}

	// I32 _lbfsize
	public IDATAPointer _lbfsizeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(__sFILE.__lbfsizeOffset_));
	}

	// U8[] _nbuf
	public U8Pointer _nbufEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(__sFILE.__nbufOffset_));
	}

	// fpos_t _offset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__offsetOffset_", declaredType="fpos_t")
	public IDATA _offset() throws CorruptDataException {
		return new I64(getLongAtOffset(__sFILE.__offsetOffset_));
	}

	// fpos_t _offset
	public IDATAPointer _offsetEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(__sFILE.__offsetOffset_));
	}

	// U8* _p
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__pOffset_", declaredType="U8*")
	public U8Pointer _p() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(__sFILE.__pOffset_));
	}

	// U8* _p
	public PointerPointer _pEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__sFILE.__pOffset_));
	}

	// I32 _r
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rOffset_", declaredType="I32")
	public IDATA _r() throws CorruptDataException {
		return new I32(getIntAtOffset(__sFILE.__rOffset_));
	}

	// I32 _r
	public IDATAPointer _rEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(__sFILE.__rOffset_));
	}

	// void* _read
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__readOffset_", declaredType="void*")
	public VoidPointer _read() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(__sFILE.__readOffset_));
	}

	// void* _read
	public PointerPointer _readEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__sFILE.__readOffset_));
	}

	// void* _seek
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__seekOffset_", declaredType="void*")
	public VoidPointer _seek() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(__sFILE.__seekOffset_));
	}

	// void* _seek
	public PointerPointer _seekEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__sFILE.__seekOffset_));
	}

	// __sbuf _ub
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__ubOffset_", declaredType="__sbuf")
	public __sbufPointer _ub() throws CorruptDataException {
		return __sbufPointer.cast(nonNullFieldEA(__sFILE.__ubOffset_));
	}

	// __sbuf _ub
	public PointerPointer _ubEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__sFILE.__ubOffset_));
	}

	// U8[] _ubuf
	public U8Pointer _ubufEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(__sFILE.__ubufOffset_));
	}

	// I32 _ur
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__urOffset_", declaredType="I32")
	public IDATA _ur() throws CorruptDataException {
		return new I32(getIntAtOffset(__sFILE.__urOffset_));
	}

	// I32 _ur
	public IDATAPointer _urEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(__sFILE.__urOffset_));
	}

	// I32 _w
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__wOffset_", declaredType="I32")
	public IDATA _w() throws CorruptDataException {
		return new I32(getIntAtOffset(__sFILE.__wOffset_));
	}

	// I32 _w
	public IDATAPointer _wEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(__sFILE.__wOffset_));
	}

	// void* _write
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__writeOffset_", declaredType="void*")
	public VoidPointer _write() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(__sFILE.__writeOffset_));
	}

	// void* _write
	public PointerPointer _writeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__sFILE.__writeOffset_));
	}

}
