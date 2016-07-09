import java.sql.*;

import java.util.Scanner;

public class batch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			Scanner sc=new Scanner(System.in);
			PreparedStatement stmt=con.prepareStatement("insert into user values(?,?,?)");
			while(true){
					System.out.print("enter name");
				String name=sc.next();
				System.out.print("enter email");
				String email=sc.next();
				System.out.print("enter pass");
				String pass=sc.next();
				stmt.setString(1, name);
				stmt.setString(2, email);
				stmt.setString(3, pass);
				stmt.executeUpdate();
					System.out.print("want more:");
				String ans=sc.next();
				if(ans.equals("n"))
				{ sc.close();
					break;
				}
				
			}
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}

