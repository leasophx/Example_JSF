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

@Named("sachbearbeiterDeleteK")
@RequestScoped
public class sachbearbeiterDeleteK implements Serializable {


    public String initialize(){
        index="";
        return null;
    }
    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
        remove();
    }

    private String index;

    public void remove(){
        if(sb.getNumberUser()>1) {
            sb.removeUser(Integer.parseInt(index) - 1);
        }
    }
  /*  public String menuItem2Clicked(){
        System.out.println("menu2clicked");

        return "adminMenueAAS.xhtml";
    }*/



    Sachbearbeiter sb = new Sachbearbeiter();

    ArrayList userList = new ArrayList();

    public void init(){
        userList = new ArrayList();
    }

    public ArrayList getList(){
        System.out.println("User\br");
        System.out.println(sb.getNumberUser());
        userList = new ArrayList();
        for(int i=0; i<sb.getNumberUser(); i++){
            userList.add("<b>Username:</b> " + sb.getUserName(i) + ", <b>First name:</b> " + sb.getFirstName(i) + ", <b>Last name:</b> " + sb.getLastName(i));

        }
        return userList;
    }




    public void removeSachbearbeiter(int index){
        sb.removeUser(index);
    }

}
