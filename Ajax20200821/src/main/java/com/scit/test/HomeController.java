package com.scit.test;


import java.util.ArrayList;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	public ArrayList<String> idList;
	
	public HomeController() {
		
		System.out.println("인스턴스 생성");
		
		idList = new ArrayList<String>();
		idList.add("hong1234");
		idList.add("abcd1234");
		idList.add("aabbcc");
		
	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {

		
		return "home";
	}
	
	@RequestMapping(value="/test1", method = RequestMethod.GET)
	public String test1() {
		
		return "test1";
	}
	
	@ResponseBody
	@RequestMapping(value="/idCheck",method = RequestMethod.GET,produces = "application/text;charset=utf-8;")
	public String idCheck(String id) {
		
		String result = "사용할 수 있는 id입니다.";
		for(int i = 0; i < idList.size(); i++) {
			
			if(id.equals(idList.get(i))) {
				
				result="이미 사용 중인 아이디 입니다";
				break;
			}
		}
		return result;
	}
	
	@RequestMapping(value="/test2", method = RequestMethod.GET)
	public String test2() {
		
		return "test2";
	}
	
	@ResponseBody
	@RequestMapping(value = "/first" , method = RequestMethod.POST)
	public void first( String userId, String userPw) {
		System.out.println(userId);
		System.out.println(userPw);
		
	}
	@ResponseBody
	@RequestMapping(value = "/second" , method = RequestMethod.POST)
	public void second(String[] arr) {
		
		for(String s: arr)
			System.out.println(s);
		
	}
	@ResponseBody
	@RequestMapping(value = "/third" , method = RequestMethod.POST)
	public void third(UserVO user) {
		
		System.out.println(user.getUserID());
		System.out.println(user.getUserPw());
		
	}
	
	@RequestMapping(value="/test3", method = RequestMethod.GET)
	public String test3() {
		
		return "test3";
	}
	@ResponseBody
	@RequestMapping(value = "/fourth" , method = RequestMethod.POST)
	public void fourth(@RequestBody UserVO user) {
		
		System.out.println(user.getUserID());
		System.out.println(user.getUserPw());
		
	}
	@ResponseBody
	@RequestMapping(value = "/fifth" , method = RequestMethod.POST)
	public UserVO fifth() {
		
		return new UserVO("asda","12323");
		
	}
}
