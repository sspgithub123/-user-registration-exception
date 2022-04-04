package com.bridgelabz;
/**
 * User Registration System needs to ensure all validations are in place during the User Entry.
 * @author Shubham Pawar
 * @since 03-04-2021
 */
public class UserRegistration {
    public boolean checkFName(String fName) {
        /**
         * regex pattern for FirstName
         */
        return (fName.matches("[A-Z][a-z]{3,}"));
    }

    public boolean Lname(String Lname) {
        return (Lname.matches("[A-Z][a-z]{3,}"));
    }
}

