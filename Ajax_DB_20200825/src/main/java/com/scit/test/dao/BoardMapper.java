package com.scit.test.dao;

import java.util.ArrayList;

import com.scit.test.vo.BoardVO;
import com.scit.test.vo.ReplyVO;

public interface BoardMapper {

	public ArrayList<BoardVO> getBoardList();

	public BoardVO getBoard(int boardNum);

	public ArrayList<ReplyVO> getReplyList(int boardNum);
}
