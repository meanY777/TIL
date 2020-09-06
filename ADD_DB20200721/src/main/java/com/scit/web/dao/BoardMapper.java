package com.scit.web.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.scit.web.vo.BoardVO;

public interface BoardMapper {
	
	public int boardWrite(BoardVO board);
	
	public ArrayList<HashMap<String,Object>>boardList(); 
	
	public void updateHits(int board_no);
	
	public HashMap<String,Object> boardRead(int board_no);
	
	public int boardDelete(int board_no);
	
	public int boardUpdate(BoardVO board);
	
	public ArrayList<HashMap<String,Object>>searchBoard(HashMap<String,Object> map);

	public BoardVO boardSelectOne(int board_no);
	
	public int boardCount(HashMap<String,String> map);
}
