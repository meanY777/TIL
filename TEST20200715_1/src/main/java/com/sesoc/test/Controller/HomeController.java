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
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private MemberService memberService;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		
		return "home";
	}
	
	@RequestMapping(value="/loginForm", method= RequestMethod.GET)
	public String loginForm() {
		
		return "member/loginForm";
	}
	
	@RequestMapping(value="/loginOrNot", method=RequestMethod.POST)
	public String loginOrNot(MemberVO member) {
		System.out.println("여기는 가능?1");
		String page = memberService.memberJoin(member);
		
		return page;
		
	}
	
}
