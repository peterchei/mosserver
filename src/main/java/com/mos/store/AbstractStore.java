package com.mos.store;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.inject.Inject;


public class AbstractStore<T> {
	
		
	@Inject
	private EntityManager entityManager =null;
	
	@Inject
	private EntityManagerFactory emfactory = null;
		
	private Class<T> genericClassT = null;
	
	
	protected EntityManager getEntityManager() {
		return entityManager;
	}
	
	@SuppressWarnings("unchecked")
	public AbstractStore() {		
		emfactory = Persistence.createEntityManagerFactory("TestJPA");
		entityManager = emfactory.createEntityManager();
		genericClassT = ((Class<T>) returnedClass());
	}
	
		
	@SuppressWarnings("rawtypes")
	protected Class<?> returnedClass() {
		ParameterizedType parameterizedType = (ParameterizedType) getClass()
				.getGenericSuperclass();
		return (Class) parameterizedType.getActualTypeArguments()[0];
	}
	
	
	public void save(T obj) {		
		entityManager.getTransaction().begin();
		entityManager.persist(obj);
		entityManager.getTransaction().commit();
	}
	
	public void save(List<T> objs) {
		entityManager.getTransaction().begin();
		for (T obj : objs) {
			entityManager.persist(obj);
		}
		entityManager.getTransaction().commit();
	}
	
	public T get(long id) {	
		entityManager.getTransaction().begin();
		T obj = entityManager.find(genericClassT, id);
		entityManager.getTransaction().commit();
		return obj;
	}
	
	

}
