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
 * Structure: ObjectFieldInfoPointer
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
 * The generated code will provide getters for all elements in the ObjectFieldInfoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=ObjectFieldInfo.class)
public class ObjectFieldInfoPointer extends StructurePointer {

	// NULL
	public static final ObjectFieldInfoPointer NULL = new ObjectFieldInfoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected ObjectFieldInfoPointer(long address) {
		super(address);
	}

	public static ObjectFieldInfoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static ObjectFieldInfoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static ObjectFieldInfoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new ObjectFieldInfoPointer(address);
	}

	public ObjectFieldInfoPointer add(long count) {
		return ObjectFieldInfoPointer.cast(address + (ObjectFieldInfo.SIZEOF * count));
	}

	public ObjectFieldInfoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public ObjectFieldInfoPointer addOffset(long offset) {
		return ObjectFieldInfoPointer.cast(address + offset);
	}

	public ObjectFieldInfoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public ObjectFieldInfoPointer sub(long count) {
		return ObjectFieldInfoPointer.cast(address - (ObjectFieldInfo.SIZEOF * count));
	}

	public ObjectFieldInfoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public ObjectFieldInfoPointer subOffset(long offset) {
		return ObjectFieldInfoPointer.cast(address - offset);
	}

	public ObjectFieldInfoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public ObjectFieldInfoPointer untag(long mask) {
		return ObjectFieldInfoPointer.cast(address & ~mask);
	}

	public ObjectFieldInfoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return ObjectFieldInfo.SIZEOF;
	}

	// Implementation methods

	// U32 _cacheLineSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cacheLineSizeOffset_", declaredType="U32")
	public UDATA _cacheLineSize() throws CorruptDataException {
		return new U32(getIntAtOffset(ObjectFieldInfo.__cacheLineSizeOffset_));
	}

	// U32 _cacheLineSize
	public UDATAPointer _cacheLineSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ObjectFieldInfo.__cacheLineSizeOffset_));
	}

	// U32 _contendedDoubleCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__contendedDoubleCountOffset_", declaredType="U32")
	public UDATA _contendedDoubleCount() throws CorruptDataException {
		return new U32(getIntAtOffset(ObjectFieldInfo.__contendedDoubleCountOffset_));
	}

	// U32 _contendedDoubleCount
	public UDATAPointer _contendedDoubleCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ObjectFieldInfo.__contendedDoubleCountOffset_));
	}

	// U32 _contendedObjectCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__contendedObjectCountOffset_", declaredType="U32")
	public UDATA _contendedObjectCount() throws CorruptDataException {
		return new U32(getIntAtOffset(ObjectFieldInfo.__contendedObjectCountOffset_));
	}

	// U32 _contendedObjectCount
	public UDATAPointer _contendedObjectCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ObjectFieldInfo.__contendedObjectCountOffset_));
	}

	// U32 _contendedSingleCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__contendedSingleCountOffset_", declaredType="U32")
	public UDATA _contendedSingleCount() throws CorruptDataException {
		return new U32(getIntAtOffset(ObjectFieldInfo.__contendedSingleCountOffset_));
	}

	// U32 _contendedSingleCount
	public UDATAPointer _contendedSingleCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ObjectFieldInfo.__contendedSingleCountOffset_));
	}

	// U32 _hiddenFieldCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__hiddenFieldCountOffset_", declaredType="U32")
	public UDATA _hiddenFieldCount() throws CorruptDataException {
		return new U32(getIntAtOffset(ObjectFieldInfo.__hiddenFieldCountOffset_));
	}

	// U32 _hiddenFieldCount
	public UDATAPointer _hiddenFieldCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ObjectFieldInfo.__hiddenFieldCountOffset_));
	}

	// bool _hiddenFieldOffsetResolutionRequired
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__hiddenFieldOffsetResolutionRequiredOffset_", declaredType="bool")
	public boolean _hiddenFieldOffsetResolutionRequired() throws CorruptDataException {
		return getBoolAtOffset(ObjectFieldInfo.__hiddenFieldOffsetResolutionRequiredOffset_);
	}

	// bool _hiddenFieldOffsetResolutionRequired
	public BoolPointer _hiddenFieldOffsetResolutionRequiredEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ObjectFieldInfo.__hiddenFieldOffsetResolutionRequiredOffset_));
	}

	// U32 _instanceDoubleCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__instanceDoubleCountOffset_", declaredType="U32")
	public UDATA _instanceDoubleCount() throws CorruptDataException {
		return new U32(getIntAtOffset(ObjectFieldInfo.__instanceDoubleCountOffset_));
	}

	// U32 _instanceDoubleCount
	public UDATAPointer _instanceDoubleCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ObjectFieldInfo.__instanceDoubleCountOffset_));
	}

	// bool _instanceFieldBackfillEligible
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__instanceFieldBackfillEligibleOffset_", declaredType="bool")
	public boolean _instanceFieldBackfillEligible() throws CorruptDataException {
		return getBoolAtOffset(ObjectFieldInfo.__instanceFieldBackfillEligibleOffset_);
	}

	// bool _instanceFieldBackfillEligible
	public BoolPointer _instanceFieldBackfillEligibleEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ObjectFieldInfo.__instanceFieldBackfillEligibleOffset_));
	}

	// U32 _instanceObjectCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__instanceObjectCountOffset_", declaredType="U32")
	public UDATA _instanceObjectCount() throws CorruptDataException {
		return new U32(getIntAtOffset(ObjectFieldInfo.__instanceObjectCountOffset_));
	}

	// U32 _instanceObjectCount
	public UDATAPointer _instanceObjectCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ObjectFieldInfo.__instanceObjectCountOffset_));
	}

	// U32 _instanceSingleCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__instanceSingleCountOffset_", declaredType="U32")
	public UDATA _instanceSingleCount() throws CorruptDataException {
		return new U32(getIntAtOffset(ObjectFieldInfo.__instanceSingleCountOffset_));
	}

	// U32 _instanceSingleCount
	public UDATAPointer _instanceSingleCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ObjectFieldInfo.__instanceSingleCountOffset_));
	}

	// IDATA _myBackfillOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__myBackfillOffsetOffset_", declaredType="IDATA")
	public IDATA _myBackfillOffset() throws CorruptDataException {
		return getIDATAAtOffset(ObjectFieldInfo.__myBackfillOffsetOffset_);
	}

	// IDATA _myBackfillOffset
	public IDATAPointer _myBackfillOffsetEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(ObjectFieldInfo.__myBackfillOffsetOffset_));
	}

	// bool _objectCanUseBackfill
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__objectCanUseBackfillOffset_", declaredType="bool")
	public boolean _objectCanUseBackfill() throws CorruptDataException {
		return getBoolAtOffset(ObjectFieldInfo.__objectCanUseBackfillOffset_);
	}

	// bool _objectCanUseBackfill
	public BoolPointer _objectCanUseBackfillEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ObjectFieldInfo.__objectCanUseBackfillOffset_));
	}

	// U32 _objectHeaderSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__objectHeaderSizeOffset_", declaredType="U32")
	public UDATA _objectHeaderSize() throws CorruptDataException {
		return new U32(getIntAtOffset(ObjectFieldInfo.__objectHeaderSizeOffset_));
	}

	// U32 _objectHeaderSize
	public UDATAPointer _objectHeaderSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ObjectFieldInfo.__objectHeaderSizeOffset_));
	}

	// U32 _referenceSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__referenceSizeOffset_", declaredType="U32")
	public UDATA _referenceSize() throws CorruptDataException {
		return new U32(getIntAtOffset(ObjectFieldInfo.__referenceSizeOffset_));
	}

	// U32 _referenceSize
	public UDATAPointer _referenceSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ObjectFieldInfo.__referenceSizeOffset_));
	}

	// J9ROMClass* _romClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__romClassOffset_", declaredType="J9ROMClass*")
	public J9ROMClassPointer _romClass() throws CorruptDataException {
		return J9ROMClassPointer.cast(getPointerAtOffset(ObjectFieldInfo.__romClassOffset_));
	}

	// J9ROMClass* _romClass
	public PointerPointer _romClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ObjectFieldInfo.__romClassOffset_));
	}

	// IDATA _subclassBackfillOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__subclassBackfillOffsetOffset_", declaredType="IDATA")
	public IDATA _subclassBackfillOffset() throws CorruptDataException {
		return getIDATAAtOffset(ObjectFieldInfo.__subclassBackfillOffsetOffset_);
	}

	// IDATA _subclassBackfillOffset
	public IDATAPointer _subclassBackfillOffsetEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(ObjectFieldInfo.__subclassBackfillOffsetOffset_));
	}

	// IDATA _superclassBackfillOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__superclassBackfillOffsetOffset_", declaredType="IDATA")
	public IDATA _superclassBackfillOffset() throws CorruptDataException {
		return getIDATAAtOffset(ObjectFieldInfo.__superclassBackfillOffsetOffset_);
	}

	// IDATA _superclassBackfillOffset
	public IDATAPointer _superclassBackfillOffsetEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(ObjectFieldInfo.__superclassBackfillOffsetOffset_));
	}

	// U32 _superclassFieldsSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__superclassFieldsSizeOffset_", declaredType="U32")
	public UDATA _superclassFieldsSize() throws CorruptDataException {
		return new U32(getIntAtOffset(ObjectFieldInfo.__superclassFieldsSizeOffset_));
	}

	// U32 _superclassFieldsSize
	public UDATAPointer _superclassFieldsSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ObjectFieldInfo.__superclassFieldsSizeOffset_));
	}

	// U32 _totalDoubleCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalDoubleCountOffset_", declaredType="U32")
	public UDATA _totalDoubleCount() throws CorruptDataException {
		return new U32(getIntAtOffset(ObjectFieldInfo.__totalDoubleCountOffset_));
	}

	// U32 _totalDoubleCount
	public UDATAPointer _totalDoubleCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ObjectFieldInfo.__totalDoubleCountOffset_));
	}

	// U32 _totalObjectCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalObjectCountOffset_", declaredType="U32")
	public UDATA _totalObjectCount() throws CorruptDataException {
		return new U32(getIntAtOffset(ObjectFieldInfo.__totalObjectCountOffset_));
	}

	// U32 _totalObjectCount
	public UDATAPointer _totalObjectCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ObjectFieldInfo.__totalObjectCountOffset_));
	}

	// U32 _totalSingleCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalSingleCountOffset_", declaredType="U32")
	public UDATA _totalSingleCount() throws CorruptDataException {
		return new U32(getIntAtOffset(ObjectFieldInfo.__totalSingleCountOffset_));
	}

	// U32 _totalSingleCount
	public UDATAPointer _totalSingleCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ObjectFieldInfo.__totalSingleCountOffset_));
	}

	// bool _useContendedClassLayout
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__useContendedClassLayoutOffset_", declaredType="bool")
	public boolean _useContendedClassLayout() throws CorruptDataException {
		return getBoolAtOffset(ObjectFieldInfo.__useContendedClassLayoutOffset_);
	}

	// bool _useContendedClassLayout
	public BoolPointer _useContendedClassLayoutEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ObjectFieldInfo.__useContendedClassLayoutOffset_));
	}

}
