package DAOPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import ModelPack.FeeModel;

public class FeeDAO {
	public String insertData(FeeModel fm) {
		String status = "failed";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rampati","root","root");
			PreparedStatement ps = con.prepareStatement("insert into Faculty(Username,Password) values (?,?)");
			ps.setString(1, fm.getStudfname());
			ps.setString(2, fm.getStudlname());
			int n = ps.executeUpdate();
			if(n>0) {
				status = "success";
				System.out.println("i am a devlovepper");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

}
