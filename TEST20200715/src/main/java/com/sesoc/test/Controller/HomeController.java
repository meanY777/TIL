package com.sesoc.test.Controller;

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

import com.sesoc.test.Service.MemberService;
import com.sesoc.test.VO.MemberVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private MemberService memberService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		
		
		return "home";
	}
	
	@RequestMapping(value = "/member/form", method = RequestMethod.GET)
	public String memberJoin() {
		
		System.out.println("회원 가입 폼 이동");
		
		return "member/joinForm";
	}
	
	@RequestMapping(value = "/member/join", method = RequestMethod.POST)
	
	public String memberJoinClear(MemberVO member) {
		
		String page = memberService.memberJoin(member);
		
		return page;
		
	}
	
}
