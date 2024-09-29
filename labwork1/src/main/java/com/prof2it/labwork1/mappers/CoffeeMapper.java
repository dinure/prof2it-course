package com.prof2it.labwork1.mappers;

import org.springframework.stereotype.Component;
import com.prof2it.labwork1.dtos.CoffeeDTO;
import com.prof2it.labwork1.model.Coffee;

@Component
public class CoffeeMapper {
	public CoffeeDTO toDto(Coffee coffee) {
		CoffeeDTO dto = new CoffeeDTO();
		dto.setId(coffee.getId());
		dto.setSort(coffee.getSort());
		dto.setPrice(coffee.getPrice());
		dto.setWeight(coffee.getWeight());
		return dto;
	}

	public Coffee toCoffee(CoffeeDTO coffeeDTO) {
		Coffee coffee = new Coffee();
		coffee.setId(coffeeDTO.getId());
		coffee.setSort(coffeeDTO.getSort());
		coffee.setPrice(coffeeDTO.getPrice());
		coffee.setWeight(coffeeDTO.getWeight());
		return coffee;
	}
}
