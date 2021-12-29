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
 * Structure: OMR_VMPointer
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
 * The generated code will provide getters for all elements in the OMR_VMPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=OMR_VM.class)
public class OMR_VMPointer extends StructurePointer {

	// NULL
	public static final OMR_VMPointer NULL = new OMR_VMPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected OMR_VMPointer(long address) {
		super(address);
	}

	public static OMR_VMPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static OMR_VMPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static OMR_VMPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new OMR_VMPointer(address);
	}

	public OMR_VMPointer add(long count) {
		return OMR_VMPointer.cast(address + (OMR_VM.SIZEOF * count));
	}

	public OMR_VMPointer add(Scalar count) {
		return add(count.longValue());
	}

	public OMR_VMPointer addOffset(long offset) {
		return OMR_VMPointer.cast(address + offset);
	}

	public OMR_VMPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public OMR_VMPointer sub(long count) {
		return OMR_VMPointer.cast(address - (OMR_VM.SIZEOF * count));
	}

	public OMR_VMPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public OMR_VMPointer subOffset(long offset) {
		return OMR_VMPointer.cast(address - offset);
	}

	public OMR_VMPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public OMR_VMPointer untag(long mask) {
		return OMR_VMPointer.cast(address & ~mask);
	}

	public OMR_VMPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return OMR_VM.SIZEOF;
	}

	// Implementation methods

	// U64 _arrayletLeafLogSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__arrayletLeafLogSizeOffset_", declaredType="U64")
	public UDATA _arrayletLeafLogSize() throws CorruptDataException {
		return new U64(getLongAtOffset(OMR_VM.__arrayletLeafLogSizeOffset_));
	}

	// U64 _arrayletLeafLogSize
	public UDATAPointer _arrayletLeafLogSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMR_VM.__arrayletLeafLogSizeOffset_));
	}

	// U64 _arrayletLeafSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__arrayletLeafSizeOffset_", declaredType="U64")
	public UDATA _arrayletLeafSize() throws CorruptDataException {
		return new U64(getLongAtOffset(OMR_VM.__arrayletLeafSizeOffset_));
	}

	// U64 _arrayletLeafSize
	public UDATAPointer _arrayletLeafSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMR_VM.__arrayletLeafSizeOffset_));
	}

	// U64 _compressObjectReferences
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compressObjectReferencesOffset_", declaredType="U64")
	public UDATA _compressObjectReferences() throws CorruptDataException {
		return new U64(getLongAtOffset(OMR_VM.__compressObjectReferencesOffset_));
	}

	// U64 _compressObjectReferences
	public UDATAPointer _compressObjectReferencesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMR_VM.__compressObjectReferencesOffset_));
	}

	// U64 _compressedPointersShift
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compressedPointersShiftOffset_", declaredType="U64")
	public UDATA _compressedPointersShift() throws CorruptDataException {
		return new U64(getLongAtOffset(OMR_VM.__compressedPointersShiftOffset_));
	}

	// U64 _compressedPointersShift
	public UDATAPointer _compressedPointersShiftEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMR_VM.__compressedPointersShiftOffset_));
	}

	// OMR_VMConfiguration _configuration
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__configurationOffset_", declaredType="OMR_VMConfiguration")
	public OMR_VMConfigurationPointer _configuration() throws CorruptDataException {
		return OMR_VMConfigurationPointer.cast(nonNullFieldEA(OMR_VM.__configurationOffset_));
	}

	// OMR_VMConfiguration _configuration
	public PointerPointer _configurationEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VM.__configurationOffset_));
	}

	// U64 _gcCycleOn
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__gcCycleOnOffset_", declaredType="U64")
	public UDATA _gcCycleOn() throws CorruptDataException {
		return new U64(getLongAtOffset(OMR_VM.__gcCycleOnOffset_));
	}

	// U64 _gcCycleOn
	public UDATAPointer _gcCycleOnEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMR_VM.__gcCycleOnOffset_));
	}

	// omrthread_monitor_t _gcCycleOnMonitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__gcCycleOnMonitorOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _gcCycleOnMonitor() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(OMR_VM.__gcCycleOnMonitorOffset_));
	}

	// omrthread_monitor_t _gcCycleOnMonitor
	public PointerPointer _gcCycleOnMonitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VM.__gcCycleOnMonitorOffset_));
	}

	// void* _gcOmrVMExtensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__gcOmrVMExtensionsOffset_", declaredType="void*")
	public VoidPointer _gcOmrVMExtensions() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMR_VM.__gcOmrVMExtensionsOffset_));
	}

	// void* _gcOmrVMExtensions
	public PointerPointer _gcOmrVMExtensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VM.__gcOmrVMExtensionsOffset_));
	}

	// OMR_Agent* _hcAgent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__hcAgentOffset_", declaredType="OMR_Agent*")
	public OMR_AgentPointer _hcAgent() throws CorruptDataException {
		return OMR_AgentPointer.cast(getPointerAtOffset(OMR_VM.__hcAgentOffset_));
	}

	// OMR_Agent* _hcAgent
	public PointerPointer _hcAgentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VM.__hcAgentOffset_));
	}

	// U64 _internalThreadCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__internalThreadCountOffset_", declaredType="U64")
	public UDATA _internalThreadCount() throws CorruptDataException {
		return new U64(getLongAtOffset(OMR_VM.__internalThreadCountOffset_));
	}

	// U64 _internalThreadCount
	public UDATAPointer _internalThreadCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMR_VM.__internalThreadCountOffset_));
	}

	// U64 _languageThreadCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__languageThreadCountOffset_", declaredType="U64")
	public UDATA _languageThreadCount() throws CorruptDataException {
		return new U64(getLongAtOffset(OMR_VM.__languageThreadCountOffset_));
	}

	// U64 _languageThreadCount
	public UDATAPointer _languageThreadCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMR_VM.__languageThreadCountOffset_));
	}

	// void* _language_vm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__language_vmOffset_", declaredType="void*")
	public VoidPointer _language_vm() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMR_VM.__language_vmOffset_));
	}

	// void* _language_vm
	public PointerPointer _language_vmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VM.__language_vmOffset_));
	}

	// OMR_VM* _linkNext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__linkNextOffset_", declaredType="OMR_VM*")
	public OMR_VMPointer _linkNext() throws CorruptDataException {
		return OMR_VMPointer.cast(getPointerAtOffset(OMR_VM.__linkNextOffset_));
	}

	// OMR_VM* _linkNext
	public PointerPointer _linkNextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VM.__linkNextOffset_));
	}

	// OMR_VM* _linkPrevious
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__linkPreviousOffset_", declaredType="OMR_VM*")
	public OMR_VMPointer _linkPrevious() throws CorruptDataException {
		return OMR_VMPointer.cast(getPointerAtOffset(OMR_VM.__linkPreviousOffset_));
	}

	// OMR_VM* _linkPrevious
	public PointerPointer _linkPreviousEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VM.__linkPreviousOffset_));
	}

	// void* _methodDictionary
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__methodDictionaryOffset_", declaredType="void*")
	public VoidPointer _methodDictionary() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMR_VM.__methodDictionaryOffset_));
	}

	// void* _methodDictionary
	public PointerPointer _methodDictionaryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VM.__methodDictionaryOffset_));
	}

	// U64 _objectAlignmentInBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__objectAlignmentInBytesOffset_", declaredType="U64")
	public UDATA _objectAlignmentInBytes() throws CorruptDataException {
		return new U64(getLongAtOffset(OMR_VM.__objectAlignmentInBytesOffset_));
	}

	// U64 _objectAlignmentInBytes
	public UDATAPointer _objectAlignmentInBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMR_VM.__objectAlignmentInBytesOffset_));
	}

	// U64 _objectAlignmentShift
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__objectAlignmentShiftOffset_", declaredType="U64")
	public UDATA _objectAlignmentShift() throws CorruptDataException {
		return new U64(getLongAtOffset(OMR_VM.__objectAlignmentShiftOffset_));
	}

	// U64 _objectAlignmentShift
	public UDATAPointer _objectAlignmentShiftEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMR_VM.__objectAlignmentShiftOffset_));
	}

	// omrthread_monitor_t _omrTIAccessMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__omrTIAccessMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _omrTIAccessMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(OMR_VM.__omrTIAccessMutexOffset_));
	}

	// omrthread_monitor_t _omrTIAccessMutex
	public PointerPointer _omrTIAccessMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VM.__omrTIAccessMutexOffset_));
	}

	// OMR_Runtime* _runtime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__runtimeOffset_", declaredType="OMR_Runtime*")
	public OMR_RuntimePointer _runtime() throws CorruptDataException {
		return OMR_RuntimePointer.cast(getPointerAtOffset(OMR_VM.__runtimeOffset_));
	}

	// OMR_Runtime* _runtime
	public PointerPointer _runtimeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VM.__runtimeOffset_));
	}

	// OMR_SizeClasses* _sizeClasses
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__sizeClassesOffset_", declaredType="OMR_SizeClasses*")
	public OMR_SizeClassesPointer _sizeClasses() throws CorruptDataException {
		return OMR_SizeClassesPointer.cast(getPointerAtOffset(OMR_VM.__sizeClassesOffset_));
	}

	// OMR_SizeClasses* _sizeClasses
	public PointerPointer _sizeClassesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VM.__sizeClassesOffset_));
	}

	// OMRTraceEngine* _trcEngine
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__trcEngineOffset_", declaredType="OMRTraceEngine*")
	public OMRTraceEnginePointer _trcEngine() throws CorruptDataException {
		return OMRTraceEnginePointer.cast(getPointerAtOffset(OMR_VM.__trcEngineOffset_));
	}

	// OMRTraceEngine* _trcEngine
	public PointerPointer _trcEngineEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VM.__trcEngineOffset_));
	}

	// omrthread_tls_key_t _vmThreadKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__vmThreadKeyOffset_", declaredType="omrthread_tls_key_t")
	public UDATA _vmThreadKey() throws CorruptDataException {
		return new U64(getLongAtOffset(OMR_VM.__vmThreadKeyOffset_));
	}

	// omrthread_tls_key_t _vmThreadKey
	public UDATAPointer _vmThreadKeyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMR_VM.__vmThreadKeyOffset_));
	}

	// OMR_VMThread* _vmThreadList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__vmThreadListOffset_", declaredType="OMR_VMThread*")
	public OMR_VMThreadPointer _vmThreadList() throws CorruptDataException {
		return OMR_VMThreadPointer.cast(getPointerAtOffset(OMR_VM.__vmThreadListOffset_));
	}

	// OMR_VMThread* _vmThreadList
	public PointerPointer _vmThreadListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VM.__vmThreadListOffset_));
	}

	// omrthread_monitor_t _vmThreadListMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__vmThreadListMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _vmThreadListMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(OMR_VM.__vmThreadListMutexOffset_));
	}

	// omrthread_monitor_t _vmThreadListMutex
	public PointerPointer _vmThreadListMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VM.__vmThreadListMutexOffset_));
	}

	// OMR_ExclusiveVMAccessStats exclusiveVMAccessStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exclusiveVMAccessStatsOffset_", declaredType="OMR_ExclusiveVMAccessStats")
	public OMR_ExclusiveVMAccessStatsPointer exclusiveVMAccessStats() throws CorruptDataException {
		return OMR_ExclusiveVMAccessStatsPointer.cast(nonNullFieldEA(OMR_VM._exclusiveVMAccessStatsOffset_));
	}

	// OMR_ExclusiveVMAccessStats exclusiveVMAccessStats
	public PointerPointer exclusiveVMAccessStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VM._exclusiveVMAccessStatsOffset_));
	}

	// U64 gcPolicy
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcPolicyOffset_", declaredType="U64")
	public UDATA gcPolicy() throws CorruptDataException {
		return new U64(getLongAtOffset(OMR_VM._gcPolicyOffset_));
	}

	// U64 gcPolicy
	public UDATAPointer gcPolicyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMR_VM._gcPolicyOffset_));
	}

	// OMR_SysInfo* sysInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sysInfoOffset_", declaredType="OMR_SysInfo*")
	public OMR_SysInfoPointer sysInfo() throws CorruptDataException {
		return OMR_SysInfoPointer.cast(getPointerAtOffset(OMR_VM._sysInfoOffset_));
	}

	// OMR_SysInfo* sysInfo
	public PointerPointer sysInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VM._sysInfoOffset_));
	}

	// UtInterface* utIntf
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_utIntfOffset_", declaredType="UtInterface*")
	public UtInterfacePointer utIntf() throws CorruptDataException {
		return UtInterfacePointer.cast(getPointerAtOffset(OMR_VM._utIntfOffset_));
	}

	// UtInterface* utIntf
	public PointerPointer utIntfEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_VM._utIntfOffset_));
	}

}
