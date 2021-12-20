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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.testService.exception.NoSuchTestNoticeException;
import com.testService.model.TestNotice;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the test notice service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestNoticeUtil
 * @generated
 */
@ProviderType
public interface TestNoticePersistence extends BasePersistence<TestNotice> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TestNoticeUtil} to access the test notice persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the test notice where ownerId = &#63; or throws a <code>NoSuchTestNoticeException</code> if it could not be found.
	 *
	 * @param ownerId the owner ID
	 * @return the matching test notice
	 * @throws NoSuchTestNoticeException if a matching test notice could not be found
	 */
	public TestNotice findByOwnerId(long ownerId)
		throws NoSuchTestNoticeException;

	/**
	 * Returns the test notice where ownerId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ownerId the owner ID
	 * @return the matching test notice, or <code>null</code> if a matching test notice could not be found
	 */
	public TestNotice fetchByOwnerId(long ownerId);

	/**
	 * Returns the test notice where ownerId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ownerId the owner ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching test notice, or <code>null</code> if a matching test notice could not be found
	 */
	public TestNotice fetchByOwnerId(long ownerId, boolean useFinderCache);

	/**
	 * Removes the test notice where ownerId = &#63; from the database.
	 *
	 * @param ownerId the owner ID
	 * @return the test notice that was removed
	 */
	public TestNotice removeByOwnerId(long ownerId)
		throws NoSuchTestNoticeException;

	/**
	 * Returns the number of test notices where ownerId = &#63;.
	 *
	 * @param ownerId the owner ID
	 * @return the number of matching test notices
	 */
	public int countByOwnerId(long ownerId);

	/**
	 * Caches the test notice in the entity cache if it is enabled.
	 *
	 * @param testNotice the test notice
	 */
	public void cacheResult(TestNotice testNotice);

	/**
	 * Caches the test notices in the entity cache if it is enabled.
	 *
	 * @param testNotices the test notices
	 */
	public void cacheResult(java.util.List<TestNotice> testNotices);

	/**
	 * Creates a new test notice with the primary key. Does not add the test notice to the database.
	 *
	 * @param noticeId the primary key for the new test notice
	 * @return the new test notice
	 */
	public TestNotice create(long noticeId);

	/**
	 * Removes the test notice with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param noticeId the primary key of the test notice
	 * @return the test notice that was removed
	 * @throws NoSuchTestNoticeException if a test notice with the primary key could not be found
	 */
	public TestNotice remove(long noticeId) throws NoSuchTestNoticeException;

	public TestNotice updateImpl(TestNotice testNotice);

	/**
	 * Returns the test notice with the primary key or throws a <code>NoSuchTestNoticeException</code> if it could not be found.
	 *
	 * @param noticeId the primary key of the test notice
	 * @return the test notice
	 * @throws NoSuchTestNoticeException if a test notice with the primary key could not be found
	 */
	public TestNotice findByPrimaryKey(long noticeId)
		throws NoSuchTestNoticeException;

	/**
	 * Returns the test notice with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param noticeId the primary key of the test notice
	 * @return the test notice, or <code>null</code> if a test notice with the primary key could not be found
	 */
	public TestNotice fetchByPrimaryKey(long noticeId);

	/**
	 * Returns all the test notices.
	 *
	 * @return the test notices
	 */
	public java.util.List<TestNotice> findAll();

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
	public java.util.List<TestNotice> findAll(int start, int end);

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
	public java.util.List<TestNotice> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestNotice>
			orderByComparator);

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
	public java.util.List<TestNotice> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestNotice>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the test notices from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of test notices.
	 *
	 * @return the number of test notices
	 */
	public int countAll();

}