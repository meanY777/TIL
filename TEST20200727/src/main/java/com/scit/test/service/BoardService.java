package com.scit.test.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.test.dao.BoardDAO;
import com.scit.test.vo.BoardVO;

@Service
public class BoardService {
	@Autowired
	private HttpSession session;
	@Autowired
	private BoardDAO dao;
	public int writeBoardForm(BoardVO board) {
		
		String member_id= (String)session.getAttribute("loginId");
		board.setMember_id(member_id);
		
		int cnt = dao.writeBoardForm(board);
		return cnt;
		
	}
}
