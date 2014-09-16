/**
 * Copyright (C) 2014 Thiago Moreira (tmoreira2020@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.com.thiagomoreira.liferay.plugins.notfound.services.model;

import br.com.thiagomoreira.liferay.plugins.notfound.services.service.ClpSerializer;
import br.com.thiagomoreira.liferay.plugins.notfound.services.service.NotFoundLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class NotFoundClp extends BaseModelImpl<NotFound> implements NotFound {
    private long _notFoundId;
    private long _companyId;
    private long _groupId;
    private long _userId;
    private String _userUuid;
    private Date _createDate;
    private long _classNameId;
    private String _keywords;
    private BaseModel<?> _notFoundRemoteModel;

    public NotFoundClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return NotFound.class;
    }

    @Override
    public String getModelClassName() {
        return NotFound.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _notFoundId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setNotFoundId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _notFoundId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("notFoundId", getNotFoundId());
        attributes.put("companyId", getCompanyId());
        attributes.put("groupId", getGroupId());
        attributes.put("userId", getUserId());
        attributes.put("createDate", getCreateDate());
        attributes.put("classNameId", getClassNameId());
        attributes.put("keywords", getKeywords());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long notFoundId = (Long) attributes.get("notFoundId");

        if (notFoundId != null) {
            setNotFoundId(notFoundId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Long classNameId = (Long) attributes.get("classNameId");

        if (classNameId != null) {
            setClassNameId(classNameId);
        }

        String keywords = (String) attributes.get("keywords");

        if (keywords != null) {
            setKeywords(keywords);
        }
    }

    @Override
    public long getNotFoundId() {
        return _notFoundId;
    }

    @Override
    public void setNotFoundId(long notFoundId) {
        _notFoundId = notFoundId;

        if (_notFoundRemoteModel != null) {
            try {
                Class<?> clazz = _notFoundRemoteModel.getClass();

                Method method = clazz.getMethod("setNotFoundId", long.class);

                method.invoke(_notFoundRemoteModel, notFoundId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_notFoundRemoteModel != null) {
            try {
                Class<?> clazz = _notFoundRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_notFoundRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_notFoundRemoteModel != null) {
            try {
                Class<?> clazz = _notFoundRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_notFoundRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;

        if (_notFoundRemoteModel != null) {
            try {
                Class<?> clazz = _notFoundRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_notFoundRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;

        if (_notFoundRemoteModel != null) {
            try {
                Class<?> clazz = _notFoundRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_notFoundRemoteModel, createDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getClassName() {
        if (getClassNameId() <= 0) {
            return StringPool.BLANK;
        }

        return PortalUtil.getClassName(getClassNameId());
    }

    @Override
    public void setClassName(String className) {
        long classNameId = 0;

        if (Validator.isNotNull(className)) {
            classNameId = PortalUtil.getClassNameId(className);
        }

        setClassNameId(classNameId);
    }

    @Override
    public long getClassNameId() {
        return _classNameId;
    }

    @Override
    public void setClassNameId(long classNameId) {
        _classNameId = classNameId;

        if (_notFoundRemoteModel != null) {
            try {
                Class<?> clazz = _notFoundRemoteModel.getClass();

                Method method = clazz.getMethod("setClassNameId", long.class);

                method.invoke(_notFoundRemoteModel, classNameId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getKeywords() {
        return _keywords;
    }

    @Override
    public void setKeywords(String keywords) {
        _keywords = keywords;

        if (_notFoundRemoteModel != null) {
            try {
                Class<?> clazz = _notFoundRemoteModel.getClass();

                Method method = clazz.getMethod("setKeywords", String.class);

                method.invoke(_notFoundRemoteModel, keywords);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getNotFoundRemoteModel() {
        return _notFoundRemoteModel;
    }

    public void setNotFoundRemoteModel(BaseModel<?> notFoundRemoteModel) {
        _notFoundRemoteModel = notFoundRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _notFoundRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_notFoundRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            NotFoundLocalServiceUtil.addNotFound(this);
        } else {
            NotFoundLocalServiceUtil.updateNotFound(this);
        }
    }

    @Override
    public NotFound toEscapedModel() {
        return (NotFound) ProxyUtil.newProxyInstance(NotFound.class.getClassLoader(),
            new Class[] { NotFound.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        NotFoundClp clone = new NotFoundClp();

        clone.setNotFoundId(getNotFoundId());
        clone.setCompanyId(getCompanyId());
        clone.setGroupId(getGroupId());
        clone.setUserId(getUserId());
        clone.setCreateDate(getCreateDate());
        clone.setClassNameId(getClassNameId());
        clone.setKeywords(getKeywords());

        return clone;
    }

    @Override
    public int compareTo(NotFound notFound) {
        long primaryKey = notFound.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof NotFoundClp)) {
            return false;
        }

        NotFoundClp notFound = (NotFoundClp) obj;

        long primaryKey = notFound.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(15);

        sb.append("{notFoundId=");
        sb.append(getNotFoundId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", classNameId=");
        sb.append(getClassNameId());
        sb.append(", keywords=");
        sb.append(getKeywords());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(25);

        sb.append("<model><model-name>");
        sb.append(
            "br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>notFoundId</column-name><column-value><![CDATA[");
        sb.append(getNotFoundId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>classNameId</column-name><column-value><![CDATA[");
        sb.append(getClassNameId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>keywords</column-name><column-value><![CDATA[");
        sb.append(getKeywords());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
