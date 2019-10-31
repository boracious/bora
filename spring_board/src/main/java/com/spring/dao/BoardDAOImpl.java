package com.spring.dao;

import java.util.List;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.vo.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	@Override
	public List<BoardVO> getBoardList() throws Exception {
		return sqlSession.selectList("com.spring.mappers.boardMapper.getBoardList");
	}
	
	@Override
	public BoardVO getBoardContent(int id) throws Exception {
		return sqlSession.selectOne("com.spring.mappers.boardMapper.getBoardContent", id);
	}
	
	@Override
	public int insertBoard(BoardVO boardVO) throws Exception {
		return sqlSession.insert("com.spring.mappers.boardMapper.insertBoard", boardVO);
	}

	@Override
	public int updateBoard(BoardVO boardVO) throws Exception {
		return sqlSession.update("com.spring.mappers.boardMapper.updateBoard", boardVO);
	}
	
	@Override
	public int deleteBoard(int id) throws Exception {
		return sqlSession.delete("com.spring.mappers.boardMapper.deleteBoard", id);
	}
	
	@Override
	public int updateViewCnt(int id) throws Exception {
		return sqlSession.update("com.spring.mappers.boardMapper.updateViewCnt", id);
	}
	
}