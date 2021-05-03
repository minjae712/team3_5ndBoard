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
		return "redirect:getBoard.do?no="+vo.getNo();
	}

	@RequestMapping("/updateComment.do")
	public String updateBoard(@ModelAttribute("Comment") CommentVO vo) {
		CommentService.updateComment(vo);
		return "redirect:getBoard.do?no="+vo.getNo();
	}

	@RequestMapping("/deleteComment.do")
	public String deleteBoard(CommentVO vo) {
		CommentService.deleteComment(vo);
		return "redirect:getBoard.do?no="+vo.getNo();
	}

	@RequestMapping("/getComment.do")
	public String getBoard(CommentVO vo, Model model) {
		model.addAttribute("Comment", CommentService.getComment(vo)); 
		return "redirect:getBoard.do?no="+vo.getNo(); 
	}

	@RequestMapping(value ="/getCommentList.do")
	public String getBoardList(CommentVO vo,Model model) {
		model.addAttribute("count", CommentService.getCommentCount(vo));
		List<CommentVO> commentList = CommentService.getCommentList(vo);
		model.addAttribute("commentList",commentList);
		return "getBoard.jsp";
	}

}
