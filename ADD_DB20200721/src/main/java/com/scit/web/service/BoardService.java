package com.scit.web.service;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.web.dao.BoardDAO;
import com.scit.web.dao.BoardMapper;
import com.scit.web.vo.BoardVO;

@Service
public class BoardService {
	
	@Autowired
	private BoardDAO dao;
	@Autowired
	private HttpSession session;
	
	public int BoardWrite(BoardVO board) {
		
		//현재 board에는 제목하고 내용만 들어 있어.
		//아이디가 더 필요함.
		
		//member_id를 추가해야한다.
		//session에서 가지고 와야 한다.
		//session에 뭐라고 넣었는 지 알아야 가지고 오니까
		
		//memberService로 간다.
		String member_id = (String)session.getAttribute("loginId");
		board.setMember_id(member_id);
		
		int cnt =dao.boardWrite(board);
		
		
		return cnt;
	}
	public ArrayList<HashMap<String,Object>>boardList(){
	
		ArrayList<HashMap<String,Object>>list = dao.boardList();
		
		return list;
	}
	public HashMap<String,Object>boardRead(int board_no){
		
		 dao.updateHits(board_no);;
		 HashMap<String,Object> map =dao.boardRead(board_no);
		return map;
	}
	public int boardDelete(int board_no) {
		int cnt = dao.boardDelete(board_no);
		return cnt;
	}
	public int boardUpdate(BoardVO board) {
		
		String member_id = (String)session.getAttribute("loginId");
		board.setMember_id(member_id);
		
		int cnt = dao.boardUpdate(board);
		return cnt;
	}
	public ArrayList<HashMap<String,Object>>searchBoard(String searchText,String searchType){
		HashMap<String,Object> map = new HashMap<String,Object>();
		
		map.put("searchText", searchText);
		map.put("searchType", searchType);
		ArrayList<HashMap<String,Object>> list =dao.searchBoard(map);
		return list;
	}
	public BoardVO boardSelectOne(int board_no) {
		
		
		BoardVO board =  dao.boardSelectOne(board_no);
		return board;
	}
	public int boardCount(String searchText,String searchType) {
		HashMap<String,String> map = new HashMap<>();
		
		map.put("searchText", searchText);
		map.put("searchType", searchType);
		int count =dao.boardCount(map);
		
		return count;
	}
}
