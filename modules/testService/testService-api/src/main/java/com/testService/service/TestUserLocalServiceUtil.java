/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.testService.service;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for TestUser. This utility wraps
 * <code>com.testService.service.impl.TestUserLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see TestUserLocalService
 * @generated
 */
public class TestUserLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.testService.service.impl.TestUserLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the test user to the database. Also notifies the appropriate model listeners.
	 *
	 * @param testUser the test user
	 * @return the test user that was added
	 */
	public static com.testService.model.TestUser addTestUser(
		com.testService.model.TestUser testUser) {

		return getService().addTestUser(testUser);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			createPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new test user with the primary key. Does not add the test user to the database.
	 *
	 * @param customUserId the primary key for the new test user
	 * @return the new test user
	 */
	public static com.testService.model.TestUser createTestUser(
		long customUserId) {

		return getService().createTestUser(customUserId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the test user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param customUserId the primary key of the test user
	 * @return the test user that was removed
	 * @throws PortalException if a test user with the primary key could not be found
	 */
	public static com.testService.model.TestUser deleteTestUser(
			long customUserId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteTestUser(customUserId);
	}

	/**
	 * Deletes the test user from the database. Also notifies the appropriate model listeners.
	 *
	 * @param testUser the test user
	 * @return the test user that was removed
	 */
	public static com.testService.model.TestUser deleteTestUser(
		com.testService.model.TestUser testUser) {

		return getService().deleteTestUser(testUser);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.testService.model.impl.TestUserModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.testService.model.impl.TestUserModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.testService.model.TestUser fetchTestUser(
		long customUserId) {

		return getService().fetchTestUser(customUserId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the test user with the primary key.
	 *
	 * @param customUserId the primary key of the test user
	 * @return the test user
	 * @throws PortalException if a test user with the primary key could not be found
	 */
	public static com.testService.model.TestUser getTestUser(long customUserId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getTestUser(customUserId);
	}

	/**
	 * Returns a range of all the test users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.testService.model.impl.TestUserModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of test users
	 * @param end the upper bound of the range of test users (not inclusive)
	 * @return the range of test users
	 */
	public static java.util.List<com.testService.model.TestUser> getTestUsers(
		int start, int end) {

		return getService().getTestUsers(start, end);
	}

	/**
	 * Returns the number of test users.
	 *
	 * @return the number of test users
	 */
	public static int getTestUsersCount() {
		return getService().getTestUsersCount();
	}

	/**
	 * Updates the test user in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param testUser the test user
	 * @return the test user that was updated
	 */
	public static com.testService.model.TestUser updateTestUser(
		com.testService.model.TestUser testUser) {

		return getService().updateTestUser(testUser);
	}

	public static TestUserLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TestUserLocalService, TestUserLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(TestUserLocalService.class);

		ServiceTracker<TestUserLocalService, TestUserLocalService>
			serviceTracker =
				new ServiceTracker<TestUserLocalService, TestUserLocalService>(
					bundle.getBundleContext(), TestUserLocalService.class,
					null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}