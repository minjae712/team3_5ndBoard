package com.springboot.user.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.user.entity.UserVO;

public interface UserRepository extends JpaRepository<UserVO, String> {

	
	UserVO findByEmail(String email);
	UserVO findByEmailAndId(String email, String Id);
}
