package kr.or.ddit.lprod.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.lprod.model.LprodVo;
import kr.or.ddit.util.MybatisUtil;

public class LprodDao implements ILprodDao {

	private SqlSession sqlSession;
	
	public LprodDao() {
		sqlSession = MybatisUtil.getSession();
	}
	
	@Override
	public List<LprodVo> getLprodList() {
		List<LprodVo> list = sqlSession.selectList("lprod.getLprodList");
		sqlSession.close();
		
		return list;
	}

}
