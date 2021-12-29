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
 * Structure: UtGlobalDataPointer
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
 * The generated code will provide getters for all elements in the UtGlobalDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=UtGlobalData.class)
public class UtGlobalDataPointer extends StructurePointer {

	// NULL
	public static final UtGlobalDataPointer NULL = new UtGlobalDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected UtGlobalDataPointer(long address) {
		super(address);
	}

	public static UtGlobalDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static UtGlobalDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static UtGlobalDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new UtGlobalDataPointer(address);
	}

	public UtGlobalDataPointer add(long count) {
		return UtGlobalDataPointer.cast(address + (UtGlobalData.SIZEOF * count));
	}

	public UtGlobalDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public UtGlobalDataPointer addOffset(long offset) {
		return UtGlobalDataPointer.cast(address + offset);
	}

	public UtGlobalDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public UtGlobalDataPointer sub(long count) {
		return UtGlobalDataPointer.cast(address - (UtGlobalData.SIZEOF * count));
	}

	public UtGlobalDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public UtGlobalDataPointer subOffset(long offset) {
		return UtGlobalDataPointer.cast(address - offset);
	}

	public UtGlobalDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public UtGlobalDataPointer untag(long mask) {
		return UtGlobalDataPointer.cast(address & ~mask);
	}

	public UtGlobalDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return UtGlobalData.SIZEOF;
	}

	// Implementation methods

	// volatile U32 allocatedTraceBuffers
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_allocatedTraceBuffersOffset_", declaredType="volatile U32")
	public UDATA allocatedTraceBuffers() throws CorruptDataException {
		return new U32(getIntAtOffset(UtGlobalData._allocatedTraceBuffersOffset_));
	}

	// volatile U32 allocatedTraceBuffers
	public UDATAPointer allocatedTraceBuffersEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtGlobalData._allocatedTraceBuffersOffset_));
	}

	// I32 bufferSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bufferSizeOffset_", declaredType="I32")
	public IDATA bufferSize() throws CorruptDataException {
		return new I32(getIntAtOffset(UtGlobalData._bufferSizeOffset_));
	}

	// I32 bufferSize
	public IDATAPointer bufferSizeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtGlobalData._bufferSizeOffset_));
	}

	// UtComponentList* componentList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_componentListOffset_", declaredType="UtComponentList*")
	public UtComponentListPointer componentList() throws CorruptDataException {
		return UtComponentListPointer.cast(getPointerAtOffset(UtGlobalData._componentListOffset_));
	}

	// UtComponentList* componentList
	public PointerPointer componentListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGlobalData._componentListOffset_));
	}

	// UtTraceCfg* config
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_configOffset_", declaredType="UtTraceCfg*")
	public UtTraceCfgPointer config() throws CorruptDataException {
		return UtTraceCfgPointer.cast(getPointerAtOffset(UtGlobalData._configOffset_));
	}

	// UtTraceCfg* config
	public PointerPointer configEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGlobalData._configOffset_));
	}

	// I32 dynamicBuffers
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dynamicBuffersOffset_", declaredType="I32")
	public IDATA dynamicBuffers() throws CorruptDataException {
		return new I32(getIntAtOffset(UtGlobalData._dynamicBuffersOffset_));
	}

	// I32 dynamicBuffers
	public IDATAPointer dynamicBuffersEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtGlobalData._dynamicBuffersOffset_));
	}

	// U8* exceptFilename
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exceptFilenameOffset_", declaredType="U8*")
	public U8Pointer exceptFilename() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(UtGlobalData._exceptFilenameOffset_));
	}

	// U8* exceptFilename
	public PointerPointer exceptFilenameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGlobalData._exceptFilenameOffset_));
	}

	// I32 exceptTraceWrap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exceptTraceWrapOffset_", declaredType="I32")
	public IDATA exceptTraceWrap() throws CorruptDataException {
		return new I32(getIntAtOffset(UtGlobalData._exceptTraceWrapOffset_));
	}

	// I32 exceptTraceWrap
	public IDATAPointer exceptTraceWrapEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtGlobalData._exceptTraceWrapOffset_));
	}

	// UtThreadData* exceptionContext
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exceptionContextOffset_", declaredType="UtThreadData*")
	public UtThreadDataPointer exceptionContext() throws CorruptDataException {
		return UtThreadDataPointer.cast(getPointerAtOffset(UtGlobalData._exceptionContextOffset_));
	}

	// UtThreadData* exceptionContext
	public PointerPointer exceptionContextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGlobalData._exceptionContextOffset_));
	}

	// UtTraceBuffer* exceptionTrcBuf
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_exceptionTrcBufOffset_", declaredType="UtTraceBuffer*")
	public UtTraceBufferPointer exceptionTrcBuf() throws CorruptDataException {
		return UtTraceBufferPointer.cast(getPointerAtOffset(UtGlobalData._exceptionTrcBufOffset_));
	}

	// UtTraceBuffer* exceptionTrcBuf
	public PointerPointer exceptionTrcBufEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGlobalData._exceptionTrcBufOffset_));
	}

	// I32 extExceptTrace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_extExceptTraceOffset_", declaredType="I32")
	public IDATA extExceptTrace() throws CorruptDataException {
		return new I32(getIntAtOffset(UtGlobalData._extExceptTraceOffset_));
	}

	// I32 extExceptTrace
	public IDATAPointer extExceptTraceEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtGlobalData._extExceptTraceOffset_));
	}

	// I32 externalTrace
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_externalTraceOffset_", declaredType="I32")
	public IDATA externalTrace() throws CorruptDataException {
		return new I32(getIntAtOffset(UtGlobalData._externalTraceOffset_));
	}

	// I32 externalTrace
	public IDATAPointer externalTraceEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtGlobalData._externalTraceOffset_));
	}

	// I32 fatalassert
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fatalassertOffset_", declaredType="I32")
	public IDATA fatalassert() throws CorruptDataException {
		return new I32(getIntAtOffset(UtGlobalData._fatalassertOffset_));
	}

	// I32 fatalassert
	public IDATAPointer fatalassertEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtGlobalData._fatalassertOffset_));
	}

	// UtTraceBuffer* freeQueue
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_freeQueueOffset_", declaredType="UtTraceBuffer*")
	public UtTraceBufferPointer freeQueue() throws CorruptDataException {
		return UtTraceBufferPointer.cast(getPointerAtOffset(UtGlobalData._freeQueueOffset_));
	}

	// UtTraceBuffer* freeQueue
	public PointerPointer freeQueueEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGlobalData._freeQueueOffset_));
	}

	// omrthread_monitor_t freeQueueLock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_freeQueueLockOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer freeQueueLock() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(UtGlobalData._freeQueueLockOffset_));
	}

	// omrthread_monitor_t freeQueueLock
	public PointerPointer freeQueueLockEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGlobalData._freeQueueLockOffset_));
	}

	// U8* generationChar
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_generationCharOffset_", declaredType="U8*")
	public U8Pointer generationChar() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(UtGlobalData._generationCharOffset_));
	}

	// U8* generationChar
	public PointerPointer generationCharEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGlobalData._generationCharOffset_));
	}

	// UtDataHeader header
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_headerOffset_", declaredType="UtDataHeader")
	public UtDataHeaderPointer header() throws CorruptDataException {
		return UtDataHeaderPointer.cast(nonNullFieldEA(UtGlobalData._headerOffset_));
	}

	// UtDataHeader header
	public PointerPointer headerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGlobalData._headerOffset_));
	}

	// void** ignore
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ignoreOffset_", declaredType="void**")
	public PointerPointer ignore() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(UtGlobalData._ignoreOffset_));
	}

	// void** ignore
	public PointerPointer ignoreEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGlobalData._ignoreOffset_));
	}

	// I32 indentPrint
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_indentPrintOffset_", declaredType="I32")
	public IDATA indentPrint() throws CorruptDataException {
		return new I32(getIntAtOffset(UtGlobalData._indentPrintOffset_));
	}

	// I32 indentPrint
	public IDATAPointer indentPrintEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtGlobalData._indentPrintOffset_));
	}

	// I32 initialSuspendResume
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_initialSuspendResumeOffset_", declaredType="I32")
	public IDATA initialSuspendResume() throws CorruptDataException {
		return new I32(getIntAtOffset(UtGlobalData._initialSuspendResumeOffset_));
	}

	// I32 initialSuspendResume
	public IDATAPointer initialSuspendResumeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtGlobalData._initialSuspendResumeOffset_));
	}

	// OMRTraceLanguageInterface languageIntf
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_languageIntfOffset_", declaredType="OMRTraceLanguageInterface")
	public OMRTraceLanguageInterfacePointer languageIntf() throws CorruptDataException {
		return OMRTraceLanguageInterfacePointer.cast(nonNullFieldEA(UtGlobalData._languageIntfOffset_));
	}

	// OMRTraceLanguageInterface languageIntf
	public PointerPointer languageIntfEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGlobalData._languageIntfOffset_));
	}

	// UtThreadData* lastPrint
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastPrintOffset_", declaredType="UtThreadData*")
	public UtThreadDataPointer lastPrint() throws CorruptDataException {
		return UtThreadDataPointer.cast(getPointerAtOffset(UtGlobalData._lastPrintOffset_));
	}

	// UtThreadData* lastPrint
	public PointerPointer lastPrintEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGlobalData._lastPrintOffset_));
	}

	// U32 lostRecords
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lostRecordsOffset_", declaredType="U32")
	public UDATA lostRecords() throws CorruptDataException {
		return new U32(getIntAtOffset(UtGlobalData._lostRecordsOffset_));
	}

	// U32 lostRecords
	public UDATAPointer lostRecordsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtGlobalData._lostRecordsOffset_));
	}

	// I32 nextGeneration
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nextGenerationOffset_", declaredType="I32")
	public IDATA nextGeneration() throws CorruptDataException {
		return new I32(getIntAtOffset(UtGlobalData._nextGenerationOffset_));
	}

	// I32 nextGeneration
	public IDATAPointer nextGenerationEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtGlobalData._nextGenerationOffset_));
	}

	// qQueue outputQueue
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_outputQueueOffset_", declaredType="qQueue")
	public queuePointer outputQueue() throws CorruptDataException {
		return queuePointer.cast(nonNullFieldEA(UtGlobalData._outputQueueOffset_));
	}

	// qQueue outputQueue
	public PointerPointer outputQueueEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGlobalData._outputQueueOffset_));
	}

	// I32 platformTraceStarted
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_platformTraceStartedOffset_", declaredType="I32")
	public IDATA platformTraceStarted() throws CorruptDataException {
		return new I32(getIntAtOffset(UtGlobalData._platformTraceStartedOffset_));
	}

	// I32 platformTraceStarted
	public IDATAPointer platformTraceStartedEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtGlobalData._platformTraceStartedOffset_));
	}

	// J9PortLibrary* portLibrary
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_portLibraryOffset_", declaredType="J9PortLibrary*")
	public J9PortLibraryPointer portLibrary() throws CorruptDataException {
		return J9PortLibraryPointer.cast(getPointerAtOffset(UtGlobalData._portLibraryOffset_));
	}

	// J9PortLibrary* portLibrary
	public PointerPointer portLibraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGlobalData._portLibraryOffset_));
	}

	// U8* properties
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_propertiesOffset_", declaredType="U8*")
	public U8Pointer properties() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(UtGlobalData._propertiesOffset_));
	}

	// U8* properties
	public PointerPointer propertiesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGlobalData._propertiesOffset_));
	}

	// U8* propertyFilePath
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_propertyFilePathOffset_", declaredType="U8*")
	public U8Pointer propertyFilePath() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(UtGlobalData._propertyFilePathOffset_));
	}

	// U8* propertyFilePath
	public PointerPointer propertyFilePathEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGlobalData._propertyFilePathOffset_));
	}

	// U8* serviceInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_serviceInfoOffset_", declaredType="U8*")
	public U8Pointer serviceInfo() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(UtGlobalData._serviceInfoOffset_));
	}

	// U8* serviceInfo
	public PointerPointer serviceInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGlobalData._serviceInfoOffset_));
	}

	// U32 sleepTimeMillis
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sleepTimeMillisOffset_", declaredType="U32")
	public UDATA sleepTimeMillis() throws CorruptDataException {
		return new U32(getIntAtOffset(UtGlobalData._sleepTimeMillisOffset_));
	}

	// U32 sleepTimeMillis
	public UDATAPointer sleepTimeMillisEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtGlobalData._sleepTimeMillisOffset_));
	}

	// I64 snapFile
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_snapFileOffset_", declaredType="I64")
	public IDATA snapFile() throws CorruptDataException {
		return new I64(getLongAtOffset(UtGlobalData._snapFileOffset_));
	}

	// I64 snapFile
	public IDATAPointer snapFileEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtGlobalData._snapFileOffset_));
	}

	// I32 snapSequence
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_snapSequenceOffset_", declaredType="I32")
	public IDATA snapSequence() throws CorruptDataException {
		return new I32(getIntAtOffset(UtGlobalData._snapSequenceOffset_));
	}

	// I32 snapSequence
	public IDATAPointer snapSequenceEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtGlobalData._snapSequenceOffset_));
	}

	// U64 startPlatform
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_startPlatformOffset_", declaredType="U64")
	public UDATA startPlatform() throws CorruptDataException {
		return new U64(getLongAtOffset(UtGlobalData._startPlatformOffset_));
	}

	// U64 startPlatform
	public UDATAPointer startPlatformEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtGlobalData._startPlatformOffset_));
	}

	// U64 startSystem
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_startSystemOffset_", declaredType="U64")
	public UDATA startSystem() throws CorruptDataException {
		return new U64(getLongAtOffset(UtGlobalData._startSystemOffset_));
	}

	// U64 startSystem
	public UDATAPointer startSystemEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtGlobalData._startSystemOffset_));
	}

	// volatile UtSubscription* subscribers
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_subscribersOffset_", declaredType="volatile UtSubscription*")
	public UtSubscriptionPointer subscribers() throws CorruptDataException {
		return UtSubscriptionPointer.cast(getPointerAtOffset(UtGlobalData._subscribersOffset_));
	}

	// volatile UtSubscription* subscribers
	public PointerPointer subscribersEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGlobalData._subscribersOffset_));
	}

	// omrthread_monitor_t subscribersLock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_subscribersLockOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer subscribersLock() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(UtGlobalData._subscribersLockOffset_));
	}

	// omrthread_monitor_t subscribersLock
	public PointerPointer subscribersLockEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGlobalData._subscribersLockOffset_));
	}

	// volatile U32 threadCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadCountOffset_", declaredType="volatile U32")
	public UDATA threadCount() throws CorruptDataException {
		return new U32(getIntAtOffset(UtGlobalData._threadCountOffset_));
	}

	// volatile U32 threadCount
	public UDATAPointer threadCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtGlobalData._threadCountOffset_));
	}

	// omrthread_monitor_t threadLock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadLockOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer threadLock() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(UtGlobalData._threadLockOffset_));
	}

	// omrthread_monitor_t threadLock
	public PointerPointer threadLockEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGlobalData._threadLockOffset_));
	}

	// I32 traceActive
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_traceActiveOffset_", declaredType="I32")
	public IDATA traceActive() throws CorruptDataException {
		return new I32(getIntAtOffset(UtGlobalData._traceActiveOffset_));
	}

	// I32 traceActive
	public IDATAPointer traceActiveEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtGlobalData._traceActiveOffset_));
	}

	// I32 traceCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_traceCountOffset_", declaredType="I32")
	public IDATA traceCount() throws CorruptDataException {
		return new I32(getIntAtOffset(UtGlobalData._traceCountOffset_));
	}

	// I32 traceCount
	public IDATAPointer traceCountEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtGlobalData._traceCountOffset_));
	}

	// I32 traceDebug
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_traceDebugOffset_", declaredType="I32")
	public IDATA traceDebug() throws CorruptDataException {
		return new I32(getIntAtOffset(UtGlobalData._traceDebugOffset_));
	}

	// I32 traceDebug
	public IDATAPointer traceDebugEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtGlobalData._traceDebugOffset_));
	}

	// U8 traceDests
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_traceDestsOffset_", declaredType="U8")
	public U8 traceDests() throws CorruptDataException {
		return new U8(getByteAtOffset(UtGlobalData._traceDestsOffset_));
	}

	// U8 traceDests
	public U8Pointer traceDestsEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(UtGlobalData._traceDestsOffset_));
	}

	// U32 traceDisable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_traceDisableOffset_", declaredType="U32")
	public UDATA traceDisable() throws CorruptDataException {
		return new U32(getIntAtOffset(UtGlobalData._traceDisableOffset_));
	}

	// U32 traceDisable
	public UDATAPointer traceDisableEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtGlobalData._traceDisableOffset_));
	}

	// I32 traceEnabled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_traceEnabledOffset_", declaredType="I32")
	public IDATA traceEnabled() throws CorruptDataException {
		return new I32(getIntAtOffset(UtGlobalData._traceEnabledOffset_));
	}

	// I32 traceEnabled
	public IDATAPointer traceEnabledEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtGlobalData._traceEnabledOffset_));
	}

	// U8* traceFilename
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_traceFilenameOffset_", declaredType="U8*")
	public U8Pointer traceFilename() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(UtGlobalData._traceFilenameOffset_));
	}

	// U8* traceFilename
	public PointerPointer traceFilenameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGlobalData._traceFilenameOffset_));
	}

	// I32 traceFinalized
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_traceFinalizedOffset_", declaredType="I32")
	public IDATA traceFinalized() throws CorruptDataException {
		return new I32(getIntAtOffset(UtGlobalData._traceFinalizedOffset_));
	}

	// I32 traceFinalized
	public IDATAPointer traceFinalizedEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtGlobalData._traceFinalizedOffset_));
	}

	// U8* traceFormatSpec
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_traceFormatSpecOffset_", declaredType="U8*")
	public U8Pointer traceFormatSpec() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(UtGlobalData._traceFormatSpecOffset_));
	}

	// U8* traceFormatSpec
	public PointerPointer traceFormatSpecEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGlobalData._traceFormatSpecOffset_));
	}

	// I32 traceGenerations
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_traceGenerationsOffset_", declaredType="I32")
	public IDATA traceGenerations() throws CorruptDataException {
		return new I32(getIntAtOffset(UtGlobalData._traceGenerationsOffset_));
	}

	// I32 traceGenerations
	public IDATAPointer traceGenerationsEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtGlobalData._traceGenerationsOffset_));
	}

	// UtTraceBuffer* traceGlobal
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_traceGlobalOffset_", declaredType="UtTraceBuffer*")
	public UtTraceBufferPointer traceGlobal() throws CorruptDataException {
		return UtTraceBufferPointer.cast(getPointerAtOffset(UtGlobalData._traceGlobalOffset_));
	}

	// UtTraceBuffer* traceGlobal
	public PointerPointer traceGlobalEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGlobalData._traceGlobalOffset_));
	}

	// UtTraceFileHdr* traceHeader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_traceHeaderOffset_", declaredType="UtTraceFileHdr*")
	public UtTraceFileHdrPointer traceHeader() throws CorruptDataException {
		return UtTraceFileHdrPointer.cast(getPointerAtOffset(UtGlobalData._traceHeaderOffset_));
	}

	// UtTraceFileHdr* traceHeader
	public PointerPointer traceHeaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGlobalData._traceHeaderOffset_));
	}

	// I32 traceInCore
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_traceInCoreOffset_", declaredType="I32")
	public IDATA traceInCore() throws CorruptDataException {
		return new I32(getIntAtOffset(UtGlobalData._traceInCoreOffset_));
	}

	// I32 traceInCore
	public IDATAPointer traceInCoreEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtGlobalData._traceInCoreOffset_));
	}

	// I32 traceInitialized
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_traceInitializedOffset_", declaredType="I32")
	public IDATA traceInitialized() throws CorruptDataException {
		return new I32(getIntAtOffset(UtGlobalData._traceInitializedOffset_));
	}

	// I32 traceInitialized
	public IDATAPointer traceInitializedEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtGlobalData._traceInitializedOffset_));
	}

	// UtTraceListener* traceListeners
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_traceListenersOffset_", declaredType="UtTraceListener*")
	public UtTraceListenerPointer traceListeners() throws CorruptDataException {
		return UtTraceListenerPointer.cast(getPointerAtOffset(UtGlobalData._traceListenersOffset_));
	}

	// UtTraceListener* traceListeners
	public PointerPointer traceListenersEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGlobalData._traceListenersOffset_));
	}

	// omrthread_monitor_t traceLock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_traceLockOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer traceLock() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(UtGlobalData._traceLockOffset_));
	}

	// omrthread_monitor_t traceLock
	public PointerPointer traceLockEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGlobalData._traceLockOffset_));
	}

	// UtSubscription* tracePointSubscribers
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tracePointSubscribersOffset_", declaredType="UtSubscription*")
	public UtSubscriptionPointer tracePointSubscribers() throws CorruptDataException {
		return UtSubscriptionPointer.cast(getPointerAtOffset(UtGlobalData._tracePointSubscribersOffset_));
	}

	// UtSubscription* tracePointSubscribers
	public PointerPointer tracePointSubscribersEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGlobalData._tracePointSubscribersOffset_));
	}

	// volatile U32 traceSnap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_traceSnapOffset_", declaredType="volatile U32")
	public UDATA traceSnap() throws CorruptDataException {
		return new U32(getIntAtOffset(UtGlobalData._traceSnapOffset_));
	}

	// volatile U32 traceSnap
	public UDATAPointer traceSnapEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtGlobalData._traceSnapOffset_));
	}

	// U32 traceSuspend
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_traceSuspendOffset_", declaredType="U32")
	public UDATA traceSuspend() throws CorruptDataException {
		return new U32(getIntAtOffset(UtGlobalData._traceSuspendOffset_));
	}

	// U32 traceSuspend
	public UDATAPointer traceSuspendEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(UtGlobalData._traceSuspendOffset_));
	}

	// I32 traceWrap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_traceWrapOffset_", declaredType="I32")
	public IDATA traceWrap() throws CorruptDataException {
		return new I32(getIntAtOffset(UtGlobalData._traceWrapOffset_));
	}

	// I32 traceWrap
	public IDATAPointer traceWrapEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtGlobalData._traceWrapOffset_));
	}

	// I32 traceWriteStarted
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_traceWriteStartedOffset_", declaredType="I32")
	public IDATA traceWriteStarted() throws CorruptDataException {
		return new I32(getIntAtOffset(UtGlobalData._traceWriteStartedOffset_));
	}

	// I32 traceWriteStarted
	public IDATAPointer traceWriteStartedEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtGlobalData._traceWriteStartedOffset_));
	}

	// RasTriggerGroup* triggerOnGroups
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_triggerOnGroupsOffset_", declaredType="RasTriggerGroup*")
	public RasTriggerGroupPointer triggerOnGroups() throws CorruptDataException {
		return RasTriggerGroupPointer.cast(getPointerAtOffset(UtGlobalData._triggerOnGroupsOffset_));
	}

	// RasTriggerGroup* triggerOnGroups
	public PointerPointer triggerOnGroupsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGlobalData._triggerOnGroupsOffset_));
	}

	// I64 triggerOnGroupsReferenceCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_triggerOnGroupsReferenceCountOffset_", declaredType="I64")
	public IDATA triggerOnGroupsReferenceCount() throws CorruptDataException {
		return new I64(getLongAtOffset(UtGlobalData._triggerOnGroupsReferenceCountOffset_));
	}

	// I64 triggerOnGroupsReferenceCount
	public IDATAPointer triggerOnGroupsReferenceCountEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtGlobalData._triggerOnGroupsReferenceCountOffset_));
	}

	// omrthread_monitor_t triggerOnGroupsWriteMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_triggerOnGroupsWriteMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer triggerOnGroupsWriteMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(UtGlobalData._triggerOnGroupsWriteMutexOffset_));
	}

	// omrthread_monitor_t triggerOnGroupsWriteMutex
	public PointerPointer triggerOnGroupsWriteMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGlobalData._triggerOnGroupsWriteMutexOffset_));
	}

	// RasTriggerTpidRange* triggerOnTpids
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_triggerOnTpidsOffset_", declaredType="RasTriggerTpidRange*")
	public RasTriggerTpidRangePointer triggerOnTpids() throws CorruptDataException {
		return RasTriggerTpidRangePointer.cast(getPointerAtOffset(UtGlobalData._triggerOnTpidsOffset_));
	}

	// RasTriggerTpidRange* triggerOnTpids
	public PointerPointer triggerOnTpidsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGlobalData._triggerOnTpidsOffset_));
	}

	// I64 triggerOnTpidsReferenceCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_triggerOnTpidsReferenceCountOffset_", declaredType="I64")
	public IDATA triggerOnTpidsReferenceCount() throws CorruptDataException {
		return new I64(getLongAtOffset(UtGlobalData._triggerOnTpidsReferenceCountOffset_));
	}

	// I64 triggerOnTpidsReferenceCount
	public IDATAPointer triggerOnTpidsReferenceCountEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(UtGlobalData._triggerOnTpidsReferenceCountOffset_));
	}

	// omrthread_monitor_t triggerOnTpidsWriteMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_triggerOnTpidsWriteMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer triggerOnTpidsWriteMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(UtGlobalData._triggerOnTpidsWriteMutexOffset_));
	}

	// omrthread_monitor_t triggerOnTpidsWriteMutex
	public PointerPointer triggerOnTpidsWriteMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGlobalData._triggerOnTpidsWriteMutexOffset_));
	}

	// UtComponentList* unloadedComponentList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unloadedComponentListOffset_", declaredType="UtComponentList*")
	public UtComponentListPointer unloadedComponentList() throws CorruptDataException {
		return UtComponentListPointer.cast(getPointerAtOffset(UtGlobalData._unloadedComponentListOffset_));
	}

	// UtComponentList* unloadedComponentList
	public PointerPointer unloadedComponentListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGlobalData._unloadedComponentListOffset_));
	}

	// const OMR_VM* vm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmOffset_", declaredType="const OMR_VM*")
	public OMR_VMPointer vm() throws CorruptDataException {
		return OMR_VMPointer.cast(getPointerAtOffset(UtGlobalData._vmOffset_));
	}

	// const OMR_VM* vm
	public PointerPointer vmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(UtGlobalData._vmOffset_));
	}

}
