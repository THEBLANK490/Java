//servlet is a API or interface or class that handles the user request
//sent from the browser , processes it and sends back to the client
//by implementing the servlet interface
//by extending genetic servlet class
//by extending HTTPServlet class: process http request with http protocol
package com.firstServlet;

//using servlet interface
import jakarta.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;


public class firstServletClass implements Servlet {
    ServletConfig config;
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        System.out.println("servlet is born");
    }

    //non lifecycle
    @Override
    public ServletConfig getServletConfig() {
       return config;
    }

    
    //lifecycle
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println(" --servlet providing services--");
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.write("servlet is porviding service");
    }

    //non lifecycle
    @Override
    public String getServletInfo() {
       return "servlet is created by csit 7th";
    }

    @Override
    public void destroy() {
        System.out.println(" servlet ends");
    }
    //Servlet interface includes lifecycle method and non life ccle method
    //all the method should override
    
}