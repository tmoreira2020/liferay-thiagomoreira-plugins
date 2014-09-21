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
package br.com.thiagomoreira.liferay.plugins.notfound.services.model.impl;

import br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing NotFound in entity cache.
 *
 * @author Thiago Moreira
 * @see NotFound
 * @generated
 */
public class NotFoundCacheModel implements CacheModel<NotFound>, Externalizable {
    public long notFoundId;
    public long companyId;
    public long groupId;
    public long userId;
    public long createDate;
    public long classNameId;
    public String keywords;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(15);

        sb.append("{notFoundId=");
        sb.append(notFoundId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", classNameId=");
        sb.append(classNameId);
        sb.append(", keywords=");
        sb.append(keywords);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public NotFound toEntityModel() {
        NotFoundImpl notFoundImpl = new NotFoundImpl();

        notFoundImpl.setNotFoundId(notFoundId);
        notFoundImpl.setCompanyId(companyId);
        notFoundImpl.setGroupId(groupId);
        notFoundImpl.setUserId(userId);

        if (createDate == Long.MIN_VALUE) {
            notFoundImpl.setCreateDate(null);
        } else {
            notFoundImpl.setCreateDate(new Date(createDate));
        }

        notFoundImpl.setClassNameId(classNameId);

        if (keywords == null) {
            notFoundImpl.setKeywords(StringPool.BLANK);
        } else {
            notFoundImpl.setKeywords(keywords);
        }

        notFoundImpl.resetOriginalValues();

        return notFoundImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        notFoundId = objectInput.readLong();
        companyId = objectInput.readLong();
        groupId = objectInput.readLong();
        userId = objectInput.readLong();
        createDate = objectInput.readLong();
        classNameId = objectInput.readLong();
        keywords = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(notFoundId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(userId);
        objectOutput.writeLong(createDate);
        objectOutput.writeLong(classNameId);

        if (keywords == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(keywords);
        }
    }
}
