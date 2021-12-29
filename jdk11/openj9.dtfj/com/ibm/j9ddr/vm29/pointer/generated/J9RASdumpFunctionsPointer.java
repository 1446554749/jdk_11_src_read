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
 * Structure: J9RASdumpFunctionsPointer
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
 * The generated code will provide getters for all elements in the J9RASdumpFunctionsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9RASdumpFunctions.class)
public class J9RASdumpFunctionsPointer extends StructurePointer {

	// NULL
	public static final J9RASdumpFunctionsPointer NULL = new J9RASdumpFunctionsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9RASdumpFunctionsPointer(long address) {
		super(address);
	}

	public static J9RASdumpFunctionsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9RASdumpFunctionsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9RASdumpFunctionsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9RASdumpFunctionsPointer(address);
	}

	public J9RASdumpFunctionsPointer add(long count) {
		return J9RASdumpFunctionsPointer.cast(address + (J9RASdumpFunctions.SIZEOF * count));
	}

	public J9RASdumpFunctionsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9RASdumpFunctionsPointer addOffset(long offset) {
		return J9RASdumpFunctionsPointer.cast(address + offset);
	}

	public J9RASdumpFunctionsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9RASdumpFunctionsPointer sub(long count) {
		return J9RASdumpFunctionsPointer.cast(address - (J9RASdumpFunctions.SIZEOF * count));
	}

	public J9RASdumpFunctionsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9RASdumpFunctionsPointer subOffset(long offset) {
		return J9RASdumpFunctionsPointer.cast(address - offset);
	}

	public J9RASdumpFunctionsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9RASdumpFunctionsPointer untag(long mask) {
		return J9RASdumpFunctionsPointer.cast(address & ~mask);
	}

	public J9RASdumpFunctionsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9RASdumpFunctions.SIZEOF;
	}

	// Implementation methods

	// void* insertDumpAgent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_insertDumpAgentOffset_", declaredType="void*")
	public VoidPointer insertDumpAgent() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9RASdumpFunctions._insertDumpAgentOffset_));
	}

	// void* insertDumpAgent
	public PointerPointer insertDumpAgentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9RASdumpFunctions._insertDumpAgentOffset_));
	}

	// void* queryVmDump
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_queryVmDumpOffset_", declaredType="void*")
	public VoidPointer queryVmDump() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9RASdumpFunctions._queryVmDumpOffset_));
	}

	// void* queryVmDump
	public PointerPointer queryVmDumpEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9RASdumpFunctions._queryVmDumpOffset_));
	}

	// void* removeDumpAgent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_removeDumpAgentOffset_", declaredType="void*")
	public VoidPointer removeDumpAgent() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9RASdumpFunctions._removeDumpAgentOffset_));
	}

	// void* removeDumpAgent
	public PointerPointer removeDumpAgentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9RASdumpFunctions._removeDumpAgentOffset_));
	}

	// void* reserved
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reservedOffset_", declaredType="void*")
	public VoidPointer reserved() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9RASdumpFunctions._reservedOffset_));
	}

	// void* reserved
	public PointerPointer reservedEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9RASdumpFunctions._reservedOffset_));
	}

	// void* resetDumpOptions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resetDumpOptionsOffset_", declaredType="void*")
	public VoidPointer resetDumpOptions() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9RASdumpFunctions._resetDumpOptionsOffset_));
	}

	// void* resetDumpOptions
	public PointerPointer resetDumpOptionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9RASdumpFunctions._resetDumpOptionsOffset_));
	}

	// void* seekDumpAgent
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_seekDumpAgentOffset_", declaredType="void*")
	public VoidPointer seekDumpAgent() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9RASdumpFunctions._seekDumpAgentOffset_));
	}

	// void* seekDumpAgent
	public PointerPointer seekDumpAgentEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9RASdumpFunctions._seekDumpAgentOffset_));
	}

	// void* setDumpOption
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_setDumpOptionOffset_", declaredType="void*")
	public VoidPointer setDumpOption() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9RASdumpFunctions._setDumpOptionOffset_));
	}

	// void* setDumpOption
	public PointerPointer setDumpOptionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9RASdumpFunctions._setDumpOptionOffset_));
	}

	// void* triggerDumpAgents
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_triggerDumpAgentsOffset_", declaredType="void*")
	public VoidPointer triggerDumpAgents() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9RASdumpFunctions._triggerDumpAgentsOffset_));
	}

	// void* triggerDumpAgents
	public PointerPointer triggerDumpAgentsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9RASdumpFunctions._triggerDumpAgentsOffset_));
	}

	// void* triggerOneOffDump
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_triggerOneOffDumpOffset_", declaredType="void*")
	public VoidPointer triggerOneOffDump() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9RASdumpFunctions._triggerOneOffDumpOffset_));
	}

	// void* triggerOneOffDump
	public PointerPointer triggerOneOffDumpEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9RASdumpFunctions._triggerOneOffDumpOffset_));
	}

}
