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
 * Structure: MM_RootScannerPointer
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
 * The generated code will provide getters for all elements in the MM_RootScannerPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_RootScanner.class)
public class MM_RootScannerPointer extends MM_BaseVirtualPointer {

	// NULL
	public static final MM_RootScannerPointer NULL = new MM_RootScannerPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_RootScannerPointer(long address) {
		super(address);
	}

	public static MM_RootScannerPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_RootScannerPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_RootScannerPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_RootScannerPointer(address);
	}

	public MM_RootScannerPointer add(long count) {
		return MM_RootScannerPointer.cast(address + (MM_RootScanner.SIZEOF * count));
	}

	public MM_RootScannerPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_RootScannerPointer addOffset(long offset) {
		return MM_RootScannerPointer.cast(address + offset);
	}

	public MM_RootScannerPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_RootScannerPointer sub(long count) {
		return MM_RootScannerPointer.cast(address - (MM_RootScanner.SIZEOF * count));
	}

	public MM_RootScannerPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_RootScannerPointer subOffset(long offset) {
		return MM_RootScannerPointer.cast(address - offset);
	}

	public MM_RootScannerPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_RootScannerPointer untag(long mask) {
		return MM_RootScannerPointer.cast(address & ~mask);
	}

	public MM_RootScannerPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_RootScanner.SIZEOF;
	}

	// Implementation methods

	// bool _classDataAsRoots
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classDataAsRootsOffset_", declaredType="bool")
	public boolean _classDataAsRoots() throws CorruptDataException {
		return getBoolAtOffset(MM_RootScanner.__classDataAsRootsOffset_);
	}

	// bool _classDataAsRoots
	public BoolPointer _classDataAsRootsEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_RootScanner.__classDataAsRootsOffset_));
	}

	// MM_CollectorLanguageInterfaceImpl* _clij
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__clijOffset_", declaredType="MM_CollectorLanguageInterfaceImpl*")
	public MM_CollectorLanguageInterfaceImplPointer _clij() throws CorruptDataException {
		return MM_CollectorLanguageInterfaceImplPointer.cast(getPointerAtOffset(MM_RootScanner.__clijOffset_));
	}

	// MM_CollectorLanguageInterfaceImpl* _clij
	public PointerPointer _clijEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RootScanner.__clijOffset_));
	}

	// U64 _entityIncrementEndTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__entityIncrementEndTimeOffset_", declaredType="U64")
	public UDATA _entityIncrementEndTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_RootScanner.__entityIncrementEndTimeOffset_));
	}

	// U64 _entityIncrementEndTime
	public UDATAPointer _entityIncrementEndTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_RootScanner.__entityIncrementEndTimeOffset_));
	}

	// U64 _entityIncrementStartTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__entityIncrementStartTimeOffset_", declaredType="U64")
	public UDATA _entityIncrementStartTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_RootScanner.__entityIncrementStartTimeOffset_));
	}

	// U64 _entityIncrementStartTime
	public UDATAPointer _entityIncrementStartTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_RootScanner.__entityIncrementStartTimeOffset_));
	}

	// U64 _entityStartScanTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__entityStartScanTimeOffset_", declaredType="U64")
	public UDATA _entityStartScanTime() throws CorruptDataException {
		return new U64(getLongAtOffset(MM_RootScanner.__entityStartScanTimeOffset_));
	}

	// U64 _entityStartScanTime
	public UDATAPointer _entityStartScanTimeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_RootScanner.__entityStartScanTimeOffset_));
	}

	// MM_EnvironmentBase* _env
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__envOffset_", declaredType="MM_EnvironmentBase*")
	public MM_EnvironmentBasePointer _env() throws CorruptDataException {
		return MM_EnvironmentBasePointer.cast(getPointerAtOffset(MM_RootScanner.__envOffset_));
	}

	// MM_EnvironmentBase* _env
	public PointerPointer _envEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RootScanner.__envOffset_));
	}

	// MM_GCExtensions* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensions*")
	public MM_GCExtensionsPointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsPointer.cast(getPointerAtOffset(MM_RootScanner.__extensionsOffset_));
	}

	// MM_GCExtensions* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RootScanner.__extensionsOffset_));
	}

	// bool _includeDoubleMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__includeDoubleMapOffset_", declaredType="bool")
	public boolean _includeDoubleMap() throws CorruptDataException {
		return getBoolAtOffset(MM_RootScanner.__includeDoubleMapOffset_);
	}

	// bool _includeDoubleMap
	public BoolPointer _includeDoubleMapEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_RootScanner.__includeDoubleMapOffset_));
	}

	// bool _includeJVMTIObjectTagTables
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__includeJVMTIObjectTagTablesOffset_", declaredType="bool")
	public boolean _includeJVMTIObjectTagTables() throws CorruptDataException {
		return getBoolAtOffset(MM_RootScanner.__includeJVMTIObjectTagTablesOffset_);
	}

	// bool _includeJVMTIObjectTagTables
	public BoolPointer _includeJVMTIObjectTagTablesEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_RootScanner.__includeJVMTIObjectTagTablesOffset_));
	}

	// bool _includeRememberedSetReferences
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__includeRememberedSetReferencesOffset_", declaredType="bool")
	public boolean _includeRememberedSetReferences() throws CorruptDataException {
		return getBoolAtOffset(MM_RootScanner.__includeRememberedSetReferencesOffset_);
	}

	// bool _includeRememberedSetReferences
	public BoolPointer _includeRememberedSetReferencesEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_RootScanner.__includeRememberedSetReferencesOffset_));
	}

	// bool _includeStackFrameClassReferences
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__includeStackFrameClassReferencesOffset_", declaredType="bool")
	public boolean _includeStackFrameClassReferences() throws CorruptDataException {
		return getBoolAtOffset(MM_RootScanner.__includeStackFrameClassReferencesOffset_);
	}

	// bool _includeStackFrameClassReferences
	public BoolPointer _includeStackFrameClassReferencesEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_RootScanner.__includeStackFrameClassReferencesOffset_));
	}

	// bool _jniWeakGlobalReferencesTableAsRoot
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__jniWeakGlobalReferencesTableAsRootOffset_", declaredType="bool")
	public boolean _jniWeakGlobalReferencesTableAsRoot() throws CorruptDataException {
		return getBoolAtOffset(MM_RootScanner.__jniWeakGlobalReferencesTableAsRootOffset_);
	}

	// bool _jniWeakGlobalReferencesTableAsRoot
	public BoolPointer _jniWeakGlobalReferencesTableAsRootEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_RootScanner.__jniWeakGlobalReferencesTableAsRootOffset_));
	}

	// RootScannerEntity _lastScannedEntity
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastScannedEntityOffset_", declaredType="RootScannerEntity")
	public long _lastScannedEntity() throws CorruptDataException {
		if (RootScannerEntity.SIZEOF == 1) {
			return getByteAtOffset(MM_RootScanner.__lastScannedEntityOffset_);
		} else if (RootScannerEntity.SIZEOF == 2) {
			return getShortAtOffset(MM_RootScanner.__lastScannedEntityOffset_);
		} else if (RootScannerEntity.SIZEOF == 4) {
			return getIntAtOffset(MM_RootScanner.__lastScannedEntityOffset_);
		} else if (RootScannerEntity.SIZEOF == 8) {
			return getLongAtOffset(MM_RootScanner.__lastScannedEntityOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// RootScannerEntity _lastScannedEntity
	public EnumPointer _lastScannedEntityEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_RootScanner.__lastScannedEntityOffset_), RootScannerEntity.class);
	}

	// bool _nurseryReferencesOnly
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nurseryReferencesOnlyOffset_", declaredType="bool")
	public boolean _nurseryReferencesOnly() throws CorruptDataException {
		return getBoolAtOffset(MM_RootScanner.__nurseryReferencesOnlyOffset_);
	}

	// bool _nurseryReferencesOnly
	public BoolPointer _nurseryReferencesOnlyEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_RootScanner.__nurseryReferencesOnlyOffset_));
	}

	// bool _nurseryReferencesPossibly
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nurseryReferencesPossiblyOffset_", declaredType="bool")
	public boolean _nurseryReferencesPossibly() throws CorruptDataException {
		return getBoolAtOffset(MM_RootScanner.__nurseryReferencesPossiblyOffset_);
	}

	// bool _nurseryReferencesPossibly
	public BoolPointer _nurseryReferencesPossiblyEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_RootScanner.__nurseryReferencesPossiblyOffset_));
	}

	// OMR_VM* _omrVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__omrVMOffset_", declaredType="OMR_VM*")
	public OMR_VMPointer _omrVM() throws CorruptDataException {
		return OMR_VMPointer.cast(getPointerAtOffset(MM_RootScanner.__omrVMOffset_));
	}

	// OMR_VM* _omrVM
	public PointerPointer _omrVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RootScanner.__omrVMOffset_));
	}

	// RootScannerEntity _scanningEntity
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scanningEntityOffset_", declaredType="RootScannerEntity")
	public long _scanningEntity() throws CorruptDataException {
		if (RootScannerEntity.SIZEOF == 1) {
			return getByteAtOffset(MM_RootScanner.__scanningEntityOffset_);
		} else if (RootScannerEntity.SIZEOF == 2) {
			return getShortAtOffset(MM_RootScanner.__scanningEntityOffset_);
		} else if (RootScannerEntity.SIZEOF == 4) {
			return getIntAtOffset(MM_RootScanner.__scanningEntityOffset_);
		} else if (RootScannerEntity.SIZEOF == 8) {
			return getLongAtOffset(MM_RootScanner.__scanningEntityOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// RootScannerEntity _scanningEntity
	public EnumPointer _scanningEntityEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_RootScanner.__scanningEntityOffset_), RootScannerEntity.class);
	}

	// bool _singleThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__singleThreadOffset_", declaredType="bool")
	public boolean _singleThread() throws CorruptDataException {
		return getBoolAtOffset(MM_RootScanner.__singleThreadOffset_);
	}

	// bool _singleThread
	public BoolPointer _singleThreadEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_RootScanner.__singleThreadOffset_));
	}

	// bool _stringTableAsRoot
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__stringTableAsRootOffset_", declaredType="bool")
	public boolean _stringTableAsRoot() throws CorruptDataException {
		return getBoolAtOffset(MM_RootScanner.__stringTableAsRootOffset_);
	}

	// bool _stringTableAsRoot
	public BoolPointer _stringTableAsRootEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_RootScanner.__stringTableAsRootOffset_));
	}

	// bool _trackVisibleStackFrameDepth
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__trackVisibleStackFrameDepthOffset_", declaredType="bool")
	public boolean _trackVisibleStackFrameDepth() throws CorruptDataException {
		return getBoolAtOffset(MM_RootScanner.__trackVisibleStackFrameDepthOffset_);
	}

	// bool _trackVisibleStackFrameDepth
	public BoolPointer _trackVisibleStackFrameDepthEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_RootScanner.__trackVisibleStackFrameDepthOffset_));
	}

}
