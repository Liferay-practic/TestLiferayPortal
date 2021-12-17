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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import com.testService.model.TestUser;
import com.testService.model.TestUserModel;
import com.testService.model.TestUserSoap;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the TestUser service. Represents a row in the &quot;liferay_db_TestUser&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>TestUserModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TestUserImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TestUserImpl
 * @generated
 */
@JSON(strict = true)
public class TestUserModelImpl
	extends BaseModelImpl<TestUser> implements TestUserModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a test user model instance should use the <code>TestUser</code> interface instead.
	 */
	public static final String TABLE_NAME = "liferay_db_TestUser";

	public static final Object[][] TABLE_COLUMNS = {
		{"customUserId", Types.BIGINT}, {"name", Types.VARCHAR},
		{"mail", Types.VARCHAR}, {"message", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("customUserId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("mail", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("message", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table liferay_db_TestUser (customUserId LONG not null primary key,name VARCHAR(75) null,mail VARCHAR(75) null,message VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP =
		"drop table liferay_db_TestUser";

	public static final String ORDER_BY_JPQL =
		" ORDER BY testUser.customUserId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY liferay_db_TestUser.customUserId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long CUSTOMUSERID_COLUMN_BITMASK = 1L;

	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
		_entityCacheEnabled = entityCacheEnabled;
	}

	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
		_finderCacheEnabled = finderCacheEnabled;
	}

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static TestUser toModel(TestUserSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		TestUser model = new TestUserImpl();

		model.setCustomUserId(soapModel.getCustomUserId());
		model.setName(soapModel.getName());
		model.setMail(soapModel.getMail());
		model.setMessage(soapModel.getMessage());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<TestUser> toModels(TestUserSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<TestUser> models = new ArrayList<TestUser>(soapModels.length);

		for (TestUserSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public TestUserModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _customUserId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCustomUserId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _customUserId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return TestUser.class;
	}

	@Override
	public String getModelClassName() {
		return TestUser.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<TestUser, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<TestUser, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<TestUser, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((TestUser)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<TestUser, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<TestUser, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(TestUser)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<TestUser, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<TestUser, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, TestUser>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			TestUser.class.getClassLoader(), TestUser.class,
			ModelWrapper.class);

		try {
			Constructor<TestUser> constructor =
				(Constructor<TestUser>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException
							reflectiveOperationException) {

					throw new InternalError(reflectiveOperationException);
				}
			};
		}
		catch (NoSuchMethodException noSuchMethodException) {
			throw new InternalError(noSuchMethodException);
		}
	}

	private static final Map<String, Function<TestUser, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<TestUser, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<TestUser, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<TestUser, Object>>();
		Map<String, BiConsumer<TestUser, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<TestUser, ?>>();

		attributeGetterFunctions.put("customUserId", TestUser::getCustomUserId);
		attributeSetterBiConsumers.put(
			"customUserId",
			(BiConsumer<TestUser, Long>)TestUser::setCustomUserId);
		attributeGetterFunctions.put("name", TestUser::getName);
		attributeSetterBiConsumers.put(
			"name", (BiConsumer<TestUser, String>)TestUser::setName);
		attributeGetterFunctions.put("mail", TestUser::getMail);
		attributeSetterBiConsumers.put(
			"mail", (BiConsumer<TestUser, String>)TestUser::setMail);
		attributeGetterFunctions.put("message", TestUser::getMessage);
		attributeSetterBiConsumers.put(
			"message", (BiConsumer<TestUser, String>)TestUser::setMessage);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public long getCustomUserId() {
		return _customUserId;
	}

	@Override
	public void setCustomUserId(long customUserId) {
		_columnBitmask |= CUSTOMUSERID_COLUMN_BITMASK;

		if (!_setOriginalCustomUserId) {
			_setOriginalCustomUserId = true;

			_originalCustomUserId = _customUserId;
		}

		_customUserId = customUserId;
	}

	@Override
	public String getCustomUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getCustomUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setCustomUserUuid(String customUserUuid) {
	}

	public long getOriginalCustomUserId() {
		return _originalCustomUserId;
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return "";
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_name = name;
	}

	@JSON
	@Override
	public String getMail() {
		if (_mail == null) {
			return "";
		}
		else {
			return _mail;
		}
	}

	@Override
	public void setMail(String mail) {
		_mail = mail;
	}

	@JSON
	@Override
	public String getMessage() {
		if (_message == null) {
			return "";
		}
		else {
			return _message;
		}
	}

	@Override
	public void setMessage(String message) {
		_message = message;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, TestUser.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TestUser toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, TestUser>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TestUserImpl testUserImpl = new TestUserImpl();

		testUserImpl.setCustomUserId(getCustomUserId());
		testUserImpl.setName(getName());
		testUserImpl.setMail(getMail());
		testUserImpl.setMessage(getMessage());

		testUserImpl.resetOriginalValues();

		return testUserImpl;
	}

	@Override
	public int compareTo(TestUser testUser) {
		long primaryKey = testUser.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TestUser)) {
			return false;
		}

		TestUser testUser = (TestUser)obj;

		long primaryKey = testUser.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _entityCacheEnabled;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _finderCacheEnabled;
	}

	@Override
	public void resetOriginalValues() {
		TestUserModelImpl testUserModelImpl = this;

		testUserModelImpl._originalCustomUserId =
			testUserModelImpl._customUserId;

		testUserModelImpl._setOriginalCustomUserId = false;

		testUserModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TestUser> toCacheModel() {
		TestUserCacheModel testUserCacheModel = new TestUserCacheModel();

		testUserCacheModel.customUserId = getCustomUserId();

		testUserCacheModel.name = getName();

		String name = testUserCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			testUserCacheModel.name = null;
		}

		testUserCacheModel.mail = getMail();

		String mail = testUserCacheModel.mail;

		if ((mail != null) && (mail.length() == 0)) {
			testUserCacheModel.mail = null;
		}

		testUserCacheModel.message = getMessage();

		String message = testUserCacheModel.message;

		if ((message != null) && (message.length() == 0)) {
			testUserCacheModel.message = null;
		}

		return testUserCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<TestUser, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<TestUser, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<TestUser, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((TestUser)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<TestUser, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<TestUser, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<TestUser, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((TestUser)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, TestUser>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private long _customUserId;
	private long _originalCustomUserId;
	private boolean _setOriginalCustomUserId;
	private String _name;
	private String _mail;
	private String _message;
	private long _columnBitmask;
	private TestUser _escapedModel;

}