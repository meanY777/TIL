package com.scit.test.service;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.test.dao.MemberDAO;
import com.scit.test.vo.MemberVO;

@Service
public class MemberService {

	@Autowired
	private MemberDAO dao;
	@Autowired
	private HttpSession session;
	
	public String insertMember(MemberVO member) {
		
		int cnt = dao.insertMember(member);
		String page = "";
		if(cnt==0) {
			page="redirect:/member/joinFail";
		}else {
			page="redirect:/member/joinClear";
		}
		return page;
	}
	
	public ArrayList<MemberVO>selectAllMember(){
		ArrayList<MemberVO> list = dao.selectAllMember();
		
		return list;
	}
	public void deleteMember(String member_id) {
		dao.deleteMember(member_id);
	}
	
	public ArrayList<MemberVO>selectForBirth(String min_birth,String max_birth){
		ArrayList<MemberVO> list= null;
		
		HashMap<String,String> map =new HashMap<String, String>();
		
		map.put("min_birth", min_birth);
		map.put("max_birth", max_birth);
		
		list =dao.selectForBirth(map);
		
		return list;
		
	}
	public MemberVO selectOneMember(String member_id) {
		
		MemberVO member =dao.selectOneMember(member_id);
		return member;
	}
	public void updateMember(MemberVO member) {
		dao.updateMember(member);
	}
	
	public String login(MemberVO member) {
		String page="";
		MemberVO loginCheck = dao.selectOneMember(member.getMember_id());
		
		if(loginCheck != null && loginCheck.getMember_pw().equals(member.getMember_pw())) {
			
			session.setAttribute("loginId", member.getMember_id());
			page ="redirect:/";
		}else {
			page ="redirect:/member/loginForm";
		}
		return page;
	}
	
	public void logout() {
		session.removeAttribute("loginId");
	}
}
