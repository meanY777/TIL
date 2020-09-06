package com.sesoc.test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/ex")
public class ExampleController {

	@RequestMapping(value="/example1",method=RequestMethod.GET)
	public String example1(Model model, String name) {
		model.addAttribute("gisu2",40);
		System.out.println(name);
		System.out.println("예제 1번 요청 확인");
		
		return "example/example1";
	}
	@RequestMapping(value="/example2",method=RequestMethod.GET)
	public String example2(Model model) {
		model.addAttribute("gisu2",40);
		System.out.println("예제 1번 요청 확인");
		
		return "example/example1";
	}
	@RequestMapping(value="/example3",method=RequestMethod.GET)
	public String example3(Model model) {
		model.addAttribute("gisu2",40);
		System.out.println("예제 1번 요청 확인");
		
		return "example/example1";
	}
}
