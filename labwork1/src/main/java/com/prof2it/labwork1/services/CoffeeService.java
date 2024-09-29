package com.prof2it.labwork1.services;

import java.util.List;
import com.prof2it.labwork1.model.Coffee;

public interface CoffeeService {
	Coffee findById(Long id);

	List<Coffee> findAll();

	Coffee save(Coffee coffee);

	void update(Coffee coffee);

	void remove(Long id);
}
