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

package com.testService.service.impl;

import com.liferay.portal.aop.AopService;

import com.testService.exception.NoSuchTestNoticeException;
import com.testService.model.TestNotice;
import com.testService.service.base.TestNoticeLocalServiceBaseImpl;

import com.testService.service.persistence.TestNoticePersistence;
import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * The implementation of the test notice local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.testService.service.TestNoticeLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestNoticeLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.testService.model.TestNotice",
	service = AopService.class
)
public class TestNoticeLocalServiceImpl extends TestNoticeLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.testService.service.TestNoticeLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.testService.service.TestNoticeLocalServiceUtil</code>.
	 */

	public TestNotice findByOwnerId(long ownerId) throws NoSuchTestNoticeException {
		return testNoticePersistence.findByOwnerId(ownerId);
	}

	public java.util.List<TestNotice> findAll() {
		return testNoticePersistence.findAll();
	}


}