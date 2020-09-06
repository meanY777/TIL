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
	private MemberDAO dao;
	@Autowired
	private HttpSession session;
	public String insertMember(MemberVO member) {
		
		int cnt = dao.insertMember(member);
		String page = "member/joinSuccess";
		
		if(cnt == 0) {
			page ="member/joinFail";
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
	
	public MemberVO selectOneMember(String member_id) {
		
		MemberVO member = dao.selectOneMember(member_id);
		
		return member;
	}
	
	public void updateMember(MemberVO member) {
		
		 dao.updateMember(member);
	
	}
	
	public String login(MemberVO member) {
		
		MemberVO vo = dao.selectOneMember(member.getMember_id());
		String page = "";
		if(vo!= null||vo.getMember_pw().equals(member.getMember_pw())) {
			
			session.setAttribute("loginId", vo.getMember_id());
			page = "redirect:/";
			
		}else {
			page = "redirect:/member/loginPage";
		}
		
		return page;
	}
	
	public void logout() {
		
		session.removeAttribute("loginId");
	}
	public ArrayList<MemberVO>searchMember(String mindate,String maxdate){
		
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("mindate", mindate);
		map.put("maxdate", maxdate);
		
		ArrayList<MemberVO> list =dao.searchMember(map);
			
	
		return list;
	}
}
