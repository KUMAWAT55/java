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
