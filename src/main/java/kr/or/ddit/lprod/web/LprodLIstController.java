package kr.or.ddit.lprod.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.lprod.model.LprodVo;
import kr.or.ddit.lprod.repository.LprodDao;
import kr.or.ddit.lprod.service.ILprodService;
import kr.or.ddit.lprod.service.LprodService;

@WebServlet("/lprodList")
public class LprodLIstController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private ILprodService lprodService;
	
	@Override
	public void init() throws ServletException {
		lprodService = new LprodService();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LprodDao lprodDao = new LprodDao();
		List<LprodVo> list = lprodService.getLprodList();
		
		request.setAttribute("lprodList", list);
		
		request.getRequestDispatcher("/lprod/lprodList.jsp").forward(request, response);
	}

}
