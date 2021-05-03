package com.springboot.user.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.user.entity.UserVO;
import com.springboot.user.persistence.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {
	
	private final UserRepository userRepository;
	
//	@Transactional
//	public UserDTO getUser(UserVO vo) {
//		Optional<UserVO> user = userRepository.findById(vo.getId());
//		UserVO userVO = user.get();
//		UserDTO userDTO = UserDTO.builder()
//				.id(userVO.getId())
//				.password(userVO.getPassword())
//				.name(userVO.getName())
//				.role(userVO.getRole())
//				.build();
//		
//		return userDTO;
//	}
	@Transactional
	public UserVO getUser(UserVO vo) {
		return userRepository.findById(vo.getId())
				.orElseThrow(() -> new IllegalAccessError("해당 아이다가 존재하지 않습니다."));
	}
	
	@Transactional
	public void createUser(UserVO vo){
		userRepository.save(vo);
	}
	
	@Transactional
	public void changePassword(UserVO vo){
		UserVO user = userRepository.findById(vo.getId())
				.orElseThrow(() -> new IllegalAccessError("해당 아이다가 존재하지 않습니다."));
		user.setPassword(vo.getPassword());
		userRepository.save(user);
	}
	
	
}
