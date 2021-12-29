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
 * Structure: J9PermissionPointer
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
 * The generated code will provide getters for all elements in the J9PermissionPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9Permission.class)
public class J9PermissionPointer extends StructurePointer {

	// NULL
	public static final J9PermissionPointer NULL = new J9PermissionPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9PermissionPointer(long address) {
		super(address);
	}

	public static J9PermissionPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9PermissionPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9PermissionPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9PermissionPointer(address);
	}

	public J9PermissionPointer add(long count) {
		return J9PermissionPointer.cast(address + (J9Permission.SIZEOF * count));
	}

	public J9PermissionPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9PermissionPointer addOffset(long offset) {
		return J9PermissionPointer.cast(address + offset);
	}

	public J9PermissionPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9PermissionPointer sub(long count) {
		return J9PermissionPointer.cast(address - (J9Permission.SIZEOF * count));
	}

	public J9PermissionPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9PermissionPointer subOffset(long offset) {
		return J9PermissionPointer.cast(address - offset);
	}

	public J9PermissionPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9PermissionPointer untag(long mask) {
		return J9PermissionPointer.cast(address & ~mask);
	}

	public J9PermissionPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9Permission.SIZEOF;
	}

	// Implementation methods

	// U32:1 isGroupReadable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isGroupReadableOffset_", declaredType="U32:1")
	public UDATA isGroupReadable() throws CorruptDataException {
		return getU32Bitfield(J9Permission._isGroupReadable_s_, J9Permission._isGroupReadable_b_);
	}

	// U32:1 isGroupWriteable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isGroupWriteableOffset_", declaredType="U32:1")
	public UDATA isGroupWriteable() throws CorruptDataException {
		return getU32Bitfield(J9Permission._isGroupWriteable_s_, J9Permission._isGroupWriteable_b_);
	}

	// U32:1 isOtherReadable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isOtherReadableOffset_", declaredType="U32:1")
	public UDATA isOtherReadable() throws CorruptDataException {
		return getU32Bitfield(J9Permission._isOtherReadable_s_, J9Permission._isOtherReadable_b_);
	}

	// U32:1 isOtherWriteable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isOtherWriteableOffset_", declaredType="U32:1")
	public UDATA isOtherWriteable() throws CorruptDataException {
		return getU32Bitfield(J9Permission._isOtherWriteable_s_, J9Permission._isOtherWriteable_b_);
	}

	// U32:1 isUserReadable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isUserReadableOffset_", declaredType="U32:1")
	public UDATA isUserReadable() throws CorruptDataException {
		return getU32Bitfield(J9Permission._isUserReadable_s_, J9Permission._isUserReadable_b_);
	}

	// U32:1 isUserWriteable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_isUserWriteableOffset_", declaredType="U32:1")
	public UDATA isUserWriteable() throws CorruptDataException {
		return getU32Bitfield(J9Permission._isUserWriteable_s_, J9Permission._isUserWriteable_b_);
	}

}
