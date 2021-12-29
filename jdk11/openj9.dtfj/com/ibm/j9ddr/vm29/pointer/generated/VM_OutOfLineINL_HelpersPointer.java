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

import com.ibm.j9ddr.vm29.pointer.*;
import com.ibm.j9ddr.vm29.structure.*;
import com.ibm.j9ddr.vm29.types.*;

/**
 * Structure: VM_OutOfLineINL_HelpersPointer
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
 * The generated code will provide getters for all elements in the VM_OutOfLineINL_HelpersPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=VM_OutOfLineINL_Helpers.class)
public class VM_OutOfLineINL_HelpersPointer extends StructurePointer {

	// NULL
	public static final VM_OutOfLineINL_HelpersPointer NULL = new VM_OutOfLineINL_HelpersPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected VM_OutOfLineINL_HelpersPointer(long address) {
		super(address);
	}

	public static VM_OutOfLineINL_HelpersPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static VM_OutOfLineINL_HelpersPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static VM_OutOfLineINL_HelpersPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new VM_OutOfLineINL_HelpersPointer(address);
	}

	public VM_OutOfLineINL_HelpersPointer add(long count) {
		return VM_OutOfLineINL_HelpersPointer.cast(address + (VM_OutOfLineINL_Helpers.SIZEOF * count));
	}

	public VM_OutOfLineINL_HelpersPointer add(Scalar count) {
		return add(count.longValue());
	}

	public VM_OutOfLineINL_HelpersPointer addOffset(long offset) {
		return VM_OutOfLineINL_HelpersPointer.cast(address + offset);
	}

	public VM_OutOfLineINL_HelpersPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public VM_OutOfLineINL_HelpersPointer sub(long count) {
		return VM_OutOfLineINL_HelpersPointer.cast(address - (VM_OutOfLineINL_Helpers.SIZEOF * count));
	}

	public VM_OutOfLineINL_HelpersPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public VM_OutOfLineINL_HelpersPointer subOffset(long offset) {
		return VM_OutOfLineINL_HelpersPointer.cast(address - offset);
	}

	public VM_OutOfLineINL_HelpersPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public VM_OutOfLineINL_HelpersPointer untag(long mask) {
		return VM_OutOfLineINL_HelpersPointer.cast(address & ~mask);
	}

	public VM_OutOfLineINL_HelpersPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return VM_OutOfLineINL_Helpers.SIZEOF;
	}

	// Implementation methods

}
