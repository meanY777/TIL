package com.scit.test.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.test.service.MemberService;
import com.scit.test.vo.FindMember;
import com.scit.test.vo.MemberVO;

@RequestMapping(value="/member")
@Controller
public class MemberController {
	
	@Autowired
	private MemberService ms;
	
	@RequestMapping(value="/joinForm", method= RequestMethod.GET)
	public String joinForm() {
		
		return "member/joinForm";
	}
	
	@RequestMapping(value="/insertMember", method= RequestMethod.POST)
	public String insertMember(MemberVO member) {
		
		String page= ms.insertMember(member);
		
		return page;
	}
	@RequestMapping(value="/joinFail", method= RequestMethod.GET)
	public String joinFail() {
		
		return "member/joinFail";
	}
	@RequestMapping(value="/joinClear", method= RequestMethod.GET)
	public String joinClear() {
		
		return "member/joinClear";
	}
	
	@RequestMapping(value="/joinList", method=RequestMethod.GET)
	public String selectMember(Model model) {
		
		ArrayList<MemberVO> list = null;
		
		list = ms.selectMember();
		
		model.addAttribute("list", list);
		
		return "member/joinList";
		
	}
	
	@RequestMapping(value="/delete", method= RequestMethod.GET)
	public String memberDelete(String member_id) {
		
		String page = ms.deleteMember(member_id);
		return page;
	}
	
	@RequestMapping(value="/deleteFail", method= RequestMethod.GET)
	public String deletefail() {
		
		return "member/deleteFail";
	}
	
	@RequestMapping(value="/findMember", method= RequestMethod.POST)
	public String findMember(FindMember find,Model model) {
		
		ArrayList<MemberVO> list2 =null;
		list2 =ms.findMember(find);
		model.addAttribute("list2", list2);
		
		return "member/findList";
	}
	
	
}
