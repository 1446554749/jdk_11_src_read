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
 * Structure: RootScannerEntity
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
public final class RootScannerEntity {

	// VM Constants

	public static final long SIZEOF;
	public static final long RootScannerEntity_ClassLoaders;
	public static final long RootScannerEntity_Classes;
	public static final long RootScannerEntity_ClassesComplete;
	public static final long RootScannerEntity_Count;
	public static final long RootScannerEntity_DebuggerClassReferences;
	public static final long RootScannerEntity_DebuggerReferences;
	public static final long RootScannerEntity_FinalizableObjects;
	public static final long RootScannerEntity_JNIGlobalReferences;
	public static final long RootScannerEntity_JNIWeakGlobalReferences;
	public static final long RootScannerEntity_JVMTIObjectTagTables;
	public static final long RootScannerEntity_MemoryAreaObjects;
	public static final long RootScannerEntity_MetronomeRememberedSet;
	public static final long RootScannerEntity_MonitorLookupCaches;
	public static final long RootScannerEntity_MonitorLookupCachesComplete;
	public static final long RootScannerEntity_MonitorReferenceObjectsComplete;
	public static final long RootScannerEntity_MonitorReferences;
	public static final long RootScannerEntity_NonCollectableObjects;
	public static final long RootScannerEntity_None;
	public static final long RootScannerEntity_OwnableSynchronizerObjects;
	public static final long RootScannerEntity_OwnableSynchronizerObjectsComplete;
	public static final long RootScannerEntity_PermanentClasses;
	public static final long RootScannerEntity_PhantomReferenceObjects;
	public static final long RootScannerEntity_PhantomReferenceObjectsComplete;
	public static final long RootScannerEntity_RememberedSet;
	public static final long RootScannerEntity_ScavengeRememberedSet;
	public static final long RootScannerEntity_SoftReferenceObjects;
	public static final long RootScannerEntity_SoftReferenceObjectsComplete;
	public static final long RootScannerEntity_StringTable;
	public static final long RootScannerEntity_Threads;
	public static final long RootScannerEntity_UnfinalizedObjects;
	public static final long RootScannerEntity_UnfinalizedObjectsComplete;
	public static final long RootScannerEntity_VMClassSlots;
	public static final long RootScannerEntity_WeakReferenceObjects;
	public static final long RootScannerEntity_WeakReferenceObjectsComplete;


	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		RootScannerEntity_ClassLoaders = 0;
		RootScannerEntity_Classes = 0;
		RootScannerEntity_ClassesComplete = 0;
		RootScannerEntity_Count = 0;
		RootScannerEntity_DebuggerClassReferences = 0;
		RootScannerEntity_DebuggerReferences = 0;
		RootScannerEntity_FinalizableObjects = 0;
		RootScannerEntity_JNIGlobalReferences = 0;
		RootScannerEntity_JNIWeakGlobalReferences = 0;
		RootScannerEntity_JVMTIObjectTagTables = 0;
		RootScannerEntity_MemoryAreaObjects = 0;
		RootScannerEntity_MetronomeRememberedSet = 0;
		RootScannerEntity_MonitorLookupCaches = 0;
		RootScannerEntity_MonitorLookupCachesComplete = 0;
		RootScannerEntity_MonitorReferenceObjectsComplete = 0;
		RootScannerEntity_MonitorReferences = 0;
		RootScannerEntity_NonCollectableObjects = 0;
		RootScannerEntity_None = 0;
		RootScannerEntity_OwnableSynchronizerObjects = 0;
		RootScannerEntity_OwnableSynchronizerObjectsComplete = 0;
		RootScannerEntity_PermanentClasses = 0;
		RootScannerEntity_PhantomReferenceObjects = 0;
		RootScannerEntity_PhantomReferenceObjectsComplete = 0;
		RootScannerEntity_RememberedSet = 0;
		RootScannerEntity_ScavengeRememberedSet = 0;
		RootScannerEntity_SoftReferenceObjects = 0;
		RootScannerEntity_SoftReferenceObjectsComplete = 0;
		RootScannerEntity_StringTable = 0;
		RootScannerEntity_Threads = 0;
		RootScannerEntity_UnfinalizedObjects = 0;
		RootScannerEntity_UnfinalizedObjectsComplete = 0;
		RootScannerEntity_VMClassSlots = 0;
		RootScannerEntity_WeakReferenceObjects = 0;
		RootScannerEntity_WeakReferenceObjectsComplete = 0;
	}

}