package com.springboot.comment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.comment.entity.CommentVO;
import com.springboot.comment.persistence.CommentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommentService{

	private final CommentRepository CommentRepository;
	
	public void insertComment(CommentVO vo) {
		CommentRepository.save(vo);
	}

	public void updateComment(CommentVO vo) {
		CommentVO comment = CommentRepository.findById(vo.getComment_no()).orElseThrow(() -> new IllegalAccessError("해당 게시글이 존재하지 않습니다."));
		comment.setContent(vo.getContent());
		comment.setRegDate(vo.getRegDate());
		CommentRepository.save(comment);
	}

	public void deleteComment(CommentVO vo) {
		CommentRepository.deleteById(vo.getComment_no());
	}

	public CommentVO getComment(CommentVO vo) {
		return CommentRepository.findById(vo.getNo()).orElseThrow(() -> new IllegalAccessError("해당 게시글이 존재하지 않습니다."));
	}

	public List<CommentVO> getCommentList(CommentVO vo){
		List<CommentVO> commentList = CommentRepository.findByCommentList(vo.getNo());
		return commentList;
	}
	
	public int getCommentCount(CommentVO vo) {
		return CommentRepository.countCommentList(vo.getNo());
	}
}
