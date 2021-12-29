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
 * Structure: GC_EnvironmentPointer
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
 * The generated code will provide getters for all elements in the GC_EnvironmentPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=GC_Environment.class)
public class GC_EnvironmentPointer extends StructurePointer {

	// NULL
	public static final GC_EnvironmentPointer NULL = new GC_EnvironmentPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected GC_EnvironmentPointer(long address) {
		super(address);
	}

	public static GC_EnvironmentPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static GC_EnvironmentPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static GC_EnvironmentPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new GC_EnvironmentPointer(address);
	}

	public GC_EnvironmentPointer add(long count) {
		return GC_EnvironmentPointer.cast(address + (GC_Environment.SIZEOF * count));
	}

	public GC_EnvironmentPointer add(Scalar count) {
		return add(count.longValue());
	}

	public GC_EnvironmentPointer addOffset(long offset) {
		return GC_EnvironmentPointer.cast(address + offset);
	}

	public GC_EnvironmentPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public GC_EnvironmentPointer sub(long count) {
		return GC_EnvironmentPointer.cast(address - (GC_Environment.SIZEOF * count));
	}

	public GC_EnvironmentPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public GC_EnvironmentPointer subOffset(long offset) {
		return GC_EnvironmentPointer.cast(address - offset);
	}

	public GC_EnvironmentPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public GC_EnvironmentPointer untag(long mask) {
		return GC_EnvironmentPointer.cast(address & ~mask);
	}

	public GC_EnvironmentPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return GC_Environment.SIZEOF;
	}

	// Implementation methods

	// MM_MarkJavaStats _markJavaStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markJavaStatsOffset_", declaredType="MM_MarkJavaStats")
	public MM_MarkJavaStatsPointer _markJavaStats() throws CorruptDataException {
		return MM_MarkJavaStatsPointer.cast(nonNullFieldEA(GC_Environment.__markJavaStatsOffset_));
	}

	// MM_MarkJavaStats _markJavaStats
	public PointerPointer _markJavaStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_Environment.__markJavaStatsOffset_));
	}

	// MM_OwnableSynchronizerObjectBuffer* _ownableSynchronizerObjectBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__ownableSynchronizerObjectBufferOffset_", declaredType="MM_OwnableSynchronizerObjectBuffer*")
	public MM_OwnableSynchronizerObjectBufferPointer _ownableSynchronizerObjectBuffer() throws CorruptDataException {
		return MM_OwnableSynchronizerObjectBufferPointer.cast(getPointerAtOffset(GC_Environment.__ownableSynchronizerObjectBufferOffset_));
	}

	// MM_OwnableSynchronizerObjectBuffer* _ownableSynchronizerObjectBuffer
	public PointerPointer _ownableSynchronizerObjectBufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_Environment.__ownableSynchronizerObjectBufferOffset_));
	}

	// MM_ReferenceObjectBuffer* _referenceObjectBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__referenceObjectBufferOffset_", declaredType="MM_ReferenceObjectBuffer*")
	public MM_ReferenceObjectBufferPointer _referenceObjectBuffer() throws CorruptDataException {
		return MM_ReferenceObjectBufferPointer.cast(getPointerAtOffset(GC_Environment.__referenceObjectBufferOffset_));
	}

	// MM_ReferenceObjectBuffer* _referenceObjectBuffer
	public PointerPointer _referenceObjectBufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_Environment.__referenceObjectBufferOffset_));
	}

	// MM_ScavengerJavaStats _scavengerJavaStats
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__scavengerJavaStatsOffset_", declaredType="MM_ScavengerJavaStats")
	public MM_ScavengerJavaStatsPointer _scavengerJavaStats() throws CorruptDataException {
		return MM_ScavengerJavaStatsPointer.cast(nonNullFieldEA(GC_Environment.__scavengerJavaStatsOffset_));
	}

	// MM_ScavengerJavaStats _scavengerJavaStats
	public PointerPointer _scavengerJavaStatsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_Environment.__scavengerJavaStatsOffset_));
	}

	// MM_UnfinalizedObjectBuffer* _unfinalizedObjectBuffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__unfinalizedObjectBufferOffset_", declaredType="MM_UnfinalizedObjectBuffer*")
	public MM_UnfinalizedObjectBufferPointer _unfinalizedObjectBuffer() throws CorruptDataException {
		return MM_UnfinalizedObjectBufferPointer.cast(getPointerAtOffset(GC_Environment.__unfinalizedObjectBufferOffset_));
	}

	// MM_UnfinalizedObjectBuffer* _unfinalizedObjectBuffer
	public PointerPointer _unfinalizedObjectBufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_Environment.__unfinalizedObjectBufferOffset_));
	}

	// GCmovedObjectHashCode movedObjectHashCodeCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_movedObjectHashCodeCacheOffset_", declaredType="GCmovedObjectHashCode")
	public GCmovedObjectHashCodePointer movedObjectHashCodeCache() throws CorruptDataException {
		return GCmovedObjectHashCodePointer.cast(nonNullFieldEA(GC_Environment._movedObjectHashCodeCacheOffset_));
	}

	// GCmovedObjectHashCode movedObjectHashCodeCache
	public PointerPointer movedObjectHashCodeCacheEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_Environment._movedObjectHashCodeCacheOffset_));
	}

}
