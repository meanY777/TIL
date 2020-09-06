package com.scit.test.dao;

import com.scit.test.vo.MemberVO;

public interface MemberMapper {

	public int joinMember(MemberVO member);
	
	public MemberVO loginMember(String acc_id);
}
