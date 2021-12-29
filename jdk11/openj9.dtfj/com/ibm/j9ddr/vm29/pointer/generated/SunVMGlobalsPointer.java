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
 * Structure: SunVMGlobalsPointer
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
 * The generated code will provide getters for all elements in the SunVMGlobalsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=SunVMGlobals.class)
public class SunVMGlobalsPointer extends StructurePointer {

	// NULL
	public static final SunVMGlobalsPointer NULL = new SunVMGlobalsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected SunVMGlobalsPointer(long address) {
		super(address);
	}

	public static SunVMGlobalsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static SunVMGlobalsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static SunVMGlobalsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new SunVMGlobalsPointer(address);
	}

	public SunVMGlobalsPointer add(long count) {
		return SunVMGlobalsPointer.cast(address + (SunVMGlobals.SIZEOF * count));
	}

	public SunVMGlobalsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public SunVMGlobalsPointer addOffset(long offset) {
		return SunVMGlobalsPointer.cast(address + offset);
	}

	public SunVMGlobalsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public SunVMGlobalsPointer sub(long count) {
		return SunVMGlobalsPointer.cast(address - (SunVMGlobals.SIZEOF * count));
	}

	public SunVMGlobalsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public SunVMGlobalsPointer subOffset(long offset) {
		return SunVMGlobalsPointer.cast(address - offset);
	}

	public SunVMGlobalsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public SunVMGlobalsPointer untag(long mask) {
		return SunVMGlobalsPointer.cast(address & ~mask);
	}

	public SunVMGlobalsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return SunVMGlobals.SIZEOF;
	}

	// Implementation methods

	// J9JavaVM* javaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_javaVMOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer javaVM() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(SunVMGlobals._javaVMOffset_));
	}

	// J9JavaVM* javaVM
	public PointerPointer javaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SunVMGlobals._javaVMOffset_));
	}

	// jclass jlClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jlClassOffset_", declaredType="jclass")
	public _jclassPointer jlClass() throws CorruptDataException {
		return _jclassPointer.cast(getPointerAtOffset(SunVMGlobals._jlClassOffset_));
	}

	// jclass jlClass
	public PointerPointer jlClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SunVMGlobals._jlClassOffset_));
	}

	// jclass jlThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jlThreadOffset_", declaredType="jclass")
	public _jclassPointer jlThread() throws CorruptDataException {
		return _jclassPointer.cast(getPointerAtOffset(SunVMGlobals._jlThreadOffset_));
	}

	// jclass jlThread
	public PointerPointer jlThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SunVMGlobals._jlThreadOffset_));
	}

	// jmethodID jliMethodHandles_Lookup_checkSecurity
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jliMethodHandles_Lookup_checkSecurityOffset_", declaredType="jmethodID")
	public _jmethodIDPointer jliMethodHandles_Lookup_checkSecurity() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(SunVMGlobals._jliMethodHandles_Lookup_checkSecurityOffset_));
	}

	// jmethodID jliMethodHandles_Lookup_checkSecurity
	public PointerPointer jliMethodHandles_Lookup_checkSecurityEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SunVMGlobals._jliMethodHandles_Lookup_checkSecurityOffset_));
	}

	// I64 lastGCTime
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lastGCTimeOffset_", declaredType="I64")
	public IDATA lastGCTime() throws CorruptDataException {
		return new I64(getLongAtOffset(SunVMGlobals._lastGCTimeOffset_));
	}

	// I64 lastGCTime
	public IDATAPointer lastGCTimeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(SunVMGlobals._lastGCTimeOffset_));
	}

	// void* monitorEnter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_monitorEnterOffset_", declaredType="void*")
	public VoidPointer monitorEnter() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SunVMGlobals._monitorEnterOffset_));
	}

	// void* monitorEnter
	public PointerPointer monitorEnterEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SunVMGlobals._monitorEnterOffset_));
	}

	// void* monitorExit
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_monitorExitOffset_", declaredType="void*")
	public VoidPointer monitorExit() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(SunVMGlobals._monitorExitOffset_));
	}

	// void* monitorExit
	public PointerPointer monitorExitEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(SunVMGlobals._monitorExitOffset_));
	}

	// UDATA threadLibrary
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_threadLibraryOffset_", declaredType="UDATA")
	public UDATA threadLibrary() throws CorruptDataException {
		return getUDATAAtOffset(SunVMGlobals._threadLibraryOffset_);
	}

	// UDATA threadLibrary
	public UDATAPointer threadLibraryEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SunVMGlobals._threadLibraryOffset_));
	}

}
