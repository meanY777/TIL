package com.scit.test;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
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
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {

		
		return "home";
	}
	@RequestMapping(value="/test1",method=RequestMethod.GET)
	public String test1() {
		
		return "test1";
	}
	@ResponseBody
	@RequestMapping(value="/sendArray" ,method=RequestMethod.POST)
	public void sendArray(String[] arr) {
		logger.info("메서드 실행");
		logger.info("받은 데이터:{}",arr);
		
		if(arr != null) {
			for(String s:arr)
				logger.info("페이지로부터 전달받은 데이터:{}",s);
		}else {
			logger.info("페이지로부터 전달받은 데이터{}",arr);
		}
	}
	@ResponseBody
	@RequestMapping(value="/sendVO", method=RequestMethod.POST)
	public void sendVO(UserVO  user) {
		logger.info("메서드 실행");
		logger.info("받은 데이터:{}",user);	
		
	}
	@ResponseBody
	@RequestMapping(value="/receiveArray", method=RequestMethod.POST)
	public String[] receiveArray( ) {
		logger.info("메서드 실행");
		
		String[] arr = new String[2];
		arr[0] ="adsas";
		arr[1] = "12312";
		return arr;
		
	}
	@ResponseBody
	@RequestMapping(value="/receiveVO", method=RequestMethod.POST)
	public UserVO receiveVO( ) {
		logger.info("메서드 실행");
		UserVO user = new UserVO();
		user.setUserid("231");
		user.setUserpw("231");
		
		return user;
		
	}
	@RequestMapping(value="/test2",method=RequestMethod.GET)
	public String test2() {
		
		return "test2";
	}
	@ResponseBody
	@RequestMapping(value="/sendJSON", method=RequestMethod.POST)
	public void sendJSON(@RequestBody UserVO user) {
		logger.info("메서드 실행");
		logger.info("받은 데이터:{}",user);	
		
	}	
	@ResponseBody
	@RequestMapping(value="/receiveJSON", method=RequestMethod.POST)
	public String[] receiveJSON() {
		logger.info("메서드 실행");
		
		String[] arr = new String[2];
		arr[0] ="adsas";
		arr[1] = "12312";
		
		return arr;	
		
	}
	@ResponseBody
	@RequestMapping(value="/sendList", method=RequestMethod.POST)
	public void sendList(@RequestBody ArrayList<String>list) {
		logger.info("메서드 실행");
		logger.info("받은 데이터:{}",list);	
		
	}
	@ResponseBody
	@RequestMapping(value="/sendMap", method=RequestMethod.POST)
	public void sendMap(@RequestBody HashMap<String,String>map) {
		logger.info("메서드 실행");
		logger.info("받은 데이터:{}",map);	
		
	}
	@ResponseBody
	@RequestMapping(value="/receiveList", method=RequestMethod.POST)
	public ArrayList<String> receiveList() {
		logger.info("메서드 실행");
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("2323");
		list.add("3232");
		return list;
		
	}
	@ResponseBody
	@RequestMapping(value="/receiveMap", method=RequestMethod.POST)
	public HashMap<String,Object>receiveMap() {
		logger.info("메서드 실행");
		
		HashMap<String,Object> map = new HashMap<String,Object>();
		
		map.put("userid", "sdaas");
		map.put("userpw", "23132");
		return map;
		
	}
}
