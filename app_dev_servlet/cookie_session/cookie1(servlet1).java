

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cookie1
 */
@WebServlet("/cookie1")
public class cookie1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public cookie1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String s=request.getParameter("name");
		out.println("welcome"+s);
		Cookie ck=new Cookie("uname",s);
		response.addCookie(ck);
		System.out.println("success");
		 out.print("<form action='cookie2'method='post'>");  
		    out.print("<input type='submit' value='go'>");  
		    out.print("</form>");  
		out.println("<a href='cookie2' method='post'>visit cookie2</a>");
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
