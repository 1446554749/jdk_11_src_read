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
 * Structure: OMRPortLibraryPointer
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
 * The generated code will provide getters for all elements in the OMRPortLibraryPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=OMRPortLibrary.class)
public class OMRPortLibraryPointer extends StructurePointer {

	// NULL
	public static final OMRPortLibraryPointer NULL = new OMRPortLibraryPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected OMRPortLibraryPointer(long address) {
		super(address);
	}

	public static OMRPortLibraryPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static OMRPortLibraryPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static OMRPortLibraryPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new OMRPortLibraryPointer(address);
	}

	public OMRPortLibraryPointer add(long count) {
		return OMRPortLibraryPointer.cast(address + (OMRPortLibrary.SIZEOF * count));
	}

	public OMRPortLibraryPointer add(Scalar count) {
		return add(count.longValue());
	}

	public OMRPortLibraryPointer addOffset(long offset) {
		return OMRPortLibraryPointer.cast(address + offset);
	}

	public OMRPortLibraryPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public OMRPortLibraryPointer sub(long count) {
		return OMRPortLibraryPointer.cast(address - (OMRPortLibrary.SIZEOF * count));
	}

	public OMRPortLibraryPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public OMRPortLibraryPointer subOffset(long offset) {
		return OMRPortLibraryPointer.cast(address - offset);
	}

	public OMRPortLibraryPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public OMRPortLibraryPointer untag(long mask) {
		return OMRPortLibraryPointer.cast(address & ~mask);
	}

	public OMRPortLibraryPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return OMRPortLibrary.SIZEOF;
	}

	// Implementation methods

	// void* cpu_flush_icache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cpu_flush_icacheOffset_", declaredType="void*")
	public VoidPointer cpu_flush_icache() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._cpu_flush_icacheOffset_));
	}

	// void* cpu_flush_icache
	public PointerPointer cpu_flush_icacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._cpu_flush_icacheOffset_));
	}

	// void* cpu_get_cache_line_size
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cpu_get_cache_line_sizeOffset_", declaredType="void*")
	public VoidPointer cpu_get_cache_line_size() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._cpu_get_cache_line_sizeOffset_));
	}

	// void* cpu_get_cache_line_size
	public PointerPointer cpu_get_cache_line_sizeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._cpu_get_cache_line_sizeOffset_));
	}

	// void* cpu_shutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cpu_shutdownOffset_", declaredType="void*")
	public VoidPointer cpu_shutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._cpu_shutdownOffset_));
	}

	// void* cpu_shutdown
	public PointerPointer cpu_shutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._cpu_shutdownOffset_));
	}

	// void* cpu_startup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cpu_startupOffset_", declaredType="void*")
	public VoidPointer cpu_startup() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._cpu_startupOffset_));
	}

	// void* cpu_startup
	public PointerPointer cpu_startupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._cpu_startupOffset_));
	}

	// void* dump_create
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dump_createOffset_", declaredType="void*")
	public VoidPointer dump_create() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._dump_createOffset_));
	}

	// void* dump_create
	public PointerPointer dump_createEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._dump_createOffset_));
	}

	// void* dump_shutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dump_shutdownOffset_", declaredType="void*")
	public VoidPointer dump_shutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._dump_shutdownOffset_));
	}

	// void* dump_shutdown
	public PointerPointer dump_shutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._dump_shutdownOffset_));
	}

	// void* dump_startup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dump_startupOffset_", declaredType="void*")
	public VoidPointer dump_startup() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._dump_startupOffset_));
	}

	// void* dump_startup
	public PointerPointer dump_startupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._dump_startupOffset_));
	}

	// void* error_last_error_message
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_error_last_error_messageOffset_", declaredType="void*")
	public VoidPointer error_last_error_message() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._error_last_error_messageOffset_));
	}

	// void* error_last_error_message
	public PointerPointer error_last_error_messageEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._error_last_error_messageOffset_));
	}

	// void* error_last_error_number
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_error_last_error_numberOffset_", declaredType="void*")
	public VoidPointer error_last_error_number() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._error_last_error_numberOffset_));
	}

	// void* error_last_error_number
	public PointerPointer error_last_error_numberEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._error_last_error_numberOffset_));
	}

	// void* error_set_last_error
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_error_set_last_errorOffset_", declaredType="void*")
	public VoidPointer error_set_last_error() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._error_set_last_errorOffset_));
	}

	// void* error_set_last_error
	public PointerPointer error_set_last_errorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._error_set_last_errorOffset_));
	}

	// void* error_set_last_error_with_message
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_error_set_last_error_with_messageOffset_", declaredType="void*")
	public VoidPointer error_set_last_error_with_message() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._error_set_last_error_with_messageOffset_));
	}

	// void* error_set_last_error_with_message
	public PointerPointer error_set_last_error_with_messageEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._error_set_last_error_with_messageOffset_));
	}

	// void* error_set_last_error_with_message_format
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_error_set_last_error_with_message_formatOffset_", declaredType="void*")
	public VoidPointer error_set_last_error_with_message_format() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._error_set_last_error_with_message_formatOffset_));
	}

	// void* error_set_last_error_with_message_format
	public PointerPointer error_set_last_error_with_message_formatEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._error_set_last_error_with_message_formatOffset_));
	}

	// void* error_shutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_error_shutdownOffset_", declaredType="void*")
	public VoidPointer error_shutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._error_shutdownOffset_));
	}

	// void* error_shutdown
	public PointerPointer error_shutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._error_shutdownOffset_));
	}

	// void* error_startup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_error_startupOffset_", declaredType="void*")
	public VoidPointer error_startup() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._error_startupOffset_));
	}

	// void* error_startup
	public PointerPointer error_startupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._error_startupOffset_));
	}

	// void* exit_get_exit_code
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exit_get_exit_codeOffset_", declaredType="void*")
	public VoidPointer exit_get_exit_code() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._exit_get_exit_codeOffset_));
	}

	// void* exit_get_exit_code
	public PointerPointer exit_get_exit_codeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._exit_get_exit_codeOffset_));
	}

	// void* exit_shutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exit_shutdownOffset_", declaredType="void*")
	public VoidPointer exit_shutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._exit_shutdownOffset_));
	}

	// void* exit_shutdown
	public PointerPointer exit_shutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._exit_shutdownOffset_));
	}

	// void* exit_shutdown_and_exit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exit_shutdown_and_exitOffset_", declaredType="void*")
	public VoidPointer exit_shutdown_and_exit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._exit_shutdown_and_exitOffset_));
	}

	// void* exit_shutdown_and_exit
	public PointerPointer exit_shutdown_and_exitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._exit_shutdown_and_exitOffset_));
	}

	// void* exit_startup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exit_startupOffset_", declaredType="void*")
	public VoidPointer exit_startup() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._exit_startupOffset_));
	}

	// void* exit_startup
	public PointerPointer exit_startupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._exit_startupOffset_));
	}

	// void* file_attr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_attrOffset_", declaredType="void*")
	public VoidPointer file_attr() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_attrOffset_));
	}

	// void* file_attr
	public PointerPointer file_attrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_attrOffset_));
	}

	// void* file_blockingasync_close
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_blockingasync_closeOffset_", declaredType="void*")
	public VoidPointer file_blockingasync_close() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_blockingasync_closeOffset_));
	}

	// void* file_blockingasync_close
	public PointerPointer file_blockingasync_closeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_blockingasync_closeOffset_));
	}

	// void* file_blockingasync_flength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_blockingasync_flengthOffset_", declaredType="void*")
	public VoidPointer file_blockingasync_flength() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_blockingasync_flengthOffset_));
	}

	// void* file_blockingasync_flength
	public PointerPointer file_blockingasync_flengthEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_blockingasync_flengthOffset_));
	}

	// void* file_blockingasync_lock_bytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_blockingasync_lock_bytesOffset_", declaredType="void*")
	public VoidPointer file_blockingasync_lock_bytes() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_blockingasync_lock_bytesOffset_));
	}

	// void* file_blockingasync_lock_bytes
	public PointerPointer file_blockingasync_lock_bytesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_blockingasync_lock_bytesOffset_));
	}

	// void* file_blockingasync_open
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_blockingasync_openOffset_", declaredType="void*")
	public VoidPointer file_blockingasync_open() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_blockingasync_openOffset_));
	}

	// void* file_blockingasync_open
	public PointerPointer file_blockingasync_openEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_blockingasync_openOffset_));
	}

	// void* file_blockingasync_read
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_blockingasync_readOffset_", declaredType="void*")
	public VoidPointer file_blockingasync_read() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_blockingasync_readOffset_));
	}

	// void* file_blockingasync_read
	public PointerPointer file_blockingasync_readEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_blockingasync_readOffset_));
	}

	// void* file_blockingasync_set_length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_blockingasync_set_lengthOffset_", declaredType="void*")
	public VoidPointer file_blockingasync_set_length() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_blockingasync_set_lengthOffset_));
	}

	// void* file_blockingasync_set_length
	public PointerPointer file_blockingasync_set_lengthEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_blockingasync_set_lengthOffset_));
	}

	// void* file_blockingasync_shutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_blockingasync_shutdownOffset_", declaredType="void*")
	public VoidPointer file_blockingasync_shutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_blockingasync_shutdownOffset_));
	}

	// void* file_blockingasync_shutdown
	public PointerPointer file_blockingasync_shutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_blockingasync_shutdownOffset_));
	}

	// void* file_blockingasync_startup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_blockingasync_startupOffset_", declaredType="void*")
	public VoidPointer file_blockingasync_startup() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_blockingasync_startupOffset_));
	}

	// void* file_blockingasync_startup
	public PointerPointer file_blockingasync_startupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_blockingasync_startupOffset_));
	}

	// void* file_blockingasync_unlock_bytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_blockingasync_unlock_bytesOffset_", declaredType="void*")
	public VoidPointer file_blockingasync_unlock_bytes() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_blockingasync_unlock_bytesOffset_));
	}

	// void* file_blockingasync_unlock_bytes
	public PointerPointer file_blockingasync_unlock_bytesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_blockingasync_unlock_bytesOffset_));
	}

	// void* file_blockingasync_write
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_blockingasync_writeOffset_", declaredType="void*")
	public VoidPointer file_blockingasync_write() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_blockingasync_writeOffset_));
	}

	// void* file_blockingasync_write
	public PointerPointer file_blockingasync_writeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_blockingasync_writeOffset_));
	}

	// void* file_chmod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_chmodOffset_", declaredType="void*")
	public VoidPointer file_chmod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_chmodOffset_));
	}

	// void* file_chmod
	public PointerPointer file_chmodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_chmodOffset_));
	}

	// void* file_chown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_chownOffset_", declaredType="void*")
	public VoidPointer file_chown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_chownOffset_));
	}

	// void* file_chown
	public PointerPointer file_chownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_chownOffset_));
	}

	// void* file_close
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_closeOffset_", declaredType="void*")
	public VoidPointer file_close() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_closeOffset_));
	}

	// void* file_close
	public PointerPointer file_closeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_closeOffset_));
	}

	// void* file_convert_native_fd_to_omrfile_fd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_convert_native_fd_to_omrfile_fdOffset_", declaredType="void*")
	public VoidPointer file_convert_native_fd_to_omrfile_fd() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_convert_native_fd_to_omrfile_fdOffset_));
	}

	// void* file_convert_native_fd_to_omrfile_fd
	public PointerPointer file_convert_native_fd_to_omrfile_fdEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_convert_native_fd_to_omrfile_fdOffset_));
	}

	// void* file_convert_omrfile_fd_to_native_fd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_convert_omrfile_fd_to_native_fdOffset_", declaredType="void*")
	public VoidPointer file_convert_omrfile_fd_to_native_fd() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_convert_omrfile_fd_to_native_fdOffset_));
	}

	// void* file_convert_omrfile_fd_to_native_fd
	public PointerPointer file_convert_omrfile_fd_to_native_fdEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_convert_omrfile_fd_to_native_fdOffset_));
	}

	// void* file_error_message
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_error_messageOffset_", declaredType="void*")
	public VoidPointer file_error_message() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_error_messageOffset_));
	}

	// void* file_error_message
	public PointerPointer file_error_messageEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_error_messageOffset_));
	}

	// void* file_findclose
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_findcloseOffset_", declaredType="void*")
	public VoidPointer file_findclose() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_findcloseOffset_));
	}

	// void* file_findclose
	public PointerPointer file_findcloseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_findcloseOffset_));
	}

	// void* file_findfirst
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_findfirstOffset_", declaredType="void*")
	public VoidPointer file_findfirst() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_findfirstOffset_));
	}

	// void* file_findfirst
	public PointerPointer file_findfirstEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_findfirstOffset_));
	}

	// void* file_findnext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_findnextOffset_", declaredType="void*")
	public VoidPointer file_findnext() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_findnextOffset_));
	}

	// void* file_findnext
	public PointerPointer file_findnextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_findnextOffset_));
	}

	// void* file_flength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_flengthOffset_", declaredType="void*")
	public VoidPointer file_flength() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_flengthOffset_));
	}

	// void* file_flength
	public PointerPointer file_flengthEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_flengthOffset_));
	}

	// void* file_fstat
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_fstatOffset_", declaredType="void*")
	public VoidPointer file_fstat() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_fstatOffset_));
	}

	// void* file_fstat
	public PointerPointer file_fstatEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_fstatOffset_));
	}

	// void* file_get_text_encoding
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_get_text_encodingOffset_", declaredType="void*")
	public VoidPointer file_get_text_encoding() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_get_text_encodingOffset_));
	}

	// void* file_get_text_encoding
	public PointerPointer file_get_text_encodingEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_get_text_encodingOffset_));
	}

	// void* file_lastmod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_lastmodOffset_", declaredType="void*")
	public VoidPointer file_lastmod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_lastmodOffset_));
	}

	// void* file_lastmod
	public PointerPointer file_lastmodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_lastmodOffset_));
	}

	// void* file_length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_lengthOffset_", declaredType="void*")
	public VoidPointer file_length() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_lengthOffset_));
	}

	// void* file_length
	public PointerPointer file_lengthEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_lengthOffset_));
	}

	// void* file_lock_bytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_lock_bytesOffset_", declaredType="void*")
	public VoidPointer file_lock_bytes() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_lock_bytesOffset_));
	}

	// void* file_lock_bytes
	public PointerPointer file_lock_bytesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_lock_bytesOffset_));
	}

	// void* file_mkdir
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_mkdirOffset_", declaredType="void*")
	public VoidPointer file_mkdir() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_mkdirOffset_));
	}

	// void* file_mkdir
	public PointerPointer file_mkdirEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_mkdirOffset_));
	}

	// void* file_move
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_moveOffset_", declaredType="void*")
	public VoidPointer file_move() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_moveOffset_));
	}

	// void* file_move
	public PointerPointer file_moveEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_moveOffset_));
	}

	// void* file_open
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_openOffset_", declaredType="void*")
	public VoidPointer file_open() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_openOffset_));
	}

	// void* file_open
	public PointerPointer file_openEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_openOffset_));
	}

	// void* file_printf
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_printfOffset_", declaredType="void*")
	public VoidPointer file_printf() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_printfOffset_));
	}

	// void* file_printf
	public PointerPointer file_printfEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_printfOffset_));
	}

	// void* file_read
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_readOffset_", declaredType="void*")
	public VoidPointer file_read() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_readOffset_));
	}

	// void* file_read
	public PointerPointer file_readEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_readOffset_));
	}

	// void* file_read_text
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_read_textOffset_", declaredType="void*")
	public VoidPointer file_read_text() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_read_textOffset_));
	}

	// void* file_read_text
	public PointerPointer file_read_textEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_read_textOffset_));
	}

	// void* file_seek
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_seekOffset_", declaredType="void*")
	public VoidPointer file_seek() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_seekOffset_));
	}

	// void* file_seek
	public PointerPointer file_seekEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_seekOffset_));
	}

	// void* file_set_length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_set_lengthOffset_", declaredType="void*")
	public VoidPointer file_set_length() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_set_lengthOffset_));
	}

	// void* file_set_length
	public PointerPointer file_set_lengthEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_set_lengthOffset_));
	}

	// void* file_shutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_shutdownOffset_", declaredType="void*")
	public VoidPointer file_shutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_shutdownOffset_));
	}

	// void* file_shutdown
	public PointerPointer file_shutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_shutdownOffset_));
	}

	// void* file_startup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_startupOffset_", declaredType="void*")
	public VoidPointer file_startup() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_startupOffset_));
	}

	// void* file_startup
	public PointerPointer file_startupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_startupOffset_));
	}

	// void* file_stat
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_statOffset_", declaredType="void*")
	public VoidPointer file_stat() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_statOffset_));
	}

	// void* file_stat
	public PointerPointer file_statEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_statOffset_));
	}

	// void* file_stat_filesystem
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_stat_filesystemOffset_", declaredType="void*")
	public VoidPointer file_stat_filesystem() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_stat_filesystemOffset_));
	}

	// void* file_stat_filesystem
	public PointerPointer file_stat_filesystemEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_stat_filesystemOffset_));
	}

	// void* file_sync
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_syncOffset_", declaredType="void*")
	public VoidPointer file_sync() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_syncOffset_));
	}

	// void* file_sync
	public PointerPointer file_syncEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_syncOffset_));
	}

	// void* file_unlink
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_unlinkOffset_", declaredType="void*")
	public VoidPointer file_unlink() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_unlinkOffset_));
	}

	// void* file_unlink
	public PointerPointer file_unlinkEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_unlinkOffset_));
	}

	// void* file_unlinkdir
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_unlinkdirOffset_", declaredType="void*")
	public VoidPointer file_unlinkdir() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_unlinkdirOffset_));
	}

	// void* file_unlinkdir
	public PointerPointer file_unlinkdirEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_unlinkdirOffset_));
	}

	// void* file_unlock_bytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_unlock_bytesOffset_", declaredType="void*")
	public VoidPointer file_unlock_bytes() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_unlock_bytesOffset_));
	}

	// void* file_unlock_bytes
	public PointerPointer file_unlock_bytesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_unlock_bytesOffset_));
	}

	// void* file_vprintf
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_vprintfOffset_", declaredType="void*")
	public VoidPointer file_vprintf() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_vprintfOffset_));
	}

	// void* file_vprintf
	public PointerPointer file_vprintfEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_vprintfOffset_));
	}

	// void* file_write
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_writeOffset_", declaredType="void*")
	public VoidPointer file_write() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_writeOffset_));
	}

	// void* file_write
	public PointerPointer file_writeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_writeOffset_));
	}

	// void* file_write_text
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_file_write_textOffset_", declaredType="void*")
	public VoidPointer file_write_text() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._file_write_textOffset_));
	}

	// void* file_write_text
	public PointerPointer file_write_textEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._file_write_textOffset_));
	}

	// void* filestream_close
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_filestream_closeOffset_", declaredType="void*")
	public VoidPointer filestream_close() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._filestream_closeOffset_));
	}

	// void* filestream_close
	public PointerPointer filestream_closeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._filestream_closeOffset_));
	}

	// void* filestream_fdopen
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_filestream_fdopenOffset_", declaredType="void*")
	public VoidPointer filestream_fdopen() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._filestream_fdopenOffset_));
	}

	// void* filestream_fdopen
	public PointerPointer filestream_fdopenEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._filestream_fdopenOffset_));
	}

	// void* filestream_fileno
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_filestream_filenoOffset_", declaredType="void*")
	public VoidPointer filestream_fileno() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._filestream_filenoOffset_));
	}

	// void* filestream_fileno
	public PointerPointer filestream_filenoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._filestream_filenoOffset_));
	}

	// void* filestream_open
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_filestream_openOffset_", declaredType="void*")
	public VoidPointer filestream_open() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._filestream_openOffset_));
	}

	// void* filestream_open
	public PointerPointer filestream_openEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._filestream_openOffset_));
	}

	// void* filestream_printf
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_filestream_printfOffset_", declaredType="void*")
	public VoidPointer filestream_printf() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._filestream_printfOffset_));
	}

	// void* filestream_printf
	public PointerPointer filestream_printfEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._filestream_printfOffset_));
	}

	// void* filestream_setbuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_filestream_setbufferOffset_", declaredType="void*")
	public VoidPointer filestream_setbuffer() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._filestream_setbufferOffset_));
	}

	// void* filestream_setbuffer
	public PointerPointer filestream_setbufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._filestream_setbufferOffset_));
	}

	// void* filestream_shutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_filestream_shutdownOffset_", declaredType="void*")
	public VoidPointer filestream_shutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._filestream_shutdownOffset_));
	}

	// void* filestream_shutdown
	public PointerPointer filestream_shutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._filestream_shutdownOffset_));
	}

	// void* filestream_startup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_filestream_startupOffset_", declaredType="void*")
	public VoidPointer filestream_startup() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._filestream_startupOffset_));
	}

	// void* filestream_startup
	public PointerPointer filestream_startupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._filestream_startupOffset_));
	}

	// void* filestream_sync
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_filestream_syncOffset_", declaredType="void*")
	public VoidPointer filestream_sync() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._filestream_syncOffset_));
	}

	// void* filestream_sync
	public PointerPointer filestream_syncEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._filestream_syncOffset_));
	}

	// void* filestream_vprintf
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_filestream_vprintfOffset_", declaredType="void*")
	public VoidPointer filestream_vprintf() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._filestream_vprintfOffset_));
	}

	// void* filestream_vprintf
	public PointerPointer filestream_vprintfEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._filestream_vprintfOffset_));
	}

	// void* filestream_write
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_filestream_writeOffset_", declaredType="void*")
	public VoidPointer filestream_write() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._filestream_writeOffset_));
	}

	// void* filestream_write
	public PointerPointer filestream_writeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._filestream_writeOffset_));
	}

	// void* filestream_write_text
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_filestream_write_textOffset_", declaredType="void*")
	public VoidPointer filestream_write_text() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._filestream_write_textOffset_));
	}

	// void* filestream_write_text
	public PointerPointer filestream_write_textEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._filestream_write_textOffset_));
	}

	// void* heap_allocate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heap_allocateOffset_", declaredType="void*")
	public VoidPointer heap_allocate() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._heap_allocateOffset_));
	}

	// void* heap_allocate
	public PointerPointer heap_allocateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._heap_allocateOffset_));
	}

	// void* heap_create
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heap_createOffset_", declaredType="void*")
	public VoidPointer heap_create() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._heap_createOffset_));
	}

	// void* heap_create
	public PointerPointer heap_createEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._heap_createOffset_));
	}

	// void* heap_free
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heap_freeOffset_", declaredType="void*")
	public VoidPointer heap_free() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._heap_freeOffset_));
	}

	// void* heap_free
	public PointerPointer heap_freeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._heap_freeOffset_));
	}

	// void* heap_grow
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heap_growOffset_", declaredType="void*")
	public VoidPointer heap_grow() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._heap_growOffset_));
	}

	// void* heap_grow
	public PointerPointer heap_growEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._heap_growOffset_));
	}

	// void* heap_query_size
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heap_query_sizeOffset_", declaredType="void*")
	public VoidPointer heap_query_size() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._heap_query_sizeOffset_));
	}

	// void* heap_query_size
	public PointerPointer heap_query_sizeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._heap_query_sizeOffset_));
	}

	// void* heap_reallocate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_heap_reallocateOffset_", declaredType="void*")
	public VoidPointer heap_reallocate() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._heap_reallocateOffset_));
	}

	// void* heap_reallocate
	public PointerPointer heap_reallocateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._heap_reallocateOffset_));
	}

	// void* introspect_backtrace_symbols
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_introspect_backtrace_symbolsOffset_", declaredType="void*")
	public VoidPointer introspect_backtrace_symbols() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._introspect_backtrace_symbolsOffset_));
	}

	// void* introspect_backtrace_symbols
	public PointerPointer introspect_backtrace_symbolsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._introspect_backtrace_symbolsOffset_));
	}

	// void* introspect_backtrace_thread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_introspect_backtrace_threadOffset_", declaredType="void*")
	public VoidPointer introspect_backtrace_thread() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._introspect_backtrace_threadOffset_));
	}

	// void* introspect_backtrace_thread
	public PointerPointer introspect_backtrace_threadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._introspect_backtrace_threadOffset_));
	}

	// void* introspect_set_suspend_signal_offset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_introspect_set_suspend_signal_offsetOffset_", declaredType="void*")
	public VoidPointer introspect_set_suspend_signal_offset() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._introspect_set_suspend_signal_offsetOffset_));
	}

	// void* introspect_set_suspend_signal_offset
	public PointerPointer introspect_set_suspend_signal_offsetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._introspect_set_suspend_signal_offsetOffset_));
	}

	// void* introspect_shutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_introspect_shutdownOffset_", declaredType="void*")
	public VoidPointer introspect_shutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._introspect_shutdownOffset_));
	}

	// void* introspect_shutdown
	public PointerPointer introspect_shutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._introspect_shutdownOffset_));
	}

	// void* introspect_startup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_introspect_startupOffset_", declaredType="void*")
	public VoidPointer introspect_startup() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._introspect_startupOffset_));
	}

	// void* introspect_startup
	public PointerPointer introspect_startupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._introspect_startupOffset_));
	}

	// void* introspect_threads_nextDo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_introspect_threads_nextDoOffset_", declaredType="void*")
	public VoidPointer introspect_threads_nextDo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._introspect_threads_nextDoOffset_));
	}

	// void* introspect_threads_nextDo
	public PointerPointer introspect_threads_nextDoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._introspect_threads_nextDoOffset_));
	}

	// void* introspect_threads_startDo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_introspect_threads_startDoOffset_", declaredType="void*")
	public VoidPointer introspect_threads_startDo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._introspect_threads_startDoOffset_));
	}

	// void* introspect_threads_startDo
	public PointerPointer introspect_threads_startDoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._introspect_threads_startDoOffset_));
	}

	// void* introspect_threads_startDo_with_signal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_introspect_threads_startDo_with_signalOffset_", declaredType="void*")
	public VoidPointer introspect_threads_startDo_with_signal() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._introspect_threads_startDo_with_signalOffset_));
	}

	// void* introspect_threads_startDo_with_signal
	public PointerPointer introspect_threads_startDo_with_signalEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._introspect_threads_startDo_with_signalOffset_));
	}

	// void* mem_advise_and_free_memory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mem_advise_and_free_memoryOffset_", declaredType="void*")
	public VoidPointer mem_advise_and_free_memory() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._mem_advise_and_free_memoryOffset_));
	}

	// void* mem_advise_and_free_memory
	public PointerPointer mem_advise_and_free_memoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._mem_advise_and_free_memoryOffset_));
	}

	// void* mem_allocate_memory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mem_allocate_memoryOffset_", declaredType="void*")
	public VoidPointer mem_allocate_memory() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._mem_allocate_memoryOffset_));
	}

	// void* mem_allocate_memory
	public PointerPointer mem_allocate_memoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._mem_allocate_memoryOffset_));
	}

	// void* mem_allocate_memory32
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mem_allocate_memory32Offset_", declaredType="void*")
	public VoidPointer mem_allocate_memory32() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._mem_allocate_memory32Offset_));
	}

	// void* mem_allocate_memory32
	public PointerPointer mem_allocate_memory32EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._mem_allocate_memory32Offset_));
	}

	// void* mem_categories_decrement_counters
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mem_categories_decrement_countersOffset_", declaredType="void*")
	public VoidPointer mem_categories_decrement_counters() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._mem_categories_decrement_countersOffset_));
	}

	// void* mem_categories_decrement_counters
	public PointerPointer mem_categories_decrement_countersEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._mem_categories_decrement_countersOffset_));
	}

	// void* mem_categories_increment_counters
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mem_categories_increment_countersOffset_", declaredType="void*")
	public VoidPointer mem_categories_increment_counters() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._mem_categories_increment_countersOffset_));
	}

	// void* mem_categories_increment_counters
	public PointerPointer mem_categories_increment_countersEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._mem_categories_increment_countersOffset_));
	}

	// void* mem_ensure_capacity32
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mem_ensure_capacity32Offset_", declaredType="void*")
	public VoidPointer mem_ensure_capacity32() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._mem_ensure_capacity32Offset_));
	}

	// void* mem_ensure_capacity32
	public PointerPointer mem_ensure_capacity32EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._mem_ensure_capacity32Offset_));
	}

	// void* mem_free_memory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mem_free_memoryOffset_", declaredType="void*")
	public VoidPointer mem_free_memory() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._mem_free_memoryOffset_));
	}

	// void* mem_free_memory
	public PointerPointer mem_free_memoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._mem_free_memoryOffset_));
	}

	// void* mem_free_memory32
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mem_free_memory32Offset_", declaredType="void*")
	public VoidPointer mem_free_memory32() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._mem_free_memory32Offset_));
	}

	// void* mem_free_memory32
	public PointerPointer mem_free_memory32EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._mem_free_memory32Offset_));
	}

	// void* mem_get_category
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mem_get_categoryOffset_", declaredType="void*")
	public VoidPointer mem_get_category() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._mem_get_categoryOffset_));
	}

	// void* mem_get_category
	public PointerPointer mem_get_categoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._mem_get_categoryOffset_));
	}

	// void* mem_reallocate_memory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mem_reallocate_memoryOffset_", declaredType="void*")
	public VoidPointer mem_reallocate_memory() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._mem_reallocate_memoryOffset_));
	}

	// void* mem_reallocate_memory
	public PointerPointer mem_reallocate_memoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._mem_reallocate_memoryOffset_));
	}

	// void* mem_shutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mem_shutdownOffset_", declaredType="void*")
	public VoidPointer mem_shutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._mem_shutdownOffset_));
	}

	// void* mem_shutdown
	public PointerPointer mem_shutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._mem_shutdownOffset_));
	}

	// void* mem_startup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mem_startupOffset_", declaredType="void*")
	public VoidPointer mem_startup() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._mem_startupOffset_));
	}

	// void* mem_startup
	public PointerPointer mem_startupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._mem_startupOffset_));
	}

	// void* mem_walk_categories
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mem_walk_categoriesOffset_", declaredType="void*")
	public VoidPointer mem_walk_categories() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._mem_walk_categoriesOffset_));
	}

	// void* mem_walk_categories
	public PointerPointer mem_walk_categoriesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._mem_walk_categoriesOffset_));
	}

	// void* mmap_capabilities
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mmap_capabilitiesOffset_", declaredType="void*")
	public VoidPointer mmap_capabilities() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._mmap_capabilitiesOffset_));
	}

	// void* mmap_capabilities
	public PointerPointer mmap_capabilitiesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._mmap_capabilitiesOffset_));
	}

	// void* mmap_dont_need
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mmap_dont_needOffset_", declaredType="void*")
	public VoidPointer mmap_dont_need() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._mmap_dont_needOffset_));
	}

	// void* mmap_dont_need
	public PointerPointer mmap_dont_needEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._mmap_dont_needOffset_));
	}

	// void* mmap_get_region_granularity
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mmap_get_region_granularityOffset_", declaredType="void*")
	public VoidPointer mmap_get_region_granularity() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._mmap_get_region_granularityOffset_));
	}

	// void* mmap_get_region_granularity
	public PointerPointer mmap_get_region_granularityEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._mmap_get_region_granularityOffset_));
	}

	// void* mmap_map_file
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mmap_map_fileOffset_", declaredType="void*")
	public VoidPointer mmap_map_file() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._mmap_map_fileOffset_));
	}

	// void* mmap_map_file
	public PointerPointer mmap_map_fileEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._mmap_map_fileOffset_));
	}

	// void* mmap_msync
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mmap_msyncOffset_", declaredType="void*")
	public VoidPointer mmap_msync() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._mmap_msyncOffset_));
	}

	// void* mmap_msync
	public PointerPointer mmap_msyncEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._mmap_msyncOffset_));
	}

	// void* mmap_protect
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mmap_protectOffset_", declaredType="void*")
	public VoidPointer mmap_protect() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._mmap_protectOffset_));
	}

	// void* mmap_protect
	public PointerPointer mmap_protectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._mmap_protectOffset_));
	}

	// void* mmap_shutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mmap_shutdownOffset_", declaredType="void*")
	public VoidPointer mmap_shutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._mmap_shutdownOffset_));
	}

	// void* mmap_shutdown
	public PointerPointer mmap_shutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._mmap_shutdownOffset_));
	}

	// void* mmap_startup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mmap_startupOffset_", declaredType="void*")
	public VoidPointer mmap_startup() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._mmap_startupOffset_));
	}

	// void* mmap_startup
	public PointerPointer mmap_startupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._mmap_startupOffset_));
	}

	// void* mmap_unmap_file
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mmap_unmap_fileOffset_", declaredType="void*")
	public VoidPointer mmap_unmap_file() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._mmap_unmap_fileOffset_));
	}

	// void* mmap_unmap_file
	public PointerPointer mmap_unmap_fileEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._mmap_unmap_fileOffset_));
	}

	// void* nls_free_cached_data
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nls_free_cached_dataOffset_", declaredType="void*")
	public VoidPointer nls_free_cached_data() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._nls_free_cached_dataOffset_));
	}

	// void* nls_free_cached_data
	public PointerPointer nls_free_cached_dataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._nls_free_cached_dataOffset_));
	}

	// void* nls_get_language
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nls_get_languageOffset_", declaredType="void*")
	public VoidPointer nls_get_language() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._nls_get_languageOffset_));
	}

	// void* nls_get_language
	public PointerPointer nls_get_languageEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._nls_get_languageOffset_));
	}

	// void* nls_get_region
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nls_get_regionOffset_", declaredType="void*")
	public VoidPointer nls_get_region() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._nls_get_regionOffset_));
	}

	// void* nls_get_region
	public PointerPointer nls_get_regionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._nls_get_regionOffset_));
	}

	// void* nls_get_variant
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nls_get_variantOffset_", declaredType="void*")
	public VoidPointer nls_get_variant() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._nls_get_variantOffset_));
	}

	// void* nls_get_variant
	public PointerPointer nls_get_variantEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._nls_get_variantOffset_));
	}

	// void* nls_lookup_message
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nls_lookup_messageOffset_", declaredType="void*")
	public VoidPointer nls_lookup_message() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._nls_lookup_messageOffset_));
	}

	// void* nls_lookup_message
	public PointerPointer nls_lookup_messageEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._nls_lookup_messageOffset_));
	}

	// void* nls_printf
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nls_printfOffset_", declaredType="void*")
	public VoidPointer nls_printf() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._nls_printfOffset_));
	}

	// void* nls_printf
	public PointerPointer nls_printfEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._nls_printfOffset_));
	}

	// void* nls_set_catalog
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nls_set_catalogOffset_", declaredType="void*")
	public VoidPointer nls_set_catalog() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._nls_set_catalogOffset_));
	}

	// void* nls_set_catalog
	public PointerPointer nls_set_catalogEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._nls_set_catalogOffset_));
	}

	// void* nls_set_locale
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nls_set_localeOffset_", declaredType="void*")
	public VoidPointer nls_set_locale() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._nls_set_localeOffset_));
	}

	// void* nls_set_locale
	public PointerPointer nls_set_localeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._nls_set_localeOffset_));
	}

	// void* nls_shutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nls_shutdownOffset_", declaredType="void*")
	public VoidPointer nls_shutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._nls_shutdownOffset_));
	}

	// void* nls_shutdown
	public PointerPointer nls_shutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._nls_shutdownOffset_));
	}

	// void* nls_startup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nls_startupOffset_", declaredType="void*")
	public VoidPointer nls_startup() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._nls_startupOffset_));
	}

	// void* nls_startup
	public PointerPointer nls_startupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._nls_startupOffset_));
	}

	// void* nls_vprintf
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nls_vprintfOffset_", declaredType="void*")
	public VoidPointer nls_vprintf() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._nls_vprintfOffset_));
	}

	// void* nls_vprintf
	public PointerPointer nls_vprintfEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._nls_vprintfOffset_));
	}

	// OMRPortLibraryGlobalData* portGlobals
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_portGlobalsOffset_", declaredType="OMRPortLibraryGlobalData*")
	public OMRPortLibraryGlobalDataPointer portGlobals() throws CorruptDataException {
		return OMRPortLibraryGlobalDataPointer.cast(getPointerAtOffset(OMRPortLibrary._portGlobalsOffset_));
	}

	// OMRPortLibraryGlobalData* portGlobals
	public PointerPointer portGlobalsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._portGlobalsOffset_));
	}

	// void* port_control
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_port_controlOffset_", declaredType="void*")
	public VoidPointer port_control() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._port_controlOffset_));
	}

	// void* port_control
	public PointerPointer port_controlEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._port_controlOffset_));
	}

	// void* port_create_library
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_port_create_libraryOffset_", declaredType="void*")
	public VoidPointer port_create_library() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._port_create_libraryOffset_));
	}

	// void* port_create_library
	public PointerPointer port_create_libraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._port_create_libraryOffset_));
	}

	// void* port_init_library
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_port_init_libraryOffset_", declaredType="void*")
	public VoidPointer port_init_library() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._port_init_libraryOffset_));
	}

	// void* port_init_library
	public PointerPointer port_init_libraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._port_init_libraryOffset_));
	}

	// void* port_isFunctionOverridden
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_port_isFunctionOverriddenOffset_", declaredType="void*")
	public VoidPointer port_isFunctionOverridden() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._port_isFunctionOverriddenOffset_));
	}

	// void* port_isFunctionOverridden
	public PointerPointer port_isFunctionOverriddenEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._port_isFunctionOverriddenOffset_));
	}

	// void* port_shutdown_library
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_port_shutdown_libraryOffset_", declaredType="void*")
	public VoidPointer port_shutdown_library() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._port_shutdown_libraryOffset_));
	}

	// void* port_shutdown_library
	public PointerPointer port_shutdown_libraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._port_shutdown_libraryOffset_));
	}

	// void* port_startup_library
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_port_startup_libraryOffset_", declaredType="void*")
	public VoidPointer port_startup_library() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._port_startup_libraryOffset_));
	}

	// void* port_startup_library
	public PointerPointer port_startup_libraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._port_startup_libraryOffset_));
	}

	// void* port_tls_free
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_port_tls_freeOffset_", declaredType="void*")
	public VoidPointer port_tls_free() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._port_tls_freeOffset_));
	}

	// void* port_tls_free
	public PointerPointer port_tls_freeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._port_tls_freeOffset_));
	}

	// void* self_handle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_self_handleOffset_", declaredType="void*")
	public VoidPointer self_handle() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._self_handleOffset_));
	}

	// void* self_handle
	public PointerPointer self_handleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._self_handleOffset_));
	}

	// void* shmem_attach
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_attachOffset_", declaredType="void*")
	public VoidPointer shmem_attach() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shmem_attachOffset_));
	}

	// void* shmem_attach
	public PointerPointer shmem_attachEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shmem_attachOffset_));
	}

	// void* shmem_close
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_closeOffset_", declaredType="void*")
	public VoidPointer shmem_close() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shmem_closeOffset_));
	}

	// void* shmem_close
	public PointerPointer shmem_closeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shmem_closeOffset_));
	}

	// void* shmem_createDir
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_createDirOffset_", declaredType="void*")
	public VoidPointer shmem_createDir() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shmem_createDirOffset_));
	}

	// void* shmem_createDir
	public PointerPointer shmem_createDirEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shmem_createDirOffset_));
	}

	// void* shmem_destroy
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_destroyOffset_", declaredType="void*")
	public VoidPointer shmem_destroy() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shmem_destroyOffset_));
	}

	// void* shmem_destroy
	public PointerPointer shmem_destroyEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shmem_destroyOffset_));
	}

	// void* shmem_destroyDeprecated
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_destroyDeprecatedOffset_", declaredType="void*")
	public VoidPointer shmem_destroyDeprecated() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shmem_destroyDeprecatedOffset_));
	}

	// void* shmem_destroyDeprecated
	public PointerPointer shmem_destroyDeprecatedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shmem_destroyDeprecatedOffset_));
	}

	// void* shmem_detach
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_detachOffset_", declaredType="void*")
	public VoidPointer shmem_detach() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shmem_detachOffset_));
	}

	// void* shmem_detach
	public PointerPointer shmem_detachEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shmem_detachOffset_));
	}

	// void* shmem_findclose
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_findcloseOffset_", declaredType="void*")
	public VoidPointer shmem_findclose() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shmem_findcloseOffset_));
	}

	// void* shmem_findclose
	public PointerPointer shmem_findcloseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shmem_findcloseOffset_));
	}

	// void* shmem_findfirst
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_findfirstOffset_", declaredType="void*")
	public VoidPointer shmem_findfirst() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shmem_findfirstOffset_));
	}

	// void* shmem_findfirst
	public PointerPointer shmem_findfirstEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shmem_findfirstOffset_));
	}

	// void* shmem_findnext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_findnextOffset_", declaredType="void*")
	public VoidPointer shmem_findnext() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shmem_findnextOffset_));
	}

	// void* shmem_findnext
	public PointerPointer shmem_findnextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shmem_findnextOffset_));
	}

	// void* shmem_getDir
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_getDirOffset_", declaredType="void*")
	public VoidPointer shmem_getDir() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shmem_getDirOffset_));
	}

	// void* shmem_getDir
	public PointerPointer shmem_getDirEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shmem_getDirOffset_));
	}

	// void* shmem_getFilepath
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_getFilepathOffset_", declaredType="void*")
	public VoidPointer shmem_getFilepath() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shmem_getFilepathOffset_));
	}

	// void* shmem_getFilepath
	public PointerPointer shmem_getFilepathEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shmem_getFilepathOffset_));
	}

	// void* shmem_get_region_granularity
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_get_region_granularityOffset_", declaredType="void*")
	public VoidPointer shmem_get_region_granularity() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shmem_get_region_granularityOffset_));
	}

	// void* shmem_get_region_granularity
	public PointerPointer shmem_get_region_granularityEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shmem_get_region_granularityOffset_));
	}

	// void* shmem_getid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_getidOffset_", declaredType="void*")
	public VoidPointer shmem_getid() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shmem_getidOffset_));
	}

	// void* shmem_getid
	public PointerPointer shmem_getidEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shmem_getidOffset_));
	}

	// void* shmem_handle_stat
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_handle_statOffset_", declaredType="void*")
	public VoidPointer shmem_handle_stat() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shmem_handle_statOffset_));
	}

	// void* shmem_handle_stat
	public PointerPointer shmem_handle_statEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shmem_handle_statOffset_));
	}

	// void* shmem_open
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_openOffset_", declaredType="void*")
	public VoidPointer shmem_open() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shmem_openOffset_));
	}

	// void* shmem_open
	public PointerPointer shmem_openEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shmem_openOffset_));
	}

	// void* shmem_openDeprecated
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_openDeprecatedOffset_", declaredType="void*")
	public VoidPointer shmem_openDeprecated() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shmem_openDeprecatedOffset_));
	}

	// void* shmem_openDeprecated
	public PointerPointer shmem_openDeprecatedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shmem_openDeprecatedOffset_));
	}

	// void* shmem_protect
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_protectOffset_", declaredType="void*")
	public VoidPointer shmem_protect() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shmem_protectOffset_));
	}

	// void* shmem_protect
	public PointerPointer shmem_protectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shmem_protectOffset_));
	}

	// void* shmem_shutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_shutdownOffset_", declaredType="void*")
	public VoidPointer shmem_shutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shmem_shutdownOffset_));
	}

	// void* shmem_shutdown
	public PointerPointer shmem_shutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shmem_shutdownOffset_));
	}

	// void* shmem_startup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_startupOffset_", declaredType="void*")
	public VoidPointer shmem_startup() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shmem_startupOffset_));
	}

	// void* shmem_startup
	public PointerPointer shmem_startupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shmem_startupOffset_));
	}

	// void* shmem_stat
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_statOffset_", declaredType="void*")
	public VoidPointer shmem_stat() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shmem_statOffset_));
	}

	// void* shmem_stat
	public PointerPointer shmem_statEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shmem_statOffset_));
	}

	// void* shmem_statDeprecated
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shmem_statDeprecatedOffset_", declaredType="void*")
	public VoidPointer shmem_statDeprecated() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shmem_statDeprecatedOffset_));
	}

	// void* shmem_statDeprecated
	public PointerPointer shmem_statDeprecatedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shmem_statDeprecatedOffset_));
	}

	// void* shsem_close
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_closeOffset_", declaredType="void*")
	public VoidPointer shsem_close() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shsem_closeOffset_));
	}

	// void* shsem_close
	public PointerPointer shsem_closeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shsem_closeOffset_));
	}

	// void* shsem_deprecated_close
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_deprecated_closeOffset_", declaredType="void*")
	public VoidPointer shsem_deprecated_close() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shsem_deprecated_closeOffset_));
	}

	// void* shsem_deprecated_close
	public PointerPointer shsem_deprecated_closeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shsem_deprecated_closeOffset_));
	}

	// void* shsem_deprecated_destroy
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_deprecated_destroyOffset_", declaredType="void*")
	public VoidPointer shsem_deprecated_destroy() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shsem_deprecated_destroyOffset_));
	}

	// void* shsem_deprecated_destroy
	public PointerPointer shsem_deprecated_destroyEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shsem_deprecated_destroyOffset_));
	}

	// void* shsem_deprecated_destroyDeprecated
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_deprecated_destroyDeprecatedOffset_", declaredType="void*")
	public VoidPointer shsem_deprecated_destroyDeprecated() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shsem_deprecated_destroyDeprecatedOffset_));
	}

	// void* shsem_deprecated_destroyDeprecated
	public PointerPointer shsem_deprecated_destroyDeprecatedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shsem_deprecated_destroyDeprecatedOffset_));
	}

	// void* shsem_deprecated_getVal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_deprecated_getValOffset_", declaredType="void*")
	public VoidPointer shsem_deprecated_getVal() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shsem_deprecated_getValOffset_));
	}

	// void* shsem_deprecated_getVal
	public PointerPointer shsem_deprecated_getValEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shsem_deprecated_getValOffset_));
	}

	// void* shsem_deprecated_getid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_deprecated_getidOffset_", declaredType="void*")
	public VoidPointer shsem_deprecated_getid() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shsem_deprecated_getidOffset_));
	}

	// void* shsem_deprecated_getid
	public PointerPointer shsem_deprecated_getidEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shsem_deprecated_getidOffset_));
	}

	// void* shsem_deprecated_handle_stat
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_deprecated_handle_statOffset_", declaredType="void*")
	public VoidPointer shsem_deprecated_handle_stat() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shsem_deprecated_handle_statOffset_));
	}

	// void* shsem_deprecated_handle_stat
	public PointerPointer shsem_deprecated_handle_statEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shsem_deprecated_handle_statOffset_));
	}

	// void* shsem_deprecated_open
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_deprecated_openOffset_", declaredType="void*")
	public VoidPointer shsem_deprecated_open() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shsem_deprecated_openOffset_));
	}

	// void* shsem_deprecated_open
	public PointerPointer shsem_deprecated_openEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shsem_deprecated_openOffset_));
	}

	// void* shsem_deprecated_openDeprecated
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_deprecated_openDeprecatedOffset_", declaredType="void*")
	public VoidPointer shsem_deprecated_openDeprecated() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shsem_deprecated_openDeprecatedOffset_));
	}

	// void* shsem_deprecated_openDeprecated
	public PointerPointer shsem_deprecated_openDeprecatedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shsem_deprecated_openDeprecatedOffset_));
	}

	// void* shsem_deprecated_post
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_deprecated_postOffset_", declaredType="void*")
	public VoidPointer shsem_deprecated_post() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shsem_deprecated_postOffset_));
	}

	// void* shsem_deprecated_post
	public PointerPointer shsem_deprecated_postEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shsem_deprecated_postOffset_));
	}

	// void* shsem_deprecated_setVal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_deprecated_setValOffset_", declaredType="void*")
	public VoidPointer shsem_deprecated_setVal() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shsem_deprecated_setValOffset_));
	}

	// void* shsem_deprecated_setVal
	public PointerPointer shsem_deprecated_setValEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shsem_deprecated_setValOffset_));
	}

	// void* shsem_deprecated_shutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_deprecated_shutdownOffset_", declaredType="void*")
	public VoidPointer shsem_deprecated_shutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shsem_deprecated_shutdownOffset_));
	}

	// void* shsem_deprecated_shutdown
	public PointerPointer shsem_deprecated_shutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shsem_deprecated_shutdownOffset_));
	}

	// void* shsem_deprecated_startup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_deprecated_startupOffset_", declaredType="void*")
	public VoidPointer shsem_deprecated_startup() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shsem_deprecated_startupOffset_));
	}

	// void* shsem_deprecated_startup
	public PointerPointer shsem_deprecated_startupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shsem_deprecated_startupOffset_));
	}

	// void* shsem_deprecated_wait
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_deprecated_waitOffset_", declaredType="void*")
	public VoidPointer shsem_deprecated_wait() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shsem_deprecated_waitOffset_));
	}

	// void* shsem_deprecated_wait
	public PointerPointer shsem_deprecated_waitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shsem_deprecated_waitOffset_));
	}

	// void* shsem_destroy
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_destroyOffset_", declaredType="void*")
	public VoidPointer shsem_destroy() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shsem_destroyOffset_));
	}

	// void* shsem_destroy
	public PointerPointer shsem_destroyEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shsem_destroyOffset_));
	}

	// void* shsem_getVal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_getValOffset_", declaredType="void*")
	public VoidPointer shsem_getVal() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shsem_getValOffset_));
	}

	// void* shsem_getVal
	public PointerPointer shsem_getValEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shsem_getValOffset_));
	}

	// void* shsem_open
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_openOffset_", declaredType="void*")
	public VoidPointer shsem_open() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shsem_openOffset_));
	}

	// void* shsem_open
	public PointerPointer shsem_openEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shsem_openOffset_));
	}

	// void* shsem_params_init
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_params_initOffset_", declaredType="void*")
	public VoidPointer shsem_params_init() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shsem_params_initOffset_));
	}

	// void* shsem_params_init
	public PointerPointer shsem_params_initEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shsem_params_initOffset_));
	}

	// void* shsem_post
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_postOffset_", declaredType="void*")
	public VoidPointer shsem_post() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shsem_postOffset_));
	}

	// void* shsem_post
	public PointerPointer shsem_postEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shsem_postOffset_));
	}

	// void* shsem_setVal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_setValOffset_", declaredType="void*")
	public VoidPointer shsem_setVal() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shsem_setValOffset_));
	}

	// void* shsem_setVal
	public PointerPointer shsem_setValEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shsem_setValOffset_));
	}

	// void* shsem_shutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_shutdownOffset_", declaredType="void*")
	public VoidPointer shsem_shutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shsem_shutdownOffset_));
	}

	// void* shsem_shutdown
	public PointerPointer shsem_shutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shsem_shutdownOffset_));
	}

	// void* shsem_startup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_startupOffset_", declaredType="void*")
	public VoidPointer shsem_startup() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shsem_startupOffset_));
	}

	// void* shsem_startup
	public PointerPointer shsem_startupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shsem_startupOffset_));
	}

	// void* shsem_wait
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_shsem_waitOffset_", declaredType="void*")
	public VoidPointer shsem_wait() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._shsem_waitOffset_));
	}

	// void* shsem_wait
	public PointerPointer shsem_waitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._shsem_waitOffset_));
	}

	// void* sig_can_protect
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sig_can_protectOffset_", declaredType="void*")
	public VoidPointer sig_can_protect() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sig_can_protectOffset_));
	}

	// void* sig_can_protect
	public PointerPointer sig_can_protectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sig_can_protectOffset_));
	}

	// void* sig_get_current_signal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sig_get_current_signalOffset_", declaredType="void*")
	public VoidPointer sig_get_current_signal() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sig_get_current_signalOffset_));
	}

	// void* sig_get_current_signal
	public PointerPointer sig_get_current_signalEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sig_get_current_signalOffset_));
	}

	// void* sig_get_options
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sig_get_optionsOffset_", declaredType="void*")
	public VoidPointer sig_get_options() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sig_get_optionsOffset_));
	}

	// void* sig_get_options
	public PointerPointer sig_get_optionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sig_get_optionsOffset_));
	}

	// void* sig_info
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sig_infoOffset_", declaredType="void*")
	public VoidPointer sig_info() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sig_infoOffset_));
	}

	// void* sig_info
	public PointerPointer sig_infoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sig_infoOffset_));
	}

	// void* sig_info_count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sig_info_countOffset_", declaredType="void*")
	public VoidPointer sig_info_count() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sig_info_countOffset_));
	}

	// void* sig_info_count
	public PointerPointer sig_info_countEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sig_info_countOffset_));
	}

	// void* sig_is_main_signal_handler
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sig_is_main_signal_handlerOffset_", declaredType="void*")
	public VoidPointer sig_is_main_signal_handler() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sig_is_main_signal_handlerOffset_));
	}

	// void* sig_is_main_signal_handler
	public PointerPointer sig_is_main_signal_handlerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sig_is_main_signal_handlerOffset_));
	}

	// void* sig_is_signal_ignored
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sig_is_signal_ignoredOffset_", declaredType="void*")
	public VoidPointer sig_is_signal_ignored() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sig_is_signal_ignoredOffset_));
	}

	// void* sig_is_signal_ignored
	public PointerPointer sig_is_signal_ignoredEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sig_is_signal_ignoredOffset_));
	}

	// void* sig_map_os_signal_to_portlib_signal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sig_map_os_signal_to_portlib_signalOffset_", declaredType="void*")
	public VoidPointer sig_map_os_signal_to_portlib_signal() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sig_map_os_signal_to_portlib_signalOffset_));
	}

	// void* sig_map_os_signal_to_portlib_signal
	public PointerPointer sig_map_os_signal_to_portlib_signalEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sig_map_os_signal_to_portlib_signalOffset_));
	}

	// void* sig_map_portlib_signal_to_os_signal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sig_map_portlib_signal_to_os_signalOffset_", declaredType="void*")
	public VoidPointer sig_map_portlib_signal_to_os_signal() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sig_map_portlib_signal_to_os_signalOffset_));
	}

	// void* sig_map_portlib_signal_to_os_signal
	public PointerPointer sig_map_portlib_signal_to_os_signalEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sig_map_portlib_signal_to_os_signalOffset_));
	}

	// void* sig_protect
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sig_protectOffset_", declaredType="void*")
	public VoidPointer sig_protect() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sig_protectOffset_));
	}

	// void* sig_protect
	public PointerPointer sig_protectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sig_protectOffset_));
	}

	// void* sig_register_os_handler
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sig_register_os_handlerOffset_", declaredType="void*")
	public VoidPointer sig_register_os_handler() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sig_register_os_handlerOffset_));
	}

	// void* sig_register_os_handler
	public PointerPointer sig_register_os_handlerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sig_register_os_handlerOffset_));
	}

	// void* sig_set_async_signal_handler
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sig_set_async_signal_handlerOffset_", declaredType="void*")
	public VoidPointer sig_set_async_signal_handler() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sig_set_async_signal_handlerOffset_));
	}

	// void* sig_set_async_signal_handler
	public PointerPointer sig_set_async_signal_handlerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sig_set_async_signal_handlerOffset_));
	}

	// void* sig_set_options
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sig_set_optionsOffset_", declaredType="void*")
	public VoidPointer sig_set_options() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sig_set_optionsOffset_));
	}

	// void* sig_set_options
	public PointerPointer sig_set_optionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sig_set_optionsOffset_));
	}

	// void* sig_set_reporter_priority
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sig_set_reporter_priorityOffset_", declaredType="void*")
	public VoidPointer sig_set_reporter_priority() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sig_set_reporter_priorityOffset_));
	}

	// void* sig_set_reporter_priority
	public PointerPointer sig_set_reporter_priorityEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sig_set_reporter_priorityOffset_));
	}

	// void* sig_set_single_async_signal_handler
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sig_set_single_async_signal_handlerOffset_", declaredType="void*")
	public VoidPointer sig_set_single_async_signal_handler() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sig_set_single_async_signal_handlerOffset_));
	}

	// void* sig_set_single_async_signal_handler
	public PointerPointer sig_set_single_async_signal_handlerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sig_set_single_async_signal_handlerOffset_));
	}

	// void* sig_shutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sig_shutdownOffset_", declaredType="void*")
	public VoidPointer sig_shutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sig_shutdownOffset_));
	}

	// void* sig_shutdown
	public PointerPointer sig_shutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sig_shutdownOffset_));
	}

	// void* sig_startup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sig_startupOffset_", declaredType="void*")
	public VoidPointer sig_startup() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sig_startupOffset_));
	}

	// void* sig_startup
	public PointerPointer sig_startupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sig_startupOffset_));
	}

	// void* sl_close_shared_library
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sl_close_shared_libraryOffset_", declaredType="void*")
	public VoidPointer sl_close_shared_library() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sl_close_shared_libraryOffset_));
	}

	// void* sl_close_shared_library
	public PointerPointer sl_close_shared_libraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sl_close_shared_libraryOffset_));
	}

	// void* sl_lookup_name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sl_lookup_nameOffset_", declaredType="void*")
	public VoidPointer sl_lookup_name() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sl_lookup_nameOffset_));
	}

	// void* sl_lookup_name
	public PointerPointer sl_lookup_nameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sl_lookup_nameOffset_));
	}

	// void* sl_open_shared_library
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sl_open_shared_libraryOffset_", declaredType="void*")
	public VoidPointer sl_open_shared_library() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sl_open_shared_libraryOffset_));
	}

	// void* sl_open_shared_library
	public PointerPointer sl_open_shared_libraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sl_open_shared_libraryOffset_));
	}

	// void* sl_shutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sl_shutdownOffset_", declaredType="void*")
	public VoidPointer sl_shutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sl_shutdownOffset_));
	}

	// void* sl_shutdown
	public PointerPointer sl_shutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sl_shutdownOffset_));
	}

	// void* sl_startup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sl_startupOffset_", declaredType="void*")
	public VoidPointer sl_startup() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sl_startupOffset_));
	}

	// void* sl_startup
	public PointerPointer sl_startupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sl_startupOffset_));
	}

	// void* sock_accept
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_acceptOffset_", declaredType="void*")
	public VoidPointer sock_accept() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_acceptOffset_));
	}

	// void* sock_accept
	public PointerPointer sock_acceptEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_acceptOffset_));
	}

	// void* sock_addrinfo_address
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_addrinfo_addressOffset_", declaredType="void*")
	public VoidPointer sock_addrinfo_address() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_addrinfo_addressOffset_));
	}

	// void* sock_addrinfo_address
	public PointerPointer sock_addrinfo_addressEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_addrinfo_addressOffset_));
	}

	// void* sock_addrinfo_family
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_addrinfo_familyOffset_", declaredType="void*")
	public VoidPointer sock_addrinfo_family() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_addrinfo_familyOffset_));
	}

	// void* sock_addrinfo_family
	public PointerPointer sock_addrinfo_familyEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_addrinfo_familyOffset_));
	}

	// void* sock_addrinfo_length
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_addrinfo_lengthOffset_", declaredType="void*")
	public VoidPointer sock_addrinfo_length() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_addrinfo_lengthOffset_));
	}

	// void* sock_addrinfo_length
	public PointerPointer sock_addrinfo_lengthEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_addrinfo_lengthOffset_));
	}

	// void* sock_addrinfo_protocol
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_addrinfo_protocolOffset_", declaredType="void*")
	public VoidPointer sock_addrinfo_protocol() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_addrinfo_protocolOffset_));
	}

	// void* sock_addrinfo_protocol
	public PointerPointer sock_addrinfo_protocolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_addrinfo_protocolOffset_));
	}

	// void* sock_addrinfo_socktype
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_addrinfo_socktypeOffset_", declaredType="void*")
	public VoidPointer sock_addrinfo_socktype() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_addrinfo_socktypeOffset_));
	}

	// void* sock_addrinfo_socktype
	public PointerPointer sock_addrinfo_socktypeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_addrinfo_socktypeOffset_));
	}

	// void* sock_bind
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_bindOffset_", declaredType="void*")
	public VoidPointer sock_bind() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_bindOffset_));
	}

	// void* sock_bind
	public PointerPointer sock_bindEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_bindOffset_));
	}

	// void* sock_close
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_closeOffset_", declaredType="void*")
	public VoidPointer sock_close() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_closeOffset_));
	}

	// void* sock_close
	public PointerPointer sock_closeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_closeOffset_));
	}

	// void* sock_connect
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_connectOffset_", declaredType="void*")
	public VoidPointer sock_connect() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_connectOffset_));
	}

	// void* sock_connect
	public PointerPointer sock_connectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_connectOffset_));
	}

	// void* sock_fcntl
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_fcntlOffset_", declaredType="void*")
	public VoidPointer sock_fcntl() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_fcntlOffset_));
	}

	// void* sock_fcntl
	public PointerPointer sock_fcntlEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_fcntlOffset_));
	}

	// void* sock_fdset_clr
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_fdset_clrOffset_", declaredType="void*")
	public VoidPointer sock_fdset_clr() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_fdset_clrOffset_));
	}

	// void* sock_fdset_clr
	public PointerPointer sock_fdset_clrEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_fdset_clrOffset_));
	}

	// void* sock_fdset_isset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_fdset_issetOffset_", declaredType="void*")
	public VoidPointer sock_fdset_isset() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_fdset_issetOffset_));
	}

	// void* sock_fdset_isset
	public PointerPointer sock_fdset_issetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_fdset_issetOffset_));
	}

	// void* sock_fdset_set
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_fdset_setOffset_", declaredType="void*")
	public VoidPointer sock_fdset_set() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_fdset_setOffset_));
	}

	// void* sock_fdset_set
	public PointerPointer sock_fdset_setEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_fdset_setOffset_));
	}

	// void* sock_fdset_zero
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_fdset_zeroOffset_", declaredType="void*")
	public VoidPointer sock_fdset_zero() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_fdset_zeroOffset_));
	}

	// void* sock_fdset_zero
	public PointerPointer sock_fdset_zeroEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_fdset_zeroOffset_));
	}

	// void* sock_freeaddrinfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_freeaddrinfoOffset_", declaredType="void*")
	public VoidPointer sock_freeaddrinfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_freeaddrinfoOffset_));
	}

	// void* sock_freeaddrinfo
	public PointerPointer sock_freeaddrinfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_freeaddrinfoOffset_));
	}

	// void* sock_get_pollfd_info
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_get_pollfd_infoOffset_", declaredType="void*")
	public VoidPointer sock_get_pollfd_info() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_get_pollfd_infoOffset_));
	}

	// void* sock_get_pollfd_info
	public PointerPointer sock_get_pollfd_infoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_get_pollfd_infoOffset_));
	}

	// void* sock_getaddrinfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_getaddrinfoOffset_", declaredType="void*")
	public VoidPointer sock_getaddrinfo() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_getaddrinfoOffset_));
	}

	// void* sock_getaddrinfo
	public PointerPointer sock_getaddrinfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_getaddrinfoOffset_));
	}

	// void* sock_getaddrinfo_create_hints
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_getaddrinfo_create_hintsOffset_", declaredType="void*")
	public VoidPointer sock_getaddrinfo_create_hints() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_getaddrinfo_create_hintsOffset_));
	}

	// void* sock_getaddrinfo_create_hints
	public PointerPointer sock_getaddrinfo_create_hintsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_getaddrinfo_create_hintsOffset_));
	}

	// void* sock_getsockopt_int
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_getsockopt_intOffset_", declaredType="void*")
	public VoidPointer sock_getsockopt_int() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_getsockopt_intOffset_));
	}

	// void* sock_getsockopt_int
	public PointerPointer sock_getsockopt_intEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_getsockopt_intOffset_));
	}

	// void* sock_getsockopt_linger
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_getsockopt_lingerOffset_", declaredType="void*")
	public VoidPointer sock_getsockopt_linger() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_getsockopt_lingerOffset_));
	}

	// void* sock_getsockopt_linger
	public PointerPointer sock_getsockopt_lingerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_getsockopt_lingerOffset_));
	}

	// void* sock_getsockopt_timeval
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_getsockopt_timevalOffset_", declaredType="void*")
	public VoidPointer sock_getsockopt_timeval() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_getsockopt_timevalOffset_));
	}

	// void* sock_getsockopt_timeval
	public PointerPointer sock_getsockopt_timevalEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_getsockopt_timevalOffset_));
	}

	// void* sock_htonl
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_htonlOffset_", declaredType="void*")
	public VoidPointer sock_htonl() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_htonlOffset_));
	}

	// void* sock_htonl
	public PointerPointer sock_htonlEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_htonlOffset_));
	}

	// void* sock_htons
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_htonsOffset_", declaredType="void*")
	public VoidPointer sock_htons() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_htonsOffset_));
	}

	// void* sock_htons
	public PointerPointer sock_htonsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_htonsOffset_));
	}

	// void* sock_inet_pton
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_inet_ptonOffset_", declaredType="void*")
	public VoidPointer sock_inet_pton() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_inet_ptonOffset_));
	}

	// void* sock_inet_pton
	public PointerPointer sock_inet_ptonEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_inet_ptonOffset_));
	}

	// void* sock_linger_init
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_linger_initOffset_", declaredType="void*")
	public VoidPointer sock_linger_init() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_linger_initOffset_));
	}

	// void* sock_linger_init
	public PointerPointer sock_linger_initEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_linger_initOffset_));
	}

	// void* sock_listen
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_listenOffset_", declaredType="void*")
	public VoidPointer sock_listen() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_listenOffset_));
	}

	// void* sock_listen
	public PointerPointer sock_listenEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_listenOffset_));
	}

	// void* sock_poll
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_pollOffset_", declaredType="void*")
	public VoidPointer sock_poll() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_pollOffset_));
	}

	// void* sock_poll
	public PointerPointer sock_pollEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_pollOffset_));
	}

	// void* sock_pollfd_init
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_pollfd_initOffset_", declaredType="void*")
	public VoidPointer sock_pollfd_init() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_pollfd_initOffset_));
	}

	// void* sock_pollfd_init
	public PointerPointer sock_pollfd_initEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_pollfd_initOffset_));
	}

	// void* sock_recv
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_recvOffset_", declaredType="void*")
	public VoidPointer sock_recv() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_recvOffset_));
	}

	// void* sock_recv
	public PointerPointer sock_recvEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_recvOffset_));
	}

	// void* sock_recvfrom
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_recvfromOffset_", declaredType="void*")
	public VoidPointer sock_recvfrom() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_recvfromOffset_));
	}

	// void* sock_recvfrom
	public PointerPointer sock_recvfromEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_recvfromOffset_));
	}

	// void* sock_select
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_selectOffset_", declaredType="void*")
	public VoidPointer sock_select() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_selectOffset_));
	}

	// void* sock_select
	public PointerPointer sock_selectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_selectOffset_));
	}

	// void* sock_send
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_sendOffset_", declaredType="void*")
	public VoidPointer sock_send() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_sendOffset_));
	}

	// void* sock_send
	public PointerPointer sock_sendEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_sendOffset_));
	}

	// void* sock_sendto
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_sendtoOffset_", declaredType="void*")
	public VoidPointer sock_sendto() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_sendtoOffset_));
	}

	// void* sock_sendto
	public PointerPointer sock_sendtoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_sendtoOffset_));
	}

	// void* sock_setsockopt_int
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_setsockopt_intOffset_", declaredType="void*")
	public VoidPointer sock_setsockopt_int() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_setsockopt_intOffset_));
	}

	// void* sock_setsockopt_int
	public PointerPointer sock_setsockopt_intEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_setsockopt_intOffset_));
	}

	// void* sock_setsockopt_linger
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_setsockopt_lingerOffset_", declaredType="void*")
	public VoidPointer sock_setsockopt_linger() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_setsockopt_lingerOffset_));
	}

	// void* sock_setsockopt_linger
	public PointerPointer sock_setsockopt_lingerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_setsockopt_lingerOffset_));
	}

	// void* sock_setsockopt_timeval
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_setsockopt_timevalOffset_", declaredType="void*")
	public VoidPointer sock_setsockopt_timeval() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_setsockopt_timevalOffset_));
	}

	// void* sock_setsockopt_timeval
	public PointerPointer sock_setsockopt_timevalEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_setsockopt_timevalOffset_));
	}

	// void* sock_shutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_shutdownOffset_", declaredType="void*")
	public VoidPointer sock_shutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_shutdownOffset_));
	}

	// void* sock_shutdown
	public PointerPointer sock_shutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_shutdownOffset_));
	}

	// void* sock_sockaddr_init
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_sockaddr_initOffset_", declaredType="void*")
	public VoidPointer sock_sockaddr_init() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_sockaddr_initOffset_));
	}

	// void* sock_sockaddr_init
	public PointerPointer sock_sockaddr_initEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_sockaddr_initOffset_));
	}

	// void* sock_sockaddr_init6
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_sockaddr_init6Offset_", declaredType="void*")
	public VoidPointer sock_sockaddr_init6() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_sockaddr_init6Offset_));
	}

	// void* sock_sockaddr_init6
	public PointerPointer sock_sockaddr_init6EA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_sockaddr_init6Offset_));
	}

	// void* sock_socket
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_socketOffset_", declaredType="void*")
	public VoidPointer sock_socket() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_socketOffset_));
	}

	// void* sock_socket
	public PointerPointer sock_socketEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_socketOffset_));
	}

	// void* sock_socket_getfd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_socket_getfdOffset_", declaredType="void*")
	public VoidPointer sock_socket_getfd() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_socket_getfdOffset_));
	}

	// void* sock_socket_getfd
	public PointerPointer sock_socket_getfdEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_socket_getfdOffset_));
	}

	// void* sock_startup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_startupOffset_", declaredType="void*")
	public VoidPointer sock_startup() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_startupOffset_));
	}

	// void* sock_startup
	public PointerPointer sock_startupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_startupOffset_));
	}

	// void* sock_timeval_init
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sock_timeval_initOffset_", declaredType="void*")
	public VoidPointer sock_timeval_init() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sock_timeval_initOffset_));
	}

	// void* sock_timeval_init
	public PointerPointer sock_timeval_initEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sock_timeval_initOffset_));
	}

	// void* str_convert
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_str_convertOffset_", declaredType="void*")
	public VoidPointer str_convert() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._str_convertOffset_));
	}

	// void* str_convert
	public PointerPointer str_convertEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._str_convertOffset_));
	}

	// void* str_create_tokens
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_str_create_tokensOffset_", declaredType="void*")
	public VoidPointer str_create_tokens() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._str_create_tokensOffset_));
	}

	// void* str_create_tokens
	public PointerPointer str_create_tokensEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._str_create_tokensOffset_));
	}

	// void* str_free_tokens
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_str_free_tokensOffset_", declaredType="void*")
	public VoidPointer str_free_tokens() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._str_free_tokensOffset_));
	}

	// void* str_free_tokens
	public PointerPointer str_free_tokensEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._str_free_tokensOffset_));
	}

	// void* str_ftime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_str_ftimeOffset_", declaredType="void*")
	public VoidPointer str_ftime() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._str_ftimeOffset_));
	}

	// void* str_ftime
	public PointerPointer str_ftimeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._str_ftimeOffset_));
	}

	// void* str_printf
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_str_printfOffset_", declaredType="void*")
	public VoidPointer str_printf() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._str_printfOffset_));
	}

	// void* str_printf
	public PointerPointer str_printfEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._str_printfOffset_));
	}

	// void* str_set_time_tokens
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_str_set_time_tokensOffset_", declaredType="void*")
	public VoidPointer str_set_time_tokens() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._str_set_time_tokensOffset_));
	}

	// void* str_set_time_tokens
	public PointerPointer str_set_time_tokensEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._str_set_time_tokensOffset_));
	}

	// void* str_set_token
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_str_set_tokenOffset_", declaredType="void*")
	public VoidPointer str_set_token() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._str_set_tokenOffset_));
	}

	// void* str_set_token
	public PointerPointer str_set_tokenEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._str_set_tokenOffset_));
	}

	// void* str_shutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_str_shutdownOffset_", declaredType="void*")
	public VoidPointer str_shutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._str_shutdownOffset_));
	}

	// void* str_shutdown
	public PointerPointer str_shutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._str_shutdownOffset_));
	}

	// void* str_startup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_str_startupOffset_", declaredType="void*")
	public VoidPointer str_startup() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._str_startupOffset_));
	}

	// void* str_startup
	public PointerPointer str_startupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._str_startupOffset_));
	}

	// void* str_subst_tokens
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_str_subst_tokensOffset_", declaredType="void*")
	public VoidPointer str_subst_tokens() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._str_subst_tokensOffset_));
	}

	// void* str_subst_tokens
	public PointerPointer str_subst_tokensEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._str_subst_tokensOffset_));
	}

	// void* str_vprintf
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_str_vprintfOffset_", declaredType="void*")
	public VoidPointer str_vprintf() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._str_vprintfOffset_));
	}

	// void* str_vprintf
	public PointerPointer str_vprintfEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._str_vprintfOffset_));
	}

	// void* sysinfo_cgroup_are_subsystems_available
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_cgroup_are_subsystems_availableOffset_", declaredType="void*")
	public VoidPointer sysinfo_cgroup_are_subsystems_available() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_cgroup_are_subsystems_availableOffset_));
	}

	// void* sysinfo_cgroup_are_subsystems_available
	public PointerPointer sysinfo_cgroup_are_subsystems_availableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_cgroup_are_subsystems_availableOffset_));
	}

	// void* sysinfo_cgroup_are_subsystems_enabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_cgroup_are_subsystems_enabledOffset_", declaredType="void*")
	public VoidPointer sysinfo_cgroup_are_subsystems_enabled() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_cgroup_are_subsystems_enabledOffset_));
	}

	// void* sysinfo_cgroup_are_subsystems_enabled
	public PointerPointer sysinfo_cgroup_are_subsystems_enabledEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_cgroup_are_subsystems_enabledOffset_));
	}

	// void* sysinfo_cgroup_enable_subsystems
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_cgroup_enable_subsystemsOffset_", declaredType="void*")
	public VoidPointer sysinfo_cgroup_enable_subsystems() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_cgroup_enable_subsystemsOffset_));
	}

	// void* sysinfo_cgroup_enable_subsystems
	public PointerPointer sysinfo_cgroup_enable_subsystemsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_cgroup_enable_subsystemsOffset_));
	}

	// void* sysinfo_cgroup_get_available_subsystems
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_cgroup_get_available_subsystemsOffset_", declaredType="void*")
	public VoidPointer sysinfo_cgroup_get_available_subsystems() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_cgroup_get_available_subsystemsOffset_));
	}

	// void* sysinfo_cgroup_get_available_subsystems
	public PointerPointer sysinfo_cgroup_get_available_subsystemsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_cgroup_get_available_subsystemsOffset_));
	}

	// void* sysinfo_cgroup_get_enabled_subsystems
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_cgroup_get_enabled_subsystemsOffset_", declaredType="void*")
	public VoidPointer sysinfo_cgroup_get_enabled_subsystems() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_cgroup_get_enabled_subsystemsOffset_));
	}

	// void* sysinfo_cgroup_get_enabled_subsystems
	public PointerPointer sysinfo_cgroup_get_enabled_subsystemsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_cgroup_get_enabled_subsystemsOffset_));
	}

	// void* sysinfo_cgroup_get_memlimit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_cgroup_get_memlimitOffset_", declaredType="void*")
	public VoidPointer sysinfo_cgroup_get_memlimit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_cgroup_get_memlimitOffset_));
	}

	// void* sysinfo_cgroup_get_memlimit
	public PointerPointer sysinfo_cgroup_get_memlimitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_cgroup_get_memlimitOffset_));
	}

	// void* sysinfo_cgroup_is_memlimit_set
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_cgroup_is_memlimit_setOffset_", declaredType="void*")
	public VoidPointer sysinfo_cgroup_is_memlimit_set() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_cgroup_is_memlimit_setOffset_));
	}

	// void* sysinfo_cgroup_is_memlimit_set
	public PointerPointer sysinfo_cgroup_is_memlimit_setEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_cgroup_is_memlimit_setOffset_));
	}

	// void* sysinfo_cgroup_is_system_available
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_cgroup_is_system_availableOffset_", declaredType="void*")
	public VoidPointer sysinfo_cgroup_is_system_available() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_cgroup_is_system_availableOffset_));
	}

	// void* sysinfo_cgroup_is_system_available
	public PointerPointer sysinfo_cgroup_is_system_availableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_cgroup_is_system_availableOffset_));
	}

	// void* sysinfo_cgroup_subsystem_iterator_destroy
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_cgroup_subsystem_iterator_destroyOffset_", declaredType="void*")
	public VoidPointer sysinfo_cgroup_subsystem_iterator_destroy() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_cgroup_subsystem_iterator_destroyOffset_));
	}

	// void* sysinfo_cgroup_subsystem_iterator_destroy
	public PointerPointer sysinfo_cgroup_subsystem_iterator_destroyEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_cgroup_subsystem_iterator_destroyOffset_));
	}

	// void* sysinfo_cgroup_subsystem_iterator_hasNext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_cgroup_subsystem_iterator_hasNextOffset_", declaredType="void*")
	public VoidPointer sysinfo_cgroup_subsystem_iterator_hasNext() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_cgroup_subsystem_iterator_hasNextOffset_));
	}

	// void* sysinfo_cgroup_subsystem_iterator_hasNext
	public PointerPointer sysinfo_cgroup_subsystem_iterator_hasNextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_cgroup_subsystem_iterator_hasNextOffset_));
	}

	// void* sysinfo_cgroup_subsystem_iterator_init
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_cgroup_subsystem_iterator_initOffset_", declaredType="void*")
	public VoidPointer sysinfo_cgroup_subsystem_iterator_init() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_cgroup_subsystem_iterator_initOffset_));
	}

	// void* sysinfo_cgroup_subsystem_iterator_init
	public PointerPointer sysinfo_cgroup_subsystem_iterator_initEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_cgroup_subsystem_iterator_initOffset_));
	}

	// void* sysinfo_cgroup_subsystem_iterator_metricKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_cgroup_subsystem_iterator_metricKeyOffset_", declaredType="void*")
	public VoidPointer sysinfo_cgroup_subsystem_iterator_metricKey() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_cgroup_subsystem_iterator_metricKeyOffset_));
	}

	// void* sysinfo_cgroup_subsystem_iterator_metricKey
	public PointerPointer sysinfo_cgroup_subsystem_iterator_metricKeyEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_cgroup_subsystem_iterator_metricKeyOffset_));
	}

	// void* sysinfo_cgroup_subsystem_iterator_next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_cgroup_subsystem_iterator_nextOffset_", declaredType="void*")
	public VoidPointer sysinfo_cgroup_subsystem_iterator_next() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_cgroup_subsystem_iterator_nextOffset_));
	}

	// void* sysinfo_cgroup_subsystem_iterator_next
	public PointerPointer sysinfo_cgroup_subsystem_iterator_nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_cgroup_subsystem_iterator_nextOffset_));
	}

	// void* sysinfo_destroy_processor_info
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_destroy_processor_infoOffset_", declaredType="void*")
	public VoidPointer sysinfo_destroy_processor_info() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_destroy_processor_infoOffset_));
	}

	// void* sysinfo_destroy_processor_info
	public PointerPointer sysinfo_destroy_processor_infoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_destroy_processor_infoOffset_));
	}

	// void* sysinfo_env_iterator_hasNext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_env_iterator_hasNextOffset_", declaredType="void*")
	public VoidPointer sysinfo_env_iterator_hasNext() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_env_iterator_hasNextOffset_));
	}

	// void* sysinfo_env_iterator_hasNext
	public PointerPointer sysinfo_env_iterator_hasNextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_env_iterator_hasNextOffset_));
	}

	// void* sysinfo_env_iterator_init
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_env_iterator_initOffset_", declaredType="void*")
	public VoidPointer sysinfo_env_iterator_init() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_env_iterator_initOffset_));
	}

	// void* sysinfo_env_iterator_init
	public PointerPointer sysinfo_env_iterator_initEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_env_iterator_initOffset_));
	}

	// void* sysinfo_env_iterator_next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_env_iterator_nextOffset_", declaredType="void*")
	public VoidPointer sysinfo_env_iterator_next() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_env_iterator_nextOffset_));
	}

	// void* sysinfo_env_iterator_next
	public PointerPointer sysinfo_env_iterator_nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_env_iterator_nextOffset_));
	}

	// void* sysinfo_get_CPU_architecture
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_CPU_architectureOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_CPU_architecture() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_get_CPU_architectureOffset_));
	}

	// void* sysinfo_get_CPU_architecture
	public PointerPointer sysinfo_get_CPU_architectureEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_get_CPU_architectureOffset_));
	}

	// void* sysinfo_get_CPU_load
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_CPU_loadOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_CPU_load() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_get_CPU_loadOffset_));
	}

	// void* sysinfo_get_CPU_load
	public PointerPointer sysinfo_get_CPU_loadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_get_CPU_loadOffset_));
	}

	// void* sysinfo_get_CPU_utilization
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_CPU_utilizationOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_CPU_utilization() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_get_CPU_utilizationOffset_));
	}

	// void* sysinfo_get_CPU_utilization
	public PointerPointer sysinfo_get_CPU_utilizationEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_get_CPU_utilizationOffset_));
	}

	// void* sysinfo_get_OS_type
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_OS_typeOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_OS_type() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_get_OS_typeOffset_));
	}

	// void* sysinfo_get_OS_type
	public PointerPointer sysinfo_get_OS_typeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_get_OS_typeOffset_));
	}

	// void* sysinfo_get_OS_version
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_OS_versionOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_OS_version() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_get_OS_versionOffset_));
	}

	// void* sysinfo_get_OS_version
	public PointerPointer sysinfo_get_OS_versionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_get_OS_versionOffset_));
	}

	// void* sysinfo_get_addressable_physical_memory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_addressable_physical_memoryOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_addressable_physical_memory() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_get_addressable_physical_memoryOffset_));
	}

	// void* sysinfo_get_addressable_physical_memory
	public PointerPointer sysinfo_get_addressable_physical_memoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_get_addressable_physical_memoryOffset_));
	}

	// void* sysinfo_get_cgroup_subsystem_list
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_cgroup_subsystem_listOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_cgroup_subsystem_list() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_get_cgroup_subsystem_listOffset_));
	}

	// void* sysinfo_get_cgroup_subsystem_list
	public PointerPointer sysinfo_get_cgroup_subsystem_listEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_get_cgroup_subsystem_listOffset_));
	}

	// void* sysinfo_get_cwd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_cwdOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_cwd() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_get_cwdOffset_));
	}

	// void* sysinfo_get_cwd
	public PointerPointer sysinfo_get_cwdEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_get_cwdOffset_));
	}

	// void* sysinfo_get_egid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_egidOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_egid() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_get_egidOffset_));
	}

	// void* sysinfo_get_egid
	public PointerPointer sysinfo_get_egidEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_get_egidOffset_));
	}

	// void* sysinfo_get_env
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_envOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_env() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_get_envOffset_));
	}

	// void* sysinfo_get_env
	public PointerPointer sysinfo_get_envEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_get_envOffset_));
	}

	// void* sysinfo_get_euid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_euidOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_euid() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_get_euidOffset_));
	}

	// void* sysinfo_get_euid
	public PointerPointer sysinfo_get_euidEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_get_euidOffset_));
	}

	// void* sysinfo_get_executable_name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_executable_nameOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_executable_name() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_get_executable_nameOffset_));
	}

	// void* sysinfo_get_executable_name
	public PointerPointer sysinfo_get_executable_nameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_get_executable_nameOffset_));
	}

	// void* sysinfo_get_groupname
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_groupnameOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_groupname() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_get_groupnameOffset_));
	}

	// void* sysinfo_get_groupname
	public PointerPointer sysinfo_get_groupnameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_get_groupnameOffset_));
	}

	// void* sysinfo_get_groups
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_groupsOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_groups() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_get_groupsOffset_));
	}

	// void* sysinfo_get_groups
	public PointerPointer sysinfo_get_groupsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_get_groupsOffset_));
	}

	// void* sysinfo_get_hostname
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_hostnameOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_hostname() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_get_hostnameOffset_));
	}

	// void* sysinfo_get_hostname
	public PointerPointer sysinfo_get_hostnameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_get_hostnameOffset_));
	}

	// void* sysinfo_get_limit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_limitOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_limit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_get_limitOffset_));
	}

	// void* sysinfo_get_limit
	public PointerPointer sysinfo_get_limitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_get_limitOffset_));
	}

	// void* sysinfo_get_load_average
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_load_averageOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_load_average() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_get_load_averageOffset_));
	}

	// void* sysinfo_get_load_average
	public PointerPointer sysinfo_get_load_averageEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_get_load_averageOffset_));
	}

	// void* sysinfo_get_memory_info
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_memory_infoOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_memory_info() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_get_memory_infoOffset_));
	}

	// void* sysinfo_get_memory_info
	public PointerPointer sysinfo_get_memory_infoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_get_memory_infoOffset_));
	}

	// void* sysinfo_get_number_CPUs_by_type
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_number_CPUs_by_typeOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_number_CPUs_by_type() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_get_number_CPUs_by_typeOffset_));
	}

	// void* sysinfo_get_number_CPUs_by_type
	public PointerPointer sysinfo_get_number_CPUs_by_typeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_get_number_CPUs_by_typeOffset_));
	}

	// void* sysinfo_get_open_file_count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_open_file_countOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_open_file_count() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_get_open_file_countOffset_));
	}

	// void* sysinfo_get_open_file_count
	public PointerPointer sysinfo_get_open_file_countEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_get_open_file_countOffset_));
	}

	// void* sysinfo_get_os_description
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_os_descriptionOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_os_description() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_get_os_descriptionOffset_));
	}

	// void* sysinfo_get_os_description
	public PointerPointer sysinfo_get_os_descriptionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_get_os_descriptionOffset_));
	}

	// void* sysinfo_get_physical_memory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_physical_memoryOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_physical_memory() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_get_physical_memoryOffset_));
	}

	// void* sysinfo_get_physical_memory
	public PointerPointer sysinfo_get_physical_memoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_get_physical_memoryOffset_));
	}

	// void* sysinfo_get_pid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_pidOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_pid() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_get_pidOffset_));
	}

	// void* sysinfo_get_pid
	public PointerPointer sysinfo_get_pidEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_get_pidOffset_));
	}

	// void* sysinfo_get_ppid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_ppidOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_ppid() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_get_ppidOffset_));
	}

	// void* sysinfo_get_ppid
	public PointerPointer sysinfo_get_ppidEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_get_ppidOffset_));
	}

	// void* sysinfo_get_processor_description
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_processor_descriptionOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_processor_description() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_get_processor_descriptionOffset_));
	}

	// void* sysinfo_get_processor_description
	public PointerPointer sysinfo_get_processor_descriptionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_get_processor_descriptionOffset_));
	}

	// void* sysinfo_get_processor_feature_name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_processor_feature_nameOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_processor_feature_name() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_get_processor_feature_nameOffset_));
	}

	// void* sysinfo_get_processor_feature_name
	public PointerPointer sysinfo_get_processor_feature_nameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_get_processor_feature_nameOffset_));
	}

	// void* sysinfo_get_processor_feature_string
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_processor_feature_stringOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_processor_feature_string() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_get_processor_feature_stringOffset_));
	}

	// void* sysinfo_get_processor_feature_string
	public PointerPointer sysinfo_get_processor_feature_stringEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_get_processor_feature_stringOffset_));
	}

	// void* sysinfo_get_processor_info
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_processor_infoOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_processor_info() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_get_processor_infoOffset_));
	}

	// void* sysinfo_get_processor_info
	public PointerPointer sysinfo_get_processor_infoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_get_processor_infoOffset_));
	}

	// void* sysinfo_get_tmp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_tmpOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_tmp() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_get_tmpOffset_));
	}

	// void* sysinfo_get_tmp
	public PointerPointer sysinfo_get_tmpEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_get_tmpOffset_));
	}

	// void* sysinfo_get_username
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_get_usernameOffset_", declaredType="void*")
	public VoidPointer sysinfo_get_username() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_get_usernameOffset_));
	}

	// void* sysinfo_get_username
	public PointerPointer sysinfo_get_usernameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_get_usernameOffset_));
	}

	// void* sysinfo_is_running_in_container
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_is_running_in_containerOffset_", declaredType="void*")
	public VoidPointer sysinfo_is_running_in_container() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_is_running_in_containerOffset_));
	}

	// void* sysinfo_is_running_in_container
	public PointerPointer sysinfo_is_running_in_containerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_is_running_in_containerOffset_));
	}

	// void* sysinfo_limit_iterator_hasNext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_limit_iterator_hasNextOffset_", declaredType="void*")
	public VoidPointer sysinfo_limit_iterator_hasNext() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_limit_iterator_hasNextOffset_));
	}

	// void* sysinfo_limit_iterator_hasNext
	public PointerPointer sysinfo_limit_iterator_hasNextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_limit_iterator_hasNextOffset_));
	}

	// void* sysinfo_limit_iterator_init
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_limit_iterator_initOffset_", declaredType="void*")
	public VoidPointer sysinfo_limit_iterator_init() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_limit_iterator_initOffset_));
	}

	// void* sysinfo_limit_iterator_init
	public PointerPointer sysinfo_limit_iterator_initEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_limit_iterator_initOffset_));
	}

	// void* sysinfo_limit_iterator_next
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_limit_iterator_nextOffset_", declaredType="void*")
	public VoidPointer sysinfo_limit_iterator_next() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_limit_iterator_nextOffset_));
	}

	// void* sysinfo_limit_iterator_next
	public PointerPointer sysinfo_limit_iterator_nextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_limit_iterator_nextOffset_));
	}

	// void* sysinfo_os_has_feature
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_os_has_featureOffset_", declaredType="void*")
	public VoidPointer sysinfo_os_has_feature() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_os_has_featureOffset_));
	}

	// void* sysinfo_os_has_feature
	public PointerPointer sysinfo_os_has_featureEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_os_has_featureOffset_));
	}

	// void* sysinfo_os_kernel_info
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_os_kernel_infoOffset_", declaredType="void*")
	public VoidPointer sysinfo_os_kernel_info() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_os_kernel_infoOffset_));
	}

	// void* sysinfo_os_kernel_info
	public PointerPointer sysinfo_os_kernel_infoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_os_kernel_infoOffset_));
	}

	// void* sysinfo_process_exists
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_process_existsOffset_", declaredType="void*")
	public VoidPointer sysinfo_process_exists() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_process_existsOffset_));
	}

	// void* sysinfo_process_exists
	public PointerPointer sysinfo_process_existsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_process_existsOffset_));
	}

	// void* sysinfo_processor_has_feature
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_processor_has_featureOffset_", declaredType="void*")
	public VoidPointer sysinfo_processor_has_feature() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_processor_has_featureOffset_));
	}

	// void* sysinfo_processor_has_feature
	public PointerPointer sysinfo_processor_has_featureEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_processor_has_featureOffset_));
	}

	// void* sysinfo_processor_set_feature
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_processor_set_featureOffset_", declaredType="void*")
	public VoidPointer sysinfo_processor_set_feature() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_processor_set_featureOffset_));
	}

	// void* sysinfo_processor_set_feature
	public PointerPointer sysinfo_processor_set_featureEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_processor_set_featureOffset_));
	}

	// void* sysinfo_set_limit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_set_limitOffset_", declaredType="void*")
	public VoidPointer sysinfo_set_limit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_set_limitOffset_));
	}

	// void* sysinfo_set_limit
	public PointerPointer sysinfo_set_limitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_set_limitOffset_));
	}

	// void* sysinfo_set_number_user_specified_CPUs
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_set_number_user_specified_CPUsOffset_", declaredType="void*")
	public VoidPointer sysinfo_set_number_user_specified_CPUs() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_set_number_user_specified_CPUsOffset_));
	}

	// void* sysinfo_set_number_user_specified_CPUs
	public PointerPointer sysinfo_set_number_user_specified_CPUsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_set_number_user_specified_CPUsOffset_));
	}

	// void* sysinfo_shutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_shutdownOffset_", declaredType="void*")
	public VoidPointer sysinfo_shutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_shutdownOffset_));
	}

	// void* sysinfo_shutdown
	public PointerPointer sysinfo_shutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_shutdownOffset_));
	}

	// void* sysinfo_startup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysinfo_startupOffset_", declaredType="void*")
	public VoidPointer sysinfo_startup() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._sysinfo_startupOffset_));
	}

	// void* sysinfo_startup
	public PointerPointer sysinfo_startupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._sysinfo_startupOffset_));
	}

	// void* syslog_query
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_syslog_queryOffset_", declaredType="void*")
	public VoidPointer syslog_query() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._syslog_queryOffset_));
	}

	// void* syslog_query
	public PointerPointer syslog_queryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._syslog_queryOffset_));
	}

	// void* syslog_set
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_syslog_setOffset_", declaredType="void*")
	public VoidPointer syslog_set() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._syslog_setOffset_));
	}

	// void* syslog_set
	public PointerPointer syslog_setEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._syslog_setOffset_));
	}

	// void* syslog_write
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_syslog_writeOffset_", declaredType="void*")
	public VoidPointer syslog_write() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._syslog_writeOffset_));
	}

	// void* syslog_write
	public PointerPointer syslog_writeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._syslog_writeOffset_));
	}

	// void* time_current_time_millis
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_time_current_time_millisOffset_", declaredType="void*")
	public VoidPointer time_current_time_millis() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._time_current_time_millisOffset_));
	}

	// void* time_current_time_millis
	public PointerPointer time_current_time_millisEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._time_current_time_millisOffset_));
	}

	// void* time_current_time_nanos
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_time_current_time_nanosOffset_", declaredType="void*")
	public VoidPointer time_current_time_nanos() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._time_current_time_nanosOffset_));
	}

	// void* time_current_time_nanos
	public PointerPointer time_current_time_nanosEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._time_current_time_nanosOffset_));
	}

	// void* time_hires_clock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_time_hires_clockOffset_", declaredType="void*")
	public VoidPointer time_hires_clock() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._time_hires_clockOffset_));
	}

	// void* time_hires_clock
	public PointerPointer time_hires_clockEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._time_hires_clockOffset_));
	}

	// void* time_hires_delta
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_time_hires_deltaOffset_", declaredType="void*")
	public VoidPointer time_hires_delta() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._time_hires_deltaOffset_));
	}

	// void* time_hires_delta
	public PointerPointer time_hires_deltaEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._time_hires_deltaOffset_));
	}

	// void* time_hires_frequency
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_time_hires_frequencyOffset_", declaredType="void*")
	public VoidPointer time_hires_frequency() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._time_hires_frequencyOffset_));
	}

	// void* time_hires_frequency
	public PointerPointer time_hires_frequencyEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._time_hires_frequencyOffset_));
	}

	// void* time_msec_clock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_time_msec_clockOffset_", declaredType="void*")
	public VoidPointer time_msec_clock() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._time_msec_clockOffset_));
	}

	// void* time_msec_clock
	public PointerPointer time_msec_clockEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._time_msec_clockOffset_));
	}

	// void* time_nano_time
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_time_nano_timeOffset_", declaredType="void*")
	public VoidPointer time_nano_time() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._time_nano_timeOffset_));
	}

	// void* time_nano_time
	public PointerPointer time_nano_timeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._time_nano_timeOffset_));
	}

	// void* time_shutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_time_shutdownOffset_", declaredType="void*")
	public VoidPointer time_shutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._time_shutdownOffset_));
	}

	// void* time_shutdown
	public PointerPointer time_shutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._time_shutdownOffset_));
	}

	// void* time_startup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_time_startupOffset_", declaredType="void*")
	public VoidPointer time_startup() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._time_startupOffset_));
	}

	// void* time_startup
	public PointerPointer time_startupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._time_startupOffset_));
	}

	// void* time_usec_clock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_time_usec_clockOffset_", declaredType="void*")
	public VoidPointer time_usec_clock() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._time_usec_clockOffset_));
	}

	// void* time_usec_clock
	public PointerPointer time_usec_clockEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._time_usec_clockOffset_));
	}

	// void* tty_available
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tty_availableOffset_", declaredType="void*")
	public VoidPointer tty_available() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._tty_availableOffset_));
	}

	// void* tty_available
	public PointerPointer tty_availableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._tty_availableOffset_));
	}

	// void* tty_daemonize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tty_daemonizeOffset_", declaredType="void*")
	public VoidPointer tty_daemonize() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._tty_daemonizeOffset_));
	}

	// void* tty_daemonize
	public PointerPointer tty_daemonizeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._tty_daemonizeOffset_));
	}

	// void* tty_err_printf
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tty_err_printfOffset_", declaredType="void*")
	public VoidPointer tty_err_printf() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._tty_err_printfOffset_));
	}

	// void* tty_err_printf
	public PointerPointer tty_err_printfEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._tty_err_printfOffset_));
	}

	// void* tty_err_vprintf
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tty_err_vprintfOffset_", declaredType="void*")
	public VoidPointer tty_err_vprintf() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._tty_err_vprintfOffset_));
	}

	// void* tty_err_vprintf
	public PointerPointer tty_err_vprintfEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._tty_err_vprintfOffset_));
	}

	// void* tty_get_chars
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tty_get_charsOffset_", declaredType="void*")
	public VoidPointer tty_get_chars() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._tty_get_charsOffset_));
	}

	// void* tty_get_chars
	public PointerPointer tty_get_charsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._tty_get_charsOffset_));
	}

	// void* tty_printf
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tty_printfOffset_", declaredType="void*")
	public VoidPointer tty_printf() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._tty_printfOffset_));
	}

	// void* tty_printf
	public PointerPointer tty_printfEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._tty_printfOffset_));
	}

	// void* tty_shutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tty_shutdownOffset_", declaredType="void*")
	public VoidPointer tty_shutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._tty_shutdownOffset_));
	}

	// void* tty_shutdown
	public PointerPointer tty_shutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._tty_shutdownOffset_));
	}

	// void* tty_startup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tty_startupOffset_", declaredType="void*")
	public VoidPointer tty_startup() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._tty_startupOffset_));
	}

	// void* tty_startup
	public PointerPointer tty_startupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._tty_startupOffset_));
	}

	// void* tty_vprintf
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tty_vprintfOffset_", declaredType="void*")
	public VoidPointer tty_vprintf() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._tty_vprintfOffset_));
	}

	// void* tty_vprintf
	public PointerPointer tty_vprintfEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._tty_vprintfOffset_));
	}

	// void* vmem_commit_memory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmem_commit_memoryOffset_", declaredType="void*")
	public VoidPointer vmem_commit_memory() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._vmem_commit_memoryOffset_));
	}

	// void* vmem_commit_memory
	public PointerPointer vmem_commit_memoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._vmem_commit_memoryOffset_));
	}

	// void* vmem_create_double_mapped_region
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmem_create_double_mapped_regionOffset_", declaredType="void*")
	public VoidPointer vmem_create_double_mapped_region() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._vmem_create_double_mapped_regionOffset_));
	}

	// void* vmem_create_double_mapped_region
	public PointerPointer vmem_create_double_mapped_regionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._vmem_create_double_mapped_regionOffset_));
	}

	// void* vmem_decommit_memory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmem_decommit_memoryOffset_", declaredType="void*")
	public VoidPointer vmem_decommit_memory() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._vmem_decommit_memoryOffset_));
	}

	// void* vmem_decommit_memory
	public PointerPointer vmem_decommit_memoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._vmem_decommit_memoryOffset_));
	}

	// void* vmem_default_large_page_size_ex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmem_default_large_page_size_exOffset_", declaredType="void*")
	public VoidPointer vmem_default_large_page_size_ex() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._vmem_default_large_page_size_exOffset_));
	}

	// void* vmem_default_large_page_size_ex
	public PointerPointer vmem_default_large_page_size_exEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._vmem_default_large_page_size_exOffset_));
	}

	// void* vmem_find_valid_page_size
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmem_find_valid_page_sizeOffset_", declaredType="void*")
	public VoidPointer vmem_find_valid_page_size() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._vmem_find_valid_page_sizeOffset_));
	}

	// void* vmem_find_valid_page_size
	public PointerPointer vmem_find_valid_page_sizeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._vmem_find_valid_page_sizeOffset_));
	}

	// void* vmem_free_memory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmem_free_memoryOffset_", declaredType="void*")
	public VoidPointer vmem_free_memory() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._vmem_free_memoryOffset_));
	}

	// void* vmem_free_memory
	public PointerPointer vmem_free_memoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._vmem_free_memoryOffset_));
	}

	// void* vmem_get_available_physical_memory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmem_get_available_physical_memoryOffset_", declaredType="void*")
	public VoidPointer vmem_get_available_physical_memory() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._vmem_get_available_physical_memoryOffset_));
	}

	// void* vmem_get_available_physical_memory
	public PointerPointer vmem_get_available_physical_memoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._vmem_get_available_physical_memoryOffset_));
	}

	// void* vmem_get_contiguous_region_memory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmem_get_contiguous_region_memoryOffset_", declaredType="void*")
	public VoidPointer vmem_get_contiguous_region_memory() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._vmem_get_contiguous_region_memoryOffset_));
	}

	// void* vmem_get_contiguous_region_memory
	public PointerPointer vmem_get_contiguous_region_memoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._vmem_get_contiguous_region_memoryOffset_));
	}

	// void* vmem_get_page_flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmem_get_page_flagsOffset_", declaredType="void*")
	public VoidPointer vmem_get_page_flags() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._vmem_get_page_flagsOffset_));
	}

	// void* vmem_get_page_flags
	public PointerPointer vmem_get_page_flagsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._vmem_get_page_flagsOffset_));
	}

	// void* vmem_get_page_size
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmem_get_page_sizeOffset_", declaredType="void*")
	public VoidPointer vmem_get_page_size() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._vmem_get_page_sizeOffset_));
	}

	// void* vmem_get_page_size
	public PointerPointer vmem_get_page_sizeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._vmem_get_page_sizeOffset_));
	}

	// void* vmem_get_process_memory_size
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmem_get_process_memory_sizeOffset_", declaredType="void*")
	public VoidPointer vmem_get_process_memory_size() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._vmem_get_process_memory_sizeOffset_));
	}

	// void* vmem_get_process_memory_size
	public PointerPointer vmem_get_process_memory_sizeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._vmem_get_process_memory_sizeOffset_));
	}

	// void* vmem_numa_get_node_details
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmem_numa_get_node_detailsOffset_", declaredType="void*")
	public VoidPointer vmem_numa_get_node_details() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._vmem_numa_get_node_detailsOffset_));
	}

	// void* vmem_numa_get_node_details
	public PointerPointer vmem_numa_get_node_detailsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._vmem_numa_get_node_detailsOffset_));
	}

	// void* vmem_numa_set_affinity
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmem_numa_set_affinityOffset_", declaredType="void*")
	public VoidPointer vmem_numa_set_affinity() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._vmem_numa_set_affinityOffset_));
	}

	// void* vmem_numa_set_affinity
	public PointerPointer vmem_numa_set_affinityEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._vmem_numa_set_affinityOffset_));
	}

	// void* vmem_release_double_mapped_region
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmem_release_double_mapped_regionOffset_", declaredType="void*")
	public VoidPointer vmem_release_double_mapped_region() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._vmem_release_double_mapped_regionOffset_));
	}

	// void* vmem_release_double_mapped_region
	public PointerPointer vmem_release_double_mapped_regionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._vmem_release_double_mapped_regionOffset_));
	}

	// void* vmem_reserve_memory
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmem_reserve_memoryOffset_", declaredType="void*")
	public VoidPointer vmem_reserve_memory() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._vmem_reserve_memoryOffset_));
	}

	// void* vmem_reserve_memory
	public PointerPointer vmem_reserve_memoryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._vmem_reserve_memoryOffset_));
	}

	// void* vmem_reserve_memory_ex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmem_reserve_memory_exOffset_", declaredType="void*")
	public VoidPointer vmem_reserve_memory_ex() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._vmem_reserve_memory_exOffset_));
	}

	// void* vmem_reserve_memory_ex
	public PointerPointer vmem_reserve_memory_exEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._vmem_reserve_memory_exOffset_));
	}

	// void* vmem_shutdown
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmem_shutdownOffset_", declaredType="void*")
	public VoidPointer vmem_shutdown() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._vmem_shutdownOffset_));
	}

	// void* vmem_shutdown
	public PointerPointer vmem_shutdownEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._vmem_shutdownOffset_));
	}

	// void* vmem_startup
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmem_startupOffset_", declaredType="void*")
	public VoidPointer vmem_startup() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._vmem_startupOffset_));
	}

	// void* vmem_startup
	public PointerPointer vmem_startupEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._vmem_startupOffset_));
	}

	// void* vmem_supported_page_flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmem_supported_page_flagsOffset_", declaredType="void*")
	public VoidPointer vmem_supported_page_flags() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._vmem_supported_page_flagsOffset_));
	}

	// void* vmem_supported_page_flags
	public PointerPointer vmem_supported_page_flagsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._vmem_supported_page_flagsOffset_));
	}

	// void* vmem_supported_page_sizes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmem_supported_page_sizesOffset_", declaredType="void*")
	public VoidPointer vmem_supported_page_sizes() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._vmem_supported_page_sizesOffset_));
	}

	// void* vmem_supported_page_sizes
	public PointerPointer vmem_supported_page_sizesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._vmem_supported_page_sizesOffset_));
	}

	// void* vmem_vmem_params_init
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmem_vmem_params_initOffset_", declaredType="void*")
	public VoidPointer vmem_vmem_params_init() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMRPortLibrary._vmem_vmem_params_initOffset_));
	}

	// void* vmem_vmem_params_init
	public PointerPointer vmem_vmem_params_initEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRPortLibrary._vmem_vmem_params_initOffset_));
	}

}
