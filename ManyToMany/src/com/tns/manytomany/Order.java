package com.tns.manytomany;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.crypto.Data;

@Entity
@Table(name = "product_master")
public class Order implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id	
	private int id;
	@Temporal(TemporalType.DATE)
	@Column(name = "order_date")
	private Date purchaseDate;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "product_orders",joinColumns = {@JoinColumn(name = "order_id")}, inverseJoinColumns = { @JoinColumn(name = "product_id") })
	private Set<Product> products = new HashSet<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Set<Product> getProduct() {
		return products;
	}

	public void setProduct(Set<Product> products) {
		this.products = products;
	}
	public void addProduct(Product product) {
		this.getProduct().add(product);
	}
	
	
	

}