package DAOPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import ModelPack.AdminModel;
import ModelPack.AdminModel;

public class AdminDAO {
public String insertData(AdminModel m) {
	String status = "failed";
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rampati", "root", "root");
		PreparedStatement ps = con.prepareStatement("insert into Admin(Username,Password) values(?,?)");
		ps.setString(1, m.getUsername());
		ps.setString(2, m.getPassword());
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
