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
 * Structure: J9JImageIntfPointer
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
 * The generated code will provide getters for all elements in the J9JImageIntfPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9JImageIntf.class)
public class J9JImageIntfPointer extends StructurePointer {

	// NULL
	public static final J9JImageIntfPointer NULL = new J9JImageIntfPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9JImageIntfPointer(long address) {
		super(address);
	}

	public static J9JImageIntfPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9JImageIntfPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9JImageIntfPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9JImageIntfPointer(address);
	}

	public J9JImageIntfPointer add(long count) {
		return J9JImageIntfPointer.cast(address + (J9JImageIntf.SIZEOF * count));
	}

	public J9JImageIntfPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9JImageIntfPointer addOffset(long offset) {
		return J9JImageIntfPointer.cast(address + offset);
	}

	public J9JImageIntfPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9JImageIntfPointer sub(long count) {
		return J9JImageIntfPointer.cast(address - (J9JImageIntf.SIZEOF * count));
	}

	public J9JImageIntfPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9JImageIntfPointer subOffset(long offset) {
		return J9JImageIntfPointer.cast(address - offset);
	}

	public J9JImageIntfPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9JImageIntfPointer untag(long mask) {
		return J9JImageIntfPointer.cast(address & ~mask);
	}

	public J9JImageIntfPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9JImageIntf.SIZEOF;
	}

	// Implementation methods

	// void* jimageClose
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jimageCloseOffset_", declaredType="void*")
	public VoidPointer jimageClose() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JImageIntf._jimageCloseOffset_));
	}

	// void* jimageClose
	public PointerPointer jimageCloseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JImageIntf._jimageCloseOffset_));
	}

	// void* jimageFindResource
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jimageFindResourceOffset_", declaredType="void*")
	public VoidPointer jimageFindResource() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JImageIntf._jimageFindResourceOffset_));
	}

	// void* jimageFindResource
	public PointerPointer jimageFindResourceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JImageIntf._jimageFindResourceOffset_));
	}

	// void* jimageFreeResourceLocation
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jimageFreeResourceLocationOffset_", declaredType="void*")
	public VoidPointer jimageFreeResourceLocation() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JImageIntf._jimageFreeResourceLocationOffset_));
	}

	// void* jimageFreeResourceLocation
	public PointerPointer jimageFreeResourceLocationEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JImageIntf._jimageFreeResourceLocationOffset_));
	}

	// void* jimageGetResource
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jimageGetResourceOffset_", declaredType="void*")
	public VoidPointer jimageGetResource() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JImageIntf._jimageGetResourceOffset_));
	}

	// void* jimageGetResource
	public PointerPointer jimageGetResourceEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JImageIntf._jimageGetResourceOffset_));
	}

	// void* jimageOpen
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jimageOpenOffset_", declaredType="void*")
	public VoidPointer jimageOpen() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JImageIntf._jimageOpenOffset_));
	}

	// void* jimageOpen
	public PointerPointer jimageOpenEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JImageIntf._jimageOpenOffset_));
	}

	// void* jimagePackageToModule
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_jimagePackageToModuleOffset_", declaredType="void*")
	public VoidPointer jimagePackageToModule() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JImageIntf._jimagePackageToModuleOffset_));
	}

	// void* jimagePackageToModule
	public PointerPointer jimagePackageToModuleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JImageIntf._jimagePackageToModuleOffset_));
	}

	// UDATA libJImageHandle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_libJImageHandleOffset_", declaredType="UDATA")
	public UDATA libJImageHandle() throws CorruptDataException {
		return getUDATAAtOffset(J9JImageIntf._libJImageHandleOffset_);
	}

	// UDATA libJImageHandle
	public UDATAPointer libJImageHandleEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9JImageIntf._libJImageHandleOffset_));
	}

	// J9PortLibrary* portLib
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_portLibOffset_", declaredType="J9PortLibrary*")
	public J9PortLibraryPointer portLib() throws CorruptDataException {
		return J9PortLibraryPointer.cast(getPointerAtOffset(J9JImageIntf._portLibOffset_));
	}

	// J9PortLibrary* portLib
	public PointerPointer portLibEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JImageIntf._portLibOffset_));
	}

	// J9JavaVM* vm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_vmOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer vm() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(J9JImageIntf._vmOffset_));
	}

	// J9JavaVM* vm
	public PointerPointer vmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JImageIntf._vmOffset_));
	}

}
