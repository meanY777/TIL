package com.scit.test.vo;

import lombok.Data;

@Data
public class ReplyVO {
	
	
	private int replyNum;
	private int boardNum;
	private String writer;
	private String indate;
	private String content;
}
