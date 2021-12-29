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
 * Structure: MM_ConfigurationOptionsPointer
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
 * The generated code will provide getters for all elements in the MM_ConfigurationOptionsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ConfigurationOptions.class)
public class MM_ConfigurationOptionsPointer extends MM_BaseNonVirtualPointer {

	// NULL
	public static final MM_ConfigurationOptionsPointer NULL = new MM_ConfigurationOptionsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ConfigurationOptionsPointer(long address) {
		super(address);
	}

	public static MM_ConfigurationOptionsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ConfigurationOptionsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ConfigurationOptionsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ConfigurationOptionsPointer(address);
	}

	public MM_ConfigurationOptionsPointer add(long count) {
		return MM_ConfigurationOptionsPointer.cast(address + (MM_ConfigurationOptions.SIZEOF * count));
	}

	public MM_ConfigurationOptionsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ConfigurationOptionsPointer addOffset(long offset) {
		return MM_ConfigurationOptionsPointer.cast(address + offset);
	}

	public MM_ConfigurationOptionsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ConfigurationOptionsPointer sub(long count) {
		return MM_ConfigurationOptionsPointer.cast(address - (MM_ConfigurationOptions.SIZEOF * count));
	}

	public MM_ConfigurationOptionsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ConfigurationOptionsPointer subOffset(long offset) {
		return MM_ConfigurationOptionsPointer.cast(address - offset);
	}

	public MM_ConfigurationOptionsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ConfigurationOptionsPointer untag(long mask) {
		return MM_ConfigurationOptionsPointer.cast(address & ~mask);
	}

	public MM_ConfigurationOptionsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ConfigurationOptions.SIZEOF;
	}

	// Implementation methods

	// bool _forceOptionConcurrentMark
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__forceOptionConcurrentMarkOffset_", declaredType="bool")
	public boolean _forceOptionConcurrentMark() throws CorruptDataException {
		return getBoolAtOffset(MM_ConfigurationOptions.__forceOptionConcurrentMarkOffset_);
	}

	// bool _forceOptionConcurrentMark
	public BoolPointer _forceOptionConcurrentMarkEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ConfigurationOptions.__forceOptionConcurrentMarkOffset_));
	}

	// bool _forceOptionConcurrentSweep
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__forceOptionConcurrentSweepOffset_", declaredType="bool")
	public boolean _forceOptionConcurrentSweep() throws CorruptDataException {
		return getBoolAtOffset(MM_ConfigurationOptions.__forceOptionConcurrentSweepOffset_);
	}

	// bool _forceOptionConcurrentSweep
	public BoolPointer _forceOptionConcurrentSweepEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ConfigurationOptions.__forceOptionConcurrentSweepOffset_));
	}

	// bool _forceOptionLargeObjectArea
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__forceOptionLargeObjectAreaOffset_", declaredType="bool")
	public boolean _forceOptionLargeObjectArea() throws CorruptDataException {
		return getBoolAtOffset(MM_ConfigurationOptions.__forceOptionLargeObjectAreaOffset_);
	}

	// bool _forceOptionLargeObjectArea
	public BoolPointer _forceOptionLargeObjectAreaEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ConfigurationOptions.__forceOptionLargeObjectAreaOffset_));
	}

	// bool _forceOptionScavenge
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__forceOptionScavengeOffset_", declaredType="bool")
	public boolean _forceOptionScavenge() throws CorruptDataException {
		return getBoolAtOffset(MM_ConfigurationOptions.__forceOptionScavengeOffset_);
	}

	// bool _forceOptionScavenge
	public BoolPointer _forceOptionScavengeEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ConfigurationOptions.__forceOptionScavengeOffset_));
	}

	// bool _forceOptionWriteBarrierSATB
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__forceOptionWriteBarrierSATBOffset_", declaredType="bool")
	public boolean _forceOptionWriteBarrierSATB() throws CorruptDataException {
		return getBoolAtOffset(MM_ConfigurationOptions.__forceOptionWriteBarrierSATBOffset_);
	}

	// bool _forceOptionWriteBarrierSATB
	public BoolPointer _forceOptionWriteBarrierSATBEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ConfigurationOptions.__forceOptionWriteBarrierSATBOffset_));
	}

	// MM_GCPolicy _gcPolicy
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__gcPolicyOffset_", declaredType="MM_GCPolicy")
	public long _gcPolicy() throws CorruptDataException {
		if (MM_GCPolicy.SIZEOF == 1) {
			return getByteAtOffset(MM_ConfigurationOptions.__gcPolicyOffset_);
		} else if (MM_GCPolicy.SIZEOF == 2) {
			return getShortAtOffset(MM_ConfigurationOptions.__gcPolicyOffset_);
		} else if (MM_GCPolicy.SIZEOF == 4) {
			return getIntAtOffset(MM_ConfigurationOptions.__gcPolicyOffset_);
		} else if (MM_GCPolicy.SIZEOF == 8) {
			return getLongAtOffset(MM_ConfigurationOptions.__gcPolicyOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// MM_GCPolicy _gcPolicy
	public EnumPointer _gcPolicyEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(MM_ConfigurationOptions.__gcPolicyOffset_), MM_GCPolicy.class);
	}

}
