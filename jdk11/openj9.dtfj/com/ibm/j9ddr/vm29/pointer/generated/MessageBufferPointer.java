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
 * Structure: MessageBufferPointer
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
 * The generated code will provide getters for all elements in the MessageBufferPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MessageBuffer.class)
public class MessageBufferPointer extends StructurePointer {

	// NULL
	public static final MessageBufferPointer NULL = new MessageBufferPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MessageBufferPointer(long address) {
		super(address);
	}

	public static MessageBufferPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MessageBufferPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MessageBufferPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MessageBufferPointer(address);
	}

	public MessageBufferPointer add(long count) {
		return MessageBufferPointer.cast(address + (MessageBuffer.SIZEOF * count));
	}

	public MessageBufferPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MessageBufferPointer addOffset(long offset) {
		return MessageBufferPointer.cast(address + offset);
	}

	public MessageBufferPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MessageBufferPointer sub(long count) {
		return MessageBufferPointer.cast(address - (MessageBuffer.SIZEOF * count));
	}

	public MessageBufferPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MessageBufferPointer subOffset(long offset) {
		return MessageBufferPointer.cast(address - offset);
	}

	public MessageBufferPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MessageBufferPointer untag(long mask) {
		return MessageBufferPointer.cast(address & ~mask);
	}

	public MessageBufferPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MessageBuffer.SIZEOF;
	}

	// Implementation methods

	// U8* _bufOnStack
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__bufOnStackOffset_", declaredType="U8*")
	public U8Pointer _bufOnStack() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(MessageBuffer.__bufOnStackOffset_));
	}

	// U8* _bufOnStack
	public PointerPointer _bufOnStackEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MessageBuffer.__bufOnStackOffset_));
	}

	// BOOLEAN bufEmpty
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bufEmptyOffset_", declaredType="BOOLEAN")
	public UDATA bufEmpty() throws CorruptDataException {
		return new U32(getIntAtOffset(MessageBuffer._bufEmptyOffset_));
	}

	// BOOLEAN bufEmpty
	public UDATAPointer bufEmptyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MessageBuffer._bufEmptyOffset_));
	}

	// U8* buffer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bufferOffset_", declaredType="U8*")
	public U8Pointer buffer() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(MessageBuffer._bufferOffset_));
	}

	// U8* buffer
	public PointerPointer bufferEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MessageBuffer._bufferOffset_));
	}

	// UDATA cursor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cursorOffset_", declaredType="UDATA")
	public UDATA cursor() throws CorruptDataException {
		return getUDATAAtOffset(MessageBuffer._cursorOffset_);
	}

	// UDATA cursor
	public UDATAPointer cursorEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MessageBuffer._cursorOffset_));
	}

	// J9PortLibrary* portLib
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_portLibOffset_", declaredType="J9PortLibrary*")
	public J9PortLibraryPointer portLib() throws CorruptDataException {
		return J9PortLibraryPointer.cast(getPointerAtOffset(MessageBuffer._portLibOffset_));
	}

	// J9PortLibrary* portLib
	public PointerPointer portLibEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MessageBuffer._portLibOffset_));
	}

	// UDATA size
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sizeOffset_", declaredType="UDATA")
	public UDATA size() throws CorruptDataException {
		return getUDATAAtOffset(MessageBuffer._sizeOffset_);
	}

	// UDATA size
	public UDATAPointer sizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MessageBuffer._sizeOffset_));
	}

}
