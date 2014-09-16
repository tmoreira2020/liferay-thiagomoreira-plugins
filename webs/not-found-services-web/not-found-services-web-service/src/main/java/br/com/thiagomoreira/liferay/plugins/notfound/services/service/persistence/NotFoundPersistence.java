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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the not found service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Thiago Moreira
 * @see NotFoundPersistenceImpl
 * @see NotFoundUtil
 * @generated
 */
public interface NotFoundPersistence extends BasePersistence<NotFound> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link NotFoundUtil} to access the not found persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the not found in the entity cache if it is enabled.
    *
    * @param notFound the not found
    */
    public void cacheResult(
        br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound notFound);

    /**
    * Caches the not founds in the entity cache if it is enabled.
    *
    * @param notFounds the not founds
    */
    public void cacheResult(
        java.util.List<br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound> notFounds);

    /**
    * Creates a new not found with the primary key. Does not add the not found to the database.
    *
    * @param notFoundId the primary key for the new not found
    * @return the new not found
    */
    public br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound create(
        long notFoundId);

    /**
    * Removes the not found with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param notFoundId the primary key of the not found
    * @return the not found that was removed
    * @throws br.com.thiagomoreira.liferay.plugins.notfound.services.NoSuchNotFoundException if a not found with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound remove(
        long notFoundId)
        throws br.com.thiagomoreira.liferay.plugins.notfound.services.NoSuchNotFoundException,
            com.liferay.portal.kernel.exception.SystemException;

    public br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound updateImpl(
        br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound notFound)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the not found with the primary key or throws a {@link br.com.thiagomoreira.liferay.plugins.notfound.services.NoSuchNotFoundException} if it could not be found.
    *
    * @param notFoundId the primary key of the not found
    * @return the not found
    * @throws br.com.thiagomoreira.liferay.plugins.notfound.services.NoSuchNotFoundException if a not found with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound findByPrimaryKey(
        long notFoundId)
        throws br.com.thiagomoreira.liferay.plugins.notfound.services.NoSuchNotFoundException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the not found with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param notFoundId the primary key of the not found
    * @return the not found, or <code>null</code> if a not found with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound fetchByPrimaryKey(
        long notFoundId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the not founds.
    *
    * @return the not founds
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the not founds.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.thiagomoreira.liferay.plugins.notfound.services.model.impl.NotFoundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of not founds
    * @param end the upper bound of the range of not founds (not inclusive)
    * @return the range of not founds
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the not founds.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.thiagomoreira.liferay.plugins.notfound.services.model.impl.NotFoundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of not founds
    * @param end the upper bound of the range of not founds (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of not founds
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the not founds from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of not founds.
    *
    * @return the number of not founds
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
