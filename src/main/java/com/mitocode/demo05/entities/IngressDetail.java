package com.mitocode.demo05.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(IngressDetailPK.class)
public class IngressDetail {

	@Id
	private Ingress ingress;

	@Id
	private Product product;

	@Column(nullable = false)
	private short quantity;

	@Column(nullable = false, columnDefinition = "decimal(5,2)")
	private double cost;

	public Ingress getIngress() {
		return ingress;
	}

	public void setIngress(Ingress ingress) {
		this.ingress = ingress;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public short getQuantity() {
		return quantity;
	}

	public void setQuantity(short quantity) {
		this.quantity = quantity;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
}
