package com.scit.test;

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
	@RequestMapping(value="/test1", method = RequestMethod.GET)
	public String test1() {
		
		return "test1";
		
	}
	@RequestMapping(value="/test2", method = RequestMethod.GET)
	public String test2() {
		
		return "test2";
		
	}	
	@RequestMapping(value="/test3", method = RequestMethod.GET)
	public String test3() {
		
		return "test3";
		
	}
	
	@RequestMapping(value="/join", method = RequestMethod.GET)
	public String join(String user_id,String user_pw,String gender,String hobby) {
		
		System.out.println(user_id);
		System.out.println(user_pw);
		System.out.println(gender);
		System.out.println(hobby);
		
		return "test2";
		
	}
	
}
