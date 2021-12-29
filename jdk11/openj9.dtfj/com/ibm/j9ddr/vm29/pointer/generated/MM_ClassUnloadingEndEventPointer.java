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
 * Structure: MM_ClassUnloadingEndEventPointer
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
 * The generated code will provide getters for all elements in the MM_ClassUnloadingEndEventPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ClassUnloadingEndEvent.class)
public class MM_ClassUnloadingEndEventPointer extends StructurePointer {

	// NULL
	public static final MM_ClassUnloadingEndEventPointer NULL = new MM_ClassUnloadingEndEventPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ClassUnloadingEndEventPointer(long address) {
		super(address);
	}

	public static MM_ClassUnloadingEndEventPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ClassUnloadingEndEventPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ClassUnloadingEndEventPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ClassUnloadingEndEventPointer(address);
	}

	public MM_ClassUnloadingEndEventPointer add(long count) {
		return MM_ClassUnloadingEndEventPointer.cast(address + (MM_ClassUnloadingEndEvent.SIZEOF * count));
	}

	public MM_ClassUnloadingEndEventPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ClassUnloadingEndEventPointer addOffset(long offset) {
		return MM_ClassUnloadingEndEventPointer.cast(address + offset);
	}

	public MM_ClassUnloadingEndEventPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ClassUnloadingEndEventPointer sub(long count) {
		return MM_ClassUnloadingEndEventPointer.cast(address - (MM_ClassUnloadingEndEvent.SIZEOF * count));
	}

	public MM_ClassUnloadingEndEventPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ClassUnloadingEndEventPointer subOffset(long offset) {
		return MM_ClassUnloadingEndEventPointer.cast(address - offset);
	}

	public MM_ClassUnloadingEndEventPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ClassUnloadingEndEventPointer untag(long mask) {
		return MM_ClassUnloadingEndEventPointer.cast(address & ~mask);
	}

	public MM_ClassUnloadingEndEventPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ClassUnloadingEndEvent.SIZEOF;
	}

	// Implementation methods

	// UDATA classLoaderCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classLoaderCountOffset_", declaredType="UDATA")
	public UDATA classLoaderCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_ClassUnloadingEndEvent._classLoaderCountOffset_);
	}

	// UDATA classLoaderCount
	public UDATAPointer classLoaderCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ClassUnloadingEndEvent._classLoaderCountOffset_));
	}

	// UDATA classesCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classesCountOffset_", declaredType="UDATA")
	public UDATA classesCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_ClassUnloadingEndEvent._classesCountOffset_);
	}

	// UDATA classesCount
	public UDATAPointer classesCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ClassUnloadingEndEvent._classesCountOffset_));
	}

	// U64 cleanUpClassLoaders
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cleanUpClassLoadersOffset_", declaredType="U64")
	public UDATA cleanUpClassLoaders() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ClassUnloadingEndEvent._cleanUpClassLoadersOffset_));
	}

	// U64 cleanUpClassLoaders
	public UDATAPointer cleanUpClassLoadersEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ClassUnloadingEndEvent._cleanUpClassLoadersOffset_));
	}

	// U64 cleanUpClassLoadersEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cleanUpClassLoadersEndTimeOffset_", declaredType="U64")
	public UDATA cleanUpClassLoadersEndTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ClassUnloadingEndEvent._cleanUpClassLoadersEndTimeOffset_));
	}

	// U64 cleanUpClassLoadersEndTime
	public UDATAPointer cleanUpClassLoadersEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ClassUnloadingEndEvent._cleanUpClassLoadersEndTimeOffset_));
	}

	// U64 cleanUpClassLoadersStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cleanUpClassLoadersStartTimeOffset_", declaredType="U64")
	public UDATA cleanUpClassLoadersStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ClassUnloadingEndEvent._cleanUpClassLoadersStartTimeOffset_));
	}

	// U64 cleanUpClassLoadersStartTime
	public UDATAPointer cleanUpClassLoadersStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ClassUnloadingEndEvent._cleanUpClassLoadersStartTimeOffset_));
	}

	// J9VMThread* currentThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentThreadOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer currentThread() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(MM_ClassUnloadingEndEvent._currentThreadOffset_));
	}

	// J9VMThread* currentThread
	public PointerPointer currentThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ClassUnloadingEndEvent._currentThreadOffset_));
	}

	// U64 duration
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_durationOffset_", declaredType="U64")
	public UDATA duration() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ClassUnloadingEndEvent._durationOffset_));
	}

	// U64 duration
	public UDATAPointer durationEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ClassUnloadingEndEvent._durationOffset_));
	}

	// UDATA eventid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_eventidOffset_", declaredType="UDATA")
	public UDATA eventid() throws CorruptDataException {
		return getUDATAAtOffset(MM_ClassUnloadingEndEvent._eventidOffset_);
	}

	// UDATA eventid
	public UDATAPointer eventidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ClassUnloadingEndEvent._eventidOffset_));
	}

	// U64 quiesceTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_quiesceTimeOffset_", declaredType="U64")
	public UDATA quiesceTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ClassUnloadingEndEvent._quiesceTimeOffset_));
	}

	// U64 quiesceTime
	public UDATAPointer quiesceTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ClassUnloadingEndEvent._quiesceTimeOffset_));
	}

	// U64 timestamp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_timestampOffset_", declaredType="U64")
	public UDATA timestamp() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_ClassUnloadingEndEvent._timestampOffset_));
	}

	// U64 timestamp
	public UDATAPointer timestampEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ClassUnloadingEndEvent._timestampOffset_));
	}

}
