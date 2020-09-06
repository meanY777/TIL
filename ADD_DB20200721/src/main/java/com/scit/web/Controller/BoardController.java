package com.scit.web.Controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.scit.test.util.FileService;
import com.scit.test.util.PageNavigator;
import com.scit.web.service.BoardService;
import com.scit.web.vo.BoardVO;

@Controller
@RequestMapping(value="/board")
public class BoardController {
	private String uploadPath = "/boardFile";
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	private final int COUNTPERPAGE =10;
	private final int PAGEPERGROUP = 5;
	@Autowired
	private HttpSession session;
	@Autowired
	private BoardService bs;
	@RequestMapping(value="/boardList", method= RequestMethod.GET)
	public String boardList(
			@RequestParam(value="page" ,defaultValue="1") int page,
			Model model) {
		String i = "";
		int count = bs.boardCount(i, i);
		PageNavigator navi = new PageNavigator(COUNTPERPAGE,PAGEPERGROUP,page,count);
		
		ArrayList<HashMap<String,Object>> list = bs.boardList();
		model.addAttribute("list", list);
		return "board/boardList";
	}
	@RequestMapping(value="/boardWriteForm", method= RequestMethod.GET)
	public String boardWriteForm() {
		
		return "board/boardWriteForm";
	}
	
	@RequestMapping(value="/boardWrite",method=RequestMethod.POST)
	public String boardWrite(BoardVO board,MultipartFile upload) {
		
		//항상 첨부파일이 있는 것은 아니니까 !
		
		if(!upload.isEmpty()) {
			//파일이 있으면 파일 저장하겠다.
			//static이니까 객체 생성 안하고도 사용 가능.
			//저장되면 리턴으로 저장된 파일 이름이 들어옴.
			String savedfile = FileService.saveFile(upload, uploadPath);
			board.setSavedfile(savedfile);
			board.setOriginalfile(upload.getOriginalFilename());
		}
		
		
		bs.BoardWrite(board);
		
		return "redirect:/board/boardList";
	}
	@RequestMapping(value="/boardRead",method=RequestMethod.GET)
	public String boardRead(int board_no,Model model) {
		HashMap<String,Object> map = bs.boardRead(board_no);
		model.addAttribute("map", map);
		return "board/boardRead";
	}
	@RequestMapping(value="/boardDelete",method=RequestMethod.GET)
	public String boardDelete(int board_no) {
		int cnt = bs.boardDelete(board_no);
		
		if(cnt==0) {
			logger.info("삭제실패:{}",board_no);
		}else {
			logger.info("삭제성공:{}",board_no);
		}
		return "redirect:/board/boardList";
	}
	@RequestMapping(value="/boardUpdateForm",method=RequestMethod.GET)
	public String boardUpdateForm(int board_no,Model model) {
		HashMap<String,Object> map = bs.boardRead(board_no);
		model.addAttribute("map", map);
		
		return "board/boardUpdateForm";
	}
	@RequestMapping(value="/boardUpdate",method=RequestMethod.POST)
	public String boardUpdate(BoardVO board) {
		int cnt = bs.boardUpdate(board);
		
		if(cnt == 0) {
			logger.info("수정실패:{}"+board);
		}else {
			logger.info("수정성공:{}"+board);
		}
		return "redirect:/board/boardList";
	}
	@RequestMapping(value="/searchBoard",method=RequestMethod.GET)
	public String searchBoard(String searchText, String searchType,Model model) {
		
		ArrayList<HashMap<String,Object>> list = bs.searchBoard(searchText, searchType);
		model.addAttribute("list", list);
		
		return "board/boardList";
	}
	@RequestMapping(value = "/download", method = RequestMethod.GET)
	public String fileDownload(int board_no, HttpServletResponse response) {
		
		BoardVO board = bs.boardSelectOne(board_no);
		
		//원래의 파일명
		String originalfile = new String(board.getOriginalfile());
		try {
			response.setHeader("Content-Disposition", " attachment;filename="+ URLEncoder.encode(originalfile, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		//저장된 파일 경로
		String fullPath = uploadPath + "/" + board.getSavedfile();
		
		//서버의 파일을 읽을 입력 스트림과 클라이언트에게 전달할 출력스트림
		FileInputStream filein = null;
		ServletOutputStream fileout = null;
		
		try {
			filein = new FileInputStream(fullPath);
			fileout = response.getOutputStream();
			
			//Spring의 파일 관련 유틸
			FileCopyUtils.copy(filein, fileout);
			
			filein.close();
			fileout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

}
