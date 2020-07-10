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

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
@Named("sachbearbeiterChangeK")
@RequestScoped
public class sachbearbeiterChangeK implements Serializable{

    static adminMenueK admk = new adminMenueK();
    static Sachbearbeiter sb = new Sachbearbeiter();

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String bday;
    private String adminState;

    private String index="";

    private String url;

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getBday() { return bday; }
    public void setBday(String bday) { this.bday = bday; }
    public String getAdminState() { return adminState; }
    public void setAdminState(String adminState) { this.adminState = adminState; }

    public String getIndex() { return index; }
    public void setIndex(String index) { this.index = index; }

    public String getUrl() {
        url="./adminMenueAAS.xhtml";
        return url;
    }

    public String changeButtonClicked(){

        System.out.println("ChangeClicked");
       // admk.setMenu3_1(false);
       // admk.setMenu3_2(true);



        return "adminMenueAAS.xhtml";
    }

    public String init(){
        index="";
        return null;
    }

    public String initialize(){

        this.username = sb.getUserName(Integer.parseInt(index) - 1);
        this.password = sb.getPassword(Integer.parseInt(index) - 1);
        this.firstName = sb.getFirstName(Integer.parseInt(index) - 1);
        this.lastName = sb.getLastName(Integer.parseInt(index) - 1);
        this.bday = sb.getBday(Integer.parseInt(index) - 1);
        this.adminState = sb.getAdminState2(Integer.parseInt(index) - 1);
        return null;
    }

    public String submitButtonClicked(){
        admk.setMenu3_1(true);
        admk.setMenu3_2(false);

        sb.setUsername(Integer.parseInt(index) - 1,username);
        sb.setPassword(Integer.parseInt(index) - 1,password);
        sb.setFirstName(Integer.parseInt(index) - 1,firstName);
        sb.setLastName(Integer.parseInt(index) - 1,lastName);
        sb.setBday(Integer.parseInt(index) - 1,bday);
        if(adminState.equals("1")){
            sb.changeAdminState(Integer.parseInt(index) - 1,true);
        }else{
            sb.changeAdminState(Integer.parseInt(index) - 1,false);
        }

        return "adminMenueAAS.xhtml";


    }





}
