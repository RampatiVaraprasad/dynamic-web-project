package ControlersPack;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import DAOPack.AdminDAO;
import ModelPack.AdminModel;
import ModelPack.AdminModel;

/**
 * Servlet implementation class Controler
 */
@WebServlet("/register")
public class AdminControler extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("welcome to my controler world");
		String fname = request.getParameter("Username");
		System.out.println("fname:"+fname);
		String lname = request.getParameter("Password");
		System.out.println("lname:"+lname);
		AdminModel m = new AdminModel();
		m.setUsername(fname);
		m.setPassword(lname);
		AdminDAO d = new AdminDAO();
		String status = d.insertData(m);
		if (status.equals("success")) {
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
			System.out.println("hi admin");
		}
			else {
			RequestDispatcher rd = request.getRequestDispatcher("/Buttons.html");
			rd.include(request, response);
		}
	}
}
