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

import com.testService.model.TestNotice;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the test notice service. This utility wraps <code>com.testService.service.persistence.impl.TestNoticePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestNoticePersistence
 * @generated
 */
public class TestNoticeUtil {

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
	public static void clearCache(TestNotice testNotice) {
		getPersistence().clearCache(testNotice);
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
	public static Map<Serializable, TestNotice> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TestNotice> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TestNotice> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TestNotice> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TestNotice> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TestNotice update(TestNotice testNotice) {
		return getPersistence().update(testNotice);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TestNotice update(
		TestNotice testNotice, ServiceContext serviceContext) {

		return getPersistence().update(testNotice, serviceContext);
	}

	/**
	 * Returns the test notice where ownerId = &#63; or throws a <code>NoSuchTestNoticeException</code> if it could not be found.
	 *
	 * @param ownerId the owner ID
	 * @return the matching test notice
	 * @throws NoSuchTestNoticeException if a matching test notice could not be found
	 */
	public static TestNotice findByOwnerId(long ownerId)
		throws com.testService.exception.NoSuchTestNoticeException {

		return getPersistence().findByOwnerId(ownerId);
	}

	/**
	 * Returns the test notice where ownerId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ownerId the owner ID
	 * @return the matching test notice, or <code>null</code> if a matching test notice could not be found
	 */
	public static TestNotice fetchByOwnerId(long ownerId) {
		return getPersistence().fetchByOwnerId(ownerId);
	}

	/**
	 * Returns the test notice where ownerId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ownerId the owner ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching test notice, or <code>null</code> if a matching test notice could not be found
	 */
	public static TestNotice fetchByOwnerId(
		long ownerId, boolean useFinderCache) {

		return getPersistence().fetchByOwnerId(ownerId, useFinderCache);
	}

	/**
	 * Removes the test notice where ownerId = &#63; from the database.
	 *
	 * @param ownerId the owner ID
	 * @return the test notice that was removed
	 */
	public static TestNotice removeByOwnerId(long ownerId)
		throws com.testService.exception.NoSuchTestNoticeException {

		return getPersistence().removeByOwnerId(ownerId);
	}

	/**
	 * Returns the number of test notices where ownerId = &#63;.
	 *
	 * @param ownerId the owner ID
	 * @return the number of matching test notices
	 */
	public static int countByOwnerId(long ownerId) {
		return getPersistence().countByOwnerId(ownerId);
	}

	/**
	 * Caches the test notice in the entity cache if it is enabled.
	 *
	 * @param testNotice the test notice
	 */
	public static void cacheResult(TestNotice testNotice) {
		getPersistence().cacheResult(testNotice);
	}

	/**
	 * Caches the test notices in the entity cache if it is enabled.
	 *
	 * @param testNotices the test notices
	 */
	public static void cacheResult(List<TestNotice> testNotices) {
		getPersistence().cacheResult(testNotices);
	}

	/**
	 * Creates a new test notice with the primary key. Does not add the test notice to the database.
	 *
	 * @param noticeId the primary key for the new test notice
	 * @return the new test notice
	 */
	public static TestNotice create(long noticeId) {
		return getPersistence().create(noticeId);
	}

	/**
	 * Removes the test notice with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param noticeId the primary key of the test notice
	 * @return the test notice that was removed
	 * @throws NoSuchTestNoticeException if a test notice with the primary key could not be found
	 */
	public static TestNotice remove(long noticeId)
		throws com.testService.exception.NoSuchTestNoticeException {

		return getPersistence().remove(noticeId);
	}

	public static TestNotice updateImpl(TestNotice testNotice) {
		return getPersistence().updateImpl(testNotice);
	}

	/**
	 * Returns the test notice with the primary key or throws a <code>NoSuchTestNoticeException</code> if it could not be found.
	 *
	 * @param noticeId the primary key of the test notice
	 * @return the test notice
	 * @throws NoSuchTestNoticeException if a test notice with the primary key could not be found
	 */
	public static TestNotice findByPrimaryKey(long noticeId)
		throws com.testService.exception.NoSuchTestNoticeException {

		return getPersistence().findByPrimaryKey(noticeId);
	}

	/**
	 * Returns the test notice with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param noticeId the primary key of the test notice
	 * @return the test notice, or <code>null</code> if a test notice with the primary key could not be found
	 */
	public static TestNotice fetchByPrimaryKey(long noticeId) {
		return getPersistence().fetchByPrimaryKey(noticeId);
	}

	/**
	 * Returns all the test notices.
	 *
	 * @return the test notices
	 */
	public static List<TestNotice> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the test notices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TestNoticeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of test notices
	 * @param end the upper bound of the range of test notices (not inclusive)
	 * @return the range of test notices
	 */
	public static List<TestNotice> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the test notices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TestNoticeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of test notices
	 * @param end the upper bound of the range of test notices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of test notices
	 */
	public static List<TestNotice> findAll(
		int start, int end, OrderByComparator<TestNotice> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the test notices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TestNoticeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of test notices
	 * @param end the upper bound of the range of test notices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of test notices
	 */
	public static List<TestNotice> findAll(
		int start, int end, OrderByComparator<TestNotice> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the test notices from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of test notices.
	 *
	 * @return the number of test notices
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TestNoticePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TestNoticePersistence, TestNoticePersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(TestNoticePersistence.class);

		ServiceTracker<TestNoticePersistence, TestNoticePersistence>
			serviceTracker =
				new ServiceTracker
					<TestNoticePersistence, TestNoticePersistence>(
						bundle.getBundleContext(), TestNoticePersistence.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}