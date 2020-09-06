package com.scit.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.test.service.BoardService;
import com.scit.test.vo.BoardVO;

@RequestMapping(value="/board")
@Controller
public class BoardController {
	
	@Autowired
	private BoardService bs;
	@RequestMapping(value="/boardList",method=RequestMethod.GET)
	public String goToBoardList() {
		
		return "board/boardList";
	}
	
	@RequestMapping(value="/goToBoardForm",method=RequestMethod.GET)
	public String goToBoardForm() {
		
		return "board/boardForm";
	}
	
	@RequestMapping(value="/boardWrite",method=RequestMethod.POST)
	public String boardWrite(BoardVO board) {
		
		bs.writeBoardForm(board);
		
		return "redirect:/board/boardList";
	}
}
