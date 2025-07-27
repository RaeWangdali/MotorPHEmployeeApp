/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.motorphemployeeapp.gui;

import com.motorph.motorphemployeeapp.controller.EmployeeManager;
import com.motorph.motorphemployeeapp.model.Employee;

import javax.swing.*;
import java.awt.*;

public class ComputeSalaryGUI extends JFrame {

    public ComputeSalaryGUI() {
        setTitle("Compute Salary");
        setSize(400, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JLabel idLabel = new JLabel("Employee ID:");
        JTextField idField = new JTextField(15);

        JLabel monthLabel = new JLabel("Month (MM):");
        JTextField monthField = new JTextField(5);

        JButton computeBtn = new JButton("Compute");

        JTextArea resultArea = new JTextArea(5, 30);
        resultArea.setEditable(false);

        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        inputPanel.add(idLabel); inputPanel.add(idField);
        inputPanel.add(monthLabel); inputPanel.add(monthField);
        inputPanel.add(new JLabel()); inputPanel.add(computeBtn);

        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(resultArea), BorderLayout.CENTER);

        computeBtn.addActionListener(e -> {
            String id = idField.getText().trim();
            String month = monthField.getText().trim();
            
            Employee emp = EmployeeManager.getEmployeeById(id);
            if (emp != null && !month.isEmpty()) {
                double base = 20000;  // Simplified for demo
                double deduction = 3000;
                double salary = base - deduction;

                resultArea.setText("Name: " + emp.getFullName() + "\n" +
                                   "Month: " + month + "\n" +
                                   "Base Salary: ₱" + base + "\n" +
                                   "Deductions: ₱" + deduction + "\n" +
                                   "Net Salary: ₱" + salary);
            } else {
                resultArea.setText("Employee not found or invalid input.");
            }
        });

        setVisible(true);
    }
}