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
 * Structure: MM_VerboseWriterPointer
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
 * The generated code will provide getters for all elements in the MM_VerboseWriterPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_VerboseWriter.class)
public class MM_VerboseWriterPointer extends MM_BasePointer {

	// NULL
	public static final MM_VerboseWriterPointer NULL = new MM_VerboseWriterPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_VerboseWriterPointer(long address) {
		super(address);
	}

	public static MM_VerboseWriterPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_VerboseWriterPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_VerboseWriterPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_VerboseWriterPointer(address);
	}

	public MM_VerboseWriterPointer add(long count) {
		return MM_VerboseWriterPointer.cast(address + (MM_VerboseWriter.SIZEOF * count));
	}

	public MM_VerboseWriterPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_VerboseWriterPointer addOffset(long offset) {
		return MM_VerboseWriterPointer.cast(address + offset);
	}

	public MM_VerboseWriterPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_VerboseWriterPointer sub(long count) {
		return MM_VerboseWriterPointer.cast(address - (MM_VerboseWriter.SIZEOF * count));
	}

	public MM_VerboseWriterPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_VerboseWriterPointer subOffset(long offset) {
		return MM_VerboseWriterPointer.cast(address - offset);
	}

	public MM_VerboseWriterPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_VerboseWriterPointer untag(long mask) {
		return MM_VerboseWriterPointer.cast(address & ~mask);
	}

	public MM_VerboseWriterPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_VerboseWriter.SIZEOF;
	}

	// Implementation methods

	// U8* _footer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__footerOffset_", declaredType="U8*")
	public U8Pointer _footer() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(MM_VerboseWriter.__footerOffset_));
	}

	// U8* _footer
	public PointerPointer _footerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VerboseWriter.__footerOffset_));
	}

	// U8* _header
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__headerOffset_", declaredType="U8*")
	public U8Pointer _header() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(MM_VerboseWriter.__headerOffset_));
	}

	// U8* _header
	public PointerPointer _headerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VerboseWriter.__headerOffset_));
	}

	// bool _isActive
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isActiveOffset_", declaredType="bool")
	public boolean _isActive() throws CorruptDataException {
		return getBoolAtOffset(MM_VerboseWriter.__isActiveOffset_);
	}

	// bool _isActive
	public BoolPointer _isActiveEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_VerboseWriter.__isActiveOffset_));
	}

	// MM_VerboseWriter* _nextWriter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextWriterOffset_", declaredType="MM_VerboseWriter*")
	public MM_VerboseWriterPointer _nextWriter() throws CorruptDataException {
		return MM_VerboseWriterPointer.cast(getPointerAtOffset(MM_VerboseWriter.__nextWriterOffset_));
	}

	// MM_VerboseWriter* _nextWriter
	public PointerPointer _nextWriterEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VerboseWriter.__nextWriterOffset_));
	}

	// WriterType _type
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__typeOffset_", declaredType="WriterType")
	public long _type() throws CorruptDataException {
		if (WriterType.SIZEOF == 1) {
			return getByteAtOffset(MM_VerboseWriter.__typeOffset_);
		} else if (WriterType.SIZEOF == 2) {
			return getShortAtOffset(MM_VerboseWriter.__typeOffset_);
		} else if (WriterType.SIZEOF == 4) {
			return getIntAtOffset(MM_VerboseWriter.__typeOffset_);
		} else if (WriterType.SIZEOF == 8) {
			return getLongAtOffset(MM_VerboseWriter.__typeOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// WriterType _type
	public EnumPointer _typeEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_VerboseWriter.__typeOffset_), WriterType.class);
	}

	// void** _vptr$MM_VerboseWriter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__vptr$MM_VerboseWriterOffset_", declaredType="void**")
	public PointerPointer _vptr$MM_VerboseWriter() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(MM_VerboseWriter.__vptr$MM_VerboseWriterOffset_));
	}

	// void** _vptr$MM_VerboseWriter
	public PointerPointer _vptr$MM_VerboseWriterEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VerboseWriter.__vptr$MM_VerboseWriterOffset_));
	}

}
