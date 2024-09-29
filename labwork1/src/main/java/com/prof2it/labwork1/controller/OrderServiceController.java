package com.prof2it.labwork1.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.prof2it.labwork1.model.Order;
import com.prof2it.labwork1.services.OrderService;

@RestController
public class OrderServiceController {
	@Autowired
	private OrderService orderService;

	@GetMapping("/orders")
	public ResponseEntity<List<Order>> getOrder() {
		return new ResponseEntity<>(orderService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/order/{id}")
	public ResponseEntity getOrder(@PathVariable("id") Long id) {
		return new ResponseEntity(orderService.findById(id), HttpStatus.OK);
	}

	@PostMapping("/order")
	public ResponseEntity<Order> addOrder(@RequestBody Order order) {
		orderService.save(order);
		return new ResponseEntity("Order added successfully!", HttpStatus.CREATED);
	}

	@PutMapping("/order")
	public ResponseEntity updateOrder(@RequestBody Order order) {
		orderService.update(order);
		return new ResponseEntity("Order updated successfully!", HttpStatus.OK);
	}

	@DeleteMapping("/order/{id}")
	public ResponseEntity deleteOrder(@PathVariable("id") Long id) {
		orderService.remove(id);
		return new ResponseEntity("Order deleted successfully!", HttpStatus.OK);
	}
}
