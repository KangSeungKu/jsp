package kr.or.ddit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TimesTablesServlet extends HttpServlet {
	private static final Logger logger = LoggerFactory.getLogger(TimesTablesServlet.class);
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String method = req.getMethod();
		
		logger.trace("trace TimesTablesServlet doGet() {} {}", method, method+"test");
		logger.debug("debug TimesTablesServlet doGet() {} {}", method, method+"test");
		logger.info("info TimesTablesServlet doGet()");
		logger.warn("warn TimesTablesServlet doGet()");
		logger.error("error TimesTablesServlet doGet()");
		
		resp.setContentType("text/html; charset=utf-8");
		
		PrintWriter pw = resp.getWriter();
		pw.println("<html>");
		pw.println("	<head>");
		pw.println("		<title>TableTest</title>");
		pw.println("		<link rel=\"stylesheet\" href=\"myStyle.css\">");
//		pw.println("		<style>");
//		pw.println("			td {");
//		pw.println("				padding: 10px;");
//		pw.println("			}");
//		pw.println("		</style>");
		pw.println("	</head>");
		pw.println("	<body>");
		pw.println("		<table border=1>");
		for(int i = 1 ; i <= 9 ; i++) {
			pw.println("			<tr>");
			for(int j = 2 ; j <= 9 ; j++) {
				pw.println("				<td>" + j + " * " + i + " = " + (i*j) + "</td>");
			}
			pw.println("			</tr>");
		}
		pw.println("		</table>");
		pw.println("	</body>");
		pw.println("</html>");
	}
	
}
