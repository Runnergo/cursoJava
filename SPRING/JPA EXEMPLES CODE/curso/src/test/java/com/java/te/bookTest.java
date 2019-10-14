package com.java.te;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;

import com.java.so.Book;


public class bookTest extends JPAUnitTest {
	
	@Test
	public void entityManagerFactoryOK() {
		
		assertNotNull(emf); // verifica si se ha creado bien entityManagerfactory
	}
	
	@Test
	public void entityManagerOK() {
		
		assertNotNull(em);// verifica si se ha creado bien el entityManager
	}
	


	/*@Test
	public void selectFirstBook1() {
		
		Book book= em.find(Book.class,"Anna Karenina");
		assertEquals("Tolstoi",book.getAuthor());
		//assertNull(book);
		
		
		
	}*/
	
	@Test
	public void selectFirstBook2() {
		
		Book book= em.find(Book.class, "War and Peace");
		assertEquals("Tolstoi",book.getAuthor());
		//assertNull(book);
		
	}
	
	@Test
	public void deleteInitialBook() {
		
		Book book= em.find(Book.class, "Anna Karenina");
		em.getTransaction().begin();// empieza la transancion
		em.remove(book);
		em.getTransaction().commit();// lo manda a la base de datos
		Book noBook= em.find(Book.class,"Anna Karenina");
		assertNull(noBook);
		
	}
	
	
	@Test
	public void insertNewBook() {
		
		em.getTransaction().begin();// empieza la transancion
		Book newBook= new Book("Lighthouse","VWoolf",new Date());
		em.persist(newBook);// lo pasa en estado de persistencia
		em.getTransaction().commit();// lo manda a la base de datos
		Book insertBook = em.find(Book.class,"Lighthouse");
            assertNotNull(insertBook);

		
	}	
}