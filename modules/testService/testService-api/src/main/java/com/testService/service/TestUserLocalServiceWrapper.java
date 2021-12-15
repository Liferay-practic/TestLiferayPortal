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
 * Provides a wrapper for {@link TestUserLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TestUserLocalService
 * @generated
 */
public class TestUserLocalServiceWrapper
	implements ServiceWrapper<TestUserLocalService>, TestUserLocalService {

	public TestUserLocalServiceWrapper(
		TestUserLocalService testUserLocalService) {

		_testUserLocalService = testUserLocalService;
	}

	/**
	 * Adds the test user to the database. Also notifies the appropriate model listeners.
	 *
	 * @param testUser the test user
	 * @return the test user that was added
	 */
	@Override
	public com.testService.model.TestUser addTestUser(
		com.testService.model.TestUser testUser) {

		return _testUserLocalService.addTestUser(testUser);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _testUserLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new test user with the primary key. Does not add the test user to the database.
	 *
	 * @param customUserId the primary key for the new test user
	 * @return the new test user
	 */
	@Override
	public com.testService.model.TestUser createTestUser(long customUserId) {
		return _testUserLocalService.createTestUser(customUserId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _testUserLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the test user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param customUserId the primary key of the test user
	 * @return the test user that was removed
	 * @throws PortalException if a test user with the primary key could not be found
	 */
	@Override
	public com.testService.model.TestUser deleteTestUser(long customUserId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _testUserLocalService.deleteTestUser(customUserId);
	}

	/**
	 * Deletes the test user from the database. Also notifies the appropriate model listeners.
	 *
	 * @param testUser the test user
	 * @return the test user that was removed
	 */
	@Override
	public com.testService.model.TestUser deleteTestUser(
		com.testService.model.TestUser testUser) {

		return _testUserLocalService.deleteTestUser(testUser);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _testUserLocalService.dynamicQuery();
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

		return _testUserLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _testUserLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _testUserLocalService.dynamicQuery(
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

		return _testUserLocalService.dynamicQueryCount(dynamicQuery);
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

		return _testUserLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.testService.model.TestUser fetchTestUser(long customUserId) {
		return _testUserLocalService.fetchTestUser(customUserId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _testUserLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _testUserLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _testUserLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _testUserLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the test user with the primary key.
	 *
	 * @param customUserId the primary key of the test user
	 * @return the test user
	 * @throws PortalException if a test user with the primary key could not be found
	 */
	@Override
	public com.testService.model.TestUser getTestUser(long customUserId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _testUserLocalService.getTestUser(customUserId);
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
	@Override
	public java.util.List<com.testService.model.TestUser> getTestUsers(
		int start, int end) {

		return _testUserLocalService.getTestUsers(start, end);
	}

	/**
	 * Returns the number of test users.
	 *
	 * @return the number of test users
	 */
	@Override
	public int getTestUsersCount() {
		return _testUserLocalService.getTestUsersCount();
	}

	/**
	 * Updates the test user in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param testUser the test user
	 * @return the test user that was updated
	 */
	@Override
	public com.testService.model.TestUser updateTestUser(
		com.testService.model.TestUser testUser) {

		return _testUserLocalService.updateTestUser(testUser);
	}

	@Override
	public TestUserLocalService getWrappedService() {
		return _testUserLocalService;
	}

	@Override
	public void setWrappedService(TestUserLocalService testUserLocalService) {
		_testUserLocalService = testUserLocalService;
	}

	private TestUserLocalService _testUserLocalService;

}