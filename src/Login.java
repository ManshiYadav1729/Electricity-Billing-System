package electricity.billing.system;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{
    JTextField username,password;
    Choice loginchoice;
    JButton login,cancel,signin;
    Login(){
        super("Login Page");
        getContentPane().setBackground(Color.CYAN);
        ImageIcon profile = new ImageIcon(ClassLoader.getSystemResource("icon/profile.png"));
        Image profileone = profile.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon profileTwo = new ImageIcon(profileone);
        JLabel image = new JLabel(profileTwo);
        image.setBounds(5,5,250,250);
        add(image);


        JLabel username = new JLabel("User Name");
        add(username);
        username.setBounds(300,60,100,20);

        JTextField username1 = new JTextField();
        username1.setBounds(400,60,150,20);
        add(username1);

        JLabel password = new JLabel("Password");
        add(password);
        password.setBounds(300,100,100,20);

        JTextField password1 = new JTextField();
        password1.setBounds(400,100,150,20);
        add(password1);

        JLabel Login =  new JLabel("Login in AS");
        Login.setBounds(300,140,100,20);
        add(Login);
        Choice loginchoice = new Choice();
        loginchoice.add("Admin");
        loginchoice.add("Customerer");
        loginchoice.setBounds(400,140,150,20);
        add(loginchoice);

        JButton login = new JButton("Login");
        login.setBounds(400,180,100,20);
        add(login);

        JButton cancel = new JButton("Cancel");
        cancel.setBounds(510,180,100,20);
        add(cancel);

        JButton signup = new JButton("SignUp");
        signup.setBounds(450,215,100,20);
        add(signup);

        setSize(640,300);
        setLocation(500,250);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Login();
    }
}
