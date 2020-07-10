
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class sachbearbeiterCreateAS {
    String text;
    String username;
    String password;
    String firstName;
    String lastName;
    String bday;
    Boolean admin;

    Scanner scanner = new Scanner(System.in);
    static sachbearbeiterCreateK sbck = new sachbearbeiterCreateK();
    static sachbearbeiterK sbk = new sachbearbeiterK();
    static Sachbearbeiter sb = new Sachbearbeiter();
    static adminMenueAS as = new adminMenueAS();
    static sachbearbeiterMenueAS sbas = new sachbearbeiterMenueAS();
    static loginK lK = new loginK();

    static private JDialog dialogframe;


    public void create(){


     /*   dialogframe = new JDialog();
        dialogframe.setLayout(null);

        dialogframe.setTitle("Create new Sachbearbeiter");
        dialogframe.setLocation(20,40);
        dialogframe.setPreferredSize(new Dimension(800,600));
        dialogframe.setMinimumSize(new Dimension(600,450));

        JLabel header = new JLabel("<html><h1 style='color: teal;'>Create new Sachbearbeiter</h1></html>");
        JLabel usernameLabel = new JLabel("<html><div style='font-weight: bold;'>Username:</div>");
        JLabel passwordLabel = new JLabel("<html><div style='font-weight: bold;'>Password:</div>");
        JLabel firstNameLabel = new JLabel("<html><div style='font-weight: bold;'>First name:</div>");
        JLabel lastNameLabel = new JLabel("<html><div style='font-weight: bold;'>Last name:</div>");
        JLabel bdayLabel = new JLabel("<html><div style='font-weight: bold;'>Bday:</div>");
        JLabel adminLabel = new JLabel("<html><div style='font-weight: bold;'>Admin:</div>");

        JTextField usernameTextField = new JTextField(20);
        JTextField passwordTextField = new JTextField(20);
        JTextField firstNameTextField = new JTextField(20);
        JTextField lastNameTextField = new JTextField(20);
        JTextField bdayTextField = new JTextField(20);
        JCheckBox adminCheckBox = new JCheckBox();
        JButton cancelButton = new JButton("Cancel");
        JButton createButton = new JButton("Create");



        cancelButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent newLogin){
               dialogframe.dispose();
               as.menue();
               System.out.println("----------------------");
               System.out.println("Cancel button pressed");
            }
        });
        createButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent newLogin){
                dialogframe.dispose();
                sbck.newSachbearbeiter(usernameTextField.getText(),passwordTextField.getText(),firstNameTextField.getText(),lastNameTextField.getText(),bdayTextField.getText(),adminCheckBox.isSelected());
                as.menue();
                System.out.println("----------------------");
                System.out.println("Create button pressed");
            }
        });


        header.setBounds(10,50,dialogframe.getWidth(),25);
        usernameLabel.setBounds(10,100,80,25);
        usernameTextField.setBounds(100,100,165,25);
        passwordLabel.setBounds(10,130,80,25);
        passwordTextField.setBounds(100,130,165,25);
        firstNameLabel.setBounds(10,160,80,25);
        firstNameTextField.setBounds(100,160,165,25);
        lastNameLabel.setBounds(10,190,80,25);
        lastNameTextField.setBounds(100,190,165,25);
        bdayLabel.setBounds(10,220,80,25);
        bdayTextField.setBounds(100,220,165,25);
        adminLabel.setBounds(10,250,80,25);
        adminCheckBox.setBounds(100,250,165,25);
        cancelButton.setBounds(10,300,80,25);
        createButton.setBounds(100,300,80,25);


        dialogframe.add(header);
        dialogframe.add(usernameLabel);
        dialogframe.add(usernameTextField);
        dialogframe.add(passwordLabel);
        dialogframe.add(passwordTextField);
        dialogframe.add(firstNameLabel);
        dialogframe.add(firstNameTextField);
        dialogframe.add(lastNameLabel);
        dialogframe.add(lastNameTextField);
        dialogframe.add(bdayLabel);
        dialogframe.add(bdayTextField);
        dialogframe.add(adminLabel);
        dialogframe.add(adminCheckBox);
        dialogframe.add(cancelButton);
        dialogframe.add(createButton);


        dialogframe.setVisible(true);

    */



     /*   alt System.out.println("Neuen Sachbearbeiter anlegen");

        System.out.print("Geben Sie den Benutzernamen ein: "); username = scanner.next();
        System.out.print("Geben Sie das Passwort ein: "); password = scanner.next();
        System.out.print("Geben Sie den Vornamen ein: "); firstName = scanner.next();
        System.out.print("Geben Sie den Nachnamen ein: "); lastName = scanner.next();
        System.out.print("Geben Sie das Geburtsdatum ein: "); bday = scanner.next();
        System.out.print("Soll der Sachbearbeiter Admin-Rechte haben: (ja/nein): "); text = scanner.next(); if(text.equals("ja")){admin = true;}else{admin = false;} System.out.println();


        sbck.newSachbearbeiter(username,password,firstName,lastName,bday,admin);
*/
       /* if(sb.getAdminState(lK.loginID)){
            as.menue();//as.menue();
        }else{
            sbas.menue();
        }*/

    }

}
