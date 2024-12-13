package servalet_simple_project_crud.controller;

import java.io.IOException;

import servalet_simple_project_crud.Dao.UserDao;
import servalet_simple_project_crud.Dto.User;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class UserLoginController extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        UserDao dao = new UserDao();

       
        String email = req.getParameter("userEmail");
        String password = req.getParameter("password");

       
        User user = dao.getUserEmailDao(email);

        if (user != null) {
         
            if (user.getPassword().equals(password)) {
                req.getRequestDispatcher("display.jsp").forward(req, res);
            } else {
             
                req.setAttribute("msg", "The given password is incorrect.");
                req.getRequestDispatcher("login.jsp").forward(req, res);
            }

        } else {
          
            req.setAttribute("msg", "The given email is incorrect.");
            req.getRequestDispatcher("login.jsp").forward(req, res);
        }

    }

}
