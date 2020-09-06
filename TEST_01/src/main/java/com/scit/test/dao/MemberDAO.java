package com.scit.test.dao;

import com.scit.test.vo.FindMember;
import com.scit.test.vo.MemberVO;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	@Autowired
	private SqlSession session;
	
	
	public int insertMember(MemberVO member) {
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		
		int cnt = 0;
		
		try {
			cnt =mapper.insertMember(member);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return cnt;
		
	}
	public ArrayList<MemberVO> selectMember() {
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		
		ArrayList<MemberVO> list = null;
		
		try {
			list = mapper.selectMember();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
		
	}
	public int deleteMember(String member_id) {
		
		MemberMapper mapper =session.getMapper(MemberMapper.class);
		
		int cnt = 0;
		
		try {
			cnt =mapper.deleteMember(member_id);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
	public ArrayList<MemberVO> findMember(FindMember find){
		MemberMapper mapper =session.getMapper(MemberMapper.class);
		ArrayList<MemberVO> list =null;
		list =mapper.findMember(find);
		
		return list;
		
		
	}

}
