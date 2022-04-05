package com.bridgelabz;
/**
 * Program on User Registration Using Regex
 *
 * @author : Shubham Pawar
 * @since : 04/04/2022
 * */

/**
 *  import matcher class and pattern class
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * create a class name as UserRegistration
 */
public class UserRegistration {

    /**
     * Created a method to validate first name
     * @param firstName
     * @return firstName
     * @throws UserRegistrationException
     */
    public boolean firstName(String firstName) throws UserRegistrationException {
        if (firstName == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, "Input can't be Null");
        } else if (firstName.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        {
            /**
             *  Regex to check valid userlastname.
             */
            String regex = "^[A-Z]{1}[a-z]{2,}$";
            /**
             *  Compile the ReGex
             */
            Pattern pattern = Pattern.compile(regex);
            /**
             * Pattern class contains matcher() method to find matching between given username
             * and regular expression.
             */
            Matcher matcher = pattern.matcher(firstName);
            /**
             * Return if the username matched the Regex
             */
            return matcher.matches();
        }
    }

    /**
     * Created a method to validate last name
     * @param lastName
     * @return lastname
     * @throws UserRegistrationException
     */
    public boolean lastName(String lastName) throws UserRegistrationException {
        if (lastName == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, "Input can't be Null");
        } else if (lastName.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        /**
         *  Regex to check valid userlastname.
         */
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        /**
         *  Compile the ReGex
         */
        Pattern pattern = Pattern.compile(regex);
        /**
         * Pattern class contains matcher() method to find matching between given userlastname
         * and regular expression.
         */
        Matcher matcher = pattern.matcher(lastName);
        /**
         * Return if the userlastname matched the Regex
         */
        return matcher.matches();
    }

    /**
     * Created a method to validate email address
     * @param email
     * @return email
     * @throws UserRegistrationException
     */
    public boolean email(String email) throws UserRegistrationException {
        if (email == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, "Input can't be Null");
        } else if (email.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        /**
         * regex pattern for email
         * 1)must contain character before @
         * 2)must contain @ symbol after char
         * 3)must contain char after @
         * 4)must contain "."  symbol before com or in
         */
        String regex = "^[a-z]{3,}([_+-.]?[a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+([.,][a-z]{2,3}+)*$";
        /**
         * Compile the Regex
         */
        Pattern pattern = Pattern.compile(regex);
        /**
         * Pattern class contains matcher() method to find matching between given useremail
         * and regular expression.
         */
        Matcher matcher = pattern.matcher(email);
        /**
         * Return if the useremail matched the Regex
         */
        return matcher.matches();
    }

    /**
     * Created a method to validate phone number
     * @param phoneNumber
     * @return phoneno.
     * @throws UserRegistrationException
     */
    public boolean phoneNumber(String phoneNumber) throws UserRegistrationException {
        if (phoneNumber == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, "Input can't be Null");
        } else if (phoneNumber.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        /**
         *  regex pattern for email
         */
        String regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
        /**
         * Compile the Regex
         */
        Pattern pattern = Pattern.compile(regex);
        /**
         * Pattern class contains matcher() method to find matching between given useremail
         * and regular expression.
         */
        Matcher matcher = pattern.matcher(phoneNumber);
        /**
         * Return if the useremail matched the Regex
         */
        return matcher.matches();
    }

    /**
     * Created a method to validate password according to rule 1
     * @param password
     * @return password
     * @throws UserRegistrationException
     */
    public boolean passwordRule1(String password) throws UserRegistrationException {
        if (password == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, "Input can't be Null");
        } else if (password.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        /**
         * Regex to check valid password.
         * ^ represents starting character of the string.
         * .{8,} represents at least 8 characters and more than characters.
         * $ represents the end of the string.
         */
        String regex = "^[a-zA-z1-9]{8,}$";
        /**
         * Compile the Regex
         */
        Pattern pattern = Pattern.compile(regex);
        /**
         *  Pattern class contains matcher() method to find matching between given password
         *  and regular expression.
         */
        Matcher matcher = pattern.matcher(password);
        /**
         *  Return if the password matched the Regex
         */
        return matcher.matches();
    }

    /**
     * Created a method to validate password according to rule 2
     * @param password
     * @return password
     * @throws UserRegistrationException
     */
    public boolean passwordRule2(String password) throws UserRegistrationException {
        if (password == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, "Input can't be Null");
        } else if (password.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        /**
         * Regex to check valid password.
         * 1) ^ represents starting character of the string.
         * 2) {8,} represents at least 8 characters or more than that characters.
         * 3) [A-Z]{1,} represents an upper case alphabet that must occur at least once.
         * 4) $ represents the end of the string.
         */
        String regex = "^[A-Z]{1,}[a-zA-z1-9]{8,}$";
        /**
         * Compile the Regex
         */
        Pattern pattern = Pattern.compile(regex);
        /**
         * Pattern class contains matcher() method to find matching between given password
         * and regular expression.
         */
        Matcher matcher = pattern.matcher(password);
        /**
         *  Return if the password matched the Regex
         */
        return matcher.matches();
    }

    /**
     * Created a method to validate password according to rule 3
     * @param password
     * @return password
     * @throws UserRegistrationException
     */
    public boolean passwordRule3(String password) throws UserRegistrationException {
        if (password == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, "Input can't be Null");
        } else if (password.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        /**
         * Regex to check valid password.
         * 1) ^ represents starting character of the string.
         * 2) {8,} represents at least 8 characters or more than that characters.
         * 3) [a-zA-z1-9] represents a lower case alphabet must occur at least 8 or more than that.
         * 4) [A-Z]{1} represents an upper case alphabet that must occur at least once.
         * 5) [1-9]{1}represents a digit must occur at least once.
         * 6) $ represents the end of the string.
         */
        String regex =  "^[A-Z]{1}+[a-zA-z1-9]{9,}[1-9]{1}$";
        /**
         * Compile the Regex
         */
        Pattern pattern = Pattern.compile(regex);
        /**
         * Pattern class contains matcher() method to find matching between given password
         *  and regular expression.
         */
        Matcher matcher = pattern.matcher(password);
        /**
         * Return if the password matched the Regex
         */
        return matcher.matches();
    }

    /**
     * Created a method to validate password according to rule 4
     * @param password
     * @return password
     * @throws UserRegistrationException
     */
    public boolean passwordRule4(String password) throws UserRegistrationException {
        if (password == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, " Input can't be Null");
        } else if (password.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        /**
         * Regex to check valid password.
         * 1) ^ represents starting character of the string.
         * 2) {8,} represents at least 8 characters or more than that characters.
         * 3) [a-zA-z1-9] represents a lower case alphabet must occur at least 8 or more than that.
         * 4) [A-Z]{1} represents an upper case alphabet that must occur at least once.
         * 5) [1-9]{1}represents a digit must occur at least once.
         * 6) [@$^]{1} represents a at least once special character.
         * 6) $ represents the end of the string.
         */
        String regex = "^[A-Z]{1}+[a-zA-z1-9]{9,}[@$^]{1}[1-9]{1}$";
        /**
         * Compile the Regex
         */
        Pattern pattern = Pattern.compile(regex);
        /**
         * Pattern class contains matcher() method to find matching between given password
         *  and regular expression.
         */
        Matcher matcher = pattern.matcher(password);
        /**
         *  Return if the password matched the Regex
         */
        return matcher.matches();
    }

    /**
     * Created a method to validate all the emails in the list
     * @param emailId
     * @return valid mail id
     * @throws UserRegistrationException
     */
    public boolean emailIdValidator(String emailId) throws UserRegistrationException {
        if (emailId == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, "Input can't be Null");
        } else if (emailId.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        /**
         * regex pattern for email
         * 1)must contain character before @
         * 2)must contain @ symbol after char
         * 3)must contain char after @
         * 4)must contain "."  symbol before com or in
         */
        String regex = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?";
        /**
         * Compile the Regex
         */
        Pattern pattern = Pattern.compile(regex);
        /**
         * Pattern class contains matcher() method to find matching between given useremail
         * and regular expression.
         */
        Matcher matcher = pattern.matcher(emailId);
        /**
         * Return if the useremail matched the Regex
         */
        return matcher.matches();
    }
}
