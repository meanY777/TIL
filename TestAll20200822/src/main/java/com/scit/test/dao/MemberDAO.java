package com.scit.test.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.test.vo.MemberVO;

@Repository
public class MemberDAO {
	
	@Autowired
	private SqlSession session;
	
	public int joinMember(MemberVO member) {
		
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		int cnt = 0;
		
		try {
			cnt =mapper.joinMember(member);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return cnt;
	}
	public MemberVO loginMember(String acc_id) {
		
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		MemberVO member1 = null;
		
		try {
			member1 =mapper.loginMember(acc_id);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return member1;
		
	}
	
}
