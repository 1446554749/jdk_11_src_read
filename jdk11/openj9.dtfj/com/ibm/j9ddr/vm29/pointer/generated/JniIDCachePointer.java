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
 * Structure: JniIDCachePointer
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
 * The generated code will provide getters for all elements in the JniIDCachePointer
 * structure.  Where possible, meaningful return types are inferred.
 *
 * The user may add methods to provide meaningful return types where only pointers
 * could be automatically inferred.
 */
@com.ibm.j9ddr.GeneratedPointerClass(structureClass=JniIDCache.class)
public class JniIDCachePointer extends StructurePointer {

	// NULL
	public static final JniIDCachePointer NULL = new JniIDCachePointer(0);

/*[BEGIN USER CODE]*/
/*[END USER CODE]*/

	// Do not call this constructor.  Use static method cast instead.
	protected JniIDCachePointer(long address) {
		super(address);
	}

	public static JniIDCachePointer cast(AbstractPointer structure) {
		return cast(structure.getAddress());
	}

	public static JniIDCachePointer cast(UDATA udata) {
		return cast(udata.longValue());
	}

	public static JniIDCachePointer cast(long address) {
		if (address == 0) {
			return NULL;
		}
		return new JniIDCachePointer(address);
	}

	public JniIDCachePointer add(long count) {
		return JniIDCachePointer.cast(address + (JniIDCache.SIZEOF * count));
	}

	public JniIDCachePointer add(Scalar count) {
		return add(count.longValue());
	}

	public JniIDCachePointer addOffset(long offset) {
		return JniIDCachePointer.cast(address + offset);
	}

	public JniIDCachePointer addOffset(Scalar offset) {
		return addOffset(offset.longValue());
	}

	public JniIDCachePointer sub(long count) {
		return JniIDCachePointer.cast(address - (JniIDCache.SIZEOF * count));
	}

	public JniIDCachePointer sub(Scalar count) {
		return sub(count.longValue());
	}

	public JniIDCachePointer subOffset(long offset) {
		return JniIDCachePointer.cast(address - offset);
	}

	public JniIDCachePointer subOffset(Scalar offset) {
		return subOffset(offset.longValue());
	}

	public JniIDCachePointer untag(long mask) {
		return JniIDCachePointer.cast(address & ~mask);
	}

	public JniIDCachePointer untag() {
		return untag(UDATA.SIZEOF - 1);
	}

	protected long sizeOfBaseType() {
		return JniIDCache.SIZEOF;
	}

	// Implementation methods

	// jclass CLS_com_ibm_lang_management_MemoryUsage
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CLS_com_ibm_lang_management_MemoryUsageOffset_", declaredType="jclass")
	public _jclassPointer CLS_com_ibm_lang_management_MemoryUsage() throws CorruptDataException {
		return _jclassPointer.cast(getPointerAtOffset(JniIDCache._CLS_com_ibm_lang_management_MemoryUsageOffset_));
	}

	// jclass CLS_com_ibm_lang_management_MemoryUsage
	public PointerPointer CLS_com_ibm_lang_management_MemoryUsageEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._CLS_com_ibm_lang_management_MemoryUsageOffset_));
	}

	// jclass CLS_com_ibm_lang_management_ProcessorUsage
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CLS_com_ibm_lang_management_ProcessorUsageOffset_", declaredType="jclass")
	public _jclassPointer CLS_com_ibm_lang_management_ProcessorUsage() throws CorruptDataException {
		return _jclassPointer.cast(getPointerAtOffset(JniIDCache._CLS_com_ibm_lang_management_ProcessorUsageOffset_));
	}

	// jclass CLS_com_ibm_lang_management_ProcessorUsage
	public PointerPointer CLS_com_ibm_lang_management_ProcessorUsageEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._CLS_com_ibm_lang_management_ProcessorUsageOffset_));
	}

	// jclass CLS_com_ibm_oti_shared_SharedClassCacheInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CLS_com_ibm_oti_shared_SharedClassCacheInfoOffset_", declaredType="jclass")
	public _jclassPointer CLS_com_ibm_oti_shared_SharedClassCacheInfo() throws CorruptDataException {
		return _jclassPointer.cast(getPointerAtOffset(JniIDCache._CLS_com_ibm_oti_shared_SharedClassCacheInfoOffset_));
	}

	// jclass CLS_com_ibm_oti_shared_SharedClassCacheInfo
	public PointerPointer CLS_com_ibm_oti_shared_SharedClassCacheInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._CLS_com_ibm_oti_shared_SharedClassCacheInfoOffset_));
	}

	// jclass CLS_java_com_ibm_lang_management_JvmCpuMonitorInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CLS_java_com_ibm_lang_management_JvmCpuMonitorInfoOffset_", declaredType="jclass")
	public _jclassPointer CLS_java_com_ibm_lang_management_JvmCpuMonitorInfo() throws CorruptDataException {
		return _jclassPointer.cast(getPointerAtOffset(JniIDCache._CLS_java_com_ibm_lang_management_JvmCpuMonitorInfoOffset_));
	}

	// jclass CLS_java_com_ibm_lang_management_JvmCpuMonitorInfo
	public PointerPointer CLS_java_com_ibm_lang_management_JvmCpuMonitorInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._CLS_java_com_ibm_lang_management_JvmCpuMonitorInfoOffset_));
	}

	// jclass CLS_java_com_ibm_virtualization_management_GuestOSMemoryUsage
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CLS_java_com_ibm_virtualization_management_GuestOSMemoryUsageOffset_", declaredType="jclass")
	public _jclassPointer CLS_java_com_ibm_virtualization_management_GuestOSMemoryUsage() throws CorruptDataException {
		return _jclassPointer.cast(getPointerAtOffset(JniIDCache._CLS_java_com_ibm_virtualization_management_GuestOSMemoryUsageOffset_));
	}

	// jclass CLS_java_com_ibm_virtualization_management_GuestOSMemoryUsage
	public PointerPointer CLS_java_com_ibm_virtualization_management_GuestOSMemoryUsageEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._CLS_java_com_ibm_virtualization_management_GuestOSMemoryUsageOffset_));
	}

	// jclass CLS_java_com_ibm_virtualization_management_GuestOSProcessorUsage
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CLS_java_com_ibm_virtualization_management_GuestOSProcessorUsageOffset_", declaredType="jclass")
	public _jclassPointer CLS_java_com_ibm_virtualization_management_GuestOSProcessorUsage() throws CorruptDataException {
		return _jclassPointer.cast(getPointerAtOffset(JniIDCache._CLS_java_com_ibm_virtualization_management_GuestOSProcessorUsageOffset_));
	}

	// jclass CLS_java_com_ibm_virtualization_management_GuestOSProcessorUsage
	public PointerPointer CLS_java_com_ibm_virtualization_management_GuestOSProcessorUsageEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._CLS_java_com_ibm_virtualization_management_GuestOSProcessorUsageOffset_));
	}

	// jclass CLS_java_lang_AnonymousClassLoader
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CLS_java_lang_AnonymousClassLoaderOffset_", declaredType="jclass")
	public _jclassPointer CLS_java_lang_AnonymousClassLoader() throws CorruptDataException {
		return _jclassPointer.cast(getPointerAtOffset(JniIDCache._CLS_java_lang_AnonymousClassLoaderOffset_));
	}

	// jclass CLS_java_lang_AnonymousClassLoader
	public PointerPointer CLS_java_lang_AnonymousClassLoaderEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._CLS_java_lang_AnonymousClassLoaderOffset_));
	}

	// jclass CLS_java_lang_StackTraceElement
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CLS_java_lang_StackTraceElementOffset_", declaredType="jclass")
	public _jclassPointer CLS_java_lang_StackTraceElement() throws CorruptDataException {
		return _jclassPointer.cast(getPointerAtOffset(JniIDCache._CLS_java_lang_StackTraceElementOffset_));
	}

	// jclass CLS_java_lang_StackTraceElement
	public PointerPointer CLS_java_lang_StackTraceElementEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._CLS_java_lang_StackTraceElementOffset_));
	}

	// jclass CLS_java_lang_String
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CLS_java_lang_StringOffset_", declaredType="jclass")
	public _jclassPointer CLS_java_lang_String() throws CorruptDataException {
		return _jclassPointer.cast(getPointerAtOffset(JniIDCache._CLS_java_lang_StringOffset_));
	}

	// jclass CLS_java_lang_String
	public PointerPointer CLS_java_lang_StringEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._CLS_java_lang_StringOffset_));
	}

	// jclass CLS_java_lang_reflect_Parameter
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CLS_java_lang_reflect_ParameterOffset_", declaredType="jclass")
	public _jclassPointer CLS_java_lang_reflect_Parameter() throws CorruptDataException {
		return _jclassPointer.cast(getPointerAtOffset(JniIDCache._CLS_java_lang_reflect_ParameterOffset_));
	}

	// jclass CLS_java_lang_reflect_Parameter
	public PointerPointer CLS_java_lang_reflect_ParameterEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._CLS_java_lang_reflect_ParameterOffset_));
	}

	// jclass CLS_java_net_URL
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CLS_java_net_URLOffset_", declaredType="jclass")
	public _jclassPointer CLS_java_net_URL() throws CorruptDataException {
		return _jclassPointer.cast(getPointerAtOffset(JniIDCache._CLS_java_net_URLOffset_));
	}

	// jclass CLS_java_net_URL
	public PointerPointer CLS_java_net_URLEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._CLS_java_net_URLOffset_));
	}

	// jclass CLS_java_security_AccessController
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CLS_java_security_AccessControllerOffset_", declaredType="jclass")
	public _jclassPointer CLS_java_security_AccessController() throws CorruptDataException {
		return _jclassPointer.cast(getPointerAtOffset(JniIDCache._CLS_java_security_AccessControllerOffset_));
	}

	// jclass CLS_java_security_AccessController
	public PointerPointer CLS_java_security_AccessControllerEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._CLS_java_security_AccessControllerOffset_));
	}

	// jclass CLS_java_util_ArrayList
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CLS_java_util_ArrayListOffset_", declaredType="jclass")
	public _jclassPointer CLS_java_util_ArrayList() throws CorruptDataException {
		return _jclassPointer.cast(getPointerAtOffset(JniIDCache._CLS_java_util_ArrayListOffset_));
	}

	// jclass CLS_java_util_ArrayList
	public PointerPointer CLS_java_util_ArrayListEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._CLS_java_util_ArrayListOffset_));
	}

	// jclass CLS_openj9_management_internal_LockInfoBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CLS_openj9_management_internal_LockInfoBaseOffset_", declaredType="jclass")
	public _jclassPointer CLS_openj9_management_internal_LockInfoBase() throws CorruptDataException {
		return _jclassPointer.cast(getPointerAtOffset(JniIDCache._CLS_openj9_management_internal_LockInfoBaseOffset_));
	}

	// jclass CLS_openj9_management_internal_LockInfoBase
	public PointerPointer CLS_openj9_management_internal_LockInfoBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._CLS_openj9_management_internal_LockInfoBaseOffset_));
	}

	// jclass CLS_openj9_management_internal_MonitorInfoBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CLS_openj9_management_internal_MonitorInfoBaseOffset_", declaredType="jclass")
	public _jclassPointer CLS_openj9_management_internal_MonitorInfoBase() throws CorruptDataException {
		return _jclassPointer.cast(getPointerAtOffset(JniIDCache._CLS_openj9_management_internal_MonitorInfoBaseOffset_));
	}

	// jclass CLS_openj9_management_internal_MonitorInfoBase
	public PointerPointer CLS_openj9_management_internal_MonitorInfoBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._CLS_openj9_management_internal_MonitorInfoBaseOffset_));
	}

	// jclass CLS_openj9_management_internal_ThreadInfoBase
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CLS_openj9_management_internal_ThreadInfoBaseOffset_", declaredType="jclass")
	public _jclassPointer CLS_openj9_management_internal_ThreadInfoBase() throws CorruptDataException {
		return _jclassPointer.cast(getPointerAtOffset(JniIDCache._CLS_openj9_management_internal_ThreadInfoBaseOffset_));
	}

	// jclass CLS_openj9_management_internal_ThreadInfoBase
	public PointerPointer CLS_openj9_management_internal_ThreadInfoBaseEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._CLS_openj9_management_internal_ThreadInfoBaseOffset_));
	}

	// jclass CLS_sun_reflect_ConstantPool
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_CLS_sun_reflect_ConstantPoolOffset_", declaredType="jclass")
	public _jclassPointer CLS_sun_reflect_ConstantPool() throws CorruptDataException {
		return _jclassPointer.cast(getPointerAtOffset(JniIDCache._CLS_sun_reflect_ConstantPoolOffset_));
	}

	// jclass CLS_sun_reflect_ConstantPool
	public PointerPointer CLS_sun_reflect_ConstantPoolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._CLS_sun_reflect_ConstantPoolOffset_));
	}

	// jfieldID FID_java_lang_ClassLoader_vmRef
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_FID_java_lang_ClassLoader_vmRefOffset_", declaredType="jfieldID")
	public _jfieldIDPointer FID_java_lang_ClassLoader_vmRef() throws CorruptDataException {
		return _jfieldIDPointer.cast(getPointerAtOffset(JniIDCache._FID_java_lang_ClassLoader_vmRefOffset_));
	}

	// jfieldID FID_java_lang_ClassLoader_vmRef
	public PointerPointer FID_java_lang_ClassLoader_vmRefEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._FID_java_lang_ClassLoader_vmRefOffset_));
	}

	// jfieldID FID_sun_reflect_ConstantPool_constantPoolOop
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_FID_sun_reflect_ConstantPool_constantPoolOopOffset_", declaredType="jfieldID")
	public _jfieldIDPointer FID_sun_reflect_ConstantPool_constantPoolOop() throws CorruptDataException {
		return _jfieldIDPointer.cast(getPointerAtOffset(JniIDCache._FID_sun_reflect_ConstantPool_constantPoolOopOffset_));
	}

	// jfieldID FID_sun_reflect_ConstantPool_constantPoolOop
	public PointerPointer FID_sun_reflect_ConstantPool_constantPoolOopEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._FID_sun_reflect_ConstantPool_constantPoolOopOffset_));
	}

	// jmethodID MID_com_ibm_jvm_Stats_setFields
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MID_com_ibm_jvm_Stats_setFieldsOffset_", declaredType="jmethodID")
	public _jmethodIDPointer MID_com_ibm_jvm_Stats_setFields() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(JniIDCache._MID_com_ibm_jvm_Stats_setFieldsOffset_));
	}

	// jmethodID MID_com_ibm_jvm_Stats_setFields
	public PointerPointer MID_com_ibm_jvm_Stats_setFieldsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._MID_com_ibm_jvm_Stats_setFieldsOffset_));
	}

	// jmethodID MID_com_ibm_lang_management_GarbageCollectorMXBeanImpl_getName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MID_com_ibm_lang_management_GarbageCollectorMXBeanImpl_getNameOffset_", declaredType="jmethodID")
	public _jmethodIDPointer MID_com_ibm_lang_management_GarbageCollectorMXBeanImpl_getName() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(JniIDCache._MID_com_ibm_lang_management_GarbageCollectorMXBeanImpl_getNameOffset_));
	}

	// jmethodID MID_com_ibm_lang_management_GarbageCollectorMXBeanImpl_getName
	public PointerPointer MID_com_ibm_lang_management_GarbageCollectorMXBeanImpl_getNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._MID_com_ibm_lang_management_GarbageCollectorMXBeanImpl_getNameOffset_));
	}

	// jmethodID MID_com_ibm_lang_management_MemoryUsage_updateValues
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MID_com_ibm_lang_management_MemoryUsage_updateValuesOffset_", declaredType="jmethodID")
	public _jmethodIDPointer MID_com_ibm_lang_management_MemoryUsage_updateValues() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(JniIDCache._MID_com_ibm_lang_management_MemoryUsage_updateValuesOffset_));
	}

	// jmethodID MID_com_ibm_lang_management_MemoryUsage_updateValues
	public PointerPointer MID_com_ibm_lang_management_MemoryUsage_updateValuesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._MID_com_ibm_lang_management_MemoryUsage_updateValuesOffset_));
	}

	// jmethodID MID_com_ibm_lang_management_ProcessorUsage_init
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MID_com_ibm_lang_management_ProcessorUsage_initOffset_", declaredType="jmethodID")
	public _jmethodIDPointer MID_com_ibm_lang_management_ProcessorUsage_init() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(JniIDCache._MID_com_ibm_lang_management_ProcessorUsage_initOffset_));
	}

	// jmethodID MID_com_ibm_lang_management_ProcessorUsage_init
	public PointerPointer MID_com_ibm_lang_management_ProcessorUsage_initEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._MID_com_ibm_lang_management_ProcessorUsage_initOffset_));
	}

	// jmethodID MID_com_ibm_lang_management_ProcessorUsage_updateValues
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MID_com_ibm_lang_management_ProcessorUsage_updateValuesOffset_", declaredType="jmethodID")
	public _jmethodIDPointer MID_com_ibm_lang_management_ProcessorUsage_updateValues() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(JniIDCache._MID_com_ibm_lang_management_ProcessorUsage_updateValuesOffset_));
	}

	// jmethodID MID_com_ibm_lang_management_ProcessorUsage_updateValues
	public PointerPointer MID_com_ibm_lang_management_ProcessorUsage_updateValuesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._MID_com_ibm_lang_management_ProcessorUsage_updateValuesOffset_));
	}

	// jmethodID MID_com_ibm_lang_management_internal_ExtendedGarbageCollectorMXBeanImpl_buildGcInfo
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MID_com_ibm_lang_management_internal_ExtendedGarbageCollectorMXBeanImpl_buildGcInfoOffset_", declaredType="jmethodID")
	public _jmethodIDPointer MID_com_ibm_lang_management_internal_ExtendedGarbageCollectorMXBeanImpl_buildGcInfo() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(JniIDCache._MID_com_ibm_lang_management_internal_ExtendedGarbageCollectorMXBeanImpl_buildGcInfoOffset_));
	}

	// jmethodID MID_com_ibm_lang_management_internal_ExtendedGarbageCollectorMXBeanImpl_buildGcInfo
	public PointerPointer MID_com_ibm_lang_management_internal_ExtendedGarbageCollectorMXBeanImpl_buildGcInfoEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._MID_com_ibm_lang_management_internal_ExtendedGarbageCollectorMXBeanImpl_buildGcInfoOffset_));
	}

	// jmethodID MID_com_ibm_oti_shared_SharedClassCacheInfo_init
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MID_com_ibm_oti_shared_SharedClassCacheInfo_initOffset_", declaredType="jmethodID")
	public _jmethodIDPointer MID_com_ibm_oti_shared_SharedClassCacheInfo_init() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(JniIDCache._MID_com_ibm_oti_shared_SharedClassCacheInfo_initOffset_));
	}

	// jmethodID MID_com_ibm_oti_shared_SharedClassCacheInfo_init
	public PointerPointer MID_com_ibm_oti_shared_SharedClassCacheInfo_initEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._MID_com_ibm_oti_shared_SharedClassCacheInfo_initOffset_));
	}

	// jmethodID MID_java_com_ibm_lang_management_JvmCpuMonitorInfo_updateValues
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MID_java_com_ibm_lang_management_JvmCpuMonitorInfo_updateValuesOffset_", declaredType="jmethodID")
	public _jmethodIDPointer MID_java_com_ibm_lang_management_JvmCpuMonitorInfo_updateValues() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(JniIDCache._MID_java_com_ibm_lang_management_JvmCpuMonitorInfo_updateValuesOffset_));
	}

	// jmethodID MID_java_com_ibm_lang_management_JvmCpuMonitorInfo_updateValues
	public PointerPointer MID_java_com_ibm_lang_management_JvmCpuMonitorInfo_updateValuesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._MID_java_com_ibm_lang_management_JvmCpuMonitorInfo_updateValuesOffset_));
	}

	// jmethodID MID_java_com_ibm_virtualization_management_GuestOSMemoryUsage_updateValues
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MID_java_com_ibm_virtualization_management_GuestOSMemoryUsage_updateValuesOffset_", declaredType="jmethodID")
	public _jmethodIDPointer MID_java_com_ibm_virtualization_management_GuestOSMemoryUsage_updateValues() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(JniIDCache._MID_java_com_ibm_virtualization_management_GuestOSMemoryUsage_updateValuesOffset_));
	}

	// jmethodID MID_java_com_ibm_virtualization_management_GuestOSMemoryUsage_updateValues
	public PointerPointer MID_java_com_ibm_virtualization_management_GuestOSMemoryUsage_updateValuesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._MID_java_com_ibm_virtualization_management_GuestOSMemoryUsage_updateValuesOffset_));
	}

	// jmethodID MID_java_com_ibm_virtualization_management_GuestOSProcessorUsage_updateValues
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MID_java_com_ibm_virtualization_management_GuestOSProcessorUsage_updateValuesOffset_", declaredType="jmethodID")
	public _jmethodIDPointer MID_java_com_ibm_virtualization_management_GuestOSProcessorUsage_updateValues() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(JniIDCache._MID_java_com_ibm_virtualization_management_GuestOSProcessorUsage_updateValuesOffset_));
	}

	// jmethodID MID_java_com_ibm_virtualization_management_GuestOSProcessorUsage_updateValues
	public PointerPointer MID_java_com_ibm_virtualization_management_GuestOSProcessorUsage_updateValuesEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._MID_java_com_ibm_virtualization_management_GuestOSProcessorUsage_updateValuesOffset_));
	}

	// jmethodID MID_java_lang_AnonymousClassLoader_init
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MID_java_lang_AnonymousClassLoader_initOffset_", declaredType="jmethodID")
	public _jmethodIDPointer MID_java_lang_AnonymousClassLoader_init() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(JniIDCache._MID_java_lang_AnonymousClassLoader_initOffset_));
	}

	// jmethodID MID_java_lang_AnonymousClassLoader_init
	public PointerPointer MID_java_lang_AnonymousClassLoader_initEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._MID_java_lang_AnonymousClassLoader_initOffset_));
	}

	// jmethodID MID_java_lang_ClassLoader_findLoadedClass
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MID_java_lang_ClassLoader_findLoadedClassOffset_", declaredType="jmethodID")
	public _jmethodIDPointer MID_java_lang_ClassLoader_findLoadedClass() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(JniIDCache._MID_java_lang_ClassLoader_findLoadedClassOffset_));
	}

	// jmethodID MID_java_lang_ClassLoader_findLoadedClass
	public PointerPointer MID_java_lang_ClassLoader_findLoadedClassEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._MID_java_lang_ClassLoader_findLoadedClassOffset_));
	}

	// jmethodID MID_java_lang_Class_getName
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MID_java_lang_Class_getNameOffset_", declaredType="jmethodID")
	public _jmethodIDPointer MID_java_lang_Class_getName() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(JniIDCache._MID_java_lang_Class_getNameOffset_));
	}

	// jmethodID MID_java_lang_Class_getName
	public PointerPointer MID_java_lang_Class_getNameEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._MID_java_lang_Class_getNameOffset_));
	}

	// jmethodID MID_java_lang_StackTraceElement_isNativeMethod
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MID_java_lang_StackTraceElement_isNativeMethodOffset_", declaredType="jmethodID")
	public _jmethodIDPointer MID_java_lang_StackTraceElement_isNativeMethod() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(JniIDCache._MID_java_lang_StackTraceElement_isNativeMethodOffset_));
	}

	// jmethodID MID_java_lang_StackTraceElement_isNativeMethod
	public PointerPointer MID_java_lang_StackTraceElement_isNativeMethodEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._MID_java_lang_StackTraceElement_isNativeMethodOffset_));
	}

	// jmethodID MID_java_lang_StackWalker_walkWrapperImpl
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MID_java_lang_StackWalker_walkWrapperImplOffset_", declaredType="jmethodID")
	public _jmethodIDPointer MID_java_lang_StackWalker_walkWrapperImpl() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(JniIDCache._MID_java_lang_StackWalker_walkWrapperImplOffset_));
	}

	// jmethodID MID_java_lang_StackWalker_walkWrapperImpl
	public PointerPointer MID_java_lang_StackWalker_walkWrapperImplEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._MID_java_lang_StackWalker_walkWrapperImplOffset_));
	}

	// jmethodID MID_java_lang_reflect_Parameter_init
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MID_java_lang_reflect_Parameter_initOffset_", declaredType="jmethodID")
	public _jmethodIDPointer MID_java_lang_reflect_Parameter_init() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(JniIDCache._MID_java_lang_reflect_Parameter_initOffset_));
	}

	// jmethodID MID_java_lang_reflect_Parameter_init
	public PointerPointer MID_java_lang_reflect_Parameter_initEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._MID_java_lang_reflect_Parameter_initOffset_));
	}

	// jmethodID MID_java_net_URL_getPath
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MID_java_net_URL_getPathOffset_", declaredType="jmethodID")
	public _jmethodIDPointer MID_java_net_URL_getPath() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(JniIDCache._MID_java_net_URL_getPathOffset_));
	}

	// jmethodID MID_java_net_URL_getPath
	public PointerPointer MID_java_net_URL_getPathEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._MID_java_net_URL_getPathOffset_));
	}

	// jmethodID MID_java_net_URL_getProtocol
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MID_java_net_URL_getProtocolOffset_", declaredType="jmethodID")
	public _jmethodIDPointer MID_java_net_URL_getProtocol() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(JniIDCache._MID_java_net_URL_getProtocolOffset_));
	}

	// jmethodID MID_java_net_URL_getProtocol
	public PointerPointer MID_java_net_URL_getProtocolEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._MID_java_net_URL_getProtocolOffset_));
	}

	// jmethodID MID_java_security_AccessController_checkPermission
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MID_java_security_AccessController_checkPermissionOffset_", declaredType="jmethodID")
	public _jmethodIDPointer MID_java_security_AccessController_checkPermission() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(JniIDCache._MID_java_security_AccessController_checkPermissionOffset_));
	}

	// jmethodID MID_java_security_AccessController_checkPermission
	public PointerPointer MID_java_security_AccessController_checkPermissionEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._MID_java_security_AccessController_checkPermissionOffset_));
	}

	// jmethodID MID_java_util_ArrayList_add
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MID_java_util_ArrayList_addOffset_", declaredType="jmethodID")
	public _jmethodIDPointer MID_java_util_ArrayList_add() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(JniIDCache._MID_java_util_ArrayList_addOffset_));
	}

	// jmethodID MID_java_util_ArrayList_add
	public PointerPointer MID_java_util_ArrayList_addEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._MID_java_util_ArrayList_addOffset_));
	}

	// jmethodID MID_openj9_management_internal_LockInfoBase_init
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MID_openj9_management_internal_LockInfoBase_initOffset_", declaredType="jmethodID")
	public _jmethodIDPointer MID_openj9_management_internal_LockInfoBase_init() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(JniIDCache._MID_openj9_management_internal_LockInfoBase_initOffset_));
	}

	// jmethodID MID_openj9_management_internal_LockInfoBase_init
	public PointerPointer MID_openj9_management_internal_LockInfoBase_initEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._MID_openj9_management_internal_LockInfoBase_initOffset_));
	}

	// jmethodID MID_openj9_management_internal_MonitorInfoBase_init
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MID_openj9_management_internal_MonitorInfoBase_initOffset_", declaredType="jmethodID")
	public _jmethodIDPointer MID_openj9_management_internal_MonitorInfoBase_init() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(JniIDCache._MID_openj9_management_internal_MonitorInfoBase_initOffset_));
	}

	// jmethodID MID_openj9_management_internal_MonitorInfoBase_init
	public PointerPointer MID_openj9_management_internal_MonitorInfoBase_initEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._MID_openj9_management_internal_MonitorInfoBase_initOffset_));
	}

	// jmethodID MID_openj9_management_internal_ThreadInfoBase_init
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MID_openj9_management_internal_ThreadInfoBase_initOffset_", declaredType="jmethodID")
	public _jmethodIDPointer MID_openj9_management_internal_ThreadInfoBase_init() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(JniIDCache._MID_openj9_management_internal_ThreadInfoBase_initOffset_));
	}

	// jmethodID MID_openj9_management_internal_ThreadInfoBase_init
	public PointerPointer MID_openj9_management_internal_ThreadInfoBase_initEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._MID_openj9_management_internal_ThreadInfoBase_initOffset_));
	}

	// jmethodID MID_openj9_management_internal_ThreadInfoBase_init_nolocks
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_MID_openj9_management_internal_ThreadInfoBase_init_nolocksOffset_", declaredType="jmethodID")
	public _jmethodIDPointer MID_openj9_management_internal_ThreadInfoBase_init_nolocks() throws CorruptDataException {
		return _jmethodIDPointer.cast(getPointerAtOffset(JniIDCache._MID_openj9_management_internal_ThreadInfoBase_init_nolocksOffset_));
	}

	// jmethodID MID_openj9_management_internal_ThreadInfoBase_init_nolocks
	public PointerPointer MID_openj9_management_internal_ThreadInfoBase_init_nolocksEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._MID_openj9_management_internal_ThreadInfoBase_init_nolocksOffset_));
	}

	// traceDotCGlobalMemory traceGlobals
	@com.ibm.j9ddr.GeneratedFieldAccessor(offsetFieldName="_traceGlobalsOffset_", declaredType="traceDotCGlobalMemory")
	public traceDotCGlobalMemoryPointer traceGlobals() throws CorruptDataException {
		return traceDotCGlobalMemoryPointer.cast(nonNullFieldEA(JniIDCache._traceGlobalsOffset_));
	}

	// traceDotCGlobalMemory traceGlobals
	public PointerPointer traceGlobalsEA() throws CorruptDataException {
		return PointerPointer.cast(nonNullFieldEA(JniIDCache._traceGlobalsOffset_));
	}

}
