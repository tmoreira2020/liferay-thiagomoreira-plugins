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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link NotFound}.
 * </p>
 *
 * @author Thiago Moreira
 * @see NotFound
 * @generated
 */
public class NotFoundWrapper implements NotFound, ModelWrapper<NotFound> {
    private NotFound _notFound;

    public NotFoundWrapper(NotFound notFound) {
        _notFound = notFound;
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

    /**
    * Returns the primary key of this not found.
    *
    * @return the primary key of this not found
    */
    @Override
    public long getPrimaryKey() {
        return _notFound.getPrimaryKey();
    }

    /**
    * Sets the primary key of this not found.
    *
    * @param primaryKey the primary key of this not found
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _notFound.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the not found ID of this not found.
    *
    * @return the not found ID of this not found
    */
    @Override
    public long getNotFoundId() {
        return _notFound.getNotFoundId();
    }

    /**
    * Sets the not found ID of this not found.
    *
    * @param notFoundId the not found ID of this not found
    */
    @Override
    public void setNotFoundId(long notFoundId) {
        _notFound.setNotFoundId(notFoundId);
    }

    /**
    * Returns the company ID of this not found.
    *
    * @return the company ID of this not found
    */
    @Override
    public long getCompanyId() {
        return _notFound.getCompanyId();
    }

    /**
    * Sets the company ID of this not found.
    *
    * @param companyId the company ID of this not found
    */
    @Override
    public void setCompanyId(long companyId) {
        _notFound.setCompanyId(companyId);
    }

    /**
    * Returns the group ID of this not found.
    *
    * @return the group ID of this not found
    */
    @Override
    public long getGroupId() {
        return _notFound.getGroupId();
    }

    /**
    * Sets the group ID of this not found.
    *
    * @param groupId the group ID of this not found
    */
    @Override
    public void setGroupId(long groupId) {
        _notFound.setGroupId(groupId);
    }

    /**
    * Returns the user ID of this not found.
    *
    * @return the user ID of this not found
    */
    @Override
    public long getUserId() {
        return _notFound.getUserId();
    }

    /**
    * Sets the user ID of this not found.
    *
    * @param userId the user ID of this not found
    */
    @Override
    public void setUserId(long userId) {
        _notFound.setUserId(userId);
    }

    /**
    * Returns the user uuid of this not found.
    *
    * @return the user uuid of this not found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _notFound.getUserUuid();
    }

    /**
    * Sets the user uuid of this not found.
    *
    * @param userUuid the user uuid of this not found
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _notFound.setUserUuid(userUuid);
    }

    /**
    * Returns the create date of this not found.
    *
    * @return the create date of this not found
    */
    @Override
    public java.util.Date getCreateDate() {
        return _notFound.getCreateDate();
    }

    /**
    * Sets the create date of this not found.
    *
    * @param createDate the create date of this not found
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _notFound.setCreateDate(createDate);
    }

    /**
    * Returns the fully qualified class name of this not found.
    *
    * @return the fully qualified class name of this not found
    */
    @Override
    public java.lang.String getClassName() {
        return _notFound.getClassName();
    }

    @Override
    public void setClassName(java.lang.String className) {
        _notFound.setClassName(className);
    }

    /**
    * Returns the class name ID of this not found.
    *
    * @return the class name ID of this not found
    */
    @Override
    public long getClassNameId() {
        return _notFound.getClassNameId();
    }

    /**
    * Sets the class name ID of this not found.
    *
    * @param classNameId the class name ID of this not found
    */
    @Override
    public void setClassNameId(long classNameId) {
        _notFound.setClassNameId(classNameId);
    }

    /**
    * Returns the keywords of this not found.
    *
    * @return the keywords of this not found
    */
    @Override
    public java.lang.String getKeywords() {
        return _notFound.getKeywords();
    }

    /**
    * Sets the keywords of this not found.
    *
    * @param keywords the keywords of this not found
    */
    @Override
    public void setKeywords(java.lang.String keywords) {
        _notFound.setKeywords(keywords);
    }

    @Override
    public boolean isNew() {
        return _notFound.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _notFound.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _notFound.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _notFound.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _notFound.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _notFound.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _notFound.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _notFound.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _notFound.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _notFound.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _notFound.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new NotFoundWrapper((NotFound) _notFound.clone());
    }

    @Override
    public int compareTo(NotFound notFound) {
        return _notFound.compareTo(notFound);
    }

    @Override
    public int hashCode() {
        return _notFound.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<NotFound> toCacheModel() {
        return _notFound.toCacheModel();
    }

    @Override
    public NotFound toEscapedModel() {
        return new NotFoundWrapper(_notFound.toEscapedModel());
    }

    @Override
    public NotFound toUnescapedModel() {
        return new NotFoundWrapper(_notFound.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _notFound.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _notFound.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _notFound.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof NotFoundWrapper)) {
            return false;
        }

        NotFoundWrapper notFoundWrapper = (NotFoundWrapper) obj;

        if (Validator.equals(_notFound, notFoundWrapper._notFound)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public NotFound getWrappedNotFound() {
        return _notFound;
    }

    @Override
    public NotFound getWrappedModel() {
        return _notFound;
    }

    @Override
    public void resetOriginalValues() {
        _notFound.resetOriginalValues();
    }
}
