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
package br.com.thiagomoreira.liferay.plugins.notfound.services.messaging;

import br.com.thiagomoreira.liferay.plugins.notfound.services.service.NotFoundLocalServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.portal.kernel.messaging.MessageListenerException;
import com.liferay.portal.service.ServiceContext;

public class NotFoundListener implements MessageListener {

	public void receive(Message message) throws MessageListenerException {

		try {
			doReceive(message);
		}
		catch (Exception e) {
			_log.error("Unable to process message " + message, e);
		}
	}

	protected void doReceive(Message message)
		throws Exception {

		String className = (String) message.get("className");
		String keywords = (String) message.get("keywords");

		ServiceContext serviceContext = (ServiceContext) message.get("serviceContext");

		serviceContext.setUserId(serviceContext.getUserId());

		NotFoundLocalServiceUtil.addNotFound(className, keywords, serviceContext);
	}

	private static Log _log = LogFactoryUtil.getLog(NotFoundListener.class);
}
