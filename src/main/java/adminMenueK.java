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


@Named("adminMenueK")
@RequestScoped
public class adminMenueK {
    Sachbearbeiter sb = new Sachbearbeiter();
    sachbearbeiterCreateAS sbCAS = new sachbearbeiterCreateAS();
    sachbearbeiterChangeAAS sbChangeAAS = new sachbearbeiterChangeAAS();
    sachbearbeiterDeleteK sbDeleteK = new sachbearbeiterDeleteK();
    static loginK lk = new loginK();

    private String siteUrl="/webFiles/adminMenueAAS.xhtml";



    private Boolean menu1 = true;
    private Boolean menu2 = false;
    private Boolean menu3 = false;
    private Boolean menu4 = false;
    private Boolean menu3_1 = false;
    private Boolean menu3_2 = false;



    public String getOwnUserName() { return ownUserName; }
    public void setOwnUserName(String ownUserName) { this.ownUserName = ownUserName; }
    public String getOwnFirstName() { return ownFirstName; }
    public void setOwnFirstName(String ownFirstName) { this.ownFirstName = ownFirstName; }
    public String getOwnLastName() { return ownLastName; }
    public void setOwnLastName(String ownLastName) { this.ownLastName = ownLastName; }
    public String getOwnBday() { return ownBday; }
    public void setOwnBday(String ownBday) { this.ownBday = ownBday; }
    public String getOwnAdmin() { return ownAdmin; }
    public void setOwnAdmin(String ownAdmin) { this.ownAdmin = ownAdmin; }

    private String ownUserName;
    private String ownFirstName;
    private String ownLastName;
    private String ownBday;
    private String ownAdmin;

    private String init;
    public String getInit() {
        setValues();
        return init;
    }




    public String init(){
        setValues();
        System.out.println("Init called");
        return "";
    }
    public void setValues(){
        setOwnUserName(Sachbearbeiter.getUserName(loginK.loginID));
        setOwnFirstName(Sachbearbeiter.getFirstName(loginK.loginID));
        setOwnLastName(Sachbearbeiter.getLastName(loginK.loginID));
        setOwnBday(Sachbearbeiter.getBday(loginK.loginID));
        setOwnAdmin(Sachbearbeiter.getAdminState2(loginK.loginID));
        System.out.println("Konstruktor called");
    }


    public String menuItem1Clicked(){
        setValues();
        System.out.println("menu1clicked");
        this.menu1 = true;
        this.menu2 = false;
        this.menu3 = false;
        this.menu3_1=false;
        this.menu3_2=false;
        this.menu4 = false;

        for(int i=0; i<sb.getNumberUser(); i++){
            System.out.println("User: " + sb.getUserName(i) + "\n");
        }

        return "adminMenueAAS.xhtml";
    }
    public String menuItem2Clicked(){
        System.out.println("menu2clicked");
        this.menu1 = false;
        this.menu2 = true;
        this.menu3 = false;
        this.menu3_1=false;
        this.menu3_2=false;
        this.menu4 = false;
        return "adminMenueAAS.xhtml";
    }
    public String menuItem3Clicked(){
        System.out.println("menu3clicked");
        this.menu1 = false;
        this.menu2 = false;
        this.menu3 = false;
        this.menu3_1=true;
        this.menu3_2=false;
        this.menu4 = false;
        return "adminMenueAAS.xhtml";
    }
    public String menuItem3_2Clicked(){
        System.out.println("menu3clicked");
        this.menu1 = false;
        this.menu2 = false;
        this.menu3 = true;
        this.menu3_1=false;
        this.menu3_2=true;
        this.menu4 = false;
        return "adminMenueAAS.xhtml";
    }
    public String menuItem4Clicked(){
        System.out.println("menu4clicked");
        this.menu1 = false;
        this.menu2 = false;
        this.menu3 = false;
        this.menu3_1=false;
        this.menu3_2=false;
        this.menu4 = true;
        return "adminMenueAAS.xhtml";
    }

    public Boolean getMenu1() { return menu1; }
    public Boolean getMenu2() { return menu2; }
    public Boolean getMenu3() { return menu3; }
    public Boolean getMenu4() { return menu4; }
    public Boolean getMenu3_1() { return menu3_1; }
    public Boolean getMenu3_2() { return menu3_2; }
    public void setMenu3_1(Boolean menu3_1) { this.menu3_1 = menu3_1; }
    public void setMenu3_2(Boolean menu3_2) { this.menu3_2 = menu3_2; }

    public String ownUserName(){
        String test = "Hi";
        return test;//sb.getUserName(lk.loginID);
    }


    public void createSachbearbeiter(){
        sbCAS.create();
    }
    public void changeSachbearbeiter(){
        sbChangeAAS.change();
    }
    public void deleteSachbearbeiter(String username){
        int pos = sb.ArrayPos(username);
        sbDeleteK.removeSachbearbeiter(pos);
    }

    public void changeAdminStatus(String username, Boolean state){
        int pos = sb.ArrayPos(username);
        sb.changeAdminState(pos,state);
    }


}
