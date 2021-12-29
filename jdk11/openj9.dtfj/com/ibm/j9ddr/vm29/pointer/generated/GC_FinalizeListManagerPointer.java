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
 * Structure: GC_FinalizeListManagerPointer
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
 * The generated code will provide getters for all elements in the GC_FinalizeListManagerPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=GC_FinalizeListManager.class)
public class GC_FinalizeListManagerPointer extends MM_BaseVirtualPointer {

	// NULL
	public static final GC_FinalizeListManagerPointer NULL = new GC_FinalizeListManagerPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected GC_FinalizeListManagerPointer(long address) {
		super(address);
	}

	public static GC_FinalizeListManagerPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static GC_FinalizeListManagerPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static GC_FinalizeListManagerPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new GC_FinalizeListManagerPointer(address);
	}

	public GC_FinalizeListManagerPointer add(long count) {
		return GC_FinalizeListManagerPointer.cast(address + (GC_FinalizeListManager.SIZEOF * count));
	}

	public GC_FinalizeListManagerPointer add(Scalar count) {
		return add(count.longValue());
	}

	public GC_FinalizeListManagerPointer addOffset(long offset) {
		return GC_FinalizeListManagerPointer.cast(address + offset);
	}

	public GC_FinalizeListManagerPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public GC_FinalizeListManagerPointer sub(long count) {
		return GC_FinalizeListManagerPointer.cast(address - (GC_FinalizeListManager.SIZEOF * count));
	}

	public GC_FinalizeListManagerPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public GC_FinalizeListManagerPointer subOffset(long offset) {
		return GC_FinalizeListManagerPointer.cast(address - offset);
	}

	public GC_FinalizeListManagerPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public GC_FinalizeListManagerPointer untag(long mask) {
		return GC_FinalizeListManagerPointer.cast(address & ~mask);
	}

	public GC_FinalizeListManagerPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return GC_FinalizeListManager.SIZEOF;
	}

	// Implementation methods

	// UDATA _classLoaderCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classLoaderCountOffset_", declaredType="UDATA")
	public UDATA _classLoaderCount() throws CorruptDataException {
		return getUDATAAtOffset(GC_FinalizeListManager.__classLoaderCountOffset_);
	}

	// UDATA _classLoaderCount
	public UDATAPointer _classLoaderCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_FinalizeListManager.__classLoaderCountOffset_));
	}

	// J9ClassLoader* _classLoaders
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classLoadersOffset_", declaredType="J9ClassLoader*")
	public J9ClassLoaderPointer _classLoaders() throws CorruptDataException {
		return J9ClassLoaderPointer.cast(getPointerAtOffset(GC_FinalizeListManager.__classLoadersOffset_));
	}

	// J9ClassLoader* _classLoaders
	public PointerPointer _classLoadersEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_FinalizeListManager.__classLoadersOffset_));
	}

	// UDATA _defaultFinalizableObjectCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__defaultFinalizableObjectCountOffset_", declaredType="UDATA")
	public UDATA _defaultFinalizableObjectCount() throws CorruptDataException {
		return getUDATAAtOffset(GC_FinalizeListManager.__defaultFinalizableObjectCountOffset_);
	}

	// UDATA _defaultFinalizableObjectCount
	public UDATAPointer _defaultFinalizableObjectCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_FinalizeListManager.__defaultFinalizableObjectCountOffset_));
	}

	// j9object_t _defaultFinalizableObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__defaultFinalizableObjectsOffset_", declaredType="j9object_t")
	public J9ObjectPointer _defaultFinalizableObjects() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(GC_FinalizeListManager.__defaultFinalizableObjectsOffset_));
	}

	// j9object_t _defaultFinalizableObjects
	public PointerPointer _defaultFinalizableObjectsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_FinalizeListManager.__defaultFinalizableObjectsOffset_));
	}

	// MM_GCExtensions* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensions*")
	public MM_GCExtensionsPointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsPointer.cast(getPointerAtOffset(GC_FinalizeListManager.__extensionsOffset_));
	}

	// MM_GCExtensions* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_FinalizeListManager.__extensionsOffset_));
	}

	// omrthread_monitor_t _mutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__mutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _mutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(GC_FinalizeListManager.__mutexOffset_));
	}

	// omrthread_monitor_t _mutex
	public PointerPointer _mutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_FinalizeListManager.__mutexOffset_));
	}

	// UDATA _referenceObjectCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__referenceObjectCountOffset_", declaredType="UDATA")
	public UDATA _referenceObjectCount() throws CorruptDataException {
		return getUDATAAtOffset(GC_FinalizeListManager.__referenceObjectCountOffset_);
	}

	// UDATA _referenceObjectCount
	public UDATAPointer _referenceObjectCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_FinalizeListManager.__referenceObjectCountOffset_));
	}

	// j9object_t _referenceObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__referenceObjectsOffset_", declaredType="j9object_t")
	public J9ObjectPointer _referenceObjects() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(GC_FinalizeListManager.__referenceObjectsOffset_));
	}

	// j9object_t _referenceObjects
	public PointerPointer _referenceObjectsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_FinalizeListManager.__referenceObjectsOffset_));
	}

	// UDATA _systemFinalizableObjectCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__systemFinalizableObjectCountOffset_", declaredType="UDATA")
	public UDATA _systemFinalizableObjectCount() throws CorruptDataException {
		return getUDATAAtOffset(GC_FinalizeListManager.__systemFinalizableObjectCountOffset_);
	}

	// UDATA _systemFinalizableObjectCount
	public UDATAPointer _systemFinalizableObjectCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_FinalizeListManager.__systemFinalizableObjectCountOffset_));
	}

	// j9object_t _systemFinalizableObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__systemFinalizableObjectsOffset_", declaredType="j9object_t")
	public J9ObjectPointer _systemFinalizableObjects() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(GC_FinalizeListManager.__systemFinalizableObjectsOffset_));
	}

	// j9object_t _systemFinalizableObjects
	public PointerPointer _systemFinalizableObjectsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_FinalizeListManager.__systemFinalizableObjectsOffset_));
	}

}
