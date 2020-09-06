package com.scit.web;

import java.text.DateFormat;
import java.util.ArrayList;
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
	public String home(Locale locale, Model model) {
		
		String str1 = "aaa";
		int num1  =20;
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("test1");
		list.add("test2");
		list.add("test3");
		
		ArrayList<memberVO> list2 = new ArrayList<memberVO>();
		
		memberVO m1 = new memberVO();
		m1.setId("id1");
		m1.setPw("pw1");
		m1.setAge(20);
		
		memberVO m2 = new memberVO();
		m2.setId("id1");
		m2.setPw("pw1");
		m2.setAge(20);
		
		memberVO m3 = new memberVO();
		m3.setId("id1");
		m3.setPw("pw1");
		m3.setAge(20);
		
		
		list2.add(m1);
		list2.add(m2);
		list2.add(m3);
		
		model.addAttribute("list2",list2);
		
		model.addAttribute("str" , str1);
		model.addAttribute("num", num1);
		model.addAttribute("list", list);
		
		return "home";
	}
	
	
}
