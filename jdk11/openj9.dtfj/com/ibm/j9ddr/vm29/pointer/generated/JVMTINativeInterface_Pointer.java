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
 * Structure: JVMTINativeInterface_Pointer
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
 * The generated code will provide getters for all elements in the JVMTINativeInterface_Pointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=JVMTINativeInterface_.class)
public class JVMTINativeInterface_Pointer extends StructurePointer {

	// NULL
	public static final JVMTINativeInterface_Pointer NULL = new JVMTINativeInterface_Pointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected JVMTINativeInterface_Pointer(long address) {
		super(address);
	}

	public static JVMTINativeInterface_Pointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static JVMTINativeInterface_Pointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static JVMTINativeInterface_Pointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new JVMTINativeInterface_Pointer(address);
	}

	public JVMTINativeInterface_Pointer add(long count) {
		return JVMTINativeInterface_Pointer.cast(address + (JVMTINativeInterface_.SIZEOF * count));
	}

	public JVMTINativeInterface_Pointer add(Scalar count) {
		return add(count.longValue());
	}

	public JVMTINativeInterface_Pointer addOffset(long offset) {
		return JVMTINativeInterface_Pointer.cast(address + offset);
	}

	public JVMTINativeInterface_Pointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public JVMTINativeInterface_Pointer sub(long count) {
		return JVMTINativeInterface_Pointer.cast(address - (JVMTINativeInterface_.SIZEOF * count));
	}

	public JVMTINativeInterface_Pointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public JVMTINativeInterface_Pointer subOffset(long offset) {
		return JVMTINativeInterface_Pointer.cast(address - offset);
	}

	public JVMTINativeInterface_Pointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public JVMTINativeInterface_Pointer untag(long mask) {
		return JVMTINativeInterface_Pointer.cast(address & ~mask);
	}

	public JVMTINativeInterface_Pointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return JVMTINativeInterface_.SIZEOF;
	}

	// Implementation methods

	// void* AddCapabilities
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_AddCapabilitiesOffset_", declaredType="void*")
	public VoidPointer AddCapabilities() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._AddCapabilitiesOffset_));
	}

	// void* AddCapabilities
	public PointerPointer AddCapabilitiesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._AddCapabilitiesOffset_));
	}

	// void* AddModuleExports
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_AddModuleExportsOffset_", declaredType="void*")
	public VoidPointer AddModuleExports() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._AddModuleExportsOffset_));
	}

	// void* AddModuleExports
	public PointerPointer AddModuleExportsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._AddModuleExportsOffset_));
	}

	// void* AddModuleOpens
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_AddModuleOpensOffset_", declaredType="void*")
	public VoidPointer AddModuleOpens() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._AddModuleOpensOffset_));
	}

	// void* AddModuleOpens
	public PointerPointer AddModuleOpensEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._AddModuleOpensOffset_));
	}

	// void* AddModuleProvides
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_AddModuleProvidesOffset_", declaredType="void*")
	public VoidPointer AddModuleProvides() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._AddModuleProvidesOffset_));
	}

	// void* AddModuleProvides
	public PointerPointer AddModuleProvidesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._AddModuleProvidesOffset_));
	}

	// void* AddModuleReads
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_AddModuleReadsOffset_", declaredType="void*")
	public VoidPointer AddModuleReads() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._AddModuleReadsOffset_));
	}

	// void* AddModuleReads
	public PointerPointer AddModuleReadsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._AddModuleReadsOffset_));
	}

	// void* AddModuleUses
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_AddModuleUsesOffset_", declaredType="void*")
	public VoidPointer AddModuleUses() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._AddModuleUsesOffset_));
	}

	// void* AddModuleUses
	public PointerPointer AddModuleUsesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._AddModuleUsesOffset_));
	}

	// void* AddToBootstrapClassLoaderSearch
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_AddToBootstrapClassLoaderSearchOffset_", declaredType="void*")
	public VoidPointer AddToBootstrapClassLoaderSearch() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._AddToBootstrapClassLoaderSearchOffset_));
	}

	// void* AddToBootstrapClassLoaderSearch
	public PointerPointer AddToBootstrapClassLoaderSearchEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._AddToBootstrapClassLoaderSearchOffset_));
	}

	// void* AddToSystemClassLoaderSearch
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_AddToSystemClassLoaderSearchOffset_", declaredType="void*")
	public VoidPointer AddToSystemClassLoaderSearch() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._AddToSystemClassLoaderSearchOffset_));
	}

	// void* AddToSystemClassLoaderSearch
	public PointerPointer AddToSystemClassLoaderSearchEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._AddToSystemClassLoaderSearchOffset_));
	}

	// void* Allocate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_AllocateOffset_", declaredType="void*")
	public VoidPointer Allocate() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._AllocateOffset_));
	}

	// void* Allocate
	public PointerPointer AllocateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._AllocateOffset_));
	}

	// void* ClearBreakpoint
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ClearBreakpointOffset_", declaredType="void*")
	public VoidPointer ClearBreakpoint() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._ClearBreakpointOffset_));
	}

	// void* ClearBreakpoint
	public PointerPointer ClearBreakpointEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._ClearBreakpointOffset_));
	}

	// void* ClearFieldAccessWatch
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ClearFieldAccessWatchOffset_", declaredType="void*")
	public VoidPointer ClearFieldAccessWatch() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._ClearFieldAccessWatchOffset_));
	}

	// void* ClearFieldAccessWatch
	public PointerPointer ClearFieldAccessWatchEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._ClearFieldAccessWatchOffset_));
	}

	// void* ClearFieldModificationWatch
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ClearFieldModificationWatchOffset_", declaredType="void*")
	public VoidPointer ClearFieldModificationWatch() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._ClearFieldModificationWatchOffset_));
	}

	// void* ClearFieldModificationWatch
	public PointerPointer ClearFieldModificationWatchEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._ClearFieldModificationWatchOffset_));
	}

	// void* CreateRawMonitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CreateRawMonitorOffset_", declaredType="void*")
	public VoidPointer CreateRawMonitor() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._CreateRawMonitorOffset_));
	}

	// void* CreateRawMonitor
	public PointerPointer CreateRawMonitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._CreateRawMonitorOffset_));
	}

	// void* Deallocate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_DeallocateOffset_", declaredType="void*")
	public VoidPointer Deallocate() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._DeallocateOffset_));
	}

	// void* Deallocate
	public PointerPointer DeallocateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._DeallocateOffset_));
	}

	// void* DestroyRawMonitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_DestroyRawMonitorOffset_", declaredType="void*")
	public VoidPointer DestroyRawMonitor() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._DestroyRawMonitorOffset_));
	}

	// void* DestroyRawMonitor
	public PointerPointer DestroyRawMonitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._DestroyRawMonitorOffset_));
	}

	// void* DisposeEnvironment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_DisposeEnvironmentOffset_", declaredType="void*")
	public VoidPointer DisposeEnvironment() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._DisposeEnvironmentOffset_));
	}

	// void* DisposeEnvironment
	public PointerPointer DisposeEnvironmentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._DisposeEnvironmentOffset_));
	}

	// void* FollowReferences
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_FollowReferencesOffset_", declaredType="void*")
	public VoidPointer FollowReferences() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._FollowReferencesOffset_));
	}

	// void* FollowReferences
	public PointerPointer FollowReferencesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._FollowReferencesOffset_));
	}

	// void* ForceEarlyReturnDouble
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ForceEarlyReturnDoubleOffset_", declaredType="void*")
	public VoidPointer ForceEarlyReturnDouble() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._ForceEarlyReturnDoubleOffset_));
	}

	// void* ForceEarlyReturnDouble
	public PointerPointer ForceEarlyReturnDoubleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._ForceEarlyReturnDoubleOffset_));
	}

	// void* ForceEarlyReturnFloat
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ForceEarlyReturnFloatOffset_", declaredType="void*")
	public VoidPointer ForceEarlyReturnFloat() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._ForceEarlyReturnFloatOffset_));
	}

	// void* ForceEarlyReturnFloat
	public PointerPointer ForceEarlyReturnFloatEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._ForceEarlyReturnFloatOffset_));
	}

	// void* ForceEarlyReturnInt
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ForceEarlyReturnIntOffset_", declaredType="void*")
	public VoidPointer ForceEarlyReturnInt() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._ForceEarlyReturnIntOffset_));
	}

	// void* ForceEarlyReturnInt
	public PointerPointer ForceEarlyReturnIntEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._ForceEarlyReturnIntOffset_));
	}

	// void* ForceEarlyReturnLong
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ForceEarlyReturnLongOffset_", declaredType="void*")
	public VoidPointer ForceEarlyReturnLong() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._ForceEarlyReturnLongOffset_));
	}

	// void* ForceEarlyReturnLong
	public PointerPointer ForceEarlyReturnLongEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._ForceEarlyReturnLongOffset_));
	}

	// void* ForceEarlyReturnObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ForceEarlyReturnObjectOffset_", declaredType="void*")
	public VoidPointer ForceEarlyReturnObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._ForceEarlyReturnObjectOffset_));
	}

	// void* ForceEarlyReturnObject
	public PointerPointer ForceEarlyReturnObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._ForceEarlyReturnObjectOffset_));
	}

	// void* ForceEarlyReturnVoid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ForceEarlyReturnVoidOffset_", declaredType="void*")
	public VoidPointer ForceEarlyReturnVoid() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._ForceEarlyReturnVoidOffset_));
	}

	// void* ForceEarlyReturnVoid
	public PointerPointer ForceEarlyReturnVoidEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._ForceEarlyReturnVoidOffset_));
	}

	// void* ForceGarbageCollection
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ForceGarbageCollectionOffset_", declaredType="void*")
	public VoidPointer ForceGarbageCollection() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._ForceGarbageCollectionOffset_));
	}

	// void* ForceGarbageCollection
	public PointerPointer ForceGarbageCollectionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._ForceGarbageCollectionOffset_));
	}

	// void* GenerateEvents
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GenerateEventsOffset_", declaredType="void*")
	public VoidPointer GenerateEvents() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GenerateEventsOffset_));
	}

	// void* GenerateEvents
	public PointerPointer GenerateEventsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GenerateEventsOffset_));
	}

	// void* GetAllModules
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetAllModulesOffset_", declaredType="void*")
	public VoidPointer GetAllModules() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetAllModulesOffset_));
	}

	// void* GetAllModules
	public PointerPointer GetAllModulesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetAllModulesOffset_));
	}

	// void* GetAllStackTraces
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetAllStackTracesOffset_", declaredType="void*")
	public VoidPointer GetAllStackTraces() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetAllStackTracesOffset_));
	}

	// void* GetAllStackTraces
	public PointerPointer GetAllStackTracesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetAllStackTracesOffset_));
	}

	// void* GetAllThreads
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetAllThreadsOffset_", declaredType="void*")
	public VoidPointer GetAllThreads() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetAllThreadsOffset_));
	}

	// void* GetAllThreads
	public PointerPointer GetAllThreadsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetAllThreadsOffset_));
	}

	// void* GetArgumentsSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetArgumentsSizeOffset_", declaredType="void*")
	public VoidPointer GetArgumentsSize() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetArgumentsSizeOffset_));
	}

	// void* GetArgumentsSize
	public PointerPointer GetArgumentsSizeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetArgumentsSizeOffset_));
	}

	// void* GetAvailableProcessors
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetAvailableProcessorsOffset_", declaredType="void*")
	public VoidPointer GetAvailableProcessors() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetAvailableProcessorsOffset_));
	}

	// void* GetAvailableProcessors
	public PointerPointer GetAvailableProcessorsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetAvailableProcessorsOffset_));
	}

	// void* GetBytecodes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetBytecodesOffset_", declaredType="void*")
	public VoidPointer GetBytecodes() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetBytecodesOffset_));
	}

	// void* GetBytecodes
	public PointerPointer GetBytecodesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetBytecodesOffset_));
	}

	// void* GetCapabilities
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetCapabilitiesOffset_", declaredType="void*")
	public VoidPointer GetCapabilities() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetCapabilitiesOffset_));
	}

	// void* GetCapabilities
	public PointerPointer GetCapabilitiesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetCapabilitiesOffset_));
	}

	// void* GetClassFields
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetClassFieldsOffset_", declaredType="void*")
	public VoidPointer GetClassFields() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetClassFieldsOffset_));
	}

	// void* GetClassFields
	public PointerPointer GetClassFieldsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetClassFieldsOffset_));
	}

	// void* GetClassLoader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetClassLoaderOffset_", declaredType="void*")
	public VoidPointer GetClassLoader() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetClassLoaderOffset_));
	}

	// void* GetClassLoader
	public PointerPointer GetClassLoaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetClassLoaderOffset_));
	}

	// void* GetClassLoaderClasses
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetClassLoaderClassesOffset_", declaredType="void*")
	public VoidPointer GetClassLoaderClasses() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetClassLoaderClassesOffset_));
	}

	// void* GetClassLoaderClasses
	public PointerPointer GetClassLoaderClassesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetClassLoaderClassesOffset_));
	}

	// void* GetClassMethods
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetClassMethodsOffset_", declaredType="void*")
	public VoidPointer GetClassMethods() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetClassMethodsOffset_));
	}

	// void* GetClassMethods
	public PointerPointer GetClassMethodsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetClassMethodsOffset_));
	}

	// void* GetClassModifiers
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetClassModifiersOffset_", declaredType="void*")
	public VoidPointer GetClassModifiers() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetClassModifiersOffset_));
	}

	// void* GetClassModifiers
	public PointerPointer GetClassModifiersEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetClassModifiersOffset_));
	}

	// void* GetClassSignature
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetClassSignatureOffset_", declaredType="void*")
	public VoidPointer GetClassSignature() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetClassSignatureOffset_));
	}

	// void* GetClassSignature
	public PointerPointer GetClassSignatureEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetClassSignatureOffset_));
	}

	// void* GetClassStatus
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetClassStatusOffset_", declaredType="void*")
	public VoidPointer GetClassStatus() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetClassStatusOffset_));
	}

	// void* GetClassStatus
	public PointerPointer GetClassStatusEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetClassStatusOffset_));
	}

	// void* GetClassVersionNumbers
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetClassVersionNumbersOffset_", declaredType="void*")
	public VoidPointer GetClassVersionNumbers() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetClassVersionNumbersOffset_));
	}

	// void* GetClassVersionNumbers
	public PointerPointer GetClassVersionNumbersEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetClassVersionNumbersOffset_));
	}

	// void* GetConstantPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetConstantPoolOffset_", declaredType="void*")
	public VoidPointer GetConstantPool() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetConstantPoolOffset_));
	}

	// void* GetConstantPool
	public PointerPointer GetConstantPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetConstantPoolOffset_));
	}

	// void* GetCurrentContendedMonitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetCurrentContendedMonitorOffset_", declaredType="void*")
	public VoidPointer GetCurrentContendedMonitor() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetCurrentContendedMonitorOffset_));
	}

	// void* GetCurrentContendedMonitor
	public PointerPointer GetCurrentContendedMonitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetCurrentContendedMonitorOffset_));
	}

	// void* GetCurrentThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetCurrentThreadOffset_", declaredType="void*")
	public VoidPointer GetCurrentThread() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetCurrentThreadOffset_));
	}

	// void* GetCurrentThread
	public PointerPointer GetCurrentThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetCurrentThreadOffset_));
	}

	// void* GetCurrentThreadCpuTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetCurrentThreadCpuTimeOffset_", declaredType="void*")
	public VoidPointer GetCurrentThreadCpuTime() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetCurrentThreadCpuTimeOffset_));
	}

	// void* GetCurrentThreadCpuTime
	public PointerPointer GetCurrentThreadCpuTimeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetCurrentThreadCpuTimeOffset_));
	}

	// void* GetCurrentThreadCpuTimerInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetCurrentThreadCpuTimerInfoOffset_", declaredType="void*")
	public VoidPointer GetCurrentThreadCpuTimerInfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetCurrentThreadCpuTimerInfoOffset_));
	}

	// void* GetCurrentThreadCpuTimerInfo
	public PointerPointer GetCurrentThreadCpuTimerInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetCurrentThreadCpuTimerInfoOffset_));
	}

	// void* GetEnvironmentLocalStorage
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetEnvironmentLocalStorageOffset_", declaredType="void*")
	public VoidPointer GetEnvironmentLocalStorage() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetEnvironmentLocalStorageOffset_));
	}

	// void* GetEnvironmentLocalStorage
	public PointerPointer GetEnvironmentLocalStorageEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetEnvironmentLocalStorageOffset_));
	}

	// void* GetErrorName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetErrorNameOffset_", declaredType="void*")
	public VoidPointer GetErrorName() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetErrorNameOffset_));
	}

	// void* GetErrorName
	public PointerPointer GetErrorNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetErrorNameOffset_));
	}

	// void* GetExtensionEvents
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetExtensionEventsOffset_", declaredType="void*")
	public VoidPointer GetExtensionEvents() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetExtensionEventsOffset_));
	}

	// void* GetExtensionEvents
	public PointerPointer GetExtensionEventsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetExtensionEventsOffset_));
	}

	// void* GetExtensionFunctions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetExtensionFunctionsOffset_", declaredType="void*")
	public VoidPointer GetExtensionFunctions() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetExtensionFunctionsOffset_));
	}

	// void* GetExtensionFunctions
	public PointerPointer GetExtensionFunctionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetExtensionFunctionsOffset_));
	}

	// void* GetFieldDeclaringClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetFieldDeclaringClassOffset_", declaredType="void*")
	public VoidPointer GetFieldDeclaringClass() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetFieldDeclaringClassOffset_));
	}

	// void* GetFieldDeclaringClass
	public PointerPointer GetFieldDeclaringClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetFieldDeclaringClassOffset_));
	}

	// void* GetFieldModifiers
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetFieldModifiersOffset_", declaredType="void*")
	public VoidPointer GetFieldModifiers() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetFieldModifiersOffset_));
	}

	// void* GetFieldModifiers
	public PointerPointer GetFieldModifiersEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetFieldModifiersOffset_));
	}

	// void* GetFieldName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetFieldNameOffset_", declaredType="void*")
	public VoidPointer GetFieldName() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetFieldNameOffset_));
	}

	// void* GetFieldName
	public PointerPointer GetFieldNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetFieldNameOffset_));
	}

	// void* GetFrameCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetFrameCountOffset_", declaredType="void*")
	public VoidPointer GetFrameCount() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetFrameCountOffset_));
	}

	// void* GetFrameCount
	public PointerPointer GetFrameCountEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetFrameCountOffset_));
	}

	// void* GetFrameLocation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetFrameLocationOffset_", declaredType="void*")
	public VoidPointer GetFrameLocation() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetFrameLocationOffset_));
	}

	// void* GetFrameLocation
	public PointerPointer GetFrameLocationEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetFrameLocationOffset_));
	}

	// void* GetImplementedInterfaces
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetImplementedInterfacesOffset_", declaredType="void*")
	public VoidPointer GetImplementedInterfaces() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetImplementedInterfacesOffset_));
	}

	// void* GetImplementedInterfaces
	public PointerPointer GetImplementedInterfacesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetImplementedInterfacesOffset_));
	}

	// void* GetJLocationFormat
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetJLocationFormatOffset_", declaredType="void*")
	public VoidPointer GetJLocationFormat() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetJLocationFormatOffset_));
	}

	// void* GetJLocationFormat
	public PointerPointer GetJLocationFormatEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetJLocationFormatOffset_));
	}

	// void* GetJNIFunctionTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetJNIFunctionTableOffset_", declaredType="void*")
	public VoidPointer GetJNIFunctionTable() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetJNIFunctionTableOffset_));
	}

	// void* GetJNIFunctionTable
	public PointerPointer GetJNIFunctionTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetJNIFunctionTableOffset_));
	}

	// void* GetLineNumberTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetLineNumberTableOffset_", declaredType="void*")
	public VoidPointer GetLineNumberTable() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetLineNumberTableOffset_));
	}

	// void* GetLineNumberTable
	public PointerPointer GetLineNumberTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetLineNumberTableOffset_));
	}

	// void* GetLoadedClasses
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetLoadedClassesOffset_", declaredType="void*")
	public VoidPointer GetLoadedClasses() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetLoadedClassesOffset_));
	}

	// void* GetLoadedClasses
	public PointerPointer GetLoadedClassesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetLoadedClassesOffset_));
	}

	// void* GetLocalDouble
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetLocalDoubleOffset_", declaredType="void*")
	public VoidPointer GetLocalDouble() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetLocalDoubleOffset_));
	}

	// void* GetLocalDouble
	public PointerPointer GetLocalDoubleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetLocalDoubleOffset_));
	}

	// void* GetLocalFloat
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetLocalFloatOffset_", declaredType="void*")
	public VoidPointer GetLocalFloat() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetLocalFloatOffset_));
	}

	// void* GetLocalFloat
	public PointerPointer GetLocalFloatEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetLocalFloatOffset_));
	}

	// void* GetLocalInstance
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetLocalInstanceOffset_", declaredType="void*")
	public VoidPointer GetLocalInstance() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetLocalInstanceOffset_));
	}

	// void* GetLocalInstance
	public PointerPointer GetLocalInstanceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetLocalInstanceOffset_));
	}

	// void* GetLocalInt
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetLocalIntOffset_", declaredType="void*")
	public VoidPointer GetLocalInt() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetLocalIntOffset_));
	}

	// void* GetLocalInt
	public PointerPointer GetLocalIntEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetLocalIntOffset_));
	}

	// void* GetLocalLong
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetLocalLongOffset_", declaredType="void*")
	public VoidPointer GetLocalLong() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetLocalLongOffset_));
	}

	// void* GetLocalLong
	public PointerPointer GetLocalLongEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetLocalLongOffset_));
	}

	// void* GetLocalObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetLocalObjectOffset_", declaredType="void*")
	public VoidPointer GetLocalObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetLocalObjectOffset_));
	}

	// void* GetLocalObject
	public PointerPointer GetLocalObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetLocalObjectOffset_));
	}

	// void* GetLocalVariableTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetLocalVariableTableOffset_", declaredType="void*")
	public VoidPointer GetLocalVariableTable() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetLocalVariableTableOffset_));
	}

	// void* GetLocalVariableTable
	public PointerPointer GetLocalVariableTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetLocalVariableTableOffset_));
	}

	// void* GetMaxLocals
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetMaxLocalsOffset_", declaredType="void*")
	public VoidPointer GetMaxLocals() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetMaxLocalsOffset_));
	}

	// void* GetMaxLocals
	public PointerPointer GetMaxLocalsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetMaxLocalsOffset_));
	}

	// void* GetMethodDeclaringClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetMethodDeclaringClassOffset_", declaredType="void*")
	public VoidPointer GetMethodDeclaringClass() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetMethodDeclaringClassOffset_));
	}

	// void* GetMethodDeclaringClass
	public PointerPointer GetMethodDeclaringClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetMethodDeclaringClassOffset_));
	}

	// void* GetMethodLocation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetMethodLocationOffset_", declaredType="void*")
	public VoidPointer GetMethodLocation() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetMethodLocationOffset_));
	}

	// void* GetMethodLocation
	public PointerPointer GetMethodLocationEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetMethodLocationOffset_));
	}

	// void* GetMethodModifiers
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetMethodModifiersOffset_", declaredType="void*")
	public VoidPointer GetMethodModifiers() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetMethodModifiersOffset_));
	}

	// void* GetMethodModifiers
	public PointerPointer GetMethodModifiersEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetMethodModifiersOffset_));
	}

	// void* GetMethodName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetMethodNameOffset_", declaredType="void*")
	public VoidPointer GetMethodName() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetMethodNameOffset_));
	}

	// void* GetMethodName
	public PointerPointer GetMethodNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetMethodNameOffset_));
	}

	// void* GetNamedModule
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetNamedModuleOffset_", declaredType="void*")
	public VoidPointer GetNamedModule() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetNamedModuleOffset_));
	}

	// void* GetNamedModule
	public PointerPointer GetNamedModuleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetNamedModuleOffset_));
	}

	// void* GetObjectHashCode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetObjectHashCodeOffset_", declaredType="void*")
	public VoidPointer GetObjectHashCode() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetObjectHashCodeOffset_));
	}

	// void* GetObjectHashCode
	public PointerPointer GetObjectHashCodeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetObjectHashCodeOffset_));
	}

	// void* GetObjectMonitorUsage
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetObjectMonitorUsageOffset_", declaredType="void*")
	public VoidPointer GetObjectMonitorUsage() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetObjectMonitorUsageOffset_));
	}

	// void* GetObjectMonitorUsage
	public PointerPointer GetObjectMonitorUsageEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetObjectMonitorUsageOffset_));
	}

	// void* GetObjectSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetObjectSizeOffset_", declaredType="void*")
	public VoidPointer GetObjectSize() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetObjectSizeOffset_));
	}

	// void* GetObjectSize
	public PointerPointer GetObjectSizeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetObjectSizeOffset_));
	}

	// void* GetObjectsWithTags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetObjectsWithTagsOffset_", declaredType="void*")
	public VoidPointer GetObjectsWithTags() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetObjectsWithTagsOffset_));
	}

	// void* GetObjectsWithTags
	public PointerPointer GetObjectsWithTagsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetObjectsWithTagsOffset_));
	}

	// void* GetOwnedMonitorInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetOwnedMonitorInfoOffset_", declaredType="void*")
	public VoidPointer GetOwnedMonitorInfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetOwnedMonitorInfoOffset_));
	}

	// void* GetOwnedMonitorInfo
	public PointerPointer GetOwnedMonitorInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetOwnedMonitorInfoOffset_));
	}

	// void* GetOwnedMonitorStackDepthInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetOwnedMonitorStackDepthInfoOffset_", declaredType="void*")
	public VoidPointer GetOwnedMonitorStackDepthInfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetOwnedMonitorStackDepthInfoOffset_));
	}

	// void* GetOwnedMonitorStackDepthInfo
	public PointerPointer GetOwnedMonitorStackDepthInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetOwnedMonitorStackDepthInfoOffset_));
	}

	// void* GetPhase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetPhaseOffset_", declaredType="void*")
	public VoidPointer GetPhase() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetPhaseOffset_));
	}

	// void* GetPhase
	public PointerPointer GetPhaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetPhaseOffset_));
	}

	// void* GetPotentialCapabilities
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetPotentialCapabilitiesOffset_", declaredType="void*")
	public VoidPointer GetPotentialCapabilities() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetPotentialCapabilitiesOffset_));
	}

	// void* GetPotentialCapabilities
	public PointerPointer GetPotentialCapabilitiesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetPotentialCapabilitiesOffset_));
	}

	// void* GetSourceDebugExtension
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetSourceDebugExtensionOffset_", declaredType="void*")
	public VoidPointer GetSourceDebugExtension() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetSourceDebugExtensionOffset_));
	}

	// void* GetSourceDebugExtension
	public PointerPointer GetSourceDebugExtensionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetSourceDebugExtensionOffset_));
	}

	// void* GetSourceFileName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetSourceFileNameOffset_", declaredType="void*")
	public VoidPointer GetSourceFileName() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetSourceFileNameOffset_));
	}

	// void* GetSourceFileName
	public PointerPointer GetSourceFileNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetSourceFileNameOffset_));
	}

	// void* GetStackTrace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetStackTraceOffset_", declaredType="void*")
	public VoidPointer GetStackTrace() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetStackTraceOffset_));
	}

	// void* GetStackTrace
	public PointerPointer GetStackTraceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetStackTraceOffset_));
	}

	// void* GetSystemProperties
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetSystemPropertiesOffset_", declaredType="void*")
	public VoidPointer GetSystemProperties() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetSystemPropertiesOffset_));
	}

	// void* GetSystemProperties
	public PointerPointer GetSystemPropertiesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetSystemPropertiesOffset_));
	}

	// void* GetSystemProperty
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetSystemPropertyOffset_", declaredType="void*")
	public VoidPointer GetSystemProperty() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetSystemPropertyOffset_));
	}

	// void* GetSystemProperty
	public PointerPointer GetSystemPropertyEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetSystemPropertyOffset_));
	}

	// void* GetTag
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetTagOffset_", declaredType="void*")
	public VoidPointer GetTag() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetTagOffset_));
	}

	// void* GetTag
	public PointerPointer GetTagEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetTagOffset_));
	}

	// void* GetThreadCpuTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetThreadCpuTimeOffset_", declaredType="void*")
	public VoidPointer GetThreadCpuTime() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetThreadCpuTimeOffset_));
	}

	// void* GetThreadCpuTime
	public PointerPointer GetThreadCpuTimeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetThreadCpuTimeOffset_));
	}

	// void* GetThreadCpuTimerInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetThreadCpuTimerInfoOffset_", declaredType="void*")
	public VoidPointer GetThreadCpuTimerInfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetThreadCpuTimerInfoOffset_));
	}

	// void* GetThreadCpuTimerInfo
	public PointerPointer GetThreadCpuTimerInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetThreadCpuTimerInfoOffset_));
	}

	// void* GetThreadGroupChildren
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetThreadGroupChildrenOffset_", declaredType="void*")
	public VoidPointer GetThreadGroupChildren() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetThreadGroupChildrenOffset_));
	}

	// void* GetThreadGroupChildren
	public PointerPointer GetThreadGroupChildrenEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetThreadGroupChildrenOffset_));
	}

	// void* GetThreadGroupInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetThreadGroupInfoOffset_", declaredType="void*")
	public VoidPointer GetThreadGroupInfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetThreadGroupInfoOffset_));
	}

	// void* GetThreadGroupInfo
	public PointerPointer GetThreadGroupInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetThreadGroupInfoOffset_));
	}

	// void* GetThreadInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetThreadInfoOffset_", declaredType="void*")
	public VoidPointer GetThreadInfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetThreadInfoOffset_));
	}

	// void* GetThreadInfo
	public PointerPointer GetThreadInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetThreadInfoOffset_));
	}

	// void* GetThreadListStackTraces
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetThreadListStackTracesOffset_", declaredType="void*")
	public VoidPointer GetThreadListStackTraces() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetThreadListStackTracesOffset_));
	}

	// void* GetThreadListStackTraces
	public PointerPointer GetThreadListStackTracesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetThreadListStackTracesOffset_));
	}

	// void* GetThreadLocalStorage
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetThreadLocalStorageOffset_", declaredType="void*")
	public VoidPointer GetThreadLocalStorage() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetThreadLocalStorageOffset_));
	}

	// void* GetThreadLocalStorage
	public PointerPointer GetThreadLocalStorageEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetThreadLocalStorageOffset_));
	}

	// void* GetThreadState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetThreadStateOffset_", declaredType="void*")
	public VoidPointer GetThreadState() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetThreadStateOffset_));
	}

	// void* GetThreadState
	public PointerPointer GetThreadStateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetThreadStateOffset_));
	}

	// void* GetTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetTimeOffset_", declaredType="void*")
	public VoidPointer GetTime() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetTimeOffset_));
	}

	// void* GetTime
	public PointerPointer GetTimeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetTimeOffset_));
	}

	// void* GetTimerInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetTimerInfoOffset_", declaredType="void*")
	public VoidPointer GetTimerInfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetTimerInfoOffset_));
	}

	// void* GetTimerInfo
	public PointerPointer GetTimerInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetTimerInfoOffset_));
	}

	// void* GetTopThreadGroups
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetTopThreadGroupsOffset_", declaredType="void*")
	public VoidPointer GetTopThreadGroups() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetTopThreadGroupsOffset_));
	}

	// void* GetTopThreadGroups
	public PointerPointer GetTopThreadGroupsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetTopThreadGroupsOffset_));
	}

	// void* GetVersionNumber
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_GetVersionNumberOffset_", declaredType="void*")
	public VoidPointer GetVersionNumber() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._GetVersionNumberOffset_));
	}

	// void* GetVersionNumber
	public PointerPointer GetVersionNumberEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._GetVersionNumberOffset_));
	}

	// void* InterruptThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_InterruptThreadOffset_", declaredType="void*")
	public VoidPointer InterruptThread() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._InterruptThreadOffset_));
	}

	// void* InterruptThread
	public PointerPointer InterruptThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._InterruptThreadOffset_));
	}

	// void* IsArrayClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_IsArrayClassOffset_", declaredType="void*")
	public VoidPointer IsArrayClass() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._IsArrayClassOffset_));
	}

	// void* IsArrayClass
	public PointerPointer IsArrayClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._IsArrayClassOffset_));
	}

	// void* IsFieldSynthetic
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_IsFieldSyntheticOffset_", declaredType="void*")
	public VoidPointer IsFieldSynthetic() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._IsFieldSyntheticOffset_));
	}

	// void* IsFieldSynthetic
	public PointerPointer IsFieldSyntheticEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._IsFieldSyntheticOffset_));
	}

	// void* IsInterface
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_IsInterfaceOffset_", declaredType="void*")
	public VoidPointer IsInterface() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._IsInterfaceOffset_));
	}

	// void* IsInterface
	public PointerPointer IsInterfaceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._IsInterfaceOffset_));
	}

	// void* IsMethodNative
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_IsMethodNativeOffset_", declaredType="void*")
	public VoidPointer IsMethodNative() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._IsMethodNativeOffset_));
	}

	// void* IsMethodNative
	public PointerPointer IsMethodNativeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._IsMethodNativeOffset_));
	}

	// void* IsMethodObsolete
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_IsMethodObsoleteOffset_", declaredType="void*")
	public VoidPointer IsMethodObsolete() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._IsMethodObsoleteOffset_));
	}

	// void* IsMethodObsolete
	public PointerPointer IsMethodObsoleteEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._IsMethodObsoleteOffset_));
	}

	// void* IsMethodSynthetic
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_IsMethodSyntheticOffset_", declaredType="void*")
	public VoidPointer IsMethodSynthetic() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._IsMethodSyntheticOffset_));
	}

	// void* IsMethodSynthetic
	public PointerPointer IsMethodSyntheticEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._IsMethodSyntheticOffset_));
	}

	// void* IsModifiableClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_IsModifiableClassOffset_", declaredType="void*")
	public VoidPointer IsModifiableClass() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._IsModifiableClassOffset_));
	}

	// void* IsModifiableClass
	public PointerPointer IsModifiableClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._IsModifiableClassOffset_));
	}

	// void* IsModifiableModule
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_IsModifiableModuleOffset_", declaredType="void*")
	public VoidPointer IsModifiableModule() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._IsModifiableModuleOffset_));
	}

	// void* IsModifiableModule
	public PointerPointer IsModifiableModuleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._IsModifiableModuleOffset_));
	}

	// void* IterateOverHeap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_IterateOverHeapOffset_", declaredType="void*")
	public VoidPointer IterateOverHeap() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._IterateOverHeapOffset_));
	}

	// void* IterateOverHeap
	public PointerPointer IterateOverHeapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._IterateOverHeapOffset_));
	}

	// void* IterateOverInstancesOfClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_IterateOverInstancesOfClassOffset_", declaredType="void*")
	public VoidPointer IterateOverInstancesOfClass() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._IterateOverInstancesOfClassOffset_));
	}

	// void* IterateOverInstancesOfClass
	public PointerPointer IterateOverInstancesOfClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._IterateOverInstancesOfClassOffset_));
	}

	// void* IterateOverObjectsReachableFromObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_IterateOverObjectsReachableFromObjectOffset_", declaredType="void*")
	public VoidPointer IterateOverObjectsReachableFromObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._IterateOverObjectsReachableFromObjectOffset_));
	}

	// void* IterateOverObjectsReachableFromObject
	public PointerPointer IterateOverObjectsReachableFromObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._IterateOverObjectsReachableFromObjectOffset_));
	}

	// void* IterateOverReachableObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_IterateOverReachableObjectsOffset_", declaredType="void*")
	public VoidPointer IterateOverReachableObjects() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._IterateOverReachableObjectsOffset_));
	}

	// void* IterateOverReachableObjects
	public PointerPointer IterateOverReachableObjectsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._IterateOverReachableObjectsOffset_));
	}

	// void* IterateThroughHeap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_IterateThroughHeapOffset_", declaredType="void*")
	public VoidPointer IterateThroughHeap() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._IterateThroughHeapOffset_));
	}

	// void* IterateThroughHeap
	public PointerPointer IterateThroughHeapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._IterateThroughHeapOffset_));
	}

	// void* NotifyFramePop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_NotifyFramePopOffset_", declaredType="void*")
	public VoidPointer NotifyFramePop() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._NotifyFramePopOffset_));
	}

	// void* NotifyFramePop
	public PointerPointer NotifyFramePopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._NotifyFramePopOffset_));
	}

	// void* PopFrame
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_PopFrameOffset_", declaredType="void*")
	public VoidPointer PopFrame() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._PopFrameOffset_));
	}

	// void* PopFrame
	public PointerPointer PopFrameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._PopFrameOffset_));
	}

	// void* RawMonitorEnter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_RawMonitorEnterOffset_", declaredType="void*")
	public VoidPointer RawMonitorEnter() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._RawMonitorEnterOffset_));
	}

	// void* RawMonitorEnter
	public PointerPointer RawMonitorEnterEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._RawMonitorEnterOffset_));
	}

	// void* RawMonitorExit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_RawMonitorExitOffset_", declaredType="void*")
	public VoidPointer RawMonitorExit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._RawMonitorExitOffset_));
	}

	// void* RawMonitorExit
	public PointerPointer RawMonitorExitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._RawMonitorExitOffset_));
	}

	// void* RawMonitorNotify
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_RawMonitorNotifyOffset_", declaredType="void*")
	public VoidPointer RawMonitorNotify() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._RawMonitorNotifyOffset_));
	}

	// void* RawMonitorNotify
	public PointerPointer RawMonitorNotifyEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._RawMonitorNotifyOffset_));
	}

	// void* RawMonitorNotifyAll
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_RawMonitorNotifyAllOffset_", declaredType="void*")
	public VoidPointer RawMonitorNotifyAll() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._RawMonitorNotifyAllOffset_));
	}

	// void* RawMonitorNotifyAll
	public PointerPointer RawMonitorNotifyAllEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._RawMonitorNotifyAllOffset_));
	}

	// void* RawMonitorWait
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_RawMonitorWaitOffset_", declaredType="void*")
	public VoidPointer RawMonitorWait() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._RawMonitorWaitOffset_));
	}

	// void* RawMonitorWait
	public PointerPointer RawMonitorWaitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._RawMonitorWaitOffset_));
	}

	// void* RedefineClasses
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_RedefineClassesOffset_", declaredType="void*")
	public VoidPointer RedefineClasses() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._RedefineClassesOffset_));
	}

	// void* RedefineClasses
	public PointerPointer RedefineClassesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._RedefineClassesOffset_));
	}

	// void* RelinquishCapabilities
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_RelinquishCapabilitiesOffset_", declaredType="void*")
	public VoidPointer RelinquishCapabilities() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._RelinquishCapabilitiesOffset_));
	}

	// void* RelinquishCapabilities
	public PointerPointer RelinquishCapabilitiesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._RelinquishCapabilitiesOffset_));
	}

	// void* ResumeThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ResumeThreadOffset_", declaredType="void*")
	public VoidPointer ResumeThread() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._ResumeThreadOffset_));
	}

	// void* ResumeThread
	public PointerPointer ResumeThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._ResumeThreadOffset_));
	}

	// void* ResumeThreadList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ResumeThreadListOffset_", declaredType="void*")
	public VoidPointer ResumeThreadList() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._ResumeThreadListOffset_));
	}

	// void* ResumeThreadList
	public PointerPointer ResumeThreadListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._ResumeThreadListOffset_));
	}

	// void* RetransformClasses
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_RetransformClassesOffset_", declaredType="void*")
	public VoidPointer RetransformClasses() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._RetransformClassesOffset_));
	}

	// void* RetransformClasses
	public PointerPointer RetransformClassesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._RetransformClassesOffset_));
	}

	// void* RunAgentThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_RunAgentThreadOffset_", declaredType="void*")
	public VoidPointer RunAgentThread() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._RunAgentThreadOffset_));
	}

	// void* RunAgentThread
	public PointerPointer RunAgentThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._RunAgentThreadOffset_));
	}

	// void* SetBreakpoint
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetBreakpointOffset_", declaredType="void*")
	public VoidPointer SetBreakpoint() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._SetBreakpointOffset_));
	}

	// void* SetBreakpoint
	public PointerPointer SetBreakpointEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._SetBreakpointOffset_));
	}

	// void* SetEnvironmentLocalStorage
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetEnvironmentLocalStorageOffset_", declaredType="void*")
	public VoidPointer SetEnvironmentLocalStorage() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._SetEnvironmentLocalStorageOffset_));
	}

	// void* SetEnvironmentLocalStorage
	public PointerPointer SetEnvironmentLocalStorageEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._SetEnvironmentLocalStorageOffset_));
	}

	// void* SetEventCallbacks
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetEventCallbacksOffset_", declaredType="void*")
	public VoidPointer SetEventCallbacks() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._SetEventCallbacksOffset_));
	}

	// void* SetEventCallbacks
	public PointerPointer SetEventCallbacksEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._SetEventCallbacksOffset_));
	}

	// void* SetEventNotificationMode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetEventNotificationModeOffset_", declaredType="void*")
	public VoidPointer SetEventNotificationMode() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._SetEventNotificationModeOffset_));
	}

	// void* SetEventNotificationMode
	public PointerPointer SetEventNotificationModeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._SetEventNotificationModeOffset_));
	}

	// void* SetExtensionEventCallback
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetExtensionEventCallbackOffset_", declaredType="void*")
	public VoidPointer SetExtensionEventCallback() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._SetExtensionEventCallbackOffset_));
	}

	// void* SetExtensionEventCallback
	public PointerPointer SetExtensionEventCallbackEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._SetExtensionEventCallbackOffset_));
	}

	// void* SetFieldAccessWatch
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetFieldAccessWatchOffset_", declaredType="void*")
	public VoidPointer SetFieldAccessWatch() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._SetFieldAccessWatchOffset_));
	}

	// void* SetFieldAccessWatch
	public PointerPointer SetFieldAccessWatchEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._SetFieldAccessWatchOffset_));
	}

	// void* SetFieldModificationWatch
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetFieldModificationWatchOffset_", declaredType="void*")
	public VoidPointer SetFieldModificationWatch() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._SetFieldModificationWatchOffset_));
	}

	// void* SetFieldModificationWatch
	public PointerPointer SetFieldModificationWatchEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._SetFieldModificationWatchOffset_));
	}

	// void* SetHeapSamplingInterval
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetHeapSamplingIntervalOffset_", declaredType="void*")
	public VoidPointer SetHeapSamplingInterval() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._SetHeapSamplingIntervalOffset_));
	}

	// void* SetHeapSamplingInterval
	public PointerPointer SetHeapSamplingIntervalEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._SetHeapSamplingIntervalOffset_));
	}

	// void* SetJNIFunctionTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetJNIFunctionTableOffset_", declaredType="void*")
	public VoidPointer SetJNIFunctionTable() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._SetJNIFunctionTableOffset_));
	}

	// void* SetJNIFunctionTable
	public PointerPointer SetJNIFunctionTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._SetJNIFunctionTableOffset_));
	}

	// void* SetLocalDouble
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetLocalDoubleOffset_", declaredType="void*")
	public VoidPointer SetLocalDouble() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._SetLocalDoubleOffset_));
	}

	// void* SetLocalDouble
	public PointerPointer SetLocalDoubleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._SetLocalDoubleOffset_));
	}

	// void* SetLocalFloat
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetLocalFloatOffset_", declaredType="void*")
	public VoidPointer SetLocalFloat() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._SetLocalFloatOffset_));
	}

	// void* SetLocalFloat
	public PointerPointer SetLocalFloatEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._SetLocalFloatOffset_));
	}

	// void* SetLocalInt
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetLocalIntOffset_", declaredType="void*")
	public VoidPointer SetLocalInt() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._SetLocalIntOffset_));
	}

	// void* SetLocalInt
	public PointerPointer SetLocalIntEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._SetLocalIntOffset_));
	}

	// void* SetLocalLong
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetLocalLongOffset_", declaredType="void*")
	public VoidPointer SetLocalLong() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._SetLocalLongOffset_));
	}

	// void* SetLocalLong
	public PointerPointer SetLocalLongEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._SetLocalLongOffset_));
	}

	// void* SetLocalObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetLocalObjectOffset_", declaredType="void*")
	public VoidPointer SetLocalObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._SetLocalObjectOffset_));
	}

	// void* SetLocalObject
	public PointerPointer SetLocalObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._SetLocalObjectOffset_));
	}

	// void* SetNativeMethodPrefix
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetNativeMethodPrefixOffset_", declaredType="void*")
	public VoidPointer SetNativeMethodPrefix() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._SetNativeMethodPrefixOffset_));
	}

	// void* SetNativeMethodPrefix
	public PointerPointer SetNativeMethodPrefixEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._SetNativeMethodPrefixOffset_));
	}

	// void* SetNativeMethodPrefixes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetNativeMethodPrefixesOffset_", declaredType="void*")
	public VoidPointer SetNativeMethodPrefixes() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._SetNativeMethodPrefixesOffset_));
	}

	// void* SetNativeMethodPrefixes
	public PointerPointer SetNativeMethodPrefixesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._SetNativeMethodPrefixesOffset_));
	}

	// void* SetSystemProperty
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetSystemPropertyOffset_", declaredType="void*")
	public VoidPointer SetSystemProperty() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._SetSystemPropertyOffset_));
	}

	// void* SetSystemProperty
	public PointerPointer SetSystemPropertyEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._SetSystemPropertyOffset_));
	}

	// void* SetTag
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetTagOffset_", declaredType="void*")
	public VoidPointer SetTag() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._SetTagOffset_));
	}

	// void* SetTag
	public PointerPointer SetTagEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._SetTagOffset_));
	}

	// void* SetThreadLocalStorage
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetThreadLocalStorageOffset_", declaredType="void*")
	public VoidPointer SetThreadLocalStorage() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._SetThreadLocalStorageOffset_));
	}

	// void* SetThreadLocalStorage
	public PointerPointer SetThreadLocalStorageEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._SetThreadLocalStorageOffset_));
	}

	// void* SetVerboseFlag
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SetVerboseFlagOffset_", declaredType="void*")
	public VoidPointer SetVerboseFlag() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._SetVerboseFlagOffset_));
	}

	// void* SetVerboseFlag
	public PointerPointer SetVerboseFlagEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._SetVerboseFlagOffset_));
	}

	// void* StopThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_StopThreadOffset_", declaredType="void*")
	public VoidPointer StopThread() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._StopThreadOffset_));
	}

	// void* StopThread
	public PointerPointer StopThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._StopThreadOffset_));
	}

	// void* SuspendThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SuspendThreadOffset_", declaredType="void*")
	public VoidPointer SuspendThread() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._SuspendThreadOffset_));
	}

	// void* SuspendThread
	public PointerPointer SuspendThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._SuspendThreadOffset_));
	}

	// void* SuspendThreadList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_SuspendThreadListOffset_", declaredType="void*")
	public VoidPointer SuspendThreadList() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._SuspendThreadListOffset_));
	}

	// void* SuspendThreadList
	public PointerPointer SuspendThreadListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._SuspendThreadListOffset_));
	}

	// void* reserved1
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved1Offset_", declaredType="void*")
	public VoidPointer reserved1() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._reserved1Offset_));
	}

	// void* reserved1
	public PointerPointer reserved1EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._reserved1Offset_));
	}

	// void* reserved105
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved105Offset_", declaredType="void*")
	public VoidPointer reserved105() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._reserved105Offset_));
	}

	// void* reserved105
	public PointerPointer reserved105EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._reserved105Offset_));
	}

	// void* reserved113
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved113Offset_", declaredType="void*")
	public VoidPointer reserved113() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._reserved113Offset_));
	}

	// void* reserved113
	public PointerPointer reserved113EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._reserved113Offset_));
	}

	// void* reserved117
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved117Offset_", declaredType="void*")
	public VoidPointer reserved117() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._reserved117Offset_));
	}

	// void* reserved117
	public PointerPointer reserved117EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._reserved117Offset_));
	}

	// void* reserved118
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved118Offset_", declaredType="void*")
	public VoidPointer reserved118() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._reserved118Offset_));
	}

	// void* reserved118
	public PointerPointer reserved118EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._reserved118Offset_));
	}

	// void* reserved119
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved119Offset_", declaredType="void*")
	public VoidPointer reserved119() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._reserved119Offset_));
	}

	// void* reserved119
	public PointerPointer reserved119EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._reserved119Offset_));
	}

	// void* reserved141
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved141Offset_", declaredType="void*")
	public VoidPointer reserved141() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._reserved141Offset_));
	}

	// void* reserved141
	public PointerPointer reserved141EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._reserved141Offset_));
	}

	// void* reserved67
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reserved67Offset_", declaredType="void*")
	public VoidPointer reserved67() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(JVMTINativeInterface_._reserved67Offset_));
	}

	// void* reserved67
	public PointerPointer reserved67EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JVMTINativeInterface_._reserved67Offset_));
	}

}
