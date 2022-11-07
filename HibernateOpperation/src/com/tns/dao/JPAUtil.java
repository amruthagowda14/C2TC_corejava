package com.tns.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory factory;
	private static EntityManager entityManager;
	
	static { 
		factory = Persistence.createEntityManagerFactory("JPA-PU");
	}
	public static EntityManager getEntityManager1() {
		if(entityManager == null || !entityManager.isOpen()) {
			entityManager = factory.createEntityManager();
			
		}
		return entityManager;
	}
	public static EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return null;
	}

}
