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
 * Structure: UtServerInterface
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
public final class UtServerInterface {

	// VM Constants

	public static final long SIZEOF;

	// Offsets

	public static final int _AddComponentOffset_;
	public static final int _DeregisterRecordSubscriberOffset_;
	public static final int _DeregisterTracePointSubscriberOffset_;
	public static final int _DisableTraceOffset_;
	public static final int _EnableTraceOffset_;
	public static final int _FlushTraceDataOffset_;
	public static final int _FormatNextTracePointOffset_;
	public static final int _FreeTracePointIteratorOffset_;
	public static final int _GetComponentOffset_;
	public static final int _GetComponentsOffset_;
	public static final int _GetTraceMetadataOffset_;
	public static final int _GetTracePointIteratorForBufferOffset_;
	public static final int _RegisterRecordSubscriberOffset_;
	public static final int _RegisterTracePointSubscriberOffset_;
	public static final int _ResumeOffset_;
	public static final int _SetOptionsOffset_;
	public static final int _SuspendOffset_;
	public static final int _TraceDeregisterOffset_;
	public static final int _TraceRegisterOffset_;
	public static final int _TraceSnapOffset_;
	public static final int _TraceSnapWithPriorityOffset_;
	public static final int _TraceVNoThreadOffset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		_AddComponentOffset_ = 0;
		_DeregisterRecordSubscriberOffset_ = 0;
		_DeregisterTracePointSubscriberOffset_ = 0;
		_DisableTraceOffset_ = 0;
		_EnableTraceOffset_ = 0;
		_FlushTraceDataOffset_ = 0;
		_FormatNextTracePointOffset_ = 0;
		_FreeTracePointIteratorOffset_ = 0;
		_GetComponentOffset_ = 0;
		_GetComponentsOffset_ = 0;
		_GetTraceMetadataOffset_ = 0;
		_GetTracePointIteratorForBufferOffset_ = 0;
		_RegisterRecordSubscriberOffset_ = 0;
		_RegisterTracePointSubscriberOffset_ = 0;
		_ResumeOffset_ = 0;
		_SetOptionsOffset_ = 0;
		_SuspendOffset_ = 0;
		_TraceDeregisterOffset_ = 0;
		_TraceRegisterOffset_ = 0;
		_TraceSnapOffset_ = 0;
		_TraceSnapWithPriorityOffset_ = 0;
		_TraceVNoThreadOffset_ = 0;
	}

}