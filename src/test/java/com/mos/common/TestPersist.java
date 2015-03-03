package com.mos.common;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mos.domain.Portfolio;
import com.mos.store.PortfolioStore;

public class TestPersist {

	public static void main(String[] args) {

		Portfolio pf = new Portfolio();
		pf.setName("A");
		pf.setTradedate(20121212);
		new PortfolioStore().save(pf);
		
//		EntityManagerFactory emfactory = Persistence
//				.createEntityManagerFactory("TestJPA");
//		
//		
		
//		EntityManager entitymanager = emfactory.createEntityManager();
//		
//		EntityManager entitymanager2 = emfactory.createEntityManager();
//		
//		
//		entitymanager.getTransaction().begin();
//		entitymanager2.getTransaction().begin();
//
//		for (int i = 1; i < 1000; i++) {
//			Portfolio pf = new Portfolio();
//			pf.setName("A");
//			pf.setTradedate(20121212);
//
//			entitymanager.persist(pf);
//			System.out.println(pf.getPortfolioid());
//			pf.setName("XX");
//			entitymanager.persist(pf);
//			System.out.println(pf.getName());
//			System.out.println(pf.getPortfolioid());
//		}
//		entitymanager.getTransaction().commit();
//		entitymanager2.getTransaction().commit();

//		entitymanager.close();
//		emfactory.close();

	}

}
