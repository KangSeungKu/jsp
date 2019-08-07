package kr.or.ddit.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet("/sumCalculation")
public class SumCalculationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory.getLogger(SumCalculationServlet.class);
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request.getRequestDispatcher("/jsp/scopeTestView.jsp").forward(request, response);
		request.getRequestDispatcher("/jsp/sumInput.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/jsp/sumInput.jsp").forward(request, response);
		int start = Integer.parseInt(request.getParameter("startParam"));
		int end = Integer.parseInt(request.getParameter("endParam"));
		int sum = 0;
		
		for(int i = start; i <= end ; i++) {
			sum += i;
		}
		
		logger.debug("sum : {}", sum);
		
		//session
		HttpSession session = request.getSession();
		session.setAttribute("sumResult", sum);
		
		request.getRequestDispatcher("/jsp/sumResult2.jsp").forward(request, response);
	}

}
