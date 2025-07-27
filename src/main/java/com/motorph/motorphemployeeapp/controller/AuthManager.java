package com.motorph.motorphemployeeapp.controller;

import com.motorph.motorphemployeeapp.model.Login;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AuthManager {

    private static List<Login> loginList = new ArrayList<>();

    static {
        loadLoginCredentials();
    }

    // Load from CSV at startup
    private static void loadLoginCredentials() {
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(AuthManager.class.getClassLoader().getResourceAsStream("login_credentials.csv")))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                if (tokens.length == 2) {
                    String lastName = tokens[0].trim();
                    String firstName = tokens[1].trim();
                    loginList.add(new Login(firstName, lastName));
                }
            }
        } catch (IOException | NullPointerException e) {
            System.err.println("Failed to load login_credentials.csv: " + e.getMessage());
        }
    }

    public static boolean validateLogin(String firstName, String lastName) {
        for (Login user : loginList) {
            if (user.getFirstName().equalsIgnoreCase(firstName) && user.getLastName().equalsIgnoreCase(lastName)) {
                return true;
            }
        }
        return false;
    }

    public static Login getLoginUser(String firstName, String lastName) {
        for (Login user : loginList) {
            if (user.getFirstName().equalsIgnoreCase(firstName) && user.getLastName().equalsIgnoreCase(lastName)) {
                return user;
            }
        }
        return null;
    }

    public static boolean authenticate(Login login) {
        return validateLogin(login.getFirstName(), login.getLastName());
    }
}
