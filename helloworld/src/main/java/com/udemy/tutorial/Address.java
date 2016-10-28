 package com.udemy.tutorial;

public class Address {
	
	private String street;
	private int postalCode;
	
	public Address(String street, int postalCode) {
		this.street = street;
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", postalCode=" + postalCode + "]";
	}
	
}
