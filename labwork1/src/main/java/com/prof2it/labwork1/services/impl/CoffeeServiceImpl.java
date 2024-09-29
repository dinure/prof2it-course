package com.prof2it.labwork1.services.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.prof2it.labwork1.model.Coffee;
import com.prof2it.labwork1.repos.CoffeeRepository;
import com.prof2it.labwork1.services.CoffeeService;

@Service
public class CoffeeServiceImpl implements CoffeeService {
	@Autowired
	private CoffeeRepository coffeeRepository;

	@Override
	public Coffee findById(Long id) {
		Optional<Coffee> optionalCoffee = coffeeRepository.findById(id);
		return optionalCoffee.isPresent() ? optionalCoffee.get() : new Coffee();
	}

	@Override
	public List<Coffee> findAll() {
		return coffeeRepository.findAll();
	}

	@Override
	public Coffee save(Coffee coffee) {
		return coffeeRepository.save(coffee);
	}

	@Override
	public void update(Coffee coffee) {
		coffeeRepository.save(coffee);
	}

	@Override
	public void remove(Long id) {
		coffeeRepository.deleteById(id);

	}
}
