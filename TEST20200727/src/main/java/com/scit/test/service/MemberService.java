package com.scit.test.service;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.test.dao.MemberDAO;
import com.scit.test.dao.MemberMapper;
import com.scit.test.vo.MemberVO;


@Service
public class MemberService {
	
	@Autowired
	private HttpSession session;
	@Autowired
	private MemberDAO dao;
	public String insertMember(MemberVO member) {
		
		int cnt =dao.insertMember(member);
		String page ="";
		if(cnt ==0) {
			page = "redirect:/member/joinFail";
			
		}else {
			page = "redirect:/member/joinClear";
		}
		
		return page;
	}
	
	public ArrayList<MemberVO> selectAllMember(){
		
		ArrayList<MemberVO> list = dao.selectAllMember();
		return list;
	}
	public int deleteMember(String member_id) {
		int cnt =0;
		cnt = dao.deleteMember(member_id);
		
		return cnt;
	}
	
	public ArrayList<MemberVO> findMember(String min_birth, String max_birth){
		
		HashMap<String, String> map = new HashMap<>();
		
		map.put("min_birth", min_birth);
		map.put("max_birth", max_birth);
		
		ArrayList<MemberVO> list = dao.findMember(map);
		
		return list;
		
	}
	public MemberVO showInfo(String member_id) {
		
		MemberVO member =dao.showInfo(member_id);
		
		return member;
	}
	
	public void updateMember(MemberVO member) {
		dao.updateMember(member);
		
	}
	
	public String memberLogin(MemberVO member) {
		
		MemberVO member1= dao.showInfo(member.getMember_id());
		String page = "";
		
		if( member1 != null && member1.getMember_pw().equals(member.getMember_pw())) {
			
			session.setAttribute("loginId", member.getMember_id());
			page = "redirect:/";
			
		}else {
			
			page="redirect:/member/loginForm";
			
		}
		
		return page;
	}
	
	public void memberLogout() {
		
		session.removeAttribute("loginId");
	}
}
