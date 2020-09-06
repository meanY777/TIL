package com.scit.test.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.scit.test.vo.bookVO;

public interface BookMapper {

	public int bookInsert(bookVO book);
	
	public ArrayList<bookVO> selectAllBook(String member);
	
	public bookVO selectOneBook(int moneybook_no);
	
	public void updateBook(bookVO book);
	
	public void deleteBook(int moneybook_no);
	
	public ArrayList<bookVO> searchBook(HashMap<String,String>map);
	
	public int tatalIncome(String member);
	public int tatalOutcome(String member);
	public int min(String member);
	public int max(String member);
	
}
