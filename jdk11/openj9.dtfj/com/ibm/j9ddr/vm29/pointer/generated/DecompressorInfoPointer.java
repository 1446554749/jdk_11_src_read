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
 * Structure: DecompressorInfoPointer
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
 * The generated code will provide getters for all elements in the DecompressorInfoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=DecompressorInfo.class)
public class DecompressorInfoPointer extends StructurePointer {

	// NULL
	public static final DecompressorInfoPointer NULL = new DecompressorInfoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected DecompressorInfoPointer(long address) {
		super(address);
	}

	public static DecompressorInfoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static DecompressorInfoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static DecompressorInfoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new DecompressorInfoPointer(address);
	}

	public DecompressorInfoPointer add(long count) {
		return DecompressorInfoPointer.cast(address + (DecompressorInfo.SIZEOF * count));
	}

	public DecompressorInfoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public DecompressorInfoPointer addOffset(long offset) {
		return DecompressorInfoPointer.cast(address + offset);
	}

	public DecompressorInfoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public DecompressorInfoPointer sub(long count) {
		return DecompressorInfoPointer.cast(address - (DecompressorInfo.SIZEOF * count));
	}

	public DecompressorInfoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public DecompressorInfoPointer subOffset(long offset) {
		return DecompressorInfoPointer.cast(address - offset);
	}

	public DecompressorInfoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public DecompressorInfoPointer untag(long mask) {
		return DecompressorInfoPointer.cast(address & ~mask);
	}

	public DecompressorInfoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return DecompressorInfo.SIZEOF;
	}

	// Implementation methods

	// U32 decompressorConfigNameOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_decompressorConfigNameOffsetOffset_", declaredType="U32")
	public UDATA decompressorConfigNameOffset() throws CorruptDataException {
		return new U32(getIntAtOffset(DecompressorInfo._decompressorConfigNameOffsetOffset_));
	}

	// U32 decompressorConfigNameOffset
	public UDATAPointer decompressorConfigNameOffsetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(DecompressorInfo._decompressorConfigNameOffsetOffset_));
	}

	// U8 decompressorFlag
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_decompressorFlagOffset_", declaredType="U8")
	public U8 decompressorFlag() throws CorruptDataException {
		return new U8(getByteAtOffset(DecompressorInfo._decompressorFlagOffset_));
	}

	// U8 decompressorFlag
	public U8Pointer decompressorFlagEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(DecompressorInfo._decompressorFlagOffset_));
	}

	// U32 decompressorNameOffset
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_decompressorNameOffsetOffset_", declaredType="U32")
	public UDATA decompressorNameOffset() throws CorruptDataException {
		return new U32(getIntAtOffset(DecompressorInfo._decompressorNameOffsetOffset_));
	}

	// U32 decompressorNameOffset
	public UDATAPointer decompressorNameOffsetEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(DecompressorInfo._decompressorNameOffsetOffset_));
	}

	// U32 magic
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_magicOffset_", declaredType="U32")
	public UDATA magic() throws CorruptDataException {
		return new U32(getIntAtOffset(DecompressorInfo._magicOffset_));
	}

	// U32 magic
	public UDATAPointer magicEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(DecompressorInfo._magicOffset_));
	}

	// U32 resourceLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resourceLengthOffset_", declaredType="U32")
	public UDATA resourceLength() throws CorruptDataException {
		return new U32(getIntAtOffset(DecompressorInfo._resourceLengthOffset_));
	}

	// U32 resourceLength
	public UDATAPointer resourceLengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(DecompressorInfo._resourceLengthOffset_));
	}

	// U32 uncompressedSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_uncompressedSizeOffset_", declaredType="U32")
	public UDATA uncompressedSize() throws CorruptDataException {
		return new U32(getIntAtOffset(DecompressorInfo._uncompressedSizeOffset_));
	}

	// U32 uncompressedSize
	public UDATAPointer uncompressedSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(DecompressorInfo._uncompressedSizeOffset_));
	}

}
