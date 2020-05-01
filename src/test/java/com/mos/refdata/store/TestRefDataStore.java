package com.mos.refdata.store;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.mos.refdata.domain.Book;
import com.mos.refdata.domain.BookAttribute;

@Ignore
public class TestRefDataStore {

	@Before
	public void setup() {

		Book book = new Book();

		book.setName("BOOK1");
		book.setShortName("B1");
		book.setLegalEntityId(1234);

		BookStore bs = new BookStore();
		BookAttributeStore bsa = new BookAttributeStore();
		// bs.save(book);

		BookAttribute ba = new BookAttribute();

		ArrayList<BookAttribute> list = new ArrayList<BookAttribute>();
		list.add(ba);
		book.setBookAttributes(list);
		ba.setAttributeName("A1");
		ba.setAttributeValue("V1");
		ba.setBook(book);
		bsa.save(ba);
		bsa.save(ba);

	}

	@Test
	public void testBook() {

		BookStore bs = new BookStore();

		List<Book> books = bs.getAll();

		System.out.println(books.size());

	}

}
