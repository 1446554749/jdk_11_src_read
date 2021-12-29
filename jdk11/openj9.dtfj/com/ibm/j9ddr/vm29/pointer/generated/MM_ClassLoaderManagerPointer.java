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
 * Structure: MM_ClassLoaderManagerPointer
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
 * The generated code will provide getters for all elements in the MM_ClassLoaderManagerPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ClassLoaderManager.class)
public class MM_ClassLoaderManagerPointer extends MM_BaseNonVirtualPointer {

	// NULL
	public static final MM_ClassLoaderManagerPointer NULL = new MM_ClassLoaderManagerPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ClassLoaderManagerPointer(long address) {
		super(address);
	}

	public static MM_ClassLoaderManagerPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ClassLoaderManagerPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ClassLoaderManagerPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ClassLoaderManagerPointer(address);
	}

	public MM_ClassLoaderManagerPointer add(long count) {
		return MM_ClassLoaderManagerPointer.cast(address + (MM_ClassLoaderManager.SIZEOF * count));
	}

	public MM_ClassLoaderManagerPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ClassLoaderManagerPointer addOffset(long offset) {
		return MM_ClassLoaderManagerPointer.cast(address + offset);
	}

	public MM_ClassLoaderManagerPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ClassLoaderManagerPointer sub(long count) {
		return MM_ClassLoaderManagerPointer.cast(address - (MM_ClassLoaderManager.SIZEOF * count));
	}

	public MM_ClassLoaderManagerPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ClassLoaderManagerPointer subOffset(long offset) {
		return MM_ClassLoaderManagerPointer.cast(address - offset);
	}

	public MM_ClassLoaderManagerPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ClassLoaderManagerPointer untag(long mask) {
		return MM_ClassLoaderManagerPointer.cast(address & ~mask);
	}

	public MM_ClassLoaderManagerPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ClassLoaderManager.SIZEOF;
	}

	// Implementation methods

	// omrthread_monitor_t _classLoaderListMonitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classLoaderListMonitorOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _classLoaderListMonitor() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(MM_ClassLoaderManager.__classLoaderListMonitorOffset_));
	}

	// omrthread_monitor_t _classLoaderListMonitor
	public PointerPointer _classLoaderListMonitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ClassLoaderManager.__classLoaderListMonitorOffset_));
	}

	// J9ClassLoader* _classLoaders
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classLoadersOffset_", declaredType="J9ClassLoader*")
	public J9ClassLoaderPointer _classLoaders() throws CorruptDataException {
		return J9ClassLoaderPointer.cast(getPointerAtOffset(MM_ClassLoaderManager.__classLoadersOffset_));
	}

	// J9ClassLoader* _classLoaders
	public PointerPointer _classLoadersEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ClassLoaderManager.__classLoadersOffset_));
	}

	// MM_GCExtensions* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensions*")
	public MM_GCExtensionsPointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsPointer.cast(getPointerAtOffset(MM_ClassLoaderManager.__extensionsOffset_));
	}

	// MM_GCExtensions* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ClassLoaderManager.__extensionsOffset_));
	}

	// J9MemorySegment* _firstUndeadSegment
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__firstUndeadSegmentOffset_", declaredType="J9MemorySegment*")
	public J9MemorySegmentPointer _firstUndeadSegment() throws CorruptDataException {
		return J9MemorySegmentPointer.cast(getPointerAtOffset(MM_ClassLoaderManager.__firstUndeadSegmentOffset_));
	}

	// J9MemorySegment* _firstUndeadSegment
	public PointerPointer _firstUndeadSegmentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ClassLoaderManager.__firstUndeadSegmentOffset_));
	}

	// MM_GlobalCollector* _globalCollector
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__globalCollectorOffset_", declaredType="MM_GlobalCollector*")
	public MM_GlobalCollectorPointer _globalCollector() throws CorruptDataException {
		return MM_GlobalCollectorPointer.cast(getPointerAtOffset(MM_ClassLoaderManager.__globalCollectorOffset_));
	}

	// MM_GlobalCollector* _globalCollector
	public PointerPointer _globalCollectorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ClassLoaderManager.__globalCollectorOffset_));
	}

	// J9JavaVM* _javaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__javaVMOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer _javaVM() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(MM_ClassLoaderManager.__javaVMOffset_));
	}

	// J9JavaVM* _javaVM
	public PointerPointer _javaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ClassLoaderManager.__javaVMOffset_));
	}

	// UDATA _lastUnloadNumOfAnonymousClasses
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastUnloadNumOfAnonymousClassesOffset_", declaredType="UDATA")
	public UDATA _lastUnloadNumOfAnonymousClasses() throws CorruptDataException {
		return getUDATAAtOffset(MM_ClassLoaderManager.__lastUnloadNumOfAnonymousClassesOffset_);
	}

	// UDATA _lastUnloadNumOfAnonymousClasses
	public UDATAPointer _lastUnloadNumOfAnonymousClassesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ClassLoaderManager.__lastUnloadNumOfAnonymousClassesOffset_));
	}

	// UDATA _lastUnloadNumOfClassLoaders
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lastUnloadNumOfClassLoadersOffset_", declaredType="UDATA")
	public UDATA _lastUnloadNumOfClassLoaders() throws CorruptDataException {
		return getUDATAAtOffset(MM_ClassLoaderManager.__lastUnloadNumOfClassLoadersOffset_);
	}

	// UDATA _lastUnloadNumOfClassLoaders
	public UDATAPointer _lastUnloadNumOfClassLoadersEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ClassLoaderManager.__lastUnloadNumOfClassLoadersOffset_));
	}

	// omrthread_monitor_t _undeadSegmentListMonitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__undeadSegmentListMonitorOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _undeadSegmentListMonitor() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(MM_ClassLoaderManager.__undeadSegmentListMonitorOffset_));
	}

	// omrthread_monitor_t _undeadSegmentListMonitor
	public PointerPointer _undeadSegmentListMonitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ClassLoaderManager.__undeadSegmentListMonitorOffset_));
	}

	// UDATA _undeadSegmentsTotalSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__undeadSegmentsTotalSizeOffset_", declaredType="UDATA")
	public UDATA _undeadSegmentsTotalSize() throws CorruptDataException {
		return getUDATAAtOffset(MM_ClassLoaderManager.__undeadSegmentsTotalSizeOffset_);
	}

	// UDATA _undeadSegmentsTotalSize
	public UDATAPointer _undeadSegmentsTotalSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_ClassLoaderManager.__undeadSegmentsTotalSizeOffset_));
	}

}
