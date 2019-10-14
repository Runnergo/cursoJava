package com.java.te;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Date;

import org.junit.Test;

import com.java.so.Book;
import com.java.so.Page;

public class PageTest extends JPAUnitTest {

	@Test
	public void entityManagerFactoryOK() {

		assertNotNull(emf); // verifica si se ha creado bien entityManagerfactory
	}

	@Test
	public void entityManagerOK() {

		assertNotNull(emPage);// verifica si se ha creado bien el entityManager
	}

	@Test
	public void selectPage() {

		Page page = emPage.find(Page.class, 2);
		assertEquals("Happy families are all alike; every unhappy family is unhappy in its own way.", page.getText());
		// assertNull(book);

	}

	@Test
	public void deleteInitialPage() {

		Page page = emPage.find(Page.class, 1);
		emPage.getTransaction().begin();
		emPage.remove(page);
		emPage.getTransaction().commit();
		Page noPage = emPage.find(Page.class, 1);
		assertNull(noPage);

	}

	@Test
	public void insertNewPage() {

		emPage.getTransaction().begin();
		Book newBook = new Book("blabla", "lalal", new Date());
		Page newPage = new Page("lala", "titti", newBook);

		newPage.setFont("pepito");
		newBook.addPage(newPage);
		emPage.persist(newBook);
		// System.out.println(newPage.getFont());
		emPage.getTransaction().commit();
		Page insertPage = emPage.find(Page.class, 5);
		assertNotNull(insertPage);

	}

	/*
	 * public void insertPageBook() { emPage.getTransaction().begin(); Book book =
	 * em.find(Book.class, "Anna Karenina"); Page newPage = new Page("lala",
	 * "titti", book); emPage.persist(book); emPage.getTransaction().commit(); Page
	 * insertPage = emPage.find(Page.class, 4); assertNotNull(insertPage); }
	 */
}
