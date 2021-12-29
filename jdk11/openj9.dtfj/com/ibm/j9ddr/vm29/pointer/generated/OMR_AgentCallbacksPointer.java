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
 * Structure: OMR_AgentCallbacksPointer
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
 * The generated code will provide getters for all elements in the OMR_AgentCallbacksPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=OMR_AgentCallbacks.class)
public class OMR_AgentCallbacksPointer extends StructurePointer {

	// NULL
	public static final OMR_AgentCallbacksPointer NULL = new OMR_AgentCallbacksPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected OMR_AgentCallbacksPointer(long address) {
		super(address);
	}

	public static OMR_AgentCallbacksPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static OMR_AgentCallbacksPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static OMR_AgentCallbacksPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new OMR_AgentCallbacksPointer(address);
	}

	public OMR_AgentCallbacksPointer add(long count) {
		return OMR_AgentCallbacksPointer.cast(address + (OMR_AgentCallbacks.SIZEOF * count));
	}

	public OMR_AgentCallbacksPointer add(Scalar count) {
		return add(count.longValue());
	}

	public OMR_AgentCallbacksPointer addOffset(long offset) {
		return OMR_AgentCallbacksPointer.cast(address + offset);
	}

	public OMR_AgentCallbacksPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public OMR_AgentCallbacksPointer sub(long count) {
		return OMR_AgentCallbacksPointer.cast(address - (OMR_AgentCallbacks.SIZEOF * count));
	}

	public OMR_AgentCallbacksPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public OMR_AgentCallbacksPointer subOffset(long offset) {
		return OMR_AgentCallbacksPointer.cast(address - offset);
	}

	public OMR_AgentCallbacksPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public OMR_AgentCallbacksPointer untag(long mask) {
		return OMR_AgentCallbacksPointer.cast(address & ~mask);
	}

	public OMR_AgentCallbacksPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return OMR_AgentCallbacks.SIZEOF;
	}

	// Implementation methods

	// void* onPostForkChild
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_onPostForkChildOffset_", declaredType="void*")
	public VoidPointer onPostForkChild() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMR_AgentCallbacks._onPostForkChildOffset_));
	}

	// void* onPostForkChild
	public PointerPointer onPostForkChildEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_AgentCallbacks._onPostForkChildOffset_));
	}

	// void* onPostForkParent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_onPostForkParentOffset_", declaredType="void*")
	public VoidPointer onPostForkParent() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMR_AgentCallbacks._onPostForkParentOffset_));
	}

	// void* onPostForkParent
	public PointerPointer onPostForkParentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_AgentCallbacks._onPostForkParentOffset_));
	}

	// void* onPreFork
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_onPreForkOffset_", declaredType="void*")
	public VoidPointer onPreFork() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMR_AgentCallbacks._onPreForkOffset_));
	}

	// void* onPreFork
	public PointerPointer onPreForkEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_AgentCallbacks._onPreForkOffset_));
	}

	// U32 version
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_versionOffset_", declaredType="U32")
	public UDATA version() throws CorruptDataException {
		return new U32(getIntAtOffset(OMR_AgentCallbacks._versionOffset_));
	}

	// U32 version
	public UDATAPointer versionEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMR_AgentCallbacks._versionOffset_));
	}

}
