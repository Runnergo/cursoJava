
package com.springbootthymeleaf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BookService {

	static List<Book> library = new ArrayList<Book>();
	
	static {
		
		Book book1= new Book("Anna Karenina","BASGA15-252S38",568);
		Book book2= new Book("The LightHouse","BSDGA15-278912",356);
		library.add(book1);
		library.add(book2);
	}
	
	
	public List<Book> findAll() {
		
		return library;
	}
	
	
	
}
