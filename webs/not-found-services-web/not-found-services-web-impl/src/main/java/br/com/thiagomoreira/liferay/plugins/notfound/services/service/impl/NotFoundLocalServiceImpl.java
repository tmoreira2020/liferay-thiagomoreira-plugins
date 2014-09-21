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
package br.com.thiagomoreira.liferay.plugins.notfound.services.service.impl;

import java.util.Date;

import br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound;
import br.com.thiagomoreira.liferay.plugins.notfound.services.service.base.NotFoundLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the not found local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link br.com.thiagomoreira.liferay.plugins.notfound.services.service.NotFoundLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Thiago Moreira
 * @see br.com.thiagomoreira.liferay.plugins.notfound.services.service.base.NotFoundLocalServiceBaseImpl
 * @see br.com.thiagomoreira.liferay.plugins.notfound.services.service.NotFoundLocalServiceUtil
 */
public class NotFoundLocalServiceImpl extends NotFoundLocalServiceBaseImpl {

	public NotFound addNotFound(String className, String keywords, ServiceContext serviceContext) 
		throws PortalException, SystemException {

		validate(className, serviceContext);

		long userId = serviceContext.getUserId();
		Date now = new Date();
		long classNameId = classNameLocalService.getClassNameId(className);

		long notfoundId = counterLocalService.increment(NotFound.class.getName());

		NotFound notFound = notFoundPersistence.create(notfoundId);

		notFound.setCompanyId(serviceContext.getCompanyId());
		notFound.setGroupId(serviceContext.getScopeGroupId());
		notFound.setUserId(userId);
		notFound.setCreateDate(now);

		notFound.setClassNameId(classNameId);
		notFound.setKeywords(keywords);

		notFoundPersistence.update(notFound);

		return notFound;
	}

	protected void validate(String className, ServiceContext serviceContext) {
		if (Validator.isNull(className)) {
			throw new IllegalArgumentException("className cannot be null");
		}
		if (Validator.isNull(serviceContext)) {
			throw new IllegalArgumentException("serviceContext cannot be null");
		}
	}
}
