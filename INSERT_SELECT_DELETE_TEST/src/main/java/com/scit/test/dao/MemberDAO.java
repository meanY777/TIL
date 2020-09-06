package com.scit.test.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.test.vo.MemberVO;

@Repository
public class MemberDAO {
	
	@Autowired
	private SqlSession session;
	
	public int insertMember(MemberVO member) {
		
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		
		int cnt = 0;
		
		try {
			cnt = mapper.insertMember(member);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return cnt;
		
		
	}
	public ArrayList selectMember() {
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		
		ArrayList<MemberVO>list=null;
		try {
			list = mapper.selectMember();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public int deleteMember(String member_id) {
		
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		int cnt =0;
		try {
			cnt = mapper.deleteMember(member_id);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return cnt;
	}
}
