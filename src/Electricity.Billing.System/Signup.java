package  electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Signup extends JFrame {
    Choice loginascho;
    JTextField meterText,EmployerText,usernameText,nameText,passwordText;

    Signup(){
        super("SignUp Page");


        JLabel createas = new JLabel("Create Account As");
        createas.setBounds(30,50,125,20);
        add(createas);

        Choice loginascho = new Choice();
        loginascho.add("Admin");
        loginascho.add("Customer");
        loginascho.setBounds(170,50,120,20);
        add(loginascho);

        JLabel meterNo = new JLabel("Meter Number");
        meterNo.setBounds(30,100,125,20);
        meterNo.setVisible(false);
        add(meterNo);

        JTextField meterText = new JTextField();
        meterText.setBounds(170,100,125,20);
        meterText.setVisible(false);
        add(meterText);

        JLabel Employer = new JLabel("Employer ");
        Employer.setBounds(30,100,125,20);
        Employer.setVisible(true);
        add(Employer);

        JTextField EmployerText = new JTextField();
        EmployerText.setBounds(170,100,125,20);
        EmployerText.setVisible(true);
        add(EmployerText);

        JLabel username = new JLabel("UserName");
        username.setBounds(30,140,125,20);
        add(username);

        JTextField usernameText = new JTextField();
        usernameText.setBounds(170,140,125,20);
        add(usernameText);

        JLabel name = new JLabel("Name");
        name.setBounds(30,180,125,20);
        add(name);

        JTextField nameText = new JTextField();
        nameText.setBounds(170,180,125,20);
        add(nameText);

        JLabel password = new JLabel("Password");
        password.setBounds(30,220,125,20);
        add(password);

        JTextField passwordText = new JTextField();
        passwordText.setBounds(170,220,125,20);
        add(passwordText);

        loginascho.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String user = loginascho.getSelectedItem();
                if (user == "Customer"){
                    Employer.setVisible(false);
                    EmployerText.setVisible(false);
                    meterNo.setVisible(true);
                    meterText.setVisible(true);
                }else {
                    Employer.setVisible(true);
                    EmployerText.setVisible(true);
                    meterText.setVisible(false);
                    meterNo.setVisible(false);
                }
            }
        });

        JButton create = new JButton("Create");
        create.setBounds(40,285,100,25);
        add(create);

        setSize(600,380);
        setLocation(500,200);
        setLayout(null);
        setVisible(true);



    }


    public static void main(String[] args) {
        new Signup();
    }
}