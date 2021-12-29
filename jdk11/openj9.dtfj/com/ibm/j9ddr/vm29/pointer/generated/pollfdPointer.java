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
 * Structure: pollfdPointer
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
 * The generated code will provide getters for all elements in the pollfdPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=pollfd.class)
public class pollfdPointer extends StructurePointer {

	// NULL
	public static final pollfdPointer NULL = new pollfdPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected pollfdPointer(long address) {
		super(address);
	}

	public static pollfdPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static pollfdPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static pollfdPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new pollfdPointer(address);
	}

	public pollfdPointer add(long count) {
		return pollfdPointer.cast(address + (pollfd.SIZEOF * count));
	}

	public pollfdPointer add(Scalar count) {
		return add(count.longValue());
	}

	public pollfdPointer addOffset(long offset) {
		return pollfdPointer.cast(address + offset);
	}

	public pollfdPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public pollfdPointer sub(long count) {
		return pollfdPointer.cast(address - (pollfd.SIZEOF * count));
	}

	public pollfdPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public pollfdPointer subOffset(long offset) {
		return pollfdPointer.cast(address - offset);
	}

	public pollfdPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public pollfdPointer untag(long mask) {
		return pollfdPointer.cast(address & ~mask);
	}

	public pollfdPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return pollfd.SIZEOF;
	}

	// Implementation methods

	// I16 events
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_eventsOffset_", declaredType="I16")
	public I16 events() throws CorruptDataException {
		return new I16(getShortAtOffset(pollfd._eventsOffset_));
	}

	// I16 events
	public I16Pointer eventsEA() throws CorruptDataException {
		return I16Pointer.cast(nonNullFieldEA(pollfd._eventsOffset_));
	}

	// I32 fd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fdOffset_", declaredType="I32")
	public IDATA fd() throws CorruptDataException {
		return new I32(getIntAtOffset(pollfd._fdOffset_));
	}

	// I32 fd
	public IDATAPointer fdEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(pollfd._fdOffset_));
	}

	// I16 revents
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reventsOffset_", declaredType="I16")
	public I16 revents() throws CorruptDataException {
		return new I16(getShortAtOffset(pollfd._reventsOffset_));
	}

	// I16 revents
	public I16Pointer reventsEA() throws CorruptDataException {
		return I16Pointer.cast(nonNullFieldEA(pollfd._reventsOffset_));
	}

}
