package com.userregistration;

import java.util.regex.Pattern;

/**
 * Matching the input with regEx pattern and
 * Returns the output of pattern
 * If the input match with regEx pattern it will return True else False
 * @author Tushar Akhade
 * @since 29 Jun 2021
 */
public class UserRegistrationRegEx {
    private static final String NAME = "[A-Z][a-z]{2,}";
    private static final String EMAIL = "^(abc)[.][a-z]+[@](bl)[.](co)[.][a-z]+$";
    private static final String PHONE_NUMBER = "^[\\d]{2}[\s][\\d]{10}$";
    private static final String PASSWORD = "^(?=.*[A-Z])(?=.*[a-z])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$)(?=.*[0-9]).{8,}$";

    public boolean firstNameValidate(String fName) {
        return Pattern.matches(NAME, fName);
    }

    public boolean lastNameValidate(String lName) {
        return Pattern.matches(NAME, lName);
    }

    public boolean emailValidate(String email) {
        return Pattern.matches(EMAIL, email);
    }

    public boolean phoneNumberValidate(String phNum) {
        return Pattern.matches(PHONE_NUMBER, phNum);
    }

    public boolean passwordValidate(String pw) {
        return Pattern.matches(PASSWORD, pw);
    }

}
