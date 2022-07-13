package com.app.retail.consumer.service;

import com.app.retail.consumer.model.Order;

public interface OrderService {
	/**
	 * Method to process order
	 * @param order
	 */
	public void processOrder(Order order);
}
