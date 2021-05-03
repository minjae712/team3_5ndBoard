package com.springboot.notice.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.board.entity.BoardVO;
import com.springboot.notice.entity.NoticeVO;

public interface NoticeRepository extends JpaRepository<NoticeVO, Integer>{

}
