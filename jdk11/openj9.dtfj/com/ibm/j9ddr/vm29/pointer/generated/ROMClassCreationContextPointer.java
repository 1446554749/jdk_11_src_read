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
 * Structure: ROMClassCreationContextPointer
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
 * The generated code will provide getters for all elements in the ROMClassCreationContextPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=ROMClassCreationContext.class)
public class ROMClassCreationContextPointer extends StructurePointer {

	// NULL
	public static final ROMClassCreationContextPointer NULL = new ROMClassCreationContextPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected ROMClassCreationContextPointer(long address) {
		super(address);
	}

	public static ROMClassCreationContextPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static ROMClassCreationContextPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static ROMClassCreationContextPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new ROMClassCreationContextPointer(address);
	}

	public ROMClassCreationContextPointer add(long count) {
		return ROMClassCreationContextPointer.cast(address + (ROMClassCreationContext.SIZEOF * count));
	}

	public ROMClassCreationContextPointer add(Scalar count) {
		return add(count.longValue());
	}

	public ROMClassCreationContextPointer addOffset(long offset) {
		return ROMClassCreationContextPointer.cast(address + offset);
	}

	public ROMClassCreationContextPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public ROMClassCreationContextPointer sub(long count) {
		return ROMClassCreationContextPointer.cast(address - (ROMClassCreationContext.SIZEOF * count));
	}

	public ROMClassCreationContextPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public ROMClassCreationContextPointer subOffset(long offset) {
		return ROMClassCreationContextPointer.cast(address - offset);
	}

	public ROMClassCreationContextPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public ROMClassCreationContextPointer untag(long mask) {
		return ROMClassCreationContextPointer.cast(address & ~mask);
	}

	public ROMClassCreationContextPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return ROMClassCreationContext.SIZEOF;
	}

	// Implementation methods

	// AllocationStrategy* _allocationStrategy
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__allocationStrategyOffset_", declaredType="AllocationStrategy*")
	public AllocationStrategyPointer _allocationStrategy() throws CorruptDataException {
		return AllocationStrategyPointer.cast(getPointerAtOffset(ROMClassCreationContext.__allocationStrategyOffset_));
	}

	// AllocationStrategy* _allocationStrategy
	public PointerPointer _allocationStrategyEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassCreationContext.__allocationStrategyOffset_));
	}

	// UDATA _bctFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bctFlagsOffset_", declaredType="UDATA")
	public UDATA _bctFlags() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassCreationContext.__bctFlagsOffset_);
	}

	// UDATA _bctFlags
	public UDATAPointer _bctFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassCreationContext.__bctFlagsOffset_));
	}

	// UDATA _bcuFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bcuFlagsOffset_", declaredType="UDATA")
	public UDATA _bcuFlags() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassCreationContext.__bcuFlagsOffset_);
	}

	// UDATA _bcuFlags
	public UDATAPointer _bcuFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassCreationContext.__bcuFlagsOffset_));
	}

	// BuildResult _buildResult
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__buildResultOffset_", declaredType="BuildResult")
	public long _buildResult() throws CorruptDataException {
		if (BuildResult.SIZEOF == 1) {
			return getByteAtOffset(ROMClassCreationContext.__buildResultOffset_);
		} else if (BuildResult.SIZEOF == 2) {
			return getShortAtOffset(ROMClassCreationContext.__buildResultOffset_);
		} else if (BuildResult.SIZEOF == 4) {
			return getIntAtOffset(ROMClassCreationContext.__buildResultOffset_);
		} else if (BuildResult.SIZEOF == 8) {
			return getLongAtOffset(ROMClassCreationContext.__buildResultOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// BuildResult _buildResult
	public EnumPointer _buildResultEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(ROMClassCreationContext.__buildResultOffset_), BuildResult.class);
	}

	// U8* _classFileBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classFileBytesOffset_", declaredType="U8*")
	public U8Pointer _classFileBytes() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(ROMClassCreationContext.__classFileBytesOffset_));
	}

	// U8* _classFileBytes
	public PointerPointer _classFileBytesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassCreationContext.__classFileBytesOffset_));
	}

	// bool _classFileBytesReplaced
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classFileBytesReplacedOffset_", declaredType="bool")
	public boolean _classFileBytesReplaced() throws CorruptDataException {
		return getBoolAtOffset(ROMClassCreationContext.__classFileBytesReplacedOffset_);
	}

	// bool _classFileBytesReplaced
	public BoolPointer _classFileBytesReplacedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ROMClassCreationContext.__classFileBytesReplacedOffset_));
	}

	// UDATA _classFileSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classFileSizeOffset_", declaredType="UDATA")
	public UDATA _classFileSize() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassCreationContext.__classFileSizeOffset_);
	}

	// UDATA _classFileSize
	public UDATAPointer _classFileSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassCreationContext.__classFileSizeOffset_));
	}

	// J9ClassLoader* _classLoader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classLoaderOffset_", declaredType="J9ClassLoader*")
	public J9ClassLoaderPointer _classLoader() throws CorruptDataException {
		return J9ClassLoaderPointer.cast(getPointerAtOffset(ROMClassCreationContext.__classLoaderOffset_));
	}

	// J9ClassLoader* _classLoader
	public PointerPointer _classLoaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassCreationContext.__classLoaderOffset_));
	}

	// U8* _className
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classNameOffset_", declaredType="U8*")
	public U8Pointer _className() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(ROMClassCreationContext.__classNameOffset_));
	}

	// U8* _className
	public PointerPointer _classNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassCreationContext.__classNameOffset_));
	}

	// UDATA _classNameLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classNameLengthOffset_", declaredType="UDATA")
	public UDATA _classNameLength() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassCreationContext.__classNameLengthOffset_);
	}

	// UDATA _classNameLength
	public UDATAPointer _classNameLengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassCreationContext.__classNameLengthOffset_));
	}

	// J9Class* _clazz
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__clazzOffset_", declaredType="J9Class*")
	public J9ClassPointer _clazz() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(ROMClassCreationContext.__clazzOffset_));
	}

	// J9Class* _clazz
	public PointerPointer _clazzEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassCreationContext.__clazzOffset_));
	}

	// UDATA _cpIndex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cpIndexOffset_", declaredType="UDATA")
	public UDATA _cpIndex() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassCreationContext.__cpIndexOffset_);
	}

	// UDATA _cpIndex
	public UDATAPointer _cpIndexEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassCreationContext.__cpIndexOffset_));
	}

	// bool _creatingIntermediateROMClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__creatingIntermediateROMClassOffset_", declaredType="bool")
	public boolean _creatingIntermediateROMClass() throws CorruptDataException {
		return getBoolAtOffset(ROMClassCreationContext.__creatingIntermediateROMClassOffset_);
	}

	// bool _creatingIntermediateROMClass
	public BoolPointer _creatingIntermediateROMClassEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ROMClassCreationContext.__creatingIntermediateROMClassOffset_));
	}

	// bool _doDebugCompare
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__doDebugCompareOffset_", declaredType="bool")
	public boolean _doDebugCompare() throws CorruptDataException {
		return getBoolAtOffset(ROMClassCreationContext.__doDebugCompareOffset_);
	}

	// bool _doDebugCompare
	public BoolPointer _doDebugCompareEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ROMClassCreationContext.__doDebugCompareOffset_));
	}

	// J9DynamicLoadStats* _dynamicLoadStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dynamicLoadStatsOffset_", declaredType="J9DynamicLoadStats*")
	public J9DynamicLoadStatsPointer _dynamicLoadStats() throws CorruptDataException {
		return J9DynamicLoadStatsPointer.cast(getPointerAtOffset(ROMClassCreationContext.__dynamicLoadStatsOffset_));
	}

	// J9DynamicLoadStats* _dynamicLoadStats
	public PointerPointer _dynamicLoadStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassCreationContext.__dynamicLoadStatsOffset_));
	}

	// J9ROMMethod* _existingRomMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__existingRomMethodOffset_", declaredType="J9ROMMethod*")
	public J9ROMMethodPointer _existingRomMethod() throws CorruptDataException {
		return J9ROMMethodPointer.cast(getPointerAtOffset(ROMClassCreationContext.__existingRomMethodOffset_));
	}

	// J9ROMMethod* _existingRomMethod
	public PointerPointer _existingRomMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassCreationContext.__existingRomMethodOffset_));
	}

	// UDATA _findClassFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__findClassFlagsOffset_", declaredType="UDATA")
	public UDATA _findClassFlags() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassCreationContext.__findClassFlagsOffset_);
	}

	// UDATA _findClassFlags
	public UDATAPointer _findClassFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassCreationContext.__findClassFlagsOffset_));
	}

	// bool _forceDebugDataInLine
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__forceDebugDataInLineOffset_", declaredType="bool")
	public boolean _forceDebugDataInLine() throws CorruptDataException {
		return getBoolAtOffset(ROMClassCreationContext.__forceDebugDataInLineOffset_);
	}

	// bool _forceDebugDataInLine
	public BoolPointer _forceDebugDataInLineEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ROMClassCreationContext.__forceDebugDataInLineOffset_));
	}

	// UDATA _hostPackageLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__hostPackageLengthOffset_", declaredType="UDATA")
	public UDATA _hostPackageLength() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassCreationContext.__hostPackageLengthOffset_);
	}

	// UDATA _hostPackageLength
	public UDATAPointer _hostPackageLengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassCreationContext.__hostPackageLengthOffset_));
	}

	// U8* _hostPackageName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__hostPackageNameOffset_", declaredType="U8*")
	public U8Pointer _hostPackageName() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(ROMClassCreationContext.__hostPackageNameOffset_));
	}

	// U8* _hostPackageName
	public PointerPointer _hostPackageNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassCreationContext.__hostPackageNameOffset_));
	}

	// U8* _intermediateClassData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__intermediateClassDataOffset_", declaredType="U8*")
	public U8Pointer _intermediateClassData() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(ROMClassCreationContext.__intermediateClassDataOffset_));
	}

	// U8* _intermediateClassData
	public PointerPointer _intermediateClassDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassCreationContext.__intermediateClassDataOffset_));
	}

	// U32 _intermediateClassDataLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__intermediateClassDataLengthOffset_", declaredType="U32")
	public UDATA _intermediateClassDataLength() throws CorruptDataException {
		return new U32(getIntAtOffset(ROMClassCreationContext.__intermediateClassDataLengthOffset_));
	}

	// U32 _intermediateClassDataLength
	public UDATAPointer _intermediateClassDataLengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassCreationContext.__intermediateClassDataLengthOffset_));
	}

	// bool _interningEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__interningEnabledOffset_", declaredType="bool")
	public boolean _interningEnabled() throws CorruptDataException {
		return getBoolAtOffset(ROMClassCreationContext.__interningEnabledOffset_);
	}

	// bool _interningEnabled
	public BoolPointer _interningEnabledEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ROMClassCreationContext.__interningEnabledOffset_));
	}

	// J9JavaVM* _javaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__javaVMOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer _javaVM() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(ROMClassCreationContext.__javaVMOffset_));
	}

	// J9JavaVM* _javaVM
	public PointerPointer _javaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassCreationContext.__javaVMOffset_));
	}

	// UDATA _loadLocation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__loadLocationOffset_", declaredType="UDATA")
	public UDATA _loadLocation() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassCreationContext.__loadLocationOffset_);
	}

	// UDATA _loadLocation
	public UDATAPointer _loadLocationEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassCreationContext.__loadLocationOffset_));
	}

	// J9ClassPatchMap* _patchMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__patchMapOffset_", declaredType="J9ClassPatchMap*")
	public J9ClassPatchMapPointer _patchMap() throws CorruptDataException {
		return J9ClassPatchMapPointer.cast(getPointerAtOffset(ROMClassCreationContext.__patchMapOffset_));
	}

	// J9ClassPatchMap* _patchMap
	public PointerPointer _patchMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassCreationContext.__patchMapOffset_));
	}

	// J9PortLibrary* _portLibrary
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__portLibraryOffset_", declaredType="J9PortLibrary*")
	public J9PortLibraryPointer _portLibrary() throws CorruptDataException {
		return J9PortLibraryPointer.cast(getPointerAtOffset(ROMClassCreationContext.__portLibraryOffset_));
	}

	// J9PortLibrary* _portLibrary
	public PointerPointer _portLibraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassCreationContext.__portLibraryOffset_));
	}

	// bool _retransformAllowed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__retransformAllowedOffset_", declaredType="bool")
	public boolean _retransformAllowed() throws CorruptDataException {
		return getBoolAtOffset(ROMClassCreationContext.__retransformAllowedOffset_);
	}

	// bool _retransformAllowed
	public BoolPointer _retransformAllowedEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ROMClassCreationContext.__retransformAllowedOffset_));
	}

	// bool _reusingIntermediateClassData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__reusingIntermediateClassDataOffset_", declaredType="bool")
	public boolean _reusingIntermediateClassData() throws CorruptDataException {
		return getBoolAtOffset(ROMClassCreationContext.__reusingIntermediateClassDataOffset_);
	}

	// bool _reusingIntermediateClassData
	public BoolPointer _reusingIntermediateClassDataEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ROMClassCreationContext.__reusingIntermediateClassDataOffset_));
	}

	// J9ROMClass* _romClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__romClassOffset_", declaredType="J9ROMClass*")
	public J9ROMClassPointer _romClass() throws CorruptDataException {
		return J9ROMClassPointer.cast(getPointerAtOffset(ROMClassCreationContext.__romClassOffset_));
	}

	// J9ROMClass* _romClass
	public PointerPointer _romClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassCreationContext.__romClassOffset_));
	}

	// J9SharedInvariantInternTable* _sharedStringInternTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sharedStringInternTableOffset_", declaredType="J9SharedInvariantInternTable*")
	public J9SharedInvariantInternTablePointer _sharedStringInternTable() throws CorruptDataException {
		return J9SharedInvariantInternTablePointer.cast(getPointerAtOffset(ROMClassCreationContext.__sharedStringInternTableOffset_));
	}

	// J9SharedInvariantInternTable* _sharedStringInternTable
	public PointerPointer _sharedStringInternTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassCreationContext.__sharedStringInternTableOffset_));
	}

	// ROMClassCreationPhase _verboseCurrentPhase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__verboseCurrentPhaseOffset_", declaredType="ROMClassCreationPhase")
	public long _verboseCurrentPhase() throws CorruptDataException {
		if (ROMClassCreationPhase.SIZEOF == 1) {
			return getByteAtOffset(ROMClassCreationContext.__verboseCurrentPhaseOffset_);
		} else if (ROMClassCreationPhase.SIZEOF == 2) {
			return getShortAtOffset(ROMClassCreationContext.__verboseCurrentPhaseOffset_);
		} else if (ROMClassCreationPhase.SIZEOF == 4) {
			return getIntAtOffset(ROMClassCreationContext.__verboseCurrentPhaseOffset_);
		} else if (ROMClassCreationPhase.SIZEOF == 8) {
			return getLongAtOffset(ROMClassCreationContext.__verboseCurrentPhaseOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// ROMClassCreationPhase _verboseCurrentPhase
	public EnumPointer _verboseCurrentPhaseEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(ROMClassCreationContext.__verboseCurrentPhaseOffset_), ROMClassCreationPhase.class);
	}

	// UDATA _verboseLastBufferSizeExceeded
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__verboseLastBufferSizeExceededOffset_", declaredType="UDATA")
	public UDATA _verboseLastBufferSizeExceeded() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassCreationContext.__verboseLastBufferSizeExceededOffset_);
	}

	// UDATA _verboseLastBufferSizeExceeded
	public UDATAPointer _verboseLastBufferSizeExceededEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassCreationContext.__verboseLastBufferSizeExceededOffset_));
	}

	// UDATA _verboseOutOfMemoryCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__verboseOutOfMemoryCountOffset_", declaredType="UDATA")
	public UDATA _verboseOutOfMemoryCount() throws CorruptDataException {
		return getUDATAAtOffset(ROMClassCreationContext.__verboseOutOfMemoryCountOffset_);
	}

	// UDATA _verboseOutOfMemoryCount
	public UDATAPointer _verboseOutOfMemoryCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ROMClassCreationContext.__verboseOutOfMemoryCountOffset_));
	}

	// bool _verboseROMClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__verboseROMClassOffset_", declaredType="bool")
	public boolean _verboseROMClass() throws CorruptDataException {
		return getBoolAtOffset(ROMClassCreationContext.__verboseROMClassOffset_);
	}

	// bool _verboseROMClass
	public BoolPointer _verboseROMClassEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ROMClassCreationContext.__verboseROMClassOffset_));
	}

	// ROMClassCreationContext$VerboseRecord[] _verboseRecords
	public ROMClassCreationContext$VerboseRecordPointer _verboseRecordsEA() throws CorruptDataException {
		return ROMClassCreationContext$VerboseRecordPointer.cast(nonNullFieldEA(ROMClassCreationContext.__verboseRecordsOffset_));
	}

}
