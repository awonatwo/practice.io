package com.sh.web.menu;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MenuServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 인코딩
		request.setCharacterEncoding("utf-8");
		// 사용자 입력값 확인
				String mainMenu = request.getParameter("mainMenu");
				String sideMenu = request.getParameter("sideMenu");
				String drinkMenu = request.getParameter("drinkMenu");
				
			System.out.println("mainMenu = " + mainMenu);
			System.out.println("sideMenu = " + sideMenu);
			System.out.println("drinkMenu = " + drinkMenu);
			
		// 응답처리 
			// 응답 메시지 메타정보
			RequestDispatcher reqDispatcher = request.getRequestDispatcher("/servlet/menuResult.jsp");
			reqDispatcher.forward(request, response);
				
	}
}