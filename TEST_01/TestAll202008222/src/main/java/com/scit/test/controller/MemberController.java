package com.scit.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.test.service.MemberService;
import com.scit.test.vo.MemberVO;

@RequestMapping(value="/member")
@Controller
public class MemberController {

	@Autowired
	private MemberService ms;
	
	@RequestMapping(value="/joinForm",method=RequestMethod.GET)
	public String joinForm() {
		return "member/joinForm";
		
	}
	@RequestMapping(value="/join",method=RequestMethod.POST)
	public String join(MemberVO member) {
		String page = ms.joinMember(member);
		return page;
		
	}
	@RequestMapping(value="/loginPage",method=RequestMethod.GET)
	public String loginPage() {
		
		return "member/loginPage";
		
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(MemberVO member) {
		
		String page = ms.loginMember(member);
		
		return page;
		
	}
	@RequestMapping(value="/loginOut",method=RequestMethod.GET)
	public String loginOut() {
		
		String page = ms.logOut();
		
		return page;
		
	}
	
}
