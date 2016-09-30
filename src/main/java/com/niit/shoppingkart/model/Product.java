package com.niit.shoppingkart.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.mapping.OneToMany;
import org.springframework.stereotype.Component;

@Entity
@Table(name="Product")
@Component

public class Product 
{

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String description;
	private double price;
	
	
	@Column(name = "Category_Name,Supplier_Name")
	
	@ManyToOne
	@JoinColumn(name = "Category_Name",updatable=false,insertable=false,nullable=false)
	
	private Category category;
	
	@ManyToOne
	@JoinColumn(name = "Supplier_Name",updatable=false,insertable=false,nullable=false)
	
	private Supplier supplier;
	
	
	
	private String Category_Name;
	
	public String getCategory_Name() 
	
	{
		return Category_Name;
	}
	
	public void setCategory_Name(String category_Name)
	
	{
		Category_Name = category_Name;
	}
	
	public String getSupplier_Name()
	
	{
		return Supplier_Name;
	}
	
	public void setSupplier_Name(String supplier_Name)
	
	{
		Supplier_Name = supplier_Name;
	}
	
	private String Supplier_Name;
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	}
