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

package com.testService.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TestNotice}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestNotice
 * @generated
 */
public class TestNoticeWrapper
	extends BaseModelWrapper<TestNotice>
	implements ModelWrapper<TestNotice>, TestNotice {

	public TestNoticeWrapper(TestNotice testNotice) {
		super(testNotice);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("noticeId", getNoticeId());
		attributes.put("noticeText", getNoticeText());
		attributes.put("ownerId", getOwnerId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long noticeId = (Long)attributes.get("noticeId");

		if (noticeId != null) {
			setNoticeId(noticeId);
		}

		String noticeText = (String)attributes.get("noticeText");

		if (noticeText != null) {
			setNoticeText(noticeText);
		}

		Long ownerId = (Long)attributes.get("ownerId");

		if (ownerId != null) {
			setOwnerId(ownerId);
		}
	}

	/**
	 * Returns the notice ID of this test notice.
	 *
	 * @return the notice ID of this test notice
	 */
	@Override
	public long getNoticeId() {
		return model.getNoticeId();
	}

	/**
	 * Returns the notice text of this test notice.
	 *
	 * @return the notice text of this test notice
	 */
	@Override
	public String getNoticeText() {
		return model.getNoticeText();
	}

	/**
	 * Returns the owner ID of this test notice.
	 *
	 * @return the owner ID of this test notice
	 */
	@Override
	public long getOwnerId() {
		return model.getOwnerId();
	}

	/**
	 * Returns the primary key of this test notice.
	 *
	 * @return the primary key of this test notice
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the notice ID of this test notice.
	 *
	 * @param noticeId the notice ID of this test notice
	 */
	@Override
	public void setNoticeId(long noticeId) {
		model.setNoticeId(noticeId);
	}

	/**
	 * Sets the notice text of this test notice.
	 *
	 * @param noticeText the notice text of this test notice
	 */
	@Override
	public void setNoticeText(String noticeText) {
		model.setNoticeText(noticeText);
	}

	/**
	 * Sets the owner ID of this test notice.
	 *
	 * @param ownerId the owner ID of this test notice
	 */
	@Override
	public void setOwnerId(long ownerId) {
		model.setOwnerId(ownerId);
	}

	/**
	 * Sets the primary key of this test notice.
	 *
	 * @param primaryKey the primary key of this test notice
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected TestNoticeWrapper wrap(TestNotice testNotice) {
		return new TestNoticeWrapper(testNotice);
	}

}