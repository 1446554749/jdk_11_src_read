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
 * Structure: OMR_AgentPointer
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
 * The generated code will provide getters for all elements in the OMR_AgentPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=OMR_Agent.class)
public class OMR_AgentPointer extends StructurePointer {

	// NULL
	public static final OMR_AgentPointer NULL = new OMR_AgentPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected OMR_AgentPointer(long address) {
		super(address);
	}

	public static OMR_AgentPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static OMR_AgentPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static OMR_AgentPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new OMR_AgentPointer(address);
	}

	public OMR_AgentPointer add(long count) {
		return OMR_AgentPointer.cast(address + (OMR_Agent.SIZEOF * count));
	}

	public OMR_AgentPointer add(Scalar count) {
		return add(count.longValue());
	}

	public OMR_AgentPointer addOffset(long offset) {
		return OMR_AgentPointer.cast(address + offset);
	}

	public OMR_AgentPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public OMR_AgentPointer sub(long count) {
		return OMR_AgentPointer.cast(address - (OMR_Agent.SIZEOF * count));
	}

	public OMR_AgentPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public OMR_AgentPointer subOffset(long offset) {
		return OMR_AgentPointer.cast(address - offset);
	}

	public OMR_AgentPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public OMR_AgentPointer untag(long mask) {
		return OMR_AgentPointer.cast(address & ~mask);
	}

	public OMR_AgentPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return OMR_Agent.SIZEOF;
	}

	// Implementation methods

	// OMR_AgentCallbacks _agentCallbacks
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__agentCallbacksOffset_", declaredType="OMR_AgentCallbacks")
	public OMR_AgentCallbacksPointer _agentCallbacks() throws CorruptDataException {
		return OMR_AgentCallbacksPointer.cast(nonNullFieldEA(OMR_Agent.__agentCallbacksOffset_));
	}

	// OMR_AgentCallbacks _agentCallbacks
	public PointerPointer _agentCallbacksEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_Agent.__agentCallbacksOffset_));
	}

	// const U8* _dllpath
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__dllpathOffset_", declaredType="const U8*")
	public U8Pointer _dllpath() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(OMR_Agent.__dllpathOffset_));
	}

	// const U8* _dllpath
	public PointerPointer _dllpathEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_Agent.__dllpathOffset_));
	}

	// U64 _handle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__handleOffset_", declaredType="U64")
	public UDATA _handle() throws CorruptDataException {
		return new U64(getLongAtOffset(OMR_Agent.__handleOffset_));
	}

	// U64 _handle
	public UDATAPointer _handleEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMR_Agent.__handleOffset_));
	}

	// onloadfunc_t _onload
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__onloadOffset_", declaredType="onloadfunc_t")
	public VoidPointer _onload() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMR_Agent.__onloadOffset_));
	}

	// onloadfunc_t _onload
	public PointerPointer _onloadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_Agent.__onloadOffset_));
	}

	// onunloadfunc_t _onunload
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__onunloadOffset_", declaredType="onunloadfunc_t")
	public VoidPointer _onunload() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(OMR_Agent.__onunloadOffset_));
	}

	// onunloadfunc_t _onunload
	public PointerPointer _onunloadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_Agent.__onunloadOffset_));
	}

	// const U8* _options
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__optionsOffset_", declaredType="const U8*")
	public U8Pointer _options() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(OMR_Agent.__optionsOffset_));
	}

	// const U8* _options
	public PointerPointer _optionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_Agent.__optionsOffset_));
	}

	// OMR_Agent$State _state
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__stateOffset_", declaredType="OMR_Agent$State")
	public long _state() throws CorruptDataException {
		if (OMR_Agent$State.SIZEOF == 1) {
			return getByteAtOffset(OMR_Agent.__stateOffset_);
		} else if (OMR_Agent$State.SIZEOF == 2) {
			return getShortAtOffset(OMR_Agent.__stateOffset_);
		} else if (OMR_Agent$State.SIZEOF == 4) {
			return getIntAtOffset(OMR_Agent.__stateOffset_);
		} else if (OMR_Agent$State.SIZEOF == 8) {
			return getLongAtOffset(OMR_Agent.__stateOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// OMR_Agent$State _state
	public EnumPointer _stateEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(OMR_Agent.__stateOffset_), OMR_Agent$State.class);
	}

	// OMR_VM* _vm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__vmOffset_", declaredType="OMR_VM*")
	public OMR_VMPointer _vm() throws CorruptDataException {
		return OMR_VMPointer.cast(getPointerAtOffset(OMR_Agent.__vmOffset_));
	}

	// OMR_VM* _vm
	public PointerPointer _vmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_Agent.__vmOffset_));
	}

}
