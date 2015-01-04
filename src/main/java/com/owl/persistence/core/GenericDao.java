package com.owl.persistence.core;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ronaldo
 * Date: 03/01/15
 * Time: 21:07
 * To change this template use File | Settings | File Templates.
 * * @param <T>
 *
 * @param <PK>
 */
public interface GenericDao<T, PK> extends Serializable {

    /**
     * Loads an object in database from its id.
     *
     * @param id
     * @return Object T
     */
    T find(final long id);

    /**
     * Get an object collection from database.
     *
     * @return List objects
     */
    List<T> find();

    /**
     * Persist an object into database
     *
     * @param entity
     * @return
     */
    PK save(T entity);


    /**
     * Save the changes made to an object into database
     *
     * @param entity
     */
    void update(T entity);


    /**
     * Inserts or updates an object collection in database.
     */
    void save(Collection<?> entitys);

    /**
     * Removes an object from database.
     */
    public void delete(T entity);

    /**
     * Removes an object collection from database.
     */
    public void delete(Collection<?> entitys);
}
