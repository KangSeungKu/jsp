package kr.or.ddit.lprod.repository;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.lprod.model.LprodVo;
import kr.or.ddit.util.MybatisUtil;

public class LprodDaoTest {

	private static final Logger logger = LoggerFactory.getLogger(LprodDaoTest.class);
	
	ILprodDao lprodDao;
	SqlSession sqlSession;
	
	@Before
	public void setup() {
		logger.debug("LprodDao - before");
		lprodDao = new LprodDao();
		sqlSession = MybatisUtil.getSession();
	}
	
	@After
	public void tearDown() {
		logger.debug("LprodDao - after");
		sqlSession.close();
	}
	
	@Test
	public void getLprodListTest() {
		/***Given***/

		/***When***/
		List<LprodVo> lprodList = lprodDao.getLprodList(sqlSession);

		/***Then***/
		assertEquals(10, lprodList.size());
	}
	
	@Test
	public void getLprodPagingList() {
		/***Given***/
		Page page = new Page();
		page.setPage(2);
		page.setPagesize(5);

		/***When***/
		List<LprodVo> lprodList = lprodDao.getLprodPagingList(sqlSession, page);

		/***Then***/
		assertEquals(5, lprodList.size());
	}
	
	@Test
	public void getLprodTotalCnt() {
		/***Given***/

		/***When***/
		int totalCnt = lprodDao.getLprodTotalCnt(sqlSession);

		/***Then***/
		assertEquals(10, totalCnt);
	}
}
