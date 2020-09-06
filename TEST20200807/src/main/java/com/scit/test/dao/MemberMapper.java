package com.scit.test.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.scit.test.vo.MemberVO;

public interface MemberMapper {

	public int insertMember(MemberVO member);
	public ArrayList<HashMap<String,Object>>selectAllMember();
	public MemberVO selectOneMember(String member_id);
}
