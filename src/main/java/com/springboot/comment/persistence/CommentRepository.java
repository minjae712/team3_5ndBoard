package com.springboot.comment.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.comment.entity.CommentVO;

public interface CommentRepository extends JpaRepository<CommentVO, Integer>{

	List<CommentVO> findAllById(int no);
	
}
