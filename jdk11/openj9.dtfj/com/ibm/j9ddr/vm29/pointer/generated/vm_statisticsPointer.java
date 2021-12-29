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
 * Structure: vm_statisticsPointer
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
 * The generated code will provide getters for all elements in the vm_statisticsPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=vm_statistics.class)
public class vm_statisticsPointer extends StructurePointer {

	// NULL
	public static final vm_statisticsPointer NULL = new vm_statisticsPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected vm_statisticsPointer(long address) {
		super(address);
	}

	public static vm_statisticsPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static vm_statisticsPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static vm_statisticsPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new vm_statisticsPointer(address);
	}

	public vm_statisticsPointer add(long count) {
		return vm_statisticsPointer.cast(address + (vm_statistics.SIZEOF * count));
	}

	public vm_statisticsPointer add(Scalar count) {
		return add(count.longValue());
	}

	public vm_statisticsPointer addOffset(long offset) {
		return vm_statisticsPointer.cast(address + offset);
	}

	public vm_statisticsPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public vm_statisticsPointer sub(long count) {
		return vm_statisticsPointer.cast(address - (vm_statistics.SIZEOF * count));
	}

	public vm_statisticsPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public vm_statisticsPointer subOffset(long offset) {
		return vm_statisticsPointer.cast(address - offset);
	}

	public vm_statisticsPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public vm_statisticsPointer untag(long mask) {
		return vm_statisticsPointer.cast(address & ~mask);
	}

	public vm_statisticsPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return vm_statistics.SIZEOF;
	}

	// Implementation methods

	// natural_t active_count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_active_countOffset_", declaredType="natural_t")
	public UDATA active_count() throws CorruptDataException {
		return new U32(getIntAtOffset(vm_statistics._active_countOffset_));
	}

	// natural_t active_count
	public UDATAPointer active_countEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(vm_statistics._active_countOffset_));
	}

	// natural_t cow_faults
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cow_faultsOffset_", declaredType="natural_t")
	public UDATA cow_faults() throws CorruptDataException {
		return new U32(getIntAtOffset(vm_statistics._cow_faultsOffset_));
	}

	// natural_t cow_faults
	public UDATAPointer cow_faultsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(vm_statistics._cow_faultsOffset_));
	}

	// natural_t faults
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_faultsOffset_", declaredType="natural_t")
	public UDATA faults() throws CorruptDataException {
		return new U32(getIntAtOffset(vm_statistics._faultsOffset_));
	}

	// natural_t faults
	public UDATAPointer faultsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(vm_statistics._faultsOffset_));
	}

	// natural_t free_count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_free_countOffset_", declaredType="natural_t")
	public UDATA free_count() throws CorruptDataException {
		return new U32(getIntAtOffset(vm_statistics._free_countOffset_));
	}

	// natural_t free_count
	public UDATAPointer free_countEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(vm_statistics._free_countOffset_));
	}

	// natural_t hits
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_hitsOffset_", declaredType="natural_t")
	public UDATA hits() throws CorruptDataException {
		return new U32(getIntAtOffset(vm_statistics._hitsOffset_));
	}

	// natural_t hits
	public UDATAPointer hitsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(vm_statistics._hitsOffset_));
	}

	// natural_t inactive_count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_inactive_countOffset_", declaredType="natural_t")
	public UDATA inactive_count() throws CorruptDataException {
		return new U32(getIntAtOffset(vm_statistics._inactive_countOffset_));
	}

	// natural_t inactive_count
	public UDATAPointer inactive_countEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(vm_statistics._inactive_countOffset_));
	}

	// natural_t lookups
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_lookupsOffset_", declaredType="natural_t")
	public UDATA lookups() throws CorruptDataException {
		return new U32(getIntAtOffset(vm_statistics._lookupsOffset_));
	}

	// natural_t lookups
	public UDATAPointer lookupsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(vm_statistics._lookupsOffset_));
	}

	// natural_t pageins
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pageinsOffset_", declaredType="natural_t")
	public UDATA pageins() throws CorruptDataException {
		return new U32(getIntAtOffset(vm_statistics._pageinsOffset_));
	}

	// natural_t pageins
	public UDATAPointer pageinsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(vm_statistics._pageinsOffset_));
	}

	// natural_t pageouts
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pageoutsOffset_", declaredType="natural_t")
	public UDATA pageouts() throws CorruptDataException {
		return new U32(getIntAtOffset(vm_statistics._pageoutsOffset_));
	}

	// natural_t pageouts
	public UDATAPointer pageoutsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(vm_statistics._pageoutsOffset_));
	}

	// natural_t purgeable_count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_purgeable_countOffset_", declaredType="natural_t")
	public UDATA purgeable_count() throws CorruptDataException {
		return new U32(getIntAtOffset(vm_statistics._purgeable_countOffset_));
	}

	// natural_t purgeable_count
	public UDATAPointer purgeable_countEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(vm_statistics._purgeable_countOffset_));
	}

	// natural_t purges
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_purgesOffset_", declaredType="natural_t")
	public UDATA purges() throws CorruptDataException {
		return new U32(getIntAtOffset(vm_statistics._purgesOffset_));
	}

	// natural_t purges
	public UDATAPointer purgesEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(vm_statistics._purgesOffset_));
	}

	// natural_t reactivations
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_reactivationsOffset_", declaredType="natural_t")
	public UDATA reactivations() throws CorruptDataException {
		return new U32(getIntAtOffset(vm_statistics._reactivationsOffset_));
	}

	// natural_t reactivations
	public UDATAPointer reactivationsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(vm_statistics._reactivationsOffset_));
	}

	// natural_t speculative_count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_speculative_countOffset_", declaredType="natural_t")
	public UDATA speculative_count() throws CorruptDataException {
		return new U32(getIntAtOffset(vm_statistics._speculative_countOffset_));
	}

	// natural_t speculative_count
	public UDATAPointer speculative_countEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(vm_statistics._speculative_countOffset_));
	}

	// natural_t wire_count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_wire_countOffset_", declaredType="natural_t")
	public UDATA wire_count() throws CorruptDataException {
		return new U32(getIntAtOffset(vm_statistics._wire_countOffset_));
	}

	// natural_t wire_count
	public UDATAPointer wire_countEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(vm_statistics._wire_countOffset_));
	}

	// natural_t zero_fill_count
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_zero_fill_countOffset_", declaredType="natural_t")
	public UDATA zero_fill_count() throws CorruptDataException {
		return new U32(getIntAtOffset(vm_statistics._zero_fill_countOffset_));
	}

	// natural_t zero_fill_count
	public UDATAPointer zero_fill_countEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(vm_statistics._zero_fill_countOffset_));
	}

}
