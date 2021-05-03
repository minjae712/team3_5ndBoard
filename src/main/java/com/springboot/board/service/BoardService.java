package com.springboot.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.board.entity.BoardVO;
import com.springboot.board.persistence.BoardRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BoardService {
	
	private final BoardRepository boardRepository;
	
	public void updateBoard(BoardVO vo) {
		BoardVO board = boardRepository.findById(vo.getSeq())
				.orElseThrow(() -> new IllegalAccessError("해당 번호 게시글이 없습니다."));
		board.setContent(vo.getContent());
		boardRepository.save(board);
	}

	public void deleteBoard(BoardVO vo) {
		boardRepository.deleteById(vo.getSeq());
	}	

	public void insertBoard(BoardVO vo) {
		boardRepository.save(vo);
	}
	
	public BoardVO getBoard(BoardVO vo) {
		BoardVO board = boardRepository.findById(vo.getSeq())
				.orElseThrow(() -> new IllegalAccessError("해당 번호 게시글이 없습니다."));
		return board;
	}

	public List<BoardVO> getBoardList(BoardVO vo) {
		List<BoardVO> boardList = boardRepository.findAll();
		return boardList;
	}
	
}	
