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
 * Structure: MM_VerboseEventHeapResizePointer
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
 * The generated code will provide getters for all elements in the MM_VerboseEventHeapResizePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_VerboseEventHeapResize.class)
public class MM_VerboseEventHeapResizePointer extends MM_VerboseEventPointer {

	// NULL
	public static final MM_VerboseEventHeapResizePointer NULL = new MM_VerboseEventHeapResizePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_VerboseEventHeapResizePointer(long address) {
		super(address);
	}

	public static MM_VerboseEventHeapResizePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_VerboseEventHeapResizePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_VerboseEventHeapResizePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_VerboseEventHeapResizePointer(address);
	}

	public MM_VerboseEventHeapResizePointer add(long count) {
		return MM_VerboseEventHeapResizePointer.cast(address + (MM_VerboseEventHeapResize.SIZEOF * count));
	}

	public MM_VerboseEventHeapResizePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_VerboseEventHeapResizePointer addOffset(long offset) {
		return MM_VerboseEventHeapResizePointer.cast(address + offset);
	}

	public MM_VerboseEventHeapResizePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_VerboseEventHeapResizePointer sub(long count) {
		return MM_VerboseEventHeapResizePointer.cast(address - (MM_VerboseEventHeapResize.SIZEOF * count));
	}

	public MM_VerboseEventHeapResizePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_VerboseEventHeapResizePointer subOffset(long offset) {
		return MM_VerboseEventHeapResizePointer.cast(address - offset);
	}

	public MM_VerboseEventHeapResizePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_VerboseEventHeapResizePointer untag(long mask) {
		return MM_VerboseEventHeapResizePointer.cast(address & ~mask);
	}

	public MM_VerboseEventHeapResizePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_VerboseEventHeapResize.SIZEOF;
	}

	// Implementation methods

	// UDATA _amount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__amountOffset_", declaredType="UDATA")
	public UDATA _amount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventHeapResize.__amountOffset_);
	}

	// UDATA _amount
	public UDATAPointer _amountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventHeapResize.__amountOffset_));
	}

	// bool _consumed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__consumedOffset_", declaredType="bool")
	public boolean _consumed() throws CorruptDataException {
		return getBoolAtOffset(MM_VerboseEventHeapResize.__consumedOffset_);
	}

	// bool _consumed
	public BoolPointer _consumedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_VerboseEventHeapResize.__consumedOffset_));
	}

	// UDATA _newHeapSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__newHeapSizeOffset_", declaredType="UDATA")
	public UDATA _newHeapSize() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventHeapResize.__newHeapSizeOffset_);
	}

	// UDATA _newHeapSize
	public UDATAPointer _newHeapSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventHeapResize.__newHeapSizeOffset_));
	}

	// UDATA _ratio
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__ratioOffset_", declaredType="UDATA")
	public UDATA _ratio() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventHeapResize.__ratioOffset_);
	}

	// UDATA _ratio
	public UDATAPointer _ratioEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventHeapResize.__ratioOffset_));
	}

	// UDATA _reason
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__reasonOffset_", declaredType="UDATA")
	public UDATA _reason() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventHeapResize.__reasonOffset_);
	}

	// UDATA _reason
	public UDATAPointer _reasonEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventHeapResize.__reasonOffset_));
	}

	// UDATA _resizeType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__resizeTypeOffset_", declaredType="UDATA")
	public UDATA _resizeType() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventHeapResize.__resizeTypeOffset_);
	}

	// UDATA _resizeType
	public UDATAPointer _resizeTypeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventHeapResize.__resizeTypeOffset_));
	}

	// UDATA _subSpaceType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__subSpaceTypeOffset_", declaredType="UDATA")
	public UDATA _subSpaceType() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventHeapResize.__subSpaceTypeOffset_);
	}

	// UDATA _subSpaceType
	public UDATAPointer _subSpaceTypeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventHeapResize.__subSpaceTypeOffset_));
	}

	// U64 _timeTaken
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__timeTakenOffset_", declaredType="U64")
	public UDATA _timeTaken() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseEventHeapResize.__timeTakenOffset_));
	}

	// U64 _timeTaken
	public UDATAPointer _timeTakenEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventHeapResize.__timeTakenOffset_));
	}

}
