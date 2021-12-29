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
 * Structure: MM_VerboseFileLoggingOutputPointer
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
 * The generated code will provide getters for all elements in the MM_VerboseFileLoggingOutputPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_VerboseFileLoggingOutput.class)
public class MM_VerboseFileLoggingOutputPointer extends MM_VerboseOutputAgentPointer {

	// NULL
	public static final MM_VerboseFileLoggingOutputPointer NULL = new MM_VerboseFileLoggingOutputPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_VerboseFileLoggingOutputPointer(long address) {
		super(address);
	}

	public static MM_VerboseFileLoggingOutputPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_VerboseFileLoggingOutputPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_VerboseFileLoggingOutputPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_VerboseFileLoggingOutputPointer(address);
	}

	public MM_VerboseFileLoggingOutputPointer add(long count) {
		return MM_VerboseFileLoggingOutputPointer.cast(address + (MM_VerboseFileLoggingOutput.SIZEOF * count));
	}

	public MM_VerboseFileLoggingOutputPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_VerboseFileLoggingOutputPointer addOffset(long offset) {
		return MM_VerboseFileLoggingOutputPointer.cast(address + offset);
	}

	public MM_VerboseFileLoggingOutputPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_VerboseFileLoggingOutputPointer sub(long count) {
		return MM_VerboseFileLoggingOutputPointer.cast(address - (MM_VerboseFileLoggingOutput.SIZEOF * count));
	}

	public MM_VerboseFileLoggingOutputPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_VerboseFileLoggingOutputPointer subOffset(long offset) {
		return MM_VerboseFileLoggingOutputPointer.cast(address - offset);
	}

	public MM_VerboseFileLoggingOutputPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_VerboseFileLoggingOutputPointer untag(long mask) {
		return MM_VerboseFileLoggingOutputPointer.cast(address & ~mask);
	}

	public MM_VerboseFileLoggingOutputPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_VerboseFileLoggingOutput.SIZEOF;
	}

	// Implementation methods

	// UDATA _currentCycle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentCycleOffset_", declaredType="UDATA")
	public UDATA _currentCycle() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseFileLoggingOutput.__currentCycleOffset_);
	}

	// UDATA _currentCycle
	public UDATAPointer _currentCycleEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseFileLoggingOutput.__currentCycleOffset_));
	}

	// UDATA _currentFile
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__currentFileOffset_", declaredType="UDATA")
	public UDATA _currentFile() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseFileLoggingOutput.__currentFileOffset_);
	}

	// UDATA _currentFile
	public UDATAPointer _currentFileEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseFileLoggingOutput.__currentFileOffset_));
	}

	// U8* _filename
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__filenameOffset_", declaredType="U8*")
	public U8Pointer _filename() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(MM_VerboseFileLoggingOutput.__filenameOffset_));
	}

	// U8* _filename
	public PointerPointer _filenameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VerboseFileLoggingOutput.__filenameOffset_));
	}

	// IDATA _logFileDescriptor
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__logFileDescriptorOffset_", declaredType="IDATA")
	public IDATA _logFileDescriptor() throws CorruptDataException {
		return getIDATAAtOffset(MM_VerboseFileLoggingOutput.__logFileDescriptorOffset_);
	}

	// IDATA _logFileDescriptor
	public IDATAPointer _logFileDescriptorEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(MM_VerboseFileLoggingOutput.__logFileDescriptorOffset_));
	}

	// UDATA _mode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__modeOffset_", declaredType="UDATA")
	public UDATA _mode() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseFileLoggingOutput.__modeOffset_);
	}

	// UDATA _mode
	public UDATAPointer _modeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseFileLoggingOutput.__modeOffset_));
	}

	// UDATA _numCycles
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__numCyclesOffset_", declaredType="UDATA")
	public UDATA _numCycles() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseFileLoggingOutput.__numCyclesOffset_);
	}

	// UDATA _numCycles
	public UDATAPointer _numCyclesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseFileLoggingOutput.__numCyclesOffset_));
	}

	// UDATA _numFiles
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__numFilesOffset_", declaredType="UDATA")
	public UDATA _numFiles() throws CorruptDataException {
		return getUDATAAtOffset(MM_VerboseFileLoggingOutput.__numFilesOffset_);
	}

	// UDATA _numFiles
	public UDATAPointer _numFilesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(MM_VerboseFileLoggingOutput.__numFilesOffset_));
	}

	// J9StringTokens* _tokens
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__tokensOffset_", declaredType="J9StringTokens*")
	public J9StringTokensPointer _tokens() throws CorruptDataException {
		return J9StringTokensPointer.cast(getPointerAtOffset(MM_VerboseFileLoggingOutput.__tokensOffset_));
	}

	// J9StringTokens* _tokens
	public PointerPointer _tokensEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_VerboseFileLoggingOutput.__tokensOffset_));
	}

}
