package com.sesoc.test.Service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.sesoc.test.VO.MemberVO;

@Service
public class MemberService {

	ArrayList<MemberVO> list = new ArrayList<MemberVO>();
	
	public String memberJoin(MemberVO member) {
	
		list.add(member);
		int cnt = 1;
		
		for(MemberVO v:list) {
			System.out.println(v);
		}
		
		String page ="";
		if(cnt==0) {
			page ="member/joinFail";
		}else {
			page="member/joinClear";
		}
		
		return page;
	}
	
}
