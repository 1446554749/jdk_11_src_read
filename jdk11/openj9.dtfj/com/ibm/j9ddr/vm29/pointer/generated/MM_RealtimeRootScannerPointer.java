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
 * Structure: MM_RealtimeRootScannerPointer
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
 * The generated code will provide getters for all elements in the MM_RealtimeRootScannerPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_RealtimeRootScanner.class)
public class MM_RealtimeRootScannerPointer extends MM_RootScannerPointer {

	// NULL
	public static final MM_RealtimeRootScannerPointer NULL = new MM_RealtimeRootScannerPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_RealtimeRootScannerPointer(long address) {
		super(address);
	}

	public static MM_RealtimeRootScannerPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_RealtimeRootScannerPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_RealtimeRootScannerPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_RealtimeRootScannerPointer(address);
	}

	public MM_RealtimeRootScannerPointer add(long count) {
		return MM_RealtimeRootScannerPointer.cast(address + (MM_RealtimeRootScanner.SIZEOF * count));
	}

	public MM_RealtimeRootScannerPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_RealtimeRootScannerPointer addOffset(long offset) {
		return MM_RealtimeRootScannerPointer.cast(address + offset);
	}

	public MM_RealtimeRootScannerPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_RealtimeRootScannerPointer sub(long count) {
		return MM_RealtimeRootScannerPointer.cast(address - (MM_RealtimeRootScanner.SIZEOF * count));
	}

	public MM_RealtimeRootScannerPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_RealtimeRootScannerPointer subOffset(long offset) {
		return MM_RealtimeRootScannerPointer.cast(address - offset);
	}

	public MM_RealtimeRootScannerPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_RealtimeRootScannerPointer untag(long mask) {
		return MM_RealtimeRootScannerPointer.cast(address & ~mask);
	}

	public MM_RealtimeRootScannerPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_RealtimeRootScanner.SIZEOF;
	}

	// Implementation methods

	// MM_EnvironmentRealtime* _env
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__envOffset_", declaredType="MM_EnvironmentRealtime*")
	public MM_EnvironmentRealtimePointer _env() throws CorruptDataException {
		return MM_EnvironmentRealtimePointer.cast(getPointerAtOffset(MM_RealtimeRootScanner.__envOffset_));
	}

	// MM_EnvironmentRealtime* _env
	public PointerPointer _envEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RealtimeRootScanner.__envOffset_));
	}

	// MM_RealtimeMarkingScheme* _markingScheme
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__markingSchemeOffset_", declaredType="MM_RealtimeMarkingScheme*")
	public MM_RealtimeMarkingSchemePointer _markingScheme() throws CorruptDataException {
		return MM_RealtimeMarkingSchemePointer.cast(getPointerAtOffset(MM_RealtimeRootScanner.__markingSchemeOffset_));
	}

	// MM_RealtimeMarkingScheme* _markingScheme
	public PointerPointer _markingSchemeEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RealtimeRootScanner.__markingSchemeOffset_));
	}

	// MM_RealtimeGC* _realtimeGC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__realtimeGCOffset_", declaredType="MM_RealtimeGC*")
	public MM_RealtimeGCPointer _realtimeGC() throws CorruptDataException {
		return MM_RealtimeGCPointer.cast(getPointerAtOffset(MM_RealtimeRootScanner.__realtimeGCOffset_));
	}

	// MM_RealtimeGC* _realtimeGC
	public PointerPointer _realtimeGCEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_RealtimeRootScanner.__realtimeGCOffset_));
	}

	// UDATA _threadCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__threadCountOffset_", declaredType="UDATA")
	public UDATA _threadCount() throws CorruptDataException {
		return getUDATAAtOffset(MM_RealtimeRootScanner.__threadCountOffset_);
	}

	// UDATA _threadCount
	public UDATAPointer _threadCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_RealtimeRootScanner.__threadCountOffset_));
	}

	// I32 _yieldCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__yieldCountOffset_", declaredType="I32")
	public IDATA _yieldCount() throws CorruptDataException {
		return new I32(getIntAtOffset(MM_RealtimeRootScanner.__yieldCountOffset_));
	}

	// I32 _yieldCount
	public IDATAPointer _yieldCountEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(MM_RealtimeRootScanner.__yieldCountOffset_));
	}

}
