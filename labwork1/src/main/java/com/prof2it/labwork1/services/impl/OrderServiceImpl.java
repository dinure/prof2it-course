package com.prof2it.labwork1.services.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prof2it.labwork1.model.Order;
import com.prof2it.labwork1.repos.OrderRepository;
import com.prof2it.labwork1.services.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order findById(Long id) {
		Optional<Order> optionalOrder = orderRepository.findById(id);
		return optionalOrder.isPresent() ? optionalOrder.get() : new Order();
	}

	@Override
	public List<Order> findAll() {
		return orderRepository.findAll();
	}

	@Override
	public Order save(Order order) {
		return orderRepository.save(order);
	}

	@Override
	public void update(Order order) {
		orderRepository.save(order);
	}

	@Override
	public void remove(Long id) {
		orderRepository.deleteById(id);
	}

}
