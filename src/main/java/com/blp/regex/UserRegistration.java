package com.blp.regex;

import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
    }

    public static boolean firstName(String name) {
        boolean check = Pattern.matches("([A-Z][a-z]{3,})", name);
        return check;
    }

    public static boolean lastName(String name) {
        boolean check = Pattern.matches("([A-Z][a-z]{3,})", name);
        return check;
    }

    //abc.xyz@bl.co.in
    public static boolean emailId(String email) {
        boolean check = Pattern.matches("^(.+)@(.+)$", email);
        return check;
    }

    public static boolean mobileNumber(String number) {
        boolean check = Pattern.matches("^[91]{2} [0-9]{10}$", number);
        return check;
    }

    public static boolean password(String pass) {
        boolean check = Pattern.matches("^[A-Za-z]{4}@[0-9]{3}$", pass);
        return check;
    }

    public static boolean password1(String pass) {
        boolean check = Pattern.matches("^[A-Z]{1}[a-z]{3}@[0-9]{3}$", pass);
        return check;
    }

    public static boolean password2(String pass) {
        boolean check = Pattern.matches("^[A-Z]{1}[a-z]{5}@[0-9]{1}$", pass);
        return check;
    }

    public static boolean password3(String pass) {
        boolean check = Pattern.matches("^[A-Z]{1}[a-z]{5}@[0-9]{1}$", pass);
        return check;
    }
}