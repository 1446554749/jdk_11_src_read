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
 * Structure: GeneratorTypeSamplesPointer
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
 * The generated code will provide getters for all elements in the GeneratorTypeSamplesPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=GeneratorTypeSamples.class)
public class GeneratorTypeSamplesPointer extends StructurePointer {

	// NULL
	public static final GeneratorTypeSamplesPointer NULL = new GeneratorTypeSamplesPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected GeneratorTypeSamplesPointer(long address) {
		super(address);
	}

	public static GeneratorTypeSamplesPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static GeneratorTypeSamplesPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static GeneratorTypeSamplesPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new GeneratorTypeSamplesPointer(address);
	}

	public GeneratorTypeSamplesPointer add(long count) {
		return GeneratorTypeSamplesPointer.cast(address + (GeneratorTypeSamples.SIZEOF * count));
	}

	public GeneratorTypeSamplesPointer add(Scalar count) {
		return add(count.longValue());
	}

	public GeneratorTypeSamplesPointer addOffset(long offset) {
		return GeneratorTypeSamplesPointer.cast(address + offset);
	}

	public GeneratorTypeSamplesPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public GeneratorTypeSamplesPointer sub(long count) {
		return GeneratorTypeSamplesPointer.cast(address - (GeneratorTypeSamples.SIZEOF * count));
	}

	public GeneratorTypeSamplesPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public GeneratorTypeSamplesPointer subOffset(long offset) {
		return GeneratorTypeSamplesPointer.cast(address - offset);
	}

	public GeneratorTypeSamplesPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public GeneratorTypeSamplesPointer untag(long mask) {
		return GeneratorTypeSamplesPointer.cast(address & ~mask);
	}

	public GeneratorTypeSamplesPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return GeneratorTypeSamples.SIZEOF;
	}

	// Implementation methods

	// fj9object_t TYPE_FJ9OBJECT
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_TYPE_FJ9OBJECTOffset_", declaredType="fj9object_t")
	public J9ObjectPointer TYPE_FJ9OBJECT() throws CorruptDataException {
		return getObjectReferenceAtOffset(GeneratorTypeSamples._TYPE_FJ9OBJECTOffset_);
	}

	// fj9object_t TYPE_FJ9OBJECT
	public ObjectReferencePointer TYPE_FJ9OBJECTEA() throws CorruptDataException {
		return ObjectReferencePointer.cast(nonNullFieldEA(GeneratorTypeSamples._TYPE_FJ9OBJECTOffset_));
	}

	// j9objectclass_t* TYPE_J9OBJECTCLASS_POINTER
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_TYPE_J9OBJECTCLASS_POINTEROffset_", declaredType="j9objectclass_t*")
	public ObjectClassReferencePointer TYPE_J9OBJECTCLASS_POINTER() throws CorruptDataException {
		// j9objectclass_t* method goes here
		return null;
	}

	// j9objectclass_t* TYPE_J9OBJECTCLASS_POINTER
	public PointerPointer TYPE_J9OBJECTCLASS_POINTEREA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GeneratorTypeSamples._TYPE_J9OBJECTCLASS_POINTEROffset_));
	}

	// j9objectmonitor_t TYPE_J9OBJECTMONITOR
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_TYPE_J9OBJECTMONITOROffset_", declaredType="j9objectmonitor_t")
	public J9ObjectMonitorPointer TYPE_J9OBJECTMONITOR() throws CorruptDataException {
		return getObjectMonitorAtOffset(GeneratorTypeSamples._TYPE_J9OBJECTMONITOROffset_);
	}

	// j9objectmonitor_t TYPE_J9OBJECTMONITOR
	public ObjectMonitorReferencePointer TYPE_J9OBJECTMONITOREA() throws CorruptDataException {
		return ObjectMonitorReferencePointer.cast(nonNullFieldEA(GeneratorTypeSamples._TYPE_J9OBJECTMONITOROffset_));
	}

	// j9objectmonitor_t* TYPE_J9OBJECTMONITOR_POINTER
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_TYPE_J9OBJECTMONITOR_POINTEROffset_", declaredType="j9objectmonitor_t*")
	public ObjectMonitorReferencePointer TYPE_J9OBJECTMONITOR_POINTER() throws CorruptDataException {
		// j9objectmonitor_t* method goes here
		return null;
	}

	// j9objectmonitor_t* TYPE_J9OBJECTMONITOR_POINTER
	public PointerPointer TYPE_J9OBJECTMONITOR_POINTEREA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(GeneratorTypeSamples._TYPE_J9OBJECTMONITOR_POINTEROffset_));
	}

}
