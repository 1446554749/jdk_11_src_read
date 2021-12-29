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
 * Structure: OMR_VMConfigurationPointer
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
 * The generated code will provide getters for all elements in the OMR_VMConfigurationPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=OMR_VMConfiguration.class)
public class OMR_VMConfigurationPointer extends StructurePointer {

	// NULL
	public static final OMR_VMConfigurationPointer NULL = new OMR_VMConfigurationPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected OMR_VMConfigurationPointer(long address) {
		super(address);
	}

	public static OMR_VMConfigurationPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static OMR_VMConfigurationPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static OMR_VMConfigurationPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new OMR_VMConfigurationPointer(address);
	}

	public OMR_VMConfigurationPointer add(long count) {
		return OMR_VMConfigurationPointer.cast(address + (OMR_VMConfiguration.SIZEOF * count));
	}

	public OMR_VMConfigurationPointer add(Scalar count) {
		return add(count.longValue());
	}

	public OMR_VMConfigurationPointer addOffset(long offset) {
		return OMR_VMConfigurationPointer.cast(address + offset);
	}

	public OMR_VMConfigurationPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public OMR_VMConfigurationPointer sub(long count) {
		return OMR_VMConfigurationPointer.cast(address - (OMR_VMConfiguration.SIZEOF * count));
	}

	public OMR_VMConfigurationPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public OMR_VMConfigurationPointer subOffset(long offset) {
		return OMR_VMConfigurationPointer.cast(address - offset);
	}

	public OMR_VMConfigurationPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public OMR_VMConfigurationPointer untag(long mask) {
		return OMR_VMConfigurationPointer.cast(address & ~mask);
	}

	public OMR_VMConfigurationPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return OMR_VMConfiguration.SIZEOF;
	}

	// Implementation methods

	// U64 _maximum_thread_count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maximum_thread_countOffset_", declaredType="U64")
	public UDATA _maximum_thread_count() throws CorruptDataException {
		return new U64(getLongAtOffset(OMR_VMConfiguration.__maximum_thread_countOffset_));
	}

	// U64 _maximum_thread_count
	public UDATAPointer _maximum_thread_countEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMR_VMConfiguration.__maximum_thread_countOffset_));
	}

}
