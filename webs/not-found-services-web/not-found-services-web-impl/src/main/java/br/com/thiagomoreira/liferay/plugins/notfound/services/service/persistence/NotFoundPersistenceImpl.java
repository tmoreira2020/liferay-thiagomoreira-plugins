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

import br.com.thiagomoreira.liferay.plugins.notfound.services.NoSuchNotFoundException;
import br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound;
import br.com.thiagomoreira.liferay.plugins.notfound.services.model.impl.NotFoundImpl;
import br.com.thiagomoreira.liferay.plugins.notfound.services.model.impl.NotFoundModelImpl;
import br.com.thiagomoreira.liferay.plugins.notfound.services.service.persistence.NotFoundPersistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the not found service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Thiago Moreira
 * @see NotFoundPersistence
 * @see NotFoundUtil
 * @generated
 */
public class NotFoundPersistenceImpl extends BasePersistenceImpl<NotFound>
    implements NotFoundPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link NotFoundUtil} to access the not found persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = NotFoundImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(NotFoundModelImpl.ENTITY_CACHE_ENABLED,
            NotFoundModelImpl.FINDER_CACHE_ENABLED, NotFoundImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(NotFoundModelImpl.ENTITY_CACHE_ENABLED,
            NotFoundModelImpl.FINDER_CACHE_ENABLED, NotFoundImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(NotFoundModelImpl.ENTITY_CACHE_ENABLED,
            NotFoundModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_NOTFOUND = "SELECT notFound FROM NotFound notFound";
    private static final String _SQL_COUNT_NOTFOUND = "SELECT COUNT(notFound) FROM NotFound notFound";
    private static final String _ORDER_BY_ENTITY_ALIAS = "notFound.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No NotFound exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(NotFoundPersistenceImpl.class);
    private static NotFound _nullNotFound = new NotFoundImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<NotFound> toCacheModel() {
                return _nullNotFoundCacheModel;
            }
        };

    private static CacheModel<NotFound> _nullNotFoundCacheModel = new CacheModel<NotFound>() {
            @Override
            public NotFound toEntityModel() {
                return _nullNotFound;
            }
        };

    public NotFoundPersistenceImpl() {
        setModelClass(NotFound.class);
    }

    /**
     * Caches the not found in the entity cache if it is enabled.
     *
     * @param notFound the not found
     */
    @Override
    public void cacheResult(NotFound notFound) {
        EntityCacheUtil.putResult(NotFoundModelImpl.ENTITY_CACHE_ENABLED,
            NotFoundImpl.class, notFound.getPrimaryKey(), notFound);

        notFound.resetOriginalValues();
    }

    /**
     * Caches the not founds in the entity cache if it is enabled.
     *
     * @param notFounds the not founds
     */
    @Override
    public void cacheResult(List<NotFound> notFounds) {
        for (NotFound notFound : notFounds) {
            if (EntityCacheUtil.getResult(
                        NotFoundModelImpl.ENTITY_CACHE_ENABLED,
                        NotFoundImpl.class, notFound.getPrimaryKey()) == null) {
                cacheResult(notFound);
            } else {
                notFound.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all not founds.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(NotFoundImpl.class.getName());
        }

        EntityCacheUtil.clearCache(NotFoundImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the not found.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(NotFound notFound) {
        EntityCacheUtil.removeResult(NotFoundModelImpl.ENTITY_CACHE_ENABLED,
            NotFoundImpl.class, notFound.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<NotFound> notFounds) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (NotFound notFound : notFounds) {
            EntityCacheUtil.removeResult(NotFoundModelImpl.ENTITY_CACHE_ENABLED,
                NotFoundImpl.class, notFound.getPrimaryKey());
        }
    }

    /**
     * Creates a new not found with the primary key. Does not add the not found to the database.
     *
     * @param notFoundId the primary key for the new not found
     * @return the new not found
     */
    @Override
    public NotFound create(long notFoundId) {
        NotFound notFound = new NotFoundImpl();

        notFound.setNew(true);
        notFound.setPrimaryKey(notFoundId);

        return notFound;
    }

    /**
     * Removes the not found with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param notFoundId the primary key of the not found
     * @return the not found that was removed
     * @throws br.com.thiagomoreira.liferay.plugins.notfound.services.NoSuchNotFoundException if a not found with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotFound remove(long notFoundId)
        throws NoSuchNotFoundException, SystemException {
        return remove((Serializable) notFoundId);
    }

    /**
     * Removes the not found with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the not found
     * @return the not found that was removed
     * @throws br.com.thiagomoreira.liferay.plugins.notfound.services.NoSuchNotFoundException if a not found with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotFound remove(Serializable primaryKey)
        throws NoSuchNotFoundException, SystemException {
        Session session = null;

        try {
            session = openSession();

            NotFound notFound = (NotFound) session.get(NotFoundImpl.class,
                    primaryKey);

            if (notFound == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchNotFoundException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(notFound);
        } catch (NoSuchNotFoundException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected NotFound removeImpl(NotFound notFound) throws SystemException {
        notFound = toUnwrappedModel(notFound);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(notFound)) {
                notFound = (NotFound) session.get(NotFoundImpl.class,
                        notFound.getPrimaryKeyObj());
            }

            if (notFound != null) {
                session.delete(notFound);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (notFound != null) {
            clearCache(notFound);
        }

        return notFound;
    }

    @Override
    public NotFound updateImpl(
        br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound notFound)
        throws SystemException {
        notFound = toUnwrappedModel(notFound);

        boolean isNew = notFound.isNew();

        Session session = null;

        try {
            session = openSession();

            if (notFound.isNew()) {
                session.save(notFound);

                notFound.setNew(false);
            } else {
                session.merge(notFound);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(NotFoundModelImpl.ENTITY_CACHE_ENABLED,
            NotFoundImpl.class, notFound.getPrimaryKey(), notFound);

        return notFound;
    }

    protected NotFound toUnwrappedModel(NotFound notFound) {
        if (notFound instanceof NotFoundImpl) {
            return notFound;
        }

        NotFoundImpl notFoundImpl = new NotFoundImpl();

        notFoundImpl.setNew(notFound.isNew());
        notFoundImpl.setPrimaryKey(notFound.getPrimaryKey());

        notFoundImpl.setNotFoundId(notFound.getNotFoundId());
        notFoundImpl.setCompanyId(notFound.getCompanyId());
        notFoundImpl.setGroupId(notFound.getGroupId());
        notFoundImpl.setUserId(notFound.getUserId());
        notFoundImpl.setCreateDate(notFound.getCreateDate());
        notFoundImpl.setClassNameId(notFound.getClassNameId());
        notFoundImpl.setKeywords(notFound.getKeywords());

        return notFoundImpl;
    }

    /**
     * Returns the not found with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the not found
     * @return the not found
     * @throws br.com.thiagomoreira.liferay.plugins.notfound.services.NoSuchNotFoundException if a not found with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotFound findByPrimaryKey(Serializable primaryKey)
        throws NoSuchNotFoundException, SystemException {
        NotFound notFound = fetchByPrimaryKey(primaryKey);

        if (notFound == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchNotFoundException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return notFound;
    }

    /**
     * Returns the not found with the primary key or throws a {@link br.com.thiagomoreira.liferay.plugins.notfound.services.NoSuchNotFoundException} if it could not be found.
     *
     * @param notFoundId the primary key of the not found
     * @return the not found
     * @throws br.com.thiagomoreira.liferay.plugins.notfound.services.NoSuchNotFoundException if a not found with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotFound findByPrimaryKey(long notFoundId)
        throws NoSuchNotFoundException, SystemException {
        return findByPrimaryKey((Serializable) notFoundId);
    }

    /**
     * Returns the not found with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the not found
     * @return the not found, or <code>null</code> if a not found with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotFound fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        NotFound notFound = (NotFound) EntityCacheUtil.getResult(NotFoundModelImpl.ENTITY_CACHE_ENABLED,
                NotFoundImpl.class, primaryKey);

        if (notFound == _nullNotFound) {
            return null;
        }

        if (notFound == null) {
            Session session = null;

            try {
                session = openSession();

                notFound = (NotFound) session.get(NotFoundImpl.class, primaryKey);

                if (notFound != null) {
                    cacheResult(notFound);
                } else {
                    EntityCacheUtil.putResult(NotFoundModelImpl.ENTITY_CACHE_ENABLED,
                        NotFoundImpl.class, primaryKey, _nullNotFound);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(NotFoundModelImpl.ENTITY_CACHE_ENABLED,
                    NotFoundImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return notFound;
    }

    /**
     * Returns the not found with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param notFoundId the primary key of the not found
     * @return the not found, or <code>null</code> if a not found with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public NotFound fetchByPrimaryKey(long notFoundId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) notFoundId);
    }

    /**
     * Returns all the not founds.
     *
     * @return the not founds
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<NotFound> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<NotFound> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<NotFound> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<NotFound> list = (List<NotFound>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_NOTFOUND);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_NOTFOUND;

                if (pagination) {
                    sql = sql.concat(NotFoundModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<NotFound>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<NotFound>(list);
                } else {
                    list = (List<NotFound>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the not founds from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (NotFound notFound : findAll()) {
            remove(notFound);
        }
    }

    /**
     * Returns the number of not founds.
     *
     * @return the number of not founds
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_NOTFOUND);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the not found persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.br.com.thiagomoreira.liferay.plugins.notfound.services.model.NotFound")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<NotFound>> listenersList = new ArrayList<ModelListener<NotFound>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<NotFound>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(NotFoundImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
