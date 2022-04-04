package com.bridgelabz;
/**
 * User Registration System needs to ensure all validations are in place during the User Entry.
 * @author Shubham Pawar
 * @since 03-04-2021
 */
public class UserRegistration {
    public boolean checkFName(String fName) {
        return (fName.matches("[A-Z][a-z]{3,}"));
    }

    public boolean Lname(String Lname) {
        return (Lname.matches("[A-Z][a-z]{3,}"));
    }

    public boolean checkEmail(String emailID) {
        return (emailID.matches("^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$"));
    }

    public boolean checkPhoneNum(String phoneNum) {
        return (phoneNum.matches("91\\s[0-9]{10}"));
    }

    public boolean checkPassword(String password) {
        return (password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[*.!@#$%^&(){}:'<>,.>/~`_+=|].).{8,}$"));
    }
}

