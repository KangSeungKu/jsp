package kr.or.ddit.user.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.user.model.User;
import kr.or.ddit.user.repository.UserDao;
import kr.or.ddit.user.service.IUserService;
import kr.or.ddit.user.service.UserService;

@WebServlet("/userList")
public class UserListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IUserService userService;
	
	@Override
	public void init() throws ServletException {
		userService = new UserService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 *  userDao 사용자 리스트 조회
		 *  request객체에 사용자 리스트 정보를 저장
		 *  userList.jsp를 통해서 화면응답을 생성하도록 위임
		 */
		
		List<User> userList = userService.getUserList();
		
		request.setAttribute("userList", userList);
		
		request.getRequestDispatcher("/user/userList.jsp").forward(request, response);
	}
}
