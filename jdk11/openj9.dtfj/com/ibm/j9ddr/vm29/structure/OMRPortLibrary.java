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
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0 OR GPL-2.0 WITH Classpath-exception-2.0 OR LicenseRef-GPL-2.0 WITH Assembly-exception
 *******************************************************************************/
package com.ibm.j9ddr.vm29.structure;

/**
 * Structure: OMRPortLibrary
 *
 * This stub class represents a class that can return in memory offsets
 * to VM C and C++ structures.
 *
 * This particular implementation exists only to allow StructurePointer code to
 * compile at development time.  This is never loaded at run time.
 *
 * At runtime generated byte codes returning actual offset values from the core file
 * will be loaded by the StructureClassLoader.
 */
public final class OMRPortLibrary {

	// VM Constants

	public static final long SIZEOF;

	// Offsets

	public static final int _cpu_flush_icacheOffset_;
	public static final int _cpu_get_cache_line_sizeOffset_;
	public static final int _cpu_shutdownOffset_;
	public static final int _cpu_startupOffset_;
	public static final int _dump_createOffset_;
	public static final int _dump_shutdownOffset_;
	public static final int _dump_startupOffset_;
	public static final int _error_last_error_messageOffset_;
	public static final int _error_last_error_numberOffset_;
	public static final int _error_set_last_errorOffset_;
	public static final int _error_set_last_error_with_messageOffset_;
	public static final int _error_set_last_error_with_message_formatOffset_;
	public static final int _error_shutdownOffset_;
	public static final int _error_startupOffset_;
	public static final int _exit_get_exit_codeOffset_;
	public static final int _exit_shutdownOffset_;
	public static final int _exit_shutdown_and_exitOffset_;
	public static final int _exit_startupOffset_;
	public static final int _file_attrOffset_;
	public static final int _file_blockingasync_closeOffset_;
	public static final int _file_blockingasync_flengthOffset_;
	public static final int _file_blockingasync_lock_bytesOffset_;
	public static final int _file_blockingasync_openOffset_;
	public static final int _file_blockingasync_readOffset_;
	public static final int _file_blockingasync_set_lengthOffset_;
	public static final int _file_blockingasync_shutdownOffset_;
	public static final int _file_blockingasync_startupOffset_;
	public static final int _file_blockingasync_unlock_bytesOffset_;
	public static final int _file_blockingasync_writeOffset_;
	public static final int _file_chmodOffset_;
	public static final int _file_chownOffset_;
	public static final int _file_closeOffset_;
	public static final int _file_convert_native_fd_to_omrfile_fdOffset_;
	public static final int _file_convert_omrfile_fd_to_native_fdOffset_;
	public static final int _file_error_messageOffset_;
	public static final int _file_findcloseOffset_;
	public static final int _file_findfirstOffset_;
	public static final int _file_findnextOffset_;
	public static final int _file_flengthOffset_;
	public static final int _file_fstatOffset_;
	public static final int _file_get_text_encodingOffset_;
	public static final int _file_lastmodOffset_;
	public static final int _file_lengthOffset_;
	public static final int _file_lock_bytesOffset_;
	public static final int _file_mkdirOffset_;
	public static final int _file_moveOffset_;
	public static final int _file_openOffset_;
	public static final int _file_printfOffset_;
	public static final int _file_readOffset_;
	public static final int _file_read_textOffset_;
	public static final int _file_seekOffset_;
	public static final int _file_set_lengthOffset_;
	public static final int _file_shutdownOffset_;
	public static final int _file_startupOffset_;
	public static final int _file_statOffset_;
	public static final int _file_stat_filesystemOffset_;
	public static final int _file_syncOffset_;
	public static final int _file_unlinkOffset_;
	public static final int _file_unlinkdirOffset_;
	public static final int _file_unlock_bytesOffset_;
	public static final int _file_vprintfOffset_;
	public static final int _file_writeOffset_;
	public static final int _file_write_textOffset_;
	public static final int _filestream_closeOffset_;
	public static final int _filestream_fdopenOffset_;
	public static final int _filestream_filenoOffset_;
	public static final int _filestream_openOffset_;
	public static final int _filestream_printfOffset_;
	public static final int _filestream_setbufferOffset_;
	public static final int _filestream_shutdownOffset_;
	public static final int _filestream_startupOffset_;
	public static final int _filestream_syncOffset_;
	public static final int _filestream_vprintfOffset_;
	public static final int _filestream_writeOffset_;
	public static final int _filestream_write_textOffset_;
	public static final int _heap_allocateOffset_;
	public static final int _heap_createOffset_;
	public static final int _heap_freeOffset_;
	public static final int _heap_growOffset_;
	public static final int _heap_query_sizeOffset_;
	public static final int _heap_reallocateOffset_;
	public static final int _introspect_backtrace_symbolsOffset_;
	public static final int _introspect_backtrace_threadOffset_;
	public static final int _introspect_set_suspend_signal_offsetOffset_;
	public static final int _introspect_shutdownOffset_;
	public static final int _introspect_startupOffset_;
	public static final int _introspect_threads_nextDoOffset_;
	public static final int _introspect_threads_startDoOffset_;
	public static final int _introspect_threads_startDo_with_signalOffset_;
	public static final int _mem_advise_and_free_memoryOffset_;
	public static final int _mem_allocate_memoryOffset_;
	public static final int _mem_allocate_memory32Offset_;
	public static final int _mem_categories_decrement_countersOffset_;
	public static final int _mem_categories_increment_countersOffset_;
	public static final int _mem_ensure_capacity32Offset_;
	public static final int _mem_free_memoryOffset_;
	public static final int _mem_free_memory32Offset_;
	public static final int _mem_get_categoryOffset_;
	public static final int _mem_reallocate_memoryOffset_;
	public static final int _mem_shutdownOffset_;
	public static final int _mem_startupOffset_;
	public static final int _mem_walk_categoriesOffset_;
	public static final int _mmap_capabilitiesOffset_;
	public static final int _mmap_dont_needOffset_;
	public static final int _mmap_get_region_granularityOffset_;
	public static final int _mmap_map_fileOffset_;
	public static final int _mmap_msyncOffset_;
	public static final int _mmap_protectOffset_;
	public static final int _mmap_shutdownOffset_;
	public static final int _mmap_startupOffset_;
	public static final int _mmap_unmap_fileOffset_;
	public static final int _nls_free_cached_dataOffset_;
	public static final int _nls_get_languageOffset_;
	public static final int _nls_get_regionOffset_;
	public static final int _nls_get_variantOffset_;
	public static final int _nls_lookup_messageOffset_;
	public static final int _nls_printfOffset_;
	public static final int _nls_set_catalogOffset_;
	public static final int _nls_set_localeOffset_;
	public static final int _nls_shutdownOffset_;
	public static final int _nls_startupOffset_;
	public static final int _nls_vprintfOffset_;
	public static final int _portGlobalsOffset_;
	public static final int _port_controlOffset_;
	public static final int _port_create_libraryOffset_;
	public static final int _port_init_libraryOffset_;
	public static final int _port_isFunctionOverriddenOffset_;
	public static final int _port_shutdown_libraryOffset_;
	public static final int _port_startup_libraryOffset_;
	public static final int _port_tls_freeOffset_;
	public static final int _self_handleOffset_;
	public static final int _shmem_attachOffset_;
	public static final int _shmem_closeOffset_;
	public static final int _shmem_createDirOffset_;
	public static final int _shmem_destroyOffset_;
	public static final int _shmem_destroyDeprecatedOffset_;
	public static final int _shmem_detachOffset_;
	public static final int _shmem_findcloseOffset_;
	public static final int _shmem_findfirstOffset_;
	public static final int _shmem_findnextOffset_;
	public static final int _shmem_getDirOffset_;
	public static final int _shmem_getFilepathOffset_;
	public static final int _shmem_get_region_granularityOffset_;
	public static final int _shmem_getidOffset_;
	public static final int _shmem_handle_statOffset_;
	public static final int _shmem_openOffset_;
	public static final int _shmem_openDeprecatedOffset_;
	public static final int _shmem_protectOffset_;
	public static final int _shmem_shutdownOffset_;
	public static final int _shmem_startupOffset_;
	public static final int _shmem_statOffset_;
	public static final int _shmem_statDeprecatedOffset_;
	public static final int _shsem_closeOffset_;
	public static final int _shsem_deprecated_closeOffset_;
	public static final int _shsem_deprecated_destroyOffset_;
	public static final int _shsem_deprecated_destroyDeprecatedOffset_;
	public static final int _shsem_deprecated_getValOffset_;
	public static final int _shsem_deprecated_getidOffset_;
	public static final int _shsem_deprecated_handle_statOffset_;
	public static final int _shsem_deprecated_openOffset_;
	public static final int _shsem_deprecated_openDeprecatedOffset_;
	public static final int _shsem_deprecated_postOffset_;
	public static final int _shsem_deprecated_setValOffset_;
	public static final int _shsem_deprecated_shutdownOffset_;
	public static final int _shsem_deprecated_startupOffset_;
	public static final int _shsem_deprecated_waitOffset_;
	public static final int _shsem_destroyOffset_;
	public static final int _shsem_getValOffset_;
	public static final int _shsem_openOffset_;
	public static final int _shsem_params_initOffset_;
	public static final int _shsem_postOffset_;
	public static final int _shsem_setValOffset_;
	public static final int _shsem_shutdownOffset_;
	public static final int _shsem_startupOffset_;
	public static final int _shsem_waitOffset_;
	public static final int _sig_can_protectOffset_;
	public static final int _sig_get_current_signalOffset_;
	public static final int _sig_get_optionsOffset_;
	public static final int _sig_infoOffset_;
	public static final int _sig_info_countOffset_;
	public static final int _sig_is_main_signal_handlerOffset_;
	public static final int _sig_is_signal_ignoredOffset_;
	public static final int _sig_map_os_signal_to_portlib_signalOffset_;
	public static final int _sig_map_portlib_signal_to_os_signalOffset_;
	public static final int _sig_protectOffset_;
	public static final int _sig_register_os_handlerOffset_;
	public static final int _sig_set_async_signal_handlerOffset_;
	public static final int _sig_set_optionsOffset_;
	public static final int _sig_set_reporter_priorityOffset_;
	public static final int _sig_set_single_async_signal_handlerOffset_;
	public static final int _sig_shutdownOffset_;
	public static final int _sig_startupOffset_;
	public static final int _sl_close_shared_libraryOffset_;
	public static final int _sl_lookup_nameOffset_;
	public static final int _sl_open_shared_libraryOffset_;
	public static final int _sl_shutdownOffset_;
	public static final int _sl_startupOffset_;
	public static final int _sock_acceptOffset_;
	public static final int _sock_addrinfo_addressOffset_;
	public static final int _sock_addrinfo_familyOffset_;
	public static final int _sock_addrinfo_lengthOffset_;
	public static final int _sock_addrinfo_protocolOffset_;
	public static final int _sock_addrinfo_socktypeOffset_;
	public static final int _sock_bindOffset_;
	public static final int _sock_closeOffset_;
	public static final int _sock_connectOffset_;
	public static final int _sock_fcntlOffset_;
	public static final int _sock_fdset_clrOffset_;
	public static final int _sock_fdset_issetOffset_;
	public static final int _sock_fdset_setOffset_;
	public static final int _sock_fdset_zeroOffset_;
	public static final int _sock_freeaddrinfoOffset_;
	public static final int _sock_get_pollfd_infoOffset_;
	public static final int _sock_getaddrinfoOffset_;
	public static final int _sock_getaddrinfo_create_hintsOffset_;
	public static final int _sock_getsockopt_intOffset_;
	public static final int _sock_getsockopt_lingerOffset_;
	public static final int _sock_getsockopt_timevalOffset_;
	public static final int _sock_htonlOffset_;
	public static final int _sock_htonsOffset_;
	public static final int _sock_inet_ptonOffset_;
	public static final int _sock_linger_initOffset_;
	public static final int _sock_listenOffset_;
	public static final int _sock_pollOffset_;
	public static final int _sock_pollfd_initOffset_;
	public static final int _sock_recvOffset_;
	public static final int _sock_recvfromOffset_;
	public static final int _sock_selectOffset_;
	public static final int _sock_sendOffset_;
	public static final int _sock_sendtoOffset_;
	public static final int _sock_setsockopt_intOffset_;
	public static final int _sock_setsockopt_lingerOffset_;
	public static final int _sock_setsockopt_timevalOffset_;
	public static final int _sock_shutdownOffset_;
	public static final int _sock_sockaddr_initOffset_;
	public static final int _sock_sockaddr_init6Offset_;
	public static final int _sock_socketOffset_;
	public static final int _sock_socket_getfdOffset_;
	public static final int _sock_startupOffset_;
	public static final int _sock_timeval_initOffset_;
	public static final int _str_convertOffset_;
	public static final int _str_create_tokensOffset_;
	public static final int _str_free_tokensOffset_;
	public static final int _str_ftimeOffset_;
	public static final int _str_printfOffset_;
	public static final int _str_set_time_tokensOffset_;
	public static final int _str_set_tokenOffset_;
	public static final int _str_shutdownOffset_;
	public static final int _str_startupOffset_;
	public static final int _str_subst_tokensOffset_;
	public static final int _str_vprintfOffset_;
	public static final int _sysinfo_cgroup_are_subsystems_availableOffset_;
	public static final int _sysinfo_cgroup_are_subsystems_enabledOffset_;
	public static final int _sysinfo_cgroup_enable_subsystemsOffset_;
	public static final int _sysinfo_cgroup_get_available_subsystemsOffset_;
	public static final int _sysinfo_cgroup_get_enabled_subsystemsOffset_;
	public static final int _sysinfo_cgroup_get_memlimitOffset_;
	public static final int _sysinfo_cgroup_is_memlimit_setOffset_;
	public static final int _sysinfo_cgroup_is_system_availableOffset_;
	public static final int _sysinfo_cgroup_subsystem_iterator_destroyOffset_;
	public static final int _sysinfo_cgroup_subsystem_iterator_hasNextOffset_;
	public static final int _sysinfo_cgroup_subsystem_iterator_initOffset_;
	public static final int _sysinfo_cgroup_subsystem_iterator_metricKeyOffset_;
	public static final int _sysinfo_cgroup_subsystem_iterator_nextOffset_;
	public static final int _sysinfo_destroy_processor_infoOffset_;
	public static final int _sysinfo_env_iterator_hasNextOffset_;
	public static final int _sysinfo_env_iterator_initOffset_;
	public static final int _sysinfo_env_iterator_nextOffset_;
	public static final int _sysinfo_get_CPU_architectureOffset_;
	public static final int _sysinfo_get_CPU_loadOffset_;
	public static final int _sysinfo_get_CPU_utilizationOffset_;
	public static final int _sysinfo_get_OS_typeOffset_;
	public static final int _sysinfo_get_OS_versionOffset_;
	public static final int _sysinfo_get_addressable_physical_memoryOffset_;
	public static final int _sysinfo_get_cgroup_subsystem_listOffset_;
	public static final int _sysinfo_get_cwdOffset_;
	public static final int _sysinfo_get_egidOffset_;
	public static final int _sysinfo_get_envOffset_;
	public static final int _sysinfo_get_euidOffset_;
	public static final int _sysinfo_get_executable_nameOffset_;
	public static final int _sysinfo_get_groupnameOffset_;
	public static final int _sysinfo_get_groupsOffset_;
	public static final int _sysinfo_get_hostnameOffset_;
	public static final int _sysinfo_get_limitOffset_;
	public static final int _sysinfo_get_load_averageOffset_;
	public static final int _sysinfo_get_memory_infoOffset_;
	public static final int _sysinfo_get_number_CPUs_by_typeOffset_;
	public static final int _sysinfo_get_open_file_countOffset_;
	public static final int _sysinfo_get_os_descriptionOffset_;
	public static final int _sysinfo_get_physical_memoryOffset_;
	public static final int _sysinfo_get_pidOffset_;
	public static final int _sysinfo_get_ppidOffset_;
	public static final int _sysinfo_get_processor_descriptionOffset_;
	public static final int _sysinfo_get_processor_feature_nameOffset_;
	public static final int _sysinfo_get_processor_feature_stringOffset_;
	public static final int _sysinfo_get_processor_infoOffset_;
	public static final int _sysinfo_get_tmpOffset_;
	public static final int _sysinfo_get_usernameOffset_;
	public static final int _sysinfo_is_running_in_containerOffset_;
	public static final int _sysinfo_limit_iterator_hasNextOffset_;
	public static final int _sysinfo_limit_iterator_initOffset_;
	public static final int _sysinfo_limit_iterator_nextOffset_;
	public static final int _sysinfo_os_has_featureOffset_;
	public static final int _sysinfo_os_kernel_infoOffset_;
	public static final int _sysinfo_process_existsOffset_;
	public static final int _sysinfo_processor_has_featureOffset_;
	public static final int _sysinfo_processor_set_featureOffset_;
	public static final int _sysinfo_set_limitOffset_;
	public static final int _sysinfo_set_number_user_specified_CPUsOffset_;
	public static final int _sysinfo_shutdownOffset_;
	public static final int _sysinfo_startupOffset_;
	public static final int _syslog_queryOffset_;
	public static final int _syslog_setOffset_;
	public static final int _syslog_writeOffset_;
	public static final int _time_current_time_millisOffset_;
	public static final int _time_current_time_nanosOffset_;
	public static final int _time_hires_clockOffset_;
	public static final int _time_hires_deltaOffset_;
	public static final int _time_hires_frequencyOffset_;
	public static final int _time_msec_clockOffset_;
	public static final int _time_nano_timeOffset_;
	public static final int _time_shutdownOffset_;
	public static final int _time_startupOffset_;
	public static final int _time_usec_clockOffset_;
	public static final int _tty_availableOffset_;
	public static final int _tty_daemonizeOffset_;
	public static final int _tty_err_printfOffset_;
	public static final int _tty_err_vprintfOffset_;
	public static final int _tty_get_charsOffset_;
	public static final int _tty_printfOffset_;
	public static final int _tty_shutdownOffset_;
	public static final int _tty_startupOffset_;
	public static final int _tty_vprintfOffset_;
	public static final int _vmem_commit_memoryOffset_;
	public static final int _vmem_create_double_mapped_regionOffset_;
	public static final int _vmem_decommit_memoryOffset_;
	public static final int _vmem_default_large_page_size_exOffset_;
	public static final int _vmem_find_valid_page_sizeOffset_;
	public static final int _vmem_free_memoryOffset_;
	public static final int _vmem_get_available_physical_memoryOffset_;
	public static final int _vmem_get_contiguous_region_memoryOffset_;
	public static final int _vmem_get_page_flagsOffset_;
	public static final int _vmem_get_page_sizeOffset_;
	public static final int _vmem_get_process_memory_sizeOffset_;
	public static final int _vmem_numa_get_node_detailsOffset_;
	public static final int _vmem_numa_set_affinityOffset_;
	public static final int _vmem_release_double_mapped_regionOffset_;
	public static final int _vmem_reserve_memoryOffset_;
	public static final int _vmem_reserve_memory_exOffset_;
	public static final int _vmem_shutdownOffset_;
	public static final int _vmem_startupOffset_;
	public static final int _vmem_supported_page_flagsOffset_;
	public static final int _vmem_supported_page_sizesOffset_;
	public static final int _vmem_vmem_params_initOffset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		_cpu_flush_icacheOffset_ = 0;
		_cpu_get_cache_line_sizeOffset_ = 0;
		_cpu_shutdownOffset_ = 0;
		_cpu_startupOffset_ = 0;
		_dump_createOffset_ = 0;
		_dump_shutdownOffset_ = 0;
		_dump_startupOffset_ = 0;
		_error_last_error_messageOffset_ = 0;
		_error_last_error_numberOffset_ = 0;
		_error_set_last_errorOffset_ = 0;
		_error_set_last_error_with_messageOffset_ = 0;
		_error_set_last_error_with_message_formatOffset_ = 0;
		_error_shutdownOffset_ = 0;
		_error_startupOffset_ = 0;
		_exit_get_exit_codeOffset_ = 0;
		_exit_shutdownOffset_ = 0;
		_exit_shutdown_and_exitOffset_ = 0;
		_exit_startupOffset_ = 0;
		_file_attrOffset_ = 0;
		_file_blockingasync_closeOffset_ = 0;
		_file_blockingasync_flengthOffset_ = 0;
		_file_blockingasync_lock_bytesOffset_ = 0;
		_file_blockingasync_openOffset_ = 0;
		_file_blockingasync_readOffset_ = 0;
		_file_blockingasync_set_lengthOffset_ = 0;
		_file_blockingasync_shutdownOffset_ = 0;
		_file_blockingasync_startupOffset_ = 0;
		_file_blockingasync_unlock_bytesOffset_ = 0;
		_file_blockingasync_writeOffset_ = 0;
		_file_chmodOffset_ = 0;
		_file_chownOffset_ = 0;
		_file_closeOffset_ = 0;
		_file_convert_native_fd_to_omrfile_fdOffset_ = 0;
		_file_convert_omrfile_fd_to_native_fdOffset_ = 0;
		_file_error_messageOffset_ = 0;
		_file_findcloseOffset_ = 0;
		_file_findfirstOffset_ = 0;
		_file_findnextOffset_ = 0;
		_file_flengthOffset_ = 0;
		_file_fstatOffset_ = 0;
		_file_get_text_encodingOffset_ = 0;
		_file_lastmodOffset_ = 0;
		_file_lengthOffset_ = 0;
		_file_lock_bytesOffset_ = 0;
		_file_mkdirOffset_ = 0;
		_file_moveOffset_ = 0;
		_file_openOffset_ = 0;
		_file_printfOffset_ = 0;
		_file_readOffset_ = 0;
		_file_read_textOffset_ = 0;
		_file_seekOffset_ = 0;
		_file_set_lengthOffset_ = 0;
		_file_shutdownOffset_ = 0;
		_file_startupOffset_ = 0;
		_file_statOffset_ = 0;
		_file_stat_filesystemOffset_ = 0;
		_file_syncOffset_ = 0;
		_file_unlinkOffset_ = 0;
		_file_unlinkdirOffset_ = 0;
		_file_unlock_bytesOffset_ = 0;
		_file_vprintfOffset_ = 0;
		_file_writeOffset_ = 0;
		_file_write_textOffset_ = 0;
		_filestream_closeOffset_ = 0;
		_filestream_fdopenOffset_ = 0;
		_filestream_filenoOffset_ = 0;
		_filestream_openOffset_ = 0;
		_filestream_printfOffset_ = 0;
		_filestream_setbufferOffset_ = 0;
		_filestream_shutdownOffset_ = 0;
		_filestream_startupOffset_ = 0;
		_filestream_syncOffset_ = 0;
		_filestream_vprintfOffset_ = 0;
		_filestream_writeOffset_ = 0;
		_filestream_write_textOffset_ = 0;
		_heap_allocateOffset_ = 0;
		_heap_createOffset_ = 0;
		_heap_freeOffset_ = 0;
		_heap_growOffset_ = 0;
		_heap_query_sizeOffset_ = 0;
		_heap_reallocateOffset_ = 0;
		_introspect_backtrace_symbolsOffset_ = 0;
		_introspect_backtrace_threadOffset_ = 0;
		_introspect_set_suspend_signal_offsetOffset_ = 0;
		_introspect_shutdownOffset_ = 0;
		_introspect_startupOffset_ = 0;
		_introspect_threads_nextDoOffset_ = 0;
		_introspect_threads_startDoOffset_ = 0;
		_introspect_threads_startDo_with_signalOffset_ = 0;
		_mem_advise_and_free_memoryOffset_ = 0;
		_mem_allocate_memoryOffset_ = 0;
		_mem_allocate_memory32Offset_ = 0;
		_mem_categories_decrement_countersOffset_ = 0;
		_mem_categories_increment_countersOffset_ = 0;
		_mem_ensure_capacity32Offset_ = 0;
		_mem_free_memoryOffset_ = 0;
		_mem_free_memory32Offset_ = 0;
		_mem_get_categoryOffset_ = 0;
		_mem_reallocate_memoryOffset_ = 0;
		_mem_shutdownOffset_ = 0;
		_mem_startupOffset_ = 0;
		_mem_walk_categoriesOffset_ = 0;
		_mmap_capabilitiesOffset_ = 0;
		_mmap_dont_needOffset_ = 0;
		_mmap_get_region_granularityOffset_ = 0;
		_mmap_map_fileOffset_ = 0;
		_mmap_msyncOffset_ = 0;
		_mmap_protectOffset_ = 0;
		_mmap_shutdownOffset_ = 0;
		_mmap_startupOffset_ = 0;
		_mmap_unmap_fileOffset_ = 0;
		_nls_free_cached_dataOffset_ = 0;
		_nls_get_languageOffset_ = 0;
		_nls_get_regionOffset_ = 0;
		_nls_get_variantOffset_ = 0;
		_nls_lookup_messageOffset_ = 0;
		_nls_printfOffset_ = 0;
		_nls_set_catalogOffset_ = 0;
		_nls_set_localeOffset_ = 0;
		_nls_shutdownOffset_ = 0;
		_nls_startupOffset_ = 0;
		_nls_vprintfOffset_ = 0;
		_portGlobalsOffset_ = 0;
		_port_controlOffset_ = 0;
		_port_create_libraryOffset_ = 0;
		_port_init_libraryOffset_ = 0;
		_port_isFunctionOverriddenOffset_ = 0;
		_port_shutdown_libraryOffset_ = 0;
		_port_startup_libraryOffset_ = 0;
		_port_tls_freeOffset_ = 0;
		_self_handleOffset_ = 0;
		_shmem_attachOffset_ = 0;
		_shmem_closeOffset_ = 0;
		_shmem_createDirOffset_ = 0;
		_shmem_destroyOffset_ = 0;
		_shmem_destroyDeprecatedOffset_ = 0;
		_shmem_detachOffset_ = 0;
		_shmem_findcloseOffset_ = 0;
		_shmem_findfirstOffset_ = 0;
		_shmem_findnextOffset_ = 0;
		_shmem_getDirOffset_ = 0;
		_shmem_getFilepathOffset_ = 0;
		_shmem_get_region_granularityOffset_ = 0;
		_shmem_getidOffset_ = 0;
		_shmem_handle_statOffset_ = 0;
		_shmem_openOffset_ = 0;
		_shmem_openDeprecatedOffset_ = 0;
		_shmem_protectOffset_ = 0;
		_shmem_shutdownOffset_ = 0;
		_shmem_startupOffset_ = 0;
		_shmem_statOffset_ = 0;
		_shmem_statDeprecatedOffset_ = 0;
		_shsem_closeOffset_ = 0;
		_shsem_deprecated_closeOffset_ = 0;
		_shsem_deprecated_destroyOffset_ = 0;
		_shsem_deprecated_destroyDeprecatedOffset_ = 0;
		_shsem_deprecated_getValOffset_ = 0;
		_shsem_deprecated_getidOffset_ = 0;
		_shsem_deprecated_handle_statOffset_ = 0;
		_shsem_deprecated_openOffset_ = 0;
		_shsem_deprecated_openDeprecatedOffset_ = 0;
		_shsem_deprecated_postOffset_ = 0;
		_shsem_deprecated_setValOffset_ = 0;
		_shsem_deprecated_shutdownOffset_ = 0;
		_shsem_deprecated_startupOffset_ = 0;
		_shsem_deprecated_waitOffset_ = 0;
		_shsem_destroyOffset_ = 0;
		_shsem_getValOffset_ = 0;
		_shsem_openOffset_ = 0;
		_shsem_params_initOffset_ = 0;
		_shsem_postOffset_ = 0;
		_shsem_setValOffset_ = 0;
		_shsem_shutdownOffset_ = 0;
		_shsem_startupOffset_ = 0;
		_shsem_waitOffset_ = 0;
		_sig_can_protectOffset_ = 0;
		_sig_get_current_signalOffset_ = 0;
		_sig_get_optionsOffset_ = 0;
		_sig_infoOffset_ = 0;
		_sig_info_countOffset_ = 0;
		_sig_is_main_signal_handlerOffset_ = 0;
		_sig_is_signal_ignoredOffset_ = 0;
		_sig_map_os_signal_to_portlib_signalOffset_ = 0;
		_sig_map_portlib_signal_to_os_signalOffset_ = 0;
		_sig_protectOffset_ = 0;
		_sig_register_os_handlerOffset_ = 0;
		_sig_set_async_signal_handlerOffset_ = 0;
		_sig_set_optionsOffset_ = 0;
		_sig_set_reporter_priorityOffset_ = 0;
		_sig_set_single_async_signal_handlerOffset_ = 0;
		_sig_shutdownOffset_ = 0;
		_sig_startupOffset_ = 0;
		_sl_close_shared_libraryOffset_ = 0;
		_sl_lookup_nameOffset_ = 0;
		_sl_open_shared_libraryOffset_ = 0;
		_sl_shutdownOffset_ = 0;
		_sl_startupOffset_ = 0;
		_sock_acceptOffset_ = 0;
		_sock_addrinfo_addressOffset_ = 0;
		_sock_addrinfo_familyOffset_ = 0;
		_sock_addrinfo_lengthOffset_ = 0;
		_sock_addrinfo_protocolOffset_ = 0;
		_sock_addrinfo_socktypeOffset_ = 0;
		_sock_bindOffset_ = 0;
		_sock_closeOffset_ = 0;
		_sock_connectOffset_ = 0;
		_sock_fcntlOffset_ = 0;
		_sock_fdset_clrOffset_ = 0;
		_sock_fdset_issetOffset_ = 0;
		_sock_fdset_setOffset_ = 0;
		_sock_fdset_zeroOffset_ = 0;
		_sock_freeaddrinfoOffset_ = 0;
		_sock_get_pollfd_infoOffset_ = 0;
		_sock_getaddrinfoOffset_ = 0;
		_sock_getaddrinfo_create_hintsOffset_ = 0;
		_sock_getsockopt_intOffset_ = 0;
		_sock_getsockopt_lingerOffset_ = 0;
		_sock_getsockopt_timevalOffset_ = 0;
		_sock_htonlOffset_ = 0;
		_sock_htonsOffset_ = 0;
		_sock_inet_ptonOffset_ = 0;
		_sock_linger_initOffset_ = 0;
		_sock_listenOffset_ = 0;
		_sock_pollOffset_ = 0;
		_sock_pollfd_initOffset_ = 0;
		_sock_recvOffset_ = 0;
		_sock_recvfromOffset_ = 0;
		_sock_selectOffset_ = 0;
		_sock_sendOffset_ = 0;
		_sock_sendtoOffset_ = 0;
		_sock_setsockopt_intOffset_ = 0;
		_sock_setsockopt_lingerOffset_ = 0;
		_sock_setsockopt_timevalOffset_ = 0;
		_sock_shutdownOffset_ = 0;
		_sock_sockaddr_initOffset_ = 0;
		_sock_sockaddr_init6Offset_ = 0;
		_sock_socketOffset_ = 0;
		_sock_socket_getfdOffset_ = 0;
		_sock_startupOffset_ = 0;
		_sock_timeval_initOffset_ = 0;
		_str_convertOffset_ = 0;
		_str_create_tokensOffset_ = 0;
		_str_free_tokensOffset_ = 0;
		_str_ftimeOffset_ = 0;
		_str_printfOffset_ = 0;
		_str_set_time_tokensOffset_ = 0;
		_str_set_tokenOffset_ = 0;
		_str_shutdownOffset_ = 0;
		_str_startupOffset_ = 0;
		_str_subst_tokensOffset_ = 0;
		_str_vprintfOffset_ = 0;
		_sysinfo_cgroup_are_subsystems_availableOffset_ = 0;
		_sysinfo_cgroup_are_subsystems_enabledOffset_ = 0;
		_sysinfo_cgroup_enable_subsystemsOffset_ = 0;
		_sysinfo_cgroup_get_available_subsystemsOffset_ = 0;
		_sysinfo_cgroup_get_enabled_subsystemsOffset_ = 0;
		_sysinfo_cgroup_get_memlimitOffset_ = 0;
		_sysinfo_cgroup_is_memlimit_setOffset_ = 0;
		_sysinfo_cgroup_is_system_availableOffset_ = 0;
		_sysinfo_cgroup_subsystem_iterator_destroyOffset_ = 0;
		_sysinfo_cgroup_subsystem_iterator_hasNextOffset_ = 0;
		_sysinfo_cgroup_subsystem_iterator_initOffset_ = 0;
		_sysinfo_cgroup_subsystem_iterator_metricKeyOffset_ = 0;
		_sysinfo_cgroup_subsystem_iterator_nextOffset_ = 0;
		_sysinfo_destroy_processor_infoOffset_ = 0;
		_sysinfo_env_iterator_hasNextOffset_ = 0;
		_sysinfo_env_iterator_initOffset_ = 0;
		_sysinfo_env_iterator_nextOffset_ = 0;
		_sysinfo_get_CPU_architectureOffset_ = 0;
		_sysinfo_get_CPU_loadOffset_ = 0;
		_sysinfo_get_CPU_utilizationOffset_ = 0;
		_sysinfo_get_OS_typeOffset_ = 0;
		_sysinfo_get_OS_versionOffset_ = 0;
		_sysinfo_get_addressable_physical_memoryOffset_ = 0;
		_sysinfo_get_cgroup_subsystem_listOffset_ = 0;
		_sysinfo_get_cwdOffset_ = 0;
		_sysinfo_get_egidOffset_ = 0;
		_sysinfo_get_envOffset_ = 0;
		_sysinfo_get_euidOffset_ = 0;
		_sysinfo_get_executable_nameOffset_ = 0;
		_sysinfo_get_groupnameOffset_ = 0;
		_sysinfo_get_groupsOffset_ = 0;
		_sysinfo_get_hostnameOffset_ = 0;
		_sysinfo_get_limitOffset_ = 0;
		_sysinfo_get_load_averageOffset_ = 0;
		_sysinfo_get_memory_infoOffset_ = 0;
		_sysinfo_get_number_CPUs_by_typeOffset_ = 0;
		_sysinfo_get_open_file_countOffset_ = 0;
		_sysinfo_get_os_descriptionOffset_ = 0;
		_sysinfo_get_physical_memoryOffset_ = 0;
		_sysinfo_get_pidOffset_ = 0;
		_sysinfo_get_ppidOffset_ = 0;
		_sysinfo_get_processor_descriptionOffset_ = 0;
		_sysinfo_get_processor_feature_nameOffset_ = 0;
		_sysinfo_get_processor_feature_stringOffset_ = 0;
		_sysinfo_get_processor_infoOffset_ = 0;
		_sysinfo_get_tmpOffset_ = 0;
		_sysinfo_get_usernameOffset_ = 0;
		_sysinfo_is_running_in_containerOffset_ = 0;
		_sysinfo_limit_iterator_hasNextOffset_ = 0;
		_sysinfo_limit_iterator_initOffset_ = 0;
		_sysinfo_limit_iterator_nextOffset_ = 0;
		_sysinfo_os_has_featureOffset_ = 0;
		_sysinfo_os_kernel_infoOffset_ = 0;
		_sysinfo_process_existsOffset_ = 0;
		_sysinfo_processor_has_featureOffset_ = 0;
		_sysinfo_processor_set_featureOffset_ = 0;
		_sysinfo_set_limitOffset_ = 0;
		_sysinfo_set_number_user_specified_CPUsOffset_ = 0;
		_sysinfo_shutdownOffset_ = 0;
		_sysinfo_startupOffset_ = 0;
		_syslog_queryOffset_ = 0;
		_syslog_setOffset_ = 0;
		_syslog_writeOffset_ = 0;
		_time_current_time_millisOffset_ = 0;
		_time_current_time_nanosOffset_ = 0;
		_time_hires_clockOffset_ = 0;
		_time_hires_deltaOffset_ = 0;
		_time_hires_frequencyOffset_ = 0;
		_time_msec_clockOffset_ = 0;
		_time_nano_timeOffset_ = 0;
		_time_shutdownOffset_ = 0;
		_time_startupOffset_ = 0;
		_time_usec_clockOffset_ = 0;
		_tty_availableOffset_ = 0;
		_tty_daemonizeOffset_ = 0;
		_tty_err_printfOffset_ = 0;
		_tty_err_vprintfOffset_ = 0;
		_tty_get_charsOffset_ = 0;
		_tty_printfOffset_ = 0;
		_tty_shutdownOffset_ = 0;
		_tty_startupOffset_ = 0;
		_tty_vprintfOffset_ = 0;
		_vmem_commit_memoryOffset_ = 0;
		_vmem_create_double_mapped_regionOffset_ = 0;
		_vmem_decommit_memoryOffset_ = 0;
		_vmem_default_large_page_size_exOffset_ = 0;
		_vmem_find_valid_page_sizeOffset_ = 0;
		_vmem_free_memoryOffset_ = 0;
		_vmem_get_available_physical_memoryOffset_ = 0;
		_vmem_get_contiguous_region_memoryOffset_ = 0;
		_vmem_get_page_flagsOffset_ = 0;
		_vmem_get_page_sizeOffset_ = 0;
		_vmem_get_process_memory_sizeOffset_ = 0;
		_vmem_numa_get_node_detailsOffset_ = 0;
		_vmem_numa_set_affinityOffset_ = 0;
		_vmem_release_double_mapped_regionOffset_ = 0;
		_vmem_reserve_memoryOffset_ = 0;
		_vmem_reserve_memory_exOffset_ = 0;
		_vmem_shutdownOffset_ = 0;
		_vmem_startupOffset_ = 0;
		_vmem_supported_page_flagsOffset_ = 0;
		_vmem_supported_page_sizesOffset_ = 0;
		_vmem_vmem_params_initOffset_ = 0;
	}

}
