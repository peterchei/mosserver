package com.mos.store;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//import CriteriaQuery;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;

import com.google.inject.Inject;

public class AbstractStore<T> {

	@Inject
	private EntityManager entityManager = null;

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
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(obj);
		} catch (Exception ex) {
			entityManager.getTransaction().rollback();
		} finally {
			entityManager.getTransaction().commit();
		}

	}

	public void save(List<T> objs) {
		try {
			entityManager.getTransaction().begin();
			for (T obj : objs) {
				entityManager.persist(obj);
			}
		} catch (Exception ex) {
			entityManager.getTransaction().rollback();
		} finally {
			entityManager.getTransaction().commit();
		}
	}

	public T get(long id) {
		try {
			entityManager.getTransaction().begin();
			T obj = entityManager.find(genericClassT, id);
			return obj;
		} catch (Exception ex) {
			entityManager.getTransaction().rollback();
			throw ex;
		} finally {
			entityManager.getTransaction().commit();
		}
	}

	public List<T> getAll() {
		try {
			entityManager.getTransaction().begin();
			CriteriaQuery<T> query = entityManager.getCriteriaBuilder()
					.createQuery(genericClassT);
			TypedQuery<T> q = entityManager.createQuery(query);
			List<T> alls = q.getResultList();
			return alls;
		} catch (Exception ex) {
			entityManager.getTransaction().rollback();
			throw ex;
		} finally {
			entityManager.getTransaction().commit();
		}
	}

}
