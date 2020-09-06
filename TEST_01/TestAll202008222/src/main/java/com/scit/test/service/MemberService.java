package com.scit.test.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.test.dao.MemberDAO;
import com.scit.test.dao.MemberMapper;
import com.scit.test.vo.MemberVO;


@Service
public class MemberService {
	
	@Autowired
	private MemberDAO dao;
	@Autowired
	private HttpSession session;
	
	public String joinMember(MemberVO member) {
		
		int cnt =dao.joinMember(member);
		String page ="redirect:/member/loginPage";
		
		if(cnt==0) {
			page="redirect:/member/joinForm";
		}
		
		return page;
	}
	public String loginMember(MemberVO member) {
		
	
		
		String page = "";
				
		MemberVO loginCheck= dao.loginMember(member.getAcc_id());
		
		if(loginCheck!=null&member.getAcc_pw().equals(loginCheck.getAcc_pw())) {
			
			session.setAttribute("loginId", loginCheck.getAcc_id());
			page="redirect:/";
		}else {
			page ="redirect:/member/loginPage";
		}

		
		return page;
		
	}
	
	public String logOut() {
		session.removeAttribute("loginId");
		
		String page="redirect:/";
		return page;
		
	}
}
