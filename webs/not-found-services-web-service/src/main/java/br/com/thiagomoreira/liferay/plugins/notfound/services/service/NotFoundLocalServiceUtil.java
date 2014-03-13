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
package br.com.thiagomoreira.liferay.plugins.notfound.services.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for NotFound. This utility wraps
 * {@link br.com.thiagomoreira.liferay.plugins.notfound.services.service.impl.NotFoundLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Thiago Moreira
 * @see NotFoundLocalService
 * @see br.com.thiagomoreira.liferay.plugins.notfound.services.service.base.NotFoundLocalServiceBaseImpl
 * @see br.com.thiagomoreira.liferay.plugins.notfound.services.service.impl.NotFoundLocalServiceImpl
 * @generated
 */
public class NotFoundLocalServiceUtil {
    private static NotFoundLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link br.com.thiagomoreira.liferay.plugins.notfound.services.service.impl.NotFoundLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the not found to the database. Also notifies the appropriate model listeners.
    *
    * @param notFound the not found
    * @return the not found that was added
    * @throws SystemException if a system exception occurred
    */
    public static br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound addNotFound(
        br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound notFound)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addNotFound(notFound);
    }

    /**
    * Creates a new not found with the primary key. Does not add the not found to the database.
    *
    * @param notFoundId the primary key for the new not found
    * @return the new not found
    */
    public static br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound createNotFound(
        long notFoundId) {
        return getService().createNotFound(notFoundId);
    }

    /**
    * Deletes the not found with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param notFoundId the primary key of the not found
    * @return the not found that was removed
    * @throws PortalException if a not found with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound deleteNotFound(
        long notFoundId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteNotFound(notFoundId);
    }

    /**
    * Deletes the not found from the database. Also notifies the appropriate model listeners.
    *
    * @param notFound the not found
    * @return the not found that was removed
    * @throws SystemException if a system exception occurred
    */
    public static br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound deleteNotFound(
        br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound notFound)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteNotFound(notFound);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.thiagomoreira.liferay.plugins.notfound.services.model.impl.NotFoundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.thiagomoreira.liferay.plugins.notfound.services.model.impl.NotFoundModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound fetchNotFound(
        long notFoundId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchNotFound(notFoundId);
    }

    /**
    * Returns the not found with the primary key.
    *
    * @param notFoundId the primary key of the not found
    * @return the not found
    * @throws PortalException if a not found with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound getNotFound(
        long notFoundId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getNotFound(notFoundId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound> getNotFounds(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getNotFounds(start, end);
    }

    /**
    * Returns the number of not founds.
    *
    * @return the number of not founds
    * @throws SystemException if a system exception occurred
    */
    public static int getNotFoundsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getNotFoundsCount();
    }

    /**
    * Updates the not found in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param notFound the not found
    * @return the not found that was updated
    * @throws SystemException if a system exception occurred
    */
    public static br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound updateNotFound(
        br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound notFound)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateNotFound(notFound);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static void clearService() {
        _service = null;
    }

    public static NotFoundLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    NotFoundLocalService.class.getName());

            if (invokableLocalService instanceof NotFoundLocalService) {
                _service = (NotFoundLocalService) invokableLocalService;
            } else {
                _service = new NotFoundLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(NotFoundLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(NotFoundLocalService service) {
    }
}
