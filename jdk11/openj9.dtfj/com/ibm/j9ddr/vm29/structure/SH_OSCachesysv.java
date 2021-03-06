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
 * Structure: SH_OSCachesysv
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
public final class SH_OSCachesysv {

	// VM Constants

	public static final long SIZEOF;

	// Offsets

	public static final int __actualCacheSizeOffset_;
	public static final int __attach_countOffset_;
	public static final int __controlFileStatusOffset_;
	public static final int __groupPermOffset_;
	public static final int __initializerOffset_;
	public static final int __openSharedMemoryOffset_;
	public static final int __semAccessOffset_;
	public static final int __semFileNameOffset_;
	public static final int __semhandleOffset_;
	public static final int __semidOffset_;
	public static final int __shmAccessOffset_;
	public static final int __shmFileNameOffset_;
	public static final int __shmhandleOffset_;
	public static final int __storageKeyTestingOffset_;
	public static final int __totalNumSemsOffset_;
	public static final int __userSemCntrOffset_;
	public static final int _configOffset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		__actualCacheSizeOffset_ = 0;
		__attach_countOffset_ = 0;
		__controlFileStatusOffset_ = 0;
		__groupPermOffset_ = 0;
		__initializerOffset_ = 0;
		__openSharedMemoryOffset_ = 0;
		__semAccessOffset_ = 0;
		__semFileNameOffset_ = 0;
		__semhandleOffset_ = 0;
		__semidOffset_ = 0;
		__shmAccessOffset_ = 0;
		__shmFileNameOffset_ = 0;
		__shmhandleOffset_ = 0;
		__storageKeyTestingOffset_ = 0;
		__totalNumSemsOffset_ = 0;
		__userSemCntrOffset_ = 0;
		_configOffset_ = 0;
	}

}
