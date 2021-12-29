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
 * Structure: ClassFileOraclePointer
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
 * The generated code will provide getters for all elements in the ClassFileOraclePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=ClassFileOracle.class)
public class ClassFileOraclePointer extends StructurePointer {

	// NULL
	public static final ClassFileOraclePointer NULL = new ClassFileOraclePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected ClassFileOraclePointer(long address) {
		super(address);
	}

	public static ClassFileOraclePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static ClassFileOraclePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static ClassFileOraclePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new ClassFileOraclePointer(address);
	}

	public ClassFileOraclePointer add(long count) {
		return ClassFileOraclePointer.cast(address + (ClassFileOracle.SIZEOF * count));
	}

	public ClassFileOraclePointer add(Scalar count) {
		return add(count.longValue());
	}

	public ClassFileOraclePointer addOffset(long offset) {
		return ClassFileOraclePointer.cast(address + offset);
	}

	public ClassFileOraclePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public ClassFileOraclePointer sub(long count) {
		return ClassFileOraclePointer.cast(address - (ClassFileOracle.SIZEOF * count));
	}

	public ClassFileOraclePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public ClassFileOraclePointer subOffset(long offset) {
		return ClassFileOraclePointer.cast(address - offset);
	}

	public ClassFileOraclePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public ClassFileOraclePointer untag(long mask) {
		return ClassFileOraclePointer.cast(address & ~mask);
	}

	public ClassFileOraclePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return ClassFileOracle.SIZEOF;
	}

	// Implementation methods

	// bool _annotationRefersDoubleSlotEntry
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__annotationRefersDoubleSlotEntryOffset_", declaredType="bool")
	public boolean _annotationRefersDoubleSlotEntry() throws CorruptDataException {
		return getBoolAtOffset(ClassFileOracle.__annotationRefersDoubleSlotEntryOffset_);
	}

	// bool _annotationRefersDoubleSlotEntry
	public BoolPointer _annotationRefersDoubleSlotEntryEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ClassFileOracle.__annotationRefersDoubleSlotEntryOffset_));
	}

	// J9CfrAttributeRuntimeVisibleAnnotations* _annotationsAttribute
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__annotationsAttributeOffset_", declaredType="J9CfrAttributeRuntimeVisibleAnnotations*")
	public J9CfrAttributeRuntimeVisibleAnnotationsPointer _annotationsAttribute() throws CorruptDataException {
		return J9CfrAttributeRuntimeVisibleAnnotationsPointer.cast(getPointerAtOffset(ClassFileOracle.__annotationsAttributeOffset_));
	}

	// J9CfrAttributeRuntimeVisibleAnnotations* _annotationsAttribute
	public PointerPointer _annotationsAttributeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle.__annotationsAttributeOffset_));
	}

	// UDATA _bctFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bctFlagsOffset_", declaredType="UDATA")
	public UDATA _bctFlags() throws CorruptDataException {
		return getUDATAAtOffset(ClassFileOracle.__bctFlagsOffset_);
	}

	// UDATA _bctFlags
	public UDATAPointer _bctFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ClassFileOracle.__bctFlagsOffset_));
	}

	// J9CfrAttributeBootstrapMethods* _bootstrapMethodsAttribute
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bootstrapMethodsAttributeOffset_", declaredType="J9CfrAttributeBootstrapMethods*")
	public J9CfrAttributeBootstrapMethodsPointer _bootstrapMethodsAttribute() throws CorruptDataException {
		return J9CfrAttributeBootstrapMethodsPointer.cast(getPointerAtOffset(ClassFileOracle.__bootstrapMethodsAttributeOffset_));
	}

	// J9CfrAttributeBootstrapMethods* _bootstrapMethodsAttribute
	public PointerPointer _bootstrapMethodsAttributeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle.__bootstrapMethodsAttributeOffset_));
	}

	// BufferManager* _bufferManager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bufferManagerOffset_", declaredType="BufferManager*")
	public BufferManagerPointer _bufferManager() throws CorruptDataException {
		return BufferManagerPointer.cast(getPointerAtOffset(ClassFileOracle.__bufferManagerOffset_));
	}

	// BufferManager* _bufferManager
	public PointerPointer _bufferManagerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle.__bufferManagerOffset_));
	}

	// BuildResult _buildResult
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__buildResultOffset_", declaredType="BuildResult")
	public long _buildResult() throws CorruptDataException {
		if (BuildResult.SIZEOF == 1) {
			return getByteAtOffset(ClassFileOracle.__buildResultOffset_);
		} else if (BuildResult.SIZEOF == 2) {
			return getShortAtOffset(ClassFileOracle.__buildResultOffset_);
		} else if (BuildResult.SIZEOF == 4) {
			return getIntAtOffset(ClassFileOracle.__buildResultOffset_);
		} else if (BuildResult.SIZEOF == 8) {
			return getLongAtOffset(ClassFileOracle.__buildResultOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// BuildResult _buildResult
	public EnumPointer _buildResultEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(ClassFileOracle.__buildResultOffset_), BuildResult.class);
	}

	// J9CfrClassFile* _classFile
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classFileOffset_", declaredType="J9CfrClassFile*")
	public J9CfrClassFilePointer _classFile() throws CorruptDataException {
		return J9CfrClassFilePointer.cast(getPointerAtOffset(ClassFileOracle.__classFileOffset_));
	}

	// J9CfrClassFile* _classFile
	public PointerPointer _classFileEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle.__classFileOffset_));
	}

	// ConstantPoolMap* _constantPoolMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__constantPoolMapOffset_", declaredType="ConstantPoolMap*")
	public ConstantPoolMapPointer _constantPoolMap() throws CorruptDataException {
		return ConstantPoolMapPointer.cast(getPointerAtOffset(ClassFileOracle.__constantPoolMapOffset_));
	}

	// ConstantPoolMap* _constantPoolMap
	public PointerPointer _constantPoolMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle.__constantPoolMapOffset_));
	}

	// ROMClassCreationContext* _context
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__contextOffset_", declaredType="ROMClassCreationContext*")
	public ROMClassCreationContextPointer _context() throws CorruptDataException {
		return ROMClassCreationContextPointer.cast(getPointerAtOffset(ClassFileOracle.__contextOffset_));
	}

	// ROMClassCreationContext* _context
	public PointerPointer _contextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle.__contextOffset_));
	}

	// U16 _doubleScalarStaticCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__doubleScalarStaticCountOffset_", declaredType="U16")
	public U16 _doubleScalarStaticCount() throws CorruptDataException {
		return new U16(getShortAtOffset(ClassFileOracle.__doubleScalarStaticCountOffset_));
	}

	// U16 _doubleScalarStaticCount
	public U16Pointer _doubleScalarStaticCountEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ClassFileOracle.__doubleScalarStaticCountOffset_));
	}

	// J9CfrAttributeEnclosingMethod* _enclosingMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__enclosingMethodOffset_", declaredType="J9CfrAttributeEnclosingMethod*")
	public J9CfrAttributeEnclosingMethodPointer _enclosingMethod() throws CorruptDataException {
		return J9CfrAttributeEnclosingMethodPointer.cast(getPointerAtOffset(ClassFileOracle.__enclosingMethodOffset_));
	}

	// J9CfrAttributeEnclosingMethod* _enclosingMethod
	public PointerPointer _enclosingMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle.__enclosingMethodOffset_));
	}

	// ClassFileOracle$FieldInfo* _fieldsInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__fieldsInfoOffset_", declaredType="ClassFileOracle$FieldInfo*")
	public ClassFileOracle$FieldInfoPointer _fieldsInfo() throws CorruptDataException {
		return ClassFileOracle$FieldInfoPointer.cast(getPointerAtOffset(ClassFileOracle.__fieldsInfoOffset_));
	}

	// ClassFileOracle$FieldInfo* _fieldsInfo
	public PointerPointer _fieldsInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle.__fieldsInfoOffset_));
	}

	// J9CfrAttributeSignature* _genericSignature
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__genericSignatureOffset_", declaredType="J9CfrAttributeSignature*")
	public J9CfrAttributeSignaturePointer _genericSignature() throws CorruptDataException {
		return J9CfrAttributeSignaturePointer.cast(getPointerAtOffset(ClassFileOracle.__genericSignatureOffset_));
	}

	// J9CfrAttributeSignature* _genericSignature
	public PointerPointer _genericSignatureEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle.__genericSignatureOffset_));
	}

	// bool _hasClinit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__hasClinitOffset_", declaredType="bool")
	public boolean _hasClinit() throws CorruptDataException {
		return getBoolAtOffset(ClassFileOracle.__hasClinitOffset_);
	}

	// bool _hasClinit
	public BoolPointer _hasClinitEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ClassFileOracle.__hasClinitOffset_));
	}

	// bool _hasEmptyFinalizeMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__hasEmptyFinalizeMethodOffset_", declaredType="bool")
	public boolean _hasEmptyFinalizeMethod() throws CorruptDataException {
		return getBoolAtOffset(ClassFileOracle.__hasEmptyFinalizeMethodOffset_);
	}

	// bool _hasEmptyFinalizeMethod
	public BoolPointer _hasEmptyFinalizeMethodEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ClassFileOracle.__hasEmptyFinalizeMethodOffset_));
	}

	// bool _hasFinalFields
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__hasFinalFieldsOffset_", declaredType="bool")
	public boolean _hasFinalFields() throws CorruptDataException {
		return getBoolAtOffset(ClassFileOracle.__hasFinalFieldsOffset_);
	}

	// bool _hasFinalFields
	public BoolPointer _hasFinalFieldsEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ClassFileOracle.__hasFinalFieldsOffset_));
	}

	// bool _hasFinalizeMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__hasFinalizeMethodOffset_", declaredType="bool")
	public boolean _hasFinalizeMethod() throws CorruptDataException {
		return getBoolAtOffset(ClassFileOracle.__hasFinalizeMethodOffset_);
	}

	// bool _hasFinalizeMethod
	public BoolPointer _hasFinalizeMethodEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ClassFileOracle.__hasFinalizeMethodOffset_));
	}

	// bool _hasFrameIteratorSkipAnnotation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__hasFrameIteratorSkipAnnotationOffset_", declaredType="bool")
	public boolean _hasFrameIteratorSkipAnnotation() throws CorruptDataException {
		return getBoolAtOffset(ClassFileOracle.__hasFrameIteratorSkipAnnotationOffset_);
	}

	// bool _hasFrameIteratorSkipAnnotation
	public BoolPointer _hasFrameIteratorSkipAnnotationEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ClassFileOracle.__hasFrameIteratorSkipAnnotationOffset_));
	}

	// bool _hasNonStaticNonAbstractMethods
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__hasNonStaticNonAbstractMethodsOffset_", declaredType="bool")
	public boolean _hasNonStaticNonAbstractMethods() throws CorruptDataException {
		return getBoolAtOffset(ClassFileOracle.__hasNonStaticNonAbstractMethodsOffset_);
	}

	// bool _hasNonStaticNonAbstractMethods
	public BoolPointer _hasNonStaticNonAbstractMethodsEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ClassFileOracle.__hasNonStaticNonAbstractMethodsOffset_));
	}

	// bool _hasVerifyExcludeAttribute
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__hasVerifyExcludeAttributeOffset_", declaredType="bool")
	public boolean _hasVerifyExcludeAttribute() throws CorruptDataException {
		return getBoolAtOffset(ClassFileOracle.__hasVerifyExcludeAttributeOffset_);
	}

	// bool _hasVerifyExcludeAttribute
	public BoolPointer _hasVerifyExcludeAttributeEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ClassFileOracle.__hasVerifyExcludeAttributeOffset_));
	}

	// U16 _innerClassCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__innerClassCountOffset_", declaredType="U16")
	public U16 _innerClassCount() throws CorruptDataException {
		return new U16(getShortAtOffset(ClassFileOracle.__innerClassCountOffset_));
	}

	// U16 _innerClassCount
	public U16Pointer _innerClassCountEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ClassFileOracle.__innerClassCountOffset_));
	}

	// J9CfrAttributeInnerClasses* _innerClasses
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__innerClassesOffset_", declaredType="J9CfrAttributeInnerClasses*")
	public J9CfrAttributeInnerClassesPointer _innerClasses() throws CorruptDataException {
		return J9CfrAttributeInnerClassesPointer.cast(getPointerAtOffset(ClassFileOracle.__innerClassesOffset_));
	}

	// J9CfrAttributeInnerClasses* _innerClasses
	public PointerPointer _innerClassesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle.__innerClassesOffset_));
	}

	// bool _isClassContended
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isClassContendedOffset_", declaredType="bool")
	public boolean _isClassContended() throws CorruptDataException {
		return getBoolAtOffset(ClassFileOracle.__isClassContendedOffset_);
	}

	// bool _isClassContended
	public BoolPointer _isClassContendedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ClassFileOracle.__isClassContendedOffset_));
	}

	// bool _isClassUnmodifiable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isClassUnmodifiableOffset_", declaredType="bool")
	public boolean _isClassUnmodifiable() throws CorruptDataException {
		return getBoolAtOffset(ClassFileOracle.__isClassUnmodifiableOffset_);
	}

	// bool _isClassUnmodifiable
	public BoolPointer _isClassUnmodifiableEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ClassFileOracle.__isClassUnmodifiableOffset_));
	}

	// bool _isClassValueBased
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isClassValueBasedOffset_", declaredType="bool")
	public boolean _isClassValueBased() throws CorruptDataException {
		return getBoolAtOffset(ClassFileOracle.__isClassValueBasedOffset_);
	}

	// bool _isClassValueBased
	public BoolPointer _isClassValueBasedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ClassFileOracle.__isClassValueBasedOffset_));
	}

	// bool _isCloneable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isCloneableOffset_", declaredType="bool")
	public boolean _isCloneable() throws CorruptDataException {
		return getBoolAtOffset(ClassFileOracle.__isCloneableOffset_);
	}

	// bool _isCloneable
	public BoolPointer _isCloneableEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ClassFileOracle.__isCloneableOffset_));
	}

	// bool _isInnerClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isInnerClassOffset_", declaredType="bool")
	public boolean _isInnerClass() throws CorruptDataException {
		return getBoolAtOffset(ClassFileOracle.__isInnerClassOffset_);
	}

	// bool _isInnerClass
	public BoolPointer _isInnerClassEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ClassFileOracle.__isInnerClassOffset_));
	}

	// bool _isRecord
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isRecordOffset_", declaredType="bool")
	public boolean _isRecord() throws CorruptDataException {
		return getBoolAtOffset(ClassFileOracle.__isRecordOffset_);
	}

	// bool _isRecord
	public BoolPointer _isRecordEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ClassFileOracle.__isRecordOffset_));
	}

	// bool _isSealed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isSealedOffset_", declaredType="bool")
	public boolean _isSealed() throws CorruptDataException {
		return getBoolAtOffset(ClassFileOracle.__isSealedOffset_);
	}

	// bool _isSealed
	public BoolPointer _isSealedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ClassFileOracle.__isSealedOffset_));
	}

	// bool _isSerializable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isSerializableOffset_", declaredType="bool")
	public boolean _isSerializable() throws CorruptDataException {
		return getBoolAtOffset(ClassFileOracle.__isSerializableOffset_);
	}

	// bool _isSerializable
	public BoolPointer _isSerializableEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ClassFileOracle.__isSerializableOffset_));
	}

	// bool _isSynthetic
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isSyntheticOffset_", declaredType="bool")
	public boolean _isSynthetic() throws CorruptDataException {
		return getBoolAtOffset(ClassFileOracle.__isSyntheticOffset_);
	}

	// bool _isSynthetic
	public BoolPointer _isSyntheticEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ClassFileOracle.__isSyntheticOffset_));
	}

	// U32 _maxBranchCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxBranchCountOffset_", declaredType="U32")
	public UDATA _maxBranchCount() throws CorruptDataException {
		return new U32(getIntAtOffset(ClassFileOracle.__maxBranchCountOffset_));
	}

	// U32 _maxBranchCount
	public UDATAPointer _maxBranchCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ClassFileOracle.__maxBranchCountOffset_));
	}

	// U16 _memberAccessFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__memberAccessFlagsOffset_", declaredType="U16")
	public U16 _memberAccessFlags() throws CorruptDataException {
		return new U16(getShortAtOffset(ClassFileOracle.__memberAccessFlagsOffset_));
	}

	// U16 _memberAccessFlags
	public U16Pointer _memberAccessFlagsEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ClassFileOracle.__memberAccessFlagsOffset_));
	}

	// ClassFileOracle$MethodInfo* _methodsInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__methodsInfoOffset_", declaredType="ClassFileOracle$MethodInfo*")
	public ClassFileOracle$MethodInfoPointer _methodsInfo() throws CorruptDataException {
		return ClassFileOracle$MethodInfoPointer.cast(getPointerAtOffset(ClassFileOracle.__methodsInfoOffset_));
	}

	// ClassFileOracle$MethodInfo* _methodsInfo
	public PointerPointer _methodsInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle.__methodsInfoOffset_));
	}

	// bool _needsStaticConstantInit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__needsStaticConstantInitOffset_", declaredType="bool")
	public boolean _needsStaticConstantInit() throws CorruptDataException {
		return getBoolAtOffset(ClassFileOracle.__needsStaticConstantInitOffset_);
	}

	// bool _needsStaticConstantInit
	public BoolPointer _needsStaticConstantInitEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ClassFileOracle.__needsStaticConstantInitOffset_));
	}

	// U16 _nestHost
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nestHostOffset_", declaredType="U16")
	public U16 _nestHost() throws CorruptDataException {
		return new U16(getShortAtOffset(ClassFileOracle.__nestHostOffset_));
	}

	// U16 _nestHost
	public U16Pointer _nestHostEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ClassFileOracle.__nestHostOffset_));
	}

	// J9CfrAttributeNestMembers* _nestMembers
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nestMembersOffset_", declaredType="J9CfrAttributeNestMembers*")
	public J9CfrAttributeNestMembersPointer _nestMembers() throws CorruptDataException {
		return J9CfrAttributeNestMembersPointer.cast(getPointerAtOffset(ClassFileOracle.__nestMembersOffset_));
	}

	// J9CfrAttributeNestMembers* _nestMembers
	public PointerPointer _nestMembersEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle.__nestMembersOffset_));
	}

	// U16 _nestMembersCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nestMembersCountOffset_", declaredType="U16")
	public U16 _nestMembersCount() throws CorruptDataException {
		return new U16(getShortAtOffset(ClassFileOracle.__nestMembersCountOffset_));
	}

	// U16 _nestMembersCount
	public U16Pointer _nestMembersCountEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ClassFileOracle.__nestMembersCountOffset_));
	}

	// U16 _objectStaticCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__objectStaticCountOffset_", declaredType="U16")
	public U16 _objectStaticCount() throws CorruptDataException {
		return new U16(getShortAtOffset(ClassFileOracle.__objectStaticCountOffset_));
	}

	// U16 _objectStaticCount
	public U16Pointer _objectStaticCountEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ClassFileOracle.__objectStaticCountOffset_));
	}

	// U16 _outerClassNameIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__outerClassNameIndexOffset_", declaredType="U16")
	public U16 _outerClassNameIndex() throws CorruptDataException {
		return new U16(getShortAtOffset(ClassFileOracle.__outerClassNameIndexOffset_));
	}

	// U16 _outerClassNameIndex
	public U16Pointer _outerClassNameIndexEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ClassFileOracle.__outerClassNameIndexOffset_));
	}

	// J9CfrAttributePermittedSubclasses* _permittedSubclassesAttribute
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__permittedSubclassesAttributeOffset_", declaredType="J9CfrAttributePermittedSubclasses*")
	public J9CfrAttributePermittedSubclassesPointer _permittedSubclassesAttribute() throws CorruptDataException {
		return J9CfrAttributePermittedSubclassesPointer.cast(getPointerAtOffset(ClassFileOracle.__permittedSubclassesAttributeOffset_));
	}

	// J9CfrAttributePermittedSubclasses* _permittedSubclassesAttribute
	public PointerPointer _permittedSubclassesAttributeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle.__permittedSubclassesAttributeOffset_));
	}

	// U16 _recordComponentCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__recordComponentCountOffset_", declaredType="U16")
	public U16 _recordComponentCount() throws CorruptDataException {
		return new U16(getShortAtOffset(ClassFileOracle.__recordComponentCountOffset_));
	}

	// U16 _recordComponentCount
	public U16Pointer _recordComponentCountEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ClassFileOracle.__recordComponentCountOffset_));
	}

	// ClassFileOracle$RecordComponentInfo* _recordComponentsInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__recordComponentsInfoOffset_", declaredType="ClassFileOracle$RecordComponentInfo*")
	public ClassFileOracle$RecordComponentInfoPointer _recordComponentsInfo() throws CorruptDataException {
		return ClassFileOracle$RecordComponentInfoPointer.cast(getPointerAtOffset(ClassFileOracle.__recordComponentsInfoOffset_));
	}

	// ClassFileOracle$RecordComponentInfo* _recordComponentsInfo
	public PointerPointer _recordComponentsInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle.__recordComponentsInfoOffset_));
	}

	// U8* _romBuilderClassFileBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__romBuilderClassFileBufferOffset_", declaredType="U8*")
	public U8Pointer _romBuilderClassFileBuffer() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(ClassFileOracle.__romBuilderClassFileBufferOffset_));
	}

	// U8* _romBuilderClassFileBuffer
	public PointerPointer _romBuilderClassFileBufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle.__romBuilderClassFileBufferOffset_));
	}

	// U16 _simpleNameIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__simpleNameIndexOffset_", declaredType="U16")
	public U16 _simpleNameIndex() throws CorruptDataException {
		return new U16(getShortAtOffset(ClassFileOracle.__simpleNameIndexOffset_));
	}

	// U16 _simpleNameIndex
	public U16Pointer _simpleNameIndexEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ClassFileOracle.__simpleNameIndexOffset_));
	}

	// U16 _singleScalarStaticCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__singleScalarStaticCountOffset_", declaredType="U16")
	public U16 _singleScalarStaticCount() throws CorruptDataException {
		return new U16(getShortAtOffset(ClassFileOracle.__singleScalarStaticCountOffset_));
	}

	// U16 _singleScalarStaticCount
	public U16Pointer _singleScalarStaticCountEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(ClassFileOracle.__singleScalarStaticCountOffset_));
	}

	// J9CfrAttributeUnknown* _sourceDebugExtension
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sourceDebugExtensionOffset_", declaredType="J9CfrAttributeUnknown*")
	public J9CfrAttributeUnknownPointer _sourceDebugExtension() throws CorruptDataException {
		return J9CfrAttributeUnknownPointer.cast(getPointerAtOffset(ClassFileOracle.__sourceDebugExtensionOffset_));
	}

	// J9CfrAttributeUnknown* _sourceDebugExtension
	public PointerPointer _sourceDebugExtensionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle.__sourceDebugExtensionOffset_));
	}

	// J9CfrAttributeSourceFile* _sourceFile
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sourceFileOffset_", declaredType="J9CfrAttributeSourceFile*")
	public J9CfrAttributeSourceFilePointer _sourceFile() throws CorruptDataException {
		return J9CfrAttributeSourceFilePointer.cast(getPointerAtOffset(ClassFileOracle.__sourceFileOffset_));
	}

	// J9CfrAttributeSourceFile* _sourceFile
	public PointerPointer _sourceFileEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle.__sourceFileOffset_));
	}

	// J9CfrAttributeRuntimeVisibleTypeAnnotations* _typeAnnotationsAttribute
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__typeAnnotationsAttributeOffset_", declaredType="J9CfrAttributeRuntimeVisibleTypeAnnotations*")
	public J9CfrAttributeRuntimeVisibleTypeAnnotationsPointer _typeAnnotationsAttribute() throws CorruptDataException {
		return J9CfrAttributeRuntimeVisibleTypeAnnotationsPointer.cast(getPointerAtOffset(ClassFileOracle.__typeAnnotationsAttributeOffset_));
	}

	// J9CfrAttributeRuntimeVisibleTypeAnnotations* _typeAnnotationsAttribute
	public PointerPointer _typeAnnotationsAttributeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle.__typeAnnotationsAttributeOffset_));
	}

	// U8* _verifyExcludeAttribute
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__verifyExcludeAttributeOffset_", declaredType="U8*")
	public U8Pointer _verifyExcludeAttribute() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(ClassFileOracle.__verifyExcludeAttributeOffset_));
	}

	// U8* _verifyExcludeAttribute
	public PointerPointer _verifyExcludeAttributeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassFileOracle.__verifyExcludeAttributeOffset_));
	}

}
