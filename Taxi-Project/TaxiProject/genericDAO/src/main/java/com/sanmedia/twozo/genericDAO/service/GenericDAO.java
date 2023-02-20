package com.sanmedia.twozo.genericDAO.service;

import com.sanmedia.twozo.genericDAO.model.GenericModel;

import java.util.Collection;

public interface GenericDAO<T extends GenericModel> {

    long insert(T t);

    T get(final Long id);

    boolean remove(final Long id);

    boolean update(T t);

    Collection<T> getAll();
}