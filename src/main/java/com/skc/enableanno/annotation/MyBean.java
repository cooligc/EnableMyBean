package com.skc.enableanno.annotation;

/**
 * 
 * @author sitakant
 *
 */
public class MyBean {
	private String name;
	private String greeting;
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
	 * @return the greeting
	 */
	public String getGreeting() {
		return greeting;
	}
	/**
	 * @param greeting the greeting to set
	 */
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MyBean [ "+name + " " + greeting + "]";
	}
	
	
	
}
