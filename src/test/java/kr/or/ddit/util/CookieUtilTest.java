package kr.or.ddit.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class CookieUtilTest {

	/**
	* Method : test
	* 작성자 : PC-16
	* 변경이력 :
	* Method 설명 : 쿠키 가져오기 테스트
	*/
	@Test
	public void getCookieTest() {
		/***Given***/
		String cookieString = "rememberMe=Y; userId=brown; test=testValue";

		/***When***/
		String cookieValue = CookieUtil.getCookie(cookieString, "userId");
		String rememberMeValue = CookieUtil.getCookie(cookieString, "rememberMe");
		String testCookieValue = CookieUtil.getCookie(cookieString, "test");
		String notExistsCookieValue = CookieUtil.getCookie(cookieString, "notExists");

		/***Then***/
		assertEquals("brown", cookieValue);
		assertEquals("Y", rememberMeValue);
		assertEquals("testValue", testCookieValue);
		assertNull(notExistsCookieValue);
	}

}
