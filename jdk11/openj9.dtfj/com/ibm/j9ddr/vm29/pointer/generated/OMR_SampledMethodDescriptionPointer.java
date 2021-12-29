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
 * Structure: OMR_SampledMethodDescriptionPointer
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
 * The generated code will provide getters for all elements in the OMR_SampledMethodDescriptionPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=OMR_SampledMethodDescription.class)
public class OMR_SampledMethodDescriptionPointer extends StructurePointer {

	// NULL
	public static final OMR_SampledMethodDescriptionPointer NULL = new OMR_SampledMethodDescriptionPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected OMR_SampledMethodDescriptionPointer(long address) {
		super(address);
	}

	public static OMR_SampledMethodDescriptionPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static OMR_SampledMethodDescriptionPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static OMR_SampledMethodDescriptionPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new OMR_SampledMethodDescriptionPointer(address);
	}

	public OMR_SampledMethodDescriptionPointer add(long count) {
		return OMR_SampledMethodDescriptionPointer.cast(address + (OMR_SampledMethodDescription.SIZEOF * count));
	}

	public OMR_SampledMethodDescriptionPointer add(Scalar count) {
		return add(count.longValue());
	}

	public OMR_SampledMethodDescriptionPointer addOffset(long offset) {
		return OMR_SampledMethodDescriptionPointer.cast(address + offset);
	}

	public OMR_SampledMethodDescriptionPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public OMR_SampledMethodDescriptionPointer sub(long count) {
		return OMR_SampledMethodDescriptionPointer.cast(address - (OMR_SampledMethodDescription.SIZEOF * count));
	}

	public OMR_SampledMethodDescriptionPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public OMR_SampledMethodDescriptionPointer subOffset(long offset) {
		return OMR_SampledMethodDescriptionPointer.cast(address - offset);
	}

	public OMR_SampledMethodDescriptionPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public OMR_SampledMethodDescriptionPointer untag(long mask) {
		return OMR_SampledMethodDescriptionPointer.cast(address & ~mask);
	}

	public OMR_SampledMethodDescriptionPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return OMR_SampledMethodDescription.SIZEOF;
	}

	// Implementation methods

	// const U8*[] propertyValues
	public PointerPointer propertyValuesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_SampledMethodDescription._propertyValuesOffset_));
	}

	// omr_error_t reasonCode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reasonCodeOffset_", declaredType="omr_error_t")
	public long reasonCode() throws CorruptDataException {
		if (omr_error_t.SIZEOF == 1) {
			return getByteAtOffset(OMR_SampledMethodDescription._reasonCodeOffset_);
		} else if (omr_error_t.SIZEOF == 2) {
			return getShortAtOffset(OMR_SampledMethodDescription._reasonCodeOffset_);
		} else if (omr_error_t.SIZEOF == 4) {
			return getIntAtOffset(OMR_SampledMethodDescription._reasonCodeOffset_);
		} else if (omr_error_t.SIZEOF == 8) {
			return getLongAtOffset(OMR_SampledMethodDescription._reasonCodeOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// omr_error_t reasonCode
	public EnumPointer reasonCodeEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(OMR_SampledMethodDescription._reasonCodeOffset_), omr_error_t.class);
	}

}
