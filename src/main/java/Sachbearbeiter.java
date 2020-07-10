
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

@Named("Sachbearbeiter")
@RequestScoped
public class Sachbearbeiter implements Serializable {


    public static List<mySachbearbeiter> getUsers() {
        return users;
    }

    public static void setUsers(List<mySachbearbeiter> users) {
        Sachbearbeiter.users = users;
    }

    private static List<mySachbearbeiter> users = new ArrayList<mySachbearbeiter>();

    private mySachbearbeiter selectedSachbearbeiter = null;

    public void select(mySachbearbeiter mS){
        System.out.println(mS.getFirstName());
    }


 /*   private static ArrayList<String> username = new ArrayList(); // Benutzername des Sachbearbeiters
    private static ArrayList<String> password = new ArrayList(); // Passwort des Sachbearbeiters
    private static ArrayList<String> firstName = new ArrayList(); // Vorname des Sachbearbeiters
    private static ArrayList<String> lastName = new ArrayList(); // Nachname des Sachbearbeiters
    private static ArrayList<String> bday = new ArrayList(); // Geburtsdatum im Format >>Jahr-Monat-Tag<<
    private static ArrayList<Boolean> adminState = new ArrayList(); // Administrator Status true->ist Admin, false->ist kein Admin
    */


    public static ArrayList<String> fortbildungen = new ArrayList();
    public static ArrayList<ArrayList<String>> fortbildungenBelegung = new ArrayList<ArrayList<String>>();
    public static String[] fortbildungen1 = {"BWL", "Netzwerktechnik1", "Netzwerktechnik2", "Mathematik"};




    public static void addUser(String username, String password, String firstName, String lastName, String bday, Boolean adminState){
        users.add(new mySachbearbeiter(username,password,firstName,lastName,bday,adminState));
    }

    /* ************ GET  - METHODEN ******************* */
    public static Integer getNumberUser(){
        //return username.size();
        System.out.println(users.size());
        return users.size();
    }
    public static String getUserName(Integer index){
        //return username.get(index);
        return users.get(index).getUsername();
    }
    public static String getFirstName(Integer index){
        //return firstName.get(index);
        return users.get(index).getFirstName();
    }
    public static String getLastName(Integer index){
        //return lastName.get(index);
        return users.get(index).getLastName();
    }
    public static String getBday(Integer index){
        //return bday.get(index);
        return users.get(index).getBday();
    }
    public static String getAdminState2(Integer index){
        /*if(adminState.get(index)){
            return("Official admin!");
        }else{
            return("No admin!");
        }
        */
        if(users.get(index).getAdminState()){
            return("Official admin!");
        }else{
            return("No admin!");
        }

    }

    public static void getAllSachbearbeiter(){
       /*
        Iterator<String> usernameIterator = username.iterator();
        Iterator<String> firstNameIterator = firstName.iterator();
        Iterator<String> lastNameIterator = lastName.iterator();
        Iterator<String> bdayIterator = bday.iterator();
        Iterator<Boolean> adminIterator = adminState.iterator();

            while(usernameIterator.hasNext()){
                System.out.print("Sachbearbeiter: ");
                System.out.print(firstNameIterator.next());//System.out.print(firstName.get(i));
                System.out.print(" ");
                System.out.print(lastNameIterator.next());// System.out.print(lastName.get(i));
                System.out.print(" | Geburtstag: ");
                System.out.print(bdayIterator.next());//System.out.print(bday.get(i));
                System.out.print(" | Benutzername: ");
                System.out.print(usernameIterator.next());//System.out.print(username.get(i));
                System.out.print(" | Admin: ");
                if(adminIterator.next()){System.out.print("Ja");}else{System.out.print("Nein");}
                System.out.println();


            }

        //}*/
    }
    public static void getSachbearbeiter(int index){
       /* System.out.println("Sachbearbeiter: ");
        System.out.println("--------------");
        System.out.print("Username: "); System.out.print(username.get(index)); System.out.println("");
        System.out.print("Vorname: "); System.out.print(firstName.get(index)); System.out.println("");
        System.out.print("Nachname: "); System.out.print(lastName.get(index)); System.out.println("");
        System.out.print("Geburtstag: "); System.out.print(bday.get(index)); System.out.println("");
        System.out.print("Admin: "); if(adminState.get(index)){System.out.print("Ja");}else{System.out.print("Nein");} System.out.println("");
        */

    }

    public static boolean getAdminState(int index){
        return users.get(index).getAdminState();
    }
    public void setUsername(int index, String usernameNew){
        users.get(index).setUsername(usernameNew);
    }
    public static void setPassword(int index, String passwordNew){
        users.get(index).setPassword(passwordNew);
    }
    public static void setFirstName(int index, String firstNameNew){
        users.get(index).setFirstName(firstNameNew);
    }
    public static void setLastName(int index, String lastNameNew){
        users.get(index).setLastName(lastNameNew);
    }
    public static void setBday(int index, String bdayNew){
        users.get(index).setBday(bdayNew);
    }
    public void changeAdminState(int index, Boolean permission){
        users.get(index).setAdminState(permission);
    }


    public static String getPassword(int index){
        return users.get(index).getPassword();
    }
/*
    public static void removeUsername(int index){
        username.remove(index);
    }
    public static void removePassword(int index){
        password.remove(index);
    }
    public static void removeFirstName(int index){
        firstName.remove(index);
    }
    public static void removeLastName(int index){
        lastName.remove(index);
    }
    public static void removeBday(int index){
        bday.remove(index);
    }
    public static void removeAdminState(int index){
        adminState.remove(index);
    }


    public static void addUsername(String value){
        username.add(value); }
    public static void addPassword(String value){
        password.add(value);
    }
    public static void addFirstName(String value){
        firstName.add(value);
    }
    public static void addLastName(String value){
        lastName.add(value);
    }
    public static void addBday(String value){
        bday.add(value);
    }
    public static void addAdminState(Boolean value){ adminState.add(value);}
    */




   /* public static void removeSachbearbeiter(int index){
        username.remove(index);
        password.remove(index);
        firstName.remove(index);
        lastName.remove(index);
        bday.remove(index);
        adminState.remove(index);
    }
*/
   public static void removeUser(int index){
       users.remove(index);
   }


    public static int ArrayPos(String searchWord){
        for (int i=0; i<users.size(); i++){
            if(users.get(i).getUsername().contains(searchWord)){
                return i;
            }else{
            //System.err.println("Dieser Sachbearbeiter ist nicht vorhanden!!!");
            }
        }





        return 0;
    }

}


