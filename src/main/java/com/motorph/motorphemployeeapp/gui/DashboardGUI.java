/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.motorphemployeeapp.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DashboardGUI extends JFrame {

    public DashboardGUI() {
        setTitle("MotorPH Dashboard");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JButton viewAllBtn = new JButton("View All Employees");
        JButton viewByIdBtn = new JButton("View Employee by ID");
        JButton addBtn = new JButton("Add New Employee");
        JButton computeBtn = new JButton("Compute Salary");

        viewAllBtn.addActionListener(e -> new EmployeeTableGUI());
        viewByIdBtn.addActionListener(e -> new ViewEmployeeByIDGUI());
        addBtn.addActionListener(e -> new AddEmployeeGUI());
        computeBtn.addActionListener(e -> new ComputeSalaryGUI());

        add(viewAllBtn);
        add(viewByIdBtn);
        add(addBtn);
        add(computeBtn);
        
         setVisible(true);
    }
}
