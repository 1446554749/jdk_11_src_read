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
 * Structure: OMRTraceEnginePointer
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
 * The generated code will provide getters for all elements in the OMRTraceEnginePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=OMRTraceEngine.class)
public class OMRTraceEnginePointer extends StructurePointer {

	// NULL
	public static final OMRTraceEnginePointer NULL = new OMRTraceEnginePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected OMRTraceEnginePointer(long address) {
		super(address);
	}

	public static OMRTraceEnginePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static OMRTraceEnginePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static OMRTraceEnginePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new OMRTraceEnginePointer(address);
	}

	public OMRTraceEnginePointer add(long count) {
		return OMRTraceEnginePointer.cast(address + (OMRTraceEngine.SIZEOF * count));
	}

	public OMRTraceEnginePointer add(Scalar count) {
		return add(count.longValue());
	}

	public OMRTraceEnginePointer addOffset(long offset) {
		return OMRTraceEnginePointer.cast(address + offset);
	}

	public OMRTraceEnginePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public OMRTraceEnginePointer sub(long count) {
		return OMRTraceEnginePointer.cast(address - (OMRTraceEngine.SIZEOF * count));
	}

	public OMRTraceEnginePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public OMRTraceEnginePointer subOffset(long offset) {
		return OMRTraceEnginePointer.cast(address - offset);
	}

	public OMRTraceEnginePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public OMRTraceEnginePointer untag(long mask) {
		return OMRTraceEnginePointer.cast(address & ~mask);
	}

	public OMRTraceEnginePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return OMRTraceEngine.SIZEOF;
	}

	// Implementation methods

	// OMR_TraceInterface omrTraceIntfS
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_omrTraceIntfSOffset_", declaredType="OMR_TraceInterface")
	public OMR_TraceInterfacePointer omrTraceIntfS() throws CorruptDataException {
		return OMR_TraceInterfacePointer.cast(nonNullFieldEA(OMRTraceEngine._omrTraceIntfSOffset_));
	}

	// OMR_TraceInterface omrTraceIntfS
	public PointerPointer omrTraceIntfSEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRTraceEngine._omrTraceIntfSOffset_));
	}

	// UtInterface* utIntf
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_utIntfOffset_", declaredType="UtInterface*")
	public UtInterfacePointer utIntf() throws CorruptDataException {
		return UtInterfacePointer.cast(getPointerAtOffset(OMRTraceEngine._utIntfOffset_));
	}

	// UtInterface* utIntf
	public PointerPointer utIntfEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRTraceEngine._utIntfOffset_));
	}

	// UtModuleInterface utModuleIntfS
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_utModuleIntfSOffset_", declaredType="UtModuleInterface")
	public UtModuleInterfacePointer utModuleIntfS() throws CorruptDataException {
		return UtModuleInterfacePointer.cast(nonNullFieldEA(OMRTraceEngine._utModuleIntfSOffset_));
	}

	// UtModuleInterface utModuleIntfS
	public PointerPointer utModuleIntfSEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(OMRTraceEngine._utModuleIntfSOffset_));
	}

}
