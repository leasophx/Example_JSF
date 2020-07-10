
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.Color;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.MouseListener;


public class sachbearbeiterDeleteAS {

    static private JDialog dialogframe;



    public void delete(){





      /*

        dialogframe = new JDialog();
        dialogframe.setLayout(null);

        dialogframe.setTitle("Delete Sachbearbeiter");
        dialogframe.setLocation(20,40);
        dialogframe.setPreferredSize(new Dimension(800,600));
        dialogframe.setMinimumSize(new Dimension(600,450));

        JLabel header = new JLabel("<html><h1 style='color: teal;'>Delete Sachbearbeiter</h1></html>");
        ArrayList myUsers = new ArrayList();
        for(int i=0; i<sb.getNumberUser(); i++){
            myUsers.add("<html>" + "<b>Username:</b> " + sb.getUserName(i) + ", <b>First name:</b> " + sb.getFirstName(i) + ", <b>Last name:</b> " + sb.getLastName(i) + ", <b>Admin-State:</b> " + sb.getAdminState2(i) +  "</html>");
        }

        JList userList = new JList(myUsers.toArray());
        JButton backButton = new JButton("Back");
        JButton deleteButton = new JButton("Delete");

        backButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent newLogin){
                adminMenueAS as = new adminMenueAS();
                dialogframe.dispose();
                as.menue();
                System.out.println("----------------------");
                System.out.println("Back button pressed");
            }
        });
        deleteButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent newLogin){
                sachbearbeiterDeleteK sbdK = new sachbearbeiterDeleteK();
                loginK lK = new loginK();

                if(!userList.isSelectionEmpty()){
                    if(userList.getSelectedIndex() != (lK.loginID)){
                        sbdK.removeSachbearbeiter(userList.getSelectedIndex());
                    }
                }
                adminMenueAS as = new adminMenueAS();
                dialogframe.dispose();
                as.menue();
                System.out.println("----------------------");
                System.out.println("Delete button pressed");
            }
        });

        userList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
               // changeUser(userList.getSelectedIndex());
            }
        });


        dialogframe.add(header);
        dialogframe.add(userList);
        dialogframe.add(backButton);
        dialogframe.add(deleteButton);

        header.setBounds(10,50,dialogframe.getWidth(),25);
        userList.setBounds(10,100,dialogframe.getWidth(),200);
        backButton.setBounds(10,350,80,25);
        deleteButton.setBounds(100,350,80,25);

        dialogframe.setVisible(true);


*/
    }
}
