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
 * Structure: GC_ClassLoaderClassesIteratorPointer
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
 * The generated code will provide getters for all elements in the GC_ClassLoaderClassesIteratorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=GC_ClassLoaderClassesIterator.class)
public class GC_ClassLoaderClassesIteratorPointer extends StructurePointer {

	// NULL
	public static final GC_ClassLoaderClassesIteratorPointer NULL = new GC_ClassLoaderClassesIteratorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected GC_ClassLoaderClassesIteratorPointer(long address) {
		super(address);
	}

	public static GC_ClassLoaderClassesIteratorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static GC_ClassLoaderClassesIteratorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static GC_ClassLoaderClassesIteratorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new GC_ClassLoaderClassesIteratorPointer(address);
	}

	public GC_ClassLoaderClassesIteratorPointer add(long count) {
		return GC_ClassLoaderClassesIteratorPointer.cast(address + (GC_ClassLoaderClassesIterator.SIZEOF * count));
	}

	public GC_ClassLoaderClassesIteratorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public GC_ClassLoaderClassesIteratorPointer addOffset(long offset) {
		return GC_ClassLoaderClassesIteratorPointer.cast(address + offset);
	}

	public GC_ClassLoaderClassesIteratorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public GC_ClassLoaderClassesIteratorPointer sub(long count) {
		return GC_ClassLoaderClassesIteratorPointer.cast(address - (GC_ClassLoaderClassesIterator.SIZEOF * count));
	}

	public GC_ClassLoaderClassesIteratorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public GC_ClassLoaderClassesIteratorPointer subOffset(long offset) {
		return GC_ClassLoaderClassesIteratorPointer.cast(address - offset);
	}

	public GC_ClassLoaderClassesIteratorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public GC_ClassLoaderClassesIteratorPointer untag(long mask) {
		return GC_ClassLoaderClassesIteratorPointer.cast(address & ~mask);
	}

	public GC_ClassLoaderClassesIteratorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return GC_ClassLoaderClassesIterator.SIZEOF;
	}

	// Implementation methods

	// J9ClassLoader* _classLoader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classLoaderOffset_", declaredType="J9ClassLoader*")
	public J9ClassLoaderPointer _classLoader() throws CorruptDataException {
		return J9ClassLoaderPointer.cast(getPointerAtOffset(GC_ClassLoaderClassesIterator.__classLoaderOffset_));
	}

	// J9ClassLoader* _classLoader
	public PointerPointer _classLoaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ClassLoaderClassesIterator.__classLoaderOffset_));
	}

	// J9JavaVM* _javaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__javaVMOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer _javaVM() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(GC_ClassLoaderClassesIterator.__javaVMOffset_));
	}

	// J9JavaVM* _javaVM
	public PointerPointer _javaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ClassLoaderClassesIterator.__javaVMOffset_));
	}

	// GC_ClassLoaderClassesIterator$ScanModes _mode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__modeOffset_", declaredType="GC_ClassLoaderClassesIterator$ScanModes")
	public long _mode() throws CorruptDataException {
		if (GC_ClassLoaderClassesIterator$ScanModes.SIZEOF == 1) {
			return getByteAtOffset(GC_ClassLoaderClassesIterator.__modeOffset_);
		} else if (GC_ClassLoaderClassesIterator$ScanModes.SIZEOF == 2) {
			return getShortAtOffset(GC_ClassLoaderClassesIterator.__modeOffset_);
		} else if (GC_ClassLoaderClassesIterator$ScanModes.SIZEOF == 4) {
			return getIntAtOffset(GC_ClassLoaderClassesIterator.__modeOffset_);
		} else if (GC_ClassLoaderClassesIterator$ScanModes.SIZEOF == 8) {
			return getLongAtOffset(GC_ClassLoaderClassesIterator.__modeOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// GC_ClassLoaderClassesIterator$ScanModes _mode
	public EnumPointer _modeEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(GC_ClassLoaderClassesIterator.__modeOffset_), GC_ClassLoaderClassesIterator$ScanModes.class);
	}

	// J9Class* _nextClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__nextClassOffset_", declaredType="J9Class*")
	public J9ClassPointer _nextClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(GC_ClassLoaderClassesIterator.__nextClassOffset_));
	}

	// J9Class* _nextClass
	public PointerPointer _nextClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ClassLoaderClassesIterator.__nextClassOffset_));
	}

	// GC_VMClassSlotIterator _vmClassSlotIterator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__vmClassSlotIteratorOffset_", declaredType="GC_VMClassSlotIterator")
	public GC_VMClassSlotIteratorPointer _vmClassSlotIterator() throws CorruptDataException {
		return GC_VMClassSlotIteratorPointer.cast(nonNullFieldEA(GC_ClassLoaderClassesIterator.__vmClassSlotIteratorOffset_));
	}

	// GC_VMClassSlotIterator _vmClassSlotIterator
	public PointerPointer _vmClassSlotIteratorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ClassLoaderClassesIterator.__vmClassSlotIteratorOffset_));
	}

	// GC_ClassLoaderSegmentIterator _vmSegmentIterator
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__vmSegmentIteratorOffset_", declaredType="GC_ClassLoaderSegmentIterator")
	public GC_ClassLoaderSegmentIteratorPointer _vmSegmentIterator() throws CorruptDataException {
		return GC_ClassLoaderSegmentIteratorPointer.cast(nonNullFieldEA(GC_ClassLoaderClassesIterator.__vmSegmentIteratorOffset_));
	}

	// GC_ClassLoaderSegmentIterator _vmSegmentIterator
	public PointerPointer _vmSegmentIteratorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ClassLoaderClassesIterator.__vmSegmentIteratorOffset_));
	}

	// J9HashTableState _walkState
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__walkStateOffset_", declaredType="J9HashTableState")
	public J9HashTableStatePointer _walkState() throws CorruptDataException {
		return J9HashTableStatePointer.cast(nonNullFieldEA(GC_ClassLoaderClassesIterator.__walkStateOffset_));
	}

	// J9HashTableState _walkState
	public PointerPointer _walkStateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GC_ClassLoaderClassesIterator.__walkStateOffset_));
	}

}
