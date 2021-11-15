package com.blp.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class CheckValidEmails {

    public static boolean checkEmails(String email) {
        boolean check = Pattern.matches("(([a-z A-Z]{3,})([-$&+,:;=?#|'<>.^*()%!]?[0-9 a-z A-Z]{3,})?+@([0-9 a-z]{1,})([.])([a-z]{2,})([.])?([a-z]{2,})?)", email);
        if (check != true) {
            System.out.println("Enter valid email");
        }
        Boolean temp = check;
        return temp;
    }


    public static boolean checkInvalidEmails(String email) {
        boolean check = Pattern.matches("(([a-z A-Z]{3,})([-$&+,:;=?#|'<>.^*()%!]?[0-9 a-z A-Z]{3,})?+@([0-9 a-z]{1,})([.])([a-z]{2,})([.])?([a-z]{2,})?)", email);
        if (check == true) {
            System.out.println("Entered email is valid");
        }
        Boolean temp = check;
        return temp;
    }
}
