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
 * Structure: J9PortLibraryPointer
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
 * The generated code will provide getters for all elements in the J9PortLibraryPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9PortLibrary.class)
public class J9PortLibraryPointer extends StructurePointer {

	// NULL
	public static final J9PortLibraryPointer NULL = new J9PortLibraryPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9PortLibraryPointer(long address) {
		super(address);
	}

	public static J9PortLibraryPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9PortLibraryPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9PortLibraryPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9PortLibraryPointer(address);
	}

	public J9PortLibraryPointer add(long count) {
		return J9PortLibraryPointer.cast(address + (J9PortLibrary.SIZEOF * count));
	}

	public J9PortLibraryPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9PortLibraryPointer addOffset(long offset) {
		return J9PortLibraryPointer.cast(address + offset);
	}

	public J9PortLibraryPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9PortLibraryPointer sub(long count) {
		return J9PortLibraryPointer.cast(address - (J9PortLibrary.SIZEOF * count));
	}

	public J9PortLibraryPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9PortLibraryPointer subOffset(long offset) {
		return J9PortLibraryPointer.cast(address - offset);
	}

	public J9PortLibraryPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9PortLibraryPointer untag(long mask) {
		return J9PortLibraryPointer.cast(address & ~mask);
	}

	public J9PortLibraryPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9PortLibrary.SIZEOF;
	}

	// Implementation methods

	// void* gp_handler_function
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gp_handler_functionOffset_", declaredType="void*")
	public VoidPointer gp_handler_function() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._gp_handler_functionOffset_));
	}

	// void* gp_handler_function
	public PointerPointer gp_handler_functionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._gp_handler_functionOffset_));
	}

	// void* gp_info
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gp_infoOffset_", declaredType="void*")
	public VoidPointer gp_info() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._gp_infoOffset_));
	}

	// void* gp_info
	public PointerPointer gp_infoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._gp_infoOffset_));
	}

	// void* gp_info_count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gp_info_countOffset_", declaredType="void*")
	public VoidPointer gp_info_count() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._gp_info_countOffset_));
	}

	// void* gp_info_count
	public PointerPointer gp_info_countEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._gp_info_countOffset_));
	}

	// void* gp_protect
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gp_protectOffset_", declaredType="void*")
	public VoidPointer gp_protect() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._gp_protectOffset_));
	}

	// void* gp_protect
	public PointerPointer gp_protectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._gp_protectOffset_));
	}

	// void* gp_register_handler
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gp_register_handlerOffset_", declaredType="void*")
	public VoidPointer gp_register_handler() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._gp_register_handlerOffset_));
	}

	// void* gp_register_handler
	public PointerPointer gp_register_handlerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._gp_register_handlerOffset_));
	}

	// void* gp_shutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gp_shutdownOffset_", declaredType="void*")
	public VoidPointer gp_shutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._gp_shutdownOffset_));
	}

	// void* gp_shutdown
	public PointerPointer gp_shutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._gp_shutdownOffset_));
	}

	// void* gp_startup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gp_startupOffset_", declaredType="void*")
	public VoidPointer gp_startup() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._gp_startupOffset_));
	}

	// void* gp_startup
	public PointerPointer gp_startupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._gp_startupOffset_));
	}

	// void* gs_deinitialize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gs_deinitializeOffset_", declaredType="void*")
	public VoidPointer gs_deinitialize() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._gs_deinitializeOffset_));
	}

	// void* gs_deinitialize
	public PointerPointer gs_deinitializeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._gs_deinitializeOffset_));
	}

	// void* gs_disable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gs_disableOffset_", declaredType="void*")
	public VoidPointer gs_disable() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._gs_disableOffset_));
	}

	// void* gs_disable
	public PointerPointer gs_disableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._gs_disableOffset_));
	}

	// void* gs_enable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gs_enableOffset_", declaredType="void*")
	public VoidPointer gs_enable() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._gs_enableOffset_));
	}

	// void* gs_enable
	public PointerPointer gs_enableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._gs_enableOffset_));
	}

	// void* gs_initialize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gs_initializeOffset_", declaredType="void*")
	public VoidPointer gs_initialize() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._gs_initializeOffset_));
	}

	// void* gs_initialize
	public PointerPointer gs_initializeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._gs_initializeOffset_));
	}

	// void* gs_isEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gs_isEnabledOffset_", declaredType="void*")
	public VoidPointer gs_isEnabled() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._gs_isEnabledOffset_));
	}

	// void* gs_isEnabled
	public PointerPointer gs_isEnabledEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._gs_isEnabledOffset_));
	}

	// void* gs_params_init
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gs_params_initOffset_", declaredType="void*")
	public VoidPointer gs_params_init() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._gs_params_initOffset_));
	}

	// void* gs_params_init
	public PointerPointer gs_params_initEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._gs_params_initOffset_));
	}

	// void* hypervisor_get_guest_memory_usage
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hypervisor_get_guest_memory_usageOffset_", declaredType="void*")
	public VoidPointer hypervisor_get_guest_memory_usage() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._hypervisor_get_guest_memory_usageOffset_));
	}

	// void* hypervisor_get_guest_memory_usage
	public PointerPointer hypervisor_get_guest_memory_usageEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._hypervisor_get_guest_memory_usageOffset_));
	}

	// void* hypervisor_get_guest_processor_usage
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hypervisor_get_guest_processor_usageOffset_", declaredType="void*")
	public VoidPointer hypervisor_get_guest_processor_usage() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._hypervisor_get_guest_processor_usageOffset_));
	}

	// void* hypervisor_get_guest_processor_usage
	public PointerPointer hypervisor_get_guest_processor_usageEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._hypervisor_get_guest_processor_usageOffset_));
	}

	// void* hypervisor_get_hypervisor_info
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hypervisor_get_hypervisor_infoOffset_", declaredType="void*")
	public VoidPointer hypervisor_get_hypervisor_info() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._hypervisor_get_hypervisor_infoOffset_));
	}

	// void* hypervisor_get_hypervisor_info
	public PointerPointer hypervisor_get_hypervisor_infoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._hypervisor_get_hypervisor_infoOffset_));
	}

	// void* hypervisor_hypervisor_present
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hypervisor_hypervisor_presentOffset_", declaredType="void*")
	public VoidPointer hypervisor_hypervisor_present() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._hypervisor_hypervisor_presentOffset_));
	}

	// void* hypervisor_hypervisor_present
	public PointerPointer hypervisor_hypervisor_presentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._hypervisor_hypervisor_presentOffset_));
	}

	// void* hypervisor_shutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hypervisor_shutdownOffset_", declaredType="void*")
	public VoidPointer hypervisor_shutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._hypervisor_shutdownOffset_));
	}

	// void* hypervisor_shutdown
	public PointerPointer hypervisor_shutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._hypervisor_shutdownOffset_));
	}

	// void* hypervisor_startup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hypervisor_startupOffset_", declaredType="void*")
	public VoidPointer hypervisor_startup() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._hypervisor_startupOffset_));
	}

	// void* hypervisor_startup
	public PointerPointer hypervisor_startupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._hypervisor_startupOffset_));
	}

	// void* ipcmutex_acquire
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ipcmutex_acquireOffset_", declaredType="void*")
	public VoidPointer ipcmutex_acquire() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._ipcmutex_acquireOffset_));
	}

	// void* ipcmutex_acquire
	public PointerPointer ipcmutex_acquireEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._ipcmutex_acquireOffset_));
	}

	// void* ipcmutex_release
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ipcmutex_releaseOffset_", declaredType="void*")
	public VoidPointer ipcmutex_release() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._ipcmutex_releaseOffset_));
	}

	// void* ipcmutex_release
	public PointerPointer ipcmutex_releaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._ipcmutex_releaseOffset_));
	}

	// void* ipcmutex_shutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ipcmutex_shutdownOffset_", declaredType="void*")
	public VoidPointer ipcmutex_shutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._ipcmutex_shutdownOffset_));
	}

	// void* ipcmutex_shutdown
	public PointerPointer ipcmutex_shutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._ipcmutex_shutdownOffset_));
	}

	// void* ipcmutex_startup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ipcmutex_startupOffset_", declaredType="void*")
	public VoidPointer ipcmutex_startup() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._ipcmutex_startupOffset_));
	}

	// void* ipcmutex_startup
	public PointerPointer ipcmutex_startupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._ipcmutex_startupOffset_));
	}

	// OMRPortLibrary omrPortLibrary
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_omrPortLibraryOffset_", declaredType="OMRPortLibrary")
	public OMRPortLibraryPointer omrPortLibrary() throws CorruptDataException {
		return OMRPortLibraryPointer.cast(nonNullFieldEA(J9PortLibrary._omrPortLibraryOffset_));
	}

	// OMRPortLibrary omrPortLibrary
	public PointerPointer omrPortLibraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._omrPortLibraryOffset_));
	}

	// J9PortLibraryGlobalData* portGlobals
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_portGlobalsOffset_", declaredType="J9PortLibraryGlobalData*")
	public J9PortLibraryGlobalDataPointer portGlobals() throws CorruptDataException {
		return J9PortLibraryGlobalDataPointer.cast(getPointerAtOffset(J9PortLibrary._portGlobalsOffset_));
	}

	// J9PortLibraryGlobalData* portGlobals
	public PointerPointer portGlobalsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._portGlobalsOffset_));
	}

	// J9PortLibraryVersion portVersion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_portVersionOffset_", declaredType="J9PortLibraryVersion")
	public J9PortLibraryVersionPointer portVersion() throws CorruptDataException {
		return J9PortLibraryVersionPointer.cast(nonNullFieldEA(J9PortLibrary._portVersionOffset_));
	}

	// J9PortLibraryVersion portVersion
	public PointerPointer portVersionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._portVersionOffset_));
	}

	// void* port_control
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_port_controlOffset_", declaredType="void*")
	public VoidPointer port_control() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._port_controlOffset_));
	}

	// void* port_control
	public PointerPointer port_controlEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._port_controlOffset_));
	}

	// void* port_create_library
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_port_create_libraryOffset_", declaredType="void*")
	public VoidPointer port_create_library() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._port_create_libraryOffset_));
	}

	// void* port_create_library
	public PointerPointer port_create_libraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._port_create_libraryOffset_));
	}

	// void* port_init_library
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_port_init_libraryOffset_", declaredType="void*")
	public VoidPointer port_init_library() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._port_init_libraryOffset_));
	}

	// void* port_init_library
	public PointerPointer port_init_libraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._port_init_libraryOffset_));
	}

	// void* port_isFunctionOverridden
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_port_isFunctionOverriddenOffset_", declaredType="void*")
	public VoidPointer port_isFunctionOverridden() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._port_isFunctionOverriddenOffset_));
	}

	// void* port_isFunctionOverridden
	public PointerPointer port_isFunctionOverriddenEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._port_isFunctionOverriddenOffset_));
	}

	// void* port_shutdown_library
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_port_shutdown_libraryOffset_", declaredType="void*")
	public VoidPointer port_shutdown_library() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._port_shutdown_libraryOffset_));
	}

	// void* port_shutdown_library
	public PointerPointer port_shutdown_libraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._port_shutdown_libraryOffset_));
	}

	// void* port_startup_library
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_port_startup_libraryOffset_", declaredType="void*")
	public VoidPointer port_startup_library() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._port_startup_libraryOffset_));
	}

	// void* port_startup_library
	public PointerPointer port_startup_libraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._port_startup_libraryOffset_));
	}

	// void* process_close
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_process_closeOffset_", declaredType="void*")
	public VoidPointer process_close() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._process_closeOffset_));
	}

	// void* process_close
	public PointerPointer process_closeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._process_closeOffset_));
	}

	// void* process_create
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_process_createOffset_", declaredType="void*")
	public VoidPointer process_create() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._process_createOffset_));
	}

	// void* process_create
	public PointerPointer process_createEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._process_createOffset_));
	}

	// void* process_getStream
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_process_getStreamOffset_", declaredType="void*")
	public VoidPointer process_getStream() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._process_getStreamOffset_));
	}

	// void* process_getStream
	public PointerPointer process_getStreamEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._process_getStreamOffset_));
	}

	// void* process_get_available
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_process_get_availableOffset_", declaredType="void*")
	public VoidPointer process_get_available() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._process_get_availableOffset_));
	}

	// void* process_get_available
	public PointerPointer process_get_availableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._process_get_availableOffset_));
	}

	// void* process_get_exitCode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_process_get_exitCodeOffset_", declaredType="void*")
	public VoidPointer process_get_exitCode() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._process_get_exitCodeOffset_));
	}

	// void* process_get_exitCode
	public PointerPointer process_get_exitCodeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._process_get_exitCodeOffset_));
	}

	// void* process_isComplete
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_process_isCompleteOffset_", declaredType="void*")
	public VoidPointer process_isComplete() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._process_isCompleteOffset_));
	}

	// void* process_isComplete
	public PointerPointer process_isCompleteEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._process_isCompleteOffset_));
	}

	// void* process_read
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_process_readOffset_", declaredType="void*")
	public VoidPointer process_read() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._process_readOffset_));
	}

	// void* process_read
	public PointerPointer process_readEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._process_readOffset_));
	}

	// void* process_terminate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_process_terminateOffset_", declaredType="void*")
	public VoidPointer process_terminate() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._process_terminateOffset_));
	}

	// void* process_terminate
	public PointerPointer process_terminateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._process_terminateOffset_));
	}

	// void* process_waitfor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_process_waitforOffset_", declaredType="void*")
	public VoidPointer process_waitfor() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._process_waitforOffset_));
	}

	// void* process_waitfor
	public PointerPointer process_waitforEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._process_waitforOffset_));
	}

	// void* process_write
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_process_writeOffset_", declaredType="void*")
	public VoidPointer process_write() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._process_writeOffset_));
	}

	// void* process_write
	public PointerPointer process_writeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._process_writeOffset_));
	}

	// void* self_handle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_self_handleOffset_", declaredType="void*")
	public VoidPointer self_handle() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._self_handleOffset_));
	}

	// void* self_handle
	public PointerPointer self_handleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._self_handleOffset_));
	}

	// void* shmem_attach
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_attachOffset_", declaredType="void*")
	public VoidPointer shmem_attach() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shmem_attachOffset_));
	}

	// void* shmem_attach
	public PointerPointer shmem_attachEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shmem_attachOffset_));
	}

	// void* shmem_close
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_closeOffset_", declaredType="void*")
	public VoidPointer shmem_close() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shmem_closeOffset_));
	}

	// void* shmem_close
	public PointerPointer shmem_closeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shmem_closeOffset_));
	}

	// void* shmem_createDir
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_createDirOffset_", declaredType="void*")
	public VoidPointer shmem_createDir() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shmem_createDirOffset_));
	}

	// void* shmem_createDir
	public PointerPointer shmem_createDirEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shmem_createDirOffset_));
	}

	// void* shmem_destroy
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_destroyOffset_", declaredType="void*")
	public VoidPointer shmem_destroy() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shmem_destroyOffset_));
	}

	// void* shmem_destroy
	public PointerPointer shmem_destroyEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shmem_destroyOffset_));
	}

	// void* shmem_destroyDeprecated
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_destroyDeprecatedOffset_", declaredType="void*")
	public VoidPointer shmem_destroyDeprecated() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shmem_destroyDeprecatedOffset_));
	}

	// void* shmem_destroyDeprecated
	public PointerPointer shmem_destroyDeprecatedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shmem_destroyDeprecatedOffset_));
	}

	// void* shmem_detach
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_detachOffset_", declaredType="void*")
	public VoidPointer shmem_detach() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shmem_detachOffset_));
	}

	// void* shmem_detach
	public PointerPointer shmem_detachEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shmem_detachOffset_));
	}

	// void* shmem_findclose
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_findcloseOffset_", declaredType="void*")
	public VoidPointer shmem_findclose() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shmem_findcloseOffset_));
	}

	// void* shmem_findclose
	public PointerPointer shmem_findcloseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shmem_findcloseOffset_));
	}

	// void* shmem_findfirst
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_findfirstOffset_", declaredType="void*")
	public VoidPointer shmem_findfirst() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shmem_findfirstOffset_));
	}

	// void* shmem_findfirst
	public PointerPointer shmem_findfirstEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shmem_findfirstOffset_));
	}

	// void* shmem_findnext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_findnextOffset_", declaredType="void*")
	public VoidPointer shmem_findnext() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shmem_findnextOffset_));
	}

	// void* shmem_findnext
	public PointerPointer shmem_findnextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shmem_findnextOffset_));
	}

	// void* shmem_getDir
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_getDirOffset_", declaredType="void*")
	public VoidPointer shmem_getDir() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shmem_getDirOffset_));
	}

	// void* shmem_getDir
	public PointerPointer shmem_getDirEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shmem_getDirOffset_));
	}

	// void* shmem_getFilepath
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_getFilepathOffset_", declaredType="void*")
	public VoidPointer shmem_getFilepath() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shmem_getFilepathOffset_));
	}

	// void* shmem_getFilepath
	public PointerPointer shmem_getFilepathEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shmem_getFilepathOffset_));
	}

	// void* shmem_get_region_granularity
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_get_region_granularityOffset_", declaredType="void*")
	public VoidPointer shmem_get_region_granularity() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shmem_get_region_granularityOffset_));
	}

	// void* shmem_get_region_granularity
	public PointerPointer shmem_get_region_granularityEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shmem_get_region_granularityOffset_));
	}

	// void* shmem_getid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_getidOffset_", declaredType="void*")
	public VoidPointer shmem_getid() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shmem_getidOffset_));
	}

	// void* shmem_getid
	public PointerPointer shmem_getidEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shmem_getidOffset_));
	}

	// void* shmem_handle_stat
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_handle_statOffset_", declaredType="void*")
	public VoidPointer shmem_handle_stat() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shmem_handle_statOffset_));
	}

	// void* shmem_handle_stat
	public PointerPointer shmem_handle_statEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shmem_handle_statOffset_));
	}

	// void* shmem_open
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_openOffset_", declaredType="void*")
	public VoidPointer shmem_open() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shmem_openOffset_));
	}

	// void* shmem_open
	public PointerPointer shmem_openEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shmem_openOffset_));
	}

	// void* shmem_openDeprecated
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_openDeprecatedOffset_", declaredType="void*")
	public VoidPointer shmem_openDeprecated() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shmem_openDeprecatedOffset_));
	}

	// void* shmem_openDeprecated
	public PointerPointer shmem_openDeprecatedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shmem_openDeprecatedOffset_));
	}

	// void* shmem_protect
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_protectOffset_", declaredType="void*")
	public VoidPointer shmem_protect() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shmem_protectOffset_));
	}

	// void* shmem_protect
	public PointerPointer shmem_protectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shmem_protectOffset_));
	}

	// void* shmem_shutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_shutdownOffset_", declaredType="void*")
	public VoidPointer shmem_shutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shmem_shutdownOffset_));
	}

	// void* shmem_shutdown
	public PointerPointer shmem_shutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shmem_shutdownOffset_));
	}

	// void* shmem_startup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_startupOffset_", declaredType="void*")
	public VoidPointer shmem_startup() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shmem_startupOffset_));
	}

	// void* shmem_startup
	public PointerPointer shmem_startupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shmem_startupOffset_));
	}

	// void* shmem_stat
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_statOffset_", declaredType="void*")
	public VoidPointer shmem_stat() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shmem_statOffset_));
	}

	// void* shmem_stat
	public PointerPointer shmem_statEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shmem_statOffset_));
	}

	// void* shmem_statDeprecated
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_statDeprecatedOffset_", declaredType="void*")
	public VoidPointer shmem_statDeprecated() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shmem_statDeprecatedOffset_));
	}

	// void* shmem_statDeprecated
	public PointerPointer shmem_statDeprecatedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shmem_statDeprecatedOffset_));
	}

	// void* shsem_close
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_closeOffset_", declaredType="void*")
	public VoidPointer shsem_close() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shsem_closeOffset_));
	}

	// void* shsem_close
	public PointerPointer shsem_closeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shsem_closeOffset_));
	}

	// void* shsem_deprecated_close
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_deprecated_closeOffset_", declaredType="void*")
	public VoidPointer shsem_deprecated_close() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shsem_deprecated_closeOffset_));
	}

	// void* shsem_deprecated_close
	public PointerPointer shsem_deprecated_closeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shsem_deprecated_closeOffset_));
	}

	// void* shsem_deprecated_destroy
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_deprecated_destroyOffset_", declaredType="void*")
	public VoidPointer shsem_deprecated_destroy() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shsem_deprecated_destroyOffset_));
	}

	// void* shsem_deprecated_destroy
	public PointerPointer shsem_deprecated_destroyEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shsem_deprecated_destroyOffset_));
	}

	// void* shsem_deprecated_destroyDeprecated
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_deprecated_destroyDeprecatedOffset_", declaredType="void*")
	public VoidPointer shsem_deprecated_destroyDeprecated() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shsem_deprecated_destroyDeprecatedOffset_));
	}

	// void* shsem_deprecated_destroyDeprecated
	public PointerPointer shsem_deprecated_destroyDeprecatedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shsem_deprecated_destroyDeprecatedOffset_));
	}

	// void* shsem_deprecated_getVal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_deprecated_getValOffset_", declaredType="void*")
	public VoidPointer shsem_deprecated_getVal() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shsem_deprecated_getValOffset_));
	}

	// void* shsem_deprecated_getVal
	public PointerPointer shsem_deprecated_getValEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shsem_deprecated_getValOffset_));
	}

	// void* shsem_deprecated_getid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_deprecated_getidOffset_", declaredType="void*")
	public VoidPointer shsem_deprecated_getid() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shsem_deprecated_getidOffset_));
	}

	// void* shsem_deprecated_getid
	public PointerPointer shsem_deprecated_getidEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shsem_deprecated_getidOffset_));
	}

	// void* shsem_deprecated_handle_stat
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_deprecated_handle_statOffset_", declaredType="void*")
	public VoidPointer shsem_deprecated_handle_stat() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shsem_deprecated_handle_statOffset_));
	}

	// void* shsem_deprecated_handle_stat
	public PointerPointer shsem_deprecated_handle_statEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shsem_deprecated_handle_statOffset_));
	}

	// void* shsem_deprecated_open
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_deprecated_openOffset_", declaredType="void*")
	public VoidPointer shsem_deprecated_open() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shsem_deprecated_openOffset_));
	}

	// void* shsem_deprecated_open
	public PointerPointer shsem_deprecated_openEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shsem_deprecated_openOffset_));
	}

	// void* shsem_deprecated_openDeprecated
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_deprecated_openDeprecatedOffset_", declaredType="void*")
	public VoidPointer shsem_deprecated_openDeprecated() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shsem_deprecated_openDeprecatedOffset_));
	}

	// void* shsem_deprecated_openDeprecated
	public PointerPointer shsem_deprecated_openDeprecatedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shsem_deprecated_openDeprecatedOffset_));
	}

	// void* shsem_deprecated_post
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_deprecated_postOffset_", declaredType="void*")
	public VoidPointer shsem_deprecated_post() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shsem_deprecated_postOffset_));
	}

	// void* shsem_deprecated_post
	public PointerPointer shsem_deprecated_postEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shsem_deprecated_postOffset_));
	}

	// void* shsem_deprecated_setVal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_deprecated_setValOffset_", declaredType="void*")
	public VoidPointer shsem_deprecated_setVal() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shsem_deprecated_setValOffset_));
	}

	// void* shsem_deprecated_setVal
	public PointerPointer shsem_deprecated_setValEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shsem_deprecated_setValOffset_));
	}

	// void* shsem_deprecated_shutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_deprecated_shutdownOffset_", declaredType="void*")
	public VoidPointer shsem_deprecated_shutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shsem_deprecated_shutdownOffset_));
	}

	// void* shsem_deprecated_shutdown
	public PointerPointer shsem_deprecated_shutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shsem_deprecated_shutdownOffset_));
	}

	// void* shsem_deprecated_startup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_deprecated_startupOffset_", declaredType="void*")
	public VoidPointer shsem_deprecated_startup() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shsem_deprecated_startupOffset_));
	}

	// void* shsem_deprecated_startup
	public PointerPointer shsem_deprecated_startupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shsem_deprecated_startupOffset_));
	}

	// void* shsem_deprecated_wait
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_deprecated_waitOffset_", declaredType="void*")
	public VoidPointer shsem_deprecated_wait() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shsem_deprecated_waitOffset_));
	}

	// void* shsem_deprecated_wait
	public PointerPointer shsem_deprecated_waitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shsem_deprecated_waitOffset_));
	}

	// void* shsem_destroy
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_destroyOffset_", declaredType="void*")
	public VoidPointer shsem_destroy() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shsem_destroyOffset_));
	}

	// void* shsem_destroy
	public PointerPointer shsem_destroyEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shsem_destroyOffset_));
	}

	// void* shsem_getVal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_getValOffset_", declaredType="void*")
	public VoidPointer shsem_getVal() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shsem_getValOffset_));
	}

	// void* shsem_getVal
	public PointerPointer shsem_getValEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shsem_getValOffset_));
	}

	// void* shsem_open
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_openOffset_", declaredType="void*")
	public VoidPointer shsem_open() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shsem_openOffset_));
	}

	// void* shsem_open
	public PointerPointer shsem_openEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shsem_openOffset_));
	}

	// void* shsem_params_init
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_params_initOffset_", declaredType="void*")
	public VoidPointer shsem_params_init() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shsem_params_initOffset_));
	}

	// void* shsem_params_init
	public PointerPointer shsem_params_initEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shsem_params_initOffset_));
	}

	// void* shsem_post
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_postOffset_", declaredType="void*")
	public VoidPointer shsem_post() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shsem_postOffset_));
	}

	// void* shsem_post
	public PointerPointer shsem_postEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shsem_postOffset_));
	}

	// void* shsem_setVal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_setValOffset_", declaredType="void*")
	public VoidPointer shsem_setVal() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shsem_setValOffset_));
	}

	// void* shsem_setVal
	public PointerPointer shsem_setValEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shsem_setValOffset_));
	}

	// void* shsem_shutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_shutdownOffset_", declaredType="void*")
	public VoidPointer shsem_shutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shsem_shutdownOffset_));
	}

	// void* shsem_shutdown
	public PointerPointer shsem_shutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shsem_shutdownOffset_));
	}

	// void* shsem_startup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_startupOffset_", declaredType="void*")
	public VoidPointer shsem_startup() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shsem_startupOffset_));
	}

	// void* shsem_startup
	public PointerPointer shsem_startupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shsem_startupOffset_));
	}

	// void* shsem_wait
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_waitOffset_", declaredType="void*")
	public VoidPointer shsem_wait() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._shsem_waitOffset_));
	}

	// void* shsem_wait
	public PointerPointer shsem_waitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._shsem_waitOffset_));
	}

	// void* sock_error_message
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_error_messageOffset_", declaredType="void*")
	public VoidPointer sock_error_message() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._sock_error_messageOffset_));
	}

	// void* sock_error_message
	public PointerPointer sock_error_messageEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._sock_error_messageOffset_));
	}

	// void* sock_freeaddrinfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_freeaddrinfoOffset_", declaredType="void*")
	public VoidPointer sock_freeaddrinfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._sock_freeaddrinfoOffset_));
	}

	// void* sock_freeaddrinfo
	public PointerPointer sock_freeaddrinfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._sock_freeaddrinfoOffset_));
	}

	// void* sock_getaddrinfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_getaddrinfoOffset_", declaredType="void*")
	public VoidPointer sock_getaddrinfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._sock_getaddrinfoOffset_));
	}

	// void* sock_getaddrinfo
	public PointerPointer sock_getaddrinfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._sock_getaddrinfoOffset_));
	}

	// void* sock_getaddrinfo_address
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_getaddrinfo_addressOffset_", declaredType="void*")
	public VoidPointer sock_getaddrinfo_address() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._sock_getaddrinfo_addressOffset_));
	}

	// void* sock_getaddrinfo_address
	public PointerPointer sock_getaddrinfo_addressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._sock_getaddrinfo_addressOffset_));
	}

	// void* sock_getaddrinfo_create_hints
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_getaddrinfo_create_hintsOffset_", declaredType="void*")
	public VoidPointer sock_getaddrinfo_create_hints() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._sock_getaddrinfo_create_hintsOffset_));
	}

	// void* sock_getaddrinfo_create_hints
	public PointerPointer sock_getaddrinfo_create_hintsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._sock_getaddrinfo_create_hintsOffset_));
	}

	// void* sock_getaddrinfo_family
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_getaddrinfo_familyOffset_", declaredType="void*")
	public VoidPointer sock_getaddrinfo_family() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._sock_getaddrinfo_familyOffset_));
	}

	// void* sock_getaddrinfo_family
	public PointerPointer sock_getaddrinfo_familyEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._sock_getaddrinfo_familyOffset_));
	}

	// void* sock_getaddrinfo_length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_getaddrinfo_lengthOffset_", declaredType="void*")
	public VoidPointer sock_getaddrinfo_length() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._sock_getaddrinfo_lengthOffset_));
	}

	// void* sock_getaddrinfo_length
	public PointerPointer sock_getaddrinfo_lengthEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._sock_getaddrinfo_lengthOffset_));
	}

	// void* sock_getaddrinfo_name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_getaddrinfo_nameOffset_", declaredType="void*")
	public VoidPointer sock_getaddrinfo_name() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._sock_getaddrinfo_nameOffset_));
	}

	// void* sock_getaddrinfo_name
	public PointerPointer sock_getaddrinfo_nameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._sock_getaddrinfo_nameOffset_));
	}

	// void* sock_gethostbyaddr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_gethostbyaddrOffset_", declaredType="void*")
	public VoidPointer sock_gethostbyaddr() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._sock_gethostbyaddrOffset_));
	}

	// void* sock_gethostbyaddr
	public PointerPointer sock_gethostbyaddrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._sock_gethostbyaddrOffset_));
	}

	// void* sock_gethostbyname
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_gethostbynameOffset_", declaredType="void*")
	public VoidPointer sock_gethostbyname() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._sock_gethostbynameOffset_));
	}

	// void* sock_gethostbyname
	public PointerPointer sock_gethostbynameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._sock_gethostbynameOffset_));
	}

	// void* sock_inetaddr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_inetaddrOffset_", declaredType="void*")
	public VoidPointer sock_inetaddr() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._sock_inetaddrOffset_));
	}

	// void* sock_inetaddr
	public PointerPointer sock_inetaddrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._sock_inetaddrOffset_));
	}

	// void* sock_shutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_shutdownOffset_", declaredType="void*")
	public VoidPointer sock_shutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._sock_shutdownOffset_));
	}

	// void* sock_shutdown
	public PointerPointer sock_shutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._sock_shutdownOffset_));
	}

	// void* sock_startup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_startupOffset_", declaredType="void*")
	public VoidPointer sock_startup() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._sock_startupOffset_));
	}

	// void* sock_startup
	public PointerPointer sock_startupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._sock_startupOffset_));
	}

	// void* sysinfo_DLPAR_enabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_DLPAR_enabledOffset_", declaredType="void*")
	public VoidPointer sysinfo_DLPAR_enabled() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._sysinfo_DLPAR_enabledOffset_));
	}

	// void* sysinfo_DLPAR_enabled
	public PointerPointer sysinfo_DLPAR_enabledEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._sysinfo_DLPAR_enabledOffset_));
	}

	// void* sysinfo_DLPAR_max_CPUs
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_DLPAR_max_CPUsOffset_", declaredType="void*")
	public VoidPointer sysinfo_DLPAR_max_CPUs() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._sysinfo_DLPAR_max_CPUsOffset_));
	}

	// void* sysinfo_DLPAR_max_CPUs
	public PointerPointer sysinfo_DLPAR_max_CPUsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._sysinfo_DLPAR_max_CPUsOffset_));
	}

	// void* sysinfo_get_cache_info
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_cache_infoOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_cache_info() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._sysinfo_get_cache_infoOffset_));
	}

	// void* sysinfo_get_cache_info
	public PointerPointer sysinfo_get_cache_infoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._sysinfo_get_cache_infoOffset_));
	}

	// void* sysinfo_get_classpathSeparator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_classpathSeparatorOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_classpathSeparator() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._sysinfo_get_classpathSeparatorOffset_));
	}

	// void* sysinfo_get_classpathSeparator
	public PointerPointer sysinfo_get_classpathSeparatorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._sysinfo_get_classpathSeparatorOffset_));
	}

	// void* sysinfo_get_hw_info
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_hw_infoOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_hw_info() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._sysinfo_get_hw_infoOffset_));
	}

	// void* sysinfo_get_hw_info
	public PointerPointer sysinfo_get_hw_infoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._sysinfo_get_hw_infoOffset_));
	}

	// void* sysinfo_get_processing_capacity
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_processing_capacityOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_processing_capacity() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._sysinfo_get_processing_capacityOffset_));
	}

	// void* sysinfo_get_processing_capacity
	public PointerPointer sysinfo_get_processing_capacityEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._sysinfo_get_processing_capacityOffset_));
	}

	// void* sysinfo_get_processor_description
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_processor_descriptionOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_processor_description() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._sysinfo_get_processor_descriptionOffset_));
	}

	// void* sysinfo_get_processor_description
	public PointerPointer sysinfo_get_processor_descriptionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._sysinfo_get_processor_descriptionOffset_));
	}

	// void* sysinfo_processor_has_feature
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_processor_has_featureOffset_", declaredType="void*")
	public VoidPointer sysinfo_processor_has_feature() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._sysinfo_processor_has_featureOffset_));
	}

	// void* sysinfo_processor_has_feature
	public PointerPointer sysinfo_processor_has_featureEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._sysinfo_processor_has_featureOffset_));
	}

	// void* sysinfo_shutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_shutdownOffset_", declaredType="void*")
	public VoidPointer sysinfo_shutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._sysinfo_shutdownOffset_));
	}

	// void* sysinfo_shutdown
	public PointerPointer sysinfo_shutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._sysinfo_shutdownOffset_));
	}

	// void* sysinfo_startup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_startupOffset_", declaredType="void*")
	public VoidPointer sysinfo_startup() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._sysinfo_startupOffset_));
	}

	// void* sysinfo_startup
	public PointerPointer sysinfo_startupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._sysinfo_startupOffset_));
	}

	// void* sysinfo_weak_memory_consistency
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_weak_memory_consistencyOffset_", declaredType="void*")
	public VoidPointer sysinfo_weak_memory_consistency() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9PortLibrary._sysinfo_weak_memory_consistencyOffset_));
	}

	// void* sysinfo_weak_memory_consistency
	public PointerPointer sysinfo_weak_memory_consistencyEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9PortLibrary._sysinfo_weak_memory_consistencyOffset_));
	}

}
