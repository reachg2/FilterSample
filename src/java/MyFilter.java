/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author A2A Town
 */
public class MyFilter implements Filter {
   
   
   
    

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
       String user = request.getParameter("user").trim();
       String pass = request.getParameter("pass").trim();
       PrintWriter out = response.getWriter();
       if(user.isEmpty() || pass.isEmpty())
       {
           request.getRequestDispatcher("index.jsp").forward(request,response);
       }
       else if(user.equals("reach") && pass.equals("123"))
       {
           chain.doFilter(request, response);
       }
    }

    @Override
    public void destroy() {
       
    }
           
   
    
}
