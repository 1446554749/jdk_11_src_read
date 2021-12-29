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
 * Structure: MM_VerboseEventLocalGCEndPointer
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
 * The generated code will provide getters for all elements in the MM_VerboseEventLocalGCEndPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_VerboseEventLocalGCEnd.class)
public class MM_VerboseEventLocalGCEndPointer extends MM_VerboseEventPointer {

	// NULL
	public static final MM_VerboseEventLocalGCEndPointer NULL = new MM_VerboseEventLocalGCEndPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_VerboseEventLocalGCEndPointer(long address) {
		super(address);
	}

	public static MM_VerboseEventLocalGCEndPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_VerboseEventLocalGCEndPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_VerboseEventLocalGCEndPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_VerboseEventLocalGCEndPointer(address);
	}

	public MM_VerboseEventLocalGCEndPointer add(long count) {
		return MM_VerboseEventLocalGCEndPointer.cast(address + (MM_VerboseEventLocalGCEnd.SIZEOF * count));
	}

	public MM_VerboseEventLocalGCEndPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_VerboseEventLocalGCEndPointer addOffset(long offset) {
		return MM_VerboseEventLocalGCEndPointer.cast(address + offset);
	}

	public MM_VerboseEventLocalGCEndPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_VerboseEventLocalGCEndPointer sub(long count) {
		return MM_VerboseEventLocalGCEndPointer.cast(address - (MM_VerboseEventLocalGCEnd.SIZEOF * count));
	}

	public MM_VerboseEventLocalGCEndPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_VerboseEventLocalGCEndPointer subOffset(long offset) {
		return MM_VerboseEventLocalGCEndPointer.cast(address - offset);
	}

	public MM_VerboseEventLocalGCEndPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_VerboseEventLocalGCEndPointer untag(long mask) {
		return MM_VerboseEventLocalGCEndPointer.cast(address & ~mask);
	}

	public MM_VerboseEventLocalGCEndPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_VerboseEventLocalGCEnd.SIZEOF;
	}

	// Implementation methods

	// UDATA _backout
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__backoutOffset_", declaredType="UDATA")
	public UDATA _backout() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventLocalGCEnd.__backoutOffset_);
	}

	// UDATA _backout
	public UDATAPointer _backoutEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventLocalGCEnd.__backoutOffset_));
	}

	// UDATA _causedRememberedSetOverflow
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__causedRememberedSetOverflowOffset_", declaredType="UDATA")
	public UDATA _causedRememberedSetOverflow() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventLocalGCEnd.__causedRememberedSetOverflowOffset_);
	}

	// UDATA _causedRememberedSetOverflow
	public UDATAPointer _causedRememberedSetOverflowEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventLocalGCEnd.__causedRememberedSetOverflowOffset_));
	}

	// UDATA _dynamicSoftReferenceThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dynamicSoftReferenceThresholdOffset_", declaredType="UDATA")
	public UDATA _dynamicSoftReferenceThreshold() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventLocalGCEnd.__dynamicSoftReferenceThresholdOffset_);
	}

	// UDATA _dynamicSoftReferenceThreshold
	public UDATAPointer _dynamicSoftReferenceThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventLocalGCEnd.__dynamicSoftReferenceThresholdOffset_));
	}

	// MM_GCExtensions* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensions*")
	public MM_GCExtensionsPointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsPointer.cast(getPointerAtOffset(MM_VerboseEventLocalGCEnd.__extensionsOffset_));
	}

	// MM_GCExtensions* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VerboseEventLocalGCEnd.__extensionsOffset_));
	}

	// UDATA _failedFlipBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__failedFlipBytesOffset_", declaredType="UDATA")
	public UDATA _failedFlipBytes() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventLocalGCEnd.__failedFlipBytesOffset_);
	}

	// UDATA _failedFlipBytes
	public UDATAPointer _failedFlipBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventLocalGCEnd.__failedFlipBytesOffset_));
	}

	// UDATA _failedFlipCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__failedFlipCountOffset_", declaredType="UDATA")
	public UDATA _failedFlipCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventLocalGCEnd.__failedFlipCountOffset_);
	}

	// UDATA _failedFlipCount
	public UDATAPointer _failedFlipCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventLocalGCEnd.__failedFlipCountOffset_));
	}

	// UDATA _failedTenureBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__failedTenureBytesOffset_", declaredType="UDATA")
	public UDATA _failedTenureBytes() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventLocalGCEnd.__failedTenureBytesOffset_);
	}

	// UDATA _failedTenureBytes
	public UDATAPointer _failedTenureBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventLocalGCEnd.__failedTenureBytesOffset_));
	}

	// UDATA _failedTenureCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__failedTenureCountOffset_", declaredType="UDATA")
	public UDATA _failedTenureCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventLocalGCEnd.__failedTenureCountOffset_);
	}

	// UDATA _failedTenureCount
	public UDATAPointer _failedTenureCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventLocalGCEnd.__failedTenureCountOffset_));
	}

	// UDATA _finalizerCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__finalizerCountOffset_", declaredType="UDATA")
	public UDATA _finalizerCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventLocalGCEnd.__finalizerCountOffset_);
	}

	// UDATA _finalizerCount
	public UDATAPointer _finalizerCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventLocalGCEnd.__finalizerCountOffset_));
	}

	// UDATA _flipBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__flipBytesOffset_", declaredType="UDATA")
	public UDATA _flipBytes() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventLocalGCEnd.__flipBytesOffset_);
	}

	// UDATA _flipBytes
	public UDATAPointer _flipBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventLocalGCEnd.__flipBytesOffset_));
	}

	// UDATA _flipCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__flipCountOffset_", declaredType="UDATA")
	public UDATA _flipCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventLocalGCEnd.__flipCountOffset_);
	}

	// UDATA _flipCount
	public UDATAPointer _flipCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventLocalGCEnd.__flipCountOffset_));
	}

	// UDATA _globalGCCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__globalGCCountOffset_", declaredType="UDATA")
	public UDATA _globalGCCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventLocalGCEnd.__globalGCCountOffset_);
	}

	// UDATA _globalGCCount
	public UDATAPointer _globalGCCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventLocalGCEnd.__globalGCCountOffset_));
	}

	// UDATA _loaEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__loaEnabledOffset_", declaredType="UDATA")
	public UDATA _loaEnabled() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventLocalGCEnd.__loaEnabledOffset_);
	}

	// UDATA _loaEnabled
	public UDATAPointer _loaEnabledEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventLocalGCEnd.__loaEnabledOffset_));
	}

	// UDATA _localGCCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__localGCCountOffset_", declaredType="UDATA")
	public UDATA _localGCCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventLocalGCEnd.__localGCCountOffset_);
	}

	// UDATA _localGCCount
	public UDATAPointer _localGCCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventLocalGCEnd.__localGCCountOffset_));
	}

	// U64 _localGCStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__localGCStartTimeOffset_", declaredType="U64")
	public UDATA _localGCStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_VerboseEventLocalGCEnd.__localGCStartTimeOffset_));
	}

	// U64 _localGCStartTime
	public UDATAPointer _localGCStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventLocalGCEnd.__localGCStartTimeOffset_));
	}

	// UDATA _nurseryFreeBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nurseryFreeBytesOffset_", declaredType="UDATA")
	public UDATA _nurseryFreeBytes() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventLocalGCEnd.__nurseryFreeBytesOffset_);
	}

	// UDATA _nurseryFreeBytes
	public UDATAPointer _nurseryFreeBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventLocalGCEnd.__nurseryFreeBytesOffset_));
	}

	// UDATA _nurseryTotalBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nurseryTotalBytesOffset_", declaredType="UDATA")
	public UDATA _nurseryTotalBytes() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventLocalGCEnd.__nurseryTotalBytesOffset_);
	}

	// UDATA _nurseryTotalBytes
	public UDATAPointer _nurseryTotalBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventLocalGCEnd.__nurseryTotalBytesOffset_));
	}

	// UDATA _phantomReferenceClearCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__phantomReferenceClearCountOffset_", declaredType="UDATA")
	public UDATA _phantomReferenceClearCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventLocalGCEnd.__phantomReferenceClearCountOffset_);
	}

	// UDATA _phantomReferenceClearCount
	public UDATAPointer _phantomReferenceClearCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventLocalGCEnd.__phantomReferenceClearCountOffset_));
	}

	// UDATA _rememberedSetOverflowed
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rememberedSetOverflowedOffset_", declaredType="UDATA")
	public UDATA _rememberedSetOverflowed() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventLocalGCEnd.__rememberedSetOverflowedOffset_);
	}

	// UDATA _rememberedSetOverflowed
	public UDATAPointer _rememberedSetOverflowedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventLocalGCEnd.__rememberedSetOverflowedOffset_));
	}

	// UDATA _scanCacheOverflow
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scanCacheOverflowOffset_", declaredType="UDATA")
	public UDATA _scanCacheOverflow() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventLocalGCEnd.__scanCacheOverflowOffset_);
	}

	// UDATA _scanCacheOverflow
	public UDATAPointer _scanCacheOverflowEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventLocalGCEnd.__scanCacheOverflowOffset_));
	}

	// UDATA _softReferenceClearCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__softReferenceClearCountOffset_", declaredType="UDATA")
	public UDATA _softReferenceClearCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventLocalGCEnd.__softReferenceClearCountOffset_);
	}

	// UDATA _softReferenceClearCount
	public UDATAPointer _softReferenceClearCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventLocalGCEnd.__softReferenceClearCountOffset_));
	}

	// UDATA _softReferenceThreshold
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__softReferenceThresholdOffset_", declaredType="UDATA")
	public UDATA _softReferenceThreshold() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventLocalGCEnd.__softReferenceThresholdOffset_);
	}

	// UDATA _softReferenceThreshold
	public UDATAPointer _softReferenceThresholdEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventLocalGCEnd.__softReferenceThresholdOffset_));
	}

	// UDATA _tenureAge
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureAgeOffset_", declaredType="UDATA")
	public UDATA _tenureAge() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventLocalGCEnd.__tenureAgeOffset_);
	}

	// UDATA _tenureAge
	public UDATAPointer _tenureAgeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventLocalGCEnd.__tenureAgeOffset_));
	}

	// UDATA _tenureBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureBytesOffset_", declaredType="UDATA")
	public UDATA _tenureBytes() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventLocalGCEnd.__tenureBytesOffset_);
	}

	// UDATA _tenureBytes
	public UDATAPointer _tenureBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventLocalGCEnd.__tenureBytesOffset_));
	}

	// UDATA _tenureCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureCountOffset_", declaredType="UDATA")
	public UDATA _tenureCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventLocalGCEnd.__tenureCountOffset_);
	}

	// UDATA _tenureCount
	public UDATAPointer _tenureCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventLocalGCEnd.__tenureCountOffset_));
	}

	// UDATA _tenureFreeBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureFreeBytesOffset_", declaredType="UDATA")
	public UDATA _tenureFreeBytes() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventLocalGCEnd.__tenureFreeBytesOffset_);
	}

	// UDATA _tenureFreeBytes
	public UDATAPointer _tenureFreeBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventLocalGCEnd.__tenureFreeBytesOffset_));
	}

	// UDATA _tenureLOAFreeBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureLOAFreeBytesOffset_", declaredType="UDATA")
	public UDATA _tenureLOAFreeBytes() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventLocalGCEnd.__tenureLOAFreeBytesOffset_);
	}

	// UDATA _tenureLOAFreeBytes
	public UDATAPointer _tenureLOAFreeBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventLocalGCEnd.__tenureLOAFreeBytesOffset_));
	}

	// UDATA _tenureLOATotalBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureLOATotalBytesOffset_", declaredType="UDATA")
	public UDATA _tenureLOATotalBytes() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventLocalGCEnd.__tenureLOATotalBytesOffset_);
	}

	// UDATA _tenureLOATotalBytes
	public UDATAPointer _tenureLOATotalBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventLocalGCEnd.__tenureLOATotalBytesOffset_));
	}

	// UDATA _tenureTotalBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tenureTotalBytesOffset_", declaredType="UDATA")
	public UDATA _tenureTotalBytes() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventLocalGCEnd.__tenureTotalBytesOffset_);
	}

	// UDATA _tenureTotalBytes
	public UDATAPointer _tenureTotalBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventLocalGCEnd.__tenureTotalBytesOffset_));
	}

	// UDATA _tilted
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tiltedOffset_", declaredType="UDATA")
	public UDATA _tilted() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventLocalGCEnd.__tiltedOffset_);
	}

	// UDATA _tilted
	public UDATAPointer _tiltedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventLocalGCEnd.__tiltedOffset_));
	}

	// UDATA _totalMemorySize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__totalMemorySizeOffset_", declaredType="UDATA")
	public UDATA _totalMemorySize() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventLocalGCEnd.__totalMemorySizeOffset_);
	}

	// UDATA _totalMemorySize
	public UDATAPointer _totalMemorySizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventLocalGCEnd.__totalMemorySizeOffset_));
	}

	// UDATA _weakReferenceClearCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__weakReferenceClearCountOffset_", declaredType="UDATA")
	public UDATA _weakReferenceClearCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseEventLocalGCEnd.__weakReferenceClearCountOffset_);
	}

	// UDATA _weakReferenceClearCount
	public UDATAPointer _weakReferenceClearCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseEventLocalGCEnd.__weakReferenceClearCountOffset_));
	}

}
