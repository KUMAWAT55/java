import java.sql.*;
class rk{
	public static void main(String args[])
	{try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rohit","root","");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("SELECT * from student");
		while(rs.next())
		{
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));	
		}
	}catch(Exception e){
		System.out.println(e);
	}
	
	}
}
