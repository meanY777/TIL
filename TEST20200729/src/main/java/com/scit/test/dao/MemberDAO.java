package com.scit.test.dao;

import java.util.ArrayList;
import java.util.HashMap;

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
	public ArrayList<MemberVO>selectAllMember(){
		
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		ArrayList<MemberVO> list =null;
		try {
			list =mapper.selectAllMember();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	public void deleteMember(String member_id) {
		
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		
		try {
			mapper.deleteMember(member_id);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<MemberVO>selectForBirth(HashMap<String,String> map){
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		ArrayList <MemberVO> list= null;
		try {
			list =mapper.selectForBirth(map);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	public MemberVO selectOneMember(String member_id) {
		MemberMapper mapper = session.getMapper(MemberMapper.class);
		MemberVO member = null;
		try {
			member =mapper.selectOneMember(member_id);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return member;
	}
	public void updateMember(MemberVO member) {
		MemberMapper mapper = session.getMapper(MemberMapper.class);	
		
		try {
			mapper.updateMember(member);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
