package ControlersPack;

import java.io.IOException;

import DAOPack.FeeDAO;
import ModelPack.FeeModel;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FeeControl
 */
public class FeeControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("welcome to controler world");
		String fname = request.getParameter("Username");
		System.out.println("fname:"+fname);
		String lname = request.getParameter("Password");
		System.out.println("lname:"+lname);
		FeeModel fm = new FeeModel();
		fm.setStudfname(fname);
		fm.setStudlname(lname);
		FeeDAO fd = new FeeDAO();
		String status = fd.insertData(fm);
		if(status.equals("success")) {
			RequestDispatcher	rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
			System.out.println("hi Fee");
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("Buttons");
			rd.include(request, response);
		}
	}
}
