package com.scit.test.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.scit.test.vo.MemberVO;

public interface MemberMapper {

	public int insertMember(MemberVO member);
	public ArrayList<MemberVO>selectAllMember();
	public void deleteMember(String member_id);
	public ArrayList<MemberVO>selectForBirth(HashMap<String,String> map);
	public MemberVO selectOneMember(String member_id);
	public void updateMember(MemberVO member);
}
