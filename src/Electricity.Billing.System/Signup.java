package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Signup extends JFrame implements ActionListener {
    Choice loginascho;
    JTextField meterText, EmployerText, usernameText, nameText, passwordText;
    JButton create, back;

    Signup() {
        super("SignUp Page");
        getContentPane().setBackground(new Color(168, 203, 255));

        JLabel createas = new JLabel("Create Account As");
        createas.setBounds(30, 50, 125, 20);
        add(createas);

        loginascho = new Choice();
        loginascho.add("Admin");
        loginascho.add("Customer");
        loginascho.setBounds(170, 50, 120, 20);
        add(loginascho);

        JLabel meterNo = new JLabel("Meter Number");
        meterNo.setBounds(30, 100, 125, 20);
        meterNo.setVisible(false);
        add(meterNo);

        meterText = new JTextField();
        meterText.setBounds(170, 100, 125, 20);
        meterText.setVisible(false);
        add(meterText);

        JLabel Employer = new JLabel("Employer ");
        Employer.setBounds(30, 100, 125, 20);
        add(Employer);

        EmployerText = new JTextField();
        EmployerText.setBounds(170, 100, 125, 20);
        add(EmployerText);

        JLabel username = new JLabel("UserName");
        username.setBounds(30, 140, 125, 20);
        add(username);

        usernameText = new JTextField();
        usernameText.setBounds(170, 140, 125, 20);
        add(usernameText);

        JLabel name = new JLabel("Name");
        name.setBounds(30, 180, 125, 20);
        add(name);

        nameText = new JTextField();
        nameText.setBounds(170, 180, 125, 20);
        add(nameText);

        JLabel password = new JLabel("Password");
        password.setBounds(30, 220, 125, 20);
        add(password);

        passwordText = new JTextField();
        passwordText.setBounds(170, 220, 125, 20);
        add(passwordText);

        loginascho.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String user = loginascho.getSelectedItem();
                if (user.equals("Customer")) {
                    Employer.setVisible(false);
                    EmployerText.setVisible(false);
                    meterNo.setVisible(true);
                    meterText.setVisible(true);
                } else {
                    Employer.setVisible(true);
                    EmployerText.setVisible(true);
                    meterText.setVisible(false);
                    meterNo.setVisible(false);
                }
            }
        });

        create = new JButton("Create");
        create.setBackground(new Color(66, 127, 219));
        create.setForeground(Color.BLACK);
        create.setBounds(50, 285, 100, 25);
        create.addActionListener(this);
        add(create);

        back = new JButton("Back");
        back.setBackground(new Color(66, 127, 219));
        back.setBounds(180, 285, 100, 25);
        back.addActionListener(this);
        add(back);

        ImageIcon boyIcon = new ImageIcon(ClassLoader.getSystemResource("icon/boy.png"));
        Image bouImg = boyIcon.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon boyicon2 = new ImageIcon(bouImg);
        JLabel boyLabel = new JLabel(boyicon2);
        boyLabel.setBounds(320, 30, 250, 250);
        add(boyLabel);

        setSize(600, 380);
        setLocation(500, 200);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == create) {
            String slogins = loginascho.getSelectedItem();
            String susername = usernameText.getText();
            String sname = nameText.getText();
            String spassword = passwordText.getText();
            String smeter = meterText.getText();
            try{
                database c = new database();
                String query = null;
                query = "insert into signup value('"+smeter+"','"+susername+"','"+sname+"','"+spassword+"','"+slogins+"')";
                c.statement.executeUpdate(query);

                JOptionPane.showMessageDialog(null,"Account created succesfully");
                setVisible(false);
                new Login();
                
            }catch(Exception E){
                E.printStackTrace();
            }
        } else if (e.getSource() == back) {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
