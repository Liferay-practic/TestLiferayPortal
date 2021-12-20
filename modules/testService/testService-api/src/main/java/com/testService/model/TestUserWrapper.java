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
 * This class is a wrapper for {@link TestUser}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestUser
 * @generated
 */
public class TestUserWrapper
	extends BaseModelWrapper<TestUser>
	implements ModelWrapper<TestUser>, TestUser {

	public TestUserWrapper(TestUser testUser) {
		super(testUser);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("customUserId", getCustomUserId());
		attributes.put("name", getName());
		attributes.put("mail", getMail());
		attributes.put("message", getMessage());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long customUserId = (Long)attributes.get("customUserId");

		if (customUserId != null) {
			setCustomUserId(customUserId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String mail = (String)attributes.get("mail");

		if (mail != null) {
			setMail(mail);
		}

		String message = (String)attributes.get("message");

		if (message != null) {
			setMessage(message);
		}
	}

	/**
	 * Returns the custom user ID of this test user.
	 *
	 * @return the custom user ID of this test user
	 */
	@Override
	public long getCustomUserId() {
		return model.getCustomUserId();
	}

	/**
	 * Returns the custom user uuid of this test user.
	 *
	 * @return the custom user uuid of this test user
	 */
	@Override
	public String getCustomUserUuid() {
		return model.getCustomUserUuid();
	}

	/**
	 * Returns the mail of this test user.
	 *
	 * @return the mail of this test user
	 */
	@Override
	public String getMail() {
		return model.getMail();
	}

	/**
	 * Returns the message of this test user.
	 *
	 * @return the message of this test user
	 */
	@Override
	public String getMessage() {
		return model.getMessage();
	}

	/**
	 * Returns the name of this test user.
	 *
	 * @return the name of this test user
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this test user.
	 *
	 * @return the primary key of this test user
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
	 * Sets the custom user ID of this test user.
	 *
	 * @param customUserId the custom user ID of this test user
	 */
	@Override
	public void setCustomUserId(long customUserId) {
		model.setCustomUserId(customUserId);
	}

	/**
	 * Sets the custom user uuid of this test user.
	 *
	 * @param customUserUuid the custom user uuid of this test user
	 */
	@Override
	public void setCustomUserUuid(String customUserUuid) {
		model.setCustomUserUuid(customUserUuid);
	}

	/**
	 * Sets the mail of this test user.
	 *
	 * @param mail the mail of this test user
	 */
	@Override
	public void setMail(String mail) {
		model.setMail(mail);
	}

	/**
	 * Sets the message of this test user.
	 *
	 * @param message the message of this test user
	 */
	@Override
	public void setMessage(String message) {
		model.setMessage(message);
	}

	/**
	 * Sets the name of this test user.
	 *
	 * @param name the name of this test user
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this test user.
	 *
	 * @param primaryKey the primary key of this test user
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected TestUserWrapper wrap(TestUser testUser) {
		return new TestUserWrapper(testUser);
	}

}