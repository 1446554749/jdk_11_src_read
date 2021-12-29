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
 * Structure: UtTraceListenerPointer
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
 * The generated code will provide getters for all elements in the UtTraceListenerPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=UtTraceListener.class)
public class UtTraceListenerPointer extends StructurePointer {

	// NULL
	public static final UtTraceListenerPointer NULL = new UtTraceListenerPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected UtTraceListenerPointer(long address) {
		super(address);
	}

	public static UtTraceListenerPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static UtTraceListenerPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static UtTraceListenerPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new UtTraceListenerPointer(address);
	}

	public UtTraceListenerPointer add(long count) {
		return UtTraceListenerPointer.cast(address + (UtTraceListener.SIZEOF * count));
	}

	public UtTraceListenerPointer add(Scalar count) {
		return add(count.longValue());
	}

	public UtTraceListenerPointer addOffset(long offset) {
		return UtTraceListenerPointer.cast(address + offset);
	}

	public UtTraceListenerPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public UtTraceListenerPointer sub(long count) {
		return UtTraceListenerPointer.cast(address - (UtTraceListener.SIZEOF * count));
	}

	public UtTraceListenerPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public UtTraceListenerPointer subOffset(long offset) {
		return UtTraceListenerPointer.cast(address - offset);
	}

	public UtTraceListenerPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public UtTraceListenerPointer untag(long mask) {
		return UtTraceListenerPointer.cast(address & ~mask);
	}

	public UtTraceListenerPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return UtTraceListener.SIZEOF;
	}

	// Implementation methods

	// UtDataHeader header
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_headerOffset_", declaredType="UtDataHeader")
	public UtDataHeaderPointer header() throws CorruptDataException {
		return UtDataHeaderPointer.cast(nonNullFieldEA(UtTraceListener._headerOffset_));
	}

	// UtDataHeader header
	public PointerPointer headerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtTraceListener._headerOffset_));
	}

	// UtListenerWrapper listener
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_listenerOffset_", declaredType="UtListenerWrapper")
	public VoidPointer listener() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtTraceListener._listenerOffset_));
	}

	// UtListenerWrapper listener
	public PointerPointer listenerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtTraceListener._listenerOffset_));
	}

	// UtTraceListener* next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextOffset_", declaredType="UtTraceListener*")
	public UtTraceListenerPointer next() throws CorruptDataException {
		return UtTraceListenerPointer.cast(getPointerAtOffset(UtTraceListener._nextOffset_));
	}

	// UtTraceListener* next
	public PointerPointer nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtTraceListener._nextOffset_));
	}

	// void* userData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_userDataOffset_", declaredType="void*")
	public VoidPointer userData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(UtTraceListener._userDataOffset_));
	}

	// void* userData
	public PointerPointer userDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtTraceListener._userDataOffset_));
	}

}
