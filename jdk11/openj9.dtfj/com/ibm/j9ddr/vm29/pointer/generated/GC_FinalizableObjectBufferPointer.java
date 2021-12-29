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
 * Structure: GC_FinalizableObjectBufferPointer
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
 * The generated code will provide getters for all elements in the GC_FinalizableObjectBufferPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=GC_FinalizableObjectBuffer.class)
public class GC_FinalizableObjectBufferPointer extends StructurePointer {

	// NULL
	public static final GC_FinalizableObjectBufferPointer NULL = new GC_FinalizableObjectBufferPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected GC_FinalizableObjectBufferPointer(long address) {
		super(address);
	}

	public static GC_FinalizableObjectBufferPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static GC_FinalizableObjectBufferPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static GC_FinalizableObjectBufferPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new GC_FinalizableObjectBufferPointer(address);
	}

	public GC_FinalizableObjectBufferPointer add(long count) {
		return GC_FinalizableObjectBufferPointer.cast(address + (GC_FinalizableObjectBuffer.SIZEOF * count));
	}

	public GC_FinalizableObjectBufferPointer add(Scalar count) {
		return add(count.longValue());
	}

	public GC_FinalizableObjectBufferPointer addOffset(long offset) {
		return GC_FinalizableObjectBufferPointer.cast(address + offset);
	}

	public GC_FinalizableObjectBufferPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public GC_FinalizableObjectBufferPointer sub(long count) {
		return GC_FinalizableObjectBufferPointer.cast(address - (GC_FinalizableObjectBuffer.SIZEOF * count));
	}

	public GC_FinalizableObjectBufferPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public GC_FinalizableObjectBufferPointer subOffset(long offset) {
		return GC_FinalizableObjectBufferPointer.cast(address - offset);
	}

	public GC_FinalizableObjectBufferPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public GC_FinalizableObjectBufferPointer untag(long mask) {
		return GC_FinalizableObjectBufferPointer.cast(address & ~mask);
	}

	public GC_FinalizableObjectBufferPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return GC_FinalizableObjectBuffer.SIZEOF;
	}

	// Implementation methods

	// j9object_t _defaultHead
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__defaultHeadOffset_", declaredType="j9object_t")
	public J9ObjectPointer _defaultHead() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(GC_FinalizableObjectBuffer.__defaultHeadOffset_));
	}

	// j9object_t _defaultHead
	public PointerPointer _defaultHeadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_FinalizableObjectBuffer.__defaultHeadOffset_));
	}

	// UDATA _defaultObjectCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__defaultObjectCountOffset_", declaredType="UDATA")
	public UDATA _defaultObjectCount() throws CorruptDataException {
		return getUDATAAtOffset(GC_FinalizableObjectBuffer.__defaultObjectCountOffset_);
	}

	// UDATA _defaultObjectCount
	public UDATAPointer _defaultObjectCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_FinalizableObjectBuffer.__defaultObjectCountOffset_));
	}

	// j9object_t _defaultTail
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__defaultTailOffset_", declaredType="j9object_t")
	public J9ObjectPointer _defaultTail() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(GC_FinalizableObjectBuffer.__defaultTailOffset_));
	}

	// j9object_t _defaultTail
	public PointerPointer _defaultTailEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_FinalizableObjectBuffer.__defaultTailOffset_));
	}

	// const MM_GCExtensions* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="const MM_GCExtensions*")
	public MM_GCExtensionsPointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsPointer.cast(getPointerAtOffset(GC_FinalizableObjectBuffer.__extensionsOffset_));
	}

	// const MM_GCExtensions* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_FinalizableObjectBuffer.__extensionsOffset_));
	}

	// const J9ClassLoader* _systemClassLoader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__systemClassLoaderOffset_", declaredType="const J9ClassLoader*")
	public J9ClassLoaderPointer _systemClassLoader() throws CorruptDataException {
		return J9ClassLoaderPointer.cast(getPointerAtOffset(GC_FinalizableObjectBuffer.__systemClassLoaderOffset_));
	}

	// const J9ClassLoader* _systemClassLoader
	public PointerPointer _systemClassLoaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_FinalizableObjectBuffer.__systemClassLoaderOffset_));
	}

	// j9object_t _systemHead
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__systemHeadOffset_", declaredType="j9object_t")
	public J9ObjectPointer _systemHead() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(GC_FinalizableObjectBuffer.__systemHeadOffset_));
	}

	// j9object_t _systemHead
	public PointerPointer _systemHeadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_FinalizableObjectBuffer.__systemHeadOffset_));
	}

	// UDATA _systemObjectCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__systemObjectCountOffset_", declaredType="UDATA")
	public UDATA _systemObjectCount() throws CorruptDataException {
		return getUDATAAtOffset(GC_FinalizableObjectBuffer.__systemObjectCountOffset_);
	}

	// UDATA _systemObjectCount
	public UDATAPointer _systemObjectCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_FinalizableObjectBuffer.__systemObjectCountOffset_));
	}

	// j9object_t _systemTail
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__systemTailOffset_", declaredType="j9object_t")
	public J9ObjectPointer _systemTail() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(GC_FinalizableObjectBuffer.__systemTailOffset_));
	}

	// j9object_t _systemTail
	public PointerPointer _systemTailEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_FinalizableObjectBuffer.__systemTailOffset_));
	}

	// void** _vptr$GC_FinalizableObjectBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__vptr$GC_FinalizableObjectBufferOffset_", declaredType="void**")
	public PointerPointer _vptr$GC_FinalizableObjectBuffer() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(GC_FinalizableObjectBuffer.__vptr$GC_FinalizableObjectBufferOffset_));
	}

	// void** _vptr$GC_FinalizableObjectBuffer
	public PointerPointer _vptr$GC_FinalizableObjectBufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_FinalizableObjectBuffer.__vptr$GC_FinalizableObjectBufferOffset_));
	}

}
