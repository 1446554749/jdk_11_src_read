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
 * Structure: J9SharedClassTransaction
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
public final class J9SharedClassTransaction {

	// VM Constants

	public static final long SIZEOF;

	// Offsets

	public static final int _ClasspathWrapperOffset_;
	public static final int _allocatedLineNumberTableOffset_;
	public static final int _allocatedLineNumberTableSizeOffset_;
	public static final int _allocatedLocalVariableTableOffset_;
	public static final int _allocatedLocalVariableTableSizeOffset_;
	public static final int _allocatedMemOffset_;
	public static final int _cacheAreaForAllocateOffset_;
	public static final int _cacheFullFlagsOffset_;
	public static final int _classloaderOffset_;
	public static final int _classnameDataOffset_;
	public static final int _classnameLengthOffset_;
	public static final int _entryIndexOffset_;
	public static final int _findNextIteratorOffset_;
	public static final int _findNextRomClassOffset_;
	public static final int _firstFoundOffset_;
	public static final int _helperIDOffset_;
	public static final int _isModifiedClassfileOffset_;
	public static final int _isOKOffset_;
	public static final int _loadTypeOffset_;
	public static final int _modContextInCacheOffset_;
	public static final int _newItemInCacheOffset_;
	public static final int _oldVMStateOffset_;
	public static final int _ownerThreadOffset_;
	public static final int _partitionInCacheOffset_;
	public static final int _takeReadWriteLockOffset_;
	public static final int _transactionStateOffset_;
	public static final int _updatedItemSizeOffset_;

	// Static Initializer

	private static final boolean RUNTIME = false;

	static {
		if (!RUNTIME) {
			throw new IllegalArgumentException("This stub class should not be on your classpath");
		}

		SIZEOF = 0;
		_ClasspathWrapperOffset_ = 0;
		_allocatedLineNumberTableOffset_ = 0;
		_allocatedLineNumberTableSizeOffset_ = 0;
		_allocatedLocalVariableTableOffset_ = 0;
		_allocatedLocalVariableTableSizeOffset_ = 0;
		_allocatedMemOffset_ = 0;
		_cacheAreaForAllocateOffset_ = 0;
		_cacheFullFlagsOffset_ = 0;
		_classloaderOffset_ = 0;
		_classnameDataOffset_ = 0;
		_classnameLengthOffset_ = 0;
		_entryIndexOffset_ = 0;
		_findNextIteratorOffset_ = 0;
		_findNextRomClassOffset_ = 0;
		_firstFoundOffset_ = 0;
		_helperIDOffset_ = 0;
		_isModifiedClassfileOffset_ = 0;
		_isOKOffset_ = 0;
		_loadTypeOffset_ = 0;
		_modContextInCacheOffset_ = 0;
		_newItemInCacheOffset_ = 0;
		_oldVMStateOffset_ = 0;
		_ownerThreadOffset_ = 0;
		_partitionInCacheOffset_ = 0;
		_takeReadWriteLockOffset_ = 0;
		_transactionStateOffset_ = 0;
		_updatedItemSizeOffset_ = 0;
	}

}
