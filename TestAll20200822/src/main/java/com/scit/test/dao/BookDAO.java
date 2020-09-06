package com.scit.test.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.test.vo.bookVO;

@Repository
public class BookDAO {

	@Autowired
	private SqlSession session;
	
	public int bookInsert(bookVO book) {
		
		BookMapper mapper = session.getMapper(BookMapper.class);
		int cnt = 0;
		try {
			cnt = mapper.bookInsert(book);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
	
	public ArrayList<bookVO> selectAllBook(String member){
		
		BookMapper mapper = session.getMapper(BookMapper.class);
		ArrayList<bookVO> list = null;
		try {
			list = mapper.selectAllBook(member);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;	
	}
	
	public bookVO selectOneBook(int moneybook_no) {
		BookMapper mapper = session.getMapper(BookMapper.class);
		bookVO vo = null;
		try {
			vo = mapper.selectOneBook(moneybook_no);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	
	public void updateBook(bookVO book) {
		BookMapper mapper = session.getMapper(BookMapper.class);
		
		try {
			mapper.updateBook(book);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void deleteBook(int moneybook_no) {
		BookMapper mapper = session.getMapper(BookMapper.class);
		
		try {
			mapper.deleteBook(moneybook_no);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public ArrayList<bookVO> searchBook(HashMap<String,String>map){
		System.out.println(map);
		BookMapper mapper = session.getMapper(BookMapper.class);
		ArrayList<bookVO> list = null;
		try {
			list =mapper.searchBook(map);
		}catch(Exception e) {
			e.printStackTrace();
		}	
		return list;
	}
	public int tatalIncome(String member) {
		BookMapper mapper = session.getMapper(BookMapper.class);
		int income=0;
		try {
			 income =mapper.tatalIncome(member);
		}catch(Exception e) {
			e.printStackTrace();
		}	
		return income;
	}
	public int tatalOutcome(String member) {
		BookMapper mapper = session.getMapper(BookMapper.class);
		int income=0;
		try {
			 income =mapper.tatalOutcome( member);
		}catch(Exception e) {
			e.printStackTrace();
		}	
		return income;	
	}
	public int min(String member) {
		BookMapper mapper = session.getMapper(BookMapper.class);
		int min=0;
		try {
			min =mapper.min( member);
		}catch(Exception e) {
			e.printStackTrace();
		}	
		return min;	
	}
	public int max(String member) {
		BookMapper mapper = session.getMapper(BookMapper.class);
		int max=0;
		try {
			max =mapper.max( member);
		}catch(Exception e) {
			e.printStackTrace();
		}	
		return max;	
	}
}
