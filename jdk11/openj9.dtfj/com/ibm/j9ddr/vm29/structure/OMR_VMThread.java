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
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0 OR GPL-2.0 WITH Classpath-exception-2.0 OR LicenseRef-GPL-2.0 WITH Assembly-exception
 *******************************************************************************/
package com.ibm.j9ddr.vm29.structure;

/**
 * Structure: OMR_VMThread
 *
 * This stub class represents a class that can return in memory offsets
 * to VM C and C++ structures.
 *
 * This particular implementation exists only to allow StructurePointer code to
 * compile at development time.  This is never loaded at run time.
 *
 * At runtime generated byte codes returning actual offset values from the core file
 * will be loaded by the StructureClassLoader.
 */
public final class OMR_VMThread {

	// VM Constants

	public static final long SIZEOF;

	// Offsets

	public static final int __attachCountOffset_;
	public static final int __compressObjectReferencesOffset_;
	public static final int __gcOmrVMThreadExtensionsOffset_;
	public static final int __internalOffset_;
	public static final int __language_vmthreadOffset_;
	public static final int __linkNextOffset_;
	public static final int __linkPreviousOffset_;
	public static final int __os_threadOffset_;
	public static final int __sampleStackBackoffOffset_;
	public static final int __savedObject1Offset_;
	public static final int __savedObject2Offset_;
	public static final int __trace$omrTraceThreadOffset_;
	public static final int __trace$uteThreadOffset_;
	public static final int __vmOffset_;
	public static final int _exclusiveCountOffset_;
	public static final int _heapBaseForBarrierRange0Offset_;
	public static final int _heapSizeForBarrierRange0Offset_;
	public static final int _highTenureAddressOffset_;
	public static final int _lowTenureAddressOffset_;
	public static final int _memorySpaceOffset_;
	public static final int _movedObjectHashCodeCacheOffset_;
	public static final int _threadNameOffset_;
	public static final int _threadNameIsStaticOffset_;
	public static final int _threadNameMutexOffset_;
	public static final int _vmStateOffset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		__attachCountOffset_ = 0;
		__compressObjectReferencesOffset_ = 0;
		__gcOmrVMThreadExtensionsOffset_ = 0;
		__internalOffset_ = 0;
		__language_vmthreadOffset_ = 0;
		__linkNextOffset_ = 0;
		__linkPreviousOffset_ = 0;
		__os_threadOffset_ = 0;
		__sampleStackBackoffOffset_ = 0;
		__savedObject1Offset_ = 0;
		__savedObject2Offset_ = 0;
		__trace$omrTraceThreadOffset_ = 0;
		__trace$uteThreadOffset_ = 0;
		__vmOffset_ = 0;
		_exclusiveCountOffset_ = 0;
		_heapBaseForBarrierRange0Offset_ = 0;
		_heapSizeForBarrierRange0Offset_ = 0;
		_highTenureAddressOffset_ = 0;
		_lowTenureAddressOffset_ = 0;
		_memorySpaceOffset_ = 0;
		_movedObjectHashCodeCacheOffset_ = 0;
		_threadNameOffset_ = 0;
		_threadNameIsStaticOffset_ = 0;
		_threadNameMutexOffset_ = 0;
		_vmStateOffset_ = 0;
	}

}
