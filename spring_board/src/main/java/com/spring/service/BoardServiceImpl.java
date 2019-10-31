package com.spring.service;

import java.util.List;

import javax.inject.Inject; 

import org.springframework.stereotype.Service; 

import com.spring.dao.BoardDAO; 
import com.spring.vo.BoardVO; 

@Service
public class BoardServiceImpl implements BoardService {
	
	@Inject
	private BoardDAO boardDAO;
	
	public List<BoardVO> getBoardList() throws Exception {
		
		return boardDAO.getBoardList();
	}
}