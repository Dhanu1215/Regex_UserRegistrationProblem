package com.blp.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class CheckValidEmails {

    public static void main(String[] args) {

    }

    public static boolean checkEmails() {
        List<String> emails = new ArrayList<String>();
        emails.add("abc@yahoo.com");
        emails.add("abc-100@yahoo.com");
        emails.add("abc.100@yahoo.com");
        emails.add("abc111@abc.com");
        emails.add("abc-100@abc.net");
        emails.add("abc.100@abc.com.au");
        emails.add("abc@1.com");
        emails.add("abc@gmail.com.com");
        emails.add("abc+100@gmail.com");
        Boolean temp = false;
        for (String email : emails) {
            boolean check = Pattern.matches("^([a-z0-9]{3}.+)@[a-z0-9]+(.+)$", email);
            temp = check;
        }
        return temp;
    }

    public static boolean checkInvalidEmails() {
        List<String> emails = new ArrayList<String>();
        emails.add("abc");
        emails.add("abc@.com.my");
        emails.add("abc123@gmail.a");
        emails.add("abc123@.com");
        emails.add("abc123@.com.com");
        emails.add(".abc@abc.com");
        emails.add("abc()*@gmail.com");
        emails.add("abc@%*.com");
        emails.add("abc..2002@gmail.com");
        emails.add("abc.@gmail.com");
        emails.add("abc@abc@gmail.com");
        emails.add("abc@gmail.com.1a");
        emails.add("abc@gmail.com.aa.au");

        Boolean temp = false;
        for (String email : emails) {
            boolean check = Pattern.matches("^([a-z0-9]{3}.+)@[a-z]{2,}(.+)$", email);
            temp = check;
        }
        return temp;
    }
}
