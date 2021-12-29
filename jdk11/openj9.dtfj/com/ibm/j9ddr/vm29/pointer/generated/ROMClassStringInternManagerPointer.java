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
 * Structure: ROMClassStringInternManagerPointer
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
 * The generated code will provide getters for all elements in the ROMClassStringInternManagerPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=ROMClassStringInternManager.class)
public class ROMClassStringInternManagerPointer extends StructurePointer {

	// NULL
	public static final ROMClassStringInternManagerPointer NULL = new ROMClassStringInternManagerPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected ROMClassStringInternManagerPointer(long address) {
		super(address);
	}

	public static ROMClassStringInternManagerPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static ROMClassStringInternManagerPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static ROMClassStringInternManagerPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new ROMClassStringInternManagerPointer(address);
	}

	public ROMClassStringInternManagerPointer add(long count) {
		return ROMClassStringInternManagerPointer.cast(address + (ROMClassStringInternManager.SIZEOF * count));
	}

	public ROMClassStringInternManagerPointer add(Scalar count) {
		return add(count.longValue());
	}

	public ROMClassStringInternManagerPointer addOffset(long offset) {
		return ROMClassStringInternManagerPointer.cast(address + offset);
	}

	public ROMClassStringInternManagerPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public ROMClassStringInternManagerPointer sub(long count) {
		return ROMClassStringInternManagerPointer.cast(address - (ROMClassStringInternManager.SIZEOF * count));
	}

	public ROMClassStringInternManagerPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public ROMClassStringInternManagerPointer subOffset(long offset) {
		return ROMClassStringInternManagerPointer.cast(address - offset);
	}

	public ROMClassStringInternManagerPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public ROMClassStringInternManagerPointer untag(long mask) {
		return ROMClassStringInternManagerPointer.cast(address & ~mask);
	}

	public ROMClassStringInternManagerPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return ROMClassStringInternManager.SIZEOF;
	}

	// Implementation methods

	// IDATA _baseAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__baseAddressOffset_", declaredType="IDATA")
	public IDATA _baseAddress() throws CorruptDataException {
		return getIDATAAtOffset(ROMClassStringInternManager.__baseAddressOffset_);
	}

	// IDATA _baseAddress
	public IDATAPointer _baseAddressEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(ROMClassStringInternManager.__baseAddressOffset_));
	}

	// ROMClassCreationContext* _context
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__contextOffset_", declaredType="ROMClassCreationContext*")
	public ROMClassCreationContextPointer _context() throws CorruptDataException {
		return ROMClassCreationContextPointer.cast(getPointerAtOffset(ROMClassStringInternManager.__contextOffset_));
	}

	// ROMClassCreationContext* _context
	public PointerPointer _contextEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassStringInternManager.__contextOffset_));
	}

	// IDATA _endAddress
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__endAddressOffset_", declaredType="IDATA")
	public IDATA _endAddress() throws CorruptDataException {
		return getIDATAAtOffset(ROMClassStringInternManager.__endAddressOffset_);
	}

	// IDATA _endAddress
	public IDATAPointer _endAddressEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(ROMClassStringInternManager.__endAddressOffset_));
	}

	// bool _hasStringTableLock
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__hasStringTableLockOffset_", declaredType="bool")
	public boolean _hasStringTableLock() throws CorruptDataException {
		return getBoolAtOffset(ROMClassStringInternManager.__hasStringTableLockOffset_);
	}

	// bool _hasStringTableLock
	public BoolPointer _hasStringTableLockEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ROMClassStringInternManager.__hasStringTableLockOffset_));
	}

	// bool _isSharedROMClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isSharedROMClassOffset_", declaredType="bool")
	public boolean _isSharedROMClass() throws CorruptDataException {
		return getBoolAtOffset(ROMClassStringInternManager.__isSharedROMClassOffset_);
	}

	// bool _isSharedROMClass
	public BoolPointer _isSharedROMClassEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ROMClassStringInternManager.__isSharedROMClassOffset_));
	}

	// SRPKeyProducer* _srpKeyProducer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__srpKeyProducerOffset_", declaredType="SRPKeyProducer*")
	public SRPKeyProducerPointer _srpKeyProducer() throws CorruptDataException {
		return SRPKeyProducerPointer.cast(getPointerAtOffset(ROMClassStringInternManager.__srpKeyProducerOffset_));
	}

	// SRPKeyProducer* _srpKeyProducer
	public PointerPointer _srpKeyProducerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassStringInternManager.__srpKeyProducerOffset_));
	}

	// SRPOffsetTable* _srpOffsetTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__srpOffsetTableOffset_", declaredType="SRPOffsetTable*")
	public SRPOffsetTablePointer _srpOffsetTable() throws CorruptDataException {
		return SRPOffsetTablePointer.cast(getPointerAtOffset(ROMClassStringInternManager.__srpOffsetTableOffset_));
	}

	// SRPOffsetTable* _srpOffsetTable
	public PointerPointer _srpOffsetTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassStringInternManager.__srpOffsetTableOffset_));
	}

	// StringInternTable* _stringInternTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__stringInternTableOffset_", declaredType="StringInternTable*")
	public StringInternTablePointer _stringInternTable() throws CorruptDataException {
		return StringInternTablePointer.cast(getPointerAtOffset(ROMClassStringInternManager.__stringInternTableOffset_));
	}

	// StringInternTable* _stringInternTable
	public PointerPointer _stringInternTableEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ROMClassStringInternManager.__stringInternTableOffset_));
	}

}
