package net.virux.mangapp.dao;

import java.util.List;

public interface GenericDao<E, K> {

	void add(E entity);
	
	void saveOrUpdate(E entity);
	
	void update(E entity);
	
	void delete(E entity);
	
	E get(K key);
	
	List<E> getAll();
}