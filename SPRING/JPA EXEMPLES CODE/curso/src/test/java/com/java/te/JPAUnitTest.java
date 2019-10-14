
package com.java.te;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class JPAUnitTest {

	static EntityManagerFactory emf;
	protected EntityManager em;
	protected EntityManager emPage;

	@BeforeClass
	public static void setupStatic() {
		Persistence.generateSchema("curso", null);// crea contexto de persistencia
		emf = Persistence.createEntityManagerFactory("curso");// crea el gestor de entidades
	}


	@Before
	public void setup() {
		em = emf.createEntityManager();
		emPage = emf.createEntityManager();
	}

	@After
	public void tearDown() {
		em.clear();
		em.close();
		emPage.clear();
		emPage.close();
	}

	@AfterClass
	public static void tearDownStatic() {
		emf.close();
	}
}
