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
 * Structure: UtDeferredConfigInfoPointer
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
 * The generated code will provide getters for all elements in the UtDeferredConfigInfoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=UtDeferredConfigInfo.class)
public class UtDeferredConfigInfoPointer extends StructurePointer {

	// NULL
	public static final UtDeferredConfigInfoPointer NULL = new UtDeferredConfigInfoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected UtDeferredConfigInfoPointer(long address) {
		super(address);
	}

	public static UtDeferredConfigInfoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static UtDeferredConfigInfoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static UtDeferredConfigInfoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new UtDeferredConfigInfoPointer(address);
	}

	public UtDeferredConfigInfoPointer add(long count) {
		return UtDeferredConfigInfoPointer.cast(address + (UtDeferredConfigInfo.SIZEOF * count));
	}

	public UtDeferredConfigInfoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public UtDeferredConfigInfoPointer addOffset(long offset) {
		return UtDeferredConfigInfoPointer.cast(address + offset);
	}

	public UtDeferredConfigInfoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public UtDeferredConfigInfoPointer sub(long count) {
		return UtDeferredConfigInfoPointer.cast(address - (UtDeferredConfigInfo.SIZEOF * count));
	}

	public UtDeferredConfigInfoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public UtDeferredConfigInfoPointer subOffset(long offset) {
		return UtDeferredConfigInfoPointer.cast(address - offset);
	}

	public UtDeferredConfigInfoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public UtDeferredConfigInfoPointer untag(long mask) {
		return UtDeferredConfigInfoPointer.cast(address & ~mask);
	}

	public UtDeferredConfigInfoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return UtDeferredConfigInfo.SIZEOF;
	}

	// Implementation methods

	// I32 all
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allOffset_", declaredType="I32")
	public IDATA all() throws CorruptDataException {
		return new I32(getIntAtOffset(UtDeferredConfigInfo._allOffset_));
	}

	// I32 all
	public IDATAPointer allEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtDeferredConfigInfo._allOffset_));
	}

	// U8* componentName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_componentNameOffset_", declaredType="U8*")
	public U8Pointer componentName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(UtDeferredConfigInfo._componentNameOffset_));
	}

	// U8* componentName
	public PointerPointer componentNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtDeferredConfigInfo._componentNameOffset_));
	}

	// I32 firstTracePoint
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_firstTracePointOffset_", declaredType="I32")
	public IDATA firstTracePoint() throws CorruptDataException {
		return new I32(getIntAtOffset(UtDeferredConfigInfo._firstTracePointOffset_));
	}

	// I32 firstTracePoint
	public IDATAPointer firstTracePointEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtDeferredConfigInfo._firstTracePointOffset_));
	}

	// U8* groupName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_groupNameOffset_", declaredType="U8*")
	public U8Pointer groupName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(UtDeferredConfigInfo._groupNameOffset_));
	}

	// U8* groupName
	public PointerPointer groupNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtDeferredConfigInfo._groupNameOffset_));
	}

	// I32 lastTracePoint
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastTracePointOffset_", declaredType="I32")
	public IDATA lastTracePoint() throws CorruptDataException {
		return new I32(getIntAtOffset(UtDeferredConfigInfo._lastTracePointOffset_));
	}

	// I32 lastTracePoint
	public IDATAPointer lastTracePointEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtDeferredConfigInfo._lastTracePointOffset_));
	}

	// I32 level
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_levelOffset_", declaredType="I32")
	public IDATA level() throws CorruptDataException {
		return new I32(getIntAtOffset(UtDeferredConfigInfo._levelOffset_));
	}

	// I32 level
	public IDATAPointer levelEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtDeferredConfigInfo._levelOffset_));
	}

	// UtDeferredConfigInfo* next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextOffset_", declaredType="UtDeferredConfigInfo*")
	public UtDeferredConfigInfoPointer next() throws CorruptDataException {
		return UtDeferredConfigInfoPointer.cast(getPointerAtOffset(UtDeferredConfigInfo._nextOffset_));
	}

	// UtDeferredConfigInfo* next
	public PointerPointer nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtDeferredConfigInfo._nextOffset_));
	}

	// I32 setActive
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_setActiveOffset_", declaredType="I32")
	public IDATA setActive() throws CorruptDataException {
		return new I32(getIntAtOffset(UtDeferredConfigInfo._setActiveOffset_));
	}

	// I32 setActive
	public IDATAPointer setActiveEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtDeferredConfigInfo._setActiveOffset_));
	}

	// U8 value
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_valueOffset_", declaredType="U8")
	public U8 value() throws CorruptDataException {
		return new U8(getByteAtOffset(UtDeferredConfigInfo._valueOffset_));
	}

	// U8 value
	public U8Pointer valueEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(UtDeferredConfigInfo._valueOffset_));
	}

}
