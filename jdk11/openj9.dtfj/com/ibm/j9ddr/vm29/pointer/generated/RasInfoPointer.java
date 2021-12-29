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
 * Structure: RasInfoPointer
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
 * The generated code will provide getters for all elements in the RasInfoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=RasInfo.class)
public class RasInfoPointer extends StructurePointer {

	// NULL
	public static final RasInfoPointer NULL = new RasInfoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected RasInfoPointer(long address) {
		super(address);
	}

	public static RasInfoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static RasInfoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static RasInfoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new RasInfoPointer(address);
	}

	public RasInfoPointer add(long count) {
		return RasInfoPointer.cast(address + (RasInfo.SIZEOF * count));
	}

	public RasInfoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public RasInfoPointer addOffset(long offset) {
		return RasInfoPointer.cast(address + offset);
	}

	public RasInfoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public RasInfoPointer sub(long count) {
		return RasInfoPointer.cast(address - (RasInfo.SIZEOF * count));
	}

	public RasInfoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public RasInfoPointer subOffset(long offset) {
		return RasInfoPointer.cast(address - offset);
	}

	public RasInfoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public RasInfoPointer untag(long mask) {
		return RasInfoPointer.cast(address & ~mask);
	}

	public RasInfoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return RasInfo.SIZEOF;
	}

	// Implementation methods

	// void** info.query.names
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_info$query$namesOffset_", declaredType="void**")
	public PointerPointer info$query$names() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(RasInfo._info$query$namesOffset_));
	}

	// void** info.query.names
	public PointerPointer info$query$namesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(RasInfo._info$query$namesOffset_));
	}

	// I32 info.query.number
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_info$query$numberOffset_", declaredType="I32")
	public IDATA info$query$number() throws CorruptDataException {
		return new I32(getIntAtOffset(RasInfo._info$query$numberOffset_));
	}

	// I32 info.query.number
	public IDATAPointer info$query$numberEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(RasInfo._info$query$numberOffset_));
	}

	// U8* info.trace_component.bitMap
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_info$trace_component$bitMapOffset_", declaredType="U8*")
	public U8Pointer info$trace_component$bitMap() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(RasInfo._info$trace_component$bitMapOffset_));
	}

	// U8* info.trace_component.bitMap
	public PointerPointer info$trace_component$bitMapEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(RasInfo._info$trace_component$bitMapOffset_));
	}

	// I32 info.trace_component.first
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_info$trace_component$firstOffset_", declaredType="I32")
	public IDATA info$trace_component$first() throws CorruptDataException {
		return new I32(getIntAtOffset(RasInfo._info$trace_component$firstOffset_));
	}

	// I32 info.trace_component.first
	public IDATAPointer info$trace_component$firstEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(RasInfo._info$trace_component$firstOffset_));
	}

	// I32 info.trace_component.last
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_info$trace_component$lastOffset_", declaredType="I32")
	public IDATA info$trace_component$last() throws CorruptDataException {
		return new I32(getIntAtOffset(RasInfo._info$trace_component$lastOffset_));
	}

	// I32 info.trace_component.last
	public IDATAPointer info$trace_component$lastEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(RasInfo._info$trace_component$lastOffset_));
	}

	// U8* info.trace_component.name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_info$trace_component$nameOffset_", declaredType="U8*")
	public U8Pointer info$trace_component$name() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(RasInfo._info$trace_component$nameOffset_));
	}

	// U8* info.trace_component.name
	public PointerPointer info$trace_component$nameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(RasInfo._info$trace_component$nameOffset_));
	}

	// void** info.trace_components.names
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_info$trace_components$namesOffset_", declaredType="void**")
	public PointerPointer info$trace_components$names() throws CorruptDataException {
		return PointerPointer.cast(getPointerAtOffset(RasInfo._info$trace_components$namesOffset_));
	}

	// void** info.trace_components.names
	public PointerPointer info$trace_components$namesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(RasInfo._info$trace_components$namesOffset_));
	}

	// I32 info.trace_components.number
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_info$trace_components$numberOffset_", declaredType="I32")
	public IDATA info$trace_components$number() throws CorruptDataException {
		return new I32(getIntAtOffset(RasInfo._info$trace_components$numberOffset_));
	}

	// I32 info.trace_components.number
	public IDATAPointer info$trace_components$numberEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(RasInfo._info$trace_components$numberOffset_));
	}

	// I32 type
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_typeOffset_", declaredType="I32")
	public IDATA type() throws CorruptDataException {
		return new I32(getIntAtOffset(RasInfo._typeOffset_));
	}

	// I32 type
	public IDATAPointer typeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(RasInfo._typeOffset_));
	}

}
