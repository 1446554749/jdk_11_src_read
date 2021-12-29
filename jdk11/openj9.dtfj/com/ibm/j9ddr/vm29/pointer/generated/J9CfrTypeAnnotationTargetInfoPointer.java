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
 * Structure: J9CfrTypeAnnotationTargetInfoPointer
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
 * The generated code will provide getters for all elements in the J9CfrTypeAnnotationTargetInfoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9CfrTypeAnnotationTargetInfo.class)
public class J9CfrTypeAnnotationTargetInfoPointer extends StructurePointer {

	// NULL
	public static final J9CfrTypeAnnotationTargetInfoPointer NULL = new J9CfrTypeAnnotationTargetInfoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9CfrTypeAnnotationTargetInfoPointer(long address) {
		super(address);
	}

	public static J9CfrTypeAnnotationTargetInfoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9CfrTypeAnnotationTargetInfoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9CfrTypeAnnotationTargetInfoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9CfrTypeAnnotationTargetInfoPointer(address);
	}

	public J9CfrTypeAnnotationTargetInfoPointer add(long count) {
		return J9CfrTypeAnnotationTargetInfoPointer.cast(address + (J9CfrTypeAnnotationTargetInfo.SIZEOF * count));
	}

	public J9CfrTypeAnnotationTargetInfoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9CfrTypeAnnotationTargetInfoPointer addOffset(long offset) {
		return J9CfrTypeAnnotationTargetInfoPointer.cast(address + offset);
	}

	public J9CfrTypeAnnotationTargetInfoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9CfrTypeAnnotationTargetInfoPointer sub(long count) {
		return J9CfrTypeAnnotationTargetInfoPointer.cast(address - (J9CfrTypeAnnotationTargetInfo.SIZEOF * count));
	}

	public J9CfrTypeAnnotationTargetInfoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9CfrTypeAnnotationTargetInfoPointer subOffset(long offset) {
		return J9CfrTypeAnnotationTargetInfoPointer.cast(address - offset);
	}

	public J9CfrTypeAnnotationTargetInfoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9CfrTypeAnnotationTargetInfoPointer untag(long mask) {
		return J9CfrTypeAnnotationTargetInfoPointer.cast(address & ~mask);
	}

	public J9CfrTypeAnnotationTargetInfoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9CfrTypeAnnotationTargetInfo.SIZEOF;
	}

	// Implementation methods

	// J9CfrCatchTarget catchTarget
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_catchTargetOffset_", declaredType="J9CfrCatchTarget")
	public J9CfrCatchTargetPointer catchTarget() throws CorruptDataException {
		return J9CfrCatchTargetPointer.cast(nonNullFieldEA(J9CfrTypeAnnotationTargetInfo._catchTargetOffset_));
	}

	// J9CfrCatchTarget catchTarget
	public PointerPointer catchTargetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CfrTypeAnnotationTargetInfo._catchTargetOffset_));
	}

	// J9CfrLocalvarTarget localvarTarget
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_localvarTargetOffset_", declaredType="J9CfrLocalvarTarget")
	public J9CfrLocalvarTargetPointer localvarTarget() throws CorruptDataException {
		return J9CfrLocalvarTargetPointer.cast(nonNullFieldEA(J9CfrTypeAnnotationTargetInfo._localvarTargetOffset_));
	}

	// J9CfrLocalvarTarget localvarTarget
	public PointerPointer localvarTargetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CfrTypeAnnotationTargetInfo._localvarTargetOffset_));
	}

	// J9CfrMethodFormalParameterTarget methodFormalParameterTarget
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodFormalParameterTargetOffset_", declaredType="J9CfrMethodFormalParameterTarget")
	public J9CfrMethodFormalParameterTargetPointer methodFormalParameterTarget() throws CorruptDataException {
		return J9CfrMethodFormalParameterTargetPointer.cast(nonNullFieldEA(J9CfrTypeAnnotationTargetInfo._methodFormalParameterTargetOffset_));
	}

	// J9CfrMethodFormalParameterTarget methodFormalParameterTarget
	public PointerPointer methodFormalParameterTargetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CfrTypeAnnotationTargetInfo._methodFormalParameterTargetOffset_));
	}

	// J9CfrOffsetTarget offsetTarget
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_offsetTargetOffset_", declaredType="J9CfrOffsetTarget")
	public J9CfrOffsetTargetPointer offsetTarget() throws CorruptDataException {
		return J9CfrOffsetTargetPointer.cast(nonNullFieldEA(J9CfrTypeAnnotationTargetInfo._offsetTargetOffset_));
	}

	// J9CfrOffsetTarget offsetTarget
	public PointerPointer offsetTargetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CfrTypeAnnotationTargetInfo._offsetTargetOffset_));
	}

	// J9CfrSupertypeTarget supertypeTarget
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_supertypeTargetOffset_", declaredType="J9CfrSupertypeTarget")
	public J9CfrSupertypeTargetPointer supertypeTarget() throws CorruptDataException {
		return J9CfrSupertypeTargetPointer.cast(nonNullFieldEA(J9CfrTypeAnnotationTargetInfo._supertypeTargetOffset_));
	}

	// J9CfrSupertypeTarget supertypeTarget
	public PointerPointer supertypeTargetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CfrTypeAnnotationTargetInfo._supertypeTargetOffset_));
	}

	// J9CfrThrowsTarget throwsTarget
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_throwsTargetOffset_", declaredType="J9CfrThrowsTarget")
	public J9CfrThrowsTargetPointer throwsTarget() throws CorruptDataException {
		return J9CfrThrowsTargetPointer.cast(nonNullFieldEA(J9CfrTypeAnnotationTargetInfo._throwsTargetOffset_));
	}

	// J9CfrThrowsTarget throwsTarget
	public PointerPointer throwsTargetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CfrTypeAnnotationTargetInfo._throwsTargetOffset_));
	}

	// J9CfrTypeArgumentTarget typeArgumentTarget
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_typeArgumentTargetOffset_", declaredType="J9CfrTypeArgumentTarget")
	public J9CfrTypeArgumentTargetPointer typeArgumentTarget() throws CorruptDataException {
		return J9CfrTypeArgumentTargetPointer.cast(nonNullFieldEA(J9CfrTypeAnnotationTargetInfo._typeArgumentTargetOffset_));
	}

	// J9CfrTypeArgumentTarget typeArgumentTarget
	public PointerPointer typeArgumentTargetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CfrTypeAnnotationTargetInfo._typeArgumentTargetOffset_));
	}

	// J9CfrTypeParameterBoundTarget typeParameterBoundTarget
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_typeParameterBoundTargetOffset_", declaredType="J9CfrTypeParameterBoundTarget")
	public J9CfrTypeParameterBoundTargetPointer typeParameterBoundTarget() throws CorruptDataException {
		return J9CfrTypeParameterBoundTargetPointer.cast(nonNullFieldEA(J9CfrTypeAnnotationTargetInfo._typeParameterBoundTargetOffset_));
	}

	// J9CfrTypeParameterBoundTarget typeParameterBoundTarget
	public PointerPointer typeParameterBoundTargetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CfrTypeAnnotationTargetInfo._typeParameterBoundTargetOffset_));
	}

	// J9CfrTypeParameterTarget typeParameterTarget
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_typeParameterTargetOffset_", declaredType="J9CfrTypeParameterTarget")
	public J9CfrTypeParameterTargetPointer typeParameterTarget() throws CorruptDataException {
		return J9CfrTypeParameterTargetPointer.cast(nonNullFieldEA(J9CfrTypeAnnotationTargetInfo._typeParameterTargetOffset_));
	}

	// J9CfrTypeParameterTarget typeParameterTarget
	public PointerPointer typeParameterTargetEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9CfrTypeAnnotationTargetInfo._typeParameterTargetOffset_));
	}

}
