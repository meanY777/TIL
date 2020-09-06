package com.scit.test;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	public ArrayList<String> list ;
	public HomeController() {
		
		logger.info("인스턴스 생성");
		list = new ArrayList<String>();
		list.add("hong1234");
		list.add("abcd1234");
		list.add("aabbcc");
		
	}
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		return "home";
	}
	
	@RequestMapping(value="/test1",method = RequestMethod.GET)
	public String test1() {
		
		return "test1";
	}	
	@ResponseBody
	@RequestMapping(value="/first",method = RequestMethod.GET)
	public String first() {
		
		logger.info("통신성공");
		return "test1";
	}
	@ResponseBody
	@RequestMapping(value="/second",method=RequestMethod.GET)
	public void second(String msg) {
		logger.info("통신 성공");
		logger.info(msg);
		
	}
	
	@ResponseBody
	@RequestMapping(value="/third",method=RequestMethod.GET,produces ="application/text;charset=utf-8")
	public String third() {
		
		return "안녕하세요????";
	}
	
	@ResponseBody
	@RequestMapping(value="/fourth", method = RequestMethod.POST,produces="application/text;charset=utf-8")
	public String fourth(String msg) {
		
		logger.info(msg+"잘 왔네용");
		
		return msg;
	}
	
	@ResponseBody
	@RequestMapping(value="/fifth",method=RequestMethod.POST,produces="application/text;charset=utf-8")
	public String fifth() {
		
		return "다시만나요 !";
	}
	
	@ResponseBody
	@RequestMapping(value="/sixth",method=RequestMethod.GET, produces="application/text;charset=utf-8")
	public String sixth() {
		
		return "다른 방법으로도 정보를 처리할 수 있지";
	}
	
	@RequestMapping(value="/test2",method = RequestMethod.GET)
	public String test2() {
		
		return "test2";
	}	
	@ResponseBody
	@RequestMapping(value="/idCheck",method=RequestMethod.GET,produces="application/text;charset=utf-8")
	public String idCheck(String id) {
		
		String result = "사용할 수 있는 아이디입니다.";
		for(int i=0;i<list.size();i++) {
			
			if(id.equals(list.get(i))) {
				result="사용할 수 없는 아이디입니다.";
				break;
			}
		}
		return result;
			
	}
	@RequestMapping(value="/test3",method = RequestMethod.GET)
	public String test3() {
		
		return "test3";
	}
	@ResponseBody
	@RequestMapping(value="/first",method=RequestMethod.POST)
	public void first(String id,String pw) {
		
		logger.info(id);
		logger.info(pw);
		
	}
	@ResponseBody
	@RequestMapping(value="/second",method=RequestMethod.POST)
	public void second(String[]arr) {
		
		logger.info(arr[0]);
		logger.info(arr[1]);
	}
	@ResponseBody
	@RequestMapping(value="/third",method=RequestMethod.POST)
	public void third(UserVO vo) {
		
		System.out.println(vo.getId());
		System.out.println(vo.getPw());
		
	}
	@ResponseBody
	@RequestMapping(value="/fourth",method=RequestMethod.POST)
	public void fourth(UserVO vo) {
		
		System.out.println(vo.getId());
		System.out.println(vo.getPw());
	}
	@ResponseBody
	@RequestMapping(value="/fifth",method=RequestMethod.POST)
	public String fifth(@RequestBody UserVO vo) {
		
		System.out.println(vo.getId());
		System.out.println(vo.getPw());	
		
		return "1111";
	}
}
