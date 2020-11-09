package com.corona.coronazp20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public static final String REGEX_USERNAME_PATTERN = "^[a-zA-Z]{3,20}$";
    public static final String REGEX_PASSWORD_PATTERN = "^[a-zA-Z0-9.!@_]{5,20}$";
    public static final String REGEX_EMAIL_PATTERN ="^[a-zA-Z0-9@._-]{10,50}$";

    public static boolean isValidUsername(String username){
        Pattern pattern = Pattern.compile(REGEX_USERNAME_PATTERN);
        Matcher matcher = pattern.matcher(username);

        return matcher.find();
    }

    public static boolean isValidPassword(String password){
        Pattern pattern = Pattern.compile(REGEX_PASSWORD_PATTERN);//pagal musu apsirasyta sablona sukuriamas sablonas
        Matcher matcher = pattern.matcher(password);//pagal auksciau sukurta sablona palyginamas vartotojo ivestas slaptazodis

        return matcher.find();//jeigu atitinka sablonas vartotojo duomenis, grazina true, false , priesingu atveju.
    }
        public static boolean isValidEmail(String email){
        Pattern pattern = Pattern.compile(REGEX_EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);

        return matcher.find();
        }
}
