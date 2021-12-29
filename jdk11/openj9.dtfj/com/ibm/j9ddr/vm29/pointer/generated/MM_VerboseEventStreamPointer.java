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
 * Structure: MM_VerboseEventStreamPointer
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
 * The generated code will provide getters for all elements in the MM_VerboseEventStreamPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_VerboseEventStream.class)
public class MM_VerboseEventStreamPointer extends MM_BasePointer {

	// NULL
	public static final MM_VerboseEventStreamPointer NULL = new MM_VerboseEventStreamPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_VerboseEventStreamPointer(long address) {
		super(address);
	}

	public static MM_VerboseEventStreamPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_VerboseEventStreamPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_VerboseEventStreamPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_VerboseEventStreamPointer(address);
	}

	public MM_VerboseEventStreamPointer add(long count) {
		return MM_VerboseEventStreamPointer.cast(address + (MM_VerboseEventStream.SIZEOF * count));
	}

	public MM_VerboseEventStreamPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_VerboseEventStreamPointer addOffset(long offset) {
		return MM_VerboseEventStreamPointer.cast(address + offset);
	}

	public MM_VerboseEventStreamPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_VerboseEventStreamPointer sub(long count) {
		return MM_VerboseEventStreamPointer.cast(address - (MM_VerboseEventStream.SIZEOF * count));
	}

	public MM_VerboseEventStreamPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_VerboseEventStreamPointer subOffset(long offset) {
		return MM_VerboseEventStreamPointer.cast(address - offset);
	}

	public MM_VerboseEventStreamPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_VerboseEventStreamPointer untag(long mask) {
		return MM_VerboseEventStreamPointer.cast(address & ~mask);
	}

	public MM_VerboseEventStreamPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_VerboseEventStream.SIZEOF;
	}

	// Implementation methods

	// bool _disposable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__disposableOffset_", declaredType="bool")
	public boolean _disposable() throws CorruptDataException {
		return getBoolAtOffset(MM_VerboseEventStream.__disposableOffset_);
	}

	// bool _disposable
	public BoolPointer _disposableEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_VerboseEventStream.__disposableOffset_));
	}

	// MM_VerboseEvent* _eventChain
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__eventChainOffset_", declaredType="MM_VerboseEvent*")
	public MM_VerboseEventPointer _eventChain() throws CorruptDataException {
		return MM_VerboseEventPointer.cast(getPointerAtOffset(MM_VerboseEventStream.__eventChainOffset_));
	}

	// MM_VerboseEvent* _eventChain
	public PointerPointer _eventChainEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VerboseEventStream.__eventChainOffset_));
	}

	// volatile MM_VerboseEvent* _eventChainTail
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__eventChainTailOffset_", declaredType="volatile MM_VerboseEvent*")
	public MM_VerboseEventPointer _eventChainTail() throws CorruptDataException {
		return MM_VerboseEventPointer.cast(getPointerAtOffset(MM_VerboseEventStream.__eventChainTailOffset_));
	}

	// volatile MM_VerboseEvent* _eventChainTail
	public PointerPointer _eventChainTailEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VerboseEventStream.__eventChainTailOffset_));
	}

	// J9JavaVM* _javaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__javaVMOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer _javaVM() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(MM_VerboseEventStream.__javaVMOffset_));
	}

	// J9JavaVM* _javaVM
	public PointerPointer _javaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VerboseEventStream.__javaVMOffset_));
	}

	// MM_VerboseManagerOld* _manager
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__managerOffset_", declaredType="MM_VerboseManagerOld*")
	public MM_VerboseManagerOldPointer _manager() throws CorruptDataException {
		return MM_VerboseManagerOldPointer.cast(getPointerAtOffset(MM_VerboseEventStream.__managerOffset_));
	}

	// MM_VerboseManagerOld* _manager
	public PointerPointer _managerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VerboseEventStream.__managerOffset_));
	}

	// void** _vptr$MM_VerboseEventStream
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__vptr$MM_VerboseEventStreamOffset_", declaredType="void**")
	public PointerPointer _vptr$MM_VerboseEventStream() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(MM_VerboseEventStream.__vptr$MM_VerboseEventStreamOffset_));
	}

	// void** _vptr$MM_VerboseEventStream
	public PointerPointer _vptr$MM_VerboseEventStreamEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VerboseEventStream.__vptr$MM_VerboseEventStreamOffset_));
	}

}
