package com.icss.po;

public class Friend {
	//����ID��NO���ǳƣ���ע���Ա�ͷ��״̬
	private int friendId;
	private String friendNo;
	private String friendNickname;
	private String friendRemarks;
	private String friendSex;
	private String friendImage;
	private String friendStat;
	public int getFriendId() {
		return friendId;
	}
	public void setFriendId(int friendId) {
		this.friendId = friendId;
	}
	public String getFriendNo() {
		return friendNo;
	}
	public void setFriendNo(String friendNo) {
		this.friendNo = friendNo;
	}
	public String getFriendNickname() {
		return friendNickname;
	}
	public void setFriendNickname(String friendNickname) {
		this.friendNickname = friendNickname;
	}
	public String getFriendRemarks() {
		return friendRemarks;
	}
	public void setFriendRemarks(String friendRemarks) {
		this.friendRemarks = friendRemarks;
	}
	public String getFriendSex() {
		return friendSex;
	}
	public void setFriendSex(String friendSex) {
		this.friendSex = friendSex;
	}
	public String getFriendImage() {
		return friendImage;
	}
	public void setFriendImage(String friendImage) {
		this.friendImage = friendImage;
	}
	public String getFriendStat() {
		return friendStat;
	}
	public void setFriendStat(String friendStat) {
		this.friendStat = friendStat;
	}
	public Friend(int friendId, String friendNo, String friendNickname, String friendRemarks, String friendSex, String friendImage, String friendStat) {
		super();
		this.friendId = friendId;
		this.friendNo = friendNo;
		this.friendNickname = friendNickname;
		this.friendRemarks = friendRemarks;
		this.friendSex = friendSex;
		this.friendImage = friendImage;
		this.friendStat = friendStat;
	}
	public Friend() {
		super();
		// TODO Auto-generated constructor stub
	}
}
