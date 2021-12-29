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
 * Structure: jvmtiGcp_translationPointer
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
 * The generated code will provide getters for all elements in the jvmtiGcp_translationPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=jvmtiGcp_translation.class)
public class jvmtiGcp_translationPointer extends StructurePointer {

	// NULL
	public static final jvmtiGcp_translationPointer NULL = new jvmtiGcp_translationPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected jvmtiGcp_translationPointer(long address) {
		super(address);
	}

	public static jvmtiGcp_translationPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static jvmtiGcp_translationPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static jvmtiGcp_translationPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new jvmtiGcp_translationPointer(address);
	}

	public jvmtiGcp_translationPointer add(long count) {
		return jvmtiGcp_translationPointer.cast(address + (jvmtiGcp_translation.SIZEOF * count));
	}

	public jvmtiGcp_translationPointer add(Scalar count) {
		return add(count.longValue());
	}

	public jvmtiGcp_translationPointer addOffset(long offset) {
		return jvmtiGcp_translationPointer.cast(address + offset);
	}

	public jvmtiGcp_translationPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public jvmtiGcp_translationPointer sub(long count) {
		return jvmtiGcp_translationPointer.cast(address - (jvmtiGcp_translation.SIZEOF * count));
	}

	public jvmtiGcp_translationPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public jvmtiGcp_translationPointer subOffset(long offset) {
		return jvmtiGcp_translationPointer.cast(address - offset);
	}

	public jvmtiGcp_translationPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public jvmtiGcp_translationPointer untag(long mask) {
		return jvmtiGcp_translationPointer.cast(address & ~mask);
	}

	public jvmtiGcp_translationPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return jvmtiGcp_translation.SIZEOF;
	}

	// Implementation methods

	// void** cp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cpOffset_", declaredType="void**")
	public PointerPointer cp() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(jvmtiGcp_translation._cpOffset_));
	}

	// void** cp
	public PointerPointer cpEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiGcp_translation._cpOffset_));
	}

	// U32 cpSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cpSizeOffset_", declaredType="U32")
	public UDATA cpSize() throws CorruptDataException {
		return new U32(getIntAtOffset(jvmtiGcp_translation._cpSizeOffset_));
	}

	// U32 cpSize
	public UDATAPointer cpSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(jvmtiGcp_translation._cpSizeOffset_));
	}

	// J9HashTable* ht
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_htOffset_", declaredType="J9HashTable*")
	public J9HashTablePointer ht() throws CorruptDataException {
		return J9HashTablePointer.cast(getPointerAtOffset(jvmtiGcp_translation._htOffset_));
	}

	// J9HashTable* ht
	public PointerPointer htEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiGcp_translation._htOffset_));
	}

	// J9ROMConstantPoolItem* romConstantPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romConstantPoolOffset_", declaredType="J9ROMConstantPoolItem*")
	public J9ROMConstantPoolItemPointer romConstantPool() throws CorruptDataException {
		return J9ROMConstantPoolItemPointer.cast(getPointerAtOffset(jvmtiGcp_translation._romConstantPoolOffset_));
	}

	// J9ROMConstantPoolItem* romConstantPool
	public PointerPointer romConstantPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiGcp_translation._romConstantPoolOffset_));
	}

	// U32 totalSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_totalSizeOffset_", declaredType="U32")
	public UDATA totalSize() throws CorruptDataException {
		return new U32(getIntAtOffset(jvmtiGcp_translation._totalSizeOffset_));
	}

	// U32 totalSize
	public UDATAPointer totalSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(jvmtiGcp_translation._totalSizeOffset_));
	}

}
