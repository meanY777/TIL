package com.seeoc.test.Service;

import java.rmi.Remote;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.seeoc.test.VO.MemberVO;
import com.seeoc.test.VO.removeID;

@Service
public class MemberService {

	public ArrayList<MemberVO> list = new ArrayList<MemberVO>();
	
	public String memberService(MemberVO member) {
		
		
		String page ="member/loginClear";	
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getId().equals(member.getId())) {
				page ="member/loginFail";
				return page;
			}
		}
		
		list.add(member);
		
		for(MemberVO vo: list) {
			System.out.println(vo);
		}
		
		
	
		
		return page;
	}
	
	public void removeMember(removeID id) {
		

		for(int i=0;i<list.size();i++) {
			if(list.get(i).getId().equals(id)) {
				
				
				list.remove(i);
				
				
			}
		}
		
	}
}
