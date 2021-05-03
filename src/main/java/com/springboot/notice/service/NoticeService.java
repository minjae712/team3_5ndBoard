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
		NoticeVO board = noticeRepository.findById(vo.getSeq())
				.orElseThrow(() -> new IllegalAccessError("해당 번호 게시글이 없습니다."));
		board.setContent(vo.getContent());
		noticeRepository.save(board);
	}

	public void deleteNotice(NoticeVO vo) {
		noticeRepository.deleteById(vo.getSeq());
	}	

	public void insertNotice(NoticeVO vo) {
		noticeRepository.save(vo);
	}
	
	public NoticeVO getNotice(NoticeVO vo) {
		NoticeVO board = noticeRepository.findById(vo.getSeq())
				.orElseThrow(() -> new IllegalAccessError("해당 번호 게시글이 없습니다."));
		return board;
	}

	public List<NoticeVO> getNoticeList(NoticeVO vo) {
		List<NoticeVO> boardList = noticeRepository.findAll();
		return boardList;
	}
	
}	
