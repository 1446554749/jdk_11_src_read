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
 * Structure: J9VMFindLocalClassEventPointer
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
 * The generated code will provide getters for all elements in the J9VMFindLocalClassEventPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9VMFindLocalClassEvent.class)
public class J9VMFindLocalClassEventPointer extends StructurePointer {

	// NULL
	public static final J9VMFindLocalClassEventPointer NULL = new J9VMFindLocalClassEventPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9VMFindLocalClassEventPointer(long address) {
		super(address);
	}

	public static J9VMFindLocalClassEventPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9VMFindLocalClassEventPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9VMFindLocalClassEventPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9VMFindLocalClassEventPointer(address);
	}

	public J9VMFindLocalClassEventPointer add(long count) {
		return J9VMFindLocalClassEventPointer.cast(address + (J9VMFindLocalClassEvent.SIZEOF * count));
	}

	public J9VMFindLocalClassEventPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9VMFindLocalClassEventPointer addOffset(long offset) {
		return J9VMFindLocalClassEventPointer.cast(address + offset);
	}

	public J9VMFindLocalClassEventPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9VMFindLocalClassEventPointer sub(long count) {
		return J9VMFindLocalClassEventPointer.cast(address - (J9VMFindLocalClassEvent.SIZEOF * count));
	}

	public J9VMFindLocalClassEventPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9VMFindLocalClassEventPointer subOffset(long offset) {
		return J9VMFindLocalClassEventPointer.cast(address - offset);
	}

	public J9VMFindLocalClassEventPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9VMFindLocalClassEventPointer untag(long mask) {
		return J9VMFindLocalClassEventPointer.cast(address & ~mask);
	}

	public J9VMFindLocalClassEventPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9VMFindLocalClassEvent.SIZEOF;
	}

	// Implementation methods

	// const U8* className
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classNameOffset_", declaredType="const U8*")
	public U8Pointer className() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9VMFindLocalClassEvent._classNameOffset_));
	}

	// const U8* className
	public PointerPointer classNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMFindLocalClassEvent._classNameOffset_));
	}

	// UDATA classNameLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classNameLengthOffset_", declaredType="UDATA")
	public UDATA classNameLength() throws CorruptDataException {
		return getUDATAAtOffset(J9VMFindLocalClassEvent._classNameLengthOffset_);
	}

	// UDATA classNameLength
	public UDATAPointer classNameLengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMFindLocalClassEvent._classNameLengthOffset_));
	}

	// J9ClassPathEntry* classPathEntries
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classPathEntriesOffset_", declaredType="J9ClassPathEntry*")
	public J9ClassPathEntryPointer classPathEntries() throws CorruptDataException {
		return J9ClassPathEntryPointer.cast(getPointerAtOffset(J9VMFindLocalClassEvent._classPathEntriesOffset_));
	}

	// J9ClassPathEntry* classPathEntries
	public PointerPointer classPathEntriesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMFindLocalClassEvent._classPathEntriesOffset_));
	}

	// J9ClassLoader* classloader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classloaderOffset_", declaredType="J9ClassLoader*")
	public J9ClassLoaderPointer classloader() throws CorruptDataException {
		return J9ClassLoaderPointer.cast(getPointerAtOffset(J9VMFindLocalClassEvent._classloaderOffset_));
	}

	// J9ClassLoader* classloader
	public PointerPointer classloaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMFindLocalClassEvent._classloaderOffset_));
	}

	// IDATA confirmedCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_confirmedCountOffset_", declaredType="IDATA")
	public IDATA confirmedCount() throws CorruptDataException {
		return getIDATAAtOffset(J9VMFindLocalClassEvent._confirmedCountOffset_);
	}

	// IDATA confirmedCount
	public IDATAPointer confirmedCountEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9VMFindLocalClassEvent._confirmedCountOffset_));
	}

	// J9VMThread* currentThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentThreadOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer currentThread() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(J9VMFindLocalClassEvent._currentThreadOffset_));
	}

	// J9VMThread* currentThread
	public PointerPointer currentThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMFindLocalClassEvent._currentThreadOffset_));
	}

	// UDATA doPreventFind
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_doPreventFindOffset_", declaredType="UDATA")
	public UDATA doPreventFind() throws CorruptDataException {
		return getUDATAAtOffset(J9VMFindLocalClassEvent._doPreventFindOffset_);
	}

	// UDATA doPreventFind
	public UDATAPointer doPreventFindEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMFindLocalClassEvent._doPreventFindOffset_));
	}

	// UDATA doPreventStore
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_doPreventStoreOffset_", declaredType="UDATA")
	public UDATA doPreventStore() throws CorruptDataException {
		return getUDATAAtOffset(J9VMFindLocalClassEvent._doPreventStoreOffset_);
	}

	// UDATA doPreventStore
	public UDATAPointer doPreventStoreEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMFindLocalClassEvent._doPreventStoreOffset_));
	}

	// UDATA entryCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_entryCountOffset_", declaredType="UDATA")
	public UDATA entryCount() throws CorruptDataException {
		return getUDATAAtOffset(J9VMFindLocalClassEvent._entryCountOffset_);
	}

	// UDATA entryCount
	public UDATAPointer entryCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMFindLocalClassEvent._entryCountOffset_));
	}

	// IDATA* foundAtIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_foundAtIndexOffset_", declaredType="IDATA*")
	public IDATAPointer foundAtIndex() throws CorruptDataException {
		return IDATAPointer.cast(getPointerAtOffset(J9VMFindLocalClassEvent._foundAtIndexOffset_));
	}

	// IDATA* foundAtIndex
	public PointerPointer foundAtIndexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMFindLocalClassEvent._foundAtIndexOffset_));
	}

	// J9Module* j9module
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9moduleOffset_", declaredType="J9Module*")
	public J9ModulePointer j9module() throws CorruptDataException {
		return J9ModulePointer.cast(getPointerAtOffset(J9VMFindLocalClassEvent._j9moduleOffset_));
	}

	// J9Module* j9module
	public PointerPointer j9moduleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMFindLocalClassEvent._j9moduleOffset_));
	}

	// const J9UTF8* partition
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_partitionOffset_", declaredType="const J9UTF8*")
	public J9UTF8Pointer partition() throws CorruptDataException {
		return J9UTF8Pointer.cast(getPointerAtOffset(J9VMFindLocalClassEvent._partitionOffset_));
	}

	// const J9UTF8* partition
	public PointerPointer partitionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMFindLocalClassEvent._partitionOffset_));
	}

	// J9ROMClass* result
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resultOffset_", declaredType="J9ROMClass*")
	public J9ROMClassPointer result() throws CorruptDataException {
		return J9ROMClassPointer.cast(getPointerAtOffset(J9VMFindLocalClassEvent._resultOffset_));
	}

	// J9ROMClass* result
	public PointerPointer resultEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMFindLocalClassEvent._resultOffset_));
	}

}
