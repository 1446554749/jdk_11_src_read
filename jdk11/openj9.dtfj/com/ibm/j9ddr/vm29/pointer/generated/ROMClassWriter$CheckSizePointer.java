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
 * Structure: ROMClassWriter$CheckSizePointer
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
 * The generated code will provide getters for all elements in the ROMClassWriter$CheckSizePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=ROMClassWriter$CheckSize.class)
public class ROMClassWriter$CheckSizePointer extends StructurePointer {

	// NULL
	public static final ROMClassWriter$CheckSizePointer NULL = new ROMClassWriter$CheckSizePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected ROMClassWriter$CheckSizePointer(long address) {
		super(address);
	}

	public static ROMClassWriter$CheckSizePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static ROMClassWriter$CheckSizePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static ROMClassWriter$CheckSizePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new ROMClassWriter$CheckSizePointer(address);
	}

	public ROMClassWriter$CheckSizePointer add(long count) {
		return ROMClassWriter$CheckSizePointer.cast(address + (ROMClassWriter$CheckSize.SIZEOF * count));
	}

	public ROMClassWriter$CheckSizePointer add(Scalar count) {
		return add(count.longValue());
	}

	public ROMClassWriter$CheckSizePointer addOffset(long offset) {
		return ROMClassWriter$CheckSizePointer.cast(address + offset);
	}

	public ROMClassWriter$CheckSizePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public ROMClassWriter$CheckSizePointer sub(long count) {
		return ROMClassWriter$CheckSizePointer.cast(address - (ROMClassWriter$CheckSize.SIZEOF * count));
	}

	public ROMClassWriter$CheckSizePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public ROMClassWriter$CheckSizePointer subOffset(long offset) {
		return ROMClassWriter$CheckSizePointer.cast(address - offset);
	}

	public ROMClassWriter$CheckSizePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public ROMClassWriter$CheckSizePointer untag(long mask) {
		return ROMClassWriter$CheckSizePointer.cast(address & ~mask);
	}

	public ROMClassWriter$CheckSizePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return ROMClassWriter$CheckSize.SIZEOF;
	}

	// Implementation methods

	// Cursor* _cursor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cursorOffset_", declaredType="Cursor*")
	public CursorPointer _cursor() throws CorruptDataException {
		return CursorPointer.cast(getPointerAtOffset(ROMClassWriter$CheckSize.__cursorOffset_));
	}

	// Cursor* _cursor
	public PointerPointer _cursorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassWriter$CheckSize.__cursorOffset_));
	}

	// UDATA _expectedSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__expectedSizeOffset_", declaredType="UDATA")
	public UDATA _expectedSize() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassWriter$CheckSize.__expectedSizeOffset_);
	}

	// UDATA _expectedSize
	public UDATAPointer _expectedSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassWriter$CheckSize.__expectedSizeOffset_));
	}

	// UDATA _start
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__startOffset_", declaredType="UDATA")
	public UDATA _start() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassWriter$CheckSize.__startOffset_);
	}

	// UDATA _start
	public UDATAPointer _startEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassWriter$CheckSize.__startOffset_));
	}

}
