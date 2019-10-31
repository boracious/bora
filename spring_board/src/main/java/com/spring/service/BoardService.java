package com.spring.service;

import java.util.List;

import com.spring.vo.BoardVO;

public interface BoardService {
	
	public List<BoardVO> getBoardList() throws Exception;
}