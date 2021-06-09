package com.bank.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bank.util.RoutesView;
import com.bank.util.GeneralUtils;
import com.bank.util.GlobalVars;
import com.bank.util.IndexVars;
import com.bank.model.CustomerModel;
import com.bank.handler.AccountHandler;
import com.bank.util.SessionClass;
import com.bank.handler.CustomerHandler;
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
		
		SessionClass mySession = new SessionClass();

		try {
		
			boolean err = false;
			String email = request.getParameter(IndexVars.EMAIL);
			String password = request.getParameter(IndexVars.PASSWORD);
			
			
			if(email.length() == 0) {
				request.setAttribute(IndexVars.V_NO_EMAIL, IndexVars.M_NO_EMAIL);
				err = true;
			}
			
			if(password.length() == 0) {
				request.setAttribute(IndexVars.V_NO_PASS, IndexVars.M_NO_PASS);
				err = true;

			}
			
			if(email.length() != 0) {
				request.setAttribute(IndexVars.EMAIL, email);
				
				if(!GeneralUtils.isEmailFormat(email)) {
					request.setAttribute(IndexVars.V_NF_EMAIL, IndexVars.M_NF_EMAIL);
					err = true;
				}
			}
			
			

			if(!err) {

				CustomerModel usuario = new CustomerModel(); 
				usuario.setEmail(email);
				usuario = CustomerHandler.find(usuario);
				
				if(usuario == null) {
					request.setAttribute(IndexVars.V_EMAIL, IndexVars.M_EMAIL);
					err = true;
				} 
				else if(usuario.getPass().compareTo(password) != 0) {
					request.setAttribute(IndexVars.V_PASS, IndexVars.M_PASS);
					err = true;
				}
				
				mySession.setUsuario(usuario);
				
			
			}
					
			if(!err) {
				
				request.getSession().setAttribute(GlobalVars.SESSION, mySession);
				
				if(mySession.getUsuario().isIdAdmin())				
					response.sendRedirect(RoutesView.DASHBOARD);
				else
					response.sendRedirect(RoutesView.HOMECLIENT);
				
			} else {
				request.getRequestDispatcher(RoutesView.LOGIN).forward(request, response);
			}
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}
	
	private void redireccionAdmin() {
		
		
	}

}
