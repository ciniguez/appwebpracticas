package com.modelo.dao;

import java.util.*;

/**
 * @author crossover
 * @version 1.0
 * @created 16-ago-2023 20:21:20
 */
public interface GenericDAO<T, ID> {

	public List<T> getAll();

	/**
	 * 
	 * @param entity
	 */
	public void create(T entity);

	/**
	 * 
	 * @param entity
	 */
	public void update(T entity);

	/**
	 * 
	 * @param entity
	 */
	public void delete(T entity);

	/**
	 * 
	 * @param id
	 */
	public void deleteById(ID id);

	/**
	 * 
	 * @param id
	 */
	public T getById(ID id);

}