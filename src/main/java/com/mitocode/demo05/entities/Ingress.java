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
public class Ingress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idIngress;

	@ManyToOne
	@JoinColumn(name = "id_provider", nullable = false)
	private Provider provider;

	@ManyToOne
	@JoinColumn(name = "id_user", nullable = false)
	private User user;

	@Column(nullable = false)
	private LocalDateTime dateTime;

	@Column(nullable = false, columnDefinition = "decimal(5,2)")
	private double total;

	@Column(nullable = false, columnDefinition = "decimal(5,2)")
	private double tax;

	@Column(length = 10, nullable = false)
	private String serialNumber;

	private boolean enabled;

	public Integer getIdIngress() {
		return idIngress;
	}

	public void setIdIngress(Integer idIngress) {
		this.idIngress = idIngress;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
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

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
