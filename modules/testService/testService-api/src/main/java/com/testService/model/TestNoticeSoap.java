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
 * This class is used by SOAP remote services, specifically {@link com.testService.service.http.TestNoticeServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TestNoticeSoap implements Serializable {

	public static TestNoticeSoap toSoapModel(TestNotice model) {
		TestNoticeSoap soapModel = new TestNoticeSoap();

		soapModel.setNoticeId(model.getNoticeId());
		soapModel.setNoticeText(model.getNoticeText());
		soapModel.setOwnerId(model.getOwnerId());

		return soapModel;
	}

	public static TestNoticeSoap[] toSoapModels(TestNotice[] models) {
		TestNoticeSoap[] soapModels = new TestNoticeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TestNoticeSoap[][] toSoapModels(TestNotice[][] models) {
		TestNoticeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TestNoticeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TestNoticeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TestNoticeSoap[] toSoapModels(List<TestNotice> models) {
		List<TestNoticeSoap> soapModels = new ArrayList<TestNoticeSoap>(
			models.size());

		for (TestNotice model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TestNoticeSoap[soapModels.size()]);
	}

	public TestNoticeSoap() {
	}

	public long getPrimaryKey() {
		return _noticeId;
	}

	public void setPrimaryKey(long pk) {
		setNoticeId(pk);
	}

	public long getNoticeId() {
		return _noticeId;
	}

	public void setNoticeId(long noticeId) {
		_noticeId = noticeId;
	}

	public String getNoticeText() {
		return _noticeText;
	}

	public void setNoticeText(String noticeText) {
		_noticeText = noticeText;
	}

	public long getOwnerId() {
		return _ownerId;
	}

	public void setOwnerId(long ownerId) {
		_ownerId = ownerId;
	}

	private long _noticeId;
	private String _noticeText;
	private long _ownerId;

}