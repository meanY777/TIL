package com.scit.test.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.scit.test.service.MemberService;
import com.scit.test.vo.MemberVO;

@RequestMapping(value="/member")
@Controller
public class MemberController {
	
	@Autowired
	private MemberService ms;
	@RequestMapping(value="/joinForm", method =RequestMethod.GET)
	public String joinForm() {
		
		return "member/joinForm";
	}
	
	@RequestMapping(value="/join" , method = RequestMethod.POST)
	public String join(MemberVO member) {
		
		String page = ms.insertMember(member);
		
		return page;
	}
	@RequestMapping(value="/loginForm" , method = RequestMethod.GET)
	public String loginPage() {
		
		
		return "member/loginPage";
	}
	@RequestMapping(value="/login" , method = RequestMethod.POST)
	public String login(MemberVO member) {
		
		String page = ms.login(member);
		
		return page;
	}

	@RequestMapping(value="/memberList", method = RequestMethod.GET)
	public String memberList(Model model) {
	
		ArrayList<MemberVO> list = ms.selectAllMember(); 
		model.addAttribute("list", list);
		return "member/memberList";
	}
	
	@RequestMapping(value="/memberDelete", method = RequestMethod.GET)
	public String memberDelete(String member_id) {
		
		ms.deleteMember(member_id);
		
		return "redirect:/member/memberList";
	}
	
	@RequestMapping(value="/memberInfo", method = RequestMethod.GET)
	public String memberInfo(String member_id,Model model) {
		
		MemberVO member = ms.selectOneMember(member_id);
		
		model.addAttribute("member", member);
		
		return "member/memberInfo";
	}
	@RequestMapping(value="/updateForm", method = RequestMethod.GET)
	public String updateForm(String member_id,Model model) {
		
		MemberVO member = ms.selectOneMember(member_id);
		model.addAttribute("member", member);
		
		return "member/updateForm";
		
	}
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public String update(MemberVO member) {
		
		System.out.println(member);
		ms.updateMember(member);
			
		return "redirect:/member/memberList";
		
	}
	
	@RequestMapping(value="/logout" , method = RequestMethod.GET)
	public String login() {
	
		ms.logout();
		
		return "redirect:/";
	}
	
	@RequestMapping(value="/search" , method = RequestMethod.GET)
	public String search(String mindate, String maxdate,Model model) {
		
		ArrayList<MemberVO> list = ms.searchMember(mindate, maxdate);
		model.addAttribute("list", list);
		return "member/memberList";
	
	}
	
	
	
}
