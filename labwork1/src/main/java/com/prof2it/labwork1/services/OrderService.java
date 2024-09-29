package com.prof2it.labwork1.services;

import java.util.List;
import com.prof2it.labwork1.model.Order;

public interface OrderService {
	Order findById(Long id);

	List<Order> findAll();

	Order save(Order order);

	void update(Order order);

	void remove(Long id);
}
