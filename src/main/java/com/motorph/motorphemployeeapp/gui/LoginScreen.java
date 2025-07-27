/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.motorphemployeeapp.gui;

import com.motorph.motorphemployeeapp.controller.AuthManager;
import com.motorph.motorphemployeeapp.model.Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen extends JFrame {

    private JTextField lastNameField;
    private JTextField firstNameField;

    public LoginScreen() {
        setTitle("MotorPH Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350, 200);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Last Name:"));
        lastNameField = new JTextField();
        add(lastNameField);

        add(new JLabel("First Name:"));
        firstNameField = new JTextField();
        add(firstNameField);

        JButton loginBtn = new JButton("Login");
        loginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String lastName = lastNameField.getText().trim();
                String firstName = firstNameField.getText().trim();

                Login login = new Login(lastName, firstName);
                boolean success = AuthManager.authenticate(login);
                
              if (success) {
                    JOptionPane.showMessageDialog(LoginScreen.this, "Login Successful!");
                    dispose(); // close login window
                    new DashboardGUI(); // open dashboard
                } else {
                    JOptionPane.showMessageDialog(LoginScreen.this, "Login Failed. Try again.");
                }
            }
        });
        add(new JLabel()); // empty label for spacing
        add(loginBtn);

        setVisible(true);
    }
}  