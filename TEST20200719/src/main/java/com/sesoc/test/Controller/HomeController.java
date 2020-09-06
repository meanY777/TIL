package com.sesoc.test.Controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sesoc.test.Service.MemberService;
import com.sesoc.test.VO.MemberVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private MemberService ms;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
	
		
		return "home";
	}
	@RequestMapping(value="/member/join" ,method=RequestMethod.GET)
	public String joinForm() {
		
		
		return "member/joinForm";
		
	}
	@RequestMapping(value="/member/list" ,method=RequestMethod.GET)
	public String joinList(Model model) {
		
		ArrayList<MemberVO> l = ms.list;
		model.addAttribute("list", l);
		
		return "member/joinList";
		
	}
	
	@RequestMapping(value="/member/checkJoin" ,method=RequestMethod.POST)
	public String checkJoin(MemberVO member) {
		String page="";
		
		page=ms.memberService(member);
		
		
		return page;
		
	}
	@RequestMapping(value="/member/delete" ,method=RequestMethod.GET)
	public String deleteMember(Model model, String id) {
		
		ms.memberDelete(id);
		ArrayList<MemberVO> l = ms.list;
		model.addAttribute("list", l);
		
		return "member/joinList";
		
	}
	
}
