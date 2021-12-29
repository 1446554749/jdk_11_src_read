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
 * Structure: GC_FinalizableReferenceBufferPointer
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
 * The generated code will provide getters for all elements in the GC_FinalizableReferenceBufferPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=GC_FinalizableReferenceBuffer.class)
public class GC_FinalizableReferenceBufferPointer extends StructurePointer {

	// NULL
	public static final GC_FinalizableReferenceBufferPointer NULL = new GC_FinalizableReferenceBufferPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected GC_FinalizableReferenceBufferPointer(long address) {
		super(address);
	}

	public static GC_FinalizableReferenceBufferPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static GC_FinalizableReferenceBufferPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static GC_FinalizableReferenceBufferPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new GC_FinalizableReferenceBufferPointer(address);
	}

	public GC_FinalizableReferenceBufferPointer add(long count) {
		return GC_FinalizableReferenceBufferPointer.cast(address + (GC_FinalizableReferenceBuffer.SIZEOF * count));
	}

	public GC_FinalizableReferenceBufferPointer add(Scalar count) {
		return add(count.longValue());
	}

	public GC_FinalizableReferenceBufferPointer addOffset(long offset) {
		return GC_FinalizableReferenceBufferPointer.cast(address + offset);
	}

	public GC_FinalizableReferenceBufferPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public GC_FinalizableReferenceBufferPointer sub(long count) {
		return GC_FinalizableReferenceBufferPointer.cast(address - (GC_FinalizableReferenceBuffer.SIZEOF * count));
	}

	public GC_FinalizableReferenceBufferPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public GC_FinalizableReferenceBufferPointer subOffset(long offset) {
		return GC_FinalizableReferenceBufferPointer.cast(address - offset);
	}

	public GC_FinalizableReferenceBufferPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public GC_FinalizableReferenceBufferPointer untag(long mask) {
		return GC_FinalizableReferenceBufferPointer.cast(address & ~mask);
	}

	public GC_FinalizableReferenceBufferPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return GC_FinalizableReferenceBuffer.SIZEOF;
	}

	// Implementation methods

	// UDATA _count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__countOffset_", declaredType="UDATA")
	public UDATA _count() throws CorruptDataException {
		return getUDATAAtOffset(GC_FinalizableReferenceBuffer.__countOffset_);
	}

	// UDATA _count
	public UDATAPointer _countEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(GC_FinalizableReferenceBuffer.__countOffset_));
	}

	// const MM_GCExtensions* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="const MM_GCExtensions*")
	public MM_GCExtensionsPointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsPointer.cast(getPointerAtOffset(GC_FinalizableReferenceBuffer.__extensionsOffset_));
	}

	// const MM_GCExtensions* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_FinalizableReferenceBuffer.__extensionsOffset_));
	}

	// j9object_t _head
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__headOffset_", declaredType="j9object_t")
	public J9ObjectPointer _head() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(GC_FinalizableReferenceBuffer.__headOffset_));
	}

	// j9object_t _head
	public PointerPointer _headEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_FinalizableReferenceBuffer.__headOffset_));
	}

	// j9object_t _tail
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tailOffset_", declaredType="j9object_t")
	public J9ObjectPointer _tail() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(GC_FinalizableReferenceBuffer.__tailOffset_));
	}

	// j9object_t _tail
	public PointerPointer _tailEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_FinalizableReferenceBuffer.__tailOffset_));
	}

}