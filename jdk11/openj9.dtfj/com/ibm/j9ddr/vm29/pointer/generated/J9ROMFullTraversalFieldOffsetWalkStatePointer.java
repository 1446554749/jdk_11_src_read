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
 * Structure: J9ROMFullTraversalFieldOffsetWalkStatePointer
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
 * The generated code will provide getters for all elements in the J9ROMFullTraversalFieldOffsetWalkStatePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9ROMFullTraversalFieldOffsetWalkState.class)
public class J9ROMFullTraversalFieldOffsetWalkStatePointer extends StructurePointer {

	// NULL
	public static final J9ROMFullTraversalFieldOffsetWalkStatePointer NULL = new J9ROMFullTraversalFieldOffsetWalkStatePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9ROMFullTraversalFieldOffsetWalkStatePointer(long address) {
		super(address);
	}

	public static J9ROMFullTraversalFieldOffsetWalkStatePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9ROMFullTraversalFieldOffsetWalkStatePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9ROMFullTraversalFieldOffsetWalkStatePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9ROMFullTraversalFieldOffsetWalkStatePointer(address);
	}

	public J9ROMFullTraversalFieldOffsetWalkStatePointer add(long count) {
		return J9ROMFullTraversalFieldOffsetWalkStatePointer.cast(address + (J9ROMFullTraversalFieldOffsetWalkState.SIZEOF * count));
	}

	public J9ROMFullTraversalFieldOffsetWalkStatePointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9ROMFullTraversalFieldOffsetWalkStatePointer addOffset(long offset) {
		return J9ROMFullTraversalFieldOffsetWalkStatePointer.cast(address + offset);
	}

	public J9ROMFullTraversalFieldOffsetWalkStatePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9ROMFullTraversalFieldOffsetWalkStatePointer sub(long count) {
		return J9ROMFullTraversalFieldOffsetWalkStatePointer.cast(address - (J9ROMFullTraversalFieldOffsetWalkState.SIZEOF * count));
	}

	public J9ROMFullTraversalFieldOffsetWalkStatePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9ROMFullTraversalFieldOffsetWalkStatePointer subOffset(long offset) {
		return J9ROMFullTraversalFieldOffsetWalkStatePointer.cast(address - offset);
	}

	public J9ROMFullTraversalFieldOffsetWalkStatePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9ROMFullTraversalFieldOffsetWalkStatePointer untag(long mask) {
		return J9ROMFullTraversalFieldOffsetWalkStatePointer.cast(address & ~mask);
	}

	public J9ROMFullTraversalFieldOffsetWalkStatePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9ROMFullTraversalFieldOffsetWalkState.SIZEOF;
	}

	// Implementation methods

	// UDATA classIndexAdjust
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classIndexAdjustOffset_", declaredType="UDATA")
	public UDATA classIndexAdjust() throws CorruptDataException {
		return getUDATAAtOffset(J9ROMFullTraversalFieldOffsetWalkState._classIndexAdjustOffset_);
	}

	// UDATA classIndexAdjust
	public UDATAPointer classIndexAdjustEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMFullTraversalFieldOffsetWalkState._classIndexAdjustOffset_));
	}

	// J9Class* clazz
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_clazzOffset_", declaredType="J9Class*")
	public J9ClassPointer clazz() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9ROMFullTraversalFieldOffsetWalkState._clazzOffset_));
	}

	// J9Class* clazz
	public PointerPointer clazzEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ROMFullTraversalFieldOffsetWalkState._clazzOffset_));
	}

	// J9Class* currentClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentClassOffset_", declaredType="J9Class*")
	public J9ClassPointer currentClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9ROMFullTraversalFieldOffsetWalkState._currentClassOffset_));
	}

	// J9Class* currentClass
	public PointerPointer currentClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ROMFullTraversalFieldOffsetWalkState._currentClassOffset_));
	}

	// UDATA fieldOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fieldOffsetOffset_", declaredType="UDATA")
	public UDATA fieldOffset() throws CorruptDataException {
		return getUDATAAtOffset(J9ROMFullTraversalFieldOffsetWalkState._fieldOffsetOffset_);
	}

	// UDATA fieldOffset
	public UDATAPointer fieldOffsetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMFullTraversalFieldOffsetWalkState._fieldOffsetOffset_));
	}

	// J9ROMFieldOffsetWalkState fieldOffsetWalkState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fieldOffsetWalkStateOffset_", declaredType="J9ROMFieldOffsetWalkState")
	public J9ROMFieldOffsetWalkStatePointer fieldOffsetWalkState() throws CorruptDataException {
		return J9ROMFieldOffsetWalkStatePointer.cast(nonNullFieldEA(J9ROMFullTraversalFieldOffsetWalkState._fieldOffsetWalkStateOffset_));
	}

	// J9ROMFieldOffsetWalkState fieldOffsetWalkState
	public PointerPointer fieldOffsetWalkStateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ROMFullTraversalFieldOffsetWalkState._fieldOffsetWalkStateOffset_));
	}

	// J9JavaVM* javaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_javaVMOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer javaVM() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(J9ROMFullTraversalFieldOffsetWalkState._javaVMOffset_));
	}

	// J9JavaVM* javaVM
	public PointerPointer javaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ROMFullTraversalFieldOffsetWalkState._javaVMOffset_));
	}

	// UDATA referenceIndexOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_referenceIndexOffsetOffset_", declaredType="UDATA")
	public UDATA referenceIndexOffset() throws CorruptDataException {
		return getUDATAAtOffset(J9ROMFullTraversalFieldOffsetWalkState._referenceIndexOffsetOffset_);
	}

	// UDATA referenceIndexOffset
	public UDATAPointer referenceIndexOffsetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMFullTraversalFieldOffsetWalkState._referenceIndexOffsetOffset_));
	}

	// U32 remainingClassDepth
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_remainingClassDepthOffset_", declaredType="U32")
	public UDATA remainingClassDepth() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMFullTraversalFieldOffsetWalkState._remainingClassDepthOffset_));
	}

	// U32 remainingClassDepth
	public UDATAPointer remainingClassDepthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMFullTraversalFieldOffsetWalkState._remainingClassDepthOffset_));
	}

	// J9ITable* superITable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_superITableOffset_", declaredType="J9ITable*")
	public J9ITablePointer superITable() throws CorruptDataException {
		return J9ITablePointer.cast(getPointerAtOffset(J9ROMFullTraversalFieldOffsetWalkState._superITableOffset_));
	}

	// J9ITable* superITable
	public PointerPointer superITableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ROMFullTraversalFieldOffsetWalkState._superITableOffset_));
	}

	// U32 walkFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_walkFlagsOffset_", declaredType="U32")
	public UDATA walkFlags() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMFullTraversalFieldOffsetWalkState._walkFlagsOffset_));
	}

	// U32 walkFlags
	public UDATAPointer walkFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMFullTraversalFieldOffsetWalkState._walkFlagsOffset_));
	}

	// void** walkSuperclasses
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_walkSuperclassesOffset_", declaredType="void**")
	public PointerPointer walkSuperclasses() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(J9ROMFullTraversalFieldOffsetWalkState._walkSuperclassesOffset_));
	}

	// void** walkSuperclasses
	public PointerPointer walkSuperclassesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ROMFullTraversalFieldOffsetWalkState._walkSuperclassesOffset_));
	}

}
