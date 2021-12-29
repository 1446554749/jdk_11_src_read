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
 * Structure: J9VMClassLoadHook2EventPointer
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
 * The generated code will provide getters for all elements in the J9VMClassLoadHook2EventPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9VMClassLoadHook2Event.class)
public class J9VMClassLoadHook2EventPointer extends StructurePointer {

	// NULL
	public static final J9VMClassLoadHook2EventPointer NULL = new J9VMClassLoadHook2EventPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9VMClassLoadHook2EventPointer(long address) {
		super(address);
	}

	public static J9VMClassLoadHook2EventPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9VMClassLoadHook2EventPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9VMClassLoadHook2EventPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9VMClassLoadHook2EventPointer(address);
	}

	public J9VMClassLoadHook2EventPointer add(long count) {
		return J9VMClassLoadHook2EventPointer.cast(address + (J9VMClassLoadHook2Event.SIZEOF * count));
	}

	public J9VMClassLoadHook2EventPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9VMClassLoadHook2EventPointer addOffset(long offset) {
		return J9VMClassLoadHook2EventPointer.cast(address + offset);
	}

	public J9VMClassLoadHook2EventPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9VMClassLoadHook2EventPointer sub(long count) {
		return J9VMClassLoadHook2EventPointer.cast(address - (J9VMClassLoadHook2Event.SIZEOF * count));
	}

	public J9VMClassLoadHook2EventPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9VMClassLoadHook2EventPointer subOffset(long offset) {
		return J9VMClassLoadHook2EventPointer.cast(address - offset);
	}

	public J9VMClassLoadHook2EventPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9VMClassLoadHook2EventPointer untag(long mask) {
		return J9VMClassLoadHook2EventPointer.cast(address & ~mask);
	}

	public J9VMClassLoadHook2EventPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9VMClassLoadHook2Event.SIZEOF;
	}

	// Implementation methods

	// U8* classData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classDataOffset_", declaredType="U8*")
	public U8Pointer classData() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9VMClassLoadHook2Event._classDataOffset_));
	}

	// U8* classData
	public PointerPointer classDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMClassLoadHook2Event._classDataOffset_));
	}

	// UDATA classDataLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classDataLengthOffset_", declaredType="UDATA")
	public UDATA classDataLength() throws CorruptDataException {
		return getUDATAAtOffset(J9VMClassLoadHook2Event._classDataLengthOffset_);
	}

	// UDATA classDataLength
	public UDATAPointer classDataLengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMClassLoadHook2Event._classDataLengthOffset_));
	}

	// UDATA classDataReplaced
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classDataReplacedOffset_", declaredType="UDATA")
	public UDATA classDataReplaced() throws CorruptDataException {
		return getUDATAAtOffset(J9VMClassLoadHook2Event._classDataReplacedOffset_);
	}

	// UDATA classDataReplaced
	public UDATAPointer classDataReplacedEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9VMClassLoadHook2Event._classDataReplacedOffset_));
	}

	// J9ClassLoader* classLoader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classLoaderOffset_", declaredType="J9ClassLoader*")
	public J9ClassLoaderPointer classLoader() throws CorruptDataException {
		return J9ClassLoaderPointer.cast(getPointerAtOffset(J9VMClassLoadHook2Event._classLoaderOffset_));
	}

	// J9ClassLoader* classLoader
	public PointerPointer classLoaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMClassLoadHook2Event._classLoaderOffset_));
	}

	// U8* className
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classNameOffset_", declaredType="U8*")
	public U8Pointer className() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(J9VMClassLoadHook2Event._classNameOffset_));
	}

	// U8* className
	public PointerPointer classNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMClassLoadHook2Event._classNameOffset_));
	}

	// J9VMThread* currentThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentThreadOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer currentThread() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(J9VMClassLoadHook2Event._currentThreadOffset_));
	}

	// J9VMThread* currentThread
	public PointerPointer currentThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMClassLoadHook2Event._currentThreadOffset_));
	}

	// classDataFreeFunction freeFunction
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_freeFunctionOffset_", declaredType="classDataFreeFunction")
	public VoidPointer freeFunction() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VMClassLoadHook2Event._freeFunctionOffset_));
	}

	// classDataFreeFunction freeFunction
	public PointerPointer freeFunctionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMClassLoadHook2Event._freeFunctionOffset_));
	}

	// void* freeUserData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_freeUserDataOffset_", declaredType="void*")
	public VoidPointer freeUserData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9VMClassLoadHook2Event._freeUserDataOffset_));
	}

	// void* freeUserData
	public PointerPointer freeUserDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMClassLoadHook2Event._freeUserDataOffset_));
	}

	// J9Class* oldClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_oldClassOffset_", declaredType="J9Class*")
	public J9ClassPointer oldClass() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9VMClassLoadHook2Event._oldClassOffset_));
	}

	// J9Class* oldClass
	public PointerPointer oldClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMClassLoadHook2Event._oldClassOffset_));
	}

	// j9object_t protectionDomain
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_protectionDomainOffset_", declaredType="j9object_t")
	public J9ObjectPointer protectionDomain() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(J9VMClassLoadHook2Event._protectionDomainOffset_));
	}

	// j9object_t protectionDomain
	public PointerPointer protectionDomainEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9VMClassLoadHook2Event._protectionDomainOffset_));
	}

}
