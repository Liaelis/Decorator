package br.ufsm.csi.pp.dao;

import javax.sql.DataSource;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

public interface DAOGenericoInterface<T> {
    T getById(Serializable id) throws InvocationTargetException, IllegalAccessException;

    void update(T t) throws InvocationTargetException, IllegalAccessException;

    void remove(T t) throws InvocationTargetException, IllegalAccessException;

    void create(T t) throws InvocationTargetException, IllegalAccessException;

    DataSource getDataSource();
}
