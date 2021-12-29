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
 * Structure: ComparingCursorPointer
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
 * The generated code will provide getters for all elements in the ComparingCursorPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=ComparingCursor.class)
public class ComparingCursorPointer extends CursorPointer {

	// NULL
	public static final ComparingCursorPointer NULL = new ComparingCursorPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected ComparingCursorPointer(long address) {
		super(address);
	}

	public static ComparingCursorPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static ComparingCursorPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static ComparingCursorPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new ComparingCursorPointer(address);
	}

	public ComparingCursorPointer add(long count) {
		return ComparingCursorPointer.cast(address + (ComparingCursor.SIZEOF * count));
	}

	public ComparingCursorPointer add(Scalar count) {
		return add(count.longValue());
	}

	public ComparingCursorPointer addOffset(long offset) {
		return ComparingCursorPointer.cast(address + offset);
	}

	public ComparingCursorPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public ComparingCursorPointer sub(long count) {
		return ComparingCursorPointer.cast(address - (ComparingCursor.SIZEOF * count));
	}

	public ComparingCursorPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public ComparingCursorPointer subOffset(long offset) {
		return ComparingCursorPointer.cast(address - offset);
	}

	public ComparingCursorPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public ComparingCursorPointer untag(long mask) {
		return ComparingCursorPointer.cast(address & ~mask);
	}

	public ComparingCursorPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return ComparingCursor.SIZEOF;
	}

	// Implementation methods

	// U8* _basePointerToVariableInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__basePointerToVariableInfoOffset_", declaredType="U8*")
	public U8Pointer _basePointerToVariableInfo() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(ComparingCursor.__basePointerToVariableInfoOffset_));
	}

	// U8* _basePointerToVariableInfo
	public PointerPointer _basePointerToVariableInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ComparingCursor.__basePointerToVariableInfoOffset_));
	}

	// bool _checkRangeInSharedCache
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__checkRangeInSharedCacheOffset_", declaredType="bool")
	public boolean _checkRangeInSharedCache() throws CorruptDataException {
		return getBoolAtOffset(ComparingCursor.__checkRangeInSharedCacheOffset_);
	}

	// bool _checkRangeInSharedCache
	public BoolPointer _checkRangeInSharedCacheEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ComparingCursor.__checkRangeInSharedCacheOffset_));
	}

	// ClassFileOracle* _classFileOracle
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__classFileOracleOffset_", declaredType="ClassFileOracle*")
	public ClassFileOraclePointer _classFileOracle() throws CorruptDataException {
		return ClassFileOraclePointer.cast(getPointerAtOffset(ComparingCursor.__classFileOracleOffset_));
	}

	// ClassFileOracle* _classFileOracle
	public PointerPointer _classFileOracleEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ComparingCursor.__classFileOracleOffset_));
	}

	// bool _isComparingLambdaFromSCC
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isComparingLambdaFromSCCOffset_", declaredType="bool")
	public boolean _isComparingLambdaFromSCC() throws CorruptDataException {
		return getBoolAtOffset(ComparingCursor.__isComparingLambdaFromSCCOffset_);
	}

	// bool _isComparingLambdaFromSCC
	public BoolPointer _isComparingLambdaFromSCCEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ComparingCursor.__isComparingLambdaFromSCCOffset_));
	}

	// bool _isEqual
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__isEqualOffset_", declaredType="bool")
	public boolean _isEqual() throws CorruptDataException {
		return getBoolAtOffset(ComparingCursor.__isEqualOffset_);
	}

	// bool _isEqual
	public BoolPointer _isEqualEA() throws CorruptDataException {
		return BoolPointer.cast(nonNullFieldEA(ComparingCursor.__isEqualOffset_));
	}

	// J9JavaVM* _javaVM
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__javaVMOffset_", declaredType="J9JavaVM*")
	public J9JavaVMPointer _javaVM() throws CorruptDataException {
		return J9JavaVMPointer.cast(getPointerAtOffset(ComparingCursor.__javaVMOffset_));
	}

	// J9JavaVM* _javaVM
	public PointerPointer _javaVMEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ComparingCursor.__javaVMOffset_));
	}

	// ComparingCursorHelper _lineNumberHelper
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__lineNumberHelperOffset_", declaredType="ComparingCursorHelper")
	public ComparingCursorHelperPointer _lineNumberHelper() throws CorruptDataException {
		return ComparingCursorHelperPointer.cast(nonNullFieldEA(ComparingCursor.__lineNumberHelperOffset_));
	}

	// ComparingCursorHelper _lineNumberHelper
	public PointerPointer _lineNumberHelperEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ComparingCursor.__lineNumberHelperOffset_));
	}

	// ComparingCursorHelper _mainHelper
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__mainHelperOffset_", declaredType="ComparingCursorHelper")
	public ComparingCursorHelperPointer _mainHelper() throws CorruptDataException {
		return ComparingCursorHelperPointer.cast(nonNullFieldEA(ComparingCursor.__mainHelperOffset_));
	}

	// ComparingCursorHelper _mainHelper
	public PointerPointer _mainHelperEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ComparingCursor.__mainHelperOffset_));
	}

	// Cursor$Mode _mode
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__modeOffset_", declaredType="Cursor$Mode")
	public long _mode() throws CorruptDataException {
		if (Cursor$Mode.SIZEOF == 1) {
			return getByteAtOffset(ComparingCursor.__modeOffset_);
		} else if (Cursor$Mode.SIZEOF == 2) {
			return getShortAtOffset(ComparingCursor.__modeOffset_);
		} else if (Cursor$Mode.SIZEOF == 4) {
			return getIntAtOffset(ComparingCursor.__modeOffset_);
		} else if (Cursor$Mode.SIZEOF == 8) {
			return getLongAtOffset(ComparingCursor.__modeOffset_);
		} else {
			throw new IllegalArgumentException("Unexpected ENUM size in core file");
		}
	}

	// Cursor$Mode _mode
	public EnumPointer _modeEA() throws CorruptDataException {
		return EnumPointer.cast(nonNullFieldEA(ComparingCursor.__modeOffset_), Cursor$Mode.class);
	}

	// U8* _romClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__romClassOffset_", declaredType="U8*")
	public U8Pointer _romClass() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(ComparingCursor.__romClassOffset_));
	}

	// U8* _romClass
	public PointerPointer _romClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ComparingCursor.__romClassOffset_));
	}

	// SRPKeyProducer* _srpKeyProducer
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__srpKeyProducerOffset_", declaredType="SRPKeyProducer*")
	public SRPKeyProducerPointer _srpKeyProducer() throws CorruptDataException {
		return SRPKeyProducerPointer.cast(getPointerAtOffset(ComparingCursor.__srpKeyProducerOffset_));
	}

	// SRPKeyProducer* _srpKeyProducer
	public PointerPointer _srpKeyProducerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ComparingCursor.__srpKeyProducerOffset_));
	}

	// U8* _storePointerToVariableInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__storePointerToVariableInfoOffset_", declaredType="U8*")
	public U8Pointer _storePointerToVariableInfo() throws CorruptDataException {
		return U8Pointer.cast(getPointerAtOffset(ComparingCursor.__storePointerToVariableInfoOffset_));
	}

	// U8* _storePointerToVariableInfo
	public PointerPointer _storePointerToVariableInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ComparingCursor.__storePointerToVariableInfoOffset_));
	}

	// ComparingCursorHelper _varInfoHelper
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="__varInfoHelperOffset_", declaredType="ComparingCursorHelper")
	public ComparingCursorHelperPointer _varInfoHelper() throws CorruptDataException {
		return ComparingCursorHelperPointer.cast(nonNullFieldEA(ComparingCursor.__varInfoHelperOffset_));
	}

	// ComparingCursorHelper _varInfoHelper
	public PointerPointer _varInfoHelperEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(ComparingCursor.__varInfoHelperOffset_));
	}

}
