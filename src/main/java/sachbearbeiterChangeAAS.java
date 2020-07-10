
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class sachbearbeiterChangeAAS {
    int selectedIndex = 0;
    String selectedUsername = " ";
    String text = "";
    Scanner scanner = new Scanner(System.in);


    static sachbearbeiterK sbk = new sachbearbeiterK();
    static Sachbearbeiter sb = new Sachbearbeiter();
    static adminMenueAS as = new adminMenueAS();
    static sachbearbeiterMenueAS sbas = new sachbearbeiterMenueAS();
    static loginK lK = new loginK();

    static private JDialog dialogframe;

    public void change(){

        dialogframe = new JDialog();
        dialogframe.setLayout(null);

        dialogframe.setTitle("Change Sachbearbeiter");
        dialogframe.setLocation(20,40);
        dialogframe.setPreferredSize(new Dimension(800,600));
        dialogframe.setMinimumSize(new Dimension(600,450));

        JLabel header = new JLabel("<html><h1 style='color: teal;'>Change Sachbearbeiter</h1></html>");
        ArrayList myUsers = new ArrayList();
        for(int i=0; i<sb.getNumberUser(); i++){
            myUsers.add("<html>" + "<b>Username:</b> " + sb.getUserName(i) + ", <b>First name:</b> " + sb.getFirstName(i) + ", <b>Last name:</b> " + sb.getLastName(i) + ", <b>Admin-State:</b> " + sb.getAdminState2(i) +  "</html>");
        }

        JList userList = new JList(myUsers.toArray());
        JButton backButton = new JButton("Back");

       /* backButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent newLogin){
                dialogframe.dispose();
                as.menue();
                System.out.println("----------------------");
                System.out.println("Back button pressed");
            }
        });

        userList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                dialogframe.removeAll();
                dialogframe.repaint();
                dialogframe.dispose();
                changeUser(userList.getSelectedIndex());
            }
        });

        dialogframe.add(header);
        dialogframe.add(userList);
        dialogframe.add(backButton);

        header.setBounds(10,50,dialogframe.getWidth(),25);
        userList.setBounds(10,100,dialogframe.getWidth(),200);
        backButton.setBounds(10,350,80,25);

        dialogframe.setVisible(true);
        */

    }

    public void changeOwnProfile(){



      /*  dialogframe = new JDialog();
        dialogframe.setLayout(null);

        dialogframe.setTitle("Create new Sachbearbeiter");
        dialogframe.setLocation(20,40);
        dialogframe.setPreferredSize(new Dimension(800,600));
        dialogframe.setMinimumSize(new Dimension(600,450));

        JLabel header = new JLabel("<html><h1 style='color: teal;'>Change Sachbearbeiter</h1></html>");
        JLabel usernameLabel = new JLabel("<html><div style='font-weight: bold;'>Username:</div>");
        JLabel passwordLabel = new JLabel("<html><div style='font-weight: bold;'>Password:</div>");
        JLabel firstNameLabel = new JLabel("<html><div style='font-weight: bold;'>First name:</div>");
        JLabel lastNameLabel = new JLabel("<html><div style='font-weight: bold;'>Last name:</div>");
        JLabel bdayLabel = new JLabel("<html><div style='font-weight: bold;'>Bday:</div>");

        JTextField usernameTextField = new JTextField(20);
        JTextField passwordTextField = new JTextField(20);
        JTextField firstNameTextField = new JTextField(20);
        JTextField lastNameTextField = new JTextField(20);
        JTextField bdayTextField = new JTextField(20);
        JButton cancelButton = new JButton("Cancel");
        JButton changeButton = new JButton("Change");

        usernameTextField.setText(sb.getUserName(lK.loginID));
        passwordTextField.setText(sb.getPassword(lK.loginID));
        firstNameTextField.setText(sb.getFirstName(lK.loginID));
        lastNameTextField.setText(sb.getLastName(lK.loginID));
        bdayTextField.setText(sb.getBday(lK.loginID));


        cancelButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent cancel){
                dialogframe.removeAll();
                dialogframe.repaint();
                dialogframe.dispose();
                as.menue();
            }
        });
        changeButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent cancel){
                dialogframe.removeAll();
                dialogframe.repaint();
                dialogframe.dispose();
                sb.setUsername(lK.loginID,usernameTextField.getText());
                sb.setPassword(lK.loginID,passwordTextField.getText());
                sb.setFirstName(lK.loginID,firstNameTextField.getText());
                sb.setLastName(lK.loginID,lastNameTextField.getText());
                sb.setBday(lK.loginID,bdayTextField.getText());

                as.menue();
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
        cancelButton.setBounds(10,300,80,25);
        changeButton.setBounds(100,300,80,25);


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
        dialogframe.add(cancelButton);
        dialogframe.add(changeButton);


        dialogframe.setVisible(true);

        */
    }

    public void changeUser(Integer userIndex){
/*
        System.out.println(userIndex);
        dialogframe = new JDialog();
        dialogframe.setLayout(null);

        dialogframe.setTitle("Change Sachbearbeiter");
        dialogframe.setLocation(20,40);
        dialogframe.setPreferredSize(new Dimension(800,600));
        dialogframe.setMinimumSize(new Dimension(600,450));

        JLabel header = new JLabel("<html><h1 style='color: teal;'>Change Sachbearbeiter</h1></html>");
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
        JButton changeButton = new JButton("Change");

        usernameTextField.setText(sb.getUserName(userIndex));
        passwordTextField.setText(sb.getPassword(userIndex));
        firstNameTextField.setText(sb.getFirstName(userIndex));
        lastNameTextField.setText(sb.getLastName(userIndex));
        bdayTextField.setText(sb.getBday(userIndex));
        adminCheckBox.setSelected(sb.getAdminState(userIndex));


        cancelButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent cancel){
                dialogframe.removeAll();
                dialogframe.repaint();
                dialogframe.dispose();
                change();
            }
        });
        changeButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent cancel){
                dialogframe.removeAll();
                dialogframe.repaint();
                dialogframe.dispose();
                sb.setUsername(userIndex,usernameTextField.getText());
                sb.setPassword(userIndex,passwordTextField.getText());
                sb.setFirstName(userIndex,firstNameTextField.getText());
                sb.setLastName(userIndex,lastNameTextField.getText());
                sb.setBday(userIndex,bdayTextField.getText());
                sb.changeAdminState(userIndex,adminCheckBox.isSelected());

                change();
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
        changeButton.setBounds(100,300,80,25);


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
        dialogframe.add(changeButton);


        dialogframe.setVisible(true);


 */
    }




}
