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
 * Structure: omrthread_detachstate_tPointer
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
 * The generated code will provide getters for all elements in the omrthread_detachstate_tPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=omrthread_detachstate_t.class)
public class omrthread_detachstate_tPointer extends StructurePointer {

	// NULL
	public static final omrthread_detachstate_tPointer NULL = new omrthread_detachstate_tPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected omrthread_detachstate_tPointer(long address) {
		super(address);
	}

	public static omrthread_detachstate_tPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static omrthread_detachstate_tPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static omrthread_detachstate_tPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new omrthread_detachstate_tPointer(address);
	}

	public omrthread_detachstate_tPointer add(long count) {
		return omrthread_detachstate_tPointer.cast(address + (omrthread_detachstate_t.SIZEOF * count));
	}

	public omrthread_detachstate_tPointer add(Scalar count) {
		return add(count.longValue());
	}

	public omrthread_detachstate_tPointer addOffset(long offset) {
		return omrthread_detachstate_tPointer.cast(address + offset);
	}

	public omrthread_detachstate_tPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public omrthread_detachstate_tPointer sub(long count) {
		return omrthread_detachstate_tPointer.cast(address - (omrthread_detachstate_t.SIZEOF * count));
	}

	public omrthread_detachstate_tPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public omrthread_detachstate_tPointer subOffset(long offset) {
		return omrthread_detachstate_tPointer.cast(address - offset);
	}

	public omrthread_detachstate_tPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public omrthread_detachstate_tPointer untag(long mask) {
		return omrthread_detachstate_tPointer.cast(address & ~mask);
	}

	public omrthread_detachstate_tPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return omrthread_detachstate_t.SIZEOF;
	}

	// Implementation methods

}
