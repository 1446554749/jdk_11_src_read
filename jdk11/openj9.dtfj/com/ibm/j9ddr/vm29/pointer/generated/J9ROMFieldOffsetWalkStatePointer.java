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
 * Structure: J9ROMFieldOffsetWalkStatePointer
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
 * The generated code will provide getters for all elements in the J9ROMFieldOffsetWalkStatePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9ROMFieldOffsetWalkState.class)
public class J9ROMFieldOffsetWalkStatePointer extends StructurePointer {

	// NULL
	public static final J9ROMFieldOffsetWalkStatePointer NULL = new J9ROMFieldOffsetWalkStatePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9ROMFieldOffsetWalkStatePointer(long address) {
		super(address);
	}

	public static J9ROMFieldOffsetWalkStatePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9ROMFieldOffsetWalkStatePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9ROMFieldOffsetWalkStatePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9ROMFieldOffsetWalkStatePointer(address);
	}

	public J9ROMFieldOffsetWalkStatePointer add(long count) {
		return J9ROMFieldOffsetWalkStatePointer.cast(address + (J9ROMFieldOffsetWalkState.SIZEOF * count));
	}

	public J9ROMFieldOffsetWalkStatePointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9ROMFieldOffsetWalkStatePointer addOffset(long offset) {
		return J9ROMFieldOffsetWalkStatePointer.cast(address + offset);
	}

	public J9ROMFieldOffsetWalkStatePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9ROMFieldOffsetWalkStatePointer sub(long count) {
		return J9ROMFieldOffsetWalkStatePointer.cast(address - (J9ROMFieldOffsetWalkState.SIZEOF * count));
	}

	public J9ROMFieldOffsetWalkStatePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9ROMFieldOffsetWalkStatePointer subOffset(long offset) {
		return J9ROMFieldOffsetWalkStatePointer.cast(address - offset);
	}

	public J9ROMFieldOffsetWalkStatePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9ROMFieldOffsetWalkStatePointer untag(long mask) {
		return J9ROMFieldOffsetWalkStatePointer.cast(address & ~mask);
	}

	public J9ROMFieldOffsetWalkStatePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9ROMFieldOffsetWalkState.SIZEOF;
	}

	// Implementation methods

	// IDATA backfillOffsetToUse
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_backfillOffsetToUseOffset_", declaredType="IDATA")
	public IDATA backfillOffsetToUse() throws CorruptDataException {
		return getIDATAAtOffset(J9ROMFieldOffsetWalkState._backfillOffsetToUseOffset_);
	}

	// IDATA backfillOffsetToUse
	public IDATAPointer backfillOffsetToUseEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9ROMFieldOffsetWalkState._backfillOffsetToUseOffset_));
	}

	// U32 doubleStaticsSeen
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_doubleStaticsSeenOffset_", declaredType="U32")
	public UDATA doubleStaticsSeen() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMFieldOffsetWalkState._doubleStaticsSeenOffset_));
	}

	// U32 doubleStaticsSeen
	public UDATAPointer doubleStaticsSeenEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMFieldOffsetWalkState._doubleStaticsSeenOffset_));
	}

	// U32 doublesSeen
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_doublesSeenOffset_", declaredType="U32")
	public UDATA doublesSeen() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMFieldOffsetWalkState._doublesSeenOffset_));
	}

	// U32 doublesSeen
	public UDATAPointer doublesSeenEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMFieldOffsetWalkState._doublesSeenOffset_));
	}

	// J9ROMFieldWalkState fieldWalkState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fieldWalkStateOffset_", declaredType="J9ROMFieldWalkState")
	public J9ROMFieldWalkStatePointer fieldWalkState() throws CorruptDataException {
		return J9ROMFieldWalkStatePointer.cast(nonNullFieldEA(J9ROMFieldOffsetWalkState._fieldWalkStateOffset_));
	}

	// J9ROMFieldWalkState fieldWalkState
	public PointerPointer fieldWalkStateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ROMFieldOffsetWalkState._fieldWalkStateOffset_));
	}

	// UDATA finalizeLinkOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_finalizeLinkOffsetOffset_", declaredType="UDATA")
	public UDATA finalizeLinkOffset() throws CorruptDataException {
		return getUDATAAtOffset(J9ROMFieldOffsetWalkState._finalizeLinkOffsetOffset_);
	}

	// UDATA finalizeLinkOffset
	public UDATAPointer finalizeLinkOffsetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMFieldOffsetWalkState._finalizeLinkOffsetOffset_));
	}

	// UDATA firstDoubleOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_firstDoubleOffsetOffset_", declaredType="UDATA")
	public UDATA firstDoubleOffset() throws CorruptDataException {
		return getUDATAAtOffset(J9ROMFieldOffsetWalkState._firstDoubleOffsetOffset_);
	}

	// UDATA firstDoubleOffset
	public UDATAPointer firstDoubleOffsetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMFieldOffsetWalkState._firstDoubleOffsetOffset_));
	}

	// UDATA firstObjectOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_firstObjectOffsetOffset_", declaredType="UDATA")
	public UDATA firstObjectOffset() throws CorruptDataException {
		return getUDATAAtOffset(J9ROMFieldOffsetWalkState._firstObjectOffsetOffset_);
	}

	// UDATA firstObjectOffset
	public UDATAPointer firstObjectOffsetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMFieldOffsetWalkState._firstObjectOffsetOffset_));
	}

	// UDATA firstSingleOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_firstSingleOffsetOffset_", declaredType="UDATA")
	public UDATA firstSingleOffset() throws CorruptDataException {
		return getUDATAAtOffset(J9ROMFieldOffsetWalkState._firstSingleOffsetOffset_);
	}

	// UDATA firstSingleOffset
	public UDATAPointer firstSingleOffsetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMFieldOffsetWalkState._firstSingleOffsetOffset_));
	}

	// J9HiddenInstanceField hiddenFinalizeLinkField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hiddenFinalizeLinkFieldOffset_", declaredType="J9HiddenInstanceField")
	public J9HiddenInstanceFieldPointer hiddenFinalizeLinkField() throws CorruptDataException {
		return J9HiddenInstanceFieldPointer.cast(nonNullFieldEA(J9ROMFieldOffsetWalkState._hiddenFinalizeLinkFieldOffset_));
	}

	// J9HiddenInstanceField hiddenFinalizeLinkField
	public PointerPointer hiddenFinalizeLinkFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ROMFieldOffsetWalkState._hiddenFinalizeLinkFieldOffset_));
	}

	// UDATA hiddenInstanceFieldCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hiddenInstanceFieldCountOffset_", declaredType="UDATA")
	public UDATA hiddenInstanceFieldCount() throws CorruptDataException {
		return getUDATAAtOffset(J9ROMFieldOffsetWalkState._hiddenInstanceFieldCountOffset_);
	}

	// UDATA hiddenInstanceFieldCount
	public UDATAPointer hiddenInstanceFieldCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMFieldOffsetWalkState._hiddenInstanceFieldCountOffset_));
	}

	// UDATA hiddenInstanceFieldWalkIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hiddenInstanceFieldWalkIndexOffset_", declaredType="UDATA")
	public UDATA hiddenInstanceFieldWalkIndex() throws CorruptDataException {
		return getUDATAAtOffset(J9ROMFieldOffsetWalkState._hiddenInstanceFieldWalkIndexOffset_);
	}

	// UDATA hiddenInstanceFieldWalkIndex
	public UDATAPointer hiddenInstanceFieldWalkIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMFieldOffsetWalkState._hiddenInstanceFieldWalkIndexOffset_));
	}

	// J9HiddenInstanceField*[] hiddenInstanceFields
	public PointerPointer hiddenInstanceFieldsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ROMFieldOffsetWalkState._hiddenInstanceFieldsOffset_));
	}

	// J9HiddenInstanceField hiddenLockwordField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hiddenLockwordFieldOffset_", declaredType="J9HiddenInstanceField")
	public J9HiddenInstanceFieldPointer hiddenLockwordField() throws CorruptDataException {
		return J9HiddenInstanceFieldPointer.cast(nonNullFieldEA(J9ROMFieldOffsetWalkState._hiddenLockwordFieldOffset_));
	}

	// J9HiddenInstanceField hiddenLockwordField
	public PointerPointer hiddenLockwordFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ROMFieldOffsetWalkState._hiddenLockwordFieldOffset_));
	}

	// UDATA lockOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lockOffsetOffset_", declaredType="UDATA")
	public UDATA lockOffset() throws CorruptDataException {
		return getUDATAAtOffset(J9ROMFieldOffsetWalkState._lockOffsetOffset_);
	}

	// UDATA lockOffset
	public UDATAPointer lockOffsetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMFieldOffsetWalkState._lockOffsetOffset_));
	}

	// U32 objectStaticsSeen
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_objectStaticsSeenOffset_", declaredType="U32")
	public UDATA objectStaticsSeen() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMFieldOffsetWalkState._objectStaticsSeenOffset_));
	}

	// U32 objectStaticsSeen
	public UDATAPointer objectStaticsSeenEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMFieldOffsetWalkState._objectStaticsSeenOffset_));
	}

	// U32 objectsSeen
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_objectsSeenOffset_", declaredType="U32")
	public UDATA objectsSeen() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMFieldOffsetWalkState._objectsSeenOffset_));
	}

	// U32 objectsSeen
	public UDATAPointer objectsSeenEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMFieldOffsetWalkState._objectsSeenOffset_));
	}

	// J9ROMFieldOffsetWalkResult result
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resultOffset_", declaredType="J9ROMFieldOffsetWalkResult")
	public J9ROMFieldOffsetWalkResultPointer result() throws CorruptDataException {
		return J9ROMFieldOffsetWalkResultPointer.cast(nonNullFieldEA(J9ROMFieldOffsetWalkState._resultOffset_));
	}

	// J9ROMFieldOffsetWalkResult result
	public PointerPointer resultEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ROMFieldOffsetWalkState._resultOffset_));
	}

	// J9ROMClass* romClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romClassOffset_", declaredType="J9ROMClass*")
	public J9ROMClassPointer romClass() throws CorruptDataException {
		return J9ROMClassPointer.cast(getPointerAtOffset(J9ROMFieldOffsetWalkState._romClassOffset_));
	}

	// J9ROMClass* romClass
	public PointerPointer romClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ROMFieldOffsetWalkState._romClassOffset_));
	}

	// U32 singleStaticsSeen
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_singleStaticsSeenOffset_", declaredType="U32")
	public UDATA singleStaticsSeen() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMFieldOffsetWalkState._singleStaticsSeenOffset_));
	}

	// U32 singleStaticsSeen
	public UDATAPointer singleStaticsSeenEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMFieldOffsetWalkState._singleStaticsSeenOffset_));
	}

	// U32 singlesSeen
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_singlesSeenOffset_", declaredType="U32")
	public UDATA singlesSeen() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMFieldOffsetWalkState._singlesSeenOffset_));
	}

	// U32 singlesSeen
	public UDATAPointer singlesSeenEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMFieldOffsetWalkState._singlesSeenOffset_));
	}

	// J9JavaVM* vm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer vm() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(J9ROMFieldOffsetWalkState._vmOffset_));
	}

	// J9JavaVM* vm
	public PointerPointer vmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ROMFieldOffsetWalkState._vmOffset_));
	}

	// U32 walkFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_walkFlagsOffset_", declaredType="U32")
	public UDATA walkFlags() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMFieldOffsetWalkState._walkFlagsOffset_));
	}

	// U32 walkFlags
	public UDATAPointer walkFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMFieldOffsetWalkState._walkFlagsOffset_));
	}

}
