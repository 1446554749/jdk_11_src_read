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
 * Structure: J9JVMTIHeapDataPointer
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
 * The generated code will provide getters for all elements in the J9JVMTIHeapDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9JVMTIHeapData.class)
public class J9JVMTIHeapDataPointer extends StructurePointer {

	// NULL
	public static final J9JVMTIHeapDataPointer NULL = new J9JVMTIHeapDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9JVMTIHeapDataPointer(long address) {
		super(address);
	}

	public static J9JVMTIHeapDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9JVMTIHeapDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9JVMTIHeapDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9JVMTIHeapDataPointer(address);
	}

	public J9JVMTIHeapDataPointer add(long count) {
		return J9JVMTIHeapDataPointer.cast(address + (J9JVMTIHeapData.SIZEOF * count));
	}

	public J9JVMTIHeapDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9JVMTIHeapDataPointer addOffset(long offset) {
		return J9JVMTIHeapDataPointer.cast(address + offset);
	}

	public J9JVMTIHeapDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9JVMTIHeapDataPointer sub(long count) {
		return J9JVMTIHeapDataPointer.cast(address - (J9JVMTIHeapData.SIZEOF * count));
	}

	public J9JVMTIHeapDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9JVMTIHeapDataPointer subOffset(long offset) {
		return J9JVMTIHeapDataPointer.cast(address - offset);
	}

	public J9JVMTIHeapDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9JVMTIHeapDataPointer untag(long mask) {
		return J9JVMTIHeapDataPointer.cast(address & ~mask);
	}

	public J9JVMTIHeapDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9JVMTIHeapData.SIZEOF;
	}

	// Implementation methods

	// const jvmtiHeapCallbacks* callbacks
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_callbacksOffset_", declaredType="const jvmtiHeapCallbacks*")
	public jvmtiHeapCallbacksPointer callbacks() throws CorruptDataException {
		return jvmtiHeapCallbacksPointer.cast(getPointerAtOffset(J9JVMTIHeapData._callbacksOffset_));
	}

	// const jvmtiHeapCallbacks* callbacks
	public PointerPointer callbacksEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIHeapData._callbacksOffset_));
	}

	// J9Class* classFilter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classFilterOffset_", declaredType="J9Class*")
	public J9ClassPointer classFilter() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9JVMTIHeapData._classFilterOffset_));
	}

	// J9Class* classFilter
	public PointerPointer classFilterEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIHeapData._classFilterOffset_));
	}

	// J9Class* clazz
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_clazzOffset_", declaredType="J9Class*")
	public J9ClassPointer clazz() throws CorruptDataException {
		return J9ClassPointer.cast(getPointerAtOffset(J9JVMTIHeapData._clazzOffset_));
	}

	// J9Class* clazz
	public PointerPointer clazzEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIHeapData._clazzOffset_));
	}

	// J9VMThread* currentThread
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_currentThreadOffset_", declaredType="J9VMThread*")
	public J9VMThreadPointer currentThread() throws CorruptDataException {
		return J9VMThreadPointer.cast(getPointerAtOffset(J9JVMTIHeapData._currentThreadOffset_));
	}

	// J9VMThread* currentThread
	public PointerPointer currentThreadEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIHeapData._currentThreadOffset_));
	}

	// J9JVMTIEnv* env
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_envOffset_", declaredType="J9JVMTIEnv*")
	public J9JVMTIEnvPointer env() throws CorruptDataException {
		return J9JVMTIEnvPointer.cast(getPointerAtOffset(J9JVMTIHeapData._envOffset_));
	}

	// J9JVMTIEnv* env
	public PointerPointer envEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIHeapData._envOffset_));
	}

	// J9JVMTIHeapEvent event
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_eventOffset_", declaredType="J9JVMTIHeapEvent")
	public J9JVMTIHeapEventPointer event() throws CorruptDataException {
		return J9JVMTIHeapEventPointer.cast(nonNullFieldEA(J9JVMTIHeapData._eventOffset_));
	}

	// J9JVMTIHeapEvent event
	public PointerPointer eventEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIHeapData._eventOffset_));
	}

	// jint filter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_filterOffset_", declaredType="jint")
	public IDATA filter() throws CorruptDataException {
		return new I32(getIntAtOffset(J9JVMTIHeapData._filterOffset_));
	}

	// jint filter
	public IDATAPointer filterEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9JVMTIHeapData._filterOffset_));
	}

	// J9JVMTIHeapIterationFlags flags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_flagsOffset_", declaredType="J9JVMTIHeapIterationFlags")
	public long flags() throws CorruptDataException {
		if (J9JVMTIHeapIterationFlags.SIZEOF == 1) {
			return getByteAtOffset(J9JVMTIHeapData._flagsOffset_);
		} else if (J9JVMTIHeapIterationFlags.SIZEOF == 2) {
			return getShortAtOffset(J9JVMTIHeapData._flagsOffset_);
		} else if (J9JVMTIHeapIterationFlags.SIZEOF == 4) {
			return getIntAtOffset(J9JVMTIHeapData._flagsOffset_);
		} else if (J9JVMTIHeapIterationFlags.SIZEOF == 8) {
			return getLongAtOffset(J9JVMTIHeapData._flagsOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// J9JVMTIHeapIterationFlags flags
	public EnumPointer flagsEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(J9JVMTIHeapData._flagsOffset_), J9JVMTIHeapIterationFlags.class);
	}

	// j9object_t object
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_objectOffset_", declaredType="j9object_t")
	public J9ObjectPointer object() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(J9JVMTIHeapData._objectOffset_));
	}

	// j9object_t object
	public PointerPointer objectEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIHeapData._objectOffset_));
	}

	// jlong objectSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_objectSizeOffset_", declaredType="jlong")
	public IDATA objectSize() throws CorruptDataException {
		return new I64(getLongAtOffset(J9JVMTIHeapData._objectSizeOffset_));
	}

	// jlong objectSize
	public IDATAPointer objectSizeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9JVMTIHeapData._objectSizeOffset_));
	}

	// jvmtiError rc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_rcOffset_", declaredType="jvmtiError")
	public long rc() throws CorruptDataException {
		if (jvmtiError.SIZEOF == 1) {
			return getByteAtOffset(J9JVMTIHeapData._rcOffset_);
		} else if (jvmtiError.SIZEOF == 2) {
			return getShortAtOffset(J9JVMTIHeapData._rcOffset_);
		} else if (jvmtiError.SIZEOF == 4) {
			return getIntAtOffset(J9JVMTIHeapData._rcOffset_);
		} else if (jvmtiError.SIZEOF == 8) {
			return getLongAtOffset(J9JVMTIHeapData._rcOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// jvmtiError rc
	public EnumPointer rcEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(J9JVMTIHeapData._rcOffset_), jvmtiError.class);
	}

	// j9object_t referrer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_referrerOffset_", declaredType="j9object_t")
	public J9ObjectPointer referrer() throws CorruptDataException {
		return J9ObjectPointer.cast(getPointerAtOffset(J9JVMTIHeapData._referrerOffset_));
	}

	// j9object_t referrer
	public PointerPointer referrerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIHeapData._referrerOffset_));
	}

	// jvmtiHeapTags tags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_tagsOffset_", declaredType="jvmtiHeapTags")
	public jvmtiHeapTagsPointer tags() throws CorruptDataException {
		return jvmtiHeapTagsPointer.cast(nonNullFieldEA(J9JVMTIHeapData._tagsOffset_));
	}

	// jvmtiHeapTags tags
	public PointerPointer tagsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIHeapData._tagsOffset_));
	}

	// void* userData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_userDataOffset_", declaredType="void*")
	public VoidPointer userData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(J9JVMTIHeapData._userDataOffset_));
	}

	// void* userData
	public PointerPointer userDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIHeapData._userDataOffset_));
	}

	// jvmtiIterationControl visitRc
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_visitRcOffset_", declaredType="jvmtiIterationControl")
	public long visitRc() throws CorruptDataException {
		if (jvmtiIterationControl.SIZEOF == 1) {
			return getByteAtOffset(J9JVMTIHeapData._visitRcOffset_);
		} else if (jvmtiIterationControl.SIZEOF == 2) {
			return getShortAtOffset(J9JVMTIHeapData._visitRcOffset_);
		} else if (jvmtiIterationControl.SIZEOF == 4) {
			return getIntAtOffset(J9JVMTIHeapData._visitRcOffset_);
		} else if (jvmtiIterationControl.SIZEOF == 8) {
			return getLongAtOffset(J9JVMTIHeapData._visitRcOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// jvmtiIterationControl visitRc
	public EnumPointer visitRcEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(J9JVMTIHeapData._visitRcOffset_), jvmtiIterationControl.class);
	}

}
