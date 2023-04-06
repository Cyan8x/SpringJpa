package com.mitocode.demo05.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SaleDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSaleDetail;

	@ManyToOne
	@JoinColumn(name = "id_sale", nullable = false)
	private Sale sale;

	@ManyToOne
	@JoinColumn(name = "id_product", nullable = false)
	private Product product;

	@Column(nullable = false)
	private Integer quantify;

	@Column(nullable = false, columnDefinition = "decimal(5,2)")
	private double salePrice;

	@Column(nullable = false, columnDefinition = "decimal(5,2)")
	private double discount;

	public Integer getIdSaleDetail() {
		return idSaleDetail;
	}

	public void setIdSaleDetail(Integer idSaleDetail) {
		this.idSaleDetail = idSaleDetail;
	}

	public Sale getSale() {
		return sale;
	}

	public void setSale(Sale sale) {
		this.sale = sale;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getQuantify() {
		return quantify;
	}

	public void setQuantify(Integer quantify) {
		this.quantify = quantify;
	}

	public double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

}
