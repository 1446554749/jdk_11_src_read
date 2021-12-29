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
 * Structure: VMIZipFilePointer
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
 * The generated code will provide getters for all elements in the VMIZipFilePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=VMIZipFile.class)
public class VMIZipFilePointer extends StructurePointer {

	// NULL
	public static final VMIZipFilePointer NULL = new VMIZipFilePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected VMIZipFilePointer(long address) {
		super(address);
	}

	public static VMIZipFilePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static VMIZipFilePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static VMIZipFilePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new VMIZipFilePointer(address);
	}

	public VMIZipFilePointer add(long count) {
		return VMIZipFilePointer.cast(address + (VMIZipFile.SIZEOF * count));
	}

	public VMIZipFilePointer add(Scalar count) {
		return add(count.longValue());
	}

	public VMIZipFilePointer addOffset(long offset) {
		return VMIZipFilePointer.cast(address + offset);
	}

	public VMIZipFilePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public VMIZipFilePointer sub(long count) {
		return VMIZipFilePointer.cast(address - (VMIZipFile.SIZEOF * count));
	}

	public VMIZipFilePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public VMIZipFilePointer subOffset(long offset) {
		return VMIZipFilePointer.cast(address - offset);
	}

	public VMIZipFilePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public VMIZipFilePointer untag(long mask) {
		return VMIZipFilePointer.cast(address & ~mask);
	}

	public VMIZipFilePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return VMIZipFile.SIZEOF;
	}

	// Implementation methods

	// U8[] _vmipadding0065
	public U8Pointer _vmipadding0065EA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(VMIZipFile.__vmipadding0065Offset_));
	}

	// void* cache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cacheOffset_", declaredType="void*")
	public VoidPointer cache() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VMIZipFile._cacheOffset_));
	}

	// void* cache
	public PointerPointer cacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMIZipFile._cacheOffset_));
	}

	// void* cachePool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cachePoolOffset_", declaredType="void*")
	public VoidPointer cachePool() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VMIZipFile._cachePoolOffset_));
	}

	// void* cachePool
	public PointerPointer cachePoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMIZipFile._cachePoolOffset_));
	}

	// I32 fd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fdOffset_", declaredType="I32")
	public IDATA fd() throws CorruptDataException {
		return new I32(getIntAtOffset(VMIZipFile._fdOffset_));
	}

	// I32 fd
	public IDATAPointer fdEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(VMIZipFile._fdOffset_));
	}

	// U8* filename
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_filenameOffset_", declaredType="U8*")
	public U8Pointer filename() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(VMIZipFile._filenameOffset_));
	}

	// U8* filename
	public PointerPointer filenameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VMIZipFile._filenameOffset_));
	}

	// U8[] internalFilename
	public U8Pointer internalFilenameEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(VMIZipFile._internalFilenameOffset_));
	}

	// I32 pointer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pointerOffset_", declaredType="I32")
	public IDATA pointer() throws CorruptDataException {
		return new I32(getIntAtOffset(VMIZipFile._pointerOffset_));
	}

	// I32 pointer
	public IDATAPointer pointerEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(VMIZipFile._pointerOffset_));
	}

	// U8 type
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_typeOffset_", declaredType="U8")
	public U8 type() throws CorruptDataException {
		return new U8(getByteAtOffset(VMIZipFile._typeOffset_));
	}

	// U8 type
	public U8Pointer typeEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(VMIZipFile._typeOffset_));
	}

}
