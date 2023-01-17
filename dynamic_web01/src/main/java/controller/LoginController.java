package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.dto.UserDTO;
import model.service.UserService;

public class LoginController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies = req.getCookies();
		for(Cookie c: cookies) {
			if(c.getName().equals("remember")) {
				req.setAttribute("rememberId", c.getValue());
			}
		}
		
		req.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		String userId = req.getParameter("userId");
		String password =req.getParameter("password");
		String remember= req.getParameter("remember");
		
		
		
		
		UserDTO dto = new UserDTO();
		dto.setUserId(userId);
		dto.setPassword(password);
		
		UserService service = new UserService();
		UserDTO data = service.login(dto);
		
		if(data ==null) {
			req.setAttribute("error","아이디 또는 패스워드가 잘못되었습니다.");
			req.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(req, resp);
		}else {
			Cookie cookie = new Cookie("remember", userId);
			if(remember!=null) {
				cookie.setMaxAge(60*60*24);				
			}else {
				cookie.setMaxAge(0);//
			}
			resp.addCookie(cookie);
			resp.sendRedirect(req.getContextPath()+"/");//메인으로
		}
		
	}
}
