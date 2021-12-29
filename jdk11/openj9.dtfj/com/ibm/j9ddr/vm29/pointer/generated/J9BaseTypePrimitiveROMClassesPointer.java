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
 * Structure: J9BaseTypePrimitiveROMClassesPointer
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
 * The generated code will provide getters for all elements in the J9BaseTypePrimitiveROMClassesPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9BaseTypePrimitiveROMClasses.class)
public class J9BaseTypePrimitiveROMClassesPointer extends StructurePointer {

	// NULL
	public static final J9BaseTypePrimitiveROMClassesPointer NULL = new J9BaseTypePrimitiveROMClassesPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9BaseTypePrimitiveROMClassesPointer(long address) {
		super(address);
	}

	public static J9BaseTypePrimitiveROMClassesPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9BaseTypePrimitiveROMClassesPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9BaseTypePrimitiveROMClassesPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9BaseTypePrimitiveROMClassesPointer(address);
	}

	public J9BaseTypePrimitiveROMClassesPointer add(long count) {
		return J9BaseTypePrimitiveROMClassesPointer.cast(address + (J9BaseTypePrimitiveROMClasses.SIZEOF * count));
	}

	public J9BaseTypePrimitiveROMClassesPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9BaseTypePrimitiveROMClassesPointer addOffset(long offset) {
		return J9BaseTypePrimitiveROMClassesPointer.cast(address + offset);
	}

	public J9BaseTypePrimitiveROMClassesPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9BaseTypePrimitiveROMClassesPointer sub(long count) {
		return J9BaseTypePrimitiveROMClassesPointer.cast(address - (J9BaseTypePrimitiveROMClasses.SIZEOF * count));
	}

	public J9BaseTypePrimitiveROMClassesPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9BaseTypePrimitiveROMClassesPointer subOffset(long offset) {
		return J9BaseTypePrimitiveROMClassesPointer.cast(address - offset);
	}

	public J9BaseTypePrimitiveROMClassesPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9BaseTypePrimitiveROMClassesPointer untag(long mask) {
		return J9BaseTypePrimitiveROMClassesPointer.cast(address & ~mask);
	}

	public J9BaseTypePrimitiveROMClassesPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9BaseTypePrimitiveROMClasses.SIZEOF;
	}

	// Implementation methods

	// U8[] booleanClassName.data
	public U8Pointer booleanClassName$dataEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._booleanClassName$dataOffset_));
	}

	// U16 booleanClassName.length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_booleanClassName$lengthOffset_", declaredType="U16")
	public U16 booleanClassName$length() throws CorruptDataException {
		return new U16(getShortAtOffset(J9BaseTypePrimitiveROMClasses._booleanClassName$lengthOffset_));
	}

	// U16 booleanClassName.length
	public U16Pointer booleanClassName$lengthEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._booleanClassName$lengthOffset_));
	}

	// J9ROMReflectClass booleanReflectROMClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_booleanReflectROMClassOffset_", declaredType="J9ROMReflectClass")
	public J9ROMReflectClassPointer booleanReflectROMClass() throws CorruptDataException {
		return J9ROMReflectClassPointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._booleanReflectROMClassOffset_));
	}

	// J9ROMReflectClass booleanReflectROMClass
	public PointerPointer booleanReflectROMClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._booleanReflectROMClassOffset_));
	}

	// U8[] byteClassName.data
	public U8Pointer byteClassName$dataEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._byteClassName$dataOffset_));
	}

	// U16 byteClassName.length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_byteClassName$lengthOffset_", declaredType="U16")
	public U16 byteClassName$length() throws CorruptDataException {
		return new U16(getShortAtOffset(J9BaseTypePrimitiveROMClasses._byteClassName$lengthOffset_));
	}

	// U16 byteClassName.length
	public U16Pointer byteClassName$lengthEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._byteClassName$lengthOffset_));
	}

	// J9ROMReflectClass byteReflectROMClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_byteReflectROMClassOffset_", declaredType="J9ROMReflectClass")
	public J9ROMReflectClassPointer byteReflectROMClass() throws CorruptDataException {
		return J9ROMReflectClassPointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._byteReflectROMClassOffset_));
	}

	// J9ROMReflectClass byteReflectROMClass
	public PointerPointer byteReflectROMClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._byteReflectROMClassOffset_));
	}

	// U8[] charClassName.data
	public U8Pointer charClassName$dataEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._charClassName$dataOffset_));
	}

	// U16 charClassName.length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_charClassName$lengthOffset_", declaredType="U16")
	public U16 charClassName$length() throws CorruptDataException {
		return new U16(getShortAtOffset(J9BaseTypePrimitiveROMClasses._charClassName$lengthOffset_));
	}

	// U16 charClassName.length
	public U16Pointer charClassName$lengthEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._charClassName$lengthOffset_));
	}

	// J9ROMReflectClass charReflectROMClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_charReflectROMClassOffset_", declaredType="J9ROMReflectClass")
	public J9ROMReflectClassPointer charReflectROMClass() throws CorruptDataException {
		return J9ROMReflectClassPointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._charReflectROMClassOffset_));
	}

	// J9ROMReflectClass charReflectROMClass
	public PointerPointer charReflectROMClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._charReflectROMClassOffset_));
	}

	// U8[] doubleClassName.data
	public U8Pointer doubleClassName$dataEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._doubleClassName$dataOffset_));
	}

	// U16 doubleClassName.length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_doubleClassName$lengthOffset_", declaredType="U16")
	public U16 doubleClassName$length() throws CorruptDataException {
		return new U16(getShortAtOffset(J9BaseTypePrimitiveROMClasses._doubleClassName$lengthOffset_));
	}

	// U16 doubleClassName.length
	public U16Pointer doubleClassName$lengthEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._doubleClassName$lengthOffset_));
	}

	// J9ROMReflectClass doubleReflectROMClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_doubleReflectROMClassOffset_", declaredType="J9ROMReflectClass")
	public J9ROMReflectClassPointer doubleReflectROMClass() throws CorruptDataException {
		return J9ROMReflectClassPointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._doubleReflectROMClassOffset_));
	}

	// J9ROMReflectClass doubleReflectROMClass
	public PointerPointer doubleReflectROMClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._doubleReflectROMClassOffset_));
	}

	// U8[] floatClassName.data
	public U8Pointer floatClassName$dataEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._floatClassName$dataOffset_));
	}

	// U16 floatClassName.length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_floatClassName$lengthOffset_", declaredType="U16")
	public U16 floatClassName$length() throws CorruptDataException {
		return new U16(getShortAtOffset(J9BaseTypePrimitiveROMClasses._floatClassName$lengthOffset_));
	}

	// U16 floatClassName.length
	public U16Pointer floatClassName$lengthEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._floatClassName$lengthOffset_));
	}

	// J9ROMReflectClass floatReflectROMClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_floatReflectROMClassOffset_", declaredType="J9ROMReflectClass")
	public J9ROMReflectClassPointer floatReflectROMClass() throws CorruptDataException {
		return J9ROMReflectClassPointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._floatReflectROMClassOffset_));
	}

	// J9ROMReflectClass floatReflectROMClass
	public PointerPointer floatReflectROMClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._floatReflectROMClassOffset_));
	}

	// J9ROMImageHeader header
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_headerOffset_", declaredType="J9ROMImageHeader")
	public J9ROMImageHeaderPointer header() throws CorruptDataException {
		return J9ROMImageHeaderPointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._headerOffset_));
	}

	// J9ROMImageHeader header
	public PointerPointer headerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._headerOffset_));
	}

	// U8[] intClassName.data
	public U8Pointer intClassName$dataEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._intClassName$dataOffset_));
	}

	// U16 intClassName.length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_intClassName$lengthOffset_", declaredType="U16")
	public U16 intClassName$length() throws CorruptDataException {
		return new U16(getShortAtOffset(J9BaseTypePrimitiveROMClasses._intClassName$lengthOffset_));
	}

	// U16 intClassName.length
	public U16Pointer intClassName$lengthEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._intClassName$lengthOffset_));
	}

	// J9ROMReflectClass intReflectROMClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_intReflectROMClassOffset_", declaredType="J9ROMReflectClass")
	public J9ROMReflectClassPointer intReflectROMClass() throws CorruptDataException {
		return J9ROMReflectClassPointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._intReflectROMClassOffset_));
	}

	// J9ROMReflectClass intReflectROMClass
	public PointerPointer intReflectROMClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._intReflectROMClassOffset_));
	}

	// U8[] longClassName.data
	public U8Pointer longClassName$dataEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._longClassName$dataOffset_));
	}

	// U16 longClassName.length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_longClassName$lengthOffset_", declaredType="U16")
	public U16 longClassName$length() throws CorruptDataException {
		return new U16(getShortAtOffset(J9BaseTypePrimitiveROMClasses._longClassName$lengthOffset_));
	}

	// U16 longClassName.length
	public U16Pointer longClassName$lengthEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._longClassName$lengthOffset_));
	}

	// J9ROMReflectClass longReflectROMClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_longReflectROMClassOffset_", declaredType="J9ROMReflectClass")
	public J9ROMReflectClassPointer longReflectROMClass() throws CorruptDataException {
		return J9ROMReflectClassPointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._longReflectROMClassOffset_));
	}

	// J9ROMReflectClass longReflectROMClass
	public PointerPointer longReflectROMClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._longReflectROMClassOffset_));
	}

	// U8[] shortClassName.data
	public U8Pointer shortClassName$dataEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._shortClassName$dataOffset_));
	}

	// U16 shortClassName.length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shortClassName$lengthOffset_", declaredType="U16")
	public U16 shortClassName$length() throws CorruptDataException {
		return new U16(getShortAtOffset(J9BaseTypePrimitiveROMClasses._shortClassName$lengthOffset_));
	}

	// U16 shortClassName.length
	public U16Pointer shortClassName$lengthEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._shortClassName$lengthOffset_));
	}

	// J9ROMReflectClass shortReflectROMClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shortReflectROMClassOffset_", declaredType="J9ROMReflectClass")
	public J9ROMReflectClassPointer shortReflectROMClass() throws CorruptDataException {
		return J9ROMReflectClassPointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._shortReflectROMClassOffset_));
	}

	// J9ROMReflectClass shortReflectROMClass
	public PointerPointer shortReflectROMClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._shortReflectROMClassOffset_));
	}

	// U8[] voidClassName.data
	public U8Pointer voidClassName$dataEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._voidClassName$dataOffset_));
	}

	// U16 voidClassName.length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_voidClassName$lengthOffset_", declaredType="U16")
	public U16 voidClassName$length() throws CorruptDataException {
		return new U16(getShortAtOffset(J9BaseTypePrimitiveROMClasses._voidClassName$lengthOffset_));
	}

	// U16 voidClassName.length
	public U16Pointer voidClassName$lengthEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._voidClassName$lengthOffset_));
	}

	// J9ROMReflectClass voidReflectROMClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_voidReflectROMClassOffset_", declaredType="J9ROMReflectClass")
	public J9ROMReflectClassPointer voidReflectROMClass() throws CorruptDataException {
		return J9ROMReflectClassPointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._voidReflectROMClassOffset_));
	}

	// J9ROMReflectClass voidReflectROMClass
	public PointerPointer voidReflectROMClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9BaseTypePrimitiveROMClasses._voidReflectROMClassOffset_));
	}

}
