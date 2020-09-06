package com.scit.test.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.test.dao.MemberDAO;
import com.scit.test.dao.MemberMapper;
import com.scit.test.vo.MemberVO;

@Service
public class MemberService {

	@Autowired
	private MemberDAO dao;
	public String insertMember(MemberVO member) {
		
		int cnt  =dao.insertMember(member);
		String page = "";
		if(cnt == 0) {
			page = "redirect:/member/joinForm";
		}else {
			page ="redirect:/";
		}
		return page;
	}
	public ArrayList<HashMap<String,Object>>selectAllMember(){
		
		
		ArrayList<HashMap<String,Object>> list = dao.selectAllMember();
		
		return list;
	}
	
	public MemberVO selectOneMember(String member_id) {
		
		MemberVO member=dao.selectOneMember(member_id);
	
		return member;	
	}
}
