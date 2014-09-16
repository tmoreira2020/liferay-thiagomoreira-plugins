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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the not found service. This utility wraps {@link NotFoundPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Thiago Moreira
 * @see NotFoundPersistence
 * @see NotFoundPersistenceImpl
 * @generated
 */
public class NotFoundUtil {
    private static NotFoundPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(NotFound notFound) {
        getPersistence().clearCache(notFound);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<NotFound> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<NotFound> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<NotFound> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static NotFound update(NotFound notFound) throws SystemException {
        return getPersistence().update(notFound);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static NotFound update(NotFound notFound,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(notFound, serviceContext);
    }

    /**
    * Caches the not found in the entity cache if it is enabled.
    *
    * @param notFound the not found
    */
    public static void cacheResult(
        br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound notFound) {
        getPersistence().cacheResult(notFound);
    }

    /**
    * Caches the not founds in the entity cache if it is enabled.
    *
    * @param notFounds the not founds
    */
    public static void cacheResult(
        java.util.List<br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound> notFounds) {
        getPersistence().cacheResult(notFounds);
    }

    /**
    * Creates a new not found with the primary key. Does not add the not found to the database.
    *
    * @param notFoundId the primary key for the new not found
    * @return the new not found
    */
    public static br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound create(
        long notFoundId) {
        return getPersistence().create(notFoundId);
    }

    /**
    * Removes the not found with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param notFoundId the primary key of the not found
    * @return the not found that was removed
    * @throws br.com.thiagomoreira.liferay.plugins.notfound.services.NoSuchNotFoundException if a not found with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound remove(
        long notFoundId)
        throws br.com.thiagomoreira.liferay.plugins.notfound.services.NoSuchNotFoundException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(notFoundId);
    }

    public static br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound updateImpl(
        br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound notFound)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(notFound);
    }

    /**
    * Returns the not found with the primary key or throws a {@link br.com.thiagomoreira.liferay.plugins.notfound.services.NoSuchNotFoundException} if it could not be found.
    *
    * @param notFoundId the primary key of the not found
    * @return the not found
    * @throws br.com.thiagomoreira.liferay.plugins.notfound.services.NoSuchNotFoundException if a not found with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound findByPrimaryKey(
        long notFoundId)
        throws br.com.thiagomoreira.liferay.plugins.notfound.services.NoSuchNotFoundException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(notFoundId);
    }

    /**
    * Returns the not found with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param notFoundId the primary key of the not found
    * @return the not found, or <code>null</code> if a not found with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound fetchByPrimaryKey(
        long notFoundId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(notFoundId);
    }

    /**
    * Returns all the not founds.
    *
    * @return the not founds
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the not founds from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of not founds.
    *
    * @return the number of not founds
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static NotFoundPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (NotFoundPersistence) PortletBeanLocatorUtil.locate(br.com.thiagomoreira.liferay.plugins.notfound.services.service.ClpSerializer.getServletContextName(),
                    NotFoundPersistence.class.getName());

            ReferenceRegistry.registerReference(NotFoundUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(NotFoundPersistence persistence) {
    }
}
