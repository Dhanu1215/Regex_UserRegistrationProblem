package com.blp.regex;

import java.util.regex.Pattern;

public class UserRegistration {

    public static boolean firstName(String name){
        boolean check = Pattern.matches("([A-Z][a-z]{3,})",name);
        return check;
    }
}
