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
 * Structure: J9ReflectFunctionTablePointer
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
 * The generated code will provide getters for all elements in the J9ReflectFunctionTablePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9ReflectFunctionTable.class)
public class J9ReflectFunctionTablePointer extends StructurePointer {

	// NULL
	public static final J9ReflectFunctionTablePointer NULL = new J9ReflectFunctionTablePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9ReflectFunctionTablePointer(long address) {
		super(address);
	}

	public static J9ReflectFunctionTablePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9ReflectFunctionTablePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9ReflectFunctionTablePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9ReflectFunctionTablePointer(address);
	}

	public J9ReflectFunctionTablePointer add(long count) {
		return J9ReflectFunctionTablePointer.cast(address + (J9ReflectFunctionTable.SIZEOF * count));
	}

	public J9ReflectFunctionTablePointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9ReflectFunctionTablePointer addOffset(long offset) {
		return J9ReflectFunctionTablePointer.cast(address + offset);
	}

	public J9ReflectFunctionTablePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9ReflectFunctionTablePointer sub(long count) {
		return J9ReflectFunctionTablePointer.cast(address - (J9ReflectFunctionTable.SIZEOF * count));
	}

	public J9ReflectFunctionTablePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9ReflectFunctionTablePointer subOffset(long offset) {
		return J9ReflectFunctionTablePointer.cast(address - offset);
	}

	public J9ReflectFunctionTablePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9ReflectFunctionTablePointer untag(long mask) {
		return J9ReflectFunctionTablePointer.cast(address & ~mask);
	}

	public J9ReflectFunctionTablePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9ReflectFunctionTable.SIZEOF;
	}

	// Implementation methods

	// void* createConstructorObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_createConstructorObjectOffset_", declaredType="void*")
	public VoidPointer createConstructorObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ReflectFunctionTable._createConstructorObjectOffset_));
	}

	// void* createConstructorObject
	public PointerPointer createConstructorObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ReflectFunctionTable._createConstructorObjectOffset_));
	}

	// void* createDeclaredConstructorObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_createDeclaredConstructorObjectOffset_", declaredType="void*")
	public VoidPointer createDeclaredConstructorObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ReflectFunctionTable._createDeclaredConstructorObjectOffset_));
	}

	// void* createDeclaredConstructorObject
	public PointerPointer createDeclaredConstructorObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ReflectFunctionTable._createDeclaredConstructorObjectOffset_));
	}

	// void* createDeclaredMethodObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_createDeclaredMethodObjectOffset_", declaredType="void*")
	public VoidPointer createDeclaredMethodObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ReflectFunctionTable._createDeclaredMethodObjectOffset_));
	}

	// void* createDeclaredMethodObject
	public PointerPointer createDeclaredMethodObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ReflectFunctionTable._createDeclaredMethodObjectOffset_));
	}

	// void* createFieldObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_createFieldObjectOffset_", declaredType="void*")
	public VoidPointer createFieldObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ReflectFunctionTable._createFieldObjectOffset_));
	}

	// void* createFieldObject
	public PointerPointer createFieldObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ReflectFunctionTable._createFieldObjectOffset_));
	}

	// void* createMethodObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_createMethodObjectOffset_", declaredType="void*")
	public VoidPointer createMethodObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ReflectFunctionTable._createMethodObjectOffset_));
	}

	// void* createMethodObject
	public PointerPointer createMethodObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ReflectFunctionTable._createMethodObjectOffset_));
	}

	// void* fillInReflectMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_fillInReflectMethodOffset_", declaredType="void*")
	public VoidPointer fillInReflectMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ReflectFunctionTable._fillInReflectMethodOffset_));
	}

	// void* fillInReflectMethod
	public PointerPointer fillInReflectMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ReflectFunctionTable._fillInReflectMethodOffset_));
	}

	// void* idFromConstructorObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_idFromConstructorObjectOffset_", declaredType="void*")
	public VoidPointer idFromConstructorObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ReflectFunctionTable._idFromConstructorObjectOffset_));
	}

	// void* idFromConstructorObject
	public PointerPointer idFromConstructorObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ReflectFunctionTable._idFromConstructorObjectOffset_));
	}

	// void* idFromFieldObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_idFromFieldObjectOffset_", declaredType="void*")
	public VoidPointer idFromFieldObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ReflectFunctionTable._idFromFieldObjectOffset_));
	}

	// void* idFromFieldObject
	public PointerPointer idFromFieldObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ReflectFunctionTable._idFromFieldObjectOffset_));
	}

	// void* idFromMethodObject
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_idFromMethodObjectOffset_", declaredType="void*")
	public VoidPointer idFromMethodObject() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ReflectFunctionTable._idFromMethodObjectOffset_));
	}

	// void* idFromMethodObject
	public PointerPointer idFromMethodObjectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ReflectFunctionTable._idFromMethodObjectOffset_));
	}

	// void* idToReflectField
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_idToReflectFieldOffset_", declaredType="void*")
	public VoidPointer idToReflectField() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ReflectFunctionTable._idToReflectFieldOffset_));
	}

	// void* idToReflectField
	public PointerPointer idToReflectFieldEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ReflectFunctionTable._idToReflectFieldOffset_));
	}

	// void* idToReflectMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_idToReflectMethodOffset_", declaredType="void*")
	public VoidPointer idToReflectMethod() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ReflectFunctionTable._idToReflectMethodOffset_));
	}

	// void* idToReflectMethod
	public PointerPointer idToReflectMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ReflectFunctionTable._idToReflectMethodOffset_));
	}

	// void* reflectFieldToID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reflectFieldToIDOffset_", declaredType="void*")
	public VoidPointer reflectFieldToID() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ReflectFunctionTable._reflectFieldToIDOffset_));
	}

	// void* reflectFieldToID
	public PointerPointer reflectFieldToIDEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ReflectFunctionTable._reflectFieldToIDOffset_));
	}

	// void* reflectMethodToID
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reflectMethodToIDOffset_", declaredType="void*")
	public VoidPointer reflectMethodToID() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9ReflectFunctionTable._reflectMethodToIDOffset_));
	}

	// void* reflectMethodToID
	public PointerPointer reflectMethodToIDEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9ReflectFunctionTable._reflectMethodToIDOffset_));
	}

}
