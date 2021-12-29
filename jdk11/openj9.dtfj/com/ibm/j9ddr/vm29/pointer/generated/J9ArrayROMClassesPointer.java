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
 * Structure: J9ArrayROMClassesPointer
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
 * The generated code will provide getters for all elements in the J9ArrayROMClassesPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9ArrayROMClasses.class)
public class J9ArrayROMClassesPointer extends StructurePointer {

	// NULL
	public static final J9ArrayROMClassesPointer NULL = new J9ArrayROMClassesPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9ArrayROMClassesPointer(long address) {
		super(address);
	}

	public static J9ArrayROMClassesPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9ArrayROMClassesPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9ArrayROMClassesPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9ArrayROMClassesPointer(address);
	}

	public J9ArrayROMClassesPointer add(long count) {
		return J9ArrayROMClassesPointer.cast(address + (J9ArrayROMClasses.SIZEOF * count));
	}

	public J9ArrayROMClassesPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9ArrayROMClassesPointer addOffset(long offset) {
		return J9ArrayROMClassesPointer.cast(address + offset);
	}

	public J9ArrayROMClassesPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9ArrayROMClassesPointer sub(long count) {
		return J9ArrayROMClassesPointer.cast(address - (J9ArrayROMClasses.SIZEOF * count));
	}

	public J9ArrayROMClassesPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9ArrayROMClassesPointer subOffset(long offset) {
		return J9ArrayROMClassesPointer.cast(address - offset);
	}

	public J9ArrayROMClassesPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9ArrayROMClassesPointer untag(long mask) {
		return J9ArrayROMClassesPointer.cast(address & ~mask);
	}

	public J9ArrayROMClassesPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9ArrayROMClasses.SIZEOF;
	}

	// Implementation methods

	// U8[] booleanArrayClassName.data
	public U8Pointer booleanArrayClassName$dataEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9ArrayROMClasses._booleanArrayClassName$dataOffset_));
	}

	// U16 booleanArrayClassName.length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_booleanArrayClassName$lengthOffset_", declaredType="U16")
	public U16 booleanArrayClassName$length() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ArrayROMClasses._booleanArrayClassName$lengthOffset_));
	}

	// U16 booleanArrayClassName.length
	public U16Pointer booleanArrayClassName$lengthEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ArrayROMClasses._booleanArrayClassName$lengthOffset_));
	}

	// J9ROMArrayClass booleanArrayROMClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_booleanArrayROMClassOffset_", declaredType="J9ROMArrayClass")
	public J9ROMArrayClassPointer booleanArrayROMClass() throws CorruptDataException {
		return J9ROMArrayClassPointer.cast(nonNullFieldEA(J9ArrayROMClasses._booleanArrayROMClassOffset_));
	}

	// J9ROMArrayClass booleanArrayROMClass
	public PointerPointer booleanArrayROMClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayROMClasses._booleanArrayROMClassOffset_));
	}

	// U8[] byteArrayClassName.data
	public U8Pointer byteArrayClassName$dataEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9ArrayROMClasses._byteArrayClassName$dataOffset_));
	}

	// U16 byteArrayClassName.length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_byteArrayClassName$lengthOffset_", declaredType="U16")
	public U16 byteArrayClassName$length() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ArrayROMClasses._byteArrayClassName$lengthOffset_));
	}

	// U16 byteArrayClassName.length
	public U16Pointer byteArrayClassName$lengthEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ArrayROMClasses._byteArrayClassName$lengthOffset_));
	}

	// J9ROMArrayClass byteArrayROMClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_byteArrayROMClassOffset_", declaredType="J9ROMArrayClass")
	public J9ROMArrayClassPointer byteArrayROMClass() throws CorruptDataException {
		return J9ROMArrayClassPointer.cast(nonNullFieldEA(J9ArrayROMClasses._byteArrayROMClassOffset_));
	}

	// J9ROMArrayClass byteArrayROMClass
	public PointerPointer byteArrayROMClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayROMClasses._byteArrayROMClassOffset_));
	}

	// U8[] charArrayClassName.data
	public U8Pointer charArrayClassName$dataEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9ArrayROMClasses._charArrayClassName$dataOffset_));
	}

	// U16 charArrayClassName.length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_charArrayClassName$lengthOffset_", declaredType="U16")
	public U16 charArrayClassName$length() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ArrayROMClasses._charArrayClassName$lengthOffset_));
	}

	// U16 charArrayClassName.length
	public U16Pointer charArrayClassName$lengthEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ArrayROMClasses._charArrayClassName$lengthOffset_));
	}

	// J9ROMArrayClass charArrayROMClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_charArrayROMClassOffset_", declaredType="J9ROMArrayClass")
	public J9ROMArrayClassPointer charArrayROMClass() throws CorruptDataException {
		return J9ROMArrayClassPointer.cast(nonNullFieldEA(J9ArrayROMClasses._charArrayROMClassOffset_));
	}

	// J9ROMArrayClass charArrayROMClass
	public PointerPointer charArrayROMClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayROMClasses._charArrayROMClassOffset_));
	}

	// U8[] cloneableClassName.data
	public U8Pointer cloneableClassName$dataEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9ArrayROMClasses._cloneableClassName$dataOffset_));
	}

	// U16 cloneableClassName.length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cloneableClassName$lengthOffset_", declaredType="U16")
	public U16 cloneableClassName$length() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ArrayROMClasses._cloneableClassName$lengthOffset_));
	}

	// U16 cloneableClassName.length
	public U16Pointer cloneableClassName$lengthEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ArrayROMClasses._cloneableClassName$lengthOffset_));
	}

	// U8[] doubleArrayClassName.data
	public U8Pointer doubleArrayClassName$dataEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9ArrayROMClasses._doubleArrayClassName$dataOffset_));
	}

	// U16 doubleArrayClassName.length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_doubleArrayClassName$lengthOffset_", declaredType="U16")
	public U16 doubleArrayClassName$length() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ArrayROMClasses._doubleArrayClassName$lengthOffset_));
	}

	// U16 doubleArrayClassName.length
	public U16Pointer doubleArrayClassName$lengthEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ArrayROMClasses._doubleArrayClassName$lengthOffset_));
	}

	// J9ROMArrayClass doubleArrayROMClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_doubleArrayROMClassOffset_", declaredType="J9ROMArrayClass")
	public J9ROMArrayClassPointer doubleArrayROMClass() throws CorruptDataException {
		return J9ROMArrayClassPointer.cast(nonNullFieldEA(J9ArrayROMClasses._doubleArrayROMClassOffset_));
	}

	// J9ROMArrayClass doubleArrayROMClass
	public PointerPointer doubleArrayROMClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayROMClasses._doubleArrayROMClassOffset_));
	}

	// U8[] floatArrayClassName.data
	public U8Pointer floatArrayClassName$dataEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9ArrayROMClasses._floatArrayClassName$dataOffset_));
	}

	// U16 floatArrayClassName.length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_floatArrayClassName$lengthOffset_", declaredType="U16")
	public U16 floatArrayClassName$length() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ArrayROMClasses._floatArrayClassName$lengthOffset_));
	}

	// U16 floatArrayClassName.length
	public U16Pointer floatArrayClassName$lengthEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ArrayROMClasses._floatArrayClassName$lengthOffset_));
	}

	// J9ROMArrayClass floatArrayROMClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_floatArrayROMClassOffset_", declaredType="J9ROMArrayClass")
	public J9ROMArrayClassPointer floatArrayROMClass() throws CorruptDataException {
		return J9ROMArrayClassPointer.cast(nonNullFieldEA(J9ArrayROMClasses._floatArrayROMClassOffset_));
	}

	// J9ROMArrayClass floatArrayROMClass
	public PointerPointer floatArrayROMClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayROMClasses._floatArrayROMClassOffset_));
	}

	// J9ROMImageHeader header
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_headerOffset_", declaredType="J9ROMImageHeader")
	public J9ROMImageHeaderPointer header() throws CorruptDataException {
		return J9ROMImageHeaderPointer.cast(nonNullFieldEA(J9ArrayROMClasses._headerOffset_));
	}

	// J9ROMImageHeader header
	public PointerPointer headerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayROMClasses._headerOffset_));
	}

	// U8[] intArrayClassName.data
	public U8Pointer intArrayClassName$dataEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9ArrayROMClasses._intArrayClassName$dataOffset_));
	}

	// U16 intArrayClassName.length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_intArrayClassName$lengthOffset_", declaredType="U16")
	public U16 intArrayClassName$length() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ArrayROMClasses._intArrayClassName$lengthOffset_));
	}

	// U16 intArrayClassName.length
	public U16Pointer intArrayClassName$lengthEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ArrayROMClasses._intArrayClassName$lengthOffset_));
	}

	// J9ROMArrayClass intArrayROMClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_intArrayROMClassOffset_", declaredType="J9ROMArrayClass")
	public J9ROMArrayClassPointer intArrayROMClass() throws CorruptDataException {
		return J9ROMArrayClassPointer.cast(nonNullFieldEA(J9ArrayROMClasses._intArrayROMClassOffset_));
	}

	// J9ROMArrayClass intArrayROMClass
	public PointerPointer intArrayROMClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayROMClasses._intArrayROMClassOffset_));
	}

	// J9SRP interfaceClasses.cloneable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_interfaceClasses$cloneableOffset_", declaredType="J9SRP")
	public VoidPointer interfaceClasses$cloneable() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9ArrayROMClasses._interfaceClasses$cloneableOffset_);
		if (nextAddress == 0) {
			return VoidPointer.NULL;
		}
		return VoidPointer.cast(address + (J9ArrayROMClasses._interfaceClasses$cloneableOffset_ + nextAddress));
	}

	// J9SRP interfaceClasses.cloneable
	public SelfRelativePointer interfaceClasses$cloneableEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9ArrayROMClasses._interfaceClasses$cloneableOffset_));
	}

	// J9SRP interfaceClasses.serializeable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_interfaceClasses$serializeableOffset_", declaredType="J9SRP")
	public VoidPointer interfaceClasses$serializeable() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9ArrayROMClasses._interfaceClasses$serializeableOffset_);
		if (nextAddress == 0) {
			return VoidPointer.NULL;
		}
		return VoidPointer.cast(address + (J9ArrayROMClasses._interfaceClasses$serializeableOffset_ + nextAddress));
	}

	// J9SRP interfaceClasses.serializeable
	public SelfRelativePointer interfaceClasses$serializeableEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9ArrayROMClasses._interfaceClasses$serializeableOffset_));
	}

	// U8[] longArrayClassName.data
	public U8Pointer longArrayClassName$dataEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9ArrayROMClasses._longArrayClassName$dataOffset_));
	}

	// U16 longArrayClassName.length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_longArrayClassName$lengthOffset_", declaredType="U16")
	public U16 longArrayClassName$length() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ArrayROMClasses._longArrayClassName$lengthOffset_));
	}

	// U16 longArrayClassName.length
	public U16Pointer longArrayClassName$lengthEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ArrayROMClasses._longArrayClassName$lengthOffset_));
	}

	// J9ROMArrayClass longArrayROMClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_longArrayROMClassOffset_", declaredType="J9ROMArrayClass")
	public J9ROMArrayClassPointer longArrayROMClass() throws CorruptDataException {
		return J9ROMArrayClassPointer.cast(nonNullFieldEA(J9ArrayROMClasses._longArrayROMClassOffset_));
	}

	// J9ROMArrayClass longArrayROMClass
	public PointerPointer longArrayROMClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayROMClasses._longArrayROMClassOffset_));
	}

	// U8[] objectArrayClassName.data
	public U8Pointer objectArrayClassName$dataEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9ArrayROMClasses._objectArrayClassName$dataOffset_));
	}

	// U16 objectArrayClassName.length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_objectArrayClassName$lengthOffset_", declaredType="U16")
	public U16 objectArrayClassName$length() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ArrayROMClasses._objectArrayClassName$lengthOffset_));
	}

	// U16 objectArrayClassName.length
	public U16Pointer objectArrayClassName$lengthEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ArrayROMClasses._objectArrayClassName$lengthOffset_));
	}

	// J9ROMArrayClass objectArrayROMClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_objectArrayROMClassOffset_", declaredType="J9ROMArrayClass")
	public J9ROMArrayClassPointer objectArrayROMClass() throws CorruptDataException {
		return J9ROMArrayClassPointer.cast(nonNullFieldEA(J9ArrayROMClasses._objectArrayROMClassOffset_));
	}

	// J9ROMArrayClass objectArrayROMClass
	public PointerPointer objectArrayROMClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayROMClasses._objectArrayROMClassOffset_));
	}

	// U8[] objectClassName.data
	public U8Pointer objectClassName$dataEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9ArrayROMClasses._objectClassName$dataOffset_));
	}

	// U16 objectClassName.length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_objectClassName$lengthOffset_", declaredType="U16")
	public U16 objectClassName$length() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ArrayROMClasses._objectClassName$lengthOffset_));
	}

	// U16 objectClassName.length
	public U16Pointer objectClassName$lengthEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ArrayROMClasses._objectClassName$lengthOffset_));
	}

	// U8[] serializeableClassName.data
	public U8Pointer serializeableClassName$dataEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9ArrayROMClasses._serializeableClassName$dataOffset_));
	}

	// U16 serializeableClassName.length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_serializeableClassName$lengthOffset_", declaredType="U16")
	public U16 serializeableClassName$length() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ArrayROMClasses._serializeableClassName$lengthOffset_));
	}

	// U16 serializeableClassName.length
	public U16Pointer serializeableClassName$lengthEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ArrayROMClasses._serializeableClassName$lengthOffset_));
	}

	// U8[] shortArrayClassName.data
	public U8Pointer shortArrayClassName$dataEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9ArrayROMClasses._shortArrayClassName$dataOffset_));
	}

	// U16 shortArrayClassName.length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shortArrayClassName$lengthOffset_", declaredType="U16")
	public U16 shortArrayClassName$length() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ArrayROMClasses._shortArrayClassName$lengthOffset_));
	}

	// U16 shortArrayClassName.length
	public U16Pointer shortArrayClassName$lengthEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ArrayROMClasses._shortArrayClassName$lengthOffset_));
	}

	// J9ROMArrayClass shortArrayROMClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shortArrayROMClassOffset_", declaredType="J9ROMArrayClass")
	public J9ROMArrayClassPointer shortArrayROMClass() throws CorruptDataException {
		return J9ROMArrayClassPointer.cast(nonNullFieldEA(J9ArrayROMClasses._shortArrayROMClassOffset_));
	}

	// J9ROMArrayClass shortArrayROMClass
	public PointerPointer shortArrayROMClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ArrayROMClasses._shortArrayROMClassOffset_));
	}

}
