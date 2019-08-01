package kr.or.ddit.user.model;

public class UserVo {
	private String userName;		// 사용자 이름

	public String getUserName() {
		return userName;
	}

	public UserVo(String userName) {
		super();
		this.userName = userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "UserVo [userName=" + userName + "]";
	}
}
