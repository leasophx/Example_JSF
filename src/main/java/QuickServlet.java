//package net.codejava.servlet;

import java.beans.Beans;
import java.io.IOException;
import java.io.PrintWriter;



import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.faces.bean.RequestScoped;
import javax.servlet.annotation.WebServlet;
import javax.inject.Named;
import javax.faces.bean.SessionScoped;
import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.annotation.RequestScope;

//@ViewScoped
//@ManagedBean
//@ManagedBean(name="QuickServlet2")
//@RequestScoped
//@WebServlet(name="QuickServlet")
//@Named(value = "QuickServlet")
//@SessionScoped


//@Component("QuickServlet")
//@Scope("session")
@Named("QuickServlet")
@RequestScoped

public class QuickServlet extends HttpServlet implements Serializable {


    private String user;
    private String pass;


    public QuickServlet(){

    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }

    public void setDefaultUser(){
        user = "Liane Musterfrau";
        System.out.println("UserName Changed");

    }

    public String getDate(){
        Date date = new Date();
        return date.toString();
    }




    /**
     * this life-cycle method is invoked when this servlet is first accessed
     * by the client
     */
    public void init(ServletConfig config) {
        System.out.println("Servlet is being initialized");
    }

    /**
     * handles HTTP GET request
     */

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        /*PrintWriter writer = response.getWriter();
        writer.println("<html>Hello, I am a Java servlet!</html>");
        writer.flush();*/

      /*  String paramUsername = request.getParameter("username");
        user = paramUsername;

        String paramPassword = request.getParameter("password");
        pass = paramPassword;*/


    }

    /**
     * handles HTTP POST request
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String paramUsername = request.getParameter("username");
        user = paramUsername;

        String paramPassword = request.getParameter("password");
        pass = paramPassword;//Integer.parseInt(paramPassword);

        request.setAttribute("username",user);
        request.setAttribute("password",pass);
        request.getRequestDispatcher("/test.jsp").forward(request,response);
        //response.sendRedirect("/test.jsp");
        //request.getRequestDispatcher("/test.jsp").forward(request,response);
        //response.sendRedirect("test.jsp");


        /*PrintWriter writer = response.getWriter();
        writer.println("<html><b>Deine eingegebener Benutzername ist:</b> " + username + "<br/></html>");
        writer.println("<html><b>Deine eingegeben Daten sind:</b> " + password + "</html>");
        writer.flush();
        */
        //response.sendRedirect("index.xhtml");






    }

    /* public String goToPage1() {
        // ...
       // return "page_1?faces-redirect=true";
    }*/

    /**
     * this life-cycle method is invoked when the application or the server
     * is shutting down
     */
    public void destroy() {
        System.out.println("Servlet is being destroyed");
    }
}