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
 * Structure: VerboseGCSubscriberDataPointer
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
 * The generated code will provide getters for all elements in the VerboseGCSubscriberDataPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=VerboseGCSubscriberData.class)
public class VerboseGCSubscriberDataPointer extends StructurePointer {

	// NULL
	public static final VerboseGCSubscriberDataPointer NULL = new VerboseGCSubscriberDataPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected VerboseGCSubscriberDataPointer(long address) {
		super(address);
	}

	public static VerboseGCSubscriberDataPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static VerboseGCSubscriberDataPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static VerboseGCSubscriberDataPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new VerboseGCSubscriberDataPointer(address);
	}

	public VerboseGCSubscriberDataPointer add(long count) {
		return VerboseGCSubscriberDataPointer.cast(address + (VerboseGCSubscriberData.SIZEOF * count));
	}

	public VerboseGCSubscriberDataPointer add(Scalar count) {
		return add(count.longValue());
	}

	public VerboseGCSubscriberDataPointer addOffset(long offset) {
		return VerboseGCSubscriberDataPointer.cast(address + offset);
	}

	public VerboseGCSubscriberDataPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public VerboseGCSubscriberDataPointer sub(long count) {
		return VerboseGCSubscriberDataPointer.cast(address - (VerboseGCSubscriberData.SIZEOF * count));
	}

	public VerboseGCSubscriberDataPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public VerboseGCSubscriberDataPointer subOffset(long offset) {
		return VerboseGCSubscriberDataPointer.cast(address - offset);
	}

	public VerboseGCSubscriberDataPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public VerboseGCSubscriberDataPointer untag(long mask) {
		return VerboseGCSubscriberDataPointer.cast(address & ~mask);
	}

	public VerboseGCSubscriberDataPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return VerboseGCSubscriberData.SIZEOF;
	}

	// Implementation methods

	// jvmtiVerboseGCAlarm alarm
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_alarmOffset_", declaredType="jvmtiVerboseGCAlarm")
	public VoidPointer alarm() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VerboseGCSubscriberData._alarmOffset_));
	}

	// jvmtiVerboseGCAlarm alarm
	public PointerPointer alarmEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VerboseGCSubscriberData._alarmOffset_));
	}

	// jvmtiEnv* env
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_envOffset_", declaredType="jvmtiEnv*")
	public _jvmtiEnvPointer env() throws CorruptDataException {
		return _jvmtiEnvPointer.cast(getPointerAtOffset(VerboseGCSubscriberData._envOffset_));
	}

	// jvmtiEnv* env
	public PointerPointer envEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VerboseGCSubscriberData._envOffset_));
	}

	// jvmtiVerboseGCSubscriber subscriber
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_subscriberOffset_", declaredType="jvmtiVerboseGCSubscriber")
	public VoidPointer subscriber() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VerboseGCSubscriberData._subscriberOffset_));
	}

	// jvmtiVerboseGCSubscriber subscriber
	public PointerPointer subscriberEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VerboseGCSubscriberData._subscriberOffset_));
	}

	// void* userData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_userDataOffset_", declaredType="void*")
	public VoidPointer userData() throws CorruptDataException {
		return VoidPointer.cast(getPointerAtOffset(VerboseGCSubscriberData._userDataOffset_));
	}

	// void* userData
	public PointerPointer userDataEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(VerboseGCSubscriberData._userDataOffset_));
	}

}
