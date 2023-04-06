package com.mitocode.demo05.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Sale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSale;

	@ManyToOne
	@JoinColumn(name = "id_client", nullable = false)
	private Client client;

	@ManyToOne
	@JoinColumn(name = "id_user", nullable = false)
	private User user;

	@Column(nullable = false)
	private LocalDateTime datetime;

	@Column(nullable = false, columnDefinition = "decimal(5,2)")
	private double total;

	@Column(nullable = false, columnDefinition = "decimal(5,2)")
	private double tax;

	private boolean enabled;

	public Integer getIdSale() {
		return idSale;
	}

	public void setIdSale(Integer idSale) {
		this.idSale = idSale;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public LocalDateTime getDatetime() {
		return datetime;
	}

	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
