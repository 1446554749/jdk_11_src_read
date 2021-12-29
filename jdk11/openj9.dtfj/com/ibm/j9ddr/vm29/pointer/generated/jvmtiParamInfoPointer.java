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
 * Structure: jvmtiParamInfoPointer
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
 * The generated code will provide getters for all elements in the jvmtiParamInfoPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=jvmtiParamInfo.class)
public class jvmtiParamInfoPointer extends StructurePointer {

	// NULL
	public static final jvmtiParamInfoPointer NULL = new jvmtiParamInfoPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected jvmtiParamInfoPointer(long address) {
		super(address);
	}

	public static jvmtiParamInfoPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static jvmtiParamInfoPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static jvmtiParamInfoPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new jvmtiParamInfoPointer(address);
	}

	public jvmtiParamInfoPointer add(long count) {
		return jvmtiParamInfoPointer.cast(address + (jvmtiParamInfo.SIZEOF * count));
	}

	public jvmtiParamInfoPointer add(Scalar count) {
		return add(count.longValue());
	}

	public jvmtiParamInfoPointer addOffset(long offset) {
		return jvmtiParamInfoPointer.cast(address + offset);
	}

	public jvmtiParamInfoPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public jvmtiParamInfoPointer sub(long count) {
		return jvmtiParamInfoPointer.cast(address - (jvmtiParamInfo.SIZEOF * count));
	}

	public jvmtiParamInfoPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public jvmtiParamInfoPointer subOffset(long offset) {
		return jvmtiParamInfoPointer.cast(address - offset);
	}

	public jvmtiParamInfoPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public jvmtiParamInfoPointer untag(long mask) {
		return jvmtiParamInfoPointer.cast(address & ~mask);
	}

	public jvmtiParamInfoPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return jvmtiParamInfo.SIZEOF;
	}

	// Implementation methods

	// jvmtiParamTypes base_type
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_base_typeOffset_", declaredType="jvmtiParamTypes")
	public long base_type() throws CorruptDataException {
		if (jvmtiParamTypes.SIZEOF == 1) {
			return getByteAtOffset(jvmtiParamInfo._base_typeOffset_);
		} else if (jvmtiParamTypes.SIZEOF == 2) {
			return getShortAtOffset(jvmtiParamInfo._base_typeOffset_);
		} else if (jvmtiParamTypes.SIZEOF == 4) {
			return getIntAtOffset(jvmtiParamInfo._base_typeOffset_);
		} else if (jvmtiParamTypes.SIZEOF == 8) {
			return getLongAtOffset(jvmtiParamInfo._base_typeOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// jvmtiParamTypes base_type
	public EnumPointer base_typeEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(jvmtiParamInfo._base_typeOffset_), jvmtiParamTypes.class);
	}

	// jvmtiParamKind kind
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_kindOffset_", declaredType="jvmtiParamKind")
	public long kind() throws CorruptDataException {
		if (jvmtiParamKind.SIZEOF == 1) {
			return getByteAtOffset(jvmtiParamInfo._kindOffset_);
		} else if (jvmtiParamKind.SIZEOF == 2) {
			return getShortAtOffset(jvmtiParamInfo._kindOffset_);
		} else if (jvmtiParamKind.SIZEOF == 4) {
			return getIntAtOffset(jvmtiParamInfo._kindOffset_);
		} else if (jvmtiParamKind.SIZEOF == 8) {
			return getLongAtOffset(jvmtiParamInfo._kindOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// jvmtiParamKind kind
	public EnumPointer kindEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(jvmtiParamInfo._kindOffset_), jvmtiParamKind.class);
	}

	// U8* name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nameOffset_", declaredType="U8*")
	public U8Pointer name() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(jvmtiParamInfo._nameOffset_));
	}

	// U8* name
	public PointerPointer nameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(jvmtiParamInfo._nameOffset_));
	}

	// jboolean null_ok
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_null_okOffset_", declaredType="jboolean")
	public U8 null_ok() throws CorruptDataException {
		return new U8(getByteAtOffset(jvmtiParamInfo._null_okOffset_));
	}

	// jboolean null_ok
	public U8Pointer null_okEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(jvmtiParamInfo._null_okOffset_));
	}

}
