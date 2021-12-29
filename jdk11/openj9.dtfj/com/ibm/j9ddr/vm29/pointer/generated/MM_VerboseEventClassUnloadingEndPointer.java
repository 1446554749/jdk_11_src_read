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
 * Structure: MM_VerboseEventClassUnloadingEndPointer
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
 * The generated code will provide getters for all elements in the MM_VerboseEventClassUnloadingEndPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_VerboseEventClassUnloadingEnd.class)
public class MM_VerboseEventClassUnloadingEndPointer extends MM_VerboseEventPointer {

	// NULL
	public static final MM_VerboseEventClassUnloadingEndPointer NULL = new MM_VerboseEventClassUnloadingEndPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_VerboseEventClassUnloadingEndPointer(long address) {
		super(address);
	}

	public static MM_VerboseEventClassUnloadingEndPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_VerboseEventClassUnloadingEndPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_VerboseEventClassUnloadingEndPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_VerboseEventClassUnloadingEndPointer(address);
	}

	public MM_VerboseEventClassUnloadingEndPointer add(long count) {
		return MM_VerboseEventClassUnloadingEndPointer.cast(address + (MM_VerboseEventClassUnloadingEnd.SIZEOF * count));
	}

	public MM_VerboseEventClassUnloadingEndPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_VerboseEventClassUnloadingEndPointer addOffset(long offset) {
		return MM_VerboseEventClassUnloadingEndPointer.cast(address + offset);
	}

	public MM_VerboseEventClassUnloadingEndPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_VerboseEventClassUnloadingEndPointer sub(long count) {
		return MM_VerboseEventClassUnloadingEndPointer.cast(address - (MM_VerboseEventClassUnloadingEnd.SIZEOF * count));
	}

	public MM_VerboseEventClassUnloadingEndPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_VerboseEventClassUnloadingEndPointer subOffset(long offset) {
		return MM_VerboseEventClassUnloadingEndPointer.cast(address - offset);
	}

	public MM_VerboseEventClassUnloadingEndPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_VerboseEventClassUnloadingEndPointer untag(long mask) {
		return MM_VerboseEventClassUnloadingEndPointer.cast(address & ~mask);
	}

	public MM_VerboseEventClassUnloadingEndPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_VerboseEventClassUnloadingEnd.SIZEOF;
	}

	// Implementation methods

	// UDATA _classLoadersUnloadedCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classLoadersUnloadedCountOffset_", declaredType="UDATA")
	public UDATA _classLoadersUnloadedCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventClassUnloadingEnd.__classLoadersUnloadedCountOffset_);
	}

	// UDATA _classLoadersUnloadedCount
	public UDATAPointer _classLoadersUnloadedCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventClassUnloadingEnd.__classLoadersUnloadedCountOffset_));
	}

	// U64 _classUnloadMutexQuiesceTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classUnloadMutexQuiesceTimeOffset_", declaredType="U64")
	public UDATA _classUnloadMutexQuiesceTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseEventClassUnloadingEnd.__classUnloadMutexQuiesceTimeOffset_));
	}

	// U64 _classUnloadMutexQuiesceTime
	public UDATAPointer _classUnloadMutexQuiesceTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventClassUnloadingEnd.__classUnloadMutexQuiesceTimeOffset_));
	}

	// U64 _classUnloadingStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classUnloadingStartTimeOffset_", declaredType="U64")
	public UDATA _classUnloadingStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseEventClassUnloadingEnd.__classUnloadingStartTimeOffset_));
	}

	// U64 _classUnloadingStartTime
	public UDATAPointer _classUnloadingStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventClassUnloadingEnd.__classUnloadingStartTimeOffset_));
	}

	// UDATA _classesUnloadedCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classesUnloadedCountOffset_", declaredType="UDATA")
	public UDATA _classesUnloadedCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventClassUnloadingEnd.__classesUnloadedCountOffset_);
	}

	// UDATA _classesUnloadedCount
	public UDATAPointer _classesUnloadedCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventClassUnloadingEnd.__classesUnloadedCountOffset_));
	}

	// U64 _cleanUpClassLoadersEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cleanUpClassLoadersEndTimeOffset_", declaredType="U64")
	public UDATA _cleanUpClassLoadersEndTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseEventClassUnloadingEnd.__cleanUpClassLoadersEndTimeOffset_));
	}

	// U64 _cleanUpClassLoadersEndTime
	public UDATAPointer _cleanUpClassLoadersEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventClassUnloadingEnd.__cleanUpClassLoadersEndTimeOffset_));
	}

	// U64 _cleanUpClassLoadersStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cleanUpClassLoadersStartTimeOffset_", declaredType="U64")
	public UDATA _cleanUpClassLoadersStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseEventClassUnloadingEnd.__cleanUpClassLoadersStartTimeOffset_));
	}

	// U64 _cleanUpClassLoadersStartTime
	public UDATAPointer _cleanUpClassLoadersStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventClassUnloadingEnd.__cleanUpClassLoadersStartTimeOffset_));
	}

	// U64 _cleanUpClassLoadersTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cleanUpClassLoadersTimeOffset_", declaredType="U64")
	public UDATA _cleanUpClassLoadersTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseEventClassUnloadingEnd.__cleanUpClassLoadersTimeOffset_));
	}

	// U64 _cleanUpClassLoadersTime
	public UDATAPointer _cleanUpClassLoadersTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventClassUnloadingEnd.__cleanUpClassLoadersTimeOffset_));
	}

}
