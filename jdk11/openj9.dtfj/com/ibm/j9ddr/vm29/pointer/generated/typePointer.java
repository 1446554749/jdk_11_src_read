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
 * Structure: typePointer
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
 * The generated code will provide getters for all elements in the typePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=type.class)
public class typePointer extends StructurePointer {

	// NULL
	public static final typePointer NULL = new typePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected typePointer(long address) {
		super(address);
	}

	public static typePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static typePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static typePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new typePointer(address);
	}

	public typePointer add(long count) {
		return typePointer.cast(address + (type.SIZEOF * count));
	}

	public typePointer add(Scalar count) {
		return add(count.longValue());
	}

	public typePointer addOffset(long offset) {
		return typePointer.cast(address + offset);
	}

	public typePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public typePointer sub(long count) {
		return typePointer.cast(address - (type.SIZEOF * count));
	}

	public typePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public typePointer subOffset(long offset) {
		return typePointer.cast(address - offset);
	}

	public typePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public typePointer untag(long mask) {
		return typePointer.cast(address & ~mask);
	}

	public typePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return type.SIZEOF;
	}

	// Implementation methods

	// U32 clazz.nameIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_clazz$nameIndexOffset_", declaredType="U32")
	public UDATA clazz$nameIndex() throws CorruptDataException {
		return new U32(getIntAtOffset(type._clazz$nameIndexOffset_));
	}

	// U32 clazz.nameIndex
	public UDATAPointer clazz$nameIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(type._clazz$nameIndexOffset_));
	}

	// J9UTF8* clazz.utf8
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_clazz$utf8Offset_", declaredType="J9UTF8*")
	public J9UTF8Pointer clazz$utf8() throws CorruptDataException {
		return J9UTF8Pointer.cast(getPointerAtOffset(type._clazz$utf8Offset_));
	}

	// J9UTF8* clazz.utf8
	public PointerPointer clazz$utf8EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(type._clazz$utf8Offset_));
	}

	// U32 intFloat.data
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_intFloat$dataOffset_", declaredType="U32")
	public UDATA intFloat$data() throws CorruptDataException {
		return new U32(getIntAtOffset(type._intFloat$dataOffset_));
	}

	// U32 intFloat.data
	public UDATAPointer intFloat$dataEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(type._intFloat$dataOffset_));
	}

	// U32 invokedynamic.bsmIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_invokedynamic$bsmIndexOffset_", declaredType="U32")
	public UDATA invokedynamic$bsmIndex() throws CorruptDataException {
		return new U32(getIntAtOffset(type._invokedynamic$bsmIndexOffset_));
	}

	// U32 invokedynamic.bsmIndex
	public UDATAPointer invokedynamic$bsmIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(type._invokedynamic$bsmIndexOffset_));
	}

	// U32 invokedynamic.nameAndTypeIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_invokedynamic$nameAndTypeIndexOffset_", declaredType="U32")
	public UDATA invokedynamic$nameAndTypeIndex() throws CorruptDataException {
		return new U32(getIntAtOffset(type._invokedynamic$nameAndTypeIndexOffset_));
	}

	// U32 invokedynamic.nameAndTypeIndex
	public UDATAPointer invokedynamic$nameAndTypeIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(type._invokedynamic$nameAndTypeIndexOffset_));
	}

	// J9ROMNameAndSignature* invokedynamic.nas
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_invokedynamic$nasOffset_", declaredType="J9ROMNameAndSignature*")
	public J9ROMNameAndSignaturePointer invokedynamic$nas() throws CorruptDataException {
		return J9ROMNameAndSignaturePointer.cast(getPointerAtOffset(type._invokedynamic$nasOffset_));
	}

	// J9ROMNameAndSignature* invokedynamic.nas
	public PointerPointer invokedynamic$nasEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(type._invokedynamic$nasOffset_));
	}

	// U32 longDouble.slot1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_longDouble$slot1Offset_", declaredType="U32")
	public UDATA longDouble$slot1() throws CorruptDataException {
		return new U32(getIntAtOffset(type._longDouble$slot1Offset_));
	}

	// U32 longDouble.slot1
	public UDATAPointer longDouble$slot1EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(type._longDouble$slot1Offset_));
	}

	// U32 longDouble.slot2
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_longDouble$slot2Offset_", declaredType="U32")
	public UDATA longDouble$slot2() throws CorruptDataException {
		return new U32(getIntAtOffset(type._longDouble$slot2Offset_));
	}

	// U32 longDouble.slot2
	public UDATAPointer longDouble$slot2EA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(type._longDouble$slot2Offset_));
	}

	// U32 methodHandle.handleType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodHandle$handleTypeOffset_", declaredType="U32")
	public UDATA methodHandle$handleType() throws CorruptDataException {
		return new U32(getIntAtOffset(type._methodHandle$handleTypeOffset_));
	}

	// U32 methodHandle.handleType
	public UDATAPointer methodHandle$handleTypeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(type._methodHandle$handleTypeOffset_));
	}

	// U32 methodHandle.methodOrFieldRefIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodHandle$methodOrFieldRefIndexOffset_", declaredType="U32")
	public UDATA methodHandle$methodOrFieldRefIndex() throws CorruptDataException {
		return new U32(getIntAtOffset(type._methodHandle$methodOrFieldRefIndexOffset_));
	}

	// U32 methodHandle.methodOrFieldRefIndex
	public UDATAPointer methodHandle$methodOrFieldRefIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(type._methodHandle$methodOrFieldRefIndexOffset_));
	}

	// U32 methodType.classIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodType$classIndexOffset_", declaredType="U32")
	public UDATA methodType$classIndex() throws CorruptDataException {
		return new U32(getIntAtOffset(type._methodType$classIndexOffset_));
	}

	// U32 methodType.classIndex
	public UDATAPointer methodType$classIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(type._methodType$classIndexOffset_));
	}

	// J9ROMMethodTypeRef* methodType.methodType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodType$methodTypeOffset_", declaredType="J9ROMMethodTypeRef*")
	public J9ROMMethodTypeRefPointer methodType$methodType() throws CorruptDataException {
		return J9ROMMethodTypeRefPointer.cast(getPointerAtOffset(type._methodType$methodTypeOffset_));
	}

	// J9ROMMethodTypeRef* methodType.methodType
	public PointerPointer methodType$methodTypeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(type._methodType$methodTypeOffset_));
	}

	// U32 methodType.methodTypeIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodType$methodTypeIndexOffset_", declaredType="U32")
	public UDATA methodType$methodTypeIndex() throws CorruptDataException {
		return new U32(getIntAtOffset(type._methodType$methodTypeIndexOffset_));
	}

	// U32 methodType.methodTypeIndex
	public UDATAPointer methodType$methodTypeIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(type._methodType$methodTypeIndexOffset_));
	}

	// U32 methodType.nameAndTypeIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodType$nameAndTypeIndexOffset_", declaredType="U32")
	public UDATA methodType$nameAndTypeIndex() throws CorruptDataException {
		return new U32(getIntAtOffset(type._methodType$nameAndTypeIndexOffset_));
	}

	// U32 methodType.nameAndTypeIndex
	public UDATAPointer methodType$nameAndTypeIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(type._methodType$nameAndTypeIndexOffset_));
	}

	// J9UTF8* methodType.utf8
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodType$utf8Offset_", declaredType="J9UTF8*")
	public J9UTF8Pointer methodType$utf8() throws CorruptDataException {
		return J9UTF8Pointer.cast(getPointerAtOffset(type._methodType$utf8Offset_));
	}

	// J9UTF8* methodType.utf8
	public PointerPointer methodType$utf8EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(type._methodType$utf8Offset_));
	}

	// J9UTF8* nas.name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nas$nameOffset_", declaredType="J9UTF8*")
	public J9UTF8Pointer nas$name() throws CorruptDataException {
		return J9UTF8Pointer.cast(getPointerAtOffset(type._nas$nameOffset_));
	}

	// J9UTF8* nas.name
	public PointerPointer nas$nameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(type._nas$nameOffset_));
	}

	// U32 nas.nameIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nas$nameIndexOffset_", declaredType="U32")
	public UDATA nas$nameIndex() throws CorruptDataException {
		return new U32(getIntAtOffset(type._nas$nameIndexOffset_));
	}

	// U32 nas.nameIndex
	public UDATAPointer nas$nameIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(type._nas$nameIndexOffset_));
	}

	// J9UTF8* nas.signature
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nas$signatureOffset_", declaredType="J9UTF8*")
	public J9UTF8Pointer nas$signature() throws CorruptDataException {
		return J9UTF8Pointer.cast(getPointerAtOffset(type._nas$signatureOffset_));
	}

	// J9UTF8* nas.signature
	public PointerPointer nas$signatureEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(type._nas$signatureOffset_));
	}

	// U32 nas.signatureIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nas$signatureIndexOffset_", declaredType="U32")
	public UDATA nas$signatureIndex() throws CorruptDataException {
		return new U32(getIntAtOffset(type._nas$signatureIndexOffset_));
	}

	// U32 nas.signatureIndex
	public UDATAPointer nas$signatureIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(type._nas$signatureIndexOffset_));
	}

	// U32 ref.classIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ref$classIndexOffset_", declaredType="U32")
	public UDATA ref$classIndex() throws CorruptDataException {
		return new U32(getIntAtOffset(type._ref$classIndexOffset_));
	}

	// U32 ref.classIndex
	public UDATAPointer ref$classIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(type._ref$classIndexOffset_));
	}

	// U32 ref.nameAndTypeIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ref$nameAndTypeIndexOffset_", declaredType="U32")
	public UDATA ref$nameAndTypeIndex() throws CorruptDataException {
		return new U32(getIntAtOffset(type._ref$nameAndTypeIndexOffset_));
	}

	// U32 ref.nameAndTypeIndex
	public UDATAPointer ref$nameAndTypeIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(type._ref$nameAndTypeIndexOffset_));
	}

	// J9ROMFieldRef* ref.ref
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ref$refOffset_", declaredType="J9ROMFieldRef*")
	public J9ROMFieldRefPointer ref$ref() throws CorruptDataException {
		return J9ROMFieldRefPointer.cast(getPointerAtOffset(type._ref$refOffset_));
	}

	// J9ROMFieldRef* ref.ref
	public PointerPointer ref$refEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(type._ref$refOffset_));
	}

	// U32 string.stringIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_string$stringIndexOffset_", declaredType="U32")
	public UDATA string$stringIndex() throws CorruptDataException {
		return new U32(getIntAtOffset(type._string$stringIndexOffset_));
	}

	// U32 string.stringIndex
	public UDATAPointer string$stringIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(type._string$stringIndexOffset_));
	}

	// J9UTF8* string.utf8
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_string$utf8Offset_", declaredType="J9UTF8*")
	public J9UTF8Pointer string$utf8() throws CorruptDataException {
		return J9UTF8Pointer.cast(getPointerAtOffset(type._string$utf8Offset_));
	}

	// J9UTF8* string.utf8
	public PointerPointer string$utf8EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(type._string$utf8Offset_));
	}

	// J9UTF8* utf8.data
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_utf8$dataOffset_", declaredType="J9UTF8*")
	public J9UTF8Pointer utf8$data() throws CorruptDataException {
		return J9UTF8Pointer.cast(getPointerAtOffset(type._utf8$dataOffset_));
	}

	// J9UTF8* utf8.data
	public PointerPointer utf8$dataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(type._utf8$dataOffset_));
	}

}
