package com.scit.test.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.scit.test.vo.BoardVO;

public interface BoardMapper {
	
	public ArrayList<HashMap<String,Object>> selectAllBoard(HashMap<String,String>map);
	
	public  HashMap<String,Object>  selectOneBoard(int board_no);
	
	public void updateHits(int board_no);
	
	public void writeBoard(HashMap<String,Object>map);
	
	public void updateBoard(BoardVO board);
}
