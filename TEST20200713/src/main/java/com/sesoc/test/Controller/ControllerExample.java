package com.sesoc.test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/ex")
public class ControllerExample {

	
	@RequestMapping(value="/example1" , method=RequestMethod.GET)
	public String example1(Model model,@RequestParam(value ="name")String name) {
		
		System.out.println(name);
		model.addAttribute("gisu",40);
		System.out.println("예제 1번 요청 확인");
		return "example1/example1";
	}
	
	@RequestMapping(value="/exam", method=RequestMethod.GET)
	public String ex(Model model) {
		
		model.addAttribute("gisu",41);
		System.out.println("예제 2번 요청 확인");
		
		return "example1/example1";
	}
	
}
