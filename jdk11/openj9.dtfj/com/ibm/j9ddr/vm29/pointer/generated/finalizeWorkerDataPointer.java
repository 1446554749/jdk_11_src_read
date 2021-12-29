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
 * Structure: finalizeWorkerDataPointer
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
 * The generated code will provide getters for all elements in the finalizeWorkerDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=finalizeWorkerData.class)
public class finalizeWorkerDataPointer extends StructurePointer {

	// NULL
	public static final finalizeWorkerDataPointer NULL = new finalizeWorkerDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected finalizeWorkerDataPointer(long address) {
		super(address);
	}

	public static finalizeWorkerDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static finalizeWorkerDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static finalizeWorkerDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new finalizeWorkerDataPointer(address);
	}

	public finalizeWorkerDataPointer add(long count) {
		return finalizeWorkerDataPointer.cast(address + (finalizeWorkerData.SIZEOF * count));
	}

	public finalizeWorkerDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public finalizeWorkerDataPointer addOffset(long offset) {
		return finalizeWorkerDataPointer.cast(address + offset);
	}

	public finalizeWorkerDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public finalizeWorkerDataPointer sub(long count) {
		return finalizeWorkerDataPointer.cast(address - (finalizeWorkerData.SIZEOF * count));
	}

	public finalizeWorkerDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public finalizeWorkerDataPointer subOffset(long offset) {
		return finalizeWorkerDataPointer.cast(address - offset);
	}

	public finalizeWorkerDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public finalizeWorkerDataPointer untag(long mask) {
		return finalizeWorkerDataPointer.cast(address & ~mask);
	}

	public finalizeWorkerDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return finalizeWorkerData.SIZEOF;
	}

	// Implementation methods

	// IDATA die
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_dieOffset_", declaredType="IDATA")
	public IDATA die() throws CorruptDataException {
		return getIDATAAtOffset(finalizeWorkerData._dieOffset_);
	}

	// IDATA die
	public IDATAPointer dieEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(finalizeWorkerData._dieOffset_));
	}

	// IDATA finished
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_finishedOffset_", declaredType="IDATA")
	public IDATA finished() throws CorruptDataException {
		return getIDATAAtOffset(finalizeWorkerData._finishedOffset_);
	}

	// IDATA finished
	public IDATAPointer finishedEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(finalizeWorkerData._finishedOffset_));
	}

	// IDATA mode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_modeOffset_", declaredType="IDATA")
	public IDATA mode() throws CorruptDataException {
		return getIDATAAtOffset(finalizeWorkerData._modeOffset_);
	}

	// IDATA mode
	public IDATAPointer modeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(finalizeWorkerData._modeOffset_));
	}

	// omrthread_monitor_t monitor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_monitorOffset_", declaredType="omrthread_monitor_t")
	public J9ThreadMonitorPointer monitor() throws CorruptDataException {
		return J9ThreadMonitorPointer.cast(getPointerAtOffset(finalizeWorkerData._monitorOffset_));
	}

	// omrthread_monitor_t monitor
	public PointerPointer monitorEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(finalizeWorkerData._monitorOffset_));
	}

	// IDATA noWorkDone
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_noWorkDoneOffset_", declaredType="IDATA")
	public IDATA noWorkDone() throws CorruptDataException {
		return getIDATAAtOffset(finalizeWorkerData._noWorkDoneOffset_);
	}

	// IDATA noWorkDone
	public IDATAPointer noWorkDoneEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(finalizeWorkerData._noWorkDoneOffset_));
	}

	// J9JavaVM* vm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer vm() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(finalizeWorkerData._vmOffset_));
	}

	// J9JavaVM* vm
	public PointerPointer vmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(finalizeWorkerData._vmOffset_));
	}

	// J9VMThread* vmThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmThreadOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer vmThread() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(finalizeWorkerData._vmThreadOffset_));
	}

	// J9VMThread* vmThread
	public PointerPointer vmThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(finalizeWorkerData._vmThreadOffset_));
	}

	// IDATA wakeUp
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_wakeUpOffset_", declaredType="IDATA")
	public IDATA wakeUp() throws CorruptDataException {
		return getIDATAAtOffset(finalizeWorkerData._wakeUpOffset_);
	}

	// IDATA wakeUp
	public IDATAPointer wakeUpEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(finalizeWorkerData._wakeUpOffset_));
	}

}
