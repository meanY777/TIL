package com.scit.web.vo;

import lombok.Data;

@Data
public class MemberVO {
	
	private String	member_id;
	private	String	member_pw;
	private	String 	member_nm;
//	데이트 속성을 String으로 했다는 점
	private String	member_indate;
	
}
