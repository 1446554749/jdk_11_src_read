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
 * Structure: J9VMZipLoadEventPointer
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
 * The generated code will provide getters for all elements in the J9VMZipLoadEventPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9VMZipLoadEvent.class)
public class J9VMZipLoadEventPointer extends StructurePointer {

	// NULL
	public static final J9VMZipLoadEventPointer NULL = new J9VMZipLoadEventPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9VMZipLoadEventPointer(long address) {
		super(address);
	}

	public static J9VMZipLoadEventPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9VMZipLoadEventPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9VMZipLoadEventPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9VMZipLoadEventPointer(address);
	}

	public J9VMZipLoadEventPointer add(long count) {
		return J9VMZipLoadEventPointer.cast(address + (J9VMZipLoadEvent.SIZEOF * count));
	}

	public J9VMZipLoadEventPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9VMZipLoadEventPointer addOffset(long offset) {
		return J9VMZipLoadEventPointer.cast(address + offset);
	}

	public J9VMZipLoadEventPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9VMZipLoadEventPointer sub(long count) {
		return J9VMZipLoadEventPointer.cast(address - (J9VMZipLoadEvent.SIZEOF * count));
	}

	public J9VMZipLoadEventPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9VMZipLoadEventPointer subOffset(long offset) {
		return J9VMZipLoadEventPointer.cast(address - offset);
	}

	public J9VMZipLoadEventPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9VMZipLoadEventPointer untag(long mask) {
		return J9VMZipLoadEventPointer.cast(address & ~mask);
	}

	public J9VMZipLoadEventPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9VMZipLoadEvent.SIZEOF;
	}

	// Implementation methods

	// U8* cpPath
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cpPathOffset_", declaredType="U8*")
	public U8Pointer cpPath() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9VMZipLoadEvent._cpPathOffset_));
	}

	// U8* cpPath
	public PointerPointer cpPathEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMZipLoadEvent._cpPathOffset_));
	}

	// UDATA newState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_newStateOffset_", declaredType="UDATA")
	public UDATA newState() throws CorruptDataException {
		return getUDATAAtOffset(J9VMZipLoadEvent._newStateOffset_);
	}

	// UDATA newState
	public UDATAPointer newStateEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMZipLoadEvent._newStateOffset_));
	}

	// J9PortLibrary* portlib
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_portlibOffset_", declaredType="J9PortLibrary*")
	public J9PortLibraryPointer portlib() throws CorruptDataException {
		return J9PortLibraryPointer.cast(getPointerAtOffset(J9VMZipLoadEvent._portlibOffset_));
	}

	// J9PortLibrary* portlib
	public PointerPointer portlibEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMZipLoadEvent._portlibOffset_));
	}

	// I32 returnCode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_returnCodeOffset_", declaredType="I32")
	public IDATA returnCode() throws CorruptDataException {
		return new I32(getIntAtOffset(J9VMZipLoadEvent._returnCodeOffset_));
	}

	// I32 returnCode
	public IDATAPointer returnCodeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9VMZipLoadEvent._returnCodeOffset_));
	}

	// void* userData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_userDataOffset_", declaredType="void*")
	public VoidPointer userData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VMZipLoadEvent._userDataOffset_));
	}

	// void* userData
	public PointerPointer userDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMZipLoadEvent._userDataOffset_));
	}

	// const J9ZipFile* zipfile
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zipfileOffset_", declaredType="const J9ZipFile*")
	public J9ZipFilePointer zipfile() throws CorruptDataException {
		return J9ZipFilePointer.cast(getPointerAtOffset(J9VMZipLoadEvent._zipfileOffset_));
	}

	// const J9ZipFile* zipfile
	public PointerPointer zipfileEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMZipLoadEvent._zipfileOffset_));
	}

}
