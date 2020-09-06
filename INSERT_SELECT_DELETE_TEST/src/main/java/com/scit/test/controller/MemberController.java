package com.scit.test.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.test.service.MemberService;
import com.scit.test.vo.MemberVO;

@RequestMapping(value="/member")
@Controller
public class MemberController {

	@Autowired
	private MemberService ms;
	
	@RequestMapping(value="/joinForm", method=RequestMethod.GET)
	public String loginForm() {
		
		return "member/joinForm";
	}
	
	@RequestMapping(value="/checkJoin", method=RequestMethod.POST)
	public String checkLogin(MemberVO member) {
		
		String page = ms.insertMember(member);
		
		return page;
	}
	@RequestMapping(value="/joinFail", method=RequestMethod.GET)
	public String joinFail() {
		
		return "member/joinFail";
	}
	
	@RequestMapping(value="/joinClear", method=RequestMethod.GET)
	public String joinClear() {
		
		return "member/joinClear";
	}
	@RequestMapping(value="/select", method=RequestMethod.GET)
	public String memberList(Model model) {
		
		ArrayList<MemberVO> list=null;
		
		list = ms.selectMember();
		
		model.addAttribute("list", list);
		
		return "member/memberList";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String delete(String member_id) {
		
		String page = ms.deleteMember(member_id);
		
		return page;
	}
	
}
