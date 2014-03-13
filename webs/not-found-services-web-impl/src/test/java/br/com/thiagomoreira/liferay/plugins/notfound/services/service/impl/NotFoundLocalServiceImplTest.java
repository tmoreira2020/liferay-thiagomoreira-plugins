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

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

@RunWith(PowerMockRunner.class)
public class NotFoundLocalServiceImplTest {

	@Test(expected = IllegalArgumentException.class)
	public void addNotFoundClassNameNull() throws PortalException,
			SystemException {

		String className = null;
		String keywords = "keywords";
		ServiceContext serviceContext = new ServiceContext();
		NotFoundLocalServiceImpl impl = new NotFoundLocalServiceImpl();

		impl.addNotFound(className, keywords, serviceContext);
	}

	@Test(expected = IllegalArgumentException.class)
	public void addNotFoundServiceContextNull() throws PortalException,
			SystemException {

		String className = "className";
		String keywords = "keywords";
		ServiceContext serviceContext = null;
		NotFoundLocalServiceImpl impl = new NotFoundLocalServiceImpl();

		impl.addNotFound(className, keywords, serviceContext);
	}
}
