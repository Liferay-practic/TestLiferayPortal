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
import com.liferay.portal.kernel.util.StringUtil;

import com.testService.exception.NoSuchTestNoticeException;
import com.testService.model.TestNotice;
import com.testService.model.impl.TestNoticeImpl;
import com.testService.model.impl.TestNoticeModelImpl;
import com.testService.service.persistence.TestNoticePersistence;
import com.testService.service.persistence.impl.constants.liferay_dbPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the test notice service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TestNoticePersistence.class)
public class TestNoticePersistenceImpl
	extends BasePersistenceImpl<TestNotice> implements TestNoticePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TestNoticeUtil</code> to access the test notice persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TestNoticeImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchByOwnerId;
	private FinderPath _finderPathCountByOwnerId;

	/**
	 * Returns the test notice where ownerId = &#63; or throws a <code>NoSuchTestNoticeException</code> if it could not be found.
	 *
	 * @param ownerId the owner ID
	 * @return the matching test notice
	 * @throws NoSuchTestNoticeException if a matching test notice could not be found
	 */
	@Override
	public TestNotice findByOwnerId(long ownerId)
		throws NoSuchTestNoticeException {

		TestNotice testNotice = fetchByOwnerId(ownerId);

		if (testNotice == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("ownerId=");
			sb.append(ownerId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTestNoticeException(sb.toString());
		}

		return testNotice;
	}

	/**
	 * Returns the test notice where ownerId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ownerId the owner ID
	 * @return the matching test notice, or <code>null</code> if a matching test notice could not be found
	 */
	@Override
	public TestNotice fetchByOwnerId(long ownerId) {
		return fetchByOwnerId(ownerId, true);
	}

	/**
	 * Returns the test notice where ownerId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ownerId the owner ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching test notice, or <code>null</code> if a matching test notice could not be found
	 */
	@Override
	public TestNotice fetchByOwnerId(long ownerId, boolean useFinderCache) {
		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {ownerId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByOwnerId, finderArgs, this);
		}

		if (result instanceof TestNotice) {
			TestNotice testNotice = (TestNotice)result;

			if (ownerId != testNotice.getOwnerId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TESTNOTICE_WHERE);

			sb.append(_FINDER_COLUMN_OWNERID_OWNERID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ownerId);

				List<TestNotice> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByOwnerId, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {ownerId};
							}

							_log.warn(
								"TestNoticePersistenceImpl.fetchByOwnerId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TestNotice testNotice = list.get(0);

					result = testNotice;

					cacheResult(testNotice);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(
						_finderPathFetchByOwnerId, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (TestNotice)result;
		}
	}

	/**
	 * Removes the test notice where ownerId = &#63; from the database.
	 *
	 * @param ownerId the owner ID
	 * @return the test notice that was removed
	 */
	@Override
	public TestNotice removeByOwnerId(long ownerId)
		throws NoSuchTestNoticeException {

		TestNotice testNotice = findByOwnerId(ownerId);

		return remove(testNotice);
	}

	/**
	 * Returns the number of test notices where ownerId = &#63;.
	 *
	 * @param ownerId the owner ID
	 * @return the number of matching test notices
	 */
	@Override
	public int countByOwnerId(long ownerId) {
		FinderPath finderPath = _finderPathCountByOwnerId;

		Object[] finderArgs = new Object[] {ownerId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TESTNOTICE_WHERE);

			sb.append(_FINDER_COLUMN_OWNERID_OWNERID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ownerId);

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

	private static final String _FINDER_COLUMN_OWNERID_OWNERID_2 =
		"testNotice.ownerId = ?";

	public TestNoticePersistenceImpl() {
		setModelClass(TestNotice.class);

		setModelImplClass(TestNoticeImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the test notice in the entity cache if it is enabled.
	 *
	 * @param testNotice the test notice
	 */
	@Override
	public void cacheResult(TestNotice testNotice) {
		entityCache.putResult(
			entityCacheEnabled, TestNoticeImpl.class,
			testNotice.getPrimaryKey(), testNotice);

		finderCache.putResult(
			_finderPathFetchByOwnerId, new Object[] {testNotice.getOwnerId()},
			testNotice);

		testNotice.resetOriginalValues();
	}

	/**
	 * Caches the test notices in the entity cache if it is enabled.
	 *
	 * @param testNotices the test notices
	 */
	@Override
	public void cacheResult(List<TestNotice> testNotices) {
		for (TestNotice testNotice : testNotices) {
			if (entityCache.getResult(
					entityCacheEnabled, TestNoticeImpl.class,
					testNotice.getPrimaryKey()) == null) {

				cacheResult(testNotice);
			}
			else {
				testNotice.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all test notices.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TestNoticeImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the test notice.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TestNotice testNotice) {
		entityCache.removeResult(
			entityCacheEnabled, TestNoticeImpl.class,
			testNotice.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((TestNoticeModelImpl)testNotice, true);
	}

	@Override
	public void clearCache(List<TestNotice> testNotices) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TestNotice testNotice : testNotices) {
			entityCache.removeResult(
				entityCacheEnabled, TestNoticeImpl.class,
				testNotice.getPrimaryKey());

			clearUniqueFindersCache((TestNoticeModelImpl)testNotice, true);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, TestNoticeImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TestNoticeModelImpl testNoticeModelImpl) {

		Object[] args = new Object[] {testNoticeModelImpl.getOwnerId()};

		finderCache.putResult(
			_finderPathCountByOwnerId, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByOwnerId, args, testNoticeModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		TestNoticeModelImpl testNoticeModelImpl, boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {testNoticeModelImpl.getOwnerId()};

			finderCache.removeResult(_finderPathCountByOwnerId, args);
			finderCache.removeResult(_finderPathFetchByOwnerId, args);
		}

		if ((testNoticeModelImpl.getColumnBitmask() &
			 _finderPathFetchByOwnerId.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				testNoticeModelImpl.getOriginalOwnerId()
			};

			finderCache.removeResult(_finderPathCountByOwnerId, args);
			finderCache.removeResult(_finderPathFetchByOwnerId, args);
		}
	}

	/**
	 * Creates a new test notice with the primary key. Does not add the test notice to the database.
	 *
	 * @param noticeId the primary key for the new test notice
	 * @return the new test notice
	 */
	@Override
	public TestNotice create(long noticeId) {
		TestNotice testNotice = new TestNoticeImpl();

		testNotice.setNew(true);
		testNotice.setPrimaryKey(noticeId);

		return testNotice;
	}

	/**
	 * Removes the test notice with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param noticeId the primary key of the test notice
	 * @return the test notice that was removed
	 * @throws NoSuchTestNoticeException if a test notice with the primary key could not be found
	 */
	@Override
	public TestNotice remove(long noticeId) throws NoSuchTestNoticeException {
		return remove((Serializable)noticeId);
	}

	/**
	 * Removes the test notice with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the test notice
	 * @return the test notice that was removed
	 * @throws NoSuchTestNoticeException if a test notice with the primary key could not be found
	 */
	@Override
	public TestNotice remove(Serializable primaryKey)
		throws NoSuchTestNoticeException {

		Session session = null;

		try {
			session = openSession();

			TestNotice testNotice = (TestNotice)session.get(
				TestNoticeImpl.class, primaryKey);

			if (testNotice == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTestNoticeException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(testNotice);
		}
		catch (NoSuchTestNoticeException noSuchEntityException) {
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
	protected TestNotice removeImpl(TestNotice testNotice) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(testNotice)) {
				testNotice = (TestNotice)session.get(
					TestNoticeImpl.class, testNotice.getPrimaryKeyObj());
			}

			if (testNotice != null) {
				session.delete(testNotice);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (testNotice != null) {
			clearCache(testNotice);
		}

		return testNotice;
	}

	@Override
	public TestNotice updateImpl(TestNotice testNotice) {
		boolean isNew = testNotice.isNew();

		if (!(testNotice instanceof TestNoticeModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(testNotice.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(testNotice);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in testNotice proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TestNotice implementation " +
					testNotice.getClass());
		}

		TestNoticeModelImpl testNoticeModelImpl =
			(TestNoticeModelImpl)testNotice;

		Session session = null;

		try {
			session = openSession();

			if (testNotice.isNew()) {
				session.save(testNotice);

				testNotice.setNew(false);
			}
			else {
				testNotice = (TestNotice)session.merge(testNotice);
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
			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}

		entityCache.putResult(
			entityCacheEnabled, TestNoticeImpl.class,
			testNotice.getPrimaryKey(), testNotice, false);

		clearUniqueFindersCache(testNoticeModelImpl, false);
		cacheUniqueFindersCache(testNoticeModelImpl);

		testNotice.resetOriginalValues();

		return testNotice;
	}

	/**
	 * Returns the test notice with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the test notice
	 * @return the test notice
	 * @throws NoSuchTestNoticeException if a test notice with the primary key could not be found
	 */
	@Override
	public TestNotice findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTestNoticeException {

		TestNotice testNotice = fetchByPrimaryKey(primaryKey);

		if (testNotice == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTestNoticeException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return testNotice;
	}

	/**
	 * Returns the test notice with the primary key or throws a <code>NoSuchTestNoticeException</code> if it could not be found.
	 *
	 * @param noticeId the primary key of the test notice
	 * @return the test notice
	 * @throws NoSuchTestNoticeException if a test notice with the primary key could not be found
	 */
	@Override
	public TestNotice findByPrimaryKey(long noticeId)
		throws NoSuchTestNoticeException {

		return findByPrimaryKey((Serializable)noticeId);
	}

	/**
	 * Returns the test notice with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param noticeId the primary key of the test notice
	 * @return the test notice, or <code>null</code> if a test notice with the primary key could not be found
	 */
	@Override
	public TestNotice fetchByPrimaryKey(long noticeId) {
		return fetchByPrimaryKey((Serializable)noticeId);
	}

	/**
	 * Returns all the test notices.
	 *
	 * @return the test notices
	 */
	@Override
	public List<TestNotice> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<TestNotice> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<TestNotice> findAll(
		int start, int end, OrderByComparator<TestNotice> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<TestNotice> findAll(
		int start, int end, OrderByComparator<TestNotice> orderByComparator,
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

		List<TestNotice> list = null;

		if (useFinderCache) {
			list = (List<TestNotice>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TESTNOTICE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TESTNOTICE;

				sql = sql.concat(TestNoticeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TestNotice>)QueryUtil.list(
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
	 * Removes all the test notices from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TestNotice testNotice : findAll()) {
			remove(testNotice);
		}
	}

	/**
	 * Returns the number of test notices.
	 *
	 * @return the number of test notices
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_TESTNOTICE);

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
		return "noticeId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TESTNOTICE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TestNoticeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the test notice persistence.
	 */
	@Activate
	public void activate() {
		TestNoticeModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		TestNoticeModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, TestNoticeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, TestNoticeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathFetchByOwnerId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, TestNoticeImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByOwnerId",
			new String[] {Long.class.getName()},
			TestNoticeModelImpl.OWNERID_COLUMN_BITMASK);

		_finderPathCountByOwnerId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByOwnerId",
			new String[] {Long.class.getName()});
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(TestNoticeImpl.class.getName());
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
				"value.object.column.bitmask.enabled.com.testService.model.TestNotice"),
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

	private static final String _SQL_SELECT_TESTNOTICE =
		"SELECT testNotice FROM TestNotice testNotice";

	private static final String _SQL_SELECT_TESTNOTICE_WHERE =
		"SELECT testNotice FROM TestNotice testNotice WHERE ";

	private static final String _SQL_COUNT_TESTNOTICE =
		"SELECT COUNT(testNotice) FROM TestNotice testNotice";

	private static final String _SQL_COUNT_TESTNOTICE_WHERE =
		"SELECT COUNT(testNotice) FROM TestNotice testNotice WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "testNotice.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TestNotice exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TestNotice exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TestNoticePersistenceImpl.class);

	static {
		try {
			Class.forName(liferay_dbPersistenceConstants.class.getName());
		}
		catch (ClassNotFoundException classNotFoundException) {
			throw new ExceptionInInitializerError(classNotFoundException);
		}
	}

}