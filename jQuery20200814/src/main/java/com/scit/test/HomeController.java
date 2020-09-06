package com.scit.test;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		return "home";
	}
	
	@RequestMapping(value="/test1",method =RequestMethod.GET)
	public String test1() {
		
		return "test1";
	}
	@RequestMapping(value="/test2",method =RequestMethod.GET)
	public String test2() {
		
		return "test2";
	}
	@RequestMapping(value="/test3",method =RequestMethod.GET)
	public String test3() {
		
		return "test3";
	}
	@RequestMapping(value="/rensyu1",method =RequestMethod.GET)
	public String rensyu1() {
		
		return "/rensyu1";
	}
}
