package com.mitocode.demo05.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class IngressDetailPK implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "id_ingress")
	private Ingress	ingress;
	
	@ManyToOne
	@JoinColumn(name = "id_product")
	private Product product;

	@Override
	public int hashCode() {
		return Objects.hash(ingress, product);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IngressDetailPK other = (IngressDetailPK) obj;
		return Objects.equals(ingress, other.ingress) && Objects.equals(product, other.product);
	}
	
	
}
