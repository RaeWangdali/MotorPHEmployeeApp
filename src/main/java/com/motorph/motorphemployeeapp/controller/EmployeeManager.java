package com.motorph.motorphemployeeapp.controller;

import com.motorph.motorphemployeeapp.model.Employee;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private static List<Employee> employees = new ArrayList<>();

    // Load employees from CSV (employees.csv)
    static {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/employees.csv"))) {
            String line;
            boolean firstLine = true;
            while ((line = br.readLine()) != null) {
                if (firstLine) {
                    firstLine = false; // Skip header
                    continue;
                }

                String[] data = line.split(",");

                // Ensure all 12 fields are read properly
                if (data.length == 12) {
                    Employee emp = new Employee(
                        data[0], // ID
                        data[1], // First Name
                        data[2], // Last Name
                        data[3], // Birthday
                        data[4], // Address
                        data[5], // Phone
                        data[6], // Email
                        data[7], // Department
                        data[8], // Position
                        data[9], // Status
                        data[10], // Rate
                        data[11]  // Hours Worked
                    );
                    employees.add(emp);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public static Employee getEmployeeById(String id) {
        for (Employee e : employees) {
            if (e.getEmployeeID().equals(id)) {
                return e;
            }
        }
        return null;
    }

    public static List<Employee> getAllEmployees() {
        return employees;
    }
}
