package com.motorph.motorphemployeeapp.gui;

import com.motorph.motorphemployeeapp.model.Employee;
import com.motorph.motorphemployeeapp.controller.EmployeeManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddEmployeeGUI extends JFrame {

    private JTextField idField, firstNameField, lastNameField, birthdayField, addressField, phoneField;
    private JTextField departmentField, positionField, supervisorField, statusField, dateHiredField, hoursWorkedField;

    public AddEmployeeGUI() {
        setTitle("Add New Employee");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(13, 2, 10, 5));

        add(new JLabel("Employee ID:"));
        idField = new JTextField();
        add(idField);

        add(new JLabel("First Name:"));
        firstNameField = new JTextField();
        add(firstNameField);

        add(new JLabel("Last Name:"));
        lastNameField = new JTextField();
        add(lastNameField);

        add(new JLabel("Birthday:"));
        birthdayField = new JTextField();
        add(birthdayField);

        add(new JLabel("Address:"));
        addressField = new JTextField();
        add(addressField);

        add(new JLabel("Phone Number:"));
        phoneField = new JTextField();
        add(phoneField);

        add(new JLabel("Department:"));
        departmentField = new JTextField();
        add(departmentField);

        add(new JLabel("Position:"));
        positionField = new JTextField();
        add(positionField);

        add(new JLabel("Supervisor:"));
        supervisorField = new JTextField();
        add(supervisorField);

        add(new JLabel("Status:"));
        statusField = new JTextField();
        add(statusField);

        add(new JLabel("Date Hired:"));
        dateHiredField = new JTextField();
        add(dateHiredField);

        add(new JLabel("Hours Worked:"));
        hoursWorkedField = new JTextField();
        add(hoursWorkedField);

        JButton addButton = new JButton("Add Employee");
        add(addButton);
        add(new JLabel()); // placeholder to fill the grid

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String employeeID = idField.getText();
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                String birthday = birthdayField.getText();
                String address = addressField.getText();
                String phone = phoneField.getText();
                String department = departmentField.getText();
                String position = positionField.getText();
                String supervisor = supervisorField.getText();
                String status = statusField.getText();
                String dateHired = dateHiredField.getText();
                String hoursWorked = hoursWorkedField.getText();

                Employee newEmployee = new Employee(
                        employeeID,
                        firstName,
                        lastName,
                        birthday,
                        address,
                        phone,
                        department,
                        position,
                        supervisor,
                        status,
                        dateHired,
                        hoursWorked
                );

                EmployeeManager.addEmployee(newEmployee);

                JOptionPane.showMessageDialog(AddEmployeeGUI.this, "Employee added successfully!");
                dispose(); // Close the window after adding
            }
        });

        setVisible(true);
    }
}
