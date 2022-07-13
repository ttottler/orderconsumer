package com.app.retail.consumer.messageconsumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.retail.consumer.service.OrderService;

@Component
public class Messagelistener {

	@Autowired
	private OrderService orderService;
	
	@RabbitListener(queues = MQConfig.MESSAGE_QUEUE)
	public void listener(CustomMessage customMessage) {
		orderService.processOrder(customMessage.getOrder());
	}
	
}
