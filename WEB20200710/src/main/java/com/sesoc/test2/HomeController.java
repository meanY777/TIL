package com.sesoc.test2;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		return "home";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(){
		
		
		return "login";
	}
	
	@RequestMapping(value="/loginvalue",method=RequestMethod.POST )
	public String loginCheck(MemberVO member) {
		
			System.out.println(member);
			
			return "seikou";
	}
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home2() {
		
		return "home";
	}

}
