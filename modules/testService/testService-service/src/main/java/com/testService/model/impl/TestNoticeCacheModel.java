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

package com.testService.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.testService.model.TestNotice;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TestNotice in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TestNoticeCacheModel
	implements CacheModel<TestNotice>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TestNoticeCacheModel)) {
			return false;
		}

		TestNoticeCacheModel testNoticeCacheModel = (TestNoticeCacheModel)obj;

		if (noticeId == testNoticeCacheModel.noticeId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, noticeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{noticeId=");
		sb.append(noticeId);
		sb.append(", noticeText=");
		sb.append(noticeText);
		sb.append(", ownerId=");
		sb.append(ownerId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TestNotice toEntityModel() {
		TestNoticeImpl testNoticeImpl = new TestNoticeImpl();

		testNoticeImpl.setNoticeId(noticeId);

		if (noticeText == null) {
			testNoticeImpl.setNoticeText("");
		}
		else {
			testNoticeImpl.setNoticeText(noticeText);
		}

		testNoticeImpl.setOwnerId(ownerId);

		testNoticeImpl.resetOriginalValues();

		return testNoticeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		noticeId = objectInput.readLong();
		noticeText = objectInput.readUTF();

		ownerId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(noticeId);

		if (noticeText == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(noticeText);
		}

		objectOutput.writeLong(ownerId);
	}

	public long noticeId;
	public String noticeText;
	public long ownerId;

}