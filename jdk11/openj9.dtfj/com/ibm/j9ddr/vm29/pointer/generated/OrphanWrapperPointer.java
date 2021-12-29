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
 * Structure: OrphanWrapperPointer
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
 * The generated code will provide getters for all elements in the OrphanWrapperPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=OrphanWrapper.class)
public class OrphanWrapperPointer extends StructurePointer {

	// NULL
	public static final OrphanWrapperPointer NULL = new OrphanWrapperPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected OrphanWrapperPointer(long address) {
		super(address);
	}

	public static OrphanWrapperPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static OrphanWrapperPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static OrphanWrapperPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new OrphanWrapperPointer(address);
	}

	public OrphanWrapperPointer add(long count) {
		return OrphanWrapperPointer.cast(address + (OrphanWrapper.SIZEOF * count));
	}

	public OrphanWrapperPointer add(Scalar count) {
		return add(count.longValue());
	}

	public OrphanWrapperPointer addOffset(long offset) {
		return OrphanWrapperPointer.cast(address + offset);
	}

	public OrphanWrapperPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public OrphanWrapperPointer sub(long count) {
		return OrphanWrapperPointer.cast(address - (OrphanWrapper.SIZEOF * count));
	}

	public OrphanWrapperPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public OrphanWrapperPointer subOffset(long offset) {
		return OrphanWrapperPointer.cast(address - offset);
	}

	public OrphanWrapperPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public OrphanWrapperPointer untag(long mask) {
		return OrphanWrapperPointer.cast(address & ~mask);
	}

	public OrphanWrapperPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return OrphanWrapper.SIZEOF;
	}

	// Implementation methods

	// J9ShrOffset romClassOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romClassOffsetOffset_", declaredType="J9ShrOffset")
	public J9ShrOffsetPointer romClassOffset() throws CorruptDataException {
		return J9ShrOffsetPointer.cast(nonNullFieldEA(OrphanWrapper._romClassOffsetOffset_));
	}

	// J9ShrOffset romClassOffset
	public PointerPointer romClassOffsetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OrphanWrapper._romClassOffsetOffset_));
	}

}
