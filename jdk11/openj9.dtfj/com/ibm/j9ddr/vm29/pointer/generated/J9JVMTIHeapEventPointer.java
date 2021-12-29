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
 * Structure: J9JVMTIHeapEventPointer
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
 * The generated code will provide getters for all elements in the J9JVMTIHeapEventPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9JVMTIHeapEvent.class)
public class J9JVMTIHeapEventPointer extends StructurePointer {

	// NULL
	public static final J9JVMTIHeapEventPointer NULL = new J9JVMTIHeapEventPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9JVMTIHeapEventPointer(long address) {
		super(address);
	}

	public static J9JVMTIHeapEventPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9JVMTIHeapEventPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9JVMTIHeapEventPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9JVMTIHeapEventPointer(address);
	}

	public J9JVMTIHeapEventPointer add(long count) {
		return J9JVMTIHeapEventPointer.cast(address + (J9JVMTIHeapEvent.SIZEOF * count));
	}

	public J9JVMTIHeapEventPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9JVMTIHeapEventPointer addOffset(long offset) {
		return J9JVMTIHeapEventPointer.cast(address + offset);
	}

	public J9JVMTIHeapEventPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9JVMTIHeapEventPointer sub(long count) {
		return J9JVMTIHeapEventPointer.cast(address - (J9JVMTIHeapEvent.SIZEOF * count));
	}

	public J9JVMTIHeapEventPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9JVMTIHeapEventPointer subOffset(long offset) {
		return J9JVMTIHeapEventPointer.cast(address - offset);
	}

	public J9JVMTIHeapEventPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9JVMTIHeapEventPointer untag(long mask) {
		return J9JVMTIHeapEventPointer.cast(address & ~mask);
	}

	public J9JVMTIHeapEventPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9JVMTIHeapEvent.SIZEOF;
	}

	// Implementation methods

	// IDATA gcType
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_gcTypeOffset_", declaredType="IDATA")
	public IDATA gcType() throws CorruptDataException {
		return getIDATAAtOffset(J9JVMTIHeapEvent._gcTypeOffset_);
	}

	// IDATA gcType
	public IDATAPointer gcTypeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9JVMTIHeapEvent._gcTypeOffset_));
	}

	// jboolean hasRefInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hasRefInfoOffset_", declaredType="jboolean")
	public U8 hasRefInfo() throws CorruptDataException {
		return new U8(getByteAtOffset(J9JVMTIHeapEvent._hasRefInfoOffset_));
	}

	// jboolean hasRefInfo
	public U8Pointer hasRefInfoEA() throws CorruptDataException {
		return U8Pointer.cast(nonNullFieldEA(J9JVMTIHeapEvent._hasRefInfoOffset_));
	}

	// IDATA index
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_indexOffset_", declaredType="IDATA")
	public IDATA index() throws CorruptDataException {
		return getIDATAAtOffset(J9JVMTIHeapEvent._indexOffset_);
	}

	// IDATA index
	public IDATAPointer indexEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(J9JVMTIHeapEvent._indexOffset_));
	}

	// jvmtiHeapReferenceInfo refInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_refInfoOffset_", declaredType="jvmtiHeapReferenceInfo")
	public jvmtiHeapReferenceInfoPointer refInfo() throws CorruptDataException {
		return jvmtiHeapReferenceInfoPointer.cast(nonNullFieldEA(J9JVMTIHeapEvent._refInfoOffset_));
	}

	// jvmtiHeapReferenceInfo refInfo
	public PointerPointer refInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(J9JVMTIHeapEvent._refInfoOffset_));
	}

	// jvmtiHeapReferenceKind refKind
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_refKindOffset_", declaredType="jvmtiHeapReferenceKind")
	public long refKind() throws CorruptDataException {
		if (jvmtiHeapReferenceKind.SIZEOF == 1) {
			return getByteAtOffset(J9JVMTIHeapEvent._refKindOffset_);
		} else if (jvmtiHeapReferenceKind.SIZEOF == 2) {
			return getShortAtOffset(J9JVMTIHeapEvent._refKindOffset_);
		} else if (jvmtiHeapReferenceKind.SIZEOF == 4) {
			return getIntAtOffset(J9JVMTIHeapEvent._refKindOffset_);
		} else if (jvmtiHeapReferenceKind.SIZEOF == 8) {
			return getLongAtOffset(J9JVMTIHeapEvent._refKindOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// jvmtiHeapReferenceKind refKind
	public EnumPointer refKindEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(J9JVMTIHeapEvent._refKindOffset_), jvmtiHeapReferenceKind.class);
	}

	// jvmtiHeapRootKind rootKind
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_rootKindOffset_", declaredType="jvmtiHeapRootKind")
	public long rootKind() throws CorruptDataException {
		if (jvmtiHeapRootKind.SIZEOF == 1) {
			return getByteAtOffset(J9JVMTIHeapEvent._rootKindOffset_);
		} else if (jvmtiHeapRootKind.SIZEOF == 2) {
			return getShortAtOffset(J9JVMTIHeapEvent._rootKindOffset_);
		} else if (jvmtiHeapRootKind.SIZEOF == 4) {
			return getIntAtOffset(J9JVMTIHeapEvent._rootKindOffset_);
		} else if (jvmtiHeapRootKind.SIZEOF == 8) {
			return getLongAtOffset(J9JVMTIHeapEvent._rootKindOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// jvmtiHeapRootKind rootKind
	public EnumPointer rootKindEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(J9JVMTIHeapEvent._rootKindOffset_), jvmtiHeapRootKind.class);
	}

	// J9JVMTIHeapEventType type
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_typeOffset_", declaredType="J9JVMTIHeapEventType")
	public long type() throws CorruptDataException {
		if (J9JVMTIHeapEventType.SIZEOF == 1) {
			return getByteAtOffset(J9JVMTIHeapEvent._typeOffset_);
		} else if (J9JVMTIHeapEventType.SIZEOF == 2) {
			return getShortAtOffset(J9JVMTIHeapEvent._typeOffset_);
		} else if (J9JVMTIHeapEventType.SIZEOF == 4) {
			return getIntAtOffset(J9JVMTIHeapEvent._typeOffset_);
		} else if (J9JVMTIHeapEventType.SIZEOF == 8) {
			return getLongAtOffset(J9JVMTIHeapEvent._typeOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// J9JVMTIHeapEventType type
	public EnumPointer typeEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(J9JVMTIHeapEvent._typeOffset_), J9JVMTIHeapEventType.class);
	}

}
