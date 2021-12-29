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
 * Structure: MM_VerboseOutputAgentPointer
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
 * The generated code will provide getters for all elements in the MM_VerboseOutputAgentPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_VerboseOutputAgent.class)
public class MM_VerboseOutputAgentPointer extends MM_BasePointer {

	// NULL
	public static final MM_VerboseOutputAgentPointer NULL = new MM_VerboseOutputAgentPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_VerboseOutputAgentPointer(long address) {
		super(address);
	}

	public static MM_VerboseOutputAgentPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_VerboseOutputAgentPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_VerboseOutputAgentPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_VerboseOutputAgentPointer(address);
	}

	public MM_VerboseOutputAgentPointer add(long count) {
		return MM_VerboseOutputAgentPointer.cast(address + (MM_VerboseOutputAgent.SIZEOF * count));
	}

	public MM_VerboseOutputAgentPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_VerboseOutputAgentPointer addOffset(long offset) {
		return MM_VerboseOutputAgentPointer.cast(address + offset);
	}

	public MM_VerboseOutputAgentPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_VerboseOutputAgentPointer sub(long count) {
		return MM_VerboseOutputAgentPointer.cast(address - (MM_VerboseOutputAgent.SIZEOF * count));
	}

	public MM_VerboseOutputAgentPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_VerboseOutputAgentPointer subOffset(long offset) {
		return MM_VerboseOutputAgentPointer.cast(address - offset);
	}

	public MM_VerboseOutputAgentPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_VerboseOutputAgentPointer untag(long mask) {
		return MM_VerboseOutputAgentPointer.cast(address & ~mask);
	}

	public MM_VerboseOutputAgentPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_VerboseOutputAgent.SIZEOF;
	}

	// Implementation methods

	// MM_VerboseBuffer* _buffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bufferOffset_", declaredType="MM_VerboseBuffer*")
	public MM_VerboseBufferPointer _buffer() throws CorruptDataException {
		return MM_VerboseBufferPointer.cast(getPointerAtOffset(MM_VerboseOutputAgent.__bufferOffset_));
	}

	// MM_VerboseBuffer* _buffer
	public PointerPointer _bufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VerboseOutputAgent.__bufferOffset_));
	}

	// bool _isActive
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isActiveOffset_", declaredType="bool")
	public boolean _isActive() throws CorruptDataException {
		return getBoolAtOffset(MM_VerboseOutputAgent.__isActiveOffset_);
	}

	// bool _isActive
	public BoolPointer _isActiveEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_VerboseOutputAgent.__isActiveOffset_));
	}

	// MM_VerboseOutputAgent* _nextAgent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextAgentOffset_", declaredType="MM_VerboseOutputAgent*")
	public MM_VerboseOutputAgentPointer _nextAgent() throws CorruptDataException {
		return MM_VerboseOutputAgentPointer.cast(getPointerAtOffset(MM_VerboseOutputAgent.__nextAgentOffset_));
	}

	// MM_VerboseOutputAgent* _nextAgent
	public PointerPointer _nextAgentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VerboseOutputAgent.__nextAgentOffset_));
	}

	// AgentType _type
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__typeOffset_", declaredType="AgentType")
	public long _type() throws CorruptDataException {
		if (AgentType.SIZEOF == 1) {
			return getByteAtOffset(MM_VerboseOutputAgent.__typeOffset_);
		} else if (AgentType.SIZEOF == 2) {
			return getShortAtOffset(MM_VerboseOutputAgent.__typeOffset_);
		} else if (AgentType.SIZEOF == 4) {
			return getIntAtOffset(MM_VerboseOutputAgent.__typeOffset_);
		} else if (AgentType.SIZEOF == 8) {
			return getLongAtOffset(MM_VerboseOutputAgent.__typeOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// AgentType _type
	public EnumPointer _typeEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_VerboseOutputAgent.__typeOffset_), AgentType.class);
	}

	// void** _vptr$MM_VerboseOutputAgent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__vptr$MM_VerboseOutputAgentOffset_", declaredType="void**")
	public PointerPointer _vptr$MM_VerboseOutputAgent() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(MM_VerboseOutputAgent.__vptr$MM_VerboseOutputAgentOffset_));
	}

	// void** _vptr$MM_VerboseOutputAgent
	public PointerPointer _vptr$MM_VerboseOutputAgentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VerboseOutputAgent.__vptr$MM_VerboseOutputAgentOffset_));
	}

}
