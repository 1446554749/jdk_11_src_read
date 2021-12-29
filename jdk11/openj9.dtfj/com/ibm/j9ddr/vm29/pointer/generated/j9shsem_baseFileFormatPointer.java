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
 * Structure: j9shsem_baseFileFormatPointer
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
 * The generated code will provide getters for all elements in the j9shsem_baseFileFormatPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=j9shsem_baseFileFormat.class)
public class j9shsem_baseFileFormatPointer extends StructurePointer {

	// NULL
	public static final j9shsem_baseFileFormatPointer NULL = new j9shsem_baseFileFormatPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected j9shsem_baseFileFormatPointer(long address) {
		super(address);
	}

	public static j9shsem_baseFileFormatPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static j9shsem_baseFileFormatPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static j9shsem_baseFileFormatPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new j9shsem_baseFileFormatPointer(address);
	}

	public j9shsem_baseFileFormatPointer add(long count) {
		return j9shsem_baseFileFormatPointer.cast(address + (j9shsem_baseFileFormat.SIZEOF * count));
	}

	public j9shsem_baseFileFormatPointer add(Scalar count) {
		return add(count.longValue());
	}

	public j9shsem_baseFileFormatPointer addOffset(long offset) {
		return j9shsem_baseFileFormatPointer.cast(address + offset);
	}

	public j9shsem_baseFileFormatPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public j9shsem_baseFileFormatPointer sub(long count) {
		return j9shsem_baseFileFormatPointer.cast(address - (j9shsem_baseFileFormat.SIZEOF * count));
	}

	public j9shsem_baseFileFormatPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public j9shsem_baseFileFormatPointer subOffset(long offset) {
		return j9shsem_baseFileFormatPointer.cast(address - offset);
	}

	public j9shsem_baseFileFormatPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public j9shsem_baseFileFormatPointer untag(long mask) {
		return j9shsem_baseFileFormatPointer.cast(address & ~mask);
	}

	public j9shsem_baseFileFormatPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return j9shsem_baseFileFormat.SIZEOF;
	}

	// Implementation methods

	// I32 creator_pid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_creator_pidOffset_", declaredType="I32")
	public IDATA creator_pid() throws CorruptDataException {
		return new I32(getIntAtOffset(j9shsem_baseFileFormat._creator_pidOffset_));
	}

	// I32 creator_pid
	public IDATAPointer creator_pidEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(j9shsem_baseFileFormat._creator_pidOffset_));
	}

	// key_t ftok_key
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ftok_keyOffset_", declaredType="key_t")
	public IDATA ftok_key() throws CorruptDataException {
		return new I32(getIntAtOffset(j9shsem_baseFileFormat._ftok_keyOffset_));
	}

	// key_t ftok_key
	public IDATAPointer ftok_keyEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(j9shsem_baseFileFormat._ftok_keyOffset_));
	}

	// I32 modlevel
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_modlevelOffset_", declaredType="I32")
	public IDATA modlevel() throws CorruptDataException {
		return new I32(getIntAtOffset(j9shsem_baseFileFormat._modlevelOffset_));
	}

	// I32 modlevel
	public IDATAPointer modlevelEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(j9shsem_baseFileFormat._modlevelOffset_));
	}

	// I32 proj_id
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_proj_idOffset_", declaredType="I32")
	public IDATA proj_id() throws CorruptDataException {
		return new I32(getIntAtOffset(j9shsem_baseFileFormat._proj_idOffset_));
	}

	// I32 proj_id
	public IDATAPointer proj_idEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(j9shsem_baseFileFormat._proj_idOffset_));
	}

	// I32 semid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_semidOffset_", declaredType="I32")
	public IDATA semid() throws CorruptDataException {
		return new I32(getIntAtOffset(j9shsem_baseFileFormat._semidOffset_));
	}

	// I32 semid
	public IDATAPointer semidEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(j9shsem_baseFileFormat._semidOffset_));
	}

	// I32 semsetSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_semsetSizeOffset_", declaredType="I32")
	public IDATA semsetSize() throws CorruptDataException {
		return new I32(getIntAtOffset(j9shsem_baseFileFormat._semsetSizeOffset_));
	}

	// I32 semsetSize
	public IDATAPointer semsetSizeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(j9shsem_baseFileFormat._semsetSizeOffset_));
	}

	// I32 timeout
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_timeoutOffset_", declaredType="I32")
	public IDATA timeout() throws CorruptDataException {
		return new I32(getIntAtOffset(j9shsem_baseFileFormat._timeoutOffset_));
	}

	// I32 timeout
	public IDATAPointer timeoutEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(j9shsem_baseFileFormat._timeoutOffset_));
	}

	// I32 version
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_versionOffset_", declaredType="I32")
	public IDATA version() throws CorruptDataException {
		return new I32(getIntAtOffset(j9shsem_baseFileFormat._versionOffset_));
	}

	// I32 version
	public IDATAPointer versionEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(j9shsem_baseFileFormat._versionOffset_));
	}

}
