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
 * Structure: ClassDebugDataProviderPointer
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
 * The generated code will provide getters for all elements in the ClassDebugDataProviderPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=ClassDebugDataProvider.class)
public class ClassDebugDataProviderPointer extends StructurePointer {

	// NULL
	public static final ClassDebugDataProviderPointer NULL = new ClassDebugDataProviderPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected ClassDebugDataProviderPointer(long address) {
		super(address);
	}

	public static ClassDebugDataProviderPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static ClassDebugDataProviderPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static ClassDebugDataProviderPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new ClassDebugDataProviderPointer(address);
	}

	public ClassDebugDataProviderPointer add(long count) {
		return ClassDebugDataProviderPointer.cast(address + (ClassDebugDataProvider.SIZEOF * count));
	}

	public ClassDebugDataProviderPointer add(Scalar count) {
		return add(count.longValue());
	}

	public ClassDebugDataProviderPointer addOffset(long offset) {
		return ClassDebugDataProviderPointer.cast(address + offset);
	}

	public ClassDebugDataProviderPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public ClassDebugDataProviderPointer sub(long count) {
		return ClassDebugDataProviderPointer.cast(address - (ClassDebugDataProvider.SIZEOF * count));
	}

	public ClassDebugDataProviderPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public ClassDebugDataProviderPointer subOffset(long offset) {
		return ClassDebugDataProviderPointer.cast(address - offset);
	}

	public ClassDebugDataProviderPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public ClassDebugDataProviderPointer untag(long mask) {
		return ClassDebugDataProviderPointer.cast(address & ~mask);
	}

	public ClassDebugDataProviderPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return ClassDebugDataProvider.SIZEOF;
	}

	// Implementation methods

	// void* _lntLastUpdate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lntLastUpdateOffset_", declaredType="void*")
	public VoidPointer _lntLastUpdate() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(ClassDebugDataProvider.__lntLastUpdateOffset_));
	}

	// void* _lntLastUpdate
	public PointerPointer _lntLastUpdateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassDebugDataProvider.__lntLastUpdateOffset_));
	}

	// void* _lvtLastUpdate
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lvtLastUpdateOffset_", declaredType="void*")
	public VoidPointer _lvtLastUpdate() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(ClassDebugDataProvider.__lvtLastUpdateOffset_));
	}

	// void* _lvtLastUpdate
	public PointerPointer _lvtLastUpdateEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassDebugDataProvider.__lvtLastUpdateOffset_));
	}

	// U64* _runtimeFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__runtimeFlagsOffset_", declaredType="U64*")
	public UDATAPointer _runtimeFlags() throws CorruptDataException {
		return U64Pointer.cast(getPointerAtOffset(ClassDebugDataProvider.__runtimeFlagsOffset_));
	}

	// U64* _runtimeFlags
	public PointerPointer _runtimeFlagsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassDebugDataProvider.__runtimeFlagsOffset_));
	}

	// U32 _storedLineNumberTableBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__storedLineNumberTableBytesOffset_", declaredType="U32")
	public UDATA _storedLineNumberTableBytes() throws CorruptDataException {
		return new U32(getIntAtOffset(ClassDebugDataProvider.__storedLineNumberTableBytesOffset_));
	}

	// U32 _storedLineNumberTableBytes
	public UDATAPointer _storedLineNumberTableBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ClassDebugDataProvider.__storedLineNumberTableBytesOffset_));
	}

	// U32 _storedLocalVariableTableBytes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__storedLocalVariableTableBytesOffset_", declaredType="U32")
	public UDATA _storedLocalVariableTableBytes() throws CorruptDataException {
		return new U32(getIntAtOffset(ClassDebugDataProvider.__storedLocalVariableTableBytesOffset_));
	}

	// U32 _storedLocalVariableTableBytes
	public UDATAPointer _storedLocalVariableTableBytesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ClassDebugDataProvider.__storedLocalVariableTableBytesOffset_));
	}

	// J9SharedCacheHeader* _theca
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__thecaOffset_", declaredType="J9SharedCacheHeader*")
	public J9SharedCacheHeaderPointer _theca() throws CorruptDataException {
		return J9SharedCacheHeaderPointer.cast(getPointerAtOffset(ClassDebugDataProvider.__thecaOffset_));
	}

	// J9SharedCacheHeader* _theca
	public PointerPointer _thecaEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ClassDebugDataProvider.__thecaOffset_));
	}

	// UDATA _verboseFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__verboseFlagsOffset_", declaredType="UDATA")
	public UDATA _verboseFlags() throws CorruptDataException {
		return getUDATAAtOffset(ClassDebugDataProvider.__verboseFlagsOffset_);
	}

	// UDATA _verboseFlags
	public UDATAPointer _verboseFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ClassDebugDataProvider.__verboseFlagsOffset_));
	}

	// IDATA failureReason
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_failureReasonOffset_", declaredType="IDATA")
	public IDATA failureReason() throws CorruptDataException {
		return getIDATAAtOffset(ClassDebugDataProvider._failureReasonOffset_);
	}

	// IDATA failureReason
	public IDATAPointer failureReasonEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(ClassDebugDataProvider._failureReasonOffset_));
	}

	// UDATA failureValue
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_failureValueOffset_", declaredType="UDATA")
	public UDATA failureValue() throws CorruptDataException {
		return getUDATAAtOffset(ClassDebugDataProvider._failureValueOffset_);
	}

	// UDATA failureValue
	public UDATAPointer failureValueEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(ClassDebugDataProvider._failureValueOffset_));
	}

}
