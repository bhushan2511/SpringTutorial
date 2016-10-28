package com.udemy.tutorial;

public class Person {
    
    private String name;
    private int id;
    private int taxId;
    private Address address;

    public void setAddress(Address address) {
		this.address = address;
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", taxId=" + taxId + ", address=" + address + "]";
	}

	public void speak() {
        // TODO Auto-generated method stub
        System.out.println("I'm a person");
        
    }
}
