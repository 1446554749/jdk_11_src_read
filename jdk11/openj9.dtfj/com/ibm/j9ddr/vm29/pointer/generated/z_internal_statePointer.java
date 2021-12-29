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
 * Structure: z_internal_statePointer
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
 * The generated code will provide getters for all elements in the z_internal_statePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=z_internal_state.class)
public class z_internal_statePointer extends StructurePointer {

	// NULL
	public static final z_internal_statePointer NULL = new z_internal_statePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected z_internal_statePointer(long address) {
		super(address);
	}

	public static z_internal_statePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static z_internal_statePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static z_internal_statePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new z_internal_statePointer(address);
	}

	public z_internal_statePointer add(long count) {
		return z_internal_statePointer.cast(address + (z_internal_state.SIZEOF * count));
	}

	public z_internal_statePointer add(Scalar count) {
		return add(count.longValue());
	}

	public z_internal_statePointer addOffset(long offset) {
		return z_internal_statePointer.cast(address + offset);
	}

	public z_internal_statePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public z_internal_statePointer sub(long count) {
		return z_internal_statePointer.cast(address - (z_internal_state.SIZEOF * count));
	}

	public z_internal_statePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public z_internal_statePointer subOffset(long offset) {
		return z_internal_statePointer.cast(address - offset);
	}

	public z_internal_statePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public z_internal_statePointer untag(long mask) {
		return z_internal_statePointer.cast(address & ~mask);
	}

	public z_internal_statePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return z_internal_state.SIZEOF;
	}

	// Implementation methods

}
