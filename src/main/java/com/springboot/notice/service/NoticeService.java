package com.springboot.notice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.board.entity.BoardVO;
import com.springboot.board.persistence.BoardRepository;
import com.springboot.notice.entity.NoticeVO;
import com.springboot.notice.persistence.NoticeRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class NoticeService {
	
	private final NoticeRepository noticeRepository;
	
	public void updateNotice(NoticeVO vo) {
		NoticeVO notice = noticeRepository.findById(vo.getUni())
				.orElseThrow(() -> new IllegalAccessError("해당 번호 게시글이 없습니다."));
		notice.setContent(vo.getContent());
		noticeRepository.save(notice);
	}

	public void deleteNotice(NoticeVO vo) {
		noticeRepository.deleteById(vo.getUni());
	}	

	public void insertNotice(NoticeVO vo) {
		noticeRepository.save(vo);
	}
	
	public NoticeVO getNotice(NoticeVO vo) {
		NoticeVO notice = noticeRepository.findById(vo.getUni())
				.orElseThrow(() -> new IllegalAccessError("해당 번호 게시글이 없습니다."));
		return notice;
	}

	public List<NoticeVO> getNoticeList(NoticeVO vo) {
		List<NoticeVO> noticeList = noticeRepository.findAll();
		return noticeList;
	}
	
}	
