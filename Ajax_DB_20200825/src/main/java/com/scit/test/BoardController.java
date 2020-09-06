package com.scit.test;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.scit.test.service.BoardService;
import com.scit.test.vo.BoardVO;
import com.scit.test.vo.ReplyVO;

@Controller
@RequestMapping(value="/board")
public class BoardController {
	
	@Autowired
	private BoardService bs;
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	
	@RequestMapping(value="/boardList",method=RequestMethod.GET)
	public String boardList(Model model) {

		ArrayList<BoardVO> list =bs.getBoardList();
		model.addAttribute("list", list);		
		return "boardList";
	}
	@RequestMapping(value="/readBoard",method=RequestMethod.GET)
	public String readBoard(Model model,int boardNum) {

		BoardVO board = bs.getBoard(boardNum);
		model.addAttribute("board", board);
		return "readBoard";
	}
	@ResponseBody
	@RequestMapping(value="/readReply",method=RequestMethod.GET)
	public ArrayList<ReplyVO> readReply(int boardNum) {

		ArrayList<ReplyVO> list = bs.readReplyList(boardNum);
		return list;
	}
}
