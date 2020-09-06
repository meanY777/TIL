package com.scit.test.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.test.dao.BoardDAO;
import com.scit.test.vo.BoardVO;
import com.scit.test.vo.ReplyVO;

@Service
public class BoardService {

	@Autowired
	private BoardDAO dao;
	
	public ArrayList<BoardVO> getBoardList(){
		ArrayList<BoardVO> list = dao.getBoardList();
		return list;
	}

	public BoardVO getBoard(int boardNum) {
		BoardVO board = dao.getBoard(boardNum);
		return board;
	}

	public ArrayList<ReplyVO> readReplyList(int boardNum) {
		ArrayList<ReplyVO> list = dao.getReplyList(boardNum);
		return list;
	}
}
