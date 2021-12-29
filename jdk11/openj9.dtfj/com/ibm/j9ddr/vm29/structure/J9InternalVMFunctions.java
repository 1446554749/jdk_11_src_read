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
 * Structure: J9InternalVMFunctions
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
public final class J9InternalVMFunctions {

	// VM Constants

	public static final long SIZEOF;

	// Offsets

	public static final int _AttachCurrentThreadOffset_;
	public static final int _AttachCurrentThreadAsDaemonOffset_;
	public static final int _DestroyJavaVMOffset_;
	public static final int _DetachCurrentThreadOffset_;
	public static final int _GetEnvOffset_;
	public static final int _J9CancelAsyncEventOffset_;
	public static final int _J9RegisterAsyncEventOffset_;
	public static final int _J9SignalAsyncEventOffset_;
	public static final int _J9SignalAsyncEventWithoutInterruptOffset_;
	public static final int _J9UnregisterAsyncEventOffset_;
	public static final int _acquireExclusiveVMAccessOffset_;
	public static final int _acquireExclusiveVMAccessFromExternalThreadOffset_;
	public static final int _acquireSafePointVMAccessOffset_;
	public static final int _addHiddenInstanceFieldOffset_;
	public static final int _addStatisticOffset_;
	public static final int _addSystemPropertyOffset_;
	public static final int _addToBootstrapClassLoaderSearchOffset_;
	public static final int _addToSystemClassLoaderSearchOffset_;
	public static final int _allClassLoadersEndDoOffset_;
	public static final int _allClassLoadersNextDoOffset_;
	public static final int _allClassLoadersStartDoOffset_;
	public static final int _allClassesEndDoOffset_;
	public static final int _allClassesNextDoOffset_;
	public static final int _allClassesStartDoOffset_;
	public static final int _allLiveClassesEndDoOffset_;
	public static final int _allLiveClassesNextDoOffset_;
	public static final int _allLiveClassesStartDoOffset_;
	public static final int _allocateClassLoaderOffset_;
	public static final int _allocateClassMemorySegmentOffset_;
	public static final int _allocateMemorySegmentOffset_;
	public static final int _allocateMemorySegmentInListOffset_;
	public static final int _allocateMemorySegmentListOffset_;
	public static final int _allocateMemorySegmentListEntryOffset_;
	public static final int _allocateMemorySegmentListWithFlagsOffset_;
	public static final int _allocateMemorySegmentListWithSizeOffset_;
	public static final int _allocateVMThreadOffset_;
	public static final int _allocateVirtualMemorySegmentInListOffset_;
	public static final int _annotationElementIteratorNextOffset_;
	public static final int _annotationElementIteratorStartOffset_;
	public static final int _areValueBasedMonitorChecksEnabledOffset_;
	public static final int _areValueTypesEnabledOffset_;
	public static final int _arrayElementSizeOffset_;
	public static final int _atomicAndIntoConstantPoolOffset_;
	public static final int _atomicOrIntoConstantPoolOffset_;
	public static final int _attachSystemDaemonThreadOffset_;
	public static final int _attachThreadWithCategoryOffset_;
	public static final int _buildMethodTypeFrameOffset_;
	public static final int _buildNativeFunctionNamesOffset_;
	public static final int _cacheObjectMonitorForLookupOffset_;
	public static final int _catUtfToString4Offset_;
	public static final int _checkRomClassForErrorOffset_;
	public static final int _checkVisibilityOffset_;
	public static final int _cleanUpClassLoaderOffset_;
	public static final int _cleanupVMThreadJniArrayCacheOffset_;
	public static final int _clearHaltFlagOffset_;
	public static final int _cloneValueTypeOffset_;
	public static final int _compareStringToUTF8Offset_;
	public static final int _compareStringsOffset_;
	public static final int _computeHashForUTF8Offset_;
	public static final int _copyStringToJ9UTF8WithMemAllocOffset_;
	public static final int _copyStringToUTF8HelperOffset_;
	public static final int _copyStringToUTF8WithMemAllocOffset_;
	public static final int _createCachedOutOfMemoryErrorOffset_;
	public static final int _createJoinableThreadWithCategoryOffset_;
	public static final int _createThreadWithCategoryOffset_;
	public static final int _currentVMThreadOffset_;
	public static final int _deallocateVMThreadOffset_;
	public static final int _defaultValueWithUnflattenedFlattenablesOffset_;
	public static final int _dumpStackTraceOffset_;
	public static final int _elementArrayIteratorNextOffset_;
	public static final int _elementArrayIteratorStartOffset_;
	public static final int _ensureJNIIDTableOffset_;
	public static final int _exceptionHandlerSearchOffset_;
	public static final int _exitJavaThreadOffset_;
	public static final int _exitJavaVMOffset_;
	public static final int _fatalRecursiveStackOverflowOffset_;
	public static final int _fieldIndexTableRemoveOffset_;
	public static final int _fieldOffsetsNextDoOffset_;
	public static final int _fieldOffsetsStartDoOffset_;
	public static final int _fillInDgRasInterfaceOffset_;
	public static final int _fillJITVTableSlotOffset_;
	public static final int _findArgInVMArgsOffset_;
	public static final int _findClassLocationForClassOffset_;
	public static final int _findDllLoadInfoOffset_;
	public static final int _findFieldSignatureClassOffset_;
	public static final int _findJNIMethodOffset_;
	public static final int _findModuleForPackageOffset_;
	public static final int _findModuleForPackageUTF8Offset_;
	public static final int _findModuleInfoForModuleOffset_;
	public static final int _findObjectDeadlockedThreadsOffset_;
	public static final int _findROMClassFromPCOffset_;
	public static final int _flushProcessWriteBuffersOffset_;
	public static final int _freeClassLoaderOffset_;
	public static final int _freeJ9ModuleOffset_;
	public static final int _freeMemorySegmentOffset_;
	public static final int _freeMemorySegmentListOffset_;
	public static final int _freeMemorySegmentListEntryOffset_;
	public static final int _freeStackWalkCachesOffset_;
	public static final int _freeStacksOffset_;
	public static final int _fullTraversalFieldOffsetsNextDoOffset_;
	public static final int _fullTraversalFieldOffsetsStartDoOffset_;
	public static final int _genericStackDumpIteratorOffset_;
	public static final int _getAllAnnotationsFromAnnotationInfoOffset_;
	public static final int _getAnnotationDefaultsForAnnotationOffset_;
	public static final int _getAnnotationDefaultsForNamedAnnotationOffset_;
	public static final int _getAnnotationFromAnnotationInfoOffset_;
	public static final int _getAnnotationInfoFromClassOffset_;
	public static final int _getAnnotationsFromAnnotationInfoOffset_;
	public static final int _getFlattenableFieldOffset_;
	public static final int _getFlattenableFieldOffsetOffset_;
	public static final int _getFlattenableFieldSizeOffset_;
	public static final int _getFlattenableFieldTypeOffset_;
	public static final int _getJ9VMVersionStringOffset_;
	public static final int _getJITHookInterfaceOffset_;
	public static final int _getJNIFieldIDOffset_;
	public static final int _getJNIMethodIDOffset_;
	public static final int _getJavaThreadPriorityOffset_;
	public static final int _getJimModulesOffset_;
	public static final int _getMonitorForWaitOffset_;
	public static final int _getNPEMessageOffset_;
	public static final int _getNamedElementFromAnnotationOffset_;
	public static final int _getOwnedObjectMonitorsOffset_;
	public static final int _getStatisticOffset_;
	public static final int _getStringUTF8LengthOffset_;
	public static final int _getSystemPropertyOffset_;
	public static final int _getVMHookInterfaceOffset_;
	public static final int _getVMMinIdleWaitTimeOffset_;
	public static final int _getVMRuntimeStateOffset_;
	public static final int _getVTableOffsetForMethodOffset_;
	public static final int _growJavaStackOffset_;
	public static final int _haltThreadForInspectionOffset_;
	public static final int _hashClassLocationTableNewOffset_;
	public static final int _hashClassTableAtOffset_;
	public static final int _hashClassTableAtPutOffset_;
	public static final int _hashClassTableDeleteOffset_;
	public static final int _hashClassTableNextDoOffset_;
	public static final int _hashClassTableReplaceOffset_;
	public static final int _hashClassTableStartDoOffset_;
	public static final int _hashModuleExtraInfoTableNewOffset_;
	public static final int _hashModuleNameTableNewOffset_;
	public static final int _hashModulePointerTableNewOffset_;
	public static final int _hashPackageTableNewOffset_;
	public static final int _hashPkgTableAtOffset_;
	public static final int _hashPkgTableNextDoOffset_;
	public static final int _hashPkgTableStartDoOffset_;
	public static final int _helperMultiANewArrayOffset_;
	public static final int _illegalAccessMessageOffset_;
	public static final int _initJVMRIOffset_;
	public static final int _initializeAttachedThreadOffset_;
	public static final int _initializeClassOffset_;
	public static final int _initializeClassPathOffset_;
	public static final int _initializeClassPathEntryOffset_;
	public static final int _initializeHeapOOMMessageOffset_;
	public static final int _initializeMethodIDOffset_;
	public static final int _initializeMethodRunAddressOffset_;
	public static final int _initializeMethodRunAddressNoHookOffset_;
	public static final int _initializeNativeLibraryOffset_;
	public static final int _instanceFieldOffsetOffset_;
	public static final int _instanceOfOrCheckCastOffset_;
	public static final int _internalAcquireVMAccessOffset_;
	public static final int _internalAcquireVMAccessClearStatusOffset_;
	public static final int _internalAcquireVMAccessNoMutexOffset_;
	public static final int _internalAcquireVMAccessNoMutexWithMaskOffset_;
	public static final int _internalAcquireVMAccessWithMaskOffset_;
	public static final int _internalAllocateClassLoaderOffset_;
	public static final int _internalAttachCurrentThreadOffset_;
	public static final int _internalCreateArrayClassOffset_;
	public static final int _internalCreateBaseTypePrimitiveAndArrayClassesOffset_;
	public static final int _internalCreateRAMClassFromROMClassOffset_;
	public static final int _internalEnterVMFromJNIOffset_;
	public static final int _internalExceptionDescribeOffset_;
	public static final int _internalExitVMToJNIOffset_;
	public static final int _internalFindClassInModuleOffset_;
	public static final int _internalFindClassStringOffset_;
	public static final int _internalFindClassUTF8Offset_;
	public static final int _internalFindKnownClassOffset_;
	public static final int _internalReleaseVMAccessOffset_;
	public static final int _internalReleaseVMAccessNoMutexOffset_;
	public static final int _internalReleaseVMAccessSetStatusOffset_;
	public static final int _internalRunPreInitInstructionsOffset_;
	public static final int _internalSendExceptionConstructorOffset_;
	public static final int _internalTryAcquireVMAccessOffset_;
	public static final int _internalTryAcquireVMAccessWithMaskOffset_;
	public static final int _invalidJITReturnAddressOffset_;
	public static final int _isAnyClassLoadedFromPackageOffset_;
	public static final int _isClassRefQtypeOffset_;
	public static final int _isExceptionTypeCaughtByHandlerOffset_;
	public static final int _isFlattenableFieldFlattenedOffset_;
	public static final int _isNameOrSignatureQtypeOffset_;
	public static final int _iterateStackTraceOffset_;
	public static final int _j9jni_createGlobalRefOffset_;
	public static final int _j9jni_createLocalRefOffset_;
	public static final int _j9jni_deleteGlobalRefOffset_;
	public static final int _j9jni_deleteLocalRefOffset_;
	public static final int _j9localmap_LocalBitsForPCOffset_;
	public static final int _j9stackmap_StackBitsForPCOffset_;
	public static final int _javaCheckAsyncMessagesOffset_;
	public static final int _javaLookupMethodOffset_;
	public static final int _javaLookupMethodImplOffset_;
	public static final int _javaThreadProcOffset_;
	public static final int _jitFillOSRBufferOffset_;
	public static final int _jniArrayAllocateMemoryFromThreadOffset_;
	public static final int _jniArrayFreeMemoryFromThreadOffset_;
	public static final int _jniIsInternalClassRefOffset_;
	public static final int _jniNativeMethodPropertiesOffset_;
	public static final int _jniPopFrameOffset_;
	public static final int _jniResetStackReferencesOffset_;
	public static final int _jniVersionIsValidOffset_;
	public static final int _jvmPhaseChangeOffset_;
	public static final int _loadAndVerifyNestHostOffset_;
	public static final int _loadFlattenableArrayElementOffset_;
	public static final int _loadJ9DLLOffset_;
	public static final int _monitorTableAtOffset_;
	public static final int _monitorWaitImplOffset_;
	public static final int _mustHaveVMAccessOffset_;
	public static final int _objectIsBeingWaitedOnOffset_;
	public static final int _objectMonitorDestroyOffset_;
	public static final int _objectMonitorDestroyCompleteOffset_;
	public static final int _objectMonitorEnterOffset_;
	public static final int _objectMonitorEnterBlockingOffset_;
	public static final int _objectMonitorEnterNonBlockingOffset_;
	public static final int _objectMonitorExitOffset_;
	public static final int _objectMonitorInflateOffset_;
	public static final int _optionValueOperationsOffset_;
	public static final int _peekClassHashTableOffset_;
	public static final int _postInitLoadJ9DLLOffset_;
	public static final int _prepareClassOffset_;
	public static final int _prepareForExceptionThrowOffset_;
	public static final int _printThreadInfoOffset_;
	public static final int _putFlattenableFieldOffset_;
	public static final int _queryLogOptionsOffset_;
	public static final int _rasSetServiceLevelOffset_;
	public static final int _rasStartDeferredThreadsOffset_;
	public static final int _registerBootstrapLibraryOffset_;
	public static final int _registerNativeLibraryOffset_;
	public static final int _registerOSHandlerOffset_;
	public static final int _registerPredefinedHandlerOffset_;
	public static final int _releaseExclusiveVMAccessOffset_;
	public static final int _releaseExclusiveVMAccessFromExternalThreadOffset_;
	public static final int _releaseExclusiveVMAccessMetronomeOffset_;
	public static final int _releaseSafePointVMAccessOffset_;
	public static final int _reportHotFieldOffset_;
	public static final int _requestExclusiveVMAccessMetronomeOffset_;
	public static final int _requestExclusiveVMAccessMetronomeTempOffset_;
	public static final int _reserved0Offset_;
	public static final int _reserved1Offset_;
	public static final int _reserved2Offset_;
	public static final int _resolveClassRefOffset_;
	public static final int _resolveConstantDynamicOffset_;
	public static final int _resolveInstanceFieldRefOffset_;
	public static final int _resolveInstanceFieldRefIntoOffset_;
	public static final int _resolveInterfaceMethodRefOffset_;
	public static final int _resolveInterfaceMethodRefIntoOffset_;
	public static final int _resolveInvokeDynamicOffset_;
	public static final int _resolveKnownClassOffset_;
	public static final int _resolveMethodHandleRefOffset_;
	public static final int _resolveMethodTypeRefOffset_;
	public static final int _resolveNativeAddressOffset_;
	public static final int _resolveOpenJDKInvokeHandleOffset_;
	public static final int _resolveSpecialMethodRefOffset_;
	public static final int _resolveSpecialMethodRefIntoOffset_;
	public static final int _resolveSpecialSplitMethodRefOffset_;
	public static final int _resolveStaticFieldRefOffset_;
	public static final int _resolveStaticFieldRefIntoOffset_;
	public static final int _resolveStaticMethodRefOffset_;
	public static final int _resolveStaticMethodRefIntoOffset_;
	public static final int _resolveStaticSplitMethodRefOffset_;
	public static final int _resolveStringRefOffset_;
	public static final int _resolveVirtualMethodRefOffset_;
	public static final int _resolveVirtualMethodRefIntoOffset_;
	public static final int _resumeThreadForInspectionOffset_;
	public static final int _returnFromJNIOffset_;
	public static final int _romClassLoadFromCookieOffset_;
	public static final int _romImageNewSegmentOffset_;
	public static final int _runCallInMethodOffset_;
	public static final int _runJVMOnLoadOffset_;
	public static final int _searchClassForMethodOffset_;
	public static final int _sendClinitOffset_;
	public static final int _sendCompleteInitializationOffset_;
	public static final int _sendForGenericInvokeOffset_;
	public static final int _sendFromMethodDescriptorStringOffset_;
	public static final int _sendInitOffset_;
	public static final int _sendResolveConstantDynamicOffset_;
	public static final int _sendResolveInvokeDynamicOffset_;
	public static final int _sendResolveMethodHandleOffset_;
	public static final int _sendResolveOpenJDKInvokeHandleOffset_;
	public static final int _setBootLoaderModulePatchPathsOffset_;
	public static final int _setClassCastExceptionOffset_;
	public static final int _setCurrentExceptionOffset_;
	public static final int _setCurrentExceptionNLSOffset_;
	public static final int _setCurrentExceptionNLSWithArgsOffset_;
	public static final int _setCurrentExceptionUTFOffset_;
	public static final int _setCurrentExceptionWithCauseOffset_;
	public static final int _setExceptionForErroredRomClassOffset_;
	public static final int _setHaltFlagOffset_;
	public static final int _setHeapOutOfMemoryErrorOffset_;
	public static final int _setIllegalAccessErrorNonPublicInvokeInterfaceOffset_;
	public static final int _setIllegalAccessErrorReceiverNotSameOrSubtypeOfCurrentClassOffset_;
	public static final int _setLogOptionsOffset_;
	public static final int _setNativeOutOfMemoryErrorOffset_;
	public static final int _setNestmatesErrorOffset_;
	public static final int _setSystemPropertyOffset_;
	public static final int _setThreadForkOutOfMemoryErrorOffset_;
	public static final int _setVMThreadNameFromStringOffset_;
	public static final int _shutdownJVMRIOffset_;
	public static final int _sidecarInvokeReflectConstructorOffset_;
	public static final int _sidecarInvokeReflectMethodOffset_;
	public static final int _startJavaThreadOffset_;
	public static final int _staticFieldAddressOffset_;
	public static final int _storeFlattenableArrayElementOffset_;
	public static final int _structuredSignalHandlerOffset_;
	public static final int _structuredSignalHandlerVMOffset_;
	public static final int _threadAboutToStartOffset_;
	public static final int _threadCleanupOffset_;
	public static final int _threadParkImplOffset_;
	public static final int _threadSleepImplOffset_;
	public static final int _threadUnparkImplOffset_;
	public static final int _throwNativeOOMErrorOffset_;
	public static final int _throwNewJavaIoIOExceptionOffset_;
	public static final int _updateVMRuntimeStateOffset_;
	public static final int _valueTypeCapableAcmpOffset_;
	public static final int _verifyQualifiedNameOffset_;
	public static final int _waitForExclusiveVMAccessMetronomeOffset_;
	public static final int _waitForExclusiveVMAccessMetronomeTempOffset_;
	public static final int _walkBytecodeFrameSlotsOffset_;
	public static final int _walkStackForExceptionThrowOffset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		_AttachCurrentThreadOffset_ = 0;
		_AttachCurrentThreadAsDaemonOffset_ = 0;
		_DestroyJavaVMOffset_ = 0;
		_DetachCurrentThreadOffset_ = 0;
		_GetEnvOffset_ = 0;
		_J9CancelAsyncEventOffset_ = 0;
		_J9RegisterAsyncEventOffset_ = 0;
		_J9SignalAsyncEventOffset_ = 0;
		_J9SignalAsyncEventWithoutInterruptOffset_ = 0;
		_J9UnregisterAsyncEventOffset_ = 0;
		_acquireExclusiveVMAccessOffset_ = 0;
		_acquireExclusiveVMAccessFromExternalThreadOffset_ = 0;
		_acquireSafePointVMAccessOffset_ = 0;
		_addHiddenInstanceFieldOffset_ = 0;
		_addStatisticOffset_ = 0;
		_addSystemPropertyOffset_ = 0;
		_addToBootstrapClassLoaderSearchOffset_ = 0;
		_addToSystemClassLoaderSearchOffset_ = 0;
		_allClassLoadersEndDoOffset_ = 0;
		_allClassLoadersNextDoOffset_ = 0;
		_allClassLoadersStartDoOffset_ = 0;
		_allClassesEndDoOffset_ = 0;
		_allClassesNextDoOffset_ = 0;
		_allClassesStartDoOffset_ = 0;
		_allLiveClassesEndDoOffset_ = 0;
		_allLiveClassesNextDoOffset_ = 0;
		_allLiveClassesStartDoOffset_ = 0;
		_allocateClassLoaderOffset_ = 0;
		_allocateClassMemorySegmentOffset_ = 0;
		_allocateMemorySegmentOffset_ = 0;
		_allocateMemorySegmentInListOffset_ = 0;
		_allocateMemorySegmentListOffset_ = 0;
		_allocateMemorySegmentListEntryOffset_ = 0;
		_allocateMemorySegmentListWithFlagsOffset_ = 0;
		_allocateMemorySegmentListWithSizeOffset_ = 0;
		_allocateVMThreadOffset_ = 0;
		_allocateVirtualMemorySegmentInListOffset_ = 0;
		_annotationElementIteratorNextOffset_ = 0;
		_annotationElementIteratorStartOffset_ = 0;
		_areValueBasedMonitorChecksEnabledOffset_ = 0;
		_areValueTypesEnabledOffset_ = 0;
		_arrayElementSizeOffset_ = 0;
		_atomicAndIntoConstantPoolOffset_ = 0;
		_atomicOrIntoConstantPoolOffset_ = 0;
		_attachSystemDaemonThreadOffset_ = 0;
		_attachThreadWithCategoryOffset_ = 0;
		_buildMethodTypeFrameOffset_ = 0;
		_buildNativeFunctionNamesOffset_ = 0;
		_cacheObjectMonitorForLookupOffset_ = 0;
		_catUtfToString4Offset_ = 0;
		_checkRomClassForErrorOffset_ = 0;
		_checkVisibilityOffset_ = 0;
		_cleanUpClassLoaderOffset_ = 0;
		_cleanupVMThreadJniArrayCacheOffset_ = 0;
		_clearHaltFlagOffset_ = 0;
		_cloneValueTypeOffset_ = 0;
		_compareStringToUTF8Offset_ = 0;
		_compareStringsOffset_ = 0;
		_computeHashForUTF8Offset_ = 0;
		_copyStringToJ9UTF8WithMemAllocOffset_ = 0;
		_copyStringToUTF8HelperOffset_ = 0;
		_copyStringToUTF8WithMemAllocOffset_ = 0;
		_createCachedOutOfMemoryErrorOffset_ = 0;
		_createJoinableThreadWithCategoryOffset_ = 0;
		_createThreadWithCategoryOffset_ = 0;
		_currentVMThreadOffset_ = 0;
		_deallocateVMThreadOffset_ = 0;
		_defaultValueWithUnflattenedFlattenablesOffset_ = 0;
		_dumpStackTraceOffset_ = 0;
		_elementArrayIteratorNextOffset_ = 0;
		_elementArrayIteratorStartOffset_ = 0;
		_ensureJNIIDTableOffset_ = 0;
		_exceptionHandlerSearchOffset_ = 0;
		_exitJavaThreadOffset_ = 0;
		_exitJavaVMOffset_ = 0;
		_fatalRecursiveStackOverflowOffset_ = 0;
		_fieldIndexTableRemoveOffset_ = 0;
		_fieldOffsetsNextDoOffset_ = 0;
		_fieldOffsetsStartDoOffset_ = 0;
		_fillInDgRasInterfaceOffset_ = 0;
		_fillJITVTableSlotOffset_ = 0;
		_findArgInVMArgsOffset_ = 0;
		_findClassLocationForClassOffset_ = 0;
		_findDllLoadInfoOffset_ = 0;
		_findFieldSignatureClassOffset_ = 0;
		_findJNIMethodOffset_ = 0;
		_findModuleForPackageOffset_ = 0;
		_findModuleForPackageUTF8Offset_ = 0;
		_findModuleInfoForModuleOffset_ = 0;
		_findObjectDeadlockedThreadsOffset_ = 0;
		_findROMClassFromPCOffset_ = 0;
		_flushProcessWriteBuffersOffset_ = 0;
		_freeClassLoaderOffset_ = 0;
		_freeJ9ModuleOffset_ = 0;
		_freeMemorySegmentOffset_ = 0;
		_freeMemorySegmentListOffset_ = 0;
		_freeMemorySegmentListEntryOffset_ = 0;
		_freeStackWalkCachesOffset_ = 0;
		_freeStacksOffset_ = 0;
		_fullTraversalFieldOffsetsNextDoOffset_ = 0;
		_fullTraversalFieldOffsetsStartDoOffset_ = 0;
		_genericStackDumpIteratorOffset_ = 0;
		_getAllAnnotationsFromAnnotationInfoOffset_ = 0;
		_getAnnotationDefaultsForAnnotationOffset_ = 0;
		_getAnnotationDefaultsForNamedAnnotationOffset_ = 0;
		_getAnnotationFromAnnotationInfoOffset_ = 0;
		_getAnnotationInfoFromClassOffset_ = 0;
		_getAnnotationsFromAnnotationInfoOffset_ = 0;
		_getFlattenableFieldOffset_ = 0;
		_getFlattenableFieldOffsetOffset_ = 0;
		_getFlattenableFieldSizeOffset_ = 0;
		_getFlattenableFieldTypeOffset_ = 0;
		_getJ9VMVersionStringOffset_ = 0;
		_getJITHookInterfaceOffset_ = 0;
		_getJNIFieldIDOffset_ = 0;
		_getJNIMethodIDOffset_ = 0;
		_getJavaThreadPriorityOffset_ = 0;
		_getJimModulesOffset_ = 0;
		_getMonitorForWaitOffset_ = 0;
		_getNPEMessageOffset_ = 0;
		_getNamedElementFromAnnotationOffset_ = 0;
		_getOwnedObjectMonitorsOffset_ = 0;
		_getStatisticOffset_ = 0;
		_getStringUTF8LengthOffset_ = 0;
		_getSystemPropertyOffset_ = 0;
		_getVMHookInterfaceOffset_ = 0;
		_getVMMinIdleWaitTimeOffset_ = 0;
		_getVMRuntimeStateOffset_ = 0;
		_getVTableOffsetForMethodOffset_ = 0;
		_growJavaStackOffset_ = 0;
		_haltThreadForInspectionOffset_ = 0;
		_hashClassLocationTableNewOffset_ = 0;
		_hashClassTableAtOffset_ = 0;
		_hashClassTableAtPutOffset_ = 0;
		_hashClassTableDeleteOffset_ = 0;
		_hashClassTableNextDoOffset_ = 0;
		_hashClassTableReplaceOffset_ = 0;
		_hashClassTableStartDoOffset_ = 0;
		_hashModuleExtraInfoTableNewOffset_ = 0;
		_hashModuleNameTableNewOffset_ = 0;
		_hashModulePointerTableNewOffset_ = 0;
		_hashPackageTableNewOffset_ = 0;
		_hashPkgTableAtOffset_ = 0;
		_hashPkgTableNextDoOffset_ = 0;
		_hashPkgTableStartDoOffset_ = 0;
		_helperMultiANewArrayOffset_ = 0;
		_illegalAccessMessageOffset_ = 0;
		_initJVMRIOffset_ = 0;
		_initializeAttachedThreadOffset_ = 0;
		_initializeClassOffset_ = 0;
		_initializeClassPathOffset_ = 0;
		_initializeClassPathEntryOffset_ = 0;
		_initializeHeapOOMMessageOffset_ = 0;
		_initializeMethodIDOffset_ = 0;
		_initializeMethodRunAddressOffset_ = 0;
		_initializeMethodRunAddressNoHookOffset_ = 0;
		_initializeNativeLibraryOffset_ = 0;
		_instanceFieldOffsetOffset_ = 0;
		_instanceOfOrCheckCastOffset_ = 0;
		_internalAcquireVMAccessOffset_ = 0;
		_internalAcquireVMAccessClearStatusOffset_ = 0;
		_internalAcquireVMAccessNoMutexOffset_ = 0;
		_internalAcquireVMAccessNoMutexWithMaskOffset_ = 0;
		_internalAcquireVMAccessWithMaskOffset_ = 0;
		_internalAllocateClassLoaderOffset_ = 0;
		_internalAttachCurrentThreadOffset_ = 0;
		_internalCreateArrayClassOffset_ = 0;
		_internalCreateBaseTypePrimitiveAndArrayClassesOffset_ = 0;
		_internalCreateRAMClassFromROMClassOffset_ = 0;
		_internalEnterVMFromJNIOffset_ = 0;
		_internalExceptionDescribeOffset_ = 0;
		_internalExitVMToJNIOffset_ = 0;
		_internalFindClassInModuleOffset_ = 0;
		_internalFindClassStringOffset_ = 0;
		_internalFindClassUTF8Offset_ = 0;
		_internalFindKnownClassOffset_ = 0;
		_internalReleaseVMAccessOffset_ = 0;
		_internalReleaseVMAccessNoMutexOffset_ = 0;
		_internalReleaseVMAccessSetStatusOffset_ = 0;
		_internalRunPreInitInstructionsOffset_ = 0;
		_internalSendExceptionConstructorOffset_ = 0;
		_internalTryAcquireVMAccessOffset_ = 0;
		_internalTryAcquireVMAccessWithMaskOffset_ = 0;
		_invalidJITReturnAddressOffset_ = 0;
		_isAnyClassLoadedFromPackageOffset_ = 0;
		_isClassRefQtypeOffset_ = 0;
		_isExceptionTypeCaughtByHandlerOffset_ = 0;
		_isFlattenableFieldFlattenedOffset_ = 0;
		_isNameOrSignatureQtypeOffset_ = 0;
		_iterateStackTraceOffset_ = 0;
		_j9jni_createGlobalRefOffset_ = 0;
		_j9jni_createLocalRefOffset_ = 0;
		_j9jni_deleteGlobalRefOffset_ = 0;
		_j9jni_deleteLocalRefOffset_ = 0;
		_j9localmap_LocalBitsForPCOffset_ = 0;
		_j9stackmap_StackBitsForPCOffset_ = 0;
		_javaCheckAsyncMessagesOffset_ = 0;
		_javaLookupMethodOffset_ = 0;
		_javaLookupMethodImplOffset_ = 0;
		_javaThreadProcOffset_ = 0;
		_jitFillOSRBufferOffset_ = 0;
		_jniArrayAllocateMemoryFromThreadOffset_ = 0;
		_jniArrayFreeMemoryFromThreadOffset_ = 0;
		_jniIsInternalClassRefOffset_ = 0;
		_jniNativeMethodPropertiesOffset_ = 0;
		_jniPopFrameOffset_ = 0;
		_jniResetStackReferencesOffset_ = 0;
		_jniVersionIsValidOffset_ = 0;
		_jvmPhaseChangeOffset_ = 0;
		_loadAndVerifyNestHostOffset_ = 0;
		_loadFlattenableArrayElementOffset_ = 0;
		_loadJ9DLLOffset_ = 0;
		_monitorTableAtOffset_ = 0;
		_monitorWaitImplOffset_ = 0;
		_mustHaveVMAccessOffset_ = 0;
		_objectIsBeingWaitedOnOffset_ = 0;
		_objectMonitorDestroyOffset_ = 0;
		_objectMonitorDestroyCompleteOffset_ = 0;
		_objectMonitorEnterOffset_ = 0;
		_objectMonitorEnterBlockingOffset_ = 0;
		_objectMonitorEnterNonBlockingOffset_ = 0;
		_objectMonitorExitOffset_ = 0;
		_objectMonitorInflateOffset_ = 0;
		_optionValueOperationsOffset_ = 0;
		_peekClassHashTableOffset_ = 0;
		_postInitLoadJ9DLLOffset_ = 0;
		_prepareClassOffset_ = 0;
		_prepareForExceptionThrowOffset_ = 0;
		_printThreadInfoOffset_ = 0;
		_putFlattenableFieldOffset_ = 0;
		_queryLogOptionsOffset_ = 0;
		_rasSetServiceLevelOffset_ = 0;
		_rasStartDeferredThreadsOffset_ = 0;
		_registerBootstrapLibraryOffset_ = 0;
		_registerNativeLibraryOffset_ = 0;
		_registerOSHandlerOffset_ = 0;
		_registerPredefinedHandlerOffset_ = 0;
		_releaseExclusiveVMAccessOffset_ = 0;
		_releaseExclusiveVMAccessFromExternalThreadOffset_ = 0;
		_releaseExclusiveVMAccessMetronomeOffset_ = 0;
		_releaseSafePointVMAccessOffset_ = 0;
		_reportHotFieldOffset_ = 0;
		_requestExclusiveVMAccessMetronomeOffset_ = 0;
		_requestExclusiveVMAccessMetronomeTempOffset_ = 0;
		_reserved0Offset_ = 0;
		_reserved1Offset_ = 0;
		_reserved2Offset_ = 0;
		_resolveClassRefOffset_ = 0;
		_resolveConstantDynamicOffset_ = 0;
		_resolveInstanceFieldRefOffset_ = 0;
		_resolveInstanceFieldRefIntoOffset_ = 0;
		_resolveInterfaceMethodRefOffset_ = 0;
		_resolveInterfaceMethodRefIntoOffset_ = 0;
		_resolveInvokeDynamicOffset_ = 0;
		_resolveKnownClassOffset_ = 0;
		_resolveMethodHandleRefOffset_ = 0;
		_resolveMethodTypeRefOffset_ = 0;
		_resolveNativeAddressOffset_ = 0;
		_resolveOpenJDKInvokeHandleOffset_ = 0;
		_resolveSpecialMethodRefOffset_ = 0;
		_resolveSpecialMethodRefIntoOffset_ = 0;
		_resolveSpecialSplitMethodRefOffset_ = 0;
		_resolveStaticFieldRefOffset_ = 0;
		_resolveStaticFieldRefIntoOffset_ = 0;
		_resolveStaticMethodRefOffset_ = 0;
		_resolveStaticMethodRefIntoOffset_ = 0;
		_resolveStaticSplitMethodRefOffset_ = 0;
		_resolveStringRefOffset_ = 0;
		_resolveVirtualMethodRefOffset_ = 0;
		_resolveVirtualMethodRefIntoOffset_ = 0;
		_resumeThreadForInspectionOffset_ = 0;
		_returnFromJNIOffset_ = 0;
		_romClassLoadFromCookieOffset_ = 0;
		_romImageNewSegmentOffset_ = 0;
		_runCallInMethodOffset_ = 0;
		_runJVMOnLoadOffset_ = 0;
		_searchClassForMethodOffset_ = 0;
		_sendClinitOffset_ = 0;
		_sendCompleteInitializationOffset_ = 0;
		_sendForGenericInvokeOffset_ = 0;
		_sendFromMethodDescriptorStringOffset_ = 0;
		_sendInitOffset_ = 0;
		_sendResolveConstantDynamicOffset_ = 0;
		_sendResolveInvokeDynamicOffset_ = 0;
		_sendResolveMethodHandleOffset_ = 0;
		_sendResolveOpenJDKInvokeHandleOffset_ = 0;
		_setBootLoaderModulePatchPathsOffset_ = 0;
		_setClassCastExceptionOffset_ = 0;
		_setCurrentExceptionOffset_ = 0;
		_setCurrentExceptionNLSOffset_ = 0;
		_setCurrentExceptionNLSWithArgsOffset_ = 0;
		_setCurrentExceptionUTFOffset_ = 0;
		_setCurrentExceptionWithCauseOffset_ = 0;
		_setExceptionForErroredRomClassOffset_ = 0;
		_setHaltFlagOffset_ = 0;
		_setHeapOutOfMemoryErrorOffset_ = 0;
		_setIllegalAccessErrorNonPublicInvokeInterfaceOffset_ = 0;
		_setIllegalAccessErrorReceiverNotSameOrSubtypeOfCurrentClassOffset_ = 0;
		_setLogOptionsOffset_ = 0;
		_setNativeOutOfMemoryErrorOffset_ = 0;
		_setNestmatesErrorOffset_ = 0;
		_setSystemPropertyOffset_ = 0;
		_setThreadForkOutOfMemoryErrorOffset_ = 0;
		_setVMThreadNameFromStringOffset_ = 0;
		_shutdownJVMRIOffset_ = 0;
		_sidecarInvokeReflectConstructorOffset_ = 0;
		_sidecarInvokeReflectMethodOffset_ = 0;
		_startJavaThreadOffset_ = 0;
		_staticFieldAddressOffset_ = 0;
		_storeFlattenableArrayElementOffset_ = 0;
		_structuredSignalHandlerOffset_ = 0;
		_structuredSignalHandlerVMOffset_ = 0;
		_threadAboutToStartOffset_ = 0;
		_threadCleanupOffset_ = 0;
		_threadParkImplOffset_ = 0;
		_threadSleepImplOffset_ = 0;
		_threadUnparkImplOffset_ = 0;
		_throwNativeOOMErrorOffset_ = 0;
		_throwNewJavaIoIOExceptionOffset_ = 0;
		_updateVMRuntimeStateOffset_ = 0;
		_valueTypeCapableAcmpOffset_ = 0;
		_verifyQualifiedNameOffset_ = 0;
		_waitForExclusiveVMAccessMetronomeOffset_ = 0;
		_waitForExclusiveVMAccessMetronomeTempOffset_ = 0;
		_walkBytecodeFrameSlotsOffset_ = 0;
		_walkStackForExceptionThrowOffset_ = 0;
	}

}
