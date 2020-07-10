
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class MainFunc extends JFrame implements ActionListener{

    private static JLabel userLabel;
    private static JLabel passwordLabel;
    private static JTextField usernameTextField;
    private static JPasswordField passwordTextField;


    static loginAAS lgnAAS = new loginAAS();
    static loginK lK = new loginK();

    private JPanel mainPanel;

    public static void main(String[] args){





        // ****** Standard Admin und Sachbearbeiter anlegen ********

        sachbearbeiterCreateK sbCreateK = new sachbearbeiterCreateK();
        Sachbearbeiter sb = new Sachbearbeiter();
        sbCreateK.standartSachbearbeiterCreate();
        //sachbearbeiterCreateK.newSachbearbeiter("admin","admin","Max","Mustermann","2000-01-01",true);
        //sachbearbeiterCreateK.newSachbearbeiter("sachbearbeiter","sachbearbeiter","Leonie","Musterfrau","1998-03-02",false);


        sb.fortbildungen.add("BWL");
        sb.fortbildungen.add("Netzwerktechnik1");
        sb.fortbildungen.add("Netzwerktechnik2");


        System.out.println("***************** Hauptmenue *****************");
        System.out.println("");


        // ********************* PROGRAMM EINLOGGEN ***********************
        if(lK.loginID == 9999){
            //lgnAAS.login();
        }




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = usernameTextField.getText();
        System.out.println("Button clicked");
    }
}
