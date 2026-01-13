package com.modelo.dao;

import java.util.List;

public interface GenericDAO<T, ID> {
	
	public T getById(ID id);
	public List<T> get();
	public List<T> get(String[] attributes, String[] values); //like + and
	public List<T> get(String[] attributes, String[] values, String order, int index, int size);
	
	public void create(T entity);
	public void update(T entity);
	public void delete(T entity);
	public void deleteByID(ID id);
	
}