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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.testService.service.http.TestUserServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TestUserSoap implements Serializable {

	public static TestUserSoap toSoapModel(TestUser model) {
		TestUserSoap soapModel = new TestUserSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setCustomUserId(model.getCustomUserId());
		soapModel.setName(model.getName());
		soapModel.setMail(model.getMail());
		soapModel.setMessage(model.getMessage());

		return soapModel;
	}

	public static TestUserSoap[] toSoapModels(TestUser[] models) {
		TestUserSoap[] soapModels = new TestUserSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TestUserSoap[][] toSoapModels(TestUser[][] models) {
		TestUserSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TestUserSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TestUserSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TestUserSoap[] toSoapModels(List<TestUser> models) {
		List<TestUserSoap> soapModels = new ArrayList<TestUserSoap>(
			models.size());

		for (TestUser model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TestUserSoap[soapModels.size()]);
	}

	public TestUserSoap() {
	}

	public long getPrimaryKey() {
		return _customUserId;
	}

	public void setPrimaryKey(long pk) {
		setCustomUserId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getCustomUserId() {
		return _customUserId;
	}

	public void setCustomUserId(long customUserId) {
		_customUserId = customUserId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getMail() {
		return _mail;
	}

	public void setMail(String mail) {
		_mail = mail;
	}

	public String getMessage() {
		return _message;
	}

	public void setMessage(String message) {
		_message = message;
	}

	private String _uuid;
	private long _customUserId;
	private String _name;
	private String _mail;
	private String _message;

}