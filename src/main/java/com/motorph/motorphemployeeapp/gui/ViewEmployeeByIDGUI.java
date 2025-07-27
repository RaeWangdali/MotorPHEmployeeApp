/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.motorphemployeeapp.gui;

import com.motorph.motorphemployeeapp.controller.EmployeeManager;
import com.motorph.motorphemployeeapp.model.Employee;

import javax.swing.*;
import java.awt.*;

public class ViewEmployeeByIDGUI extends JFrame {

    public ViewEmployeeByIDGUI() {
        setTitle("View Employee By ID");
        setSize(400, 250);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel idLabel = new JLabel("Employee ID:");
        JTextField idField = new JTextField(15);
        JButton viewBtn = new JButton("View");

        JTextArea resultArea = new JTextArea(7, 30);
        resultArea.setEditable(false);

        JPanel inputPanel = new JPanel();
        inputPanel.add(idLabel);
        inputPanel.add(idField);
        inputPanel.add(viewBtn);
        
        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(resultArea), BorderLayout.CENTER);

        viewBtn.addActionListener(e -> {
            String id = idField.getText().trim();
            Employee emp = EmployeeManager.getEmployeeById(id);

            if (emp != null) {
                resultArea.setText("ID: " + emp.getEmployeeID() + "\n" +
                                   "Name: " + emp.getFullName() + "\n" +
                                   "Department: " + emp.getDepartment() + "\n" +
                                   "Position: " + emp.getPosition() + "\n" );
            } else {
                resultArea.setText("Employee not found.");
            }
        });

        setVisible(true);
    }
}