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
 * Structure: MM_VerboseEventPointer
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
 * The generated code will provide getters for all elements in the MM_VerboseEventPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_VerboseEvent.class)
public class MM_VerboseEventPointer extends MM_BasePointer {

	// NULL
	public static final MM_VerboseEventPointer NULL = new MM_VerboseEventPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_VerboseEventPointer(long address) {
		super(address);
	}

	public static MM_VerboseEventPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_VerboseEventPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_VerboseEventPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_VerboseEventPointer(address);
	}

	public MM_VerboseEventPointer add(long count) {
		return MM_VerboseEventPointer.cast(address + (MM_VerboseEvent.SIZEOF * count));
	}

	public MM_VerboseEventPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_VerboseEventPointer addOffset(long offset) {
		return MM_VerboseEventPointer.cast(address + offset);
	}

	public MM_VerboseEventPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_VerboseEventPointer sub(long count) {
		return MM_VerboseEventPointer.cast(address - (MM_VerboseEvent.SIZEOF * count));
	}

	public MM_VerboseEventPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_VerboseEventPointer subOffset(long offset) {
		return MM_VerboseEventPointer.cast(address - offset);
	}

	public MM_VerboseEventPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_VerboseEventPointer untag(long mask) {
		return MM_VerboseEventPointer.cast(address & ~mask);
	}

	public MM_VerboseEventPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_VerboseEvent.SIZEOF;
	}

	// Implementation methods

	// MM_GCExtensions* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensions*")
	public MM_GCExtensionsPointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsPointer.cast(getPointerAtOffset(MM_VerboseEvent.__extensionsOffset_));
	}

	// MM_GCExtensions* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VerboseEvent.__extensionsOffset_));
	}

	// void** _hookInterface
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__hookInterfaceOffset_", declaredType="void**")
	public PointerPointer _hookInterface() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(MM_VerboseEvent.__hookInterfaceOffset_));
	}

	// void** _hookInterface
	public PointerPointer _hookInterfaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VerboseEvent.__hookInterfaceOffset_));
	}

	// MM_VerboseManagerOld* _manager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__managerOffset_", declaredType="MM_VerboseManagerOld*")
	public MM_VerboseManagerOldPointer _manager() throws CorruptDataException {
		return MM_VerboseManagerOldPointer.cast(getPointerAtOffset(MM_VerboseEvent.__managerOffset_));
	}

	// MM_VerboseManagerOld* _manager
	public PointerPointer _managerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VerboseEvent.__managerOffset_));
	}

	// MM_VerboseEvent* _next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextOffset_", declaredType="MM_VerboseEvent*")
	public MM_VerboseEventPointer _next() throws CorruptDataException {
		return MM_VerboseEventPointer.cast(getPointerAtOffset(MM_VerboseEvent.__nextOffset_));
	}

	// MM_VerboseEvent* _next
	public PointerPointer _nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VerboseEvent.__nextOffset_));
	}

	// OMR_VMThread* _omrThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__omrThreadOffset_", declaredType="OMR_VMThread*")
	public OMR_VMThreadPointer _omrThread() throws CorruptDataException {
		return OMR_VMThreadPointer.cast(getPointerAtOffset(MM_VerboseEvent.__omrThreadOffset_));
	}

	// OMR_VMThread* _omrThread
	public PointerPointer _omrThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VerboseEvent.__omrThreadOffset_));
	}

	// MM_VerboseEvent* _previous
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__previousOffset_", declaredType="MM_VerboseEvent*")
	public MM_VerboseEventPointer _previous() throws CorruptDataException {
		return MM_VerboseEventPointer.cast(getPointerAtOffset(MM_VerboseEvent.__previousOffset_));
	}

	// MM_VerboseEvent* _previous
	public PointerPointer _previousEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VerboseEvent.__previousOffset_));
	}

	// U64 _time
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__timeOffset_", declaredType="U64")
	public UDATA _time() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseEvent.__timeOffset_));
	}

	// U64 _time
	public UDATAPointer _timeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEvent.__timeOffset_));
	}

	// UDATA _type
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__typeOffset_", declaredType="UDATA")
	public UDATA _type() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEvent.__typeOffset_);
	}

	// UDATA _type
	public UDATAPointer _typeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEvent.__typeOffset_));
	}

	// void** _vptr$MM_VerboseEvent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__vptr$MM_VerboseEventOffset_", declaredType="void**")
	public PointerPointer _vptr$MM_VerboseEvent() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(MM_VerboseEvent.__vptr$MM_VerboseEventOffset_));
	}

	// void** _vptr$MM_VerboseEvent
	public PointerPointer _vptr$MM_VerboseEventEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VerboseEvent.__vptr$MM_VerboseEventOffset_));
	}

}
