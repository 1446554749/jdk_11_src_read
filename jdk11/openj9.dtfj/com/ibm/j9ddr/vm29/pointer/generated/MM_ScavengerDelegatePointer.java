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
 * Structure: MM_ScavengerDelegatePointer
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
 * The generated code will provide getters for all elements in the MM_ScavengerDelegatePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=MM_ScavengerDelegate.class)
public class MM_ScavengerDelegatePointer extends MM_BaseNonVirtualPointer {

	// NULL
	public static final MM_ScavengerDelegatePointer NULL = new MM_ScavengerDelegatePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected MM_ScavengerDelegatePointer(long address) {
		super(address);
	}

	public static MM_ScavengerDelegatePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static MM_ScavengerDelegatePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static MM_ScavengerDelegatePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new MM_ScavengerDelegatePointer(address);
	}

	public MM_ScavengerDelegatePointer add(long count) {
		return MM_ScavengerDelegatePointer.cast(address + (MM_ScavengerDelegate.SIZEOF * count));
	}

	public MM_ScavengerDelegatePointer add(Scalar count) {
		return add(count.longValue());
	}

	public MM_ScavengerDelegatePointer addOffset(long offset) {
		return MM_ScavengerDelegatePointer.cast(address + offset);
	}

	public MM_ScavengerDelegatePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public MM_ScavengerDelegatePointer sub(long count) {
		return MM_ScavengerDelegatePointer.cast(address - (MM_ScavengerDelegate.SIZEOF * count));
	}

	public MM_ScavengerDelegatePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public MM_ScavengerDelegatePointer subOffset(long offset) {
		return MM_ScavengerDelegatePointer.cast(address - offset);
	}

	public MM_ScavengerDelegatePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public MM_ScavengerDelegatePointer untag(long mask) {
		return MM_ScavengerDelegatePointer.cast(address & ~mask);
	}

	public MM_ScavengerDelegatePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return MM_ScavengerDelegate.SIZEOF;
	}

	// Implementation methods

	// bool _compressObjectReferences
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__compressObjectReferencesOffset_", declaredType="bool")
	public boolean _compressObjectReferences() throws CorruptDataException {
		return getBoolAtOffset(MM_ScavengerDelegate.__compressObjectReferencesOffset_);
	}

	// bool _compressObjectReferences
	public BoolPointer _compressObjectReferencesEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ScavengerDelegate.__compressObjectReferencesOffset_));
	}

	// MM_GCExtensions* _extensions
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__extensionsOffset_", declaredType="MM_GCExtensions*")
	public MM_GCExtensionsPointer _extensions() throws CorruptDataException {
		return MM_GCExtensionsPointer.cast(getPointerAtOffset(MM_ScavengerDelegate.__extensionsOffset_));
	}

	// MM_GCExtensions* _extensions
	public PointerPointer _extensionsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ScavengerDelegate.__extensionsOffset_));
	}

	// bool _finalizationRequired
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__finalizationRequiredOffset_", declaredType="bool")
	public boolean _finalizationRequired() throws CorruptDataException {
		return getBoolAtOffset(MM_ScavengerDelegate.__finalizationRequiredOffset_);
	}

	// bool _finalizationRequired
	public BoolPointer _finalizationRequiredEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ScavengerDelegate.__finalizationRequiredOffset_));
	}

	// IDATA _flushCachesAsyncCallbackKey
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__flushCachesAsyncCallbackKeyOffset_", declaredType="IDATA")
	public IDATA _flushCachesAsyncCallbackKey() throws CorruptDataException {
		return getIDATAAtOffset(MM_ScavengerDelegate.__flushCachesAsyncCallbackKeyOffset_);
	}

	// IDATA _flushCachesAsyncCallbackKey
	public IDATAPointer _flushCachesAsyncCallbackKeyEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(MM_ScavengerDelegate.__flushCachesAsyncCallbackKeyOffset_));
	}

	// J9JavaVM* _javaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__javaVMOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer _javaVM() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(MM_ScavengerDelegate.__javaVMOffset_));
	}

	// J9JavaVM* _javaVM
	public PointerPointer _javaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ScavengerDelegate.__javaVMOffset_));
	}

	// OMR_VM* _omrVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__omrVMOffset_", declaredType="OMR_VM*")
	public OMR_VMPointer _omrVM() throws CorruptDataException {
		return OMR_VMPointer.cast(getPointerAtOffset(MM_ScavengerDelegate.__omrVMOffset_));
	}

	// OMR_VM* _omrVM
	public PointerPointer _omrVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(MM_ScavengerDelegate.__omrVMOffset_));
	}

	// volatile bool _shouldScavengeFinalizableObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__shouldScavengeFinalizableObjectsOffset_", declaredType="volatile bool")
	public boolean _shouldScavengeFinalizableObjects() throws CorruptDataException {
		return getBoolAtOffset(MM_ScavengerDelegate.__shouldScavengeFinalizableObjectsOffset_);
	}

	// volatile bool _shouldScavengeFinalizableObjects
	public BoolPointer _shouldScavengeFinalizableObjectsEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ScavengerDelegate.__shouldScavengeFinalizableObjectsOffset_));
	}

	// volatile bool _shouldScavengePhantomReferenceObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__shouldScavengePhantomReferenceObjectsOffset_", declaredType="volatile bool")
	public boolean _shouldScavengePhantomReferenceObjects() throws CorruptDataException {
		return getBoolAtOffset(MM_ScavengerDelegate.__shouldScavengePhantomReferenceObjectsOffset_);
	}

	// volatile bool _shouldScavengePhantomReferenceObjects
	public BoolPointer _shouldScavengePhantomReferenceObjectsEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ScavengerDelegate.__shouldScavengePhantomReferenceObjectsOffset_));
	}

	// volatile bool _shouldScavengeSoftReferenceObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__shouldScavengeSoftReferenceObjectsOffset_", declaredType="volatile bool")
	public boolean _shouldScavengeSoftReferenceObjects() throws CorruptDataException {
		return getBoolAtOffset(MM_ScavengerDelegate.__shouldScavengeSoftReferenceObjectsOffset_);
	}

	// volatile bool _shouldScavengeSoftReferenceObjects
	public BoolPointer _shouldScavengeSoftReferenceObjectsEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ScavengerDelegate.__shouldScavengeSoftReferenceObjectsOffset_));
	}

	// volatile bool _shouldScavengeUnfinalizedObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__shouldScavengeUnfinalizedObjectsOffset_", declaredType="volatile bool")
	public boolean _shouldScavengeUnfinalizedObjects() throws CorruptDataException {
		return getBoolAtOffset(MM_ScavengerDelegate.__shouldScavengeUnfinalizedObjectsOffset_);
	}

	// volatile bool _shouldScavengeUnfinalizedObjects
	public BoolPointer _shouldScavengeUnfinalizedObjectsEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ScavengerDelegate.__shouldScavengeUnfinalizedObjectsOffset_));
	}

	// volatile bool _shouldScavengeWeakReferenceObjects
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__shouldScavengeWeakReferenceObjectsOffset_", declaredType="volatile bool")
	public boolean _shouldScavengeWeakReferenceObjects() throws CorruptDataException {
		return getBoolAtOffset(MM_ScavengerDelegate.__shouldScavengeWeakReferenceObjectsOffset_);
	}

	// volatile bool _shouldScavengeWeakReferenceObjects
	public BoolPointer _shouldScavengeWeakReferenceObjectsEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(MM_ScavengerDelegate.__shouldScavengeWeakReferenceObjectsOffset_));
	}

}
