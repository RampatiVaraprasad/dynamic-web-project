package DAOPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import ModelPack.StudentModel;
import ModelPack.StudentModel;


public class StudentDAO {
public String insertData(StudentModel sm) {
	String status = "failed";
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rampati", "root", "root");
		PreparedStatement ps = con.prepareStatement("insert into student(Username, Password) values(?,?)");
//		ps.setInt(1, 1);
//		ps.setString(2, "nithin");
//		ps.setString(3, "vemula");
//		ps.setInt(4, 90);
//		ps.setString(5, "varaprasadji650@gmail.com");
//		ps.setInt(6, 765999);
		ps.setString(1, sm.getStudfname());
		ps.setString(2, sm.getStudlname());
	int	n = ps.executeUpdate();
	
	if(n>0) {
		status = "success";
	}else {
		System.out.println("somthing is going on");
	}
	} catch (Exception e) {
		System.out.println(e);
	}
	return status;	
}
}
