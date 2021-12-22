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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TestNoticeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TestNoticeLocalService
 * @generated
 */
public class TestNoticeLocalServiceWrapper
	implements ServiceWrapper<TestNoticeLocalService>, TestNoticeLocalService {

	public TestNoticeLocalServiceWrapper(
		TestNoticeLocalService testNoticeLocalService) {

		_testNoticeLocalService = testNoticeLocalService;
	}

	/**
	 * Adds the test notice to the database. Also notifies the appropriate model listeners.
	 *
	 * @param testNotice the test notice
	 * @return the test notice that was added
	 */
	@Override
	public com.testService.model.TestNotice addTestNotice(
		com.testService.model.TestNotice testNotice) {

		return _testNoticeLocalService.addTestNotice(testNotice);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _testNoticeLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new test notice with the primary key. Does not add the test notice to the database.
	 *
	 * @param noticeId the primary key for the new test notice
	 * @return the new test notice
	 */
	@Override
	public com.testService.model.TestNotice createTestNotice(long noticeId) {
		return _testNoticeLocalService.createTestNotice(noticeId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _testNoticeLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the test notice with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param noticeId the primary key of the test notice
	 * @return the test notice that was removed
	 * @throws PortalException if a test notice with the primary key could not be found
	 */
	@Override
	public com.testService.model.TestNotice deleteTestNotice(long noticeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _testNoticeLocalService.deleteTestNotice(noticeId);
	}

	/**
	 * Deletes the test notice from the database. Also notifies the appropriate model listeners.
	 *
	 * @param testNotice the test notice
	 * @return the test notice that was removed
	 */
	@Override
	public com.testService.model.TestNotice deleteTestNotice(
		com.testService.model.TestNotice testNotice) {

		return _testNoticeLocalService.deleteTestNotice(testNotice);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _testNoticeLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _testNoticeLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _testNoticeLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _testNoticeLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _testNoticeLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _testNoticeLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.testService.model.TestNotice fetchTestNotice(long noticeId) {
		return _testNoticeLocalService.fetchTestNotice(noticeId);
	}

	@Override
	public java.util.List<com.testService.model.TestNotice> findAll() {
		return _testNoticeLocalService.findAll();
	}

	@Override
	public com.testService.model.TestNotice findByOwnerId(long ownerId)
		throws com.testService.exception.NoSuchTestNoticeException {

		return _testNoticeLocalService.findByOwnerId(ownerId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _testNoticeLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _testNoticeLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _testNoticeLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _testNoticeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the test notice with the primary key.
	 *
	 * @param noticeId the primary key of the test notice
	 * @return the test notice
	 * @throws PortalException if a test notice with the primary key could not be found
	 */
	@Override
	public com.testService.model.TestNotice getTestNotice(long noticeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _testNoticeLocalService.getTestNotice(noticeId);
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
	@Override
	public java.util.List<com.testService.model.TestNotice> getTestNotices(
		int start, int end) {

		return _testNoticeLocalService.getTestNotices(start, end);
	}

	/**
	 * Returns the number of test notices.
	 *
	 * @return the number of test notices
	 */
	@Override
	public int getTestNoticesCount() {
		return _testNoticeLocalService.getTestNoticesCount();
	}

	/**
	 * Updates the test notice in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param testNotice the test notice
	 * @return the test notice that was updated
	 */
	@Override
	public com.testService.model.TestNotice updateTestNotice(
		com.testService.model.TestNotice testNotice) {

		return _testNoticeLocalService.updateTestNotice(testNotice);
	}

	@Override
	public TestNoticeLocalService getWrappedService() {
		return _testNoticeLocalService;
	}

	@Override
	public void setWrappedService(
		TestNoticeLocalService testNoticeLocalService) {

		_testNoticeLocalService = testNoticeLocalService;
	}

	private TestNoticeLocalService _testNoticeLocalService;

}