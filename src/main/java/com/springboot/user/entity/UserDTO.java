package com.springboot.user.entity;

import lombok.Builder;
import lombok.Data;

@Data
public class UserDTO {
	
	private String id;
	private String password;
	private String name;
	private String role;
	
	@Builder
	public UserDTO(String id, String password, String name, String role) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.role = role;
	}

}
