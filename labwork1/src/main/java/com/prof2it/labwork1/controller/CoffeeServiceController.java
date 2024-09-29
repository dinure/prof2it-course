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
import com.prof2it.labwork1.model.Coffee;
import com.prof2it.labwork1.services.CoffeeService;

@RestController
public class CoffeeServiceController {
	@Autowired
	private CoffeeService coffeeService;

	@GetMapping("/coffee")
	public ResponseEntity<List<Coffee>> getCoffee() {
		return new ResponseEntity<>(coffeeService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/coffee/{id}")
	public ResponseEntity<Coffee> getCoffee(@PathVariable("id") Long id) {
		return new ResponseEntity(coffeeService.findById(id), HttpStatus.OK);
	}

	@PostMapping("/coffee")
	public ResponseEntity<Coffee> addCoffee(@RequestBody Coffee coffee) {
		coffeeService.save(coffee);
		return new ResponseEntity("Coffee added successfully!", HttpStatus.CREATED);
	}

	@PutMapping("/coffee")
	public ResponseEntity updateCoffee(@RequestBody Coffee coffee) {
		coffeeService.update(coffee);
		return new ResponseEntity("Coffee updated successfully!", HttpStatus.OK);
	}

	@DeleteMapping("/coffee/{id}")
	public ResponseEntity deleteCoffee(@PathVariable("id") Long id) {
		coffeeService.remove(id);
		return new ResponseEntity("Coffee deleted successfully!", HttpStatus.OK);
	}
}
