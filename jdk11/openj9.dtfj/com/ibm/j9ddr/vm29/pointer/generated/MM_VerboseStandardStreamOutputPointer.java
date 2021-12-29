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
 * Structure: MM_VerboseStandardStreamOutputPointer
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
 * The generated code will provide getters for all elements in the MM_VerboseStandardStreamOutputPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_VerboseStandardStreamOutput.class)
public class MM_VerboseStandardStreamOutputPointer extends MM_VerboseOutputAgentPointer {

	// NULL
	public static final MM_VerboseStandardStreamOutputPointer NULL = new MM_VerboseStandardStreamOutputPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_VerboseStandardStreamOutputPointer(long address) {
		super(address);
	}

	public static MM_VerboseStandardStreamOutputPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_VerboseStandardStreamOutputPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_VerboseStandardStreamOutputPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_VerboseStandardStreamOutputPointer(address);
	}

	public MM_VerboseStandardStreamOutputPointer add(long count) {
		return MM_VerboseStandardStreamOutputPointer.cast(address + (MM_VerboseStandardStreamOutput.SIZEOF * count));
	}

	public MM_VerboseStandardStreamOutputPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_VerboseStandardStreamOutputPointer addOffset(long offset) {
		return MM_VerboseStandardStreamOutputPointer.cast(address + offset);
	}

	public MM_VerboseStandardStreamOutputPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_VerboseStandardStreamOutputPointer sub(long count) {
		return MM_VerboseStandardStreamOutputPointer.cast(address - (MM_VerboseStandardStreamOutput.SIZEOF * count));
	}

	public MM_VerboseStandardStreamOutputPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_VerboseStandardStreamOutputPointer subOffset(long offset) {
		return MM_VerboseStandardStreamOutputPointer.cast(address - offset);
	}

	public MM_VerboseStandardStreamOutputPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_VerboseStandardStreamOutputPointer untag(long mask) {
		return MM_VerboseStandardStreamOutputPointer.cast(address & ~mask);
	}

	public MM_VerboseStandardStreamOutputPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_VerboseStandardStreamOutput.SIZEOF;
	}

	// Implementation methods

	// StreamID _currentStream
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentStreamOffset_", declaredType="StreamID")
	public long _currentStream() throws CorruptDataException {
		if (MM_VerboseStandardStreamOutput$StreamID.SIZEOF == 1) {
			return getByteAtOffset(MM_VerboseStandardStreamOutput.__currentStreamOffset_);
		} else if (MM_VerboseStandardStreamOutput$StreamID.SIZEOF == 2) {
			return getShortAtOffset(MM_VerboseStandardStreamOutput.__currentStreamOffset_);
		} else if (MM_VerboseStandardStreamOutput$StreamID.SIZEOF == 4) {
			return getIntAtOffset(MM_VerboseStandardStreamOutput.__currentStreamOffset_);
		} else if (MM_VerboseStandardStreamOutput$StreamID.SIZEOF == 8) {
			return getLongAtOffset(MM_VerboseStandardStreamOutput.__currentStreamOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// StreamID _currentStream
	public EnumPointer _currentStreamEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_VerboseStandardStreamOutput.__currentStreamOffset_), MM_VerboseStandardStreamOutput$StreamID.class);
	}

}
