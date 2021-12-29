package com.ibm.oti.shared;

/*******************************************************************************
 * Copyright (c) 1998, 2017 IBM Corp. and others
 *
 * This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License 2.0 which accompanies this
 * distribution and is available at https://www.eclipse.org/legal/epl-2.0/
 * or the Apache License, Version 2.0 which accompanies this distribution and
 * is available at https://www.apache.org/licenses/LICENSE-2.0.
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

import java.net.URL;
import java.util.WeakHashMap;

import com.ibm.oti.util.Msg;
import java.util.Set;
import java.util.HashSet;

/** 
 * Implementation of SharedClassHelperFactory.
 * <p>
 * @see SharedClassHelperFactory
 * @see SharedAbstractHelperFactory
 */
final class SharedClassHelperFactoryImpl extends SharedAbstractHelperFactory implements SharedClassHelperFactory {

	private static final WeakHashMap<ClassLoader, SharedClassTokenHelper> tokenHelpers;
	private static final WeakHashMap<ClassLoader, SharedClassURLHelper> urlHelpers;
	private static final WeakHashMap<ClassLoader, SharedClassURLClasspathHelper> urlcpHelpers;

	private static SharedClassFilter globalSharingFilter;
	private static final String GLOBAL_SHARING_FILTER = "com.ibm.oti.shared.SharedClassGlobalFilterClass"; //$NON-NLS-1$

	static {
		tokenHelpers = new WeakHashMap<>();
		urlHelpers = new WeakHashMap<>();
		urlcpHelpers = new WeakHashMap<>();
	}

	private static SharedClassFilter getGlobalSharingFilter() {
		if (globalSharingFilter == null) {
			try {
				String className = com.ibm.oti.vm.VM.getVMLangAccess().internalGetProperties().getProperty(GLOBAL_SHARING_FILTER);
				if(null != className) {
					Class<?> filterClass = Class.forName(className);
					globalSharingFilter = SharedClassFilter.class.cast(filterClass.getDeclaredConstructor().newInstance());
				}
			} catch (Exception e) {
				return null;
			}
		}
		return globalSharingFilter;
	}

	@Override
	public SharedClassHelper findHelperForClassLoader(ClassLoader loader) {	
		Set<SharedClassHelper> helperSet = findHelpersForClassLoader(loader);
		int size = helperSet.size();
		if (1 == size) {
			for (SharedClassHelper helper : helperSet) {
				return helper;
			}
		} else if (size > 1) {
			// K0642 = This classloader has more than one helper
			throw new java.lang.IllegalStateException(Msg.getString("K0642")); //$NON-NLS-1$
		}
		return null;
	}
	
	@Override
	public Set<SharedClassHelper> findHelpersForClassLoader(ClassLoader loader) {
		Set<SharedClassHelper> helperSet = new HashSet<>();
		SharedClassHelper tokenHelper = tokenHelpers.get(loader);
		SharedClassHelper urlHelper = urlHelpers.get(loader);
		SharedClassHelper urlcpHelper = urlcpHelpers.get(loader);
		if (null != tokenHelper) {
			helperSet.add(tokenHelper);
		}
		if (null != urlHelper) {
			helperSet.add(urlHelper);
		}
		if (null != urlcpHelper) {
			helperSet.add(urlcpHelper);
		}
		return helperSet;
	}
	
	@Override
	public SharedClassTokenHelper getTokenHelper(
			ClassLoader loader, SharedClassFilter filter)
	{
		SharedClassTokenHelper helper = getTokenHelper(loader);
		if (helper!=null) helper.setSharingFilter(filter);
		return helper;
	}

	@Override
	public SharedClassTokenHelper getTokenHelper(ClassLoader loader)
	{
		if (loader==null) {
			return null;
		}
		WeakHashMap<ClassLoader, SharedClassTokenHelper> helpers = tokenHelpers;

		synchronized(helpers) {
			SharedClassTokenHelper helper = helpers.get(loader);
			if (helper != null) {
				return helper;
			} else {
				boolean canFind = canFind(loader);
				boolean canStore = canStore(loader);

				if (canFind || canStore) {
					SharedClassTokenHelper result = new SharedClassTokenHelperImpl(loader, getNewID(), canFind, canStore);
					SharedClassFilter filter = getGlobalSharingFilter();
					if (filter != null) {
						result.setSharingFilter(filter);
					}
					helpers.put(loader, result);
					return result;
				}
			}
		}
		return null;
	}

	@Override
	public SharedClassURLHelper getURLHelper(
			ClassLoader loader, SharedClassFilter filter) 
	{
		SharedClassURLHelper helper = getURLHelper(loader);
		if (helper!=null) helper.setSharingFilter(filter);
		return helper;
	}
	
	@Override
	public SharedClassURLHelper getURLHelper(ClassLoader loader)
	{
		if (loader==null) {
			return null;
		}
		WeakHashMap<ClassLoader, SharedClassURLHelper> helpers = urlHelpers;
		synchronized(helpers) {
			SharedClassURLHelper helper = helpers.get(loader);
			if (helper != null) {
				return helper;
			} else {
				boolean canFind = canFind(loader);
				boolean canStore = canStore(loader);

				if (canFind || canStore) {
					SharedClassURLHelper result = new SharedClassURLHelperImpl(loader, getNewID(), canFind, canStore);
					SharedClassFilter filter = getGlobalSharingFilter();
					if (filter != null) {
						result.setSharingFilter(filter);
					}
					helpers.put(loader, result);
					return result;
				}
			}
		}
		return null;
	}
	
	@Override
	public SharedClassURLClasspathHelper getURLClasspathHelper(
			ClassLoader loader, URL[] classpath, SharedClassFilter filter) throws HelperAlreadyDefinedException {
		SharedClassURLClasspathHelper helper = getURLClasspathHelper(loader,classpath);
		if (helper!=null) helper.setSharingFilter(filter);
		return helper;
	}

	@Override
	public SharedClassURLClasspathHelper getURLClasspathHelper(
			ClassLoader loader, URL[] classpath)  throws HelperAlreadyDefinedException {
		if (loader==null || classpath==null) {
			return null;
		}
		WeakHashMap<ClassLoader, SharedClassURLClasspathHelper> helpers = urlcpHelpers;
		
		synchronized(helpers) {
			SharedClassURLClasspathHelper helper = helpers.get(loader);
			SharedClassURLClasspathHelperImpl result;
			boolean found = true;
			if (helper != null) {
					result = (SharedClassURLClasspathHelperImpl)helper;
					URL[] testCP = result.getClasspath();
					for (int j=0; j<classpath.length; j++) {
						if (!classpath[j].equals(testCP[j])) {
							found = false;
							break;
						}
					}
					if (found) {
						return result;
					} else {
						// K059e = A SharedClassURLClasspathHelper already exists for this classloader with a different classpath
						throw new HelperAlreadyDefinedException(Msg.getString("K059e")); //$NON-NLS-1$
					}
			} else {
				boolean canFind = canFind(loader);
				boolean canStore = canStore(loader);

				if (canFind || canStore) {
					result = new SharedClassURLClasspathHelperImpl(loader, classpath, getNewID(), canFind, canStore);
					SharedClassFilter filter = getGlobalSharingFilter();
					if (filter != null) {
						result.setSharingFilter(filter);
					}
					helpers.put(loader, result);
					return result;
				}
			}
		}
		return null;
	}

}
