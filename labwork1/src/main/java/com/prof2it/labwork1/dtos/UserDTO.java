package com.prof2it.labwork1.dtos;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
	private Long id;
	private String name;
	private String email;
	private String phone;
	private String address;
}
