package kr.or.ddit.user.model;

public class User {
	private String userId;			// 사용자 아이디
	private String pass;			// 사용자 패스워드 
	private String userNm;		// 사용자 이름
	
	public User() {
		
	}

	public User(String userNm) {
		this.userNm = userNm;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getUserNm() {
		return userNm;
	}
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}
	
	@Override
	public String toString() {
		return "UserVo [userId=" + userId + ", pass=" + pass + ", userNm=" + userNm + "]";
	}
	
	public boolean checkLoginValidate(String userId, String pass) {
		if(userId.equals(this.userId) && pass.equals(this.pass))
			return true;
		
		return false;
	}
}
