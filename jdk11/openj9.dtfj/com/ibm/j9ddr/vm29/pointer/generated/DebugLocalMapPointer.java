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
 * Structure: DebugLocalMapPointer
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
 * The generated code will provide getters for all elements in the DebugLocalMapPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=DebugLocalMap.class)
public class DebugLocalMapPointer extends StructurePointer {

	// NULL
	public static final DebugLocalMapPointer NULL = new DebugLocalMapPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected DebugLocalMapPointer(long address) {
		super(address);
	}

	public static DebugLocalMapPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static DebugLocalMapPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static DebugLocalMapPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new DebugLocalMapPointer(address);
	}

	public DebugLocalMapPointer add(long count) {
		return DebugLocalMapPointer.cast(address + (DebugLocalMap.SIZEOF * count));
	}

	public DebugLocalMapPointer add(Scalar count) {
		return add(count.longValue());
	}

	public DebugLocalMapPointer addOffset(long offset) {
		return DebugLocalMapPointer.cast(address + offset);
	}

	public DebugLocalMapPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public DebugLocalMapPointer sub(long count) {
		return DebugLocalMapPointer.cast(address - (DebugLocalMap.SIZEOF * count));
	}

	public DebugLocalMapPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public DebugLocalMapPointer subOffset(long offset) {
		return DebugLocalMapPointer.cast(address - offset);
	}

	public DebugLocalMapPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public DebugLocalMapPointer untag(long mask) {
		return DebugLocalMapPointer.cast(address & ~mask);
	}

	public DebugLocalMapPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return DebugLocalMap.SIZEOF;
	}

	// Implementation methods

	// U8* bytecodeMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bytecodeMapOffset_", declaredType="U8*")
	public U8Pointer bytecodeMap() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(DebugLocalMap._bytecodeMapOffset_));
	}

	// U8* bytecodeMap
	public PointerPointer bytecodeMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DebugLocalMap._bytecodeMapOffset_));
	}

	// U32 currentLocals
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentLocalsOffset_", declaredType="U32")
	public UDATA currentLocals() throws CorruptDataException {
		return new U32(getIntAtOffset(DebugLocalMap._currentLocalsOffset_));
	}

	// U32 currentLocals
	public UDATAPointer currentLocalsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(DebugLocalMap._currentLocalsOffset_));
	}

	// U32* mapArray
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_mapArrayOffset_", declaredType="U32*")
	public UDATAPointer mapArray() throws CorruptDataException {
		return U32Pointer.cast(getPointerAtOffset(DebugLocalMap._mapArrayOffset_));
	}

	// U32* mapArray
	public PointerPointer mapArrayEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DebugLocalMap._mapArrayOffset_));
	}

	// U32* resultArrayBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_resultArrayBaseOffset_", declaredType="U32*")
	public UDATAPointer resultArrayBase() throws CorruptDataException {
		return U32Pointer.cast(getPointerAtOffset(DebugLocalMap._resultArrayBaseOffset_));
	}

	// U32* resultArrayBase
	public PointerPointer resultArrayBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DebugLocalMap._resultArrayBaseOffset_));
	}

	// J9ROMClass* romClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romClassOffset_", declaredType="J9ROMClass*")
	public J9ROMClassPointer romClass() throws CorruptDataException {
		return J9ROMClassPointer.cast(getPointerAtOffset(DebugLocalMap._romClassOffset_));
	}

	// J9ROMClass* romClass
	public PointerPointer romClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DebugLocalMap._romClassOffset_));
	}

	// J9ROMMethod* romMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romMethodOffset_", declaredType="J9ROMMethod*")
	public J9ROMMethodPointer romMethod() throws CorruptDataException {
		return J9ROMMethodPointer.cast(getPointerAtOffset(DebugLocalMap._romMethodOffset_));
	}

	// J9ROMMethod* romMethod
	public PointerPointer romMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DebugLocalMap._romMethodOffset_));
	}

	// U32* rootStack
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_rootStackOffset_", declaredType="U32*")
	public UDATAPointer rootStack() throws CorruptDataException {
		return U32Pointer.cast(getPointerAtOffset(DebugLocalMap._rootStackOffset_));
	}

	// U32* rootStack
	public PointerPointer rootStackEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DebugLocalMap._rootStackOffset_));
	}

	// U32* rootStackTop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_rootStackTopOffset_", declaredType="U32*")
	public UDATAPointer rootStackTop() throws CorruptDataException {
		return U32Pointer.cast(getPointerAtOffset(DebugLocalMap._rootStackTopOffset_));
	}

	// U32* rootStackTop
	public PointerPointer rootStackTopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(DebugLocalMap._rootStackTopOffset_));
	}

	// UDATA targetPC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_targetPCOffset_", declaredType="UDATA")
	public UDATA targetPC() throws CorruptDataException {
		return getUDATAAtOffset(DebugLocalMap._targetPCOffset_);
	}

	// UDATA targetPC
	public UDATAPointer targetPCEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(DebugLocalMap._targetPCOffset_));
	}

}
