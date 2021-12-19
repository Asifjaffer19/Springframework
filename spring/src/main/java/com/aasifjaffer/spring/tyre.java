package com.aasifjaffer.spring;

public class tyre {
	
	private String brand;
	
	

	public tyre(String brand) {
		super();
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "tyre [brand=" + brand + "]";
	}
	
	

}
