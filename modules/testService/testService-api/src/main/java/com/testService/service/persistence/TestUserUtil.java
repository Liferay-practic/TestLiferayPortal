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

package com.testService.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.testService.model.TestUser;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the test user service. This utility wraps <code>com.testService.service.persistence.impl.TestUserPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestUserPersistence
 * @generated
 */
public class TestUserUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(TestUser testUser) {
		getPersistence().clearCache(testUser);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, TestUser> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TestUser> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TestUser> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TestUser> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TestUser> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TestUser update(TestUser testUser) {
		return getPersistence().update(testUser);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TestUser update(
		TestUser testUser, ServiceContext serviceContext) {

		return getPersistence().update(testUser, serviceContext);
	}

	/**
	 * Returns all the test users where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching test users
	 */
	public static List<TestUser> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the test users where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TestUserModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of test users
	 * @param end the upper bound of the range of test users (not inclusive)
	 * @return the range of matching test users
	 */
	public static List<TestUser> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the test users where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TestUserModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of test users
	 * @param end the upper bound of the range of test users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching test users
	 */
	public static List<TestUser> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<TestUser> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the test users where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TestUserModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of test users
	 * @param end the upper bound of the range of test users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching test users
	 */
	public static List<TestUser> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<TestUser> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first test user in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching test user
	 * @throws NoSuchTestUserException if a matching test user could not be found
	 */
	public static TestUser findByUuid_First(
			String uuid, OrderByComparator<TestUser> orderByComparator)
		throws com.testService.exception.NoSuchTestUserException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first test user in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching test user, or <code>null</code> if a matching test user could not be found
	 */
	public static TestUser fetchByUuid_First(
		String uuid, OrderByComparator<TestUser> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last test user in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching test user
	 * @throws NoSuchTestUserException if a matching test user could not be found
	 */
	public static TestUser findByUuid_Last(
			String uuid, OrderByComparator<TestUser> orderByComparator)
		throws com.testService.exception.NoSuchTestUserException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last test user in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching test user, or <code>null</code> if a matching test user could not be found
	 */
	public static TestUser fetchByUuid_Last(
		String uuid, OrderByComparator<TestUser> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the test users before and after the current test user in the ordered set where uuid = &#63;.
	 *
	 * @param customUserId the primary key of the current test user
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next test user
	 * @throws NoSuchTestUserException if a test user with the primary key could not be found
	 */
	public static TestUser[] findByUuid_PrevAndNext(
			long customUserId, String uuid,
			OrderByComparator<TestUser> orderByComparator)
		throws com.testService.exception.NoSuchTestUserException {

		return getPersistence().findByUuid_PrevAndNext(
			customUserId, uuid, orderByComparator);
	}

	/**
	 * Removes all the test users where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of test users where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching test users
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the test users where customUserId = &#63;.
	 *
	 * @param customUserId the custom user ID
	 * @return the matching test users
	 */
	public static List<TestUser> findByCustomUserId(long customUserId) {
		return getPersistence().findByCustomUserId(customUserId);
	}

	/**
	 * Returns a range of all the test users where customUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TestUserModelImpl</code>.
	 * </p>
	 *
	 * @param customUserId the custom user ID
	 * @param start the lower bound of the range of test users
	 * @param end the upper bound of the range of test users (not inclusive)
	 * @return the range of matching test users
	 */
	public static List<TestUser> findByCustomUserId(
		long customUserId, int start, int end) {

		return getPersistence().findByCustomUserId(customUserId, start, end);
	}

	/**
	 * Returns an ordered range of all the test users where customUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TestUserModelImpl</code>.
	 * </p>
	 *
	 * @param customUserId the custom user ID
	 * @param start the lower bound of the range of test users
	 * @param end the upper bound of the range of test users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching test users
	 */
	public static List<TestUser> findByCustomUserId(
		long customUserId, int start, int end,
		OrderByComparator<TestUser> orderByComparator) {

		return getPersistence().findByCustomUserId(
			customUserId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the test users where customUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TestUserModelImpl</code>.
	 * </p>
	 *
	 * @param customUserId the custom user ID
	 * @param start the lower bound of the range of test users
	 * @param end the upper bound of the range of test users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching test users
	 */
	public static List<TestUser> findByCustomUserId(
		long customUserId, int start, int end,
		OrderByComparator<TestUser> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByCustomUserId(
			customUserId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first test user in the ordered set where customUserId = &#63;.
	 *
	 * @param customUserId the custom user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching test user
	 * @throws NoSuchTestUserException if a matching test user could not be found
	 */
	public static TestUser findByCustomUserId_First(
			long customUserId, OrderByComparator<TestUser> orderByComparator)
		throws com.testService.exception.NoSuchTestUserException {

		return getPersistence().findByCustomUserId_First(
			customUserId, orderByComparator);
	}

	/**
	 * Returns the first test user in the ordered set where customUserId = &#63;.
	 *
	 * @param customUserId the custom user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching test user, or <code>null</code> if a matching test user could not be found
	 */
	public static TestUser fetchByCustomUserId_First(
		long customUserId, OrderByComparator<TestUser> orderByComparator) {

		return getPersistence().fetchByCustomUserId_First(
			customUserId, orderByComparator);
	}

	/**
	 * Returns the last test user in the ordered set where customUserId = &#63;.
	 *
	 * @param customUserId the custom user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching test user
	 * @throws NoSuchTestUserException if a matching test user could not be found
	 */
	public static TestUser findByCustomUserId_Last(
			long customUserId, OrderByComparator<TestUser> orderByComparator)
		throws com.testService.exception.NoSuchTestUserException {

		return getPersistence().findByCustomUserId_Last(
			customUserId, orderByComparator);
	}

	/**
	 * Returns the last test user in the ordered set where customUserId = &#63;.
	 *
	 * @param customUserId the custom user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching test user, or <code>null</code> if a matching test user could not be found
	 */
	public static TestUser fetchByCustomUserId_Last(
		long customUserId, OrderByComparator<TestUser> orderByComparator) {

		return getPersistence().fetchByCustomUserId_Last(
			customUserId, orderByComparator);
	}

	/**
	 * Removes all the test users where customUserId = &#63; from the database.
	 *
	 * @param customUserId the custom user ID
	 */
	public static void removeByCustomUserId(long customUserId) {
		getPersistence().removeByCustomUserId(customUserId);
	}

	/**
	 * Returns the number of test users where customUserId = &#63;.
	 *
	 * @param customUserId the custom user ID
	 * @return the number of matching test users
	 */
	public static int countByCustomUserId(long customUserId) {
		return getPersistence().countByCustomUserId(customUserId);
	}

	/**
	 * Caches the test user in the entity cache if it is enabled.
	 *
	 * @param testUser the test user
	 */
	public static void cacheResult(TestUser testUser) {
		getPersistence().cacheResult(testUser);
	}

	/**
	 * Caches the test users in the entity cache if it is enabled.
	 *
	 * @param testUsers the test users
	 */
	public static void cacheResult(List<TestUser> testUsers) {
		getPersistence().cacheResult(testUsers);
	}

	/**
	 * Creates a new test user with the primary key. Does not add the test user to the database.
	 *
	 * @param customUserId the primary key for the new test user
	 * @return the new test user
	 */
	public static TestUser create(long customUserId) {
		return getPersistence().create(customUserId);
	}

	/**
	 * Removes the test user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param customUserId the primary key of the test user
	 * @return the test user that was removed
	 * @throws NoSuchTestUserException if a test user with the primary key could not be found
	 */
	public static TestUser remove(long customUserId)
		throws com.testService.exception.NoSuchTestUserException {

		return getPersistence().remove(customUserId);
	}

	public static TestUser updateImpl(TestUser testUser) {
		return getPersistence().updateImpl(testUser);
	}

	/**
	 * Returns the test user with the primary key or throws a <code>NoSuchTestUserException</code> if it could not be found.
	 *
	 * @param customUserId the primary key of the test user
	 * @return the test user
	 * @throws NoSuchTestUserException if a test user with the primary key could not be found
	 */
	public static TestUser findByPrimaryKey(long customUserId)
		throws com.testService.exception.NoSuchTestUserException {

		return getPersistence().findByPrimaryKey(customUserId);
	}

	/**
	 * Returns the test user with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param customUserId the primary key of the test user
	 * @return the test user, or <code>null</code> if a test user with the primary key could not be found
	 */
	public static TestUser fetchByPrimaryKey(long customUserId) {
		return getPersistence().fetchByPrimaryKey(customUserId);
	}

	/**
	 * Returns all the test users.
	 *
	 * @return the test users
	 */
	public static List<TestUser> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the test users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TestUserModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of test users
	 * @param end the upper bound of the range of test users (not inclusive)
	 * @return the range of test users
	 */
	public static List<TestUser> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the test users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TestUserModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of test users
	 * @param end the upper bound of the range of test users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of test users
	 */
	public static List<TestUser> findAll(
		int start, int end, OrderByComparator<TestUser> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the test users.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TestUserModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of test users
	 * @param end the upper bound of the range of test users (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of test users
	 */
	public static List<TestUser> findAll(
		int start, int end, OrderByComparator<TestUser> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the test users from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of test users.
	 *
	 * @return the number of test users
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TestUserPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TestUserPersistence, TestUserPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(TestUserPersistence.class);

		ServiceTracker<TestUserPersistence, TestUserPersistence>
			serviceTracker =
				new ServiceTracker<TestUserPersistence, TestUserPersistence>(
					bundle.getBundleContext(), TestUserPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}