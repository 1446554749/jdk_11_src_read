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
 * Structure: MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElementPointer
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
 * The generated code will provide getters for all elements in the MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElementPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElement.class)
public class MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElementPointer extends StructurePointer {

	// NULL
	public static final MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElementPointer NULL = new MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElementPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElementPointer(long address) {
		super(address);
	}

	public static MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElementPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElementPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElementPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElementPointer(address);
	}

	public MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElementPointer add(long count) {
		return MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElementPointer.cast(address + (MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElement.SIZEOF * count));
	}

	public MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElementPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElementPointer addOffset(long offset) {
		return MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElementPointer.cast(address + offset);
	}

	public MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElementPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElementPointer sub(long count) {
		return MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElementPointer.cast(address - (MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElement.SIZEOF * count));
	}

	public MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElementPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElementPointer subOffset(long offset) {
		return MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElementPointer.cast(address - offset);
	}

	public MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElementPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElementPointer untag(long mask) {
		return MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElementPointer.cast(address & ~mask);
	}

	public MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElementPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElement.SIZEOF;
	}

	// Implementation methods

	// double avgHis_regionCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_avgHis_regionCountOffset_", declaredType="double")
	public double avgHis_regionCount() throws CorruptDataException {
		return getDoubleAtOffset(MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElement._avgHis_regionCountOffset_);
	}

	// double avgHis_regionCount
	public DoublePointer avgHis_regionCountEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElement._avgHis_regionCountOffset_));
	}

	// double avgLcl_regionCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_avgLcl_regionCountOffset_", declaredType="double")
	public double avgLcl_regionCount() throws CorruptDataException {
		return getDoubleAtOffset(MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElement._avgLcl_regionCountOffset_);
	}

	// double avgLcl_regionCount
	public DoublePointer avgLcl_regionCountEA() throws CorruptDataException {
		return DoublePointer.cast(nonNullFieldEA(MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElement._avgLcl_regionCountOffset_));
	}

	// UDATA regionCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_regionCountOffset_", declaredType="UDATA")
	public UDATA regionCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElement._regionCountOffset_);
	}

	// UDATA regionCount
	public UDATAPointer regionCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_TgcDynamicCollectionSetData$MM_TgcDynamicCollectionSetHistoryElement._regionCountOffset_));
	}

}
