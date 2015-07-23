package com.mos.refdata.store;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.mos.refdata.domain.Book;
import com.mos.refdata.domain.BookAttribute;

public class TestRefDataStore {
	
	@Before
	public void setup() {
		
		Book book = new Book();
		
		book.setName("BOOK1");
		book.setShortName("B1");
		book.setLegalEntityId(1234);
		BookAttribute ba = new BookAttribute();
		
		ba.setAttributeName("A1");
		ba.setAttributeValue("V1");
		
		
		
		
		BookStore bs = new BookStore();
		bs.save(book);
		
		ArrayList<BookAttribute> list = new ArrayList<BookAttribute>();
		list.add(ba);
		book.setBookAttributes(list);
		
		bs.save(book);
		
	}
	
	
	
	@Test
	public void testBook() {
		
		BookStore bs = new BookStore();
		
		List<Book> books = bs.getAll();
		
		System.out.println(books);
		
		
	}

}
