package ControlersPack;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import DAOPack.StudentDAO;
import ModelPack.StudentModel;

/**
 * Servlet implementation class StudentControl
 */
public class StudentControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Welcome to my controler world!!!");
		String fname = request.getParameter("Username");
		System.out.println("fname:"+fname);
		String lname = request.getParameter("Password");
		System.out.println("lname:"+lname);
		StudentModel sm = new StudentModel();
		sm.setStudfname(fname);
		sm.setStudlname(lname);
		StudentDAO sd = new StudentDAO();
		String status = sd.insertData(sm);
		if(status.equals("success")) {
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
			System.out.println("hi student");
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("Buttons.html");
			rd.include(request, response);
		}
	}

}
