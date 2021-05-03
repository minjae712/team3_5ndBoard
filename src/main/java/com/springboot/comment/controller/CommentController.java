package com.springboot.comment.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springboot.comment.entity.CommentVO;
import com.springboot.comment.service.CommentService;

@Controller
@SessionAttributes("Comment")
public class CommentController {
	
	@Autowired
	private CommentService CommentService;
	
	@RequestMapping(value = "/insertComment.do")
	public String insertComment(CommentVO vo) throws IOException {
		CommentService.insertComment(vo);
		return "getBoard.do?no="+vo.getNo();
	}

	@RequestMapping("/updateComment.do")
	public String updateBoard(@ModelAttribute("Comment") CommentVO vo) {
		CommentService.updateComment(vo);
		return "getBoard.jsp";
	}

	@RequestMapping("/deleteComment.do")
	public String deleteBoard(CommentVO vo) {
		CommentService.deleteComment(vo);
		return "getBoard.jsp";
	}

	@RequestMapping("/getComment.do")
	public String getBoard(CommentVO vo, Model model) {
		model.addAttribute("Comment", CommentService.getComment(vo)); 
		return "getBoard.jsp"; 
	}

	@RequestMapping(value ="/getCommentList.do")
	public String getBoardList(CommentVO vo,Model model) {
		List<CommentVO> commentList = CommentService.getCommentList(vo);
		model.addAttribute("CommentList",commentList);
		return "getBoard.jsp";
	}

}
