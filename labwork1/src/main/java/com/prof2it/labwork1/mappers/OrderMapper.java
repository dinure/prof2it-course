package com.prof2it.labwork1.mappers;

import org.springframework.stereotype.Component;
import com.prof2it.labwork1.dtos.OrderDTO;
import com.prof2it.labwork1.model.Order;

@Component
public class OrderMapper {
	public OrderDTO toDto(Order order) {
		OrderDTO dto = new OrderDTO();
		dto.setId(order.getId());
		dto.setUser(order.getUser());
		dto.setCoffee(order.getCoffee());
		dto.setPlacementDate(order.getPlacementDate());
		dto.setDeliveryDate(order.getDeliveryDate());
		dto.setTotalPrice(order.getTotalPrice());
		dto.setStatus(order.getStatus());
		return dto;
	}

	public Order toOrder(OrderDTO orderDTO) {
		Order order = new Order();
		order.setId(orderDTO.getId());
		order.setUser(orderDTO.getUser());
		order.setCoffee(orderDTO.getCoffee());
		order.setPlacementDate(orderDTO.getPlacementDate());
		order.setDeliveryDate(orderDTO.getDeliveryDate());
		order.setTotalPrice(orderDTO.getTotalPrice());
		order.setStatus(orderDTO.getStatus());
		return order;
	}
}
