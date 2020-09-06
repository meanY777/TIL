package com.scit.test.dao;

import java.util.ArrayList;

import com.scit.test.vo.FindMember;
import com.scit.test.vo.MemberVO;

public interface MemberMapper {
	
	public int insertMember(MemberVO member);
	public ArrayList<MemberVO> selectMember();
	public int deleteMember(String member_id);
	public ArrayList<MemberVO> findMember(FindMember find);

}
