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
 * Provides the local service utility for TestNotice. This utility wraps
 * <code>com.testService.service.impl.TestNoticeLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see TestNoticeLocalService
 * @generated
 */
public class TestNoticeLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.testService.service.impl.TestNoticeLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the test notice to the database. Also notifies the appropriate model listeners.
	 *
	 * @param testNotice the test notice
	 * @return the test notice that was added
	 */
	public static com.testService.model.TestNotice addTestNotice(
		com.testService.model.TestNotice testNotice) {

		return getService().addTestNotice(testNotice);
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
	 * Creates a new test notice with the primary key. Does not add the test notice to the database.
	 *
	 * @param noticeId the primary key for the new test notice
	 * @return the new test notice
	 */
	public static com.testService.model.TestNotice createTestNotice(
		long noticeId) {

		return getService().createTestNotice(noticeId);
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
	 * Deletes the test notice with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param noticeId the primary key of the test notice
	 * @return the test notice that was removed
	 * @throws PortalException if a test notice with the primary key could not be found
	 */
	public static com.testService.model.TestNotice deleteTestNotice(
			long noticeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteTestNotice(noticeId);
	}

	/**
	 * Deletes the test notice from the database. Also notifies the appropriate model listeners.
	 *
	 * @param testNotice the test notice
	 * @return the test notice that was removed
	 */
	public static com.testService.model.TestNotice deleteTestNotice(
		com.testService.model.TestNotice testNotice) {

		return getService().deleteTestNotice(testNotice);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.testService.model.impl.TestNoticeModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.testService.model.impl.TestNoticeModelImpl</code>.
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

	public static com.testService.model.TestNotice fetchTestNotice(
		long noticeId) {

		return getService().fetchTestNotice(noticeId);
	}

	public static com.testService.model.TestNotice findByOwnerId(long ownerId)
		throws com.testService.exception.NoSuchTestNoticeException {

		return getService().findByOwnerId(ownerId);
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
	 * Returns the test notice with the primary key.
	 *
	 * @param noticeId the primary key of the test notice
	 * @return the test notice
	 * @throws PortalException if a test notice with the primary key could not be found
	 */
	public static com.testService.model.TestNotice getTestNotice(long noticeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getTestNotice(noticeId);
	}

	/**
	 * Returns a range of all the test notices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.testService.model.impl.TestNoticeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of test notices
	 * @param end the upper bound of the range of test notices (not inclusive)
	 * @return the range of test notices
	 */
	public static java.util.List<com.testService.model.TestNotice>
		getTestNotices(int start, int end) {

		return getService().getTestNotices(start, end);
	}

	/**
	 * Returns the number of test notices.
	 *
	 * @return the number of test notices
	 */
	public static int getTestNoticesCount() {
		return getService().getTestNoticesCount();
	}

	/**
	 * Updates the test notice in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param testNotice the test notice
	 * @return the test notice that was updated
	 */
	public static com.testService.model.TestNotice updateTestNotice(
		com.testService.model.TestNotice testNotice) {

		return getService().updateTestNotice(testNotice);
	}

	public static TestNoticeLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<TestNoticeLocalService, TestNoticeLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(TestNoticeLocalService.class);

		ServiceTracker<TestNoticeLocalService, TestNoticeLocalService>
			serviceTracker =
				new ServiceTracker
					<TestNoticeLocalService, TestNoticeLocalService>(
						bundle.getBundleContext(), TestNoticeLocalService.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}