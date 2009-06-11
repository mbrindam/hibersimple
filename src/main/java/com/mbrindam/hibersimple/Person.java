package com.mbrindam.hibersimple;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table (name="PERSON")
public class Person implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long id;
	
	private String firstName;
	
	private String lastName;

	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
