package com.spring.dao;

import java.util.List;

import com.spring.vo.BoardVO;

public interface BoardDAO {
	
	public List<BoardVO> getBoardList() throws Exception;
	
	public BoardVO getBoardContent(int id) throws Exception;
	
	public int insertBoard(BoardVO boardVO) throws Exception;
	
	public int updateBoard(BoardVO boardVO) throws Exception;

	public int deleteBoard(int id) throws Exception;
	
	public int updateViewCnt(int id) throws Exception;
}