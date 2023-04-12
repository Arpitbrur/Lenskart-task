package com.qsp.spring_core_simple_xml_project_eve.Constructor.injection;

public class Laptop {

	private int id;
	private String Name;
	private String price;
	public Laptop(int id, String name, String price) {
		super();
		this.id = id;
		Name = name;
		this.price = price;
	}
	
	public void display() {
		System.out.println("id= "+id);
		System.out.println("name= "+Name);
		System.out.println("price= "+price);
	}

	public String toString() {
		return "id= "+id+"\n name="+"\n price= "+price;
	}
}
