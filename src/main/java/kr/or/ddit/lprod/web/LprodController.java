package kr.or.ddit.lprod.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.lprod.model.ProdJVo;
import kr.or.ddit.lprod.repository.ProdJDao;

/**
 * Servlet implementation class LprodController
 */
@WebServlet("/prodList")
public class LprodController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static final Logger logger = LoggerFactory.getLogger(LprodController.class);
	
	private ProdJDao prodjDao;
	
	@Override
	public void init() throws ServletException {
		prodjDao = new ProdJDao();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String lprodId = request.getParameter("lprodId");
		
		List<ProdJVo> prodJlist = prodjDao.getProdJList(lprodId);
		
		request.setAttribute("prodJlist", prodJlist);
		
		request.getRequestDispatcher("/lprod/prodList.jsp").forward(request, response);
	}
}
