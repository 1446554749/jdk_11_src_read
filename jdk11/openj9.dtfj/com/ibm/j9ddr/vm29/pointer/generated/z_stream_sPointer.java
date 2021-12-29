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
 * Structure: z_stream_sPointer
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
 * The generated code will provide getters for all elements in the z_stream_sPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=z_stream_s.class)
public class z_stream_sPointer extends StructurePointer {

	// NULL
	public static final z_stream_sPointer NULL = new z_stream_sPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected z_stream_sPointer(long address) {
		super(address);
	}

	public static z_stream_sPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static z_stream_sPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static z_stream_sPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new z_stream_sPointer(address);
	}

	public z_stream_sPointer add(long count) {
		return z_stream_sPointer.cast(address + (z_stream_s.SIZEOF * count));
	}

	public z_stream_sPointer add(Scalar count) {
		return add(count.longValue());
	}

	public z_stream_sPointer addOffset(long offset) {
		return z_stream_sPointer.cast(address + offset);
	}

	public z_stream_sPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public z_stream_sPointer sub(long count) {
		return z_stream_sPointer.cast(address - (z_stream_s.SIZEOF * count));
	}

	public z_stream_sPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public z_stream_sPointer subOffset(long offset) {
		return z_stream_sPointer.cast(address - offset);
	}

	public z_stream_sPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public z_stream_sPointer untag(long mask) {
		return z_stream_sPointer.cast(address & ~mask);
	}

	public z_stream_sPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return z_stream_s.SIZEOF;
	}

	// Implementation methods

	// z_uLong adler
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_adlerOffset_", declaredType="z_uLong")
	public UDATA adler() throws CorruptDataException {
		return new U64(getLongAtOffset(z_stream_s._adlerOffset_));
	}

	// z_uLong adler
	public UDATAPointer adlerEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(z_stream_s._adlerOffset_));
	}

	// z_uInt avail_in
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_avail_inOffset_", declaredType="z_uInt")
	public UDATA avail_in() throws CorruptDataException {
		return new U32(getIntAtOffset(z_stream_s._avail_inOffset_));
	}

	// z_uInt avail_in
	public UDATAPointer avail_inEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(z_stream_s._avail_inOffset_));
	}

	// z_uInt avail_out
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_avail_outOffset_", declaredType="z_uInt")
	public UDATA avail_out() throws CorruptDataException {
		return new U32(getIntAtOffset(z_stream_s._avail_outOffset_));
	}

	// z_uInt avail_out
	public UDATAPointer avail_outEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(z_stream_s._avail_outOffset_));
	}

	// I32 data_type
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_data_typeOffset_", declaredType="I32")
	public IDATA data_type() throws CorruptDataException {
		return new I32(getIntAtOffset(z_stream_s._data_typeOffset_));
	}

	// I32 data_type
	public IDATAPointer data_typeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(z_stream_s._data_typeOffset_));
	}

	// U8* msg
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_msgOffset_", declaredType="U8*")
	public U8Pointer msg() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(z_stream_s._msgOffset_));
	}

	// U8* msg
	public PointerPointer msgEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(z_stream_s._msgOffset_));
	}

	// z_Bytef* next_in
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_next_inOffset_", declaredType="z_Bytef*")
	public U8Pointer next_in() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(z_stream_s._next_inOffset_));
	}

	// z_Bytef* next_in
	public PointerPointer next_inEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(z_stream_s._next_inOffset_));
	}

	// z_Bytef* next_out
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_next_outOffset_", declaredType="z_Bytef*")
	public U8Pointer next_out() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(z_stream_s._next_outOffset_));
	}

	// z_Bytef* next_out
	public PointerPointer next_outEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(z_stream_s._next_outOffset_));
	}

	// z_voidpf opaque
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_opaqueOffset_", declaredType="z_voidpf")
	public VoidPointer opaque() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(z_stream_s._opaqueOffset_));
	}

	// z_voidpf opaque
	public PointerPointer opaqueEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(z_stream_s._opaqueOffset_));
	}

	// z_uLong reserved
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reservedOffset_", declaredType="z_uLong")
	public UDATA reserved() throws CorruptDataException {
		return new U64(getLongAtOffset(z_stream_s._reservedOffset_));
	}

	// z_uLong reserved
	public UDATAPointer reservedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(z_stream_s._reservedOffset_));
	}

	// z_internal_state* state
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_stateOffset_", declaredType="z_internal_state*")
	public z_internal_statePointer state() throws CorruptDataException {
		return z_internal_statePointer.cast(getPointerAtOffset(z_stream_s._stateOffset_));
	}

	// z_internal_state* state
	public PointerPointer stateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(z_stream_s._stateOffset_));
	}

	// z_uLong total_in
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_total_inOffset_", declaredType="z_uLong")
	public UDATA total_in() throws CorruptDataException {
		return new U64(getLongAtOffset(z_stream_s._total_inOffset_));
	}

	// z_uLong total_in
	public UDATAPointer total_inEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(z_stream_s._total_inOffset_));
	}

	// z_uLong total_out
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_total_outOffset_", declaredType="z_uLong")
	public UDATA total_out() throws CorruptDataException {
		return new U64(getLongAtOffset(z_stream_s._total_outOffset_));
	}

	// z_uLong total_out
	public UDATAPointer total_outEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(z_stream_s._total_outOffset_));
	}

	// z_alloc_func zalloc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zallocOffset_", declaredType="z_alloc_func")
	public VoidPointer zalloc() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(z_stream_s._zallocOffset_));
	}

	// z_alloc_func zalloc
	public PointerPointer zallocEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(z_stream_s._zallocOffset_));
	}

	// z_free_func zfree
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zfreeOffset_", declaredType="z_free_func")
	public VoidPointer zfree() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(z_stream_s._zfreeOffset_));
	}

	// z_free_func zfree
	public PointerPointer zfreeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(z_stream_s._zfreeOffset_));
	}

}
