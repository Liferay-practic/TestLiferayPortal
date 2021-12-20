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

package com.testService.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;

import com.testService.exception.NoSuchTestUserException;
import com.testService.model.TestUser;
import com.testService.model.impl.TestUserImpl;
import com.testService.model.impl.TestUserModelImpl;
import com.testService.service.persistence.TestUserPersistence;
import com.testService.service.persistence.impl.constants.liferay_dbPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the test user service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TestUserPersistence.class)
public class TestUserPersistenceImpl
	extends BasePersistenceImpl<TestUser> implements TestUserPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TestUserUtil</code> to access the test user persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TestUserImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByCustomUserId;
	private FinderPath _finderPathWithoutPaginationFindByCustomUserId;
	private FinderPath _finderPathCountByCustomUserId;

	/**
	 * Returns all the test users where customUserId = &#63;.
	 *
	 * @param customUserId the custom user ID
	 * @return the matching test users
	 */
	@Override
	public List<TestUser> findByCustomUserId(long customUserId) {
		return findByCustomUserId(
			customUserId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<TestUser> findByCustomUserId(
		long customUserId, int start, int end) {

		return findByCustomUserId(customUserId, start, end, null);
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
	@Override
	public List<TestUser> findByCustomUserId(
		long customUserId, int start, int end,
		OrderByComparator<TestUser> orderByComparator) {

		return findByCustomUserId(
			customUserId, start, end, orderByComparator, true);
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
	@Override
	public List<TestUser> findByCustomUserId(
		long customUserId, int start, int end,
		OrderByComparator<TestUser> orderByComparator, boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByCustomUserId;
				finderArgs = new Object[] {customUserId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByCustomUserId;
			finderArgs = new Object[] {
				customUserId, start, end, orderByComparator
			};
		}

		List<TestUser> list = null;

		if (useFinderCache) {
			list = (List<TestUser>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TestUser testUser : list) {
					if (customUserId != testUser.getCustomUserId()) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_TESTUSER_WHERE);

			sb.append(_FINDER_COLUMN_CUSTOMUSERID_CUSTOMUSERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(TestUserModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(customUserId);

				list = (List<TestUser>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first test user in the ordered set where customUserId = &#63;.
	 *
	 * @param customUserId the custom user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching test user
	 * @throws NoSuchTestUserException if a matching test user could not be found
	 */
	@Override
	public TestUser findByCustomUserId_First(
			long customUserId, OrderByComparator<TestUser> orderByComparator)
		throws NoSuchTestUserException {

		TestUser testUser = fetchByCustomUserId_First(
			customUserId, orderByComparator);

		if (testUser != null) {
			return testUser;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("customUserId=");
		sb.append(customUserId);

		sb.append("}");

		throw new NoSuchTestUserException(sb.toString());
	}

	/**
	 * Returns the first test user in the ordered set where customUserId = &#63;.
	 *
	 * @param customUserId the custom user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching test user, or <code>null</code> if a matching test user could not be found
	 */
	@Override
	public TestUser fetchByCustomUserId_First(
		long customUserId, OrderByComparator<TestUser> orderByComparator) {

		List<TestUser> list = findByCustomUserId(
			customUserId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last test user in the ordered set where customUserId = &#63;.
	 *
	 * @param customUserId the custom user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching test user
	 * @throws NoSuchTestUserException if a matching test user could not be found
	 */
	@Override
	public TestUser findByCustomUserId_Last(
			long customUserId, OrderByComparator<TestUser> orderByComparator)
		throws NoSuchTestUserException {

		TestUser testUser = fetchByCustomUserId_Last(
			customUserId, orderByComparator);

		if (testUser != null) {
			return testUser;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("customUserId=");
		sb.append(customUserId);

		sb.append("}");

		throw new NoSuchTestUserException(sb.toString());
	}

	/**
	 * Returns the last test user in the ordered set where customUserId = &#63;.
	 *
	 * @param customUserId the custom user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching test user, or <code>null</code> if a matching test user could not be found
	 */
	@Override
	public TestUser fetchByCustomUserId_Last(
		long customUserId, OrderByComparator<TestUser> orderByComparator) {

		int count = countByCustomUserId(customUserId);

		if (count == 0) {
			return null;
		}

		List<TestUser> list = findByCustomUserId(
			customUserId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the test users where customUserId = &#63; from the database.
	 *
	 * @param customUserId the custom user ID
	 */
	@Override
	public void removeByCustomUserId(long customUserId) {
		for (TestUser testUser :
				findByCustomUserId(
					customUserId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(testUser);
		}
	}

	/**
	 * Returns the number of test users where customUserId = &#63;.
	 *
	 * @param customUserId the custom user ID
	 * @return the number of matching test users
	 */
	@Override
	public int countByCustomUserId(long customUserId) {
		FinderPath finderPath = _finderPathCountByCustomUserId;

		Object[] finderArgs = new Object[] {customUserId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TESTUSER_WHERE);

			sb.append(_FINDER_COLUMN_CUSTOMUSERID_CUSTOMUSERID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(customUserId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_CUSTOMUSERID_CUSTOMUSERID_2 =
		"testUser.customUserId = ?";

	public TestUserPersistenceImpl() {
		setModelClass(TestUser.class);

		setModelImplClass(TestUserImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the test user in the entity cache if it is enabled.
	 *
	 * @param testUser the test user
	 */
	@Override
	public void cacheResult(TestUser testUser) {
		entityCache.putResult(
			entityCacheEnabled, TestUserImpl.class, testUser.getPrimaryKey(),
			testUser);

		testUser.resetOriginalValues();
	}

	/**
	 * Caches the test users in the entity cache if it is enabled.
	 *
	 * @param testUsers the test users
	 */
	@Override
	public void cacheResult(List<TestUser> testUsers) {
		for (TestUser testUser : testUsers) {
			if (entityCache.getResult(
					entityCacheEnabled, TestUserImpl.class,
					testUser.getPrimaryKey()) == null) {

				cacheResult(testUser);
			}
			else {
				testUser.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all test users.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TestUserImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the test user.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TestUser testUser) {
		entityCache.removeResult(
			entityCacheEnabled, TestUserImpl.class, testUser.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TestUser> testUsers) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TestUser testUser : testUsers) {
			entityCache.removeResult(
				entityCacheEnabled, TestUserImpl.class,
				testUser.getPrimaryKey());
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, TestUserImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new test user with the primary key. Does not add the test user to the database.
	 *
	 * @param customUserId the primary key for the new test user
	 * @return the new test user
	 */
	@Override
	public TestUser create(long customUserId) {
		TestUser testUser = new TestUserImpl();

		testUser.setNew(true);
		testUser.setPrimaryKey(customUserId);

		return testUser;
	}

	/**
	 * Removes the test user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param customUserId the primary key of the test user
	 * @return the test user that was removed
	 * @throws NoSuchTestUserException if a test user with the primary key could not be found
	 */
	@Override
	public TestUser remove(long customUserId) throws NoSuchTestUserException {
		return remove((Serializable)customUserId);
	}

	/**
	 * Removes the test user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the test user
	 * @return the test user that was removed
	 * @throws NoSuchTestUserException if a test user with the primary key could not be found
	 */
	@Override
	public TestUser remove(Serializable primaryKey)
		throws NoSuchTestUserException {

		Session session = null;

		try {
			session = openSession();

			TestUser testUser = (TestUser)session.get(
				TestUserImpl.class, primaryKey);

			if (testUser == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTestUserException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(testUser);
		}
		catch (NoSuchTestUserException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected TestUser removeImpl(TestUser testUser) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(testUser)) {
				testUser = (TestUser)session.get(
					TestUserImpl.class, testUser.getPrimaryKeyObj());
			}

			if (testUser != null) {
				session.delete(testUser);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (testUser != null) {
			clearCache(testUser);
		}

		return testUser;
	}

	@Override
	public TestUser updateImpl(TestUser testUser) {
		boolean isNew = testUser.isNew();

		if (!(testUser instanceof TestUserModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(testUser.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(testUser);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in testUser proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TestUser implementation " +
					testUser.getClass());
		}

		TestUserModelImpl testUserModelImpl = (TestUserModelImpl)testUser;

		Session session = null;

		try {
			session = openSession();

			if (testUser.isNew()) {
				session.save(testUser);

				testUser.setNew(false);
			}
			else {
				testUser = (TestUser)session.merge(testUser);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!_columnBitmaskEnabled) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {testUserModelImpl.getCustomUserId()};

			finderCache.removeResult(_finderPathCountByCustomUserId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByCustomUserId, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((testUserModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByCustomUserId.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					testUserModelImpl.getOriginalCustomUserId()
				};

				finderCache.removeResult(_finderPathCountByCustomUserId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByCustomUserId, args);

				args = new Object[] {testUserModelImpl.getCustomUserId()};

				finderCache.removeResult(_finderPathCountByCustomUserId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByCustomUserId, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, TestUserImpl.class, testUser.getPrimaryKey(),
			testUser, false);

		testUser.resetOriginalValues();

		return testUser;
	}

	/**
	 * Returns the test user with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the test user
	 * @return the test user
	 * @throws NoSuchTestUserException if a test user with the primary key could not be found
	 */
	@Override
	public TestUser findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTestUserException {

		TestUser testUser = fetchByPrimaryKey(primaryKey);

		if (testUser == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTestUserException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return testUser;
	}

	/**
	 * Returns the test user with the primary key or throws a <code>NoSuchTestUserException</code> if it could not be found.
	 *
	 * @param customUserId the primary key of the test user
	 * @return the test user
	 * @throws NoSuchTestUserException if a test user with the primary key could not be found
	 */
	@Override
	public TestUser findByPrimaryKey(long customUserId)
		throws NoSuchTestUserException {

		return findByPrimaryKey((Serializable)customUserId);
	}

	/**
	 * Returns the test user with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param customUserId the primary key of the test user
	 * @return the test user, or <code>null</code> if a test user with the primary key could not be found
	 */
	@Override
	public TestUser fetchByPrimaryKey(long customUserId) {
		return fetchByPrimaryKey((Serializable)customUserId);
	}

	/**
	 * Returns all the test users.
	 *
	 * @return the test users
	 */
	@Override
	public List<TestUser> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<TestUser> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<TestUser> findAll(
		int start, int end, OrderByComparator<TestUser> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<TestUser> findAll(
		int start, int end, OrderByComparator<TestUser> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<TestUser> list = null;

		if (useFinderCache) {
			list = (List<TestUser>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TESTUSER);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TESTUSER;

				sql = sql.concat(TestUserModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TestUser>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the test users from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TestUser testUser : findAll()) {
			remove(testUser);
		}
	}

	/**
	 * Returns the number of test users.
	 *
	 * @return the number of test users
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_TESTUSER);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "customUserId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TESTUSER;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TestUserModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the test user persistence.
	 */
	@Activate
	public void activate() {
		TestUserModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		TestUserModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, TestUserImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, TestUserImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByCustomUserId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, TestUserImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCustomUserId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByCustomUserId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, TestUserImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCustomUserId",
			new String[] {Long.class.getName()},
			TestUserModelImpl.CUSTOMUSERID_COLUMN_BITMASK);

		_finderPathCountByCustomUserId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCustomUserId",
			new String[] {Long.class.getName()});
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(TestUserImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	@Reference(
		target = liferay_dbPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
		super.setConfiguration(configuration);

		_columnBitmaskEnabled = GetterUtil.getBoolean(
			configuration.get(
				"value.object.column.bitmask.enabled.com.testService.model.TestUser"),
			true);
	}

	@Override
	@Reference(
		target = liferay_dbPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = liferay_dbPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private boolean _columnBitmaskEnabled;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_TESTUSER =
		"SELECT testUser FROM TestUser testUser";

	private static final String _SQL_SELECT_TESTUSER_WHERE =
		"SELECT testUser FROM TestUser testUser WHERE ";

	private static final String _SQL_COUNT_TESTUSER =
		"SELECT COUNT(testUser) FROM TestUser testUser";

	private static final String _SQL_COUNT_TESTUSER_WHERE =
		"SELECT COUNT(testUser) FROM TestUser testUser WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "testUser.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TestUser exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TestUser exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TestUserPersistenceImpl.class);

	static {
		try {
			Class.forName(liferay_dbPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException classNotFoundException) {
			throw new ExceptionInInitializerError(classNotFoundException);
		}
	}

}