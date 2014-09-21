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
package br.com.thiagomoreira.liferay.plugins.notfound.services;

import com.liferay.portal.NoSuchModelException;

/**
 * @author Thiago Moreira
 */
public class NoSuchNotFoundException extends NoSuchModelException {

	public NoSuchNotFoundException() {
		super();
	}

	public NoSuchNotFoundException(String msg) {
		super(msg);
	}

	public NoSuchNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NoSuchNotFoundException(Throwable cause) {
		super(cause);
	}

}