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
 * Structure: sigactionPointer
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
 * The generated code will provide getters for all elements in the sigactionPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=sigaction.class)
public class sigactionPointer extends StructurePointer {

	// NULL
	public static final sigactionPointer NULL = new sigactionPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected sigactionPointer(long address) {
		super(address);
	}

	public static sigactionPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static sigactionPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static sigactionPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new sigactionPointer(address);
	}

	public sigactionPointer add(long count) {
		return sigactionPointer.cast(address + (sigaction.SIZEOF * count));
	}

	public sigactionPointer add(Scalar count) {
		return add(count.longValue());
	}

	public sigactionPointer addOffset(long offset) {
		return sigactionPointer.cast(address + offset);
	}

	public sigactionPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public sigactionPointer sub(long count) {
		return sigactionPointer.cast(address - (sigaction.SIZEOF * count));
	}

	public sigactionPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public sigactionPointer subOffset(long offset) {
		return sigactionPointer.cast(address - offset);
	}

	public sigactionPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public sigactionPointer untag(long mask) {
		return sigactionPointer.cast(address & ~mask);
	}

	public sigactionPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return sigaction.SIZEOF;
	}

	// Implementation methods

	// __sigaction_u __sigaction_u
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="___sigaction_uOffset_", declaredType="__sigaction_u")
	public __sigaction_uPointer __sigaction_u() throws CorruptDataException {
		return __sigaction_uPointer.cast(nonNullFieldEA(sigaction.___sigaction_uOffset_));
	}

	// __sigaction_u __sigaction_u
	public PointerPointer __sigaction_uEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(sigaction.___sigaction_uOffset_));
	}

	// I32 sa_flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sa_flagsOffset_", declaredType="I32")
	public IDATA sa_flags() throws CorruptDataException {
		return new I32(getIntAtOffset(sigaction._sa_flagsOffset_));
	}

	// I32 sa_flags
	public IDATAPointer sa_flagsEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(sigaction._sa_flagsOffset_));
	}

	// sigset_t sa_mask
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_sa_maskOffset_", declaredType="sigset_t")
	public UDATA sa_mask() throws CorruptDataException {
		return new U32(getIntAtOffset(sigaction._sa_maskOffset_));
	}

	// sigset_t sa_mask
	public UDATAPointer sa_maskEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(sigaction._sa_maskOffset_));
	}

}
