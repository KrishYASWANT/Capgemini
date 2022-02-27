package com.demo;
public class Product {
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	private long id;
	private String laptopName; 
	private String color; 
	private String weight; 
	private String model;
	private String size;
	
	public Product() {
		
	}
	
	public Product(String size, String laptopName, String color, String weight, String model) {
		super();
		this.size = size;
		this.laptopName = laptopName;
		this.color = color;
		this.weight = weight;
		this.model = model;
	
	}
	
	public String getsize() {
		return size;
	}

	public void setsize(String size) {
		this.size = size;
	}

	public String getLaptopName() {
		return laptopName;
	}

	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}