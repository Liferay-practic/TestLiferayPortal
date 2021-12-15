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

import com.testService.exception.NoSuchTestUserException;
import com.testService.model.TestUser;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the test user service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestUserUtil
 * @generated
 */
@ProviderType
public interface TestUserPersistence extends BasePersistence<TestUser> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TestUserUtil} to access the test user persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the test users where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching test users
	 */
	public java.util.List<TestUser> findByUuid(String uuid);

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
	public java.util.List<TestUser> findByUuid(String uuid, int start, int end);

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
	public java.util.List<TestUser> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestUser>
			orderByComparator);

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
	public java.util.List<TestUser> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestUser>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first test user in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching test user
	 * @throws NoSuchTestUserException if a matching test user could not be found
	 */
	public TestUser findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<TestUser>
				orderByComparator)
		throws NoSuchTestUserException;

	/**
	 * Returns the first test user in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching test user, or <code>null</code> if a matching test user could not be found
	 */
	public TestUser fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TestUser>
			orderByComparator);

	/**
	 * Returns the last test user in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching test user
	 * @throws NoSuchTestUserException if a matching test user could not be found
	 */
	public TestUser findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<TestUser>
				orderByComparator)
		throws NoSuchTestUserException;

	/**
	 * Returns the last test user in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching test user, or <code>null</code> if a matching test user could not be found
	 */
	public TestUser fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TestUser>
			orderByComparator);

	/**
	 * Returns the test users before and after the current test user in the ordered set where uuid = &#63;.
	 *
	 * @param customUserId the primary key of the current test user
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next test user
	 * @throws NoSuchTestUserException if a test user with the primary key could not be found
	 */
	public TestUser[] findByUuid_PrevAndNext(
			long customUserId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<TestUser>
				orderByComparator)
		throws NoSuchTestUserException;

	/**
	 * Removes all the test users where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of test users where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching test users
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the test users where customUserId = &#63;.
	 *
	 * @param customUserId the custom user ID
	 * @return the matching test users
	 */
	public java.util.List<TestUser> findByCustomUserId(long customUserId);

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
	public java.util.List<TestUser> findByCustomUserId(
		long customUserId, int start, int end);

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
	public java.util.List<TestUser> findByCustomUserId(
		long customUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestUser>
			orderByComparator);

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
	public java.util.List<TestUser> findByCustomUserId(
		long customUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestUser>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first test user in the ordered set where customUserId = &#63;.
	 *
	 * @param customUserId the custom user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching test user
	 * @throws NoSuchTestUserException if a matching test user could not be found
	 */
	public TestUser findByCustomUserId_First(
			long customUserId,
			com.liferay.portal.kernel.util.OrderByComparator<TestUser>
				orderByComparator)
		throws NoSuchTestUserException;

	/**
	 * Returns the first test user in the ordered set where customUserId = &#63;.
	 *
	 * @param customUserId the custom user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching test user, or <code>null</code> if a matching test user could not be found
	 */
	public TestUser fetchByCustomUserId_First(
		long customUserId,
		com.liferay.portal.kernel.util.OrderByComparator<TestUser>
			orderByComparator);

	/**
	 * Returns the last test user in the ordered set where customUserId = &#63;.
	 *
	 * @param customUserId the custom user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching test user
	 * @throws NoSuchTestUserException if a matching test user could not be found
	 */
	public TestUser findByCustomUserId_Last(
			long customUserId,
			com.liferay.portal.kernel.util.OrderByComparator<TestUser>
				orderByComparator)
		throws NoSuchTestUserException;

	/**
	 * Returns the last test user in the ordered set where customUserId = &#63;.
	 *
	 * @param customUserId the custom user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching test user, or <code>null</code> if a matching test user could not be found
	 */
	public TestUser fetchByCustomUserId_Last(
		long customUserId,
		com.liferay.portal.kernel.util.OrderByComparator<TestUser>
			orderByComparator);

	/**
	 * Removes all the test users where customUserId = &#63; from the database.
	 *
	 * @param customUserId the custom user ID
	 */
	public void removeByCustomUserId(long customUserId);

	/**
	 * Returns the number of test users where customUserId = &#63;.
	 *
	 * @param customUserId the custom user ID
	 * @return the number of matching test users
	 */
	public int countByCustomUserId(long customUserId);

	/**
	 * Caches the test user in the entity cache if it is enabled.
	 *
	 * @param testUser the test user
	 */
	public void cacheResult(TestUser testUser);

	/**
	 * Caches the test users in the entity cache if it is enabled.
	 *
	 * @param testUsers the test users
	 */
	public void cacheResult(java.util.List<TestUser> testUsers);

	/**
	 * Creates a new test user with the primary key. Does not add the test user to the database.
	 *
	 * @param customUserId the primary key for the new test user
	 * @return the new test user
	 */
	public TestUser create(long customUserId);

	/**
	 * Removes the test user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param customUserId the primary key of the test user
	 * @return the test user that was removed
	 * @throws NoSuchTestUserException if a test user with the primary key could not be found
	 */
	public TestUser remove(long customUserId) throws NoSuchTestUserException;

	public TestUser updateImpl(TestUser testUser);

	/**
	 * Returns the test user with the primary key or throws a <code>NoSuchTestUserException</code> if it could not be found.
	 *
	 * @param customUserId the primary key of the test user
	 * @return the test user
	 * @throws NoSuchTestUserException if a test user with the primary key could not be found
	 */
	public TestUser findByPrimaryKey(long customUserId)
		throws NoSuchTestUserException;

	/**
	 * Returns the test user with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param customUserId the primary key of the test user
	 * @return the test user, or <code>null</code> if a test user with the primary key could not be found
	 */
	public TestUser fetchByPrimaryKey(long customUserId);

	/**
	 * Returns all the test users.
	 *
	 * @return the test users
	 */
	public java.util.List<TestUser> findAll();

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
	public java.util.List<TestUser> findAll(int start, int end);

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
	public java.util.List<TestUser> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestUser>
			orderByComparator);

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
	public java.util.List<TestUser> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TestUser>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the test users from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of test users.
	 *
	 * @return the number of test users
	 */
	public int countAll();

}