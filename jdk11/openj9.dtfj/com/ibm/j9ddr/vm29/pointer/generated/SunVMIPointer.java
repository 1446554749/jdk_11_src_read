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
 * Structure: SunVMIPointer
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
 * The generated code will provide getters for all elements in the SunVMIPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=SunVMI.class)
public class SunVMIPointer extends StructurePointer {

	// NULL
	public static final SunVMIPointer NULL = new SunVMIPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected SunVMIPointer(long address) {
		super(address);
	}

	public static SunVMIPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static SunVMIPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static SunVMIPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new SunVMIPointer(address);
	}

	public SunVMIPointer add(long count) {
		return SunVMIPointer.cast(address + (SunVMI.SIZEOF * count));
	}

	public SunVMIPointer add(Scalar count) {
		return add(count.longValue());
	}

	public SunVMIPointer addOffset(long offset) {
		return SunVMIPointer.cast(address + offset);
	}

	public SunVMIPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public SunVMIPointer sub(long count) {
		return SunVMIPointer.cast(address - (SunVMI.SIZEOF * count));
	}

	public SunVMIPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public SunVMIPointer subOffset(long offset) {
		return SunVMIPointer.cast(address - offset);
	}

	public SunVMIPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public SunVMIPointer untag(long mask) {
		return SunVMIPointer.cast(address & ~mask);
	}

	public SunVMIPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return SunVMI.SIZEOF;
	}

	// Implementation methods

	// JVM_AllocateNewArray_Type JVM_AllocateNewArray
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_JVM_AllocateNewArrayOffset_", declaredType="JVM_AllocateNewArray_Type")
	public VoidPointer JVM_AllocateNewArray() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SunVMI._JVM_AllocateNewArrayOffset_));
	}

	// JVM_AllocateNewArray_Type JVM_AllocateNewArray
	public PointerPointer JVM_AllocateNewArrayEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SunVMI._JVM_AllocateNewArrayOffset_));
	}

	// JVM_AllocateNewObject_Type JVM_AllocateNewObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_JVM_AllocateNewObjectOffset_", declaredType="JVM_AllocateNewObject_Type")
	public VoidPointer JVM_AllocateNewObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SunVMI._JVM_AllocateNewObjectOffset_));
	}

	// JVM_AllocateNewObject_Type JVM_AllocateNewObject
	public PointerPointer JVM_AllocateNewObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SunVMI._JVM_AllocateNewObjectOffset_));
	}

	// JVM_ExtendBootClassPath_Type JVM_ExtendBootClassPath
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_JVM_ExtendBootClassPathOffset_", declaredType="JVM_ExtendBootClassPath_Type")
	public VoidPointer JVM_ExtendBootClassPath() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SunVMI._JVM_ExtendBootClassPathOffset_));
	}

	// JVM_ExtendBootClassPath_Type JVM_ExtendBootClassPath
	public PointerPointer JVM_ExtendBootClassPathEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SunVMI._JVM_ExtendBootClassPathOffset_));
	}

	// JVM_FindClassFromClassLoader_Type JVM_FindClassFromClassLoader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_JVM_FindClassFromClassLoaderOffset_", declaredType="JVM_FindClassFromClassLoader_Type")
	public VoidPointer JVM_FindClassFromClassLoader() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SunVMI._JVM_FindClassFromClassLoaderOffset_));
	}

	// JVM_FindClassFromClassLoader_Type JVM_FindClassFromClassLoader
	public PointerPointer JVM_FindClassFromClassLoaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SunVMI._JVM_FindClassFromClassLoaderOffset_));
	}

	// JVM_FreeMemory_Type JVM_FreeMemory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_JVM_FreeMemoryOffset_", declaredType="JVM_FreeMemory_Type")
	public VoidPointer JVM_FreeMemory() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SunVMI._JVM_FreeMemoryOffset_));
	}

	// JVM_FreeMemory_Type JVM_FreeMemory
	public PointerPointer JVM_FreeMemoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SunVMI._JVM_FreeMemoryOffset_));
	}

	// JVM_GC_Type JVM_GC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_JVM_GCOffset_", declaredType="JVM_GC_Type")
	public VoidPointer JVM_GC() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SunVMI._JVM_GCOffset_));
	}

	// JVM_GC_Type JVM_GC
	public PointerPointer JVM_GCEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SunVMI._JVM_GCOffset_));
	}

	// JVM_GCNoCompact_Type JVM_GCNoCompact
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_JVM_GCNoCompactOffset_", declaredType="JVM_GCNoCompact_Type")
	public VoidPointer JVM_GCNoCompact() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SunVMI._JVM_GCNoCompactOffset_));
	}

	// JVM_GCNoCompact_Type JVM_GCNoCompact
	public PointerPointer JVM_GCNoCompactEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SunVMI._JVM_GCNoCompactOffset_));
	}

	// JVM_GetCallerClass_Type JVM_GetCallerClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_JVM_GetCallerClassOffset_", declaredType="JVM_GetCallerClass_Type")
	public VoidPointer JVM_GetCallerClass() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SunVMI._JVM_GetCallerClassOffset_));
	}

	// JVM_GetCallerClass_Type JVM_GetCallerClass
	public PointerPointer JVM_GetCallerClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SunVMI._JVM_GetCallerClassOffset_));
	}

	// JVM_GetClassAccessFlags_Type JVM_GetClassAccessFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_JVM_GetClassAccessFlagsOffset_", declaredType="JVM_GetClassAccessFlags_Type")
	public VoidPointer JVM_GetClassAccessFlags() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SunVMI._JVM_GetClassAccessFlagsOffset_));
	}

	// JVM_GetClassAccessFlags_Type JVM_GetClassAccessFlags
	public PointerPointer JVM_GetClassAccessFlagsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SunVMI._JVM_GetClassAccessFlagsOffset_));
	}

	// JVM_GetClassContext_Type JVM_GetClassContext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_JVM_GetClassContextOffset_", declaredType="JVM_GetClassContext_Type")
	public VoidPointer JVM_GetClassContext() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SunVMI._JVM_GetClassContextOffset_));
	}

	// JVM_GetClassContext_Type JVM_GetClassContext
	public PointerPointer JVM_GetClassContextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SunVMI._JVM_GetClassContextOffset_));
	}

	// JVM_GetClassLoader_Type JVM_GetClassLoader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_JVM_GetClassLoaderOffset_", declaredType="JVM_GetClassLoader_Type")
	public VoidPointer JVM_GetClassLoader() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SunVMI._JVM_GetClassLoaderOffset_));
	}

	// JVM_GetClassLoader_Type JVM_GetClassLoader
	public PointerPointer JVM_GetClassLoaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SunVMI._JVM_GetClassLoaderOffset_));
	}

	// JVM_GetClassTypeAnnotations_Type JVM_GetClassTypeAnnotations
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_JVM_GetClassTypeAnnotationsOffset_", declaredType="JVM_GetClassTypeAnnotations_Type")
	public VoidPointer JVM_GetClassTypeAnnotations() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SunVMI._JVM_GetClassTypeAnnotationsOffset_));
	}

	// JVM_GetClassTypeAnnotations_Type JVM_GetClassTypeAnnotations
	public PointerPointer JVM_GetClassTypeAnnotationsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SunVMI._JVM_GetClassTypeAnnotationsOffset_));
	}

	// JVM_GetFieldTypeAnnotations_Type JVM_GetFieldTypeAnnotations
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_JVM_GetFieldTypeAnnotationsOffset_", declaredType="JVM_GetFieldTypeAnnotations_Type")
	public VoidPointer JVM_GetFieldTypeAnnotations() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SunVMI._JVM_GetFieldTypeAnnotationsOffset_));
	}

	// JVM_GetFieldTypeAnnotations_Type JVM_GetFieldTypeAnnotations
	public PointerPointer JVM_GetFieldTypeAnnotationsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SunVMI._JVM_GetFieldTypeAnnotationsOffset_));
	}

	// JVM_GetMethodParameters_Type JVM_GetMethodParameters
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_JVM_GetMethodParametersOffset_", declaredType="JVM_GetMethodParameters_Type")
	public VoidPointer JVM_GetMethodParameters() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SunVMI._JVM_GetMethodParametersOffset_));
	}

	// JVM_GetMethodParameters_Type JVM_GetMethodParameters
	public PointerPointer JVM_GetMethodParametersEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SunVMI._JVM_GetMethodParametersOffset_));
	}

	// JVM_GetMethodTypeAnnotations_Type JVM_GetMethodTypeAnnotations
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_JVM_GetMethodTypeAnnotationsOffset_", declaredType="JVM_GetMethodTypeAnnotations_Type")
	public VoidPointer JVM_GetMethodTypeAnnotations() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SunVMI._JVM_GetMethodTypeAnnotationsOffset_));
	}

	// JVM_GetMethodTypeAnnotations_Type JVM_GetMethodTypeAnnotations
	public PointerPointer JVM_GetMethodTypeAnnotationsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SunVMI._JVM_GetMethodTypeAnnotationsOffset_));
	}

	// JVM_GetSystemPackage_Type JVM_GetSystemPackage
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_JVM_GetSystemPackageOffset_", declaredType="JVM_GetSystemPackage_Type")
	public VoidPointer JVM_GetSystemPackage() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SunVMI._JVM_GetSystemPackageOffset_));
	}

	// JVM_GetSystemPackage_Type JVM_GetSystemPackage
	public PointerPointer JVM_GetSystemPackageEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SunVMI._JVM_GetSystemPackageOffset_));
	}

	// JVM_GetSystemPackages_Type JVM_GetSystemPackages
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_JVM_GetSystemPackagesOffset_", declaredType="JVM_GetSystemPackages_Type")
	public VoidPointer JVM_GetSystemPackages() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SunVMI._JVM_GetSystemPackagesOffset_));
	}

	// JVM_GetSystemPackages_Type JVM_GetSystemPackages
	public PointerPointer JVM_GetSystemPackagesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SunVMI._JVM_GetSystemPackagesOffset_));
	}

	// JVM_GetThreadInterruptEvent_Type JVM_GetThreadInterruptEvent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_JVM_GetThreadInterruptEventOffset_", declaredType="JVM_GetThreadInterruptEvent_Type")
	public VoidPointer JVM_GetThreadInterruptEvent() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SunVMI._JVM_GetThreadInterruptEventOffset_));
	}

	// JVM_GetThreadInterruptEvent_Type JVM_GetThreadInterruptEvent
	public PointerPointer JVM_GetThreadInterruptEventEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SunVMI._JVM_GetThreadInterruptEventOffset_));
	}

	// JVM_Halt_Type JVM_Halt
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_JVM_HaltOffset_", declaredType="JVM_Halt_Type")
	public VoidPointer JVM_Halt() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SunVMI._JVM_HaltOffset_));
	}

	// JVM_Halt_Type JVM_Halt
	public PointerPointer JVM_HaltEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SunVMI._JVM_HaltOffset_));
	}

	// JVM_InvokeMethod_Type JVM_InvokeMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_JVM_InvokeMethodOffset_", declaredType="JVM_InvokeMethod_Type")
	public VoidPointer JVM_InvokeMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SunVMI._JVM_InvokeMethodOffset_));
	}

	// JVM_InvokeMethod_Type JVM_InvokeMethod
	public PointerPointer JVM_InvokeMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SunVMI._JVM_InvokeMethodOffset_));
	}

	// JVM_LatestUserDefinedLoader_Type JVM_LatestUserDefinedLoader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_JVM_LatestUserDefinedLoaderOffset_", declaredType="JVM_LatestUserDefinedLoader_Type")
	public VoidPointer JVM_LatestUserDefinedLoader() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SunVMI._JVM_LatestUserDefinedLoaderOffset_));
	}

	// JVM_LatestUserDefinedLoader_Type JVM_LatestUserDefinedLoader
	public PointerPointer JVM_LatestUserDefinedLoaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SunVMI._JVM_LatestUserDefinedLoaderOffset_));
	}

	// JVM_MaxMemory_Type JVM_MaxMemory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_JVM_MaxMemoryOffset_", declaredType="JVM_MaxMemory_Type")
	public VoidPointer JVM_MaxMemory() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SunVMI._JVM_MaxMemoryOffset_));
	}

	// JVM_MaxMemory_Type JVM_MaxMemory
	public PointerPointer JVM_MaxMemoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SunVMI._JVM_MaxMemoryOffset_));
	}

	// JVM_MaxObjectInspectionAge_Type JVM_MaxObjectInspectionAge
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_JVM_MaxObjectInspectionAgeOffset_", declaredType="JVM_MaxObjectInspectionAge_Type")
	public VoidPointer JVM_MaxObjectInspectionAge() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SunVMI._JVM_MaxObjectInspectionAgeOffset_));
	}

	// JVM_MaxObjectInspectionAge_Type JVM_MaxObjectInspectionAge
	public PointerPointer JVM_MaxObjectInspectionAgeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SunVMI._JVM_MaxObjectInspectionAgeOffset_));
	}

	// JVM_NewInstanceFromConstructor_Type JVM_NewInstanceFromConstructor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_JVM_NewInstanceFromConstructorOffset_", declaredType="JVM_NewInstanceFromConstructor_Type")
	public VoidPointer JVM_NewInstanceFromConstructor() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SunVMI._JVM_NewInstanceFromConstructorOffset_));
	}

	// JVM_NewInstanceFromConstructor_Type JVM_NewInstanceFromConstructor
	public PointerPointer JVM_NewInstanceFromConstructorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SunVMI._JVM_NewInstanceFromConstructorOffset_));
	}

	// JVM_TotalMemory_Type JVM_TotalMemory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_JVM_TotalMemoryOffset_", declaredType="JVM_TotalMemory_Type")
	public VoidPointer JVM_TotalMemory() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SunVMI._JVM_TotalMemoryOffset_));
	}

	// JVM_TotalMemory_Type JVM_TotalMemory
	public PointerPointer JVM_TotalMemoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SunVMI._JVM_TotalMemoryOffset_));
	}

	// UDATA reserved
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reservedOffset_", declaredType="UDATA")
	public UDATA reserved() throws CorruptDataException {
		return getUDATAAtOffset(SunVMI._reservedOffset_);
	}

	// UDATA reserved
	public UDATAPointer reservedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SunVMI._reservedOffset_));
	}

}
