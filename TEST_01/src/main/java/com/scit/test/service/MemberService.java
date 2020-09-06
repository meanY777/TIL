package com.scit.test.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.test.dao.MemberDAO;
import com.scit.test.dao.MemberMapper;
import com.scit.test.vo.FindMember;
import com.scit.test.vo.MemberVO;

@Service
public class MemberService {

	@Autowired
	private MemberDAO dao;
	
	public String insertMember(MemberVO member) {
		
		int cnt = 0;
		String page = "";
		cnt = dao.insertMember(member);
		if(cnt ==0) {
			page ="redirect:/member/joinFail";
		}else {
			page ="redirect:/member/joinClear";
		}
		
		return page;
	}
	public ArrayList<MemberVO> selectMember(){
		
		ArrayList<MemberVO> list = null;
		
		list = dao.selectMember();
		
		return list;
	}
	public String deleteMember(String member_id) {
		
		int cnt = 0;
		
		String page = "";
		
		cnt = dao.deleteMember(member_id);
		if(cnt ==0) {
			page = "redirect:/member/deleteFail";
		}else {
			page ="redirect:/member/joinList";
		}
		
		return page;
	}
	public ArrayList<MemberVO> findMember(FindMember find){
		
		
		ArrayList<MemberVO> list =null;
		
		list = dao.findMember(find);
		
		return list;
	}
}
