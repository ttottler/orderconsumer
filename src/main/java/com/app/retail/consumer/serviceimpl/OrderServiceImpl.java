package com.app.retail.consumer.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.retail.consumer.model.Order;
import com.app.retail.consumer.repository.OrderRepository;
import com.app.retail.consumer.service.OrderService;
import com.app.retail.consumer.utils.Constants;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void processOrder(Order order) {
		order.setStatus(Constants.ORDER_STATUS_PROCESSED);
		orderRepository.save(order);
	}
	
}
