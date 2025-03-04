package kr.or.ddit.user.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.user.model.User;

public interface IUserDao {
	/**
	* Method : getUserList
	* 작성자 : PC-16
	* 변경이력 :
	 * @param sqlSession 
	* @return
	* Method 설명 : 전체 사용자 리스트 조회
	*/
	List<User> getUserList(SqlSession sqlSession);

	/**
	* Method : getUser
	* 작성자 : PC-16
	* 변경이력 :
	 * @param sqlSession 
	* @param userId
	* @return
	* Method 설명 : 사용자 상세조회
	*/
	User getUser(SqlSession sqlSession, String userId);
	
	/**
	* Method : getUserListOnlyHalf
	* 작성자 : PC-16
	* 변경이력 :
	 * @param sqlSession 
	* @return
	* Method 설명 : 사용자 리스트 조회(절반) - 50명
	*/
	List<User> getUserListOnlyHalf(SqlSession sqlSession);
	
	/**
	* Method : getUserPagingList
	* 작성자 : PC-16
	* 변경이력 :
	* @param sqlSession
	* @param page
	* @return
	* Method 설명 : 사용자 페이징 리스트 조회
	*/
	List<User> getUserPagingList(SqlSession sqlSession, Page page);
	
	/**
	* Method : getUserTotalCnt
	* 작성자 : PC-16
	* 변경이력 :
	* @param sqlSession
	* @return
	* Method 설명 : 전체 사용자 건수 조회
	*/
	int getUserTotalCnt(SqlSession sqlSession);
	
	/**
	* Method : insertUser
	* 작성자 : PC-16
	* 변경이력 :
	* @param sqlSession
	* @return
	* Method 설명 : 사용자 등록
	*/
	int insertUser(SqlSession sqlSession, User user);
	
	/**
	* Method : deleteUser
	* 작성자 : PC-16
	* 변경이력 :
	* @param sqlSession
	* @param userId
	* @return
	* Method 설명 : 사용자 삭제
	*/
	int deleteUser(SqlSession sqlSession, String userId);
	
	/**
	* Method : updateUser
	* 작성자 : PC-16
	* 변경이력 :
	* @param sqlSession
	* @param user
	* @return
	* Method 설명 : 사용자 수정
	*/
	int updateUser(SqlSession sqlSession, User user);
}
