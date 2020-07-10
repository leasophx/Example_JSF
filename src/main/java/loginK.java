

import java.io.Serializable;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;
import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.annotation.RequestScope;



@Named("loginK")
@RequestScoped


public class loginK implements Serializable {

    static int loginID = 9999;

    static sachbearbeiterK sbk = new sachbearbeiterK();
    static Sachbearbeiter sb = new Sachbearbeiter();
    static adminMenueAS as = new adminMenueAS();
    static sachbearbeiterMenueAS sbas = new sachbearbeiterMenueAS();
    static loginAAS lAAS = new loginAAS();



    private String username = "";
    private String password = "";
    private Boolean loginFail = false;
    private String urlLogin;
    private String urlLogout;

    public String getUrlLogin() {
        checkLoginData();

        if(!loginFail){
            //urlLogin = "index.xhtml";
            this.urlLogin = "adminMenueAAS.xhtml";
            System.out.println("Login successfull - Redirect to URL: " + urlLogin);

        }else{
            this.urlLogin = "index.xhtml";
            System.out.println("Login fail!!! - Redirect to URL: " + urlLogin);
        }


        return urlLogin;
    }

    public String holeUrl(){
        return "/index.xhtml";
    }

    public String getUrlLogout(){
       // System.out.println("Logout called");
        //loginID = 9999;
        urlLogout = "index.xhtml";
        return urlLogout;

    }



    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }


    loginK(){
        username = "";
        password = "";
        loginFail = false;
    }

    public void createDefaultAdminUser(){
        sachbearbeiterCreateK sbCreateK = new sachbearbeiterCreateK();
        Sachbearbeiter sb = new Sachbearbeiter();
        if(sb.getNumberUser() <= 1){
            sbCreateK.standartSachbearbeiterCreate();
            System.out.println("Usercreated\n");
        }

    }
    public void checkLoginData(){
        createDefaultAdminUser();

         if(sbk.checkPassword(username,password)){
             //lAAS.closeWindow();
             //lAAS.setloginFail(false, "","");
             loginID = sb.ArrayPos(username);

             if(sb.getAdminState(loginID)){
                 //as.menue();//as.menue();
             }else{
                 //sbas.menue();
             }
             loginFail = false;

         }else{
             loginID = 9999;
             System.out.println("Dieser Sachbearbeiter ist nicht vorhanden!!!");
             System.out.println("----------------------");
             System.out.println("Neuer Login:");
             //lAAS.closeWindow();
             //lAAS.setloginFail(true, username,password);
            // lAAS.login();
             loginFail = true;

         }

    }
   /* public String getUrlLogin(){
        checkLoginData();

        if(loginFail){
            urlLogin = "index.xhtml";
            return urlLogin;
        }else{
            urlLogin = "adminMenueAAS.xhtml";
            return urlLogin;
        }
    }*/
}
