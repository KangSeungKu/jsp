package kr.or.ddit.user.repository;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.user.model.User;
import kr.or.ddit.util.MybatisUtil;

public class UserDaoTest {
	
	private static final Logger logger = LoggerFactory.getLogger(UserDaoTest.class);
	
	private IUserDao userDao;
	private SqlSession sqlSession;
	private String userId = "brownTest";
	
	// junit 테스트 메소드 실행 순서
	// @Before -> @Test -> @After
	// @Test테스트 메소드가 실행되기 전에 @Before이 적용된 메소드를 먼저 실행하고,
	// @Test 메소드 실행 수
	// @After이 적용된 메소드를 실행한다.
	// @Test 메소드는 실행순서가 보장되지 않음
	
	// 테스트에 공통적으로 필요한 자원을 생성 / 초기화
	@Before
	public void setup() {
		logger.debug("before");
		userDao = new UserDao();
		sqlSession = MybatisUtil.getSession();
		
		userDao.deleteUser(sqlSession, userId);
	}
	
	// 테스트에 공통적으로 사용한 자원을 해제
	@After
	public void tearDown() {
		logger.debug("after");
		sqlSession.close();
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
		List<User> userList = userDao.getUserList(sqlSession);

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
		User userVo = userDao.getUser(sqlSession, userId);
		
		/***Then***/
		assertEquals("brown", userVo.getUserId());
//		assertEquals("c6347b73d5b1f7c77f8be828ee3e871c819578f23779c7d5e082ae2b36a44", userVo.getPass());
	}
	
	@Test
	public void getUserListOnlyHalf() {
		/***Given***/

		/***When***/
		List<User> userList = userDao.getUserListOnlyHalf(sqlSession);
		
		/***Then***/
		assertEquals(50, userList.size());
	}
	
	/**
	* Method : getUserPagingList
	* 작성자 : PC-16
	* 변경이력 :
	* @param sqlSession
	* @param page
	* @return
	* Method 설명 : 사용자 페이징 리스트 조회
	*/
	@Test
	public void getUserPagingList() {
		/***Given***/
		Page page = new Page();
		page.setPage(3);
		page.setPagesize(10);

		/***When***/
		List<User> userList = userDao.getUserPagingList(sqlSession, page);

		/***Then***/
		assertEquals(10, userList.size());
		assertEquals("xuserid22", userList.get(0).getUserId());
	}
	
	/**
	* Method : getUserTotalCnt
	* 작성자 : PC-16
	* 변경이력 :
	* @param sqlSession
	* @return
	* Method 설명 : 전체 사용자 건수 조회 테스트
	*/
	@Test
	public void getUserTotalCnt() {
		/***Given***/
		

		/***When***/
		int totalCnt = userDao.getUserTotalCnt(sqlSession);
		
		/***Then***/
		assertEquals(105, totalCnt);
	}
	
	/**
	* Method : insertUserTest
	* 작성자 : PC-16
	* 변경이력 :
	* Method 설명 : 사용자 등록 테스트
	 * @throws ParseException 
	*/
	@Test
	public void insertUserTest() throws ParseException {
		/***Given***/
		User user = new User();
		//'brownTest', '브라운테스트', 'brownTest1234', '2019-08-08', 
		//'곰테스트', '대전광역시 중구 중앙로 76', '영민빌딩 2층 DDIT', '34940'
		user.setUserId(userId);
		user.setUserNm("브라운테스트");
		user.setPass("brownTest1234");
		user.setReg_dt(new SimpleDateFormat("yyyy-MM-dd").parse("2019-08-08"));
		user.setAlias("곰테스트");
		user.setAddr1("대전광역시 중구 중앙로 76");
		user.setAddr2("영민빌딩 2층 DDIT");
		user.setZipcode("34940");
		user.setFilename("noImage");
		user.setRealfilename("noImage");
		
		/***When***/
		int insertCnt = userDao.insertUser(sqlSession, user);
		sqlSession.commit();

		/***Then***/
		assertEquals(1, insertCnt);
	}
	
	/**
	* Method : updateUser
	* 작성자 : PC-16
	* 변경이력 :
	* Method 설명 : 사용자 수정 테스트
	 * @throws ParseException 
	*/
	@Test
	public void updateUserTest() throws ParseException {
		/***Given***/
		User user = new User();
		//'brownTest', '브라운테스트', 'brownTest1234', '2019-08-08', 
		//'곰테스트', '대전광역시 중구 중앙로 76', '영민빌딩 2층 DDIT', '34940'
		user.setUserId(userId);
		user.setUserNm("브라운수정");
		user.setPass("brownUpdt1234");
		user.setReg_dt(new SimpleDateFormat("yyyy-MM-dd").parse("2019-08-27"));
		user.setAlias("곰수정");
		user.setAddr1("대전광역시 중구 수정로 76");
		user.setAddr2("영민빌딩 2층 DDIT 수정");
		user.setZipcode("34940");
		user.setFilename("update.png");
		user.setRealfilename("update_0123.png");
		
		/***When***/
		int updateCnt = userDao.updateUser(sqlSession, user);
		sqlSession.commit();

		/***Then***/
		assertEquals(0, updateCnt);
	}
}
