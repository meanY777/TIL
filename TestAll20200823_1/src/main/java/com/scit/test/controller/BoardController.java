package com.scit.test.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.scit.test.service.BoardService;
import com.scit.test.vo.BoardVO;

@RequestMapping(value="/board")
@Controller
public class BoardController {

	@Autowired
	private BoardService bs;
	
	@RequestMapping(value="/boardList",method=RequestMethod.GET)
	public String BoardList(@RequestParam(value="searchType",defaultValue ="none")String searchType
							,@RequestParam(value="searchText",defaultValue="none")String searchText
							,Model model) {
		
		ArrayList<HashMap<String,Object>>list = bs.selectAllBoard(searchType,searchText);
		model.addAttribute("list", list);
		
		return "board/boardList";
	}
	@RequestMapping(value="/boardInfo",method=RequestMethod.GET)
	public String boardInfo(int board_no,Model model) {
		
		bs.updateHits(board_no);
		HashMap<String,Object>  board = bs.selectOneBoard(board_no);
		
		model.addAttribute("board", board);
		
		return "board/boardInfo";
	}
	@RequestMapping(value="/writeBoard",method=RequestMethod.GET)
	public String writeBoard() {
		
		return"board/boardWrite";
	}
	@RequestMapping(value="/uploadBoard",method=RequestMethod.POST)
	public String uploadBoard(String board_title, String board_context) {
		
		bs.writeBoard(board_title,board_context);
		
		return"redirect:/board/boardList";
	}
	@RequestMapping(value="/updateForm",method=RequestMethod.GET)
	public String updateForm(int board_no,Model model) {
		
		HashMap<String,Object> map= bs.selectOneBoard(board_no);
		model.addAttribute("board", map);
		
		return"board/boardUpdate";
	}
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update(BoardVO board) {
		
		bs.updateBoard(board);
	
		
		return"redirect:/board/boardList";
	}
	@ResponseBody
	@RequestMapping(value="/searchText",method=RequestMethod.POST)
	public String searchText(String str) {
		
		
	
		
		return"";
	}
	
}
