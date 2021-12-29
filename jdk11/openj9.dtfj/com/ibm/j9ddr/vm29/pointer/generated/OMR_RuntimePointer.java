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
 * Structure: OMR_RuntimePointer
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
 * The generated code will provide getters for all elements in the OMR_RuntimePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=OMR_Runtime.class)
public class OMR_RuntimePointer extends StructurePointer {

	// NULL
	public static final OMR_RuntimePointer NULL = new OMR_RuntimePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected OMR_RuntimePointer(long address) {
		super(address);
	}

	public static OMR_RuntimePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static OMR_RuntimePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static OMR_RuntimePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new OMR_RuntimePointer(address);
	}

	public OMR_RuntimePointer add(long count) {
		return OMR_RuntimePointer.cast(address + (OMR_Runtime.SIZEOF * count));
	}

	public OMR_RuntimePointer add(Scalar count) {
		return add(count.longValue());
	}

	public OMR_RuntimePointer addOffset(long offset) {
		return OMR_RuntimePointer.cast(address + offset);
	}

	public OMR_RuntimePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public OMR_RuntimePointer sub(long count) {
		return OMR_RuntimePointer.cast(address - (OMR_Runtime.SIZEOF * count));
	}

	public OMR_RuntimePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public OMR_RuntimePointer subOffset(long offset) {
		return OMR_RuntimePointer.cast(address - offset);
	}

	public OMR_RuntimePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public OMR_RuntimePointer untag(long mask) {
		return OMR_RuntimePointer.cast(address & ~mask);
	}

	public OMR_RuntimePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return OMR_Runtime.SIZEOF;
	}

	// Implementation methods

	// OMR_RuntimeConfiguration _configuration
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__configurationOffset_", declaredType="OMR_RuntimeConfiguration")
	public OMR_RuntimeConfigurationPointer _configuration() throws CorruptDataException {
		return OMR_RuntimeConfigurationPointer.cast(nonNullFieldEA(OMR_Runtime.__configurationOffset_));
	}

	// OMR_RuntimeConfiguration _configuration
	public PointerPointer _configurationEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_Runtime.__configurationOffset_));
	}

	// U64 _initialized
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__initializedOffset_", declaredType="U64")
	public UDATA _initialized() throws CorruptDataException {
		return new U64(getLongAtOffset(OMR_Runtime.__initializedOffset_));
	}

	// U64 _initialized
	public UDATAPointer _initializedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMR_Runtime.__initializedOffset_));
	}

	// OMRPortLibrary* _portLibrary
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__portLibraryOffset_", declaredType="OMRPortLibrary*")
	public OMRPortLibraryPointer _portLibrary() throws CorruptDataException {
		return OMRPortLibraryPointer.cast(getPointerAtOffset(OMR_Runtime.__portLibraryOffset_));
	}

	// OMRPortLibrary* _portLibrary
	public PointerPointer _portLibraryEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_Runtime.__portLibraryOffset_));
	}

	// OMR_VM* _rootVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__rootVMOffset_", declaredType="OMR_VM*")
	public OMR_VMPointer _rootVM() throws CorruptDataException {
		return OMR_VMPointer.cast(getPointerAtOffset(OMR_Runtime.__rootVMOffset_));
	}

	// OMR_VM* _rootVM
	public PointerPointer _rootVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_Runtime.__rootVMOffset_));
	}

	// U64 _vmCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__vmCountOffset_", declaredType="U64")
	public UDATA _vmCount() throws CorruptDataException {
		return new U64(getLongAtOffset(OMR_Runtime.__vmCountOffset_));
	}

	// U64 _vmCount
	public UDATAPointer _vmCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(OMR_Runtime.__vmCountOffset_));
	}

	// OMR_VM* _vmList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__vmListOffset_", declaredType="OMR_VM*")
	public OMR_VMPointer _vmList() throws CorruptDataException {
		return OMR_VMPointer.cast(getPointerAtOffset(OMR_Runtime.__vmListOffset_));
	}

	// OMR_VM* _vmList
	public PointerPointer _vmListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_Runtime.__vmListOffset_));
	}

	// omrthread_monitor_t _vmListMutex
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__vmListMutexOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer _vmListMutex() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(OMR_Runtime.__vmListMutexOffset_));
	}

	// omrthread_monitor_t _vmListMutex
	public PointerPointer _vmListMutexEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMR_Runtime.__vmListMutexOffset_));
	}

}
