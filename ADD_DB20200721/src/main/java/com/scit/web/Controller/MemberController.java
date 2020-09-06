package com.scit.web.Controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.web.service.MemberService;
import com.scit.web.vo.MemberVO;



@Controller
@RequestMapping(value="/member")
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberService ms;
	
	//컨트롤러에서는 직접 매개변수로 넣어줘도 의존성주입가능
	@Autowired
	private HttpSession session;
	
	@RequestMapping(value="/joinForm",method =RequestMethod.GET)
	public String joinForm() {
		logger.info("회원가입창으로");
		return "member/joinForm";
	}
	
	@RequestMapping(value="/join",method =RequestMethod.POST)
	public String join(MemberVO member) {
		
		logger.info("회원가입{}",member);
		
		String page = ms.memberJoin(member);
		return page;
	}
	
	@RequestMapping(value="/join",method =RequestMethod.GET)
	public String joinFail() {
		
		return "member/joinFail";
	}
	
	@RequestMapping(value="/joinList", method=RequestMethod.GET)
	public String joinList(Model model) {
		String loginId = (String)session.getAttribute("loginId");
		String page ="";
		if(loginId != null) {
			ArrayList<MemberVO> list = ms.joinList();
			model.addAttribute("memberList", list);
			page = "member/joinList";
		}else {
			page ="redirect:/member/loginForm";
		}
		
	
		return page;
	}
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String delete(Model model,String member_id) {
		
		int cnt =ms.memberDelete(member_id);
		
		
		return "redirect:/member/joinList";
	}
	@RequestMapping(value="/selectOne", method=RequestMethod.GET)
	public String memberSelectOne(String member_id,Model model) {
		
		MemberVO member= ms.memberSelectOne(member_id);
		model.addAttribute("member", member);
		
		return "member/memberInfo";
		
	}
	@RequestMapping(value="/memberUpdateForm", method=RequestMethod.GET)
	public String memberUpdateForm(String member_id,Model model) {
		MemberVO member= ms.memberSelectOne(member_id);
		model.addAttribute("member", member);
		
		return"member/memberUpdateForm";
	}
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String memberUpdate(MemberVO member) {
		
		ms.memberUpdate(member);
		
		return "redirect:/member/joinList";
		
	}
	@RequestMapping(value="/loginForm", method=RequestMethod.GET)
	public String memberLoginForm() {
		return"member/memberLoginForm";
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String memberLogin(MemberVO member) {
		String page = ms.memberLogin(member);
		
		return page;
	}
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String memberLogout() {
		
		ms.memberLogout();
		//데이터를 조작했으니까 리다이렉트
		return"redirect:/";
	}
}
