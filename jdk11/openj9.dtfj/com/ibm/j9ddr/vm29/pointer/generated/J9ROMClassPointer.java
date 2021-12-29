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
 * Structure: J9ROMClassPointer
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
 * The generated code will provide getters for all elements in the J9ROMClassPointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=J9ROMClass.class)
public class J9ROMClassPointer extends StructurePointer {

	// NULL
	public static final J9ROMClassPointer NULL = new J9ROMClassPointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected J9ROMClassPointer(long address) {
		super(address);
	}

	public static J9ROMClassPointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static J9ROMClassPointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static J9ROMClassPointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new J9ROMClassPointer(address);
	}

	public J9ROMClassPointer add(long count) {
		return J9ROMClassPointer.cast(address + (J9ROMClass.SIZEOF * count));
	}

	public J9ROMClassPointer add(Scalar count) {
		return add(count.longValue());
	}

	public J9ROMClassPointer addOffset(long offset) {
		return J9ROMClassPointer.cast(address + offset);
	}

	public J9ROMClassPointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public J9ROMClassPointer sub(long count) {
		return J9ROMClassPointer.cast(address - (J9ROMClass.SIZEOF * count));
	}

	public J9ROMClassPointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public J9ROMClassPointer subOffset(long offset) {
		return J9ROMClassPointer.cast(address - offset);
	}

	public J9ROMClassPointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public J9ROMClassPointer untag(long mask) {
		return J9ROMClassPointer.cast(address & ~mask);
	}

	public J9ROMClassPointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return J9ROMClass.SIZEOF;
	}

	// Implementation methods

	// U32 bsmCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_bsmCountOffset_", declaredType="U32")
	public UDATA bsmCount() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMClass._bsmCountOffset_));
	}

	// U32 bsmCount
	public UDATAPointer bsmCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMClass._bsmCountOffset_));
	}

	// U32 callSiteCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_callSiteCountOffset_", declaredType="U32")
	public UDATA callSiteCount() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMClass._callSiteCountOffset_));
	}

	// U32 callSiteCount
	public UDATAPointer callSiteCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMClass._callSiteCountOffset_));
	}

	// J9SRP callSiteData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_callSiteDataOffset_", declaredType="J9SRP")
	public VoidPointer callSiteData() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9ROMClass._callSiteDataOffset_);
		if (nextAddress == 0) {
			return VoidPointer.NULL;
		}
		return VoidPointer.cast(address + (J9ROMClass._callSiteDataOffset_ + nextAddress));
	}

	// J9SRP callSiteData
	public SelfRelativePointer callSiteDataEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9ROMClass._callSiteDataOffset_));
	}

	// U32 classFileCPCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classFileCPCountOffset_", declaredType="U32")
	public UDATA classFileCPCount() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMClass._classFileCPCountOffset_));
	}

	// U32 classFileCPCount
	public UDATAPointer classFileCPCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMClass._classFileCPCountOffset_));
	}

	// U32 classFileSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classFileSizeOffset_", declaredType="U32")
	public UDATA classFileSize() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMClass._classFileSizeOffset_));
	}

	// U32 classFileSize
	public UDATAPointer classFileSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMClass._classFileSizeOffset_));
	}

	// J9SRP(J9UTF8) className
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_classNameOffset_", declaredType="J9SRP(J9UTF8)")
	public J9UTF8Pointer className() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9ROMClass._classNameOffset_);
		if (nextAddress == 0) {
			return J9UTF8Pointer.NULL;
		}
		return J9UTF8Pointer.cast(address + (J9ROMClass._classNameOffset_ + nextAddress));
	}

	// J9SRP(J9UTF8) className
	public SelfRelativePointer classNameEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9ROMClass._classNameOffset_));
	}

	// J9SRP(U32) cpShapeDescription
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_cpShapeDescriptionOffset_", declaredType="J9SRP(U32)")
	public UDATAPointer cpShapeDescription() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9ROMClass._cpShapeDescriptionOffset_);
		if (nextAddress == 0) {
			return U32Pointer.NULL;
		}
		return U32Pointer.cast(address + (J9ROMClass._cpShapeDescriptionOffset_ + nextAddress));
	}

	// J9SRP(U32) cpShapeDescription
	public SelfRelativePointer cpShapeDescriptionEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9ROMClass._cpShapeDescriptionOffset_));
	}

	// U32 doubleScalarStaticCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_doubleScalarStaticCountOffset_", declaredType="U32")
	public UDATA doubleScalarStaticCount() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMClass._doubleScalarStaticCountOffset_));
	}

	// U32 doubleScalarStaticCount
	public UDATAPointer doubleScalarStaticCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMClass._doubleScalarStaticCountOffset_));
	}

	// U32 extraModifiers
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_extraModifiersOffset_", declaredType="U32")
	public UDATA extraModifiers() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMClass._extraModifiersOffset_));
	}

	// U32 extraModifiers
	public UDATAPointer extraModifiersEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMClass._extraModifiersOffset_));
	}

	// U32 innerClassCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_innerClassCountOffset_", declaredType="U32")
	public UDATA innerClassCount() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMClass._innerClassCountOffset_));
	}

	// U32 innerClassCount
	public UDATAPointer innerClassCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMClass._innerClassCountOffset_));
	}

	// J9SRP(J9SRP(J9UTF8)) innerClasses
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_innerClassesOffset_", declaredType="J9SRP(J9SRP(J9UTF8))")
	public SelfRelativePointer innerClasses() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9ROMClass._innerClassesOffset_);
		if (nextAddress == 0) {
			return SelfRelativePointer.NULL;
		}
		return SelfRelativePointer.cast(address + (J9ROMClass._innerClassesOffset_ + nextAddress));
	}

	// J9SRP(J9SRP(J9UTF8)) innerClasses
	public SelfRelativePointer innerClassesEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9ROMClass._innerClassesOffset_));
	}

	// U32 instanceShape
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_instanceShapeOffset_", declaredType="U32")
	public UDATA instanceShape() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMClass._instanceShapeOffset_));
	}

	// U32 instanceShape
	public UDATAPointer instanceShapeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMClass._instanceShapeOffset_));
	}

	// U32 interfaceCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_interfaceCountOffset_", declaredType="U32")
	public UDATA interfaceCount() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMClass._interfaceCountOffset_));
	}

	// U32 interfaceCount
	public UDATAPointer interfaceCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMClass._interfaceCountOffset_));
	}

	// J9SRP(J9SRP(J9UTF8)) interfaces
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_interfacesOffset_", declaredType="J9SRP(J9SRP(J9UTF8))")
	public SelfRelativePointer interfaces() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9ROMClass._interfacesOffset_);
		if (nextAddress == 0) {
			return SelfRelativePointer.NULL;
		}
		return SelfRelativePointer.cast(address + (J9ROMClass._interfacesOffset_ + nextAddress));
	}

	// J9SRP(J9SRP(J9UTF8)) interfaces
	public SelfRelativePointer interfacesEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9ROMClass._interfacesOffset_));
	}

	// J9WSRP(U8) intermediateClassData
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_intermediateClassDataOffset_", declaredType="J9WSRP(U8)")
	public U8Pointer intermediateClassData() throws CorruptDataException {
		long nextAddress = getPointerAtOffset(J9ROMClass._intermediateClassDataOffset_);
		if (nextAddress == 0) {
			return U8Pointer.NULL;
		}
		return U8Pointer.cast(address + (J9ROMClass._intermediateClassDataOffset_ + nextAddress));
	}

	// J9WSRP(U8) intermediateClassData
	public WideSelfRelativePointer intermediateClassDataEA() throws CorruptDataException {
		return WideSelfRelativePointer.cast(nonNullFieldEA(J9ROMClass._intermediateClassDataOffset_));
	}

	// U32 intermediateClassDataLength
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_intermediateClassDataLengthOffset_", declaredType="U32")
	public UDATA intermediateClassDataLength() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMClass._intermediateClassDataLengthOffset_));
	}

	// U32 intermediateClassDataLength
	public UDATAPointer intermediateClassDataLengthEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMClass._intermediateClassDataLengthOffset_));
	}

	// U16 majorVersion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_majorVersionOffset_", declaredType="U16")
	public U16 majorVersion() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ROMClass._majorVersionOffset_));
	}

	// U16 majorVersion
	public U16Pointer majorVersionEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ROMClass._majorVersionOffset_));
	}

	// U32 maxBranchCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_maxBranchCountOffset_", declaredType="U32")
	public UDATA maxBranchCount() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMClass._maxBranchCountOffset_));
	}

	// U32 maxBranchCount
	public UDATAPointer maxBranchCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMClass._maxBranchCountOffset_));
	}

	// U32 memberAccessFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_memberAccessFlagsOffset_", declaredType="U32")
	public UDATA memberAccessFlags() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMClass._memberAccessFlagsOffset_));
	}

	// U32 memberAccessFlags
	public UDATAPointer memberAccessFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMClass._memberAccessFlagsOffset_));
	}

	// U32 methodTypeCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_methodTypeCountOffset_", declaredType="U32")
	public UDATA methodTypeCount() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMClass._methodTypeCountOffset_));
	}

	// U32 methodTypeCount
	public UDATAPointer methodTypeCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMClass._methodTypeCountOffset_));
	}

	// U16 minorVersion
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_minorVersionOffset_", declaredType="U16")
	public U16 minorVersion() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ROMClass._minorVersionOffset_));
	}

	// U16 minorVersion
	public U16Pointer minorVersionEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ROMClass._minorVersionOffset_));
	}

	// U32 modifiers
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_modifiersOffset_", declaredType="U32")
	public UDATA modifiers() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMClass._modifiersOffset_));
	}

	// U32 modifiers
	public UDATAPointer modifiersEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMClass._modifiersOffset_));
	}

	// J9SRP nestHost
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nestHostOffset_", declaredType="J9SRP")
	public VoidPointer nestHost() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9ROMClass._nestHostOffset_);
		if (nextAddress == 0) {
			return VoidPointer.NULL;
		}
		return VoidPointer.cast(address + (J9ROMClass._nestHostOffset_ + nextAddress));
	}

	// J9SRP nestHost
	public SelfRelativePointer nestHostEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9ROMClass._nestHostOffset_));
	}

	// U16 nestMemberCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nestMemberCountOffset_", declaredType="U16")
	public U16 nestMemberCount() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ROMClass._nestMemberCountOffset_));
	}

	// U16 nestMemberCount
	public U16Pointer nestMemberCountEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ROMClass._nestMemberCountOffset_));
	}

	// J9SRP nestMembers
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_nestMembersOffset_", declaredType="J9SRP")
	public VoidPointer nestMembers() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9ROMClass._nestMembersOffset_);
		if (nextAddress == 0) {
			return VoidPointer.NULL;
		}
		return VoidPointer.cast(address + (J9ROMClass._nestMembersOffset_ + nextAddress));
	}

	// J9SRP nestMembers
	public SelfRelativePointer nestMembersEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9ROMClass._nestMembersOffset_));
	}

	// U32 objectStaticCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_objectStaticCountOffset_", declaredType="U32")
	public UDATA objectStaticCount() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMClass._objectStaticCountOffset_));
	}

	// U32 objectStaticCount
	public UDATAPointer objectStaticCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMClass._objectStaticCountOffset_));
	}

	// U32 optionalFlags
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_optionalFlagsOffset_", declaredType="U32")
	public UDATA optionalFlags() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMClass._optionalFlagsOffset_));
	}

	// U32 optionalFlags
	public UDATAPointer optionalFlagsEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMClass._optionalFlagsOffset_));
	}

	// J9SRP(U32) optionalInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_optionalInfoOffset_", declaredType="J9SRP(U32)")
	public UDATAPointer optionalInfo() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9ROMClass._optionalInfoOffset_);
		if (nextAddress == 0) {
			return U32Pointer.NULL;
		}
		return U32Pointer.cast(address + (J9ROMClass._optionalInfoOffset_ + nextAddress));
	}

	// J9SRP(U32) optionalInfo
	public SelfRelativePointer optionalInfoEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9ROMClass._optionalInfoOffset_));
	}

	// J9SRP(J9UTF8) outerClassName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_outerClassNameOffset_", declaredType="J9SRP(J9UTF8)")
	public J9UTF8Pointer outerClassName() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9ROMClass._outerClassNameOffset_);
		if (nextAddress == 0) {
			return J9UTF8Pointer.NULL;
		}
		return J9UTF8Pointer.cast(address + (J9ROMClass._outerClassNameOffset_ + nextAddress));
	}

	// J9SRP(J9UTF8) outerClassName
	public SelfRelativePointer outerClassNameEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9ROMClass._outerClassNameOffset_));
	}

	// U32 padding
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_paddingOffset_", declaredType="U32")
	public UDATA padding() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMClass._paddingOffset_));
	}

	// U32 padding
	public UDATAPointer paddingEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMClass._paddingOffset_));
	}

	// U32 ramConstantPoolCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_ramConstantPoolCountOffset_", declaredType="U32")
	public UDATA ramConstantPoolCount() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMClass._ramConstantPoolCountOffset_));
	}

	// U32 ramConstantPoolCount
	public UDATAPointer ramConstantPoolCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMClass._ramConstantPoolCountOffset_));
	}

	// U32 romConstantPoolCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romConstantPoolCountOffset_", declaredType="U32")
	public UDATA romConstantPoolCount() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMClass._romConstantPoolCountOffset_));
	}

	// U32 romConstantPoolCount
	public UDATAPointer romConstantPoolCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMClass._romConstantPoolCountOffset_));
	}

	// U32 romFieldCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romFieldCountOffset_", declaredType="U32")
	public UDATA romFieldCount() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMClass._romFieldCountOffset_));
	}

	// U32 romFieldCount
	public UDATAPointer romFieldCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMClass._romFieldCountOffset_));
	}

	// J9SRP(J9ROMFieldShape) romFields
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romFieldsOffset_", declaredType="J9SRP(J9ROMFieldShape)")
	public J9ROMFieldShapePointer romFields() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9ROMClass._romFieldsOffset_);
		if (nextAddress == 0) {
			return J9ROMFieldShapePointer.NULL;
		}
		return J9ROMFieldShapePointer.cast(address + (J9ROMClass._romFieldsOffset_ + nextAddress));
	}

	// J9SRP(J9ROMFieldShape) romFields
	public SelfRelativePointer romFieldsEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9ROMClass._romFieldsOffset_));
	}

	// U32 romMethodCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romMethodCountOffset_", declaredType="U32")
	public UDATA romMethodCount() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMClass._romMethodCountOffset_));
	}

	// U32 romMethodCount
	public UDATAPointer romMethodCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMClass._romMethodCountOffset_));
	}

	// J9SRP(J9ROMMethod) romMethods
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romMethodsOffset_", declaredType="J9SRP(J9ROMMethod)")
	public J9ROMMethodPointer romMethods() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9ROMClass._romMethodsOffset_);
		if (nextAddress == 0) {
			return J9ROMMethodPointer.NULL;
		}
		return J9ROMMethodPointer.cast(address + (J9ROMClass._romMethodsOffset_ + nextAddress));
	}

	// J9SRP(J9ROMMethod) romMethods
	public SelfRelativePointer romMethodsEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9ROMClass._romMethodsOffset_));
	}

	// U32 romSize
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_romSizeOffset_", declaredType="U32")
	public UDATA romSize() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMClass._romSizeOffset_));
	}

	// U32 romSize
	public UDATAPointer romSizeEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMClass._romSizeOffset_));
	}

	// U32 singleScalarStaticCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_singleScalarStaticCountOffset_", declaredType="U32")
	public UDATA singleScalarStaticCount() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMClass._singleScalarStaticCountOffset_));
	}

	// U32 singleScalarStaticCount
	public UDATAPointer singleScalarStaticCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMClass._singleScalarStaticCountOffset_));
	}

	// U16 specialSplitMethodRefCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_specialSplitMethodRefCountOffset_", declaredType="U16")
	public U16 specialSplitMethodRefCount() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ROMClass._specialSplitMethodRefCountOffset_));
	}

	// U16 specialSplitMethodRefCount
	public U16Pointer specialSplitMethodRefCountEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ROMClass._specialSplitMethodRefCountOffset_));
	}

	// J9SRP(U16) specialSplitMethodRefIndexes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_specialSplitMethodRefIndexesOffset_", declaredType="J9SRP(U16)")
	public U16Pointer specialSplitMethodRefIndexes() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9ROMClass._specialSplitMethodRefIndexesOffset_);
		if (nextAddress == 0) {
			return U16Pointer.NULL;
		}
		return U16Pointer.cast(address + (J9ROMClass._specialSplitMethodRefIndexesOffset_ + nextAddress));
	}

	// J9SRP(U16) specialSplitMethodRefIndexes
	public SelfRelativePointer specialSplitMethodRefIndexesEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9ROMClass._specialSplitMethodRefIndexesOffset_));
	}

	// U16 staticSplitMethodRefCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_staticSplitMethodRefCountOffset_", declaredType="U16")
	public U16 staticSplitMethodRefCount() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ROMClass._staticSplitMethodRefCountOffset_));
	}

	// U16 staticSplitMethodRefCount
	public U16Pointer staticSplitMethodRefCountEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ROMClass._staticSplitMethodRefCountOffset_));
	}

	// J9SRP(U16) staticSplitMethodRefIndexes
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_staticSplitMethodRefIndexesOffset_", declaredType="J9SRP(U16)")
	public U16Pointer staticSplitMethodRefIndexes() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9ROMClass._staticSplitMethodRefIndexesOffset_);
		if (nextAddress == 0) {
			return U16Pointer.NULL;
		}
		return U16Pointer.cast(address + (J9ROMClass._staticSplitMethodRefIndexesOffset_ + nextAddress));
	}

	// J9SRP(U16) staticSplitMethodRefIndexes
	public SelfRelativePointer staticSplitMethodRefIndexesEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9ROMClass._staticSplitMethodRefIndexesOffset_));
	}

	// J9SRP(J9UTF8) superclassName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_superclassNameOffset_", declaredType="J9SRP(J9UTF8)")
	public J9UTF8Pointer superclassName() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9ROMClass._superclassNameOffset_);
		if (nextAddress == 0) {
			return J9UTF8Pointer.NULL;
		}
		return J9UTF8Pointer.cast(address + (J9ROMClass._superclassNameOffset_ + nextAddress));
	}

	// J9SRP(J9UTF8) superclassName
	public SelfRelativePointer superclassNameEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9ROMClass._superclassNameOffset_));
	}

	// U16 unused
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_unusedOffset_", declaredType="U16")
	public U16 unused() throws CorruptDataException {
		return new U16(getShortAtOffset(J9ROMClass._unusedOffset_));
	}

	// U16 unused
	public U16Pointer unusedEA() throws CorruptDataException {
		return U16Pointer.cast(nonNullFieldEA(J9ROMClass._unusedOffset_));
	}

	// U32 varHandleMethodTypeCount
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_varHandleMethodTypeCountOffset_", declaredType="U32")
	public UDATA varHandleMethodTypeCount() throws CorruptDataException {
		return new U32(getIntAtOffset(J9ROMClass._varHandleMethodTypeCountOffset_));
	}

	// U32 varHandleMethodTypeCount
	public UDATAPointer varHandleMethodTypeCountEA() throws CorruptDataException {
		return UDATAPointer.cast(nonNullFieldEA(J9ROMClass._varHandleMethodTypeCountOffset_));
	}

	// J9SRP varHandleMethodTypeLookupTable
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_varHandleMethodTypeLookupTableOffset_", declaredType="J9SRP")
	public VoidPointer varHandleMethodTypeLookupTable() throws CorruptDataException {
		long nextAddress = getIntAtOffset(J9ROMClass._varHandleMethodTypeLookupTableOffset_);
		if (nextAddress == 0) {
			return VoidPointer.NULL;
		}
		return VoidPointer.cast(address + (J9ROMClass._varHandleMethodTypeLookupTableOffset_ + nextAddress));
	}

	// J9SRP varHandleMethodTypeLookupTable
	public SelfRelativePointer varHandleMethodTypeLookupTableEA() throws CorruptDataException {
		return SelfRelativePointer.cast(nonNullFieldEA(J9ROMClass._varHandleMethodTypeLookupTableOffset_));
	}

}
