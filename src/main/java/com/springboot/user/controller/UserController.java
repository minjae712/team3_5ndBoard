package com.springboot.user.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.user.entity.UserVO;
import com.springboot.user.service.UserService;

@Controller
public class UserController {
	
	@Autowired	
	private UserService userservice;
	Map<String, Boolean> errors = new HashMap<String, Boolean>();
	
	@RequestMapping(value={"", "/main.do"})
	public String Main(HttpServletRequest request, HttpSession session, Model model) throws Exception{
		try {
			
		}catch(Exception e) {
			
		}		
		return "index.jsp";
	}

	@RequestMapping("/login.do")
	public String getUser(UserVO vo, HttpSession session) {
		System.out.println("로그인 처리 완료~");
		try {
			
		UserVO user = userservice.getUser(vo);
		session.setAttribute("user", user);
		
		if(user != null) {
			return "getBoardList.do";
		}else {
		
		return "login.jsp";
		}
		}catch (Exception e) {
			return "login.jsp";
		}
	}
	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		System.out.println("로그아웃 처리 완료~");
		
		session.invalidate();
		return "login.jsp";
		
	}
	
	@RequestMapping("/changePassword.do")
	public String changePassword(UserVO vo){ // HttpSession객체를 매개변수로 받음
		System.out.println("비밀번호 변경 처리...");
		
		userservice.changePassword(vo);
		
		return "index.jsp";
		
	}
	
	@RequestMapping("/createUser.do")
	public String userCreate(UserVO vo) {
		userservice.createUser(vo);
		return "index.jsp";
	}
	
	@RequestMapping("/find_id.do")
	public String find_id(UserVO vo, Model model)  {
		UserVO find_id = userservice.find_id(vo);
		
		if(find_id == null) {
			model.addAttribute("check",1);
		}else {
			model.addAttribute("check",0);
			model.addAttribute("find_id", find_id.getId());
		}
		return "find_id.jsp";
	}
	
	
	@RequestMapping("/findPassword.do")
	public String findPassword(UserVO vo, Model model) {
			UserVO find_pw = userservice.find_password(vo);
			if(vo.getEmail().equals(find_pw.getEmail()) && vo.getId().equals(find_pw.getId())) {
				model.addAttribute("find",find_pw);
				return "findSuccess.jsp";
			}else {
				errors.put("email", Boolean.TRUE);
				model.addAttribute("error",errors);
				return "findPassword.jsp";
			}
	}
}
