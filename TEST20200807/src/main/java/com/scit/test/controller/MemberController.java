package com.scit.test.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.scit.test.service.MemberService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.test.vo.MemberVO;

@RequestMapping(value="/member")
@Controller
public class MemberController {

	@Autowired
	private MemberService ms;
	
	@RequestMapping(value="/joinForm",method = RequestMethod.GET)
	public String joinForm() {
		
		return "member/joinForm";
	}
	@RequestMapping(value="/join",method = RequestMethod.POST)
	public String join(MemberVO member) {
		
		String page = ms.insertMember(member);
		
		return page;
	}
	
	@RequestMapping(value="/memberList",method = RequestMethod.GET)
	public String memberList(Model model) {
		 ArrayList<HashMap<String,Object>> list = ms.selectAllMember();
		 model.addAttribute("list", list);
		 
		return "member/memberList";
	}
	
	@RequestMapping(value="/memberInfo",method = RequestMethod.GET)
	public String member(String member_id,Model model) {
		MemberVO member = ms.selectOneMember(member_id);
		model.addAttribute("member", member);
		 
		return "member/memberInfo";
	}
	@RequestMapping(value="/UpdateForm",method = RequestMethod.GET)
	public String updateForm(String member_id,Model model) {
		MemberVO member = ms.selectOneMember(member_id);
		
		model.addAttribute("member", member);
		
		 
		return "member/updateForm";
	}
}
