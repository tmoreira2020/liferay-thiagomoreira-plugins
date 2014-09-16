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
package br.com.thiagomoreira.liferay.plugins.notfound.services.service.persistence;

import br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound;
import br.com.thiagomoreira.liferay.plugins.notfound.services.service.NotFoundLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Thiago Moreira
 * @generated
 */
public abstract class NotFoundActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public NotFoundActionableDynamicQuery() throws SystemException {
        setBaseLocalService(NotFoundLocalServiceUtil.getService());
        setClass(NotFound.class);

        setClassLoader(br.com.thiagomoreira.liferay.plugins.notfound.services.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("notFoundId");
    }
}
