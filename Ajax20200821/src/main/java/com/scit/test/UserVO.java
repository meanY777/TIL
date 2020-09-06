package com.scit.test;

public class UserVO {
	
	private String userID;
	private String userPw;
	
	
	public UserVO() {
		super();
	}


	public UserVO(String userID, String userPw) {
		super();
		this.userID = userID;
		this.userPw = userPw;
	}


	public String getUserID() {
		return userID;
	}


	public void setUserID(String userID) {
		this.userID = userID;
	}


	public String getUserPw() {
		return userPw;
	}


	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}


	@Override
	public String toString() {
		return "UserVO [userID=" + userID + ", userPw=" + userPw + "]";
	}
	
	
}
