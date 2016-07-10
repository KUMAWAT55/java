
package com.javatpoint;  
import java.io.*;  
import java.util.*;  
import javax.servlet.*;  
import javax.servlet.http.*; 
import com.darwinsys.spdf.PDF;  
import com.darwinsys.spdf.Page;  
import com.darwinsys.spdf.Text;  
import com.darwinsys.spdf.MoveTo; 
public class ServletPDF extends HttpServlet {  
  
public void doGet(HttpServletRequest request,  
        HttpServletResponse response) throws IOException {  
  
PrintWriter out = response.getWriter();  
response.setContentType("application/pdf");  
