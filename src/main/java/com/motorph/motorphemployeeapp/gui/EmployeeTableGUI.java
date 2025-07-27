package com.motorph.motorphemployeeapp.gui;

import com.motorph.motorphemployeeapp.model.Employee;
import com.motorph.motorphemployeeapp.controller.EmployeeManager;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class EmployeeTableGUI extends JFrame {

    private JTable employeeTable;

    public EmployeeTableGUI() {
        setTitle("All Employees");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        String[] columnNames = {
            "Employee ID", "First Name", "Last Name",
            "Birthday", "Address", "PhoneNumber",
            "Department", "Position", "Supervisor",
            "Status", "Date Hired", "Hours Worked"
        };

        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        employeeTable = new JTable(tableModel);

        List<Employee> employees = EmployeeManager.getAllEmployees();
        for (Employee emp : employees) {
            Object[] row = new Object[] {
                emp.getEmployeeID(),
                emp.getFirstName(),
                emp.getLastName(),
                emp.getBirthday(),
                emp.getAddress(),
                emp.getPhoneNumber(),
                emp.getDepartment(),
                emp.getPosition(),
                emp.getSupervisor(),
                emp.getStatus(),
                emp.getDateHired(),
                emp.getHoursWorked()
            };
            tableModel.addRow(row);
        }

        JScrollPane scrollPane = new JScrollPane(employeeTable);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }
}
