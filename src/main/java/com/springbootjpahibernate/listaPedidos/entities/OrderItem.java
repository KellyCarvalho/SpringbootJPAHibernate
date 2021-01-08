package com.springbootjpahibernate.listaPedidos.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.springbootjpahibernate.listaPedidos.entities.pk.OrdemItemPk;
@Entity
@Table(name ="tb_order_item")
public class OrderItem implements Serializable {

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private OrdemItemPk id = new OrdemItemPk();//deve se instaciar ou vai dar o erro nullPointerException
	private Integer quantity;
	private Double price;
	
	
	
	public OrderItem() {
	
	}

	public OrderItem(Order order, Product product, Integer quantity, Double price) {
	   super();
	    id.setOrder(order);
	    id.setProduct(product);
		this.quantity = quantity;
		this.price = price;
	}

	@JsonIgnore
	public Order getOrder() {
		return id.getOrder();
	}
	
	public void setOrder(Order order) {
		this.setOrder(order);
		
	}
	
	public Product getProduct() {
		return id.getProduct();
	}
	
	public void  setProduct(Product product) {
		
		this.setProduct(product);
		
	}

	public OrdemItemPk getId() {
		return id;
	}

	public void setId(OrdemItemPk id) {
		this.id = id;
	}
	
	

}
