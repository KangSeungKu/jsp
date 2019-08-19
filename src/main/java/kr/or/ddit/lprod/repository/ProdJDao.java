package kr.or.ddit.lprod.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.lprod.model.ProdJVo;
import kr.or.ddit.util.MybatisUtil;

public class ProdJDao implements IProdJDao {

	@Override
	public List<ProdJVo> getProdJList(String lprod_gu) {
		SqlSession sqlSession = MybatisUtil.getSession();
		List<ProdJVo> list = sqlSession.selectList("prodj.getprodJList", lprod_gu);
		sqlSession.close();
		
		return list;
	}

}
