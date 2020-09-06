package com.scit.test.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.scit.test.vo.MemberVO;

public interface MemberMapper {

	public int insertMember(MemberVO member) ;
	public ArrayList<MemberVO> selectAllMember();
	public int deleteMember(String member_id);
	public ArrayList<MemberVO>findMember(HashMap<String,String> map);
	public MemberVO showInfo(String member_id);
	public void updateMember(MemberVO member);
}
