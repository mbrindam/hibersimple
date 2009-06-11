package com.mbrindam.hibersimple;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

/**
 * This is a hibernate-annotated class representing a person.
 * 
 * @author mbrindam
 *
 */
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

	/**
	 * Get the database ID of this object.
	 * @return long id of this object
	 */
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Get the Person's first name.
	 * @return String representing the First Name.
	 */
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Get the person's last name.
	 * @return String representing Last Name.
	 */
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
