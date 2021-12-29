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
 * Structure: J9LoadROMClassDataPointer
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
 * The generated code will provide getters for all elements in the J9LoadROMClassDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9LoadROMClassData.class)
public class J9LoadROMClassDataPointer extends StructurePointer {

	// NULL
	public static final J9LoadROMClassDataPointer NULL = new J9LoadROMClassDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9LoadROMClassDataPointer(long address) {
		super(address);
	}

	public static J9LoadROMClassDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9LoadROMClassDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9LoadROMClassDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9LoadROMClassDataPointer(address);
	}

	public J9LoadROMClassDataPointer add(long count) {
		return J9LoadROMClassDataPointer.cast(address + (J9LoadROMClassData.SIZEOF * count));
	}

	public J9LoadROMClassDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9LoadROMClassDataPointer addOffset(long offset) {
		return J9LoadROMClassDataPointer.cast(address + offset);
	}

	public J9LoadROMClassDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9LoadROMClassDataPointer sub(long count) {
		return J9LoadROMClassDataPointer.cast(address - (J9LoadROMClassData.SIZEOF * count));
	}

	public J9LoadROMClassDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9LoadROMClassDataPointer subOffset(long offset) {
		return J9LoadROMClassDataPointer.cast(address - offset);
	}

	public J9LoadROMClassDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9LoadROMClassDataPointer untag(long mask) {
		return J9LoadROMClassDataPointer.cast(address & ~mask);
	}

	public J9LoadROMClassDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9LoadROMClassData.SIZEOF;
	}

	// Implementation methods

	// J9Class* classBeingRedefined
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classBeingRedefinedOffset_", declaredType="J9Class*")
	public J9ClassPointer classBeingRedefined() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9LoadROMClassData._classBeingRedefinedOffset_));
	}

	// J9Class* classBeingRedefined
	public PointerPointer classBeingRedefinedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9LoadROMClassData._classBeingRedefinedOffset_));
	}

	// U8* classData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classDataOffset_", declaredType="U8*")
	public U8Pointer classData() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9LoadROMClassData._classDataOffset_));
	}

	// U8* classData
	public PointerPointer classDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9LoadROMClassData._classDataOffset_));
	}

	// UDATA classDataLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classDataLengthOffset_", declaredType="UDATA")
	public UDATA classDataLength() throws CorruptDataException {
		return getUDATAAtOffset(J9LoadROMClassData._classDataLengthOffset_);
	}

	// UDATA classDataLength
	public UDATAPointer classDataLengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9LoadROMClassData._classDataLengthOffset_));
	}

	// j9object_t classDataObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classDataObjectOffset_", declaredType="j9object_t")
	public J9ObjectPointer classDataObject() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(J9LoadROMClassData._classDataObjectOffset_));
	}

	// j9object_t classDataObject
	public PointerPointer classDataObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9LoadROMClassData._classDataObjectOffset_));
	}

	// J9ClassLoader* classLoader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classLoaderOffset_", declaredType="J9ClassLoader*")
	public J9ClassLoaderPointer classLoader() throws CorruptDataException {
		return J9ClassLoaderPointer.cast(getPointerAtOffset(J9LoadROMClassData._classLoaderOffset_));
	}

	// J9ClassLoader* classLoader
	public PointerPointer classLoaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9LoadROMClassData._classLoaderOffset_));
	}

	// U8* className
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classNameOffset_", declaredType="U8*")
	public U8Pointer className() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9LoadROMClassData._classNameOffset_));
	}

	// U8* className
	public PointerPointer classNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9LoadROMClassData._classNameOffset_));
	}

	// UDATA classNameLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classNameLengthOffset_", declaredType="UDATA")
	public UDATA classNameLength() throws CorruptDataException {
		return getUDATAAtOffset(J9LoadROMClassData._classNameLengthOffset_);
	}

	// UDATA classNameLength
	public UDATAPointer classNameLengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9LoadROMClassData._classNameLengthOffset_));
	}

	// classDataFreeFunction freeFunction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_freeFunctionOffset_", declaredType="classDataFreeFunction")
	public VoidPointer freeFunction() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9LoadROMClassData._freeFunctionOffset_));
	}

	// classDataFreeFunction freeFunction
	public PointerPointer freeFunctionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9LoadROMClassData._freeFunctionOffset_));
	}

	// void* freeUserData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_freeUserDataOffset_", declaredType="void*")
	public VoidPointer freeUserData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9LoadROMClassData._freeUserDataOffset_));
	}

	// void* freeUserData
	public PointerPointer freeUserDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9LoadROMClassData._freeUserDataOffset_));
	}

	// UDATA hostPackageLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hostPackageLengthOffset_", declaredType="UDATA")
	public UDATA hostPackageLength() throws CorruptDataException {
		return getUDATAAtOffset(J9LoadROMClassData._hostPackageLengthOffset_);
	}

	// UDATA hostPackageLength
	public UDATAPointer hostPackageLengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9LoadROMClassData._hostPackageLengthOffset_));
	}

	// U8* hostPackageName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hostPackageNameOffset_", declaredType="U8*")
	public U8Pointer hostPackageName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9LoadROMClassData._hostPackageNameOffset_));
	}

	// U8* hostPackageName
	public PointerPointer hostPackageNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9LoadROMClassData._hostPackageNameOffset_));
	}

	// UDATA options
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_optionsOffset_", declaredType="UDATA")
	public UDATA options() throws CorruptDataException {
		return getUDATAAtOffset(J9LoadROMClassData._optionsOffset_);
	}

	// UDATA options
	public UDATAPointer optionsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9LoadROMClassData._optionsOffset_));
	}

	// j9object_t protectionDomain
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_protectionDomainOffset_", declaredType="j9object_t")
	public J9ObjectPointer protectionDomain() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(J9LoadROMClassData._protectionDomainOffset_));
	}

	// j9object_t protectionDomain
	public PointerPointer protectionDomainEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9LoadROMClassData._protectionDomainOffset_));
	}

	// J9ROMClass* romClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romClassOffset_", declaredType="J9ROMClass*")
	public J9ROMClassPointer romClass() throws CorruptDataException {
		return J9ROMClassPointer.cast(getPointerAtOffset(J9LoadROMClassData._romClassOffset_));
	}

	// J9ROMClass* romClass
	public PointerPointer romClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9LoadROMClassData._romClassOffset_));
	}

	// J9MemorySegment* romClassSegment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romClassSegmentOffset_", declaredType="J9MemorySegment*")
	public J9MemorySegmentPointer romClassSegment() throws CorruptDataException {
		return J9MemorySegmentPointer.cast(getPointerAtOffset(J9LoadROMClassData._romClassSegmentOffset_));
	}

	// J9MemorySegment* romClassSegment
	public PointerPointer romClassSegmentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9LoadROMClassData._romClassSegmentOffset_));
	}

}
