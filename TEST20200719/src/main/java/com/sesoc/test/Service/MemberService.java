package com.sesoc.test.Service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.sesoc.test.VO.MemberVO;

@Service
public class MemberService {
	public ArrayList<MemberVO> list = new ArrayList<>();
	
	public String memberService(MemberVO member) {
		
		String page = "member/joinClear";
		
		for(int i = 0; i<list.size();i++) {
			if(list.get(i).getId().equals(member.getId())) {
				page = "member/joinFail";
				return page;
			}
		}
		list.add(member);
		
		for(int i = 0; i<list.size();i++) {
			
			for(MemberVO m:list) {
				System.out.println(m);
			}
		}
		
		return page;
	}
	public void memberDelete(String id) {
		int index =0;
		
		for(int i = 0;i<list.size();i++) {
			if(list.get(i).getId().equals(id)) {
				index = i;
			}
		}
		list.remove(index);
	}
}
