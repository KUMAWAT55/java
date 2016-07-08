
package regis;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
public class data {
		
		
			
		public static int response(user u){
			int s=0;
			try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		PreparedStatement stmt=con.prepareStatement("insert into user values(?,?,?)");
		
		stmt.setString(1, u.getUname());
		stmt.setString(2, u.getUemail());
		stmt.setString(3, u.getUpass());
		stmt.executeUpdate();
		System.out.println(u.getUname()+" "+u.getUemail()+" "+u.getUpass());
		
		System.out.println("success");
		
		}catch(Exception e){
			System.out.println(e);
		}
		
	return s;}
		
	}

