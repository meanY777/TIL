package com.scit.test.controller;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.test.dao.MemberMapper;
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
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insertMember(MemberVO member) {
		String page = ms.insertMember(member);
		return page;
	}
	@RequestMapping(value="/joinFail", method=RequestMethod.GET)
	public String loginFail() {
		
		return "member/joinFail";
	}
	@RequestMapping(value="/joinClear", method=RequestMethod.GET)
	public String loginClear() {
		
		return "member/joinClear";
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String memberList(Model model,HttpSession session) {
		
		
		
		String loginId = (String)session.getAttribute("loginId");
		
		String page ="";
		
		if(loginId != null) {
			ArrayList<MemberVO> list= ms.selectAllMember();
			model.addAttribute("list", list);
			page=  "member/memberList";
		}else {
			page="redirect:/member/loginForm";
		}
		
		return page;
		
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String memberList(String member_id) {
		
		int cnt =ms.deleteMember(member_id);
		
		return "redirect:/member/list";
	}
	@RequestMapping(value="/findMember", method=RequestMethod.POST)
	public String findMember(String min_birth,String max_birth,Model model) {
		
		ArrayList<MemberVO> list2 = ms.findMember(min_birth, max_birth);
		
		model.addAttribute("list2", list2);
		
		return "member/memberFind";
	}
	@RequestMapping(value="/showInfo",method = RequestMethod.GET)
	public String showInfo(String member_id,Model model) {
		MemberVO member = ms.showInfo(member_id);
		model.addAttribute("selectedMember", member);
		
		return "member/showInfo";
	}
	@RequestMapping(value="/updateMember", method =RequestMethod.GET)
	public String memberUpdate(String member_id,Model model) {
		
		MemberVO member = ms.showInfo(member_id);
		model.addAttribute("member", member);
		
		return "member/updatePage";
	}
	@RequestMapping(value="/update", method =RequestMethod.GET)
	public String updatedMember(String member_id,Model model) {
		
		
		MemberVO member = ms.showInfo(member_id);
		model.addAttribute("member", member);
		return "member/updatePage";
	}
	@RequestMapping(value="/update2", method =RequestMethod.POST)
	public String updatedMember2(MemberVO member) {
		
		ms.updateMember(member);
		
		return "redirect:/member/list";
	}
	
	@RequestMapping(value="/loginForm",method=RequestMethod.GET)
	public String memberLoginForm() {
		
		return"member/memberLoginForm";
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String memberLogin(MemberVO member) {
	
		String page = ms.memberLogin(member);
		return page;
	}
	@RequestMapping(value="/logout" ,method= RequestMethod.GET)
	public String memberLogout() {
		ms.memberLogout();
		
		return "redirect:/";
	}
	
}
