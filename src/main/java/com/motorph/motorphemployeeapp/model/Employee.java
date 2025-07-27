package com.motorph.motorphemployeeapp.model;

public class Employee {
    private String employeeID;
    private String firstName;
    private String lastName;
    private String birthday;
    private String address;
    private String phoneNumber;
    private String department;
    private String position;
    private String supervisor;
    private String status;
    private String dateHired;
    private String hoursWorked;

    public Employee(String employeeID, String firstName, String lastName, String birthday,
                    String address, String phoneNumber, String department, String position,
                    String supervisor, String status, String dateHired, String hoursWorked) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.position = position;
        this.supervisor = supervisor;
        this.status = status;
        this.dateHired = dateHired;
        this.hoursWorked = hoursWorked;
    }

    // Getters
    public String getEmployeeID() {
        return employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public String getStatus() {
        return status;
    }

    public String getDateHired() {
        return dateHired;
    }

    public String getHoursWorked() {
        return hoursWorked;
    }
}
