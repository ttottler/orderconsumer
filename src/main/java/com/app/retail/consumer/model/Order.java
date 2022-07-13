package com.app.retail.consumer.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "order")
public class Order {

	private int id;
	
	private String status;
	
	private List<OrderItem> orderItems;

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

}
