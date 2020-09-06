package com.scit.test.service;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.test.dao.BookDAO;
import com.scit.test.dao.BookMapper;
import com.scit.test.vo.bookVO;

@Service
public class BookService {

	@Autowired
	private BookDAO dao; 
	@Autowired
	private HttpSession session;
	public String bookInsert(bookVO book) {
		
		String acc_id1 = (String)session.getAttribute("loginId");
		book.setAcc_id(acc_id1);
		int cnt =dao.bookInsert(book);
		
		String page ="redirect:/book/bookList";
		
		if(cnt ==0) {
			
			page="redirect:/book/createBookPage";
		}
		
		return page;
	}
	public ArrayList<bookVO> selectAllBook(){
		
		String member = (String)session.getAttribute("loginId");
		ArrayList<bookVO> list = dao.selectAllBook(member);
		
	
		return list;	
	}
	public bookVO selectOneBook(int moneybook_no) {
		bookVO vo =  dao.selectOneBook(moneybook_no);
	
		return vo;
	}
	public void updateBook(bookVO book) {
	
			dao.updateBook(book);
	
	}
	public void deleteBook(int moneybook_no) {
	
			dao.deleteBook(moneybook_no);

		
	}
	public ArrayList<bookVO> searchBook(String bookType,String searchText){
		String acc_id1 = (String)session.getAttribute("loginId");
		HashMap<String,String> map = new HashMap<>();
		map.put("bookType", bookType);
		map.put("searchText", searchText);
		map.put("acc_id1",acc_id1);
		
		ArrayList<bookVO> list =dao.searchBook(map);
		
		return list;
	}
	public int tatalIncome() {
		
		String member = (String)session.getAttribute("loginId");
		int income=dao.tatalIncome(member);
		
		return income;
	}
	public int tatalOutcome() {
		
		String member = (String)session.getAttribute("loginId");
		int income=dao.tatalOutcome(member);
		
		return income;
	}
	public int min() {
		String member = (String)session.getAttribute("loginId");
		int min=dao.min(member);
	
		return min;	
	}
	public int max() {
		String member = (String)session.getAttribute("loginId");
		int max=dao.max(member);
		
		return max;	
	}
}
