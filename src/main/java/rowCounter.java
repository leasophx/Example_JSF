


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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Named("rowCounter")
@RequestScoped

public class rowCounter implements Serializable {

    private static int row;

    public String init(){
        row=0;
        return null;
    }
    public String counterUp(){
        row=row+1;
        System.out.println("counterupcalled");
        return null;
    }
    public int getRow() {
        return row;
    }

}