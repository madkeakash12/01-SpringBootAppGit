package com.app.model;

public class PersonModel {
	
	private int id;
	
	private String addr;

	public PersonModel(int id, String addr) {
		super();
		this.id = id;
		this.addr = addr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	

}
