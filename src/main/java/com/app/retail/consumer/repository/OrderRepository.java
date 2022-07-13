package com.app.retail.consumer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.retail.consumer.model.Order;

public interface OrderRepository  extends MongoRepository<Order, Integer> {

}
