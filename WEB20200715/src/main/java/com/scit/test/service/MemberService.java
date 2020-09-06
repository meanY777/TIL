package com.scit.test.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.scit.test.VO.MemberVO;

@Service
public class MemberService {
	
// 지금은 디비가 없으니까 임시로
	public ArrayList<MemberVO> list = new ArrayList<MemberVO>();
//	int인 이유는 수행여부 값인 dao한테서 받은 값을 받아오기 때문에 필요.	
	public String MemberJoin(MemberVO member) {

//	dao에 member를 전달하는 문장으로 바뀔 예정
		list.add(member);
		int cnt=1;
		
		for(MemberVO v: list) {
			System.out.println(v);
		}
		
		String page = "";
		if(cnt == 0) {
			page ="member/joinFail";
		}else {
			page="member/joinComplete";
		}
		
		return page;
	}
}
