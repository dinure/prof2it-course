package com.prof2it.labwork1.mappers;

import org.springframework.stereotype.Component;
import com.prof2it.labwork1.dtos.UserDTO;
import com.prof2it.labwork1.model.User;

@Component
public class UserMapper {
	public UserDTO toDto(User user) {
		UserDTO dto = new UserDTO();
		dto.setId(user.getId());
		dto.setName(user.getName());
		dto.setEmail(user.getEmail());
		dto.setPhone(user.getPhone());
		dto.setAddress(user.getAddress());
		return dto;
	}

	public User toUser(UserDTO userDTO) {
		User user = new User();
		user.setId(userDTO.getId());
		user.setName(userDTO.getName());
		user.setEmail(userDTO.getEmail());
		user.setPhone(userDTO.getPhone());
		user.setAddress(userDTO.getAddress());
		return user;
	}
}
