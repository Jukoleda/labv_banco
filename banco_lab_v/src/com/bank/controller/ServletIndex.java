package com.bank.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bank.util.RoutesView;
import com.bank.util.IndexVars;
import com.bank.handler.AccountHandler;
import com.bank.model.AccountModel;

/**
 * Servlet implementation class ServletIndex
 */
@WebServlet("/ServletIndex")
public class ServletIndex extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletIndex() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String username = request.getParameter(IndexVars.USERNAME);
		String password = request.getParameter(IndexVars.PASSWORD);
		
		AccountHandler cuentasExistentes = new AccountHandler();
		
		//cuentasExistentes.find(new AccountModel());
		
		
		
		
		
		request.getRequestDispatcher(RoutesView.DASHBOARD).forward(request, response);
	}	

}
