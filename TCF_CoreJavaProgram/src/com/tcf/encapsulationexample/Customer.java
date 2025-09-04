package com.tcf.encapsulationexample;

public class Customer {

	private int cid;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", city=" + city + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	private String name;
	private String city;
	
	

}
