package com.springboot.comment.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.comment.entity.CommentVO;

public interface CommentRepository extends JpaRepository<CommentVO, Integer>{

	@Query(value = "SELECT * FROM BOARD_COMMENT WHERE BOARD_COMMENT.NO = ?1 ORDER BY NO", nativeQuery = true)
	List<CommentVO> findByCommentList(Integer no);
	
	@Query(value = "SELECT COUNT(*) FROM BOARD_COMMENT WHERE BOARD_COMMENT.NO = ?1", nativeQuery = true)
	int countCommentList(Integer no);
}
