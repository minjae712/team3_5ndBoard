package com.springboot.user.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="USERS")
@Getter @Setter @ToString
public class UserVO {
	
	@Id
	private String id;
	private String password;
	private String name;
	private String role;
	
	public UserVO() {}
	
	@Builder
	public UserVO(String id, String password, String name, String role) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.role = role;
	}

	
}