
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;


public class loginAAS implements ActionListener{
    private String username = "";
    private String password = "";

    private static JLabel userLabel;
    private static JLabel passwordLabel;
    private static JTextField usernameTextField;
    private static JPasswordField passwordTextField;

    private static JPanel panel = new JPanel();
    private static JFrame frame = new JFrame();

    private static loginK lK = new loginK();

    private static boolean loginFail;

    public void startInitialize(Boolean wert){
        loginFail = wert;
    }
    public void setloginFail(boolean wert, String username, String password){
      /*  loginFail = wert;
        this.username = username;
        this.password = password;

        JDialog loginFailWindow = new JDialog();
        loginFailWindow.setLayout(null);

        loginFailWindow.setTitle("Login error");
        loginFailWindow.setLocation(20,40);
        loginFailWindow.setPreferredSize(new Dimension(800,600));
        loginFailWindow.setMinimumSize(new Dimension(600,450));
        loginFailWindow.setVisible(true);
        loginFailWindow.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JLabel headerText = new JLabel("<html><h1>Check your inserts!</h1></html>");
        headerText.setBounds(10,50,400,50);

        JLabel inputName = new JLabel("<html><b>Last input Username:</b> " + username + "</html>");
        JLabel inputPass = new JLabel("<html><b>Last input Password:</b> " + password + "</html>");
        inputName.setBounds(10,100,350,25);
        inputPass.setBounds(10,120,350,25);

        JButton readButton = new JButton();
        readButton.setBounds(10,210,110,25);
        readButton.setBackground(Color.red);


        readButton.setText("<html><div style='color: blue;'>Okay</div></html>");
        readButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent newLogin){
                loginFailWindow.dispose();
                login();
            }

        });

        loginFailWindow.add(headerText);
        loginFailWindow.add(inputName);
        loginFailWindow.add(inputPass);
        loginFailWindow.add(readButton);

       */
    }

    public void closeWindow(){
        //frame.dispose();
    }

    public void login(){

      /*  panel.removeAll();
        panel.repaint();

        frame.setPreferredSize(new Dimension(800,600));
        frame.setMinimumSize(new Dimension(600,450));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);
        panel.setLayout(null);


        JLabel title = new JLabel();
        title.setFont (title.getFont().deriveFont(60.0f));
        title.setBounds(10,20,frame.getWidth(),90);
        title.setText("<html><div style='color: teal;'>Login</div></br><div style='background-color: teal; height: 2px; width: 300px'></div></html>");
        panel.add(title);


        // ******* Username Label *********
        userLabel = new JLabel("<html><b>Username:</b></html> ");
        userLabel.setBounds(10,150,80,25);
        panel.add(userLabel);
        // ******* Username Text Field *********
        usernameTextField = new JTextField(20);
        usernameTextField.setBounds(100,150,165,25);
        panel.add(usernameTextField);

        // ******* Password Label *********
        passwordLabel = new JLabel("<html><b>Password:</b></html> ");
        passwordLabel.setBounds(10,180,80,25);
        panel.add(passwordLabel);
        // ******* Password Text Field *********
        passwordTextField = new JPasswordField(20);
        passwordTextField.setBounds(100,180,165,25);
        panel.add(passwordTextField);

        // ******* Login Button *********
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10,210,80,25);
        loginButton.addActionListener(new loginAAS());
        panel.add(loginButton);

        JLabel textFail = new JLabel();
        textFail.setText("<html><p style='color: red;'>Last inputs not correct!!!</p></html>");
        textFail.setBounds(10,250,200,25);
        if(loginFail){
            panel.add(textFail);
        }





        frame.setVisible(true);


    */


        /*   System.out.println("Einloggen: ");
        System.out.println("**********");
        System.out.print("Geben Sie Ihren Benutzernamen ein: "); username = scanner.nextLine();
        System.out.print("Geben Sie Ihr Passwort ein: "); password = scanner.nextLine(); System.out.println();
        System.out.println(username);
        lK.checkLoginData(username,password);
*/
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        panel.removeAll();
        panel.repaint();
        System.out.println("----------------------");
        System.out.println("Login Button Pressed");
        System.out.println("----------------------");
        System.out.println("Userinformation:");
        username = usernameTextField.getText();
        password = passwordTextField.getText();
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("----------------------");


        //lK.checkLoginData(username,password);


    }







}
