
import java.sql.*;
import java.io.*;
class out{
	public static void main(String args[])
	{try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rohit","root","");
		PreparedStatement stmt=con.prepareStatement("select * from img");
		ResultSet rs=stmt.executeQuery();
		if(rs.next()){
			
		
		Blob b=rs.getBlob(2);
			byte barr[]=b.getBytes(1,(int)b.length());
		
		FileOutputStream fout=new FileOutputStream("f:\\hello3.jpg");
		fout.write(barr);
		
		//stmt.setBinaryStream(2,fin,fin.available());
	//	stmt.executeUpdate();
		fout.close();}
		con.close();
		
	}catch(Exception e){
		System.out.println(e);
	}
		
	}
}
