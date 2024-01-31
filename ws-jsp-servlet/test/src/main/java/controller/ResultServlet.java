package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Result
 */
@WebServlet("/result")
public class ResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name"); //input name의 값과 동일
		String age = request.getParameter("age");
		System.out.println(name + age);
		
		request.setAttribute("gender", "male");
		//response.sendRedirect("result.jsp");
		//요청처리단계 - 요청위임 (포워딩)
		request.getRequestDispatcher("result.jsp").forward(request, response);
		
		
	}



}
