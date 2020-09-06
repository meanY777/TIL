package com.scit.test.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.scit.test.service.BookService;
import com.scit.test.vo.bookVO;

@RequestMapping(value="/book")
@Controller
public class BookController {
	
	@Autowired
	private BookService bs;
	@RequestMapping(value="/bookList",method=RequestMethod.GET)
	public String bookList(Model model) {
		ArrayList<bookVO> list = bs.selectAllBook();
		model.addAttribute("list", list);
		return"book/bookList";
	}
	@RequestMapping(value="/createBookPage",method=RequestMethod.GET)
	public String createBookPage() {
		
		
		return "book/createBook";
	}
	@RequestMapping(value="/createBook",method=RequestMethod.GET)
	public String createBook(bookVO book) {
		
		String page = bs.bookInsert(book);
		
		return page;
	}
	@RequestMapping(value="/updateBook",method=RequestMethod.GET)
	public String updateBook(int moneybook_no,Model model) {
		
		bookVO book =bs.selectOneBook(moneybook_no);
		model.addAttribute("book", book);
		
		return "book/bookUpdate";
	}
	@RequestMapping(value="/update",method=RequestMethod.GET)
	public String update(bookVO book) {
		
		bs.updateBook(book);
		
		return "redirect:/book/bookList";
	}
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String delete(int moneybook_no) {
		
		bs.deleteBook(moneybook_no);
		
		return "redirect:/book/bookList";
	}
	@RequestMapping(value="/search",method=RequestMethod.GET)
	public String search(String bookType,String searchText,Model model) {
		
		ArrayList<bookVO> list =bs.searchBook(bookType, searchText);
		System.out.println(list);
		model.addAttribute("list", list);
		
		return "book/bookList";
	}
	@ResponseBody
	@RequestMapping(value="/tatalIncome",method=RequestMethod.POST)
	public int tatalIncome() {
		
		int income = bs.tatalIncome();
		
		return income;
	}
	@ResponseBody
	@RequestMapping(value="/tatalOutcome",method=RequestMethod.POST)
	public int tatalOutcome() {
		
		int outcome =bs.tatalOutcome();
		
		return outcome;
	}
	@ResponseBody
	@RequestMapping(value="/min",method=RequestMethod.POST)
	public int min() {
		
		int min =bs.min();
		
		return min;
	}
	@ResponseBody
	@RequestMapping(value="/max",method=RequestMethod.POST)
	public int max() {
		
		int max =bs.max();
		
		return max;
	}
	
}
