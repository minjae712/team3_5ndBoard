package com.springboot.user.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="MEMBER")
@Getter @Setter @ToString
public class UserVO {
	
	@Id
	private String id;
	private String password;
	private String name;
	private String birth2;
	private String phone;
	private String role;
	private String email;
	private String image;
	private Date birth;
	private String post;
	private String address;
	
	
	
}