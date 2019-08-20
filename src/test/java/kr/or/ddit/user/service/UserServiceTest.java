package kr.or.ddit.user.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import kr.or.ddit.user.model.User;
import kr.or.ddit.user.repository.IUserDao;
import kr.or.ddit.user.repository.UserDao;
import kr.or.ddit.util.MybatisUtil;

public class UserServiceTest {
	
	private IUserService userDao;

	@Before
	public void setup() {
		userDao = new UserService();
	}
	
	/**
	* Method : getUserListTest
	* 작성자 : PC-16
	* 변경이력 :
	* Method 설명 : getUserList 테스트
	*/
	@Test
	public void getUserListTest() {
		/***Given***/
		
		
		/***When***/
		List<User> userList = userDao.getUserList();

		/***Then***/
		assertEquals(105, userList.size());
	}

	/**
	* Method : getUserTest
	* 작성자 : PC-16
	* 변경이력 :
	* Method 설명 : 사용자 정보 조회 테스트
	*/
	@Test
	public void getUserTest() {
		/***Given***/
		String userId = "brown";

		/***When***/
		User userVo = userDao.getUser(userId);
		
		/***Then***/
		assertEquals("brown", userVo.getUserId());
		assertEquals("brown1234", userVo.getPass());
	}
	
	@Test
	public void getUserListOnlyHalf() {
		/***Given***/

		/***When***/
		List<User> userList = userDao.getUserListOnlyHalf();
		
		/***Then***/
		assertEquals(50, userList.size());
	}
}
