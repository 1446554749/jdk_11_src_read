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
 * Structure: J9JITConfig
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
public final class J9JITConfig {

	// VM Constants

	public static final long SIZEOF;
	public static final long J9JIT_AOT;
	public static final long J9JIT_AOT_ATTACHED;
	public static final long J9JIT_ASSUME_STRICTFP;
	public static final long J9JIT_ASSUME_STRICTFPCOMPARES;
	public static final long J9JIT_CG_BREAK_ON_ENTRY;
	public static final long J9JIT_CG_OPT_LEVEL_BEST_AVAILABLE;
	public static final long J9JIT_CG_OPT_LEVEL_HIGH;
	public static final long J9JIT_CG_OPT_LEVEL_LOW;
	public static final long J9JIT_CG_OPT_LEVEL_NONE;
	public static final long J9JIT_CG_REGISTER_MAPS;
	public static final long J9JIT_CODE_CACHE_FULL;
	public static final long J9JIT_COMPILE_CLINIT;
	public static final long J9JIT_DATA_CACHE_FULL;
	public static final long J9JIT_DEFER_JIT;
	public static final long J9JIT_GC_NOTIFY;
	public static final long J9JIT_GROW_CACHES;
	public static final long J9JIT_JIT_ATTACHED;
	public static final long J9JIT_JVMPI_DISABLE_DIRECT_INLINING_NATIVES;
	public static final long J9JIT_JVMPI_DISABLE_DIRECT_RECLAIM;
	public static final long J9JIT_JVMPI_DISABLE_DIRECT_TO_JNI;
	public static final long J9JIT_JVMPI_GEN_BUILTIN_ENTRY_EXIT;
	public static final long J9JIT_JVMPI_GEN_COMPILED_ENTRY_EXIT;
	public static final long J9JIT_JVMPI_GEN_INLINE_ENTRY_EXIT;
	public static final long J9JIT_JVMPI_GEN_NATIVE_ENTRY_EXIT;
	public static final long J9JIT_JVMPI_INLINE_ALLOCATION_OFF;
	public static final long J9JIT_JVMPI_INLINE_METHOD_OFF;
	public static final long J9JIT_JVMPI_JIT_DEFAULTS;
	public static final long J9JIT_PATCHING_FENCE_REQUIRED;
	public static final long J9JIT_PATCHING_FENCE_TYPE;
	public static final long J9JIT_QUICKSTART;
	public static final long J9JIT_REPORT_EVENTS;
	public static final long J9JIT_RUNTIME_RESOLVE;
	public static final long J9JIT_SCAVENGE_ON_RESOLVE;
	public static final long J9JIT_SCAVENGE_ON_RUNTIME;
	public static final long J9JIT_TESTMODE;
	public static final long J9JIT_TOSS_CODE;

	// Offsets

	public static final int _aotCompilationInfoOffset_;
	public static final int _aotrt_getRuntimeHelperOffset_;
	public static final int _aotrt_lookupSendTargetForThunkOffset_;
	public static final int _b_i2jTransitionOffset_;
	public static final int _bcSizeLimitOffset_;
	public static final int _breakMessageNumberOffset_;
	public static final int _breakpointedMethodsOffset_;
	public static final int _c_jitDecompileAfterAllocationOffset_;
	public static final int _c_jitDecompileAfterMonitorEnterOffset_;
	public static final int _c_jitDecompileAtCurrentPCOffset_;
	public static final int _c_jitDecompileAtExceptionCatchOffset_;
	public static final int _c_jitDecompileBeforeMethodMonitorEnterOffset_;
	public static final int _c_jitDecompileBeforeReportMethodEnterOffset_;
	public static final int _c_jitDecompileOnReturnOffset_;
	public static final int _c_jitReportExceptionCatchOffset_;
	public static final int _classLibAttributesOffset_;
	public static final int _codeCacheOffset_;
	public static final int _codeCacheAlignmentOffset_;
	public static final int _codeCacheColdAllocOffset_;
	public static final int _codeCacheFreeListOffset_;
	public static final int _codeCacheKBOffset_;
	public static final int _codeCacheListOffset_;
	public static final int _codeCachePadKBOffset_;
	public static final int _codeCacheTotalKBOffset_;
	public static final int _codeCacheTrampolinesOffset_;
	public static final int _codeCacheWarmAllocOffset_;
	public static final int _commandOffset_;
	public static final int _compilationInfoOffset_;
	public static final int _compilationMonitorOffset_;
	public static final int _compileClassOffset_;
	public static final int _compileClassesOffset_;
	public static final int _dataBreakpointCountOffset_;
	public static final int _dataCacheOffset_;
	public static final int _dataCacheKBOffset_;
	public static final int _dataCacheListOffset_;
	public static final int _dataCacheTotalKBOffset_;
	public static final int _disableJitOffset_;
	public static final int _doAESInHardwareOffset_;
	public static final int _doSha256InHardwareOffset_;
	public static final int _doSha512InHardwareOffset_;
	public static final int _enableJitOffset_;
	public static final int _entryPointOffset_;
	public static final int _entryPointForNewInstanceOffset_;
	public static final int _expandAESKeyInHardwareOffset_;
	public static final int _fast_jitANewArrayOffset_;
	public static final int _fast_jitANewArrayNoZeroInitOffset_;
	public static final int _fast_jitAcquireVMAccessOffset_;
	public static final int _fast_jitCheckCastOffset_;
	public static final int _fast_jitCheckCastForArrayStoreOffset_;
	public static final int _fast_jitMethodMonitorEntryOffset_;
	public static final int _fast_jitMethodMonitorExitOffset_;
	public static final int _fast_jitMonitorEntryOffset_;
	public static final int _fast_jitMonitorExitOffset_;
	public static final int _fast_jitNewArrayOffset_;
	public static final int _fast_jitNewArrayNoZeroInitOffset_;
	public static final int _fast_jitNewObjectOffset_;
	public static final int _fast_jitNewObjectNoZeroInitOffset_;
	public static final int _fast_jitNewValueOffset_;
	public static final int _fast_jitNewValueNoZeroInitOffset_;
	public static final int _fast_jitPostJNICallOffloadCheckOffset_;
	public static final int _fast_jitPreJNICallOffloadCheckOffset_;
	public static final int _fast_jitReleaseVMAccessOffset_;
	public static final int _fast_jitTypeCheckArrayStoreOffset_;
	public static final int _fast_jitTypeCheckArrayStoreWithNullCheckOffset_;
	public static final int _fsdEnabledOffset_;
	public static final int _gcCountOffset_;
	public static final int _gcOnResolveThresholdOffset_;
	public static final int _gcTraceThresholdOffset_;
	public static final int _getByteCodeIndexOffset_;
	public static final int _getByteCodeIndexFromStackMapOffset_;
	public static final int _getByteCodeIndexFromStackMapVerboseOffset_;
	public static final int _getByteCodeIndexVerboseOffset_;
	public static final int _getCryptoHardwareFeaturesOffset_;
	public static final int _getCurrentByteCodeIndexAndIsSameReceiverOffset_;
	public static final int _getCurrentByteCodeIndexAndIsSameReceiverVerboseOffset_;
	public static final int _getFirstInlinedCallSiteOffset_;
	public static final int _getFirstInlinedCallSiteVerboseOffset_;
	public static final int _getInlinedMethodOffset_;
	public static final int _getInlinedMethodVerboseOffset_;
	public static final int _getJitInlineDepthFromCallSiteOffset_;
	public static final int _getJitInlineDepthFromCallSiteVerboseOffset_;
	public static final int _getJitInlinedCallInfoOffset_;
	public static final int _getJitInlinedCallInfoVerboseOffset_;
	public static final int _getJitRegisterMapOffset_;
	public static final int _getJitRegisterMapVerboseOffset_;
	public static final int _getNextInlinedCallSiteOffset_;
	public static final int _getNextInlinedCallSiteVerboseOffset_;
	public static final int _getStackMapFromJitPCOffset_;
	public static final int _getStackMapFromJitPCVerboseOffset_;
	public static final int _globalSampleCountOffset_;
	public static final int _hasMoreInlinedMethodsOffset_;
	public static final int _hasMoreInlinedMethodsVerboseOffset_;
	public static final int _hookInterfaceOffset_;
	public static final int _i2jMHTransitionOffset_;
	public static final int _i2jReturnTableOffset_;
	public static final int _i2jTransitionOffset_;
	public static final int _inlineFieldWatchesOffset_;
	public static final int _inlineSizeLimitOffset_;
	public static final int _iprofilerBufferSizeOffset_;
	public static final int _isAESSupportedByHardwareOffset_;
	public static final int _isDLTReadyOffset_;
	public static final int _j2iInvokeWithArgumentsOffset_;
	public static final int _j9jit_printfOffset_;
	public static final int _javaVMOffset_;
	public static final int _jitAddDecompilationForFramePopOffset_;
	public static final int _jitCanResumeAtOSRPointOffset_;
	public static final int _jitCheckScavengeOnResolveOffset_;
	public static final int _jitClassesRedefinedOffset_;
	public static final int _jitCleanUpDecompilationStackOffset_;
	public static final int _jitCodeBreakpointAddedOffset_;
	public static final int _jitCodeBreakpointRemovedOffset_;
	public static final int _jitDataBreakpointAddedOffset_;
	public static final int _jitDataBreakpointRemovedOffset_;
	public static final int _jitDecompileMethodForFramePopOffset_;
	public static final int _jitDiscardPendingCompilationsOfNativesOffset_;
	public static final int _jitExceptionCaughtOffset_;
	public static final int _jitExclusiveVMShutdownPendingOffset_;
	public static final int _jitExitInterpreter0Offset_;
	public static final int _jitExitInterpreter1Offset_;
	public static final int _jitExitInterpreterDOffset_;
	public static final int _jitExitInterpreterFOffset_;
	public static final int _jitExitInterpreterJOffset_;
	public static final int _jitFillOSRBufferReturnOffset_;
	public static final int _jitFloatReturnUsageOffset_;
	public static final int _jitFlushCompilationQueueOffset_;
	public static final int _jitFramePopNotificationAddedOffset_;
	public static final int _jitGetExceptionCatcherOffset_;
	public static final int _jitGetExceptionTableFromPCOffset_;
	public static final int _jitGetExceptionTableFromPCVerboseOffset_;
	public static final int _jitGetInlinerMapFromPCOffset_;
	public static final int _jitGetInlinerMapFromPCVerboseOffset_;
	public static final int _jitGetStackMapFromPCOffset_;
	public static final int _jitGetStackMapFromPCVerboseOffset_;
	public static final int _jitHookAboutToRunMainOffset_;
	public static final int _jitHotswapOccurredOffset_;
	public static final int _jitIllegalFinalFieldModificationOffset_;
	public static final int _jitInstanceOfOffset_;
	public static final int _jitLevelNameOffset_;
	public static final int _jitLocalSlotAddressOffset_;
	public static final int _jitMethodBreakpointedOffset_;
	public static final int _jitMethodUnbreakpointedOffset_;
	public static final int _jitOSRGetPatchPointOffset_;
	public static final int _jitOSRPatchMethodOffset_;
	public static final int _jitOSRUnpatchMethodOffset_;
	public static final int _jitReportDynamicCodeLoadEventsOffset_;
	public static final int _jitReportDynamicCodeLoadEventsVerboseOffset_;
	public static final int _jitSendTargetTableOffset_;
	public static final int _jitSignalHandlerOffset_;
	public static final int _jitSingleStepAddedOffset_;
	public static final int _jitSingleStepRemovedOffset_;
	public static final int _jitStackLocalsModifiedOffset_;
	public static final int _jitStaticsOffset_;
	public static final int _jitThrowArrayStoreExceptionWithIPOffset_;
	public static final int _jitToInterpreterThunksOffset_;
	public static final int _jitWriteBarrierBatchStoreOffset_;
	public static final int _jitWriteBarrierBatchStoreWithRangeOffset_;
	public static final int _jitWriteBarrierStoreOffset_;
	public static final int _largeCodePageFlagsOffset_;
	public static final int _largeCodePageSizeOffset_;
	public static final int _lastExceptionTableAllocSizeOffset_;
	public static final int _lastGCDataAllocSizeOffset_;
	public static final int _launchGPUOffset_;
	public static final int _loadPreservedAndBranchOffset_;
	public static final int _logFileNameOffset_;
	public static final int _maxInlineDepthOffset_;
	public static final int _messageNumberOffset_;
	public static final int _messageThresholdOffset_;
	public static final int _methodsToDeleteOffset_;
	public static final int _mutexOffset_;
	public static final int _newInstanceImplMethodOffset_;
	public static final int _old_fast_jitANewArrayOffset_;
	public static final int _old_fast_jitANewArrayNoZeroInitOffset_;
	public static final int _old_fast_jitAcmpHelperOffset_;
	public static final int _old_fast_jitCheckCastOffset_;
	public static final int _old_fast_jitCheckCastForArrayStoreOffset_;
	public static final int _old_fast_jitCheckIfFinalizeObjectOffset_;
	public static final int _old_fast_jitCollapseJNIReferenceFrameOffset_;
	public static final int _old_fast_jitGetFlattenableFieldOffset_;
	public static final int _old_fast_jitGetFlattenableStaticFieldOffset_;
	public static final int _old_fast_jitInstanceOfOffset_;
	public static final int _old_fast_jitLoadFlattenableArrayElementOffset_;
	public static final int _old_fast_jitLookupInterfaceMethodOffset_;
	public static final int _old_fast_jitMethodIsNativeOffset_;
	public static final int _old_fast_jitMethodIsSyncOffset_;
	public static final int _old_fast_jitMethodMonitorEntryOffset_;
	public static final int _old_fast_jitMethodMonitorExitOffset_;
	public static final int _old_fast_jitMonitorEntryOffset_;
	public static final int _old_fast_jitMonitorExitOffset_;
	public static final int _old_fast_jitNewArrayOffset_;
	public static final int _old_fast_jitNewArrayNoZeroInitOffset_;
	public static final int _old_fast_jitNewObjectOffset_;
	public static final int _old_fast_jitNewObjectNoZeroInitOffset_;
	public static final int _old_fast_jitObjectHashCodeOffset_;
	public static final int _old_fast_jitPutFlattenableFieldOffset_;
	public static final int _old_fast_jitPutFlattenableStaticFieldOffset_;
	public static final int _old_fast_jitResolvedFieldIsVolatileOffset_;
	public static final int _old_fast_jitStoreFlattenableArrayElementOffset_;
	public static final int _old_fast_jitTypeCheckArrayStoreOffset_;
	public static final int _old_fast_jitTypeCheckArrayStoreWithNullCheckOffset_;
	public static final int _old_fast_jitVolatileReadDoubleOffset_;
	public static final int _old_fast_jitVolatileReadLongOffset_;
	public static final int _old_fast_jitVolatileWriteDoubleOffset_;
	public static final int _old_fast_jitVolatileWriteLongOffset_;
	public static final int _old_fast_jitWithFlattenableFieldOffset_;
	public static final int _old_fast_jitWriteBarrierBatchStoreOffset_;
	public static final int _old_fast_jitWriteBarrierBatchStoreWithRangeOffset_;
	public static final int _old_fast_jitWriteBarrierClassStoreMetronomeOffset_;
	public static final int _old_fast_jitWriteBarrierJ9ClassBatchStoreOffset_;
	public static final int _old_fast_jitWriteBarrierJ9ClassStoreOffset_;
	public static final int _old_fast_jitWriteBarrierStoreOffset_;
	public static final int _old_fast_jitWriteBarrierStoreGenerationalOffset_;
	public static final int _old_fast_jitWriteBarrierStoreGenerationalAndConcurrentMarkOffset_;
	public static final int _old_fast_jitWriteBarrierStoreMetronomeOffset_;
	public static final int _old_slow_icallVMprJavaSendPatchupVirtualOffset_;
	public static final int _old_slow_jitAMultiNewArrayOffset_;
	public static final int _old_slow_jitANewArrayOffset_;
	public static final int _old_slow_jitANewArrayNoZeroInitOffset_;
	public static final int _old_slow_jitCallCFunctionOffset_;
	public static final int _old_slow_jitCallJitAddPicToPatchOnClassUnloadOffset_;
	public static final int _old_slow_jitCheckAsyncMessagesOffset_;
	public static final int _old_slow_jitCheckCastOffset_;
	public static final int _old_slow_jitCheckCastForArrayStoreOffset_;
	public static final int _old_slow_jitHandleArrayIndexOutOfBoundsTrapOffset_;
	public static final int _old_slow_jitHandleIntegerDivideByZeroTrapOffset_;
	public static final int _old_slow_jitHandleInternalErrorTrapOffset_;
	public static final int _old_slow_jitHandleNullPointerExceptionTrapOffset_;
	public static final int _old_slow_jitInduceOSRAtCurrentPCOffset_;
	public static final int _old_slow_jitInduceOSRAtCurrentPCAndRecompileOffset_;
	public static final int _old_slow_jitInterpretNewInstanceMethodOffset_;
	public static final int _old_slow_jitLookupInterfaceMethodOffset_;
	public static final int _old_slow_jitMethodMonitorEntryOffset_;
	public static final int _old_slow_jitMethodMonitorExitOffset_;
	public static final int _old_slow_jitMonitorEntryOffset_;
	public static final int _old_slow_jitMonitorExitOffset_;
	public static final int _old_slow_jitNewArrayOffset_;
	public static final int _old_slow_jitNewArrayNoZeroInitOffset_;
	public static final int _old_slow_jitNewInstanceImplAccessCheckOffset_;
	public static final int _old_slow_jitNewObjectOffset_;
	public static final int _old_slow_jitNewObjectNoZeroInitOffset_;
	public static final int _old_slow_jitReportFinalFieldModifiedOffset_;
	public static final int _old_slow_jitReportInstanceFieldReadOffset_;
	public static final int _old_slow_jitReportInstanceFieldWriteOffset_;
	public static final int _old_slow_jitReportMethodEnterOffset_;
	public static final int _old_slow_jitReportMethodExitOffset_;
	public static final int _old_slow_jitReportStaticFieldReadOffset_;
	public static final int _old_slow_jitReportStaticFieldWriteOffset_;
	public static final int _old_slow_jitReportStaticMethodEnterOffset_;
	public static final int _old_slow_jitResolveClassOffset_;
	public static final int _old_slow_jitResolveClassFromStaticFieldOffset_;
	public static final int _old_slow_jitResolveConstantDynamicOffset_;
	public static final int _old_slow_jitResolveFieldOffset_;
	public static final int _old_slow_jitResolveFieldDirectOffset_;
	public static final int _old_slow_jitResolveFieldSetterOffset_;
	public static final int _old_slow_jitResolveFieldSetterDirectOffset_;
	public static final int _old_slow_jitResolveFlattenableFieldOffset_;
	public static final int _old_slow_jitResolveHandleMethodOffset_;
	public static final int _old_slow_jitResolveInterfaceMethodOffset_;
	public static final int _old_slow_jitResolveInvokeDynamicOffset_;
	public static final int _old_slow_jitResolveMethodHandleOffset_;
	public static final int _old_slow_jitResolveMethodTypeOffset_;
	public static final int _old_slow_jitResolveSpecialMethodOffset_;
	public static final int _old_slow_jitResolveStaticFieldOffset_;
	public static final int _old_slow_jitResolveStaticFieldDirectOffset_;
	public static final int _old_slow_jitResolveStaticFieldSetterOffset_;
	public static final int _old_slow_jitResolveStaticFieldSetterDirectOffset_;
	public static final int _old_slow_jitResolveStaticMethodOffset_;
	public static final int _old_slow_jitResolveStringOffset_;
	public static final int _old_slow_jitResolveVirtualMethodOffset_;
	public static final int _old_slow_jitRetranslateCallerOffset_;
	public static final int _old_slow_jitRetranslateCallerWithPreparationOffset_;
	public static final int _old_slow_jitRetranslateMethodOffset_;
	public static final int _old_slow_jitStackOverflowOffset_;
	public static final int _old_slow_jitThrowAbstractMethodErrorOffset_;
	public static final int _old_slow_jitThrowArithmeticExceptionOffset_;
	public static final int _old_slow_jitThrowArrayIndexOutOfBoundsOffset_;
	public static final int _old_slow_jitThrowArrayStoreExceptionOffset_;
	public static final int _old_slow_jitThrowArrayStoreExceptionWithIPOffset_;
	public static final int _old_slow_jitThrowCurrentExceptionOffset_;
	public static final int _old_slow_jitThrowExceptionOffset_;
	public static final int _old_slow_jitThrowExceptionInInitializerErrorOffset_;
	public static final int _old_slow_jitThrowIllegalAccessErrorOffset_;
	public static final int _old_slow_jitThrowIncompatibleClassChangeErrorOffset_;
	public static final int _old_slow_jitThrowIncompatibleReceiverOffset_;
	public static final int _old_slow_jitThrowInstantiationExceptionOffset_;
	public static final int _old_slow_jitThrowNullPointerExceptionOffset_;
	public static final int _old_slow_jitThrowUnreportedExceptionOffset_;
	public static final int _old_slow_jitThrowWrongMethodTypeExceptionOffset_;
	public static final int _old_slow_jitTranslateNewInstanceMethodOffset_;
	public static final int _old_slow_jitTypeCheckArrayStoreOffset_;
	public static final int _old_slow_jitTypeCheckArrayStoreWithNullCheckOffset_;
	public static final int _osrFramesMaximumSizeOffset_;
	public static final int _osrScratchBufferMaximumSizeOffset_;
	public static final int _osrStackFrameMaximumSizeOffset_;
	public static final int _outOfMemoryJumpBufferOffset_;
	public static final int _patchupVirtualOffset_;
	public static final int _performDLTOffset_;
	public static final int _preScavengeAllocateHeapAllocOffset_;
	public static final int _preScavengeAllocateHeapBaseOffset_;
	public static final int _printAOTHeaderProcessorFeaturesOffset_;
	public static final int _privateConfigOffset_;
	public static final int _processorInfoOffset_;
	public static final int _promoteGPUCompileOffset_;
	public static final int _pseudoTOCOffset_;
	public static final int _relocatableTargetProcessorOffset_;
	public static final int _retranslateWithPreparationOffset_;
	public static final int _retranslateWithPreparationForMethodRedefinitionOffset_;
	public static final int _runJITHandlerOffset_;
	public static final int _runJitdumpOffset_;
	public static final int _runtimeFlagsOffset_;
	public static final int _sampleInterruptHandlerKeyOffset_;
	public static final int _sampleIntervalOffset_;
	public static final int _samplerMonitorOffset_;
	public static final int _samplerThreadOffset_;
	public static final int _samplingFrequencyOffset_;
	public static final int _samplingTickCountOffset_;
	public static final int _scratchSegmentOffset_;
	public static final int _scratchSpacePageSizeOffset_;
	public static final int _setUpForDLTOffset_;
	public static final int _singleStepCountOffset_;
	public static final int _tLogFileOffset_;
	public static final int _tLogFileNameOffset_;
	public static final int _tLogFileTempOffset_;
	public static final int _targetLittleEndianOffset_;
	public static final int _targetNameOffset_;
	public static final int _targetProcessorOffset_;
	public static final int _thunkHashTableOffset_;
	public static final int _thunkHashTableMutexOffset_;
	public static final int _thunkLookUpNameAndSigOffset_;
	public static final int _traceInfoOffset_;
	public static final int _tracingHookOffset_;
	public static final int _translateMethodHandleOffset_;
	public static final int _translationArtifactsOffset_;
	public static final int _translationFiltersOffset_;
	public static final int _translationFiltersFlagsOffset_;
	public static final int _vLogFileOffset_;
	public static final int _vLogFileNameOffset_;
	public static final int _vTuneInterfaceOffset_;
	public static final int _verboseOutputLevelOffset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		J9JIT_AOT = 0;
		J9JIT_AOT_ATTACHED = 0;
		J9JIT_ASSUME_STRICTFP = 0;
		J9JIT_ASSUME_STRICTFPCOMPARES = 0;
		J9JIT_CG_BREAK_ON_ENTRY = 0;
		J9JIT_CG_OPT_LEVEL_BEST_AVAILABLE = 0;
		J9JIT_CG_OPT_LEVEL_HIGH = 0;
		J9JIT_CG_OPT_LEVEL_LOW = 0;
		J9JIT_CG_OPT_LEVEL_NONE = 0;
		J9JIT_CG_REGISTER_MAPS = 0;
		J9JIT_CODE_CACHE_FULL = 0;
		J9JIT_COMPILE_CLINIT = 0;
		J9JIT_DATA_CACHE_FULL = 0;
		J9JIT_DEFER_JIT = 0;
		J9JIT_GC_NOTIFY = 0;
		J9JIT_GROW_CACHES = 0;
		J9JIT_JIT_ATTACHED = 0;
		J9JIT_JVMPI_DISABLE_DIRECT_INLINING_NATIVES = 0;
		J9JIT_JVMPI_DISABLE_DIRECT_RECLAIM = 0;
		J9JIT_JVMPI_DISABLE_DIRECT_TO_JNI = 0;
		J9JIT_JVMPI_GEN_BUILTIN_ENTRY_EXIT = 0;
		J9JIT_JVMPI_GEN_COMPILED_ENTRY_EXIT = 0;
		J9JIT_JVMPI_GEN_INLINE_ENTRY_EXIT = 0;
		J9JIT_JVMPI_GEN_NATIVE_ENTRY_EXIT = 0;
		J9JIT_JVMPI_INLINE_ALLOCATION_OFF = 0;
		J9JIT_JVMPI_INLINE_METHOD_OFF = 0;
		J9JIT_JVMPI_JIT_DEFAULTS = 0;
		J9JIT_PATCHING_FENCE_REQUIRED = 0;
		J9JIT_PATCHING_FENCE_TYPE = 0;
		J9JIT_QUICKSTART = 0;
		J9JIT_REPORT_EVENTS = 0;
		J9JIT_RUNTIME_RESOLVE = 0;
		J9JIT_SCAVENGE_ON_RESOLVE = 0;
		J9JIT_SCAVENGE_ON_RUNTIME = 0;
		J9JIT_TESTMODE = 0;
		J9JIT_TOSS_CODE = 0;
		_aotCompilationInfoOffset_ = 0;
		_aotrt_getRuntimeHelperOffset_ = 0;
		_aotrt_lookupSendTargetForThunkOffset_ = 0;
		_b_i2jTransitionOffset_ = 0;
		_bcSizeLimitOffset_ = 0;
		_breakMessageNumberOffset_ = 0;
		_breakpointedMethodsOffset_ = 0;
		_c_jitDecompileAfterAllocationOffset_ = 0;
		_c_jitDecompileAfterMonitorEnterOffset_ = 0;
		_c_jitDecompileAtCurrentPCOffset_ = 0;
		_c_jitDecompileAtExceptionCatchOffset_ = 0;
		_c_jitDecompileBeforeMethodMonitorEnterOffset_ = 0;
		_c_jitDecompileBeforeReportMethodEnterOffset_ = 0;
		_c_jitDecompileOnReturnOffset_ = 0;
		_c_jitReportExceptionCatchOffset_ = 0;
		_classLibAttributesOffset_ = 0;
		_codeCacheOffset_ = 0;
		_codeCacheAlignmentOffset_ = 0;
		_codeCacheColdAllocOffset_ = 0;
		_codeCacheFreeListOffset_ = 0;
		_codeCacheKBOffset_ = 0;
		_codeCacheListOffset_ = 0;
		_codeCachePadKBOffset_ = 0;
		_codeCacheTotalKBOffset_ = 0;
		_codeCacheTrampolinesOffset_ = 0;
		_codeCacheWarmAllocOffset_ = 0;
		_commandOffset_ = 0;
		_compilationInfoOffset_ = 0;
		_compilationMonitorOffset_ = 0;
		_compileClassOffset_ = 0;
		_compileClassesOffset_ = 0;
		_dataBreakpointCountOffset_ = 0;
		_dataCacheOffset_ = 0;
		_dataCacheKBOffset_ = 0;
		_dataCacheListOffset_ = 0;
		_dataCacheTotalKBOffset_ = 0;
		_disableJitOffset_ = 0;
		_doAESInHardwareOffset_ = 0;
		_doSha256InHardwareOffset_ = 0;
		_doSha512InHardwareOffset_ = 0;
		_enableJitOffset_ = 0;
		_entryPointOffset_ = 0;
		_entryPointForNewInstanceOffset_ = 0;
		_expandAESKeyInHardwareOffset_ = 0;
		_fast_jitANewArrayOffset_ = 0;
		_fast_jitANewArrayNoZeroInitOffset_ = 0;
		_fast_jitAcquireVMAccessOffset_ = 0;
		_fast_jitCheckCastOffset_ = 0;
		_fast_jitCheckCastForArrayStoreOffset_ = 0;
		_fast_jitMethodMonitorEntryOffset_ = 0;
		_fast_jitMethodMonitorExitOffset_ = 0;
		_fast_jitMonitorEntryOffset_ = 0;
		_fast_jitMonitorExitOffset_ = 0;
		_fast_jitNewArrayOffset_ = 0;
		_fast_jitNewArrayNoZeroInitOffset_ = 0;
		_fast_jitNewObjectOffset_ = 0;
		_fast_jitNewObjectNoZeroInitOffset_ = 0;
		_fast_jitNewValueOffset_ = 0;
		_fast_jitNewValueNoZeroInitOffset_ = 0;
		_fast_jitPostJNICallOffloadCheckOffset_ = 0;
		_fast_jitPreJNICallOffloadCheckOffset_ = 0;
		_fast_jitReleaseVMAccessOffset_ = 0;
		_fast_jitTypeCheckArrayStoreOffset_ = 0;
		_fast_jitTypeCheckArrayStoreWithNullCheckOffset_ = 0;
		_fsdEnabledOffset_ = 0;
		_gcCountOffset_ = 0;
		_gcOnResolveThresholdOffset_ = 0;
		_gcTraceThresholdOffset_ = 0;
		_getByteCodeIndexOffset_ = 0;
		_getByteCodeIndexFromStackMapOffset_ = 0;
		_getByteCodeIndexFromStackMapVerboseOffset_ = 0;
		_getByteCodeIndexVerboseOffset_ = 0;
		_getCryptoHardwareFeaturesOffset_ = 0;
		_getCurrentByteCodeIndexAndIsSameReceiverOffset_ = 0;
		_getCurrentByteCodeIndexAndIsSameReceiverVerboseOffset_ = 0;
		_getFirstInlinedCallSiteOffset_ = 0;
		_getFirstInlinedCallSiteVerboseOffset_ = 0;
		_getInlinedMethodOffset_ = 0;
		_getInlinedMethodVerboseOffset_ = 0;
		_getJitInlineDepthFromCallSiteOffset_ = 0;
		_getJitInlineDepthFromCallSiteVerboseOffset_ = 0;
		_getJitInlinedCallInfoOffset_ = 0;
		_getJitInlinedCallInfoVerboseOffset_ = 0;
		_getJitRegisterMapOffset_ = 0;
		_getJitRegisterMapVerboseOffset_ = 0;
		_getNextInlinedCallSiteOffset_ = 0;
		_getNextInlinedCallSiteVerboseOffset_ = 0;
		_getStackMapFromJitPCOffset_ = 0;
		_getStackMapFromJitPCVerboseOffset_ = 0;
		_globalSampleCountOffset_ = 0;
		_hasMoreInlinedMethodsOffset_ = 0;
		_hasMoreInlinedMethodsVerboseOffset_ = 0;
		_hookInterfaceOffset_ = 0;
		_i2jMHTransitionOffset_ = 0;
		_i2jReturnTableOffset_ = 0;
		_i2jTransitionOffset_ = 0;
		_inlineFieldWatchesOffset_ = 0;
		_inlineSizeLimitOffset_ = 0;
		_iprofilerBufferSizeOffset_ = 0;
		_isAESSupportedByHardwareOffset_ = 0;
		_isDLTReadyOffset_ = 0;
		_j2iInvokeWithArgumentsOffset_ = 0;
		_j9jit_printfOffset_ = 0;
		_javaVMOffset_ = 0;
		_jitAddDecompilationForFramePopOffset_ = 0;
		_jitCanResumeAtOSRPointOffset_ = 0;
		_jitCheckScavengeOnResolveOffset_ = 0;
		_jitClassesRedefinedOffset_ = 0;
		_jitCleanUpDecompilationStackOffset_ = 0;
		_jitCodeBreakpointAddedOffset_ = 0;
		_jitCodeBreakpointRemovedOffset_ = 0;
		_jitDataBreakpointAddedOffset_ = 0;
		_jitDataBreakpointRemovedOffset_ = 0;
		_jitDecompileMethodForFramePopOffset_ = 0;
		_jitDiscardPendingCompilationsOfNativesOffset_ = 0;
		_jitExceptionCaughtOffset_ = 0;
		_jitExclusiveVMShutdownPendingOffset_ = 0;
		_jitExitInterpreter0Offset_ = 0;
		_jitExitInterpreter1Offset_ = 0;
		_jitExitInterpreterDOffset_ = 0;
		_jitExitInterpreterFOffset_ = 0;
		_jitExitInterpreterJOffset_ = 0;
		_jitFillOSRBufferReturnOffset_ = 0;
		_jitFloatReturnUsageOffset_ = 0;
		_jitFlushCompilationQueueOffset_ = 0;
		_jitFramePopNotificationAddedOffset_ = 0;
		_jitGetExceptionCatcherOffset_ = 0;
		_jitGetExceptionTableFromPCOffset_ = 0;
		_jitGetExceptionTableFromPCVerboseOffset_ = 0;
		_jitGetInlinerMapFromPCOffset_ = 0;
		_jitGetInlinerMapFromPCVerboseOffset_ = 0;
		_jitGetStackMapFromPCOffset_ = 0;
		_jitGetStackMapFromPCVerboseOffset_ = 0;
		_jitHookAboutToRunMainOffset_ = 0;
		_jitHotswapOccurredOffset_ = 0;
		_jitIllegalFinalFieldModificationOffset_ = 0;
		_jitInstanceOfOffset_ = 0;
		_jitLevelNameOffset_ = 0;
		_jitLocalSlotAddressOffset_ = 0;
		_jitMethodBreakpointedOffset_ = 0;
		_jitMethodUnbreakpointedOffset_ = 0;
		_jitOSRGetPatchPointOffset_ = 0;
		_jitOSRPatchMethodOffset_ = 0;
		_jitOSRUnpatchMethodOffset_ = 0;
		_jitReportDynamicCodeLoadEventsOffset_ = 0;
		_jitReportDynamicCodeLoadEventsVerboseOffset_ = 0;
		_jitSendTargetTableOffset_ = 0;
		_jitSignalHandlerOffset_ = 0;
		_jitSingleStepAddedOffset_ = 0;
		_jitSingleStepRemovedOffset_ = 0;
		_jitStackLocalsModifiedOffset_ = 0;
		_jitStaticsOffset_ = 0;
		_jitThrowArrayStoreExceptionWithIPOffset_ = 0;
		_jitToInterpreterThunksOffset_ = 0;
		_jitWriteBarrierBatchStoreOffset_ = 0;
		_jitWriteBarrierBatchStoreWithRangeOffset_ = 0;
		_jitWriteBarrierStoreOffset_ = 0;
		_largeCodePageFlagsOffset_ = 0;
		_largeCodePageSizeOffset_ = 0;
		_lastExceptionTableAllocSizeOffset_ = 0;
		_lastGCDataAllocSizeOffset_ = 0;
		_launchGPUOffset_ = 0;
		_loadPreservedAndBranchOffset_ = 0;
		_logFileNameOffset_ = 0;
		_maxInlineDepthOffset_ = 0;
		_messageNumberOffset_ = 0;
		_messageThresholdOffset_ = 0;
		_methodsToDeleteOffset_ = 0;
		_mutexOffset_ = 0;
		_newInstanceImplMethodOffset_ = 0;
		_old_fast_jitANewArrayOffset_ = 0;
		_old_fast_jitANewArrayNoZeroInitOffset_ = 0;
		_old_fast_jitAcmpHelperOffset_ = 0;
		_old_fast_jitCheckCastOffset_ = 0;
		_old_fast_jitCheckCastForArrayStoreOffset_ = 0;
		_old_fast_jitCheckIfFinalizeObjectOffset_ = 0;
		_old_fast_jitCollapseJNIReferenceFrameOffset_ = 0;
		_old_fast_jitGetFlattenableFieldOffset_ = 0;
		_old_fast_jitGetFlattenableStaticFieldOffset_ = 0;
		_old_fast_jitInstanceOfOffset_ = 0;
		_old_fast_jitLoadFlattenableArrayElementOffset_ = 0;
		_old_fast_jitLookupInterfaceMethodOffset_ = 0;
		_old_fast_jitMethodIsNativeOffset_ = 0;
		_old_fast_jitMethodIsSyncOffset_ = 0;
		_old_fast_jitMethodMonitorEntryOffset_ = 0;
		_old_fast_jitMethodMonitorExitOffset_ = 0;
		_old_fast_jitMonitorEntryOffset_ = 0;
		_old_fast_jitMonitorExitOffset_ = 0;
		_old_fast_jitNewArrayOffset_ = 0;
		_old_fast_jitNewArrayNoZeroInitOffset_ = 0;
		_old_fast_jitNewObjectOffset_ = 0;
		_old_fast_jitNewObjectNoZeroInitOffset_ = 0;
		_old_fast_jitObjectHashCodeOffset_ = 0;
		_old_fast_jitPutFlattenableFieldOffset_ = 0;
		_old_fast_jitPutFlattenableStaticFieldOffset_ = 0;
		_old_fast_jitResolvedFieldIsVolatileOffset_ = 0;
		_old_fast_jitStoreFlattenableArrayElementOffset_ = 0;
		_old_fast_jitTypeCheckArrayStoreOffset_ = 0;
		_old_fast_jitTypeCheckArrayStoreWithNullCheckOffset_ = 0;
		_old_fast_jitVolatileReadDoubleOffset_ = 0;
		_old_fast_jitVolatileReadLongOffset_ = 0;
		_old_fast_jitVolatileWriteDoubleOffset_ = 0;
		_old_fast_jitVolatileWriteLongOffset_ = 0;
		_old_fast_jitWithFlattenableFieldOffset_ = 0;
		_old_fast_jitWriteBarrierBatchStoreOffset_ = 0;
		_old_fast_jitWriteBarrierBatchStoreWithRangeOffset_ = 0;
		_old_fast_jitWriteBarrierClassStoreMetronomeOffset_ = 0;
		_old_fast_jitWriteBarrierJ9ClassBatchStoreOffset_ = 0;
		_old_fast_jitWriteBarrierJ9ClassStoreOffset_ = 0;
		_old_fast_jitWriteBarrierStoreOffset_ = 0;
		_old_fast_jitWriteBarrierStoreGenerationalOffset_ = 0;
		_old_fast_jitWriteBarrierStoreGenerationalAndConcurrentMarkOffset_ = 0;
		_old_fast_jitWriteBarrierStoreMetronomeOffset_ = 0;
		_old_slow_icallVMprJavaSendPatchupVirtualOffset_ = 0;
		_old_slow_jitAMultiNewArrayOffset_ = 0;
		_old_slow_jitANewArrayOffset_ = 0;
		_old_slow_jitANewArrayNoZeroInitOffset_ = 0;
		_old_slow_jitCallCFunctionOffset_ = 0;
		_old_slow_jitCallJitAddPicToPatchOnClassUnloadOffset_ = 0;
		_old_slow_jitCheckAsyncMessagesOffset_ = 0;
		_old_slow_jitCheckCastOffset_ = 0;
		_old_slow_jitCheckCastForArrayStoreOffset_ = 0;
		_old_slow_jitHandleArrayIndexOutOfBoundsTrapOffset_ = 0;
		_old_slow_jitHandleIntegerDivideByZeroTrapOffset_ = 0;
		_old_slow_jitHandleInternalErrorTrapOffset_ = 0;
		_old_slow_jitHandleNullPointerExceptionTrapOffset_ = 0;
		_old_slow_jitInduceOSRAtCurrentPCOffset_ = 0;
		_old_slow_jitInduceOSRAtCurrentPCAndRecompileOffset_ = 0;
		_old_slow_jitInterpretNewInstanceMethodOffset_ = 0;
		_old_slow_jitLookupInterfaceMethodOffset_ = 0;
		_old_slow_jitMethodMonitorEntryOffset_ = 0;
		_old_slow_jitMethodMonitorExitOffset_ = 0;
		_old_slow_jitMonitorEntryOffset_ = 0;
		_old_slow_jitMonitorExitOffset_ = 0;
		_old_slow_jitNewArrayOffset_ = 0;
		_old_slow_jitNewArrayNoZeroInitOffset_ = 0;
		_old_slow_jitNewInstanceImplAccessCheckOffset_ = 0;
		_old_slow_jitNewObjectOffset_ = 0;
		_old_slow_jitNewObjectNoZeroInitOffset_ = 0;
		_old_slow_jitReportFinalFieldModifiedOffset_ = 0;
		_old_slow_jitReportInstanceFieldReadOffset_ = 0;
		_old_slow_jitReportInstanceFieldWriteOffset_ = 0;
		_old_slow_jitReportMethodEnterOffset_ = 0;
		_old_slow_jitReportMethodExitOffset_ = 0;
		_old_slow_jitReportStaticFieldReadOffset_ = 0;
		_old_slow_jitReportStaticFieldWriteOffset_ = 0;
		_old_slow_jitReportStaticMethodEnterOffset_ = 0;
		_old_slow_jitResolveClassOffset_ = 0;
		_old_slow_jitResolveClassFromStaticFieldOffset_ = 0;
		_old_slow_jitResolveConstantDynamicOffset_ = 0;
		_old_slow_jitResolveFieldOffset_ = 0;
		_old_slow_jitResolveFieldDirectOffset_ = 0;
		_old_slow_jitResolveFieldSetterOffset_ = 0;
		_old_slow_jitResolveFieldSetterDirectOffset_ = 0;
		_old_slow_jitResolveFlattenableFieldOffset_ = 0;
		_old_slow_jitResolveHandleMethodOffset_ = 0;
		_old_slow_jitResolveInterfaceMethodOffset_ = 0;
		_old_slow_jitResolveInvokeDynamicOffset_ = 0;
		_old_slow_jitResolveMethodHandleOffset_ = 0;
		_old_slow_jitResolveMethodTypeOffset_ = 0;
		_old_slow_jitResolveSpecialMethodOffset_ = 0;
		_old_slow_jitResolveStaticFieldOffset_ = 0;
		_old_slow_jitResolveStaticFieldDirectOffset_ = 0;
		_old_slow_jitResolveStaticFieldSetterOffset_ = 0;
		_old_slow_jitResolveStaticFieldSetterDirectOffset_ = 0;
		_old_slow_jitResolveStaticMethodOffset_ = 0;
		_old_slow_jitResolveStringOffset_ = 0;
		_old_slow_jitResolveVirtualMethodOffset_ = 0;
		_old_slow_jitRetranslateCallerOffset_ = 0;
		_old_slow_jitRetranslateCallerWithPreparationOffset_ = 0;
		_old_slow_jitRetranslateMethodOffset_ = 0;
		_old_slow_jitStackOverflowOffset_ = 0;
		_old_slow_jitThrowAbstractMethodErrorOffset_ = 0;
		_old_slow_jitThrowArithmeticExceptionOffset_ = 0;
		_old_slow_jitThrowArrayIndexOutOfBoundsOffset_ = 0;
		_old_slow_jitThrowArrayStoreExceptionOffset_ = 0;
		_old_slow_jitThrowArrayStoreExceptionWithIPOffset_ = 0;
		_old_slow_jitThrowCurrentExceptionOffset_ = 0;
		_old_slow_jitThrowExceptionOffset_ = 0;
		_old_slow_jitThrowExceptionInInitializerErrorOffset_ = 0;
		_old_slow_jitThrowIllegalAccessErrorOffset_ = 0;
		_old_slow_jitThrowIncompatibleClassChangeErrorOffset_ = 0;
		_old_slow_jitThrowIncompatibleReceiverOffset_ = 0;
		_old_slow_jitThrowInstantiationExceptionOffset_ = 0;
		_old_slow_jitThrowNullPointerExceptionOffset_ = 0;
		_old_slow_jitThrowUnreportedExceptionOffset_ = 0;
		_old_slow_jitThrowWrongMethodTypeExceptionOffset_ = 0;
		_old_slow_jitTranslateNewInstanceMethodOffset_ = 0;
		_old_slow_jitTypeCheckArrayStoreOffset_ = 0;
		_old_slow_jitTypeCheckArrayStoreWithNullCheckOffset_ = 0;
		_osrFramesMaximumSizeOffset_ = 0;
		_osrScratchBufferMaximumSizeOffset_ = 0;
		_osrStackFrameMaximumSizeOffset_ = 0;
		_outOfMemoryJumpBufferOffset_ = 0;
		_patchupVirtualOffset_ = 0;
		_performDLTOffset_ = 0;
		_preScavengeAllocateHeapAllocOffset_ = 0;
		_preScavengeAllocateHeapBaseOffset_ = 0;
		_printAOTHeaderProcessorFeaturesOffset_ = 0;
		_privateConfigOffset_ = 0;
		_processorInfoOffset_ = 0;
		_promoteGPUCompileOffset_ = 0;
		_pseudoTOCOffset_ = 0;
		_relocatableTargetProcessorOffset_ = 0;
		_retranslateWithPreparationOffset_ = 0;
		_retranslateWithPreparationForMethodRedefinitionOffset_ = 0;
		_runJITHandlerOffset_ = 0;
		_runJitdumpOffset_ = 0;
		_runtimeFlagsOffset_ = 0;
		_sampleInterruptHandlerKeyOffset_ = 0;
		_sampleIntervalOffset_ = 0;
		_samplerMonitorOffset_ = 0;
		_samplerThreadOffset_ = 0;
		_samplingFrequencyOffset_ = 0;
		_samplingTickCountOffset_ = 0;
		_scratchSegmentOffset_ = 0;
		_scratchSpacePageSizeOffset_ = 0;
		_setUpForDLTOffset_ = 0;
		_singleStepCountOffset_ = 0;
		_tLogFileOffset_ = 0;
		_tLogFileNameOffset_ = 0;
		_tLogFileTempOffset_ = 0;
		_targetLittleEndianOffset_ = 0;
		_targetNameOffset_ = 0;
		_targetProcessorOffset_ = 0;
		_thunkHashTableOffset_ = 0;
		_thunkHashTableMutexOffset_ = 0;
		_thunkLookUpNameAndSigOffset_ = 0;
		_traceInfoOffset_ = 0;
		_tracingHookOffset_ = 0;
		_translateMethodHandleOffset_ = 0;
		_translationArtifactsOffset_ = 0;
		_translationFiltersOffset_ = 0;
		_translationFiltersFlagsOffset_ = 0;
		_vLogFileOffset_ = 0;
		_vLogFileNameOffset_ = 0;
		_vTuneInterfaceOffset_ = 0;
		_verboseOutputLevelOffset_ = 0;
	}

}
