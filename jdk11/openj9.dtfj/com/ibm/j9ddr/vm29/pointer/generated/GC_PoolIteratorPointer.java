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
 * Structure: GC_PoolIteratorPointer
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
 * The generated code will provide getters for all elements in the GC_PoolIteratorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=GC_PoolIterator.class)
public class GC_PoolIteratorPointer extends StructurePointer {

	// NULL
	public static final GC_PoolIteratorPointer NULL = new GC_PoolIteratorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected GC_PoolIteratorPointer(long address) {
		super(address);
	}

	public static GC_PoolIteratorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static GC_PoolIteratorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static GC_PoolIteratorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new GC_PoolIteratorPointer(address);
	}

	public GC_PoolIteratorPointer add(long count) {
		return GC_PoolIteratorPointer.cast(address + (GC_PoolIterator.SIZEOF * count));
	}

	public GC_PoolIteratorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public GC_PoolIteratorPointer addOffset(long offset) {
		return GC_PoolIteratorPointer.cast(address + offset);
	}

	public GC_PoolIteratorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public GC_PoolIteratorPointer sub(long count) {
		return GC_PoolIteratorPointer.cast(address - (GC_PoolIterator.SIZEOF * count));
	}

	public GC_PoolIteratorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public GC_PoolIteratorPointer subOffset(long offset) {
		return GC_PoolIteratorPointer.cast(address - offset);
	}

	public GC_PoolIteratorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public GC_PoolIteratorPointer untag(long mask) {
		return GC_PoolIteratorPointer.cast(address & ~mask);
	}

	public GC_PoolIteratorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return GC_PoolIterator.SIZEOF;
	}

	// Implementation methods

	// void** _nextValue
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextValueOffset_", declaredType="void**")
	public PointerPointer _nextValue() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(GC_PoolIterator.__nextValueOffset_));
	}

	// void** _nextValue
	public PointerPointer _nextValueEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_PoolIterator.__nextValueOffset_));
	}

	// J9Pool* _pool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__poolOffset_", declaredType="J9Pool*")
	public J9PoolPointer _pool() throws CorruptDataException {
		return J9PoolPointer.cast(getPointerAtOffset(GC_PoolIterator.__poolOffset_));
	}

	// J9Pool* _pool
	public PointerPointer _poolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_PoolIterator.__poolOffset_));
	}

	// J9PoolState _state
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__stateOffset_", declaredType="J9PoolState")
	public J9PoolStatePointer _state() throws CorruptDataException {
		return J9PoolStatePointer.cast(nonNullFieldEA(GC_PoolIterator.__stateOffset_));
	}

	// J9PoolState _state
	public PointerPointer _stateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_PoolIterator.__stateOffset_));
	}

}
