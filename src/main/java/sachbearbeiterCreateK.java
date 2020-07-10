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

@Named("sachbearbeiterCreateK")
@RequestScoped
public class sachbearbeiterCreateK implements Serializable{

    static Sachbearbeiter sb = new Sachbearbeiter();




    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String bday;
    //private Boolean adminState;
    private String adminState;



    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setBday(String bday) { this.bday = bday; }
    public void setAdminState(String adminState) { this.adminState = adminState; }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getBday() { return bday; }
    public String getAdminState() { return adminState; }


    public String init(){
        username = "";
        password = "";
        firstName = "";
        lastName = "";
        bday = "";
        adminState = "";

        return null;
    }


    public String newSachbearbeiter(){


        // Aufrufen der Methoden in der Klasse Sachbearbeiter.



        if(adminState.equals("1")) {
            sb.addUser(username,password,firstName,lastName,bday,true);
        }else{
            sb.addUser(username,password,firstName,lastName,bday,false);
        }
        System.out.println(username + firstName + lastName + "Created");
        return null;
    }


    public void standartSachbearbeiterCreate(){
        if (sb.getNumberUser() < 1){
         /*   sb.addUsername("admin");
            sb.addPassword("admin");
            sb.addFirstName("Lea");
            sb.addLastName("Heinzelmann");
            sb.addBday("1993-01-01");
            sb.addAdminState(true);*/
            //sb.users.add(new mySachbearbeiter("admin","admin","Lea","Heinzelmann","1993-01-01",true));

            sb.addUser("admin","admin","Lea","Sophie","1993-01-01",true);
        }

    }
}
