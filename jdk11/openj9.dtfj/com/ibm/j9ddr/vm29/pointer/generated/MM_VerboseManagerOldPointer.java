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
 * Structure: MM_VerboseManagerOldPointer
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
 * The generated code will provide getters for all elements in the MM_VerboseManagerOldPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_VerboseManagerOld.class)
public class MM_VerboseManagerOldPointer extends MM_VerboseManagerBasePointer {

	// NULL
	public static final MM_VerboseManagerOldPointer NULL = new MM_VerboseManagerOldPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_VerboseManagerOldPointer(long address) {
		super(address);
	}

	public static MM_VerboseManagerOldPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_VerboseManagerOldPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_VerboseManagerOldPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_VerboseManagerOldPointer(address);
	}

	public MM_VerboseManagerOldPointer add(long count) {
		return MM_VerboseManagerOldPointer.cast(address + (MM_VerboseManagerOld.SIZEOF * count));
	}

	public MM_VerboseManagerOldPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_VerboseManagerOldPointer addOffset(long offset) {
		return MM_VerboseManagerOldPointer.cast(address + offset);
	}

	public MM_VerboseManagerOldPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_VerboseManagerOldPointer sub(long count) {
		return MM_VerboseManagerOldPointer.cast(address - (MM_VerboseManagerOld.SIZEOF * count));
	}

	public MM_VerboseManagerOldPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_VerboseManagerOldPointer subOffset(long offset) {
		return MM_VerboseManagerOldPointer.cast(address - offset);
	}

	public MM_VerboseManagerOldPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_VerboseManagerOldPointer untag(long mask) {
		return MM_VerboseManagerOldPointer.cast(address & ~mask);
	}

	public MM_VerboseManagerOldPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_VerboseManagerOld.SIZEOF;
	}

	// Implementation methods

	// MM_VerboseOutputAgent* _agentChain
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__agentChainOffset_", declaredType="MM_VerboseOutputAgent*")
	public MM_VerboseOutputAgentPointer _agentChain() throws CorruptDataException {
		return MM_VerboseOutputAgentPointer.cast(getPointerAtOffset(MM_VerboseManagerOld.__agentChainOffset_));
	}

	// MM_VerboseOutputAgent* _agentChain
	public PointerPointer _agentChainEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VerboseManagerOld.__agentChainOffset_));
	}

	// MM_VerboseEventStream* _eventStream
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__eventStreamOffset_", declaredType="MM_VerboseEventStream*")
	public MM_VerboseEventStreamPointer _eventStream() throws CorruptDataException {
		return MM_VerboseEventStreamPointer.cast(getPointerAtOffset(MM_VerboseManagerOld.__eventStreamOffset_));
	}

	// MM_VerboseEventStream* _eventStream
	public PointerPointer _eventStreamEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VerboseManagerOld.__eventStreamOffset_));
	}

	// void** _mmHooks
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__mmHooksOffset_", declaredType="void**")
	public PointerPointer _mmHooks() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(MM_VerboseManagerOld.__mmHooksOffset_));
	}

	// void** _mmHooks
	public PointerPointer _mmHooksEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VerboseManagerOld.__mmHooksOffset_));
	}

	// J9JavaVM* javaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_javaVMOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer javaVM() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(MM_VerboseManagerOld._javaVMOffset_));
	}

	// J9JavaVM* javaVM
	public PointerPointer javaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VerboseManagerOld._javaVMOffset_));
	}

}
