package com.my.store.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_order")
public class ProductOrder {
 
    @EmbeddedId
    private ProductOrderId id;
 
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("productId")
    private Product product;
 
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("orderId")
    private Order order;
 
    @Column(name = "amount")
    private int createdOn;
 
}
