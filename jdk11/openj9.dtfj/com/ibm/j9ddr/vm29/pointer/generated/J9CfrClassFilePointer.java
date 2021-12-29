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
 * Structure: J9CfrClassFilePointer
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
 * The generated code will provide getters for all elements in the J9CfrClassFilePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9CfrClassFile.class)
public class J9CfrClassFilePointer extends StructurePointer {

	// NULL
	public static final J9CfrClassFilePointer NULL = new J9CfrClassFilePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9CfrClassFilePointer(long address) {
		super(address);
	}

	public static J9CfrClassFilePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9CfrClassFilePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9CfrClassFilePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9CfrClassFilePointer(address);
	}

	public J9CfrClassFilePointer add(long count) {
		return J9CfrClassFilePointer.cast(address + (J9CfrClassFile.SIZEOF * count));
	}

	public J9CfrClassFilePointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9CfrClassFilePointer addOffset(long offset) {
		return J9CfrClassFilePointer.cast(address + offset);
	}

	public J9CfrClassFilePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9CfrClassFilePointer sub(long count) {
		return J9CfrClassFilePointer.cast(address - (J9CfrClassFile.SIZEOF * count));
	}

	public J9CfrClassFilePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9CfrClassFilePointer subOffset(long offset) {
		return J9CfrClassFilePointer.cast(address - offset);
	}

	public J9CfrClassFilePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9CfrClassFilePointer untag(long mask) {
		return J9CfrClassFilePointer.cast(address & ~mask);
	}

	public J9CfrClassFilePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9CfrClassFile.SIZEOF;
	}

	// Implementation methods

	// U16 accessFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_accessFlagsOffset_", declaredType="U16")
	public U16 accessFlags() throws CorruptDataException {
		return new U16(getShortAtOffset(J9CfrClassFile._accessFlagsOffset_));
	}

	// U16 accessFlags
	public U16Pointer accessFlagsEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9CfrClassFile._accessFlagsOffset_));
	}

	// void** attributes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_attributesOffset_", declaredType="void**")
	public PointerPointer attributes() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(J9CfrClassFile._attributesOffset_));
	}

	// void** attributes
	public PointerPointer attributesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CfrClassFile._attributesOffset_));
	}

	// U16 attributesCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_attributesCountOffset_", declaredType="U16")
	public U16 attributesCount() throws CorruptDataException {
		return new U16(getShortAtOffset(J9CfrClassFile._attributesCountOffset_));
	}

	// U16 attributesCount
	public U16Pointer attributesCountEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9CfrClassFile._attributesCountOffset_));
	}

	// U32 classFileSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classFileSizeOffset_", declaredType="U32")
	public UDATA classFileSize() throws CorruptDataException {
		return new U32(getIntAtOffset(J9CfrClassFile._classFileSizeOffset_));
	}

	// U32 classFileSize
	public UDATAPointer classFileSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9CfrClassFile._classFileSizeOffset_));
	}

	// J9CfrConstantPoolInfo* constantPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_constantPoolOffset_", declaredType="J9CfrConstantPoolInfo*")
	public J9CfrConstantPoolInfoPointer constantPool() throws CorruptDataException {
		return J9CfrConstantPoolInfoPointer.cast(getPointerAtOffset(J9CfrClassFile._constantPoolOffset_));
	}

	// J9CfrConstantPoolInfo* constantPool
	public PointerPointer constantPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CfrClassFile._constantPoolOffset_));
	}

	// U16 constantPoolCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_constantPoolCountOffset_", declaredType="U16")
	public U16 constantPoolCount() throws CorruptDataException {
		return new U16(getShortAtOffset(J9CfrClassFile._constantPoolCountOffset_));
	}

	// U16 constantPoolCount
	public U16Pointer constantPoolCountEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9CfrClassFile._constantPoolCountOffset_));
	}

	// J9CfrField* fields
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fieldsOffset_", declaredType="J9CfrField*")
	public J9CfrFieldPointer fields() throws CorruptDataException {
		return J9CfrFieldPointer.cast(getPointerAtOffset(J9CfrClassFile._fieldsOffset_));
	}

	// J9CfrField* fields
	public PointerPointer fieldsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CfrClassFile._fieldsOffset_));
	}

	// U16 fieldsCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fieldsCountOffset_", declaredType="U16")
	public U16 fieldsCount() throws CorruptDataException {
		return new U16(getShortAtOffset(J9CfrClassFile._fieldsCountOffset_));
	}

	// U16 fieldsCount
	public U16Pointer fieldsCountEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9CfrClassFile._fieldsCountOffset_));
	}

	// U16 firstNATCPIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_firstNATCPIndexOffset_", declaredType="U16")
	public U16 firstNATCPIndex() throws CorruptDataException {
		return new U16(getShortAtOffset(J9CfrClassFile._firstNATCPIndexOffset_));
	}

	// U16 firstNATCPIndex
	public U16Pointer firstNATCPIndexEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9CfrClassFile._firstNATCPIndexOffset_));
	}

	// U16 firstUTF8CPIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_firstUTF8CPIndexOffset_", declaredType="U16")
	public U16 firstUTF8CPIndex() throws CorruptDataException {
		return new U16(getShortAtOffset(J9CfrClassFile._firstUTF8CPIndexOffset_));
	}

	// U16 firstUTF8CPIndex
	public U16Pointer firstUTF8CPIndexEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9CfrClassFile._firstUTF8CPIndexOffset_));
	}

	// U16* interfaces
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_interfacesOffset_", declaredType="U16*")
	public U16Pointer interfaces() throws CorruptDataException {
		return U16Pointer.cast(getPointerAtOffset(J9CfrClassFile._interfacesOffset_));
	}

	// U16* interfaces
	public PointerPointer interfacesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CfrClassFile._interfacesOffset_));
	}

	// U16 interfacesCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_interfacesCountOffset_", declaredType="U16")
	public U16 interfacesCount() throws CorruptDataException {
		return new U16(getShortAtOffset(J9CfrClassFile._interfacesCountOffset_));
	}

	// U16 interfacesCount
	public U16Pointer interfacesCountEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9CfrClassFile._interfacesCountOffset_));
	}

	// U16 j9Flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_j9FlagsOffset_", declaredType="U16")
	public U16 j9Flags() throws CorruptDataException {
		return new U16(getShortAtOffset(J9CfrClassFile._j9FlagsOffset_));
	}

	// U16 j9Flags
	public U16Pointer j9FlagsEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9CfrClassFile._j9FlagsOffset_));
	}

	// U16 lastUTF8CPIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastUTF8CPIndexOffset_", declaredType="U16")
	public U16 lastUTF8CPIndex() throws CorruptDataException {
		return new U16(getShortAtOffset(J9CfrClassFile._lastUTF8CPIndexOffset_));
	}

	// U16 lastUTF8CPIndex
	public U16Pointer lastUTF8CPIndexEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9CfrClassFile._lastUTF8CPIndexOffset_));
	}

	// U32 magic
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_magicOffset_", declaredType="U32")
	public UDATA magic() throws CorruptDataException {
		return new U32(getIntAtOffset(J9CfrClassFile._magicOffset_));
	}

	// U32 magic
	public UDATAPointer magicEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9CfrClassFile._magicOffset_));
	}

	// U16 majorVersion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_majorVersionOffset_", declaredType="U16")
	public U16 majorVersion() throws CorruptDataException {
		return new U16(getShortAtOffset(J9CfrClassFile._majorVersionOffset_));
	}

	// U16 majorVersion
	public U16Pointer majorVersionEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9CfrClassFile._majorVersionOffset_));
	}

	// J9CfrMethod* methods
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodsOffset_", declaredType="J9CfrMethod*")
	public J9CfrMethodPointer methods() throws CorruptDataException {
		return J9CfrMethodPointer.cast(getPointerAtOffset(J9CfrClassFile._methodsOffset_));
	}

	// J9CfrMethod* methods
	public PointerPointer methodsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CfrClassFile._methodsOffset_));
	}

	// U16 methodsCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodsCountOffset_", declaredType="U16")
	public U16 methodsCount() throws CorruptDataException {
		return new U16(getShortAtOffset(J9CfrClassFile._methodsCountOffset_));
	}

	// U16 methodsCount
	public U16Pointer methodsCountEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9CfrClassFile._methodsCountOffset_));
	}

	// U16 minorVersion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_minorVersionOffset_", declaredType="U16")
	public U16 minorVersion() throws CorruptDataException {
		return new U16(getShortAtOffset(J9CfrClassFile._minorVersionOffset_));
	}

	// U16 minorVersion
	public U16Pointer minorVersionEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9CfrClassFile._minorVersionOffset_));
	}

	// U16 superClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_superClassOffset_", declaredType="U16")
	public U16 superClass() throws CorruptDataException {
		return new U16(getShortAtOffset(J9CfrClassFile._superClassOffset_));
	}

	// U16 superClass
	public U16Pointer superClassEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9CfrClassFile._superClassOffset_));
	}

	// U16 thisClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_thisClassOffset_", declaredType="U16")
	public U16 thisClass() throws CorruptDataException {
		return new U16(getShortAtOffset(J9CfrClassFile._thisClassOffset_));
	}

	// U16 thisClass
	public U16Pointer thisClassEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9CfrClassFile._thisClassOffset_));
	}

}
