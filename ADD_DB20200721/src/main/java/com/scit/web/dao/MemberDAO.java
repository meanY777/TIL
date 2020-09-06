package com.scit.web.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.web.vo.MemberVO;

@Repository
public class MemberDAO {
	
	@Autowired
	private SqlSession session;
	
	public int memberJoin(MemberVO member) {
		
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		int cnt =0;
		
		//실행될 수도 안될 수도 있으니까 try~catch로 하는 것.
		try {
			cnt = mapper.memberJoin(member);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		//원래는 commit 해야하는데 spring 이 대신함.
		//IOC
		
		return cnt;
	}
	
	public ArrayList<MemberVO> joinList(){
		
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		ArrayList<MemberVO> list= null;
		
		try {
			list=mapper.joinList();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public int memberDelete(String member_id) {
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		
		int cnt = 0;
		
		try{
			cnt=mapper.memberDelete(member_id);
		}catch(Exception e){
			e.printStackTrace();
		}
		return cnt;
	}
	public MemberVO memberSelectOne(String member_id) {
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		MemberVO member= null;
		try {
			member = mapper.memberSelectOne(member_id);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return member;
	}
	public int memberUpdate(MemberVO member) {
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		int cnt = 0;
		try {
			cnt = mapper.memberUpdate(member);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
		
		
	}
}
