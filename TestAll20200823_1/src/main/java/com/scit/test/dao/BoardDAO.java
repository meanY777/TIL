package com.scit.test.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.test.vo.BoardVO;

@Repository
public class BoardDAO {
	
	@Autowired
	private SqlSession session;
	
	public ArrayList<HashMap<String,Object>> selectAllBoard(HashMap<String,String>map){
		
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		ArrayList<HashMap<String, Object>> list = null;
		try {
			list = mapper.selectAllBoard(map);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public  HashMap<String,Object>  selectOneBoard(int board_no) {
		
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		 HashMap<String,Object>  board = null;
		try {
			board = mapper.selectOneBoard(board_no);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return board;		
	}
	
	public void updateHits(int board_no) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		 
		try {
			 mapper.updateHits(board_no);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	public void writeBoard(HashMap<String,Object>map) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		
		try {
			mapper.writeBoard(map);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void updateBoard(BoardVO board) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);	
		try {
			mapper.updateBoard(board);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
