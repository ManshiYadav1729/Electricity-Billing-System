package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JTextField usernameField, passwordField;
    Choice loginchoice;
    JButton login, cancel, signup;

    Login() {
        super("Login Page");
        getContentPane().setBackground(Color.CYAN);

        ImageIcon profile = new ImageIcon(ClassLoader.getSystemResource("icon/profile.png"));
        Image profileImage = profile.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon profileTwo = new ImageIcon(profileImage);
        JLabel image = new JLabel(profileTwo);
        image.setBounds(5, 5, 250, 250);
        add(image);

        JLabel usernameLabel = new JLabel("User Name");
        usernameLabel.setBounds(300, 60, 100, 20);
        add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(400, 60, 150, 20);
        add(usernameField);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(300, 100, 100, 20);
        add(passwordLabel);

        passwordField = new JTextField();
        passwordField.setBounds(400, 100, 150, 20);
        add(passwordField);

        JLabel loginLabel = new JLabel("Login in AS");
        loginLabel.setBounds(300, 140, 100, 20);
        add(loginLabel);

        loginchoice = new Choice();
        loginchoice.add("Admin");
        loginchoice.add("Customer");
        loginchoice.setBounds(400, 140, 150, 20);
        add(loginchoice);

        login = new JButton("Login");
        login.setBounds(400, 180, 100, 20);
        login.addActionListener(this);
        add(login);

        cancel = new JButton("Cancel");
        cancel.setBounds(510, 180, 100, 20);
        cancel.addActionListener(this);
        add(cancel);

        signup = new JButton("SignUp");
        signup.setBounds(450, 215, 100, 20);
        signup.addActionListener(this);
        add(signup);

        setSize(640, 300);
        setLocation(500, 250);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            // Handle login action
        } else if (e.getSource() == cancel) {
            setVisible(false);
        } else if (e.getSource() == signup) {
            setVisible(false);
            new Signup();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JTextField usernameField, passwordField;
    Choice loginchoice;
    JButton login, cancel, signup;

    Login() {
        super("Login Page");
        getContentPane().setBackground(Color.CYAN);

        ImageIcon profile = new ImageIcon(ClassLoader.getSystemResource("icon/profile.png"));
        Image profileImage = profile.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon profileTwo = new ImageIcon(profileImage);
        JLabel image = new JLabel(profileTwo);
        image.setBounds(5, 5, 250, 250);
        add(image);

        JLabel usernameLabel = new JLabel("User Name");
        usernameLabel.setBounds(300, 60, 100, 20);
        add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(400, 60, 150, 20);
        add(usernameField);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(300, 100, 100, 20);
        add(passwordLabel);

        passwordField = new JTextField();
        passwordField.setBounds(400, 100, 150, 20);
        add(passwordField);

        JLabel loginLabel = new JLabel("Login in AS");
        loginLabel.setBounds(300, 140, 100, 20);
        add(loginLabel);

        loginchoice = new Choice();
        loginchoice.add("Admin");
        loginchoice.add("Customer");
        loginchoice.setBounds(400, 140, 150, 20);
        add(loginchoice);

        login = new JButton("Login");
        login.setBounds(400, 180, 100, 20);
        login.addActionListener(this);
        add(login);

        cancel = new JButton("Cancel");
        cancel.setBounds(510, 180, 100, 20);
        cancel.addActionListener(this);
        add(cancel);

        signup = new JButton("SignUp");
        signup.setBounds(450, 215, 100, 20);
        signup.addActionListener(this);
        add(signup);

        setSize(640, 300);
        setLocation(500, 250);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            // Handle login action
        } else if (e.getSource() == cancel) {
            setVisible(false);
        } else if (e.getSource() == signup) {
            setVisible(false);
            new Signup();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
