package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
// 요청주소 - 전담하는애 하나만 있어야함 두개가있으면 충돌이 일어남 오류 발생
@WebServlet("/home") 
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    //의존성 주입이 되어있음 HttpServletRequest, HttpServletResponse
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.sendRedirect("home.jsp");
		 // 1. 주소를 클라이언트한테 응답 보낸다.
		 // 2. 클라이언트는 주소창에 home.jsp를 입력해서 주소 요청을한다.
	}
 
}
