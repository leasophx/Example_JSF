

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
import java.util.Scanner;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.annotation.RequestScope;



@Named("adminMenueAS")
@RequestScoped
public class adminMenueAS {
    int selectedIndex = 0;
    String text = "";
    String username = "";
    Scanner scanner = new Scanner(System.in);
    adminMenueK aMenueK = new adminMenueK();

    loginK lK = new loginK();
    loginAAS lKAAS = new loginAAS();

    sachbearbeiterCreateAS scas = new sachbearbeiterCreateAS();

    static Sachbearbeiter sb = new Sachbearbeiter();
    static adminMenueAS as = new adminMenueAS();
    static sachbearbeiterMenueAS sbas = new sachbearbeiterMenueAS();

    //static private JDialog dialogframe = new JDialog();

    public void selectedMenuItems(){

    }

    public void menue(){

        /*

        JMenu item1 = new JMenu("<html><h2 style='color: blue;'>My profile</h2></html>");
        JMenu item2 = new JMenu("<html><h2 style='color: blue;'>Create</h2></html>");
        JMenu item3 = new JMenu("<html><h2 style='color: blue;'>Edit</h2></html>");
        JMenu item4 = new JMenu("<html><h2 style='color: blue;'>Delete</h2></html>");
        JMenu item5 = new JMenu("<html><h2 style='color: red;'>Logout</h2></html>");
*/
        /*JMenuItem item2sub1 = new JMenuItem(); // Create Admin
        item2sub1.setText("Sachbearbeiter create");
        JMenuItem item2sub2 = new JMenuItem(); // Create Sachbearbeiter
        item2sub2.setText("Administrator create");

        JMenuItem item3sub1 = new JMenuItem();
        item3sub1.setText("Change own profile");
        JMenuItem item3sub2 = new JMenuItem();
        item3sub2.setText("Change other profile");

         */

/*

        item1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showOwnProfile();
            }
        });
        item2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeWindow();
                sachbearbeiterCreateAS scas = new sachbearbeiterCreateAS();
                scas.create();
                System.out.println("----------------------");
                System.out.println("Sachbearbeiter create clicked");
            }
        });
        item3sub1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                closeWindow();
                sachbearbeiterChangeAAS sbcas = new sachbearbeiterChangeAAS();
                sbcas.changeOwnProfile();
                System.out.println("----------------------");
                System.out.println("Sachbearbeiter change own profile clicked");
            }
        });
        item3sub2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                closeWindow();
                sachbearbeiterChangeAAS sbcas = new sachbearbeiterChangeAAS();
                sbcas.change();
                System.out.println("----------------------");
                System.out.println("Sachbearbeiter change clicked");
            }
        });
        item4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeWindow();
                sachbearbeiterDeleteAS sbdas = new sachbearbeiterDeleteAS();
                sbdas.delete();
                System.out.println("----------------------");
                System.out.println("Sachbearbeiter delete clicked");
            }
        });
        item5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeWindow();
                loginAAS lAAS = new loginAAS();
                selectedIndex = -1;
                lK.loginID = 9999;
                lAAS.startInitialize(false);
                lAAS.login();
                System.out.println("----------------------");
                System.out.println("Logout");
            }
        });

        */


        //dialogframe.add(bar);
        //dialogframe.setVisible(true);

        //item1.setSelected(true); // Select MyProfile at Startup
        //showOwnProfile();



/*
        System.out.println();
        System.out.println("***************** Hauptmenue *****************");
        System.out.println("");
        System.out.println("Bitte waehlen Sie aus:");

        System.out.println("1 - Sachbearbeiter erstellen");
        System.out.println("2 - Sachbearbeiter aendern");
        System.out.println("3 - Sachbearbeiter loeschen");
        System.out.println("4 - Sachbearbeiter AdminStatus aendern");
        System.out.println("5 - Logout");
        System.out.println("");
        System.out.print("Auswahl: ");
        selectedIndex = scanner.nextInt();

        if(selectedIndex == 1){
            aMenueK.createSachbearbeiter();
        }
        if(selectedIndex == 2){
            aMenueK.changeSachbearbeiter();
        }
        if(selectedIndex == 3){
            System.out.println("Delete");
            System.out.println("***************");
            System.out.print("Geben Sie den Benutzernamen ein: "); text = scanner.next();
            aMenueK.deleteSachbearbeiter(text);
            if(sb.getAdminState(lK.loginID)){
                as.menue();//as.menue();
            }else{
                sbas.menue();
            }
        }
        if(selectedIndex == 4){
            System.out.println("Adminstatus aendern von Sachbearbeiter");
            System.out.println("***************");

            System.out.print("Geben Sie den Benutzernamen ein: "); username = scanner.next();
            System.out.print("Soll dieser Sachbearbeiter Admin sein? (ja/nein): "); text = scanner.next();
            if(text.equals("ja")){aMenueK.changeAdminStatus(username,true);}else{aMenueK.changeAdminStatus(username,false);}

            if(sb.getAdminState(lK.loginID)){
                as.menue();//as.menue();
            }else{
                sbas.menue();
            }

        }
        if(selectedIndex == 5){
            selectedIndex = -1;
            lK.loginID = 9999;
            lKAAS.login();
        }
*/
    }

    public void closeWindow(){
        //dialogframe.dispose();
    }


    public void showOwnProfile(){
        System.out.println("----------------------");
        System.out.println("Own profile clicked");

        /*JLabel header = new JLabel("<html><h1 style='color: teal;'>My personal information</h1></html>");
        JLabel usernameDescriptionLabel = new JLabel("<html><div style='font-weight: bold;'>Username:</div>");
        JLabel usernameLabel = new JLabel(sb.getUserName(lK.loginID));
        JLabel firstNameDescriptionLabel = new JLabel("<html><div style='font-weight: bold;'>First name:</div>");
        JLabel firstNameLabel = new JLabel(sb.getFirstName(lK.loginID));
        JLabel lastNameDescriptionLabel = new JLabel("<html><div style='font-weight: bold;'>Last name:</div>");
        JLabel lastNameLabel = new JLabel(sb.getLastName(lK.loginID));
        JLabel bdayDescriptionLabel = new JLabel("<html><div style='font-weight: bold;'>Bday:</div>");
        JLabel bdayLabel = new JLabel(sb.getBday(lK.loginID));
        JLabel adminStateDescriptionLabel = new JLabel("<html><div style='font-weight: bold;'>Admin-State:</div>");
        JLabel adminStateLabel = new JLabel(sb.getAdminState2(lK.loginID));*/





    }

    public void showUserList(){

    }

}
