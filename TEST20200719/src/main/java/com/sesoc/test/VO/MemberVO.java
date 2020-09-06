package com.sesoc.test.VO;

import lombok.Data;

@Data
public class MemberVO {
	private String id;
	private String pw;
	private String name;
	private String[] hobby;
	private String introduce;
}
