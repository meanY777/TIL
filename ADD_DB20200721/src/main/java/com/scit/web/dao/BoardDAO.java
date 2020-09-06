package com.scit.web.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.web.vo.BoardVO;

@Repository
public class BoardDAO {

	@Autowired
	private SqlSession session;
	
	public int boardWrite(BoardVO board) {
		
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		int cnt = 0;
		
		try {
			cnt = mapper.boardWrite(board);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return cnt;
	}
	public ArrayList<HashMap<String,Object>>boardList(){
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		ArrayList<HashMap<String,Object>>list = null;
		
		try {
			list = mapper.boardList();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public void updateHits(int board_no) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		
		try {
			mapper.updateHits(board_no);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	public HashMap<String,Object> boardRead(int board_no){
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		HashMap<String,Object> map = null;
		try {
			map = mapper.boardRead(board_no);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return map;
	}
	public int boardDelete(int board_no){
		
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		int cnt =0;
		try {
			cnt = mapper.boardDelete(board_no);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
	public int boardUpdate(BoardVO board) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		int cnt =0;
		try {
			cnt = mapper.boardUpdate(board);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
	public ArrayList<HashMap<String,Object>>searchBoard(HashMap<String,Object> map){
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		ArrayList<HashMap<String,Object>> list = null;
		
		try {
			list = mapper.searchBoard(map);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}
	public BoardVO boardSelectOne(int board_no) {
		
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		BoardVO board = null;
		try {
			board = mapper.boardSelectOne(board_no);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return board;
	}
	public int boardCount(HashMap<String,String> map) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		int count = 0;
		try {
			count = mapper.boardCount(map);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return count;
	}
}
