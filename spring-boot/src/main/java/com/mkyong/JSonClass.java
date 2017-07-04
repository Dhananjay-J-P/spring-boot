/**
 * 
 */
package com.mkyong;

/**
 * @author Dhananjay P
 *
 */
public class JSonClass {

	/**
	 * 
	 */
	public JSonClass() {
		// TODO Auto-generated constructor stub
	}

	String id;
	
	String name;
	
	String contact;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "JSonClass [id=" + id + ", name=" + name + ", contact=" + contact + "]";
	}

	/**
	 * @param id
	 * @param name
	 * @param contact
	 */
	public JSonClass(String id, String name, String contact) {
		this.id = id;
		this.name = name;
		this.contact = contact;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * @param contact the contact to set
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
	
}
