package com.scit.test.Controller;

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
	@RequestMapping(value="/joinForm",method=RequestMethod.GET)
	public String goToJoinForm() {
		
		return "member/joinForm";
	}
	@RequestMapping(value="/join",method=RequestMethod.POST)
	public String join(MemberVO member) {
		String page = ms.insertMember(member);
		return page;
	}
	@RequestMapping(value="/joinFail",method=RequestMethod.GET)
	public String joinFail() {
		
		return "member/joinFail";
	}
	@RequestMapping(value="/joinClear",method=RequestMethod.GET)
	public String joinClear() {
		
		return "member/joinClear";
	}
	
	@RequestMapping(value="/joinList", method=RequestMethod.GET)
	public String joinList(Model model) {
		
		
		ArrayList<MemberVO> list = ms.selectAllMember();
		model.addAttribute("list", list);
		return"member/joinList";
	}
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String delete(String member_id) {
		ms.deleteMember(member_id);
		
		return "redirect:/member/joinList";
	}
	@RequestMapping(value="/findMember", method=RequestMethod.POST)
	public String update(String min_birth,String max_birth,Model model) {
		
		ArrayList<MemberVO> list = null;
		list =ms.selectForBirth(min_birth, max_birth);
		model.addAttribute("list2", list);
		return "member/findMember";
	}
	@RequestMapping(value="/memberInfo", method=RequestMethod.GET)
	public String OneMemberInfo(String member_id,Model model) {
		MemberVO member=ms.selectOneMember(member_id);
		model.addAttribute("member", member);
		return "member/oneMemberInfo";
	}
	@RequestMapping(value="/updateForm", method=RequestMethod.GET)
	public String updateForm(String member_id,Model model) {
		MemberVO member=ms.selectOneMember(member_id);
		model.addAttribute("member", member);
		return "member/updateForm";
	}
	@RequestMapping(value="/updateMember", method=RequestMethod.POST)
	public String updateMember(MemberVO member,Model model) {
		ms.updateMember(member);
		
		return "redirect:/member/joinList";
	}
	@RequestMapping(value="/loginForm", method=RequestMethod.GET)
	public String loginForm() {
		
		return "member/loginForm";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(MemberVO member) {
		String page =ms.login(member);
		
		return page;
	}
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logout() {
		ms.logout();
		
		return "redirect:/";
	}
}
