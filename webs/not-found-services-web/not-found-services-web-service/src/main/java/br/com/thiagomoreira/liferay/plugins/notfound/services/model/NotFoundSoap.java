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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Thiago Moreira
 * @generated
 */
public class NotFoundSoap implements Serializable {
    private long _notFoundId;
    private long _companyId;
    private long _groupId;
    private long _userId;
    private Date _createDate;
    private long _classNameId;
    private String _keywords;

    public NotFoundSoap() {
    }

    public static NotFoundSoap toSoapModel(NotFound model) {
        NotFoundSoap soapModel = new NotFoundSoap();

        soapModel.setNotFoundId(model.getNotFoundId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setUserId(model.getUserId());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setClassNameId(model.getClassNameId());
        soapModel.setKeywords(model.getKeywords());

        return soapModel;
    }

    public static NotFoundSoap[] toSoapModels(NotFound[] models) {
        NotFoundSoap[] soapModels = new NotFoundSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static NotFoundSoap[][] toSoapModels(NotFound[][] models) {
        NotFoundSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new NotFoundSoap[models.length][models[0].length];
        } else {
            soapModels = new NotFoundSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static NotFoundSoap[] toSoapModels(List<NotFound> models) {
        List<NotFoundSoap> soapModels = new ArrayList<NotFoundSoap>(models.size());

        for (NotFound model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new NotFoundSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _notFoundId;
    }

    public void setPrimaryKey(long pk) {
        setNotFoundId(pk);
    }

    public long getNotFoundId() {
        return _notFoundId;
    }

    public void setNotFoundId(long notFoundId) {
        _notFoundId = notFoundId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public long getClassNameId() {
        return _classNameId;
    }

    public void setClassNameId(long classNameId) {
        _classNameId = classNameId;
    }

    public String getKeywords() {
        return _keywords;
    }

    public void setKeywords(String keywords) {
        _keywords = keywords;
    }
}
