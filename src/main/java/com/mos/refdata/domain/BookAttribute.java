package com.mos.refdata.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity 
public class BookAttribute {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;
	

	private String attributeName;

	private String attributeValue;

	//bi-directional many-to-one association to Book
	@ManyToOne (cascade= CascadeType.ALL)
	@JoinColumn(name="BOOKID")
	private Book book;

	public BookAttribute() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAttributeName() {
		return this.attributeName;
	}

	public void setAttributeName(String attributename) {
		this.attributeName = attributename;
	}

	public String getAttributevalue() {
		return this.attributeValue;
	}

	public void setAttributeValue(String attributevalue) {
		this.attributeValue = attributevalue;
	}

	 
	public Book getBook() {
		return this.book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
}
