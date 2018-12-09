package com.bootcamp.application;

public class Mahasiswa {

	private String id ;
	private String Name ;
	private String Address ;
	
	
	public Mahasiswa(){}
	
	public Mahasiswa(String id, String Name, String Address) {
		this.id = id ;
		this.Name = Name ;
		this.Address = Address ;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	
}
