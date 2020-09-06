package com.scit.test.service;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.test.dao.BoardDAO;
import com.scit.test.dao.BoardMapper;
import com.scit.test.vo.BoardVO;
@Service
public class BoardService {
	
	@Autowired
	private BoardDAO dao;
	@Autowired
	private HttpSession session;
	public ArrayList<HashMap<String,Object>> selectAllBoard(String searchType,String searchText){
		
		HashMap<String ,String> map = new HashMap<>();
		map.put("searchType", searchType);
		map.put("searchText", searchText);
		ArrayList<HashMap<String,Object>>list = dao.selectAllBoard(map);
		
		return list;
		
	}
	
	public HashMap<String,Object>  selectOneBoard(int board_no) {
		
		 HashMap<String,Object>  board = dao.selectOneBoard(board_no);
		
		return board;
				
	}
	
	public void updateHits(int board_no) {

		dao.updateHits(board_no);

	}
	public void writeBoard(String board_title, String  board_context) {
		
		HashMap<String,Object> map = new HashMap<String,Object>();
		String member_id = (String)session.getAttribute("loginId");
		map.put("board_title", board_title);
		map.put("board_context",board_context);
		map.put("member_id",member_id);
		
		dao.writeBoard(map);
		
		
		
	}
	public void updateBoard(BoardVO board) {
	
	
		dao.updateBoard(board);
		
	}
}
