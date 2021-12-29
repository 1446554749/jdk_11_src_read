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
 * Structure: __darwin_x86_float_state64
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
public final class __darwin_x86_float_state64 {

	// VM Constants

	public static final long SIZEOF;

	// Offsets

	public static final int ___fpu_csOffset_;
	public static final int ___fpu_dpOffset_;
	public static final int ___fpu_dsOffset_;
	public static final int ___fpu_fcwOffset_;
	public static final int ___fpu_fopOffset_;
	public static final int ___fpu_fswOffset_;
	public static final int ___fpu_ftwOffset_;
	public static final int ___fpu_ipOffset_;
	public static final int ___fpu_mxcsrOffset_;
	public static final int ___fpu_mxcsrmaskOffset_;
	public static final int ___fpu_reservedOffset_;
	public static final int ___fpu_reserved1Offset_;
	public static final int ___fpu_rsrv1Offset_;
	public static final int ___fpu_rsrv2Offset_;
	public static final int ___fpu_rsrv3Offset_;
	public static final int ___fpu_rsrv4Offset_;
	public static final int ___fpu_stmm0Offset_;
	public static final int ___fpu_stmm1Offset_;
	public static final int ___fpu_stmm2Offset_;
	public static final int ___fpu_stmm3Offset_;
	public static final int ___fpu_stmm4Offset_;
	public static final int ___fpu_stmm5Offset_;
	public static final int ___fpu_stmm6Offset_;
	public static final int ___fpu_stmm7Offset_;
	public static final int ___fpu_xmm0Offset_;
	public static final int ___fpu_xmm1Offset_;
	public static final int ___fpu_xmm10Offset_;
	public static final int ___fpu_xmm11Offset_;
	public static final int ___fpu_xmm12Offset_;
	public static final int ___fpu_xmm13Offset_;
	public static final int ___fpu_xmm14Offset_;
	public static final int ___fpu_xmm15Offset_;
	public static final int ___fpu_xmm2Offset_;
	public static final int ___fpu_xmm3Offset_;
	public static final int ___fpu_xmm4Offset_;
	public static final int ___fpu_xmm5Offset_;
	public static final int ___fpu_xmm6Offset_;
	public static final int ___fpu_xmm7Offset_;
	public static final int ___fpu_xmm8Offset_;
	public static final int ___fpu_xmm9Offset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		___fpu_csOffset_ = 0;
		___fpu_dpOffset_ = 0;
		___fpu_dsOffset_ = 0;
		___fpu_fcwOffset_ = 0;
		___fpu_fopOffset_ = 0;
		___fpu_fswOffset_ = 0;
		___fpu_ftwOffset_ = 0;
		___fpu_ipOffset_ = 0;
		___fpu_mxcsrOffset_ = 0;
		___fpu_mxcsrmaskOffset_ = 0;
		___fpu_reservedOffset_ = 0;
		___fpu_reserved1Offset_ = 0;
		___fpu_rsrv1Offset_ = 0;
		___fpu_rsrv2Offset_ = 0;
		___fpu_rsrv3Offset_ = 0;
		___fpu_rsrv4Offset_ = 0;
		___fpu_stmm0Offset_ = 0;
		___fpu_stmm1Offset_ = 0;
		___fpu_stmm2Offset_ = 0;
		___fpu_stmm3Offset_ = 0;
		___fpu_stmm4Offset_ = 0;
		___fpu_stmm5Offset_ = 0;
		___fpu_stmm6Offset_ = 0;
		___fpu_stmm7Offset_ = 0;
		___fpu_xmm0Offset_ = 0;
		___fpu_xmm1Offset_ = 0;
		___fpu_xmm10Offset_ = 0;
		___fpu_xmm11Offset_ = 0;
		___fpu_xmm12Offset_ = 0;
		___fpu_xmm13Offset_ = 0;
		___fpu_xmm14Offset_ = 0;
		___fpu_xmm15Offset_ = 0;
		___fpu_xmm2Offset_ = 0;
		___fpu_xmm3Offset_ = 0;
		___fpu_xmm4Offset_ = 0;
		___fpu_xmm5Offset_ = 0;
		___fpu_xmm6Offset_ = 0;
		___fpu_xmm7Offset_ = 0;
		___fpu_xmm8Offset_ = 0;
		___fpu_xmm9Offset_ = 0;
	}

}