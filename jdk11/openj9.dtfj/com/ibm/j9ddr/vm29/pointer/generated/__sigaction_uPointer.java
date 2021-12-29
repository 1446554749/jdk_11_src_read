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
 * Structure: __sigaction_uPointer
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
 * The generated code will provide getters for all elements in the __sigaction_uPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=__sigaction_u.class)
public class __sigaction_uPointer extends StructurePointer {

	// NULL
	public static final __sigaction_uPointer NULL = new __sigaction_uPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected __sigaction_uPointer(long address) {
		super(address);
	}

	public static __sigaction_uPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static __sigaction_uPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static __sigaction_uPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new __sigaction_uPointer(address);
	}

	public __sigaction_uPointer add(long count) {
		return __sigaction_uPointer.cast(address + (__sigaction_u.SIZEOF * count));
	}

	public __sigaction_uPointer add(Scalar count) {
		return add(count.longValue());
	}

	public __sigaction_uPointer addOffset(long offset) {
		return __sigaction_uPointer.cast(address + offset);
	}

	public __sigaction_uPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public __sigaction_uPointer sub(long count) {
		return __sigaction_uPointer.cast(address - (__sigaction_u.SIZEOF * count));
	}

	public __sigaction_uPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public __sigaction_uPointer subOffset(long offset) {
		return __sigaction_uPointer.cast(address - offset);
	}

	public __sigaction_uPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public __sigaction_uPointer untag(long mask) {
		return __sigaction_uPointer.cast(address & ~mask);
	}

	public __sigaction_uPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return __sigaction_u.SIZEOF;
	}

	// Implementation methods

	// void* __sa_handler
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___sa_handlerOffset_", declaredType="void*")
	public VoidPointer __sa_handler() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(__sigaction_u.___sa_handlerOffset_));
	}

	// void* __sa_handler
	public PointerPointer __sa_handlerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__sigaction_u.___sa_handlerOffset_));
	}

	// void* __sa_sigaction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___sa_sigactionOffset_", declaredType="void*")
	public VoidPointer __sa_sigaction() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(__sigaction_u.___sa_sigactionOffset_));
	}

	// void* __sa_sigaction
	public PointerPointer __sa_sigactionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(__sigaction_u.___sa_sigactionOffset_));
	}

}
