package com.scit.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.test.dao.MemberDAO;
import com.scit.test.vo.MemberVO;

@Service
public class MemberService {

	@Autowired
	private MemberDAO dao;
	public String memberJoin(MemberVO member) {
		int cnt = 0;
		String page ="";
		cnt=dao.memberJoin(member);
		
		if(cnt==0) {
			page ="/member/joinFail";
		}else {
			
			page="/member/joinClear";
		}
		
		return page;
	}
}
