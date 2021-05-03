package com.springboot.board.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.board.entity.BoardVO;

public interface BoardRepository extends JpaRepository<BoardVO, Integer>{

}
