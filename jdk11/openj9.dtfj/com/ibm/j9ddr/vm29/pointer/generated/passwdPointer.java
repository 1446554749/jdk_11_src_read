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
 * Structure: passwdPointer
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
 * The generated code will provide getters for all elements in the passwdPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=passwd.class)
public class passwdPointer extends StructurePointer {

	// NULL
	public static final passwdPointer NULL = new passwdPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected passwdPointer(long address) {
		super(address);
	}

	public static passwdPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static passwdPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static passwdPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new passwdPointer(address);
	}

	public passwdPointer add(long count) {
		return passwdPointer.cast(address + (passwd.SIZEOF * count));
	}

	public passwdPointer add(Scalar count) {
		return add(count.longValue());
	}

	public passwdPointer addOffset(long offset) {
		return passwdPointer.cast(address + offset);
	}

	public passwdPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public passwdPointer sub(long count) {
		return passwdPointer.cast(address - (passwd.SIZEOF * count));
	}

	public passwdPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public passwdPointer subOffset(long offset) {
		return passwdPointer.cast(address - offset);
	}

	public passwdPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public passwdPointer untag(long mask) {
		return passwdPointer.cast(address & ~mask);
	}

	public passwdPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return passwd.SIZEOF;
	}

	// Implementation methods

	// __darwin_time_t pw_change
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pw_changeOffset_", declaredType="__darwin_time_t")
	public IDATA pw_change() throws CorruptDataException {
		return new I64(getLongAtOffset(passwd._pw_changeOffset_));
	}

	// __darwin_time_t pw_change
	public IDATAPointer pw_changeEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(passwd._pw_changeOffset_));
	}

	// U8* pw_class
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pw_classOffset_", declaredType="U8*")
	public U8Pointer pw_class() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(passwd._pw_classOffset_));
	}

	// U8* pw_class
	public PointerPointer pw_classEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(passwd._pw_classOffset_));
	}

	// U8* pw_dir
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pw_dirOffset_", declaredType="U8*")
	public U8Pointer pw_dir() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(passwd._pw_dirOffset_));
	}

	// U8* pw_dir
	public PointerPointer pw_dirEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(passwd._pw_dirOffset_));
	}

	// __darwin_time_t pw_expire
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pw_expireOffset_", declaredType="__darwin_time_t")
	public IDATA pw_expire() throws CorruptDataException {
		return new I64(getLongAtOffset(passwd._pw_expireOffset_));
	}

	// __darwin_time_t pw_expire
	public IDATAPointer pw_expireEA() throws CorruptDataException {
		return IDATAPointer.cast(nonNullFieldEA(passwd._pw_expireOffset_));
	}

	// U8* pw_gecos
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pw_gecosOffset_", declaredType="U8*")
	public U8Pointer pw_gecos() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(passwd._pw_gecosOffset_));
	}

	// U8* pw_gecos
	public PointerPointer pw_gecosEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(passwd._pw_gecosOffset_));
	}

	// gid_t pw_gid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pw_gidOffset_", declaredType="gid_t")
	public UDATA pw_gid() throws CorruptDataException {
		return new U32(getIntAtOffset(passwd._pw_gidOffset_));
	}

	// gid_t pw_gid
	public UDATAPointer pw_gidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(passwd._pw_gidOffset_));
	}

	// U8* pw_name
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pw_nameOffset_", declaredType="U8*")
	public U8Pointer pw_name() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(passwd._pw_nameOffset_));
	}

	// U8* pw_name
	public PointerPointer pw_nameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(passwd._pw_nameOffset_));
	}

	// U8* pw_passwd
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pw_passwdOffset_", declaredType="U8*")
	public U8Pointer pw_passwd() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(passwd._pw_passwdOffset_));
	}

	// U8* pw_passwd
	public PointerPointer pw_passwdEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(passwd._pw_passwdOffset_));
	}

	// U8* pw_shell
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pw_shellOffset_", declaredType="U8*")
	public U8Pointer pw_shell() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(passwd._pw_shellOffset_));
	}

	// U8* pw_shell
	public PointerPointer pw_shellEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(passwd._pw_shellOffset_));
	}

	// uid_t pw_uid
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_pw_uidOffset_", declaredType="uid_t")
	public UDATA pw_uid() throws CorruptDataException {
		return new U32(getIntAtOffset(passwd._pw_uidOffset_));
	}

	// uid_t pw_uid
	public UDATAPointer pw_uidEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(passwd._pw_uidOffset_));
	}

}
