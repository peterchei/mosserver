package com.mos.refdata.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;
	private String name;
	private String shortName;
	private long legalEntityId;
	private List<BookAttribute> bookAttributes;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public long getLegalEntityId() {
		return legalEntityId;
	}
	public void setLegalEntityId(long legalEntityId) {
		this.legalEntityId = legalEntityId;
	}
	
	//bi-directional many-to-one association to Bookattribute
	@OneToMany(mappedBy="book", cascade= CascadeType.ALL)
	public List<BookAttribute> getBookAttributes() {
		return bookAttributes;
	}
	
	public void setBookAttributes(List<BookAttribute> bookAttributes) {
		this.bookAttributes = bookAttributes;
	}
		
}
