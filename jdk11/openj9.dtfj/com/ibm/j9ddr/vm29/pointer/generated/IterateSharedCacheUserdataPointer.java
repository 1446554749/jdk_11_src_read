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
 * Structure: IterateSharedCacheUserdataPointer
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
 * The generated code will provide getters for all elements in the IterateSharedCacheUserdataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=IterateSharedCacheUserdata.class)
public class IterateSharedCacheUserdataPointer extends StructurePointer {

	// NULL
	public static final IterateSharedCacheUserdataPointer NULL = new IterateSharedCacheUserdataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected IterateSharedCacheUserdataPointer(long address) {
		super(address);
	}

	public static IterateSharedCacheUserdataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static IterateSharedCacheUserdataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static IterateSharedCacheUserdataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new IterateSharedCacheUserdataPointer(address);
	}

	public IterateSharedCacheUserdataPointer add(long count) {
		return IterateSharedCacheUserdataPointer.cast(address + (IterateSharedCacheUserdata.SIZEOF * count));
	}

	public IterateSharedCacheUserdataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public IterateSharedCacheUserdataPointer addOffset(long offset) {
		return IterateSharedCacheUserdataPointer.cast(address + offset);
	}

	public IterateSharedCacheUserdataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public IterateSharedCacheUserdataPointer sub(long count) {
		return IterateSharedCacheUserdataPointer.cast(address - (IterateSharedCacheUserdata.SIZEOF * count));
	}

	public IterateSharedCacheUserdataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public IterateSharedCacheUserdataPointer subOffset(long offset) {
		return IterateSharedCacheUserdataPointer.cast(address - offset);
	}

	public IterateSharedCacheUserdataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public IterateSharedCacheUserdataPointer untag(long mask) {
		return IterateSharedCacheUserdataPointer.cast(address & ~mask);
	}

	public IterateSharedCacheUserdataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return IterateSharedCacheUserdata.SIZEOF;
	}

	// Implementation methods

	// jvmtiIterateSharedCachesCallback callback
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_callbackOffset_", declaredType="jvmtiIterateSharedCachesCallback")
	public VoidPointer callback() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(IterateSharedCacheUserdata._callbackOffset_));
	}

	// jvmtiIterateSharedCachesCallback callback
	public PointerPointer callbackEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(IterateSharedCacheUserdata._callbackOffset_));
	}

	// jvmtiEnv* env
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_envOffset_", declaredType="jvmtiEnv*")
	public _jvmtiEnvPointer env() throws CorruptDataException {
		return _jvmtiEnvPointer.cast(getPointerAtOffset(IterateSharedCacheUserdata._envOffset_));
	}

	// jvmtiEnv* env
	public PointerPointer envEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(IterateSharedCacheUserdata._envOffset_));
	}

	// void* userdata
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_userdataOffset_", declaredType="void*")
	public VoidPointer userdata() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(IterateSharedCacheUserdata._userdataOffset_));
	}

	// void* userdata
	public PointerPointer userdataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(IterateSharedCacheUserdata._userdataOffset_));
	}

	// I32 version
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_versionOffset_", declaredType="I32")
	public IDATA version() throws CorruptDataException {
		return new I32(getIntAtOffset(IterateSharedCacheUserdata._versionOffset_));
	}

	// I32 version
	public IDATAPointer versionEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(IterateSharedCacheUserdata._versionOffset_));
	}

}
