package com.sesoc.test.Service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.sesoc.test.VO.MemberVO;

@Service
public class MemberService {
	
	ArrayList<MemberVO> list = new ArrayList<MemberVO>();
	
	public String memberJoin(MemberVO member) {
		System.out.println("여기는 가능?2");
		list.add(member);
		for(MemberVO vo: list) {
			System.out.println(vo);
		}
		
		int cnt = 1;
		String page="";
		
		if(cnt ==1) {
			page ="member/loginClear";
			return page;
		}else {
			page ="member/loginFail";
			return page;
		}
		
		
	}
	
}
