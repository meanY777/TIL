package com.scit.test.Controller;

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
	
	@RequestMapping(value="/boardList", method=RequestMethod.GET)
	public String goToBoardList() {
		
//		나중에 리스트 가지고 갈 것.
		return "board/boardList";
	}
	@RequestMapping(value="/goToBoardWriteForm", method=RequestMethod.GET)
	public String goToBoardWriteList() {
		

		return "board/boardWriteForm";
	}
	@RequestMapping(value="/boardWrite", method=RequestMethod.POST)
	public String BoardWrite(BoardVO board) {
		 String page = bs.writeBoard(board);
		return page;

	}
}
