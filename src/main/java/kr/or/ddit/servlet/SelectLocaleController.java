package kr.or.ddit.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet("/selectLocale")
public class SelectLocaleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = LoggerFactory.getLogger(SelectLocaleController.class);
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String language = request.getParameter("locale");
		
		String lang = language == null ? "ko" : request.getParameter("locale");
		
		logger.debug("{}", lang);
		
		request.setAttribute("lang", lang);
		// 추가 코드가 필요하면 작업
		request.getRequestDispatcher("/jstl/selectLocale.jsp").forward(request, response);
	}

}
