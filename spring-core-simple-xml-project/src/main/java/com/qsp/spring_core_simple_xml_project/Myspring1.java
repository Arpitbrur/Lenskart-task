package com.qsp.spring_core_simple_xml_project;

public class Myspring1 {

	private int id;
	private String Name;
	private String email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Myspring1(int id, String name, String email) {
		super();
		this.id = id;
		Name = name;
		this.email = email;
	}
	
	
	
}
