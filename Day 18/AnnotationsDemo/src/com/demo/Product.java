package com.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product1")

public class Product {
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE)
	private long id;
	
	@Column(name="Lappy_name")
	private String laptopName; 
	@Column(name="Colour")
	private String color; 
	@Column(name="weight")
	private String weight; 
	@Column(name="model number")
	private String model;
	@Column(name="Measurements and sizes")
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