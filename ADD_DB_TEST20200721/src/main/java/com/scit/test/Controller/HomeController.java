package com.scit.test.Controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.test.service.MemberService;
import com.scit.test.vo.MemberVO;

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
	@RequestMapping(value = "/member/joinForm", method = RequestMethod.GET)
	public String joinForm() {
	
		
		return "member/joinMember";
	}
	@RequestMapping(value = "/checkJoin", method = RequestMethod.POST)
	public String checkJoin(MemberVO member) {
		
		
		String page = ms.memberJoin(member);
		return "redirect:"+page;
	}
	@RequestMapping(value = "/member/joinFail", method = RequestMethod.GET)
	public String joinFail() {
		
		
		
		return "member/joinFail";
	}
	@RequestMapping(value = "/member/joinClear", method = RequestMethod.GET)
	public String joinClear() {
		
		
		return "member/joinClear";
	}
	
	
}
