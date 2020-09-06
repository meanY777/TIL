package com.scit.test.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.test.dao.BoardDAO;
import com.scit.test.vo.BoardVO;

@Service
public class BoardService {
	
	@Autowired
	private BoardDAO dao;
	@Autowired
	private HttpSession session;
	public String writeBoard(BoardVO board) {
		
		String name=(String)session.getAttribute("loginId");
		board.setMember_id(name);
		
		int cnt =dao.writeBoard(board);
		String page ="";
		
		page ="redirect:/board/boardList";
		
		return page;
	}
}
