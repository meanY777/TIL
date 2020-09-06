package com.scit.test.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.test.vo.BoardVO;

@Repository
public class BoardDAO {
	
	@Autowired
	private SqlSession session;
	public int writeBoard(BoardVO board) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		int cnt = 0;
		try {
			cnt= mapper.writeBoard(board);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
}
