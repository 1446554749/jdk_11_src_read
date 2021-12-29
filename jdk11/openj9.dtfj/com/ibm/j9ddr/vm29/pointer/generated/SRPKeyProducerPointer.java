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
 * Structure: SRPKeyProducerPointer
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
 * The generated code will provide getters for all elements in the SRPKeyProducerPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=SRPKeyProducer.class)
public class SRPKeyProducerPointer extends StructurePointer {

	// NULL
	public static final SRPKeyProducerPointer NULL = new SRPKeyProducerPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected SRPKeyProducerPointer(long address) {
		super(address);
	}

	public static SRPKeyProducerPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static SRPKeyProducerPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static SRPKeyProducerPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new SRPKeyProducerPointer(address);
	}

	public SRPKeyProducerPointer add(long count) {
		return SRPKeyProducerPointer.cast(address + (SRPKeyProducer.SIZEOF * count));
	}

	public SRPKeyProducerPointer add(Scalar count) {
		return add(count.longValue());
	}

	public SRPKeyProducerPointer addOffset(long offset) {
		return SRPKeyProducerPointer.cast(address + offset);
	}

	public SRPKeyProducerPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public SRPKeyProducerPointer sub(long count) {
		return SRPKeyProducerPointer.cast(address - (SRPKeyProducer.SIZEOF * count));
	}

	public SRPKeyProducerPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public SRPKeyProducerPointer subOffset(long offset) {
		return SRPKeyProducerPointer.cast(address - offset);
	}

	public SRPKeyProducerPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public SRPKeyProducerPointer untag(long mask) {
		return SRPKeyProducerPointer.cast(address & ~mask);
	}

	public SRPKeyProducerPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return SRPKeyProducer.SIZEOF;
	}

	// Implementation methods

	// U16 _cfrConstantPoolCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__cfrConstantPoolCountOffset_", declaredType="U16")
	public U16 _cfrConstantPoolCount() throws CorruptDataException {
		return new U16(getShortAtOffset(SRPKeyProducer.__cfrConstantPoolCountOffset_));
	}

	// U16 _cfrConstantPoolCount
	public U16Pointer _cfrConstantPoolCountEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(SRPKeyProducer.__cfrConstantPoolCountOffset_));
	}

	// bool _getMaxKeyWasCalled
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__getMaxKeyWasCalledOffset_", declaredType="bool")
	public boolean _getMaxKeyWasCalled() throws CorruptDataException {
		return getBoolAtOffset(SRPKeyProducer.__getMaxKeyWasCalledOffset_);
	}

	// bool _getMaxKeyWasCalled
	public BoolPointer _getMaxKeyWasCalledEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(SRPKeyProducer.__getMaxKeyWasCalledOffset_));
	}

	// UDATA _maxKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__maxKeyOffset_", declaredType="UDATA")
	public UDATA _maxKey() throws CorruptDataException {
		return getUDATAAtOffset(SRPKeyProducer.__maxKeyOffset_);
	}

	// UDATA _maxKey
	public UDATAPointer _maxKeyEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SRPKeyProducer.__maxKeyOffset_));
	}

	// U16 _methodCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__methodCountOffset_", declaredType="U16")
	public U16 _methodCount() throws CorruptDataException {
		return new U16(getShortAtOffset(SRPKeyProducer.__methodCountOffset_));
	}

	// U16 _methodCount
	public U16Pointer _methodCountEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(SRPKeyProducer.__methodCountOffset_));
	}

	// UDATA _startMethodDebugInfoKeys
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__startMethodDebugInfoKeysOffset_", declaredType="UDATA")
	public UDATA _startMethodDebugInfoKeys() throws CorruptDataException {
		return getUDATAAtOffset(SRPKeyProducer.__startMethodDebugInfoKeysOffset_);
	}

	// UDATA _startMethodDebugInfoKeys
	public UDATAPointer _startMethodDebugInfoKeysEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SRPKeyProducer.__startMethodDebugInfoKeysOffset_));
	}

	// UDATA _startStackMapKeys
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__startStackMapKeysOffset_", declaredType="UDATA")
	public UDATA _startStackMapKeys() throws CorruptDataException {
		return getUDATAAtOffset(SRPKeyProducer.__startStackMapKeysOffset_);
	}

	// UDATA _startStackMapKeys
	public UDATAPointer _startStackMapKeysEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SRPKeyProducer.__startStackMapKeysOffset_));
	}

	// UDATA _startVariableInfoKeys
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__startVariableInfoKeysOffset_", declaredType="UDATA")
	public UDATA _startVariableInfoKeys() throws CorruptDataException {
		return getUDATAAtOffset(SRPKeyProducer.__startVariableInfoKeysOffset_);
	}

	// UDATA _startVariableInfoKeys
	public UDATAPointer _startVariableInfoKeysEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(SRPKeyProducer.__startVariableInfoKeysOffset_));
	}

}
