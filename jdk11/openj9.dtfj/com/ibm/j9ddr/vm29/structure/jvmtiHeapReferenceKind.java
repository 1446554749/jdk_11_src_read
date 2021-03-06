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
 * Structure: jvmtiHeapReferenceKind
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
public final class jvmtiHeapReferenceKind {

	// VM Constants

	public static final long SIZEOF;
	public static final long JVMTI_HEAP_REFERENCE_ARRAY_ELEMENT;
	public static final long JVMTI_HEAP_REFERENCE_CLASS;
	public static final long JVMTI_HEAP_REFERENCE_CLASS_LOADER;
	public static final long JVMTI_HEAP_REFERENCE_CONSTANT_POOL;
	public static final long JVMTI_HEAP_REFERENCE_FIELD;
	public static final long JVMTI_HEAP_REFERENCE_INTERFACE;
	public static final long JVMTI_HEAP_REFERENCE_JNI_GLOBAL;
	public static final long JVMTI_HEAP_REFERENCE_JNI_LOCAL;
	public static final long JVMTI_HEAP_REFERENCE_MONITOR;
	public static final long JVMTI_HEAP_REFERENCE_OTHER;
	public static final long JVMTI_HEAP_REFERENCE_PROTECTION_DOMAIN;
	public static final long JVMTI_HEAP_REFERENCE_SIGNERS;
	public static final long JVMTI_HEAP_REFERENCE_STACK_LOCAL;
	public static final long JVMTI_HEAP_REFERENCE_STATIC_FIELD;
	public static final long JVMTI_HEAP_REFERENCE_SUPERCLASS;
	public static final long JVMTI_HEAP_REFERENCE_SYSTEM_CLASS;
	public static final long JVMTI_HEAP_REFERENCE_THREAD;
	public static final long jvmtiHeapReferenceKindEnsureWideEnum;


	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		JVMTI_HEAP_REFERENCE_ARRAY_ELEMENT = 0;
		JVMTI_HEAP_REFERENCE_CLASS = 0;
		JVMTI_HEAP_REFERENCE_CLASS_LOADER = 0;
		JVMTI_HEAP_REFERENCE_CONSTANT_POOL = 0;
		JVMTI_HEAP_REFERENCE_FIELD = 0;
		JVMTI_HEAP_REFERENCE_INTERFACE = 0;
		JVMTI_HEAP_REFERENCE_JNI_GLOBAL = 0;
		JVMTI_HEAP_REFERENCE_JNI_LOCAL = 0;
		JVMTI_HEAP_REFERENCE_MONITOR = 0;
		JVMTI_HEAP_REFERENCE_OTHER = 0;
		JVMTI_HEAP_REFERENCE_PROTECTION_DOMAIN = 0;
		JVMTI_HEAP_REFERENCE_SIGNERS = 0;
		JVMTI_HEAP_REFERENCE_STACK_LOCAL = 0;
		JVMTI_HEAP_REFERENCE_STATIC_FIELD = 0;
		JVMTI_HEAP_REFERENCE_SUPERCLASS = 0;
		JVMTI_HEAP_REFERENCE_SYSTEM_CLASS = 0;
		JVMTI_HEAP_REFERENCE_THREAD = 0;
		jvmtiHeapReferenceKindEnsureWideEnum = 0;
	}

}
