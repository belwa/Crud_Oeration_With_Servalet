package servalet_simple_project_crud.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;

import servalet_simple_project_crud.Dao.UserDao;
import servalet_simple_project_crud.Dto.User;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class UserInsertController implements Servlet{

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}  

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserDao dao = new UserDao();
		res.setContentType("text/html");
		System.out.println("service method");
		int id =Integer.parseInt(req.getParameter("userId"));
		String name = req.getParameter("userName");
		String email = req.getParameter("userEmail");
		LocalDate dob = LocalDate.parse(req.getParameter("userDob"));
		String gender = req.getParameter("gender");
		String password = req.getParameter("userPassword");
	    
	
		
		User user = new User(id , name , email , dob , gender, password);
		User user2 = dao.saveDao(user);
		PrintWriter pw = res.getWriter();
		if(user2!=null) {
			pw.write("<html><body><h5 style='color:green;'>today date = "+LocalDate.now()+"</h5></body></html>");
			pw.write("<html><body><h5 style='color:green;'>current time = "+LocalTime.now()+"</h5></body></html>");
			pw.write("succes");
			pw.write("<html><body><h5 style='color:green;'>SUCCESS</h5></body></html>");
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
			dispatcher.include(req, res);
			
		}
		else {
			pw.write("<html><body><h5 style='color:green;'>Data-Not-Stored</h5></body></html>");
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
			dispatcher.include(req, res);
			
		}
		
		
		 
		
		
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}

