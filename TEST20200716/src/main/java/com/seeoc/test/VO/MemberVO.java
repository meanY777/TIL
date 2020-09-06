package com.seeoc.test.VO;

import lombok.Data;

@Data
public class MemberVO {
	
	private String id;
	private String pw;
	private String name;
	private String[] fun;
	private String gender;
	private String introduce;
}
