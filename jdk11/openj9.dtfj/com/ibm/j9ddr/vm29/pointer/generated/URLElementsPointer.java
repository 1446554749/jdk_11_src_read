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
 * Structure: URLElementsPointer
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
 * The generated code will provide getters for all elements in the URLElementsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=URLElements.class)
public class URLElementsPointer extends StructurePointer {

	// NULL
	public static final URLElementsPointer NULL = new URLElementsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected URLElementsPointer(long address) {
		super(address);
	}

	public static URLElementsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static URLElementsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static URLElementsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new URLElementsPointer(address);
	}

	public URLElementsPointer add(long count) {
		return URLElementsPointer.cast(address + (URLElements.SIZEOF * count));
	}

	public URLElementsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public URLElementsPointer addOffset(long offset) {
		return URLElementsPointer.cast(address + offset);
	}

	public URLElementsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public URLElementsPointer sub(long count) {
		return URLElementsPointer.cast(address - (URLElements.SIZEOF * count));
	}

	public URLElementsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public URLElementsPointer subOffset(long offset) {
		return URLElementsPointer.cast(address - offset);
	}

	public URLElementsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public URLElementsPointer untag(long mask) {
		return URLElementsPointer.cast(address & ~mask);
	}

	public URLElementsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return URLElements.SIZEOF;
	}

	// Implementation methods

	// const U8* pathChars
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pathCharsOffset_", declaredType="const U8*")
	public U8Pointer pathChars() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(URLElements._pathCharsOffset_));
	}

	// const U8* pathChars
	public PointerPointer pathCharsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(URLElements._pathCharsOffset_));
	}

	// jsize pathLen
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pathLenOffset_", declaredType="jsize")
	public IDATA pathLen() throws CorruptDataException {
		return new I32(getIntAtOffset(URLElements._pathLenOffset_));
	}

	// jsize pathLen
	public IDATAPointer pathLenEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(URLElements._pathLenOffset_));
	}

	// jstring pathObj
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pathObjOffset_", declaredType="jstring")
	public _jstringPointer pathObj() throws CorruptDataException {
		return _jstringPointer.cast(getPointerAtOffset(URLElements._pathObjOffset_));
	}

	// jstring pathObj
	public PointerPointer pathObjEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(URLElements._pathObjOffset_));
	}

	// const U8* protocolChars
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_protocolCharsOffset_", declaredType="const U8*")
	public U8Pointer protocolChars() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(URLElements._protocolCharsOffset_));
	}

	// const U8* protocolChars
	public PointerPointer protocolCharsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(URLElements._protocolCharsOffset_));
	}

	// jsize protocolLen
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_protocolLenOffset_", declaredType="jsize")
	public IDATA protocolLen() throws CorruptDataException {
		return new I32(getIntAtOffset(URLElements._protocolLenOffset_));
	}

	// jsize protocolLen
	public IDATAPointer protocolLenEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(URLElements._protocolLenOffset_));
	}

	// jstring protocolObj
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_protocolObjOffset_", declaredType="jstring")
	public _jstringPointer protocolObj() throws CorruptDataException {
		return _jstringPointer.cast(getPointerAtOffset(URLElements._protocolObjOffset_));
	}

	// jstring protocolObj
	public PointerPointer protocolObjEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(URLElements._protocolObjOffset_));
	}

}
