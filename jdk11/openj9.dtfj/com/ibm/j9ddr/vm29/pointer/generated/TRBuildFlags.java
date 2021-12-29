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
package com.ibm.j9ddr.vm29.pointer.generated;
import java.lang.reflect.Field;
import java.util.HashSet;

/**
 * Structure: TRBuildFlags
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
 * The generated code will provide getters for all elements in the TRBuildFlags
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
public final class TRBuildFlags {

	// Do not instantiate constant classes
	private TRBuildFlags() {
	}

	// Build Flags
	public static final boolean host_32BIT;
	public static final boolean host_64BIT;
	public static final boolean host_AARCH64;
	public static final boolean host_ARM;
	public static final boolean host_IA32;
	public static final boolean host_MIPS;
	public static final boolean host_POWER;
	public static final boolean host_PPC;
	public static final boolean host_RISCV;
	public static final boolean host_S390;
	public static final boolean host_SH4;
	public static final boolean host_X86;

	static {
		HashSet<String> flags$ = new HashSet<>();

		try {
			ClassLoader loader$ = TRBuildFlags.class.getClassLoader();
			if (!(loader$ instanceof com.ibm.j9ddr.J9DDRClassLoader)) {
				throw new IllegalArgumentException("Cannot determine the runtime loader");
			}
			Class<?> runtimeClass = ((com.ibm.j9ddr.J9DDRClassLoader) loader$).loadClassRelativeToStream("structure.TRBuildFlags", false);
			for (Field field : runtimeClass.getFields()) {
				if (field.getLong(runtimeClass) != 0) {
					flags$.add(field.getName());
				}
			}
		} catch (ClassNotFoundException | IllegalAccessException e) {
			throw new IllegalArgumentException(String.format("Can not initialize flags from core file.%n%s", e.getMessage()));
		}

		host_32BIT = flags$.contains("host_32BIT");
		host_64BIT = flags$.contains("host_64BIT");
		host_AARCH64 = flags$.contains("host_AARCH64");
		host_ARM = flags$.contains("host_ARM");
		host_IA32 = flags$.contains("host_IA32");
		host_MIPS = flags$.contains("host_MIPS");
		host_POWER = flags$.contains("host_POWER");
		host_PPC = flags$.contains("host_PPC");
		host_RISCV = flags$.contains("host_RISCV");
		host_S390 = flags$.contains("host_S390");
		host_SH4 = flags$.contains("host_SH4");
		host_X86 = flags$.contains("host_X86");
	}
}
