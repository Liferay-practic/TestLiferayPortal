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

import com.testService.model.TestUser;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing TestUser in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TestUserCacheModel
	implements CacheModel<TestUser>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TestUserCacheModel)) {
			return false;
		}

		TestUserCacheModel testUserCacheModel = (TestUserCacheModel)obj;

		if (customUserId == testUserCacheModel.customUserId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, customUserId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", customUserId=");
		sb.append(customUserId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", mail=");
		sb.append(mail);
		sb.append(", message=");
		sb.append(message);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TestUser toEntityModel() {
		TestUserImpl testUserImpl = new TestUserImpl();

		if (uuid == null) {
			testUserImpl.setUuid("");
		}
		else {
			testUserImpl.setUuid(uuid);
		}

		testUserImpl.setCustomUserId(customUserId);

		if (name == null) {
			testUserImpl.setName("");
		}
		else {
			testUserImpl.setName(name);
		}

		if (mail == null) {
			testUserImpl.setMail("");
		}
		else {
			testUserImpl.setMail(mail);
		}

		if (message == null) {
			testUserImpl.setMessage("");
		}
		else {
			testUserImpl.setMessage(message);
		}

		testUserImpl.resetOriginalValues();

		return testUserImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		customUserId = objectInput.readLong();
		name = objectInput.readUTF();
		mail = objectInput.readUTF();
		message = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(customUserId);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (mail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mail);
		}

		if (message == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(message);
		}
	}

	public String uuid;
	public long customUserId;
	public String name;
	public String mail;
	public String message;

}