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
import com.prof2it.labwork1.model.User;
import com.prof2it.labwork1.services.UserService;

@RestController
public class UserServiceController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getUser() {
		return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUser(@PathVariable("id") Long id) {
		return new ResponseEntity(userService.findById(id), HttpStatus.OK);
	}

	@PostMapping("/user")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		userService.save(user);
		return new ResponseEntity("User added successfully!", HttpStatus.CREATED);
	}

	@PutMapping("/user/{id}")
	public ResponseEntity updateUser(@RequestBody User user) {
		userService.update(user);
		return new ResponseEntity("User updated successfully!", HttpStatus.OK);
	}

	@DeleteMapping("/user/{id}")
	public ResponseEntity deleteUser(@PathVariable("id") Long id) {
		userService.remove(id);
		return new ResponseEntity("User deleted successfully!", HttpStatus.OK);
	}
}
