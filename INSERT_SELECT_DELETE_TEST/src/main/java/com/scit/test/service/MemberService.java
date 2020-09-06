package com.scit.test.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.test.dao.MemberDAO;
import com.scit.test.vo.MemberVO;

@Service
public class MemberService {
	
	@Autowired
	private MemberDAO dao;
	
	public String insertMember(MemberVO member) {
		int cnt = 0;
		cnt =dao.insertMember(member);
		String page ="";
		
		if(cnt==0) {
			page="redirect:/member/joinFail";
		}else {
			page="redirect:/member/joinClear";
		}
		
		return page;
	}
	
	public ArrayList selectMember() {
		
		return dao.selectMember();
	}
	
	public String deleteMember(String member_id) {
		
		int cnt = dao.deleteMember(member_id);
		
		String page = "";
		if(cnt==0) {
			page = "redirect:/member/joinFail";
		}else {
			page = "redirect:/member/select";
		}
		return page;
	}
}
