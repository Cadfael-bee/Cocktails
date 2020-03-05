package com.my.store.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductOrderId implements Serializable {

	private static final long serialVersionUID = -7541592861040877383L;

	@Column(name = "product_id")
	private Long productId;

	@Column(name = "order_id")
	private Long order;

}