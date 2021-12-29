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
 * Structure: OMRProcessorDescPointer
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
 * The generated code will provide getters for all elements in the OMRProcessorDescPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=OMRProcessorDesc.class)
public class OMRProcessorDescPointer extends StructurePointer {

	// NULL
	public static final OMRProcessorDescPointer NULL = new OMRProcessorDescPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected OMRProcessorDescPointer(long address) {
		super(address);
	}

	public static OMRProcessorDescPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static OMRProcessorDescPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static OMRProcessorDescPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new OMRProcessorDescPointer(address);
	}

	public OMRProcessorDescPointer add(long count) {
		return OMRProcessorDescPointer.cast(address + (OMRProcessorDesc.SIZEOF * count));
	}

	public OMRProcessorDescPointer add(Scalar count) {
		return add(count.longValue());
	}

	public OMRProcessorDescPointer addOffset(long offset) {
		return OMRProcessorDescPointer.cast(address + offset);
	}

	public OMRProcessorDescPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public OMRProcessorDescPointer sub(long count) {
		return OMRProcessorDescPointer.cast(address - (OMRProcessorDesc.SIZEOF * count));
	}

	public OMRProcessorDescPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public OMRProcessorDescPointer subOffset(long offset) {
		return OMRProcessorDescPointer.cast(address - offset);
	}

	public OMRProcessorDescPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public OMRProcessorDescPointer untag(long mask) {
		return OMRProcessorDescPointer.cast(address & ~mask);
	}

	public OMRProcessorDescPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return OMRProcessorDesc.SIZEOF;
	}

	// Implementation methods

	// U32[] features
	public UDATAPointer featuresEA() throws CorruptDataException {
		return U32Pointer.cast(nonNullFieldEA(OMRProcessorDesc._featuresOffset_));
	}

	// OMRProcessorArchitecture physicalProcessor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_physicalProcessorOffset_", declaredType="OMRProcessorArchitecture")
	public long physicalProcessor() throws CorruptDataException {
		if (OMRProcessorArchitecture.SIZEOF == 1) {
			return getByteAtOffset(OMRProcessorDesc._physicalProcessorOffset_);
		} else if (OMRProcessorArchitecture.SIZEOF == 2) {
			return getShortAtOffset(OMRProcessorDesc._physicalProcessorOffset_);
		} else if (OMRProcessorArchitecture.SIZEOF == 4) {
			return getIntAtOffset(OMRProcessorDesc._physicalProcessorOffset_);
		} else if (OMRProcessorArchitecture.SIZEOF == 8) {
			return getLongAtOffset(OMRProcessorDesc._physicalProcessorOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// OMRProcessorArchitecture physicalProcessor
	public EnumPointer physicalProcessorEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(OMRProcessorDesc._physicalProcessorOffset_), OMRProcessorArchitecture.class);
	}

	// OMRProcessorArchitecture processor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_processorOffset_", declaredType="OMRProcessorArchitecture")
	public long processor() throws CorruptDataException {
		if (OMRProcessorArchitecture.SIZEOF == 1) {
			return getByteAtOffset(OMRProcessorDesc._processorOffset_);
		} else if (OMRProcessorArchitecture.SIZEOF == 2) {
			return getShortAtOffset(OMRProcessorDesc._processorOffset_);
		} else if (OMRProcessorArchitecture.SIZEOF == 4) {
			return getIntAtOffset(OMRProcessorDesc._processorOffset_);
		} else if (OMRProcessorArchitecture.SIZEOF == 8) {
			return getLongAtOffset(OMRProcessorDesc._processorOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// OMRProcessorArchitecture processor
	public EnumPointer processorEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(OMRProcessorDesc._processorOffset_), OMRProcessorArchitecture.class);
	}

}
