package com.firstServlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class FormProcessing extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        //extracting from field
        String uname = req.getParameter("uname");
        String pass = req.getParameter("pass");
        String repass = req.getParameter("repass");
        String gender = req.getParameter("gender");
        String course = req.getParameter("course");
    }
}
