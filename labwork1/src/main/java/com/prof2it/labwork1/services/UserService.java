package com.prof2it.labwork1.services;

import java.util.List;
import com.prof2it.labwork1.model.User;

public interface UserService {
	User findById(Long id);

	List<User> findAll();

	User save(User user);

	void update(User user);

	void remove(Long id);
}
