package com.springboot.notice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.notice.entity.NoticeVO;
import com.springboot.notice.service.NoticeService;

@Controller
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("/updateNotice.do")
	public String updateNotice(@ModelAttribute("nvo") NoticeVO vo) {		
		noticeService.updateNotice(vo);
		return "getNoticeList.do";
	}
	
	@RequestMapping("/deleteNotice.do")
	public String deleteNotice(NoticeVO vo) {
		noticeService.deleteNotice(vo);
		return "getNoticeList.do";
	}
	
	@RequestMapping(value="/insertNotice.do")
	public String insertNotice(NoticeVO vo) {
		noticeService.insertNotice(vo);
		return "getNoticeList.do";
	}
	
	@RequestMapping("/getNotice.do")
	public String getNotice(NoticeVO vo, Model model){
		model.addAttribute("nvo", noticeService.getNotice(vo));
		return "getNotice.jsp";
	}
	
	@RequestMapping("/getNoticeList.do")
	public String getNoticeList(NoticeVO vo, Model model) {

		model.addAttribute("noticeList", noticeService.getNoticeList(vo));
		return "getNoticeList.jsp";
	}
	
}
