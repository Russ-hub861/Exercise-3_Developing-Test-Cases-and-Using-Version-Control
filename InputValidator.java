import java.util.regex.*;
/*
 * Exercise 3: Developing Test Cases
 *
 * This is the InputValidator class. The purpose of this class
 * is to create methods that check validity of what the user is
 * inputting for their personal information.
 *
 * @author Lena Barrett, Son Le Dinh Truong, Cole F. Russell, and Daniel E. Celedon
 * @version May 1, 2026
 */

public class InputValidator {
    /**
     * Returns a boolean value that represents whether or not the image is valid.
     * @param imageData String value that represents the image's name.
     * @param imageSize int value the represents the size of a file in mb.
     * @return boolean
     */
    public static boolean isValidImage(String imageData, int imageSize)
    {
        //Assume file size is in megabytes
        String r = "^[A-Za-z0-9._-]+\\.(png|jpg)$";
        if(imageData.matches(r) && imageSize <= 4) {
            System.out.println("Vaild Image Type.");
            return true;
        }
        else {
            System.out.println("Invalid Image Type or Size!");

            return false;
        }
    }

    /**
     * Return a boolean value that represents whether or not the phone number entered
     * by the user is valid.
     * @param n String value that represent the phone number inputted by the user
     * @return boolean
     */

    public static boolean isValidPhoneNum(String n) {
        // the number starts with 1
        // followed by 9 digits
        String r = "^1[0-9]{10}$";

        // Check if the number matches the correct template.
        if (n.matches(r)) {
            System.out.println("Valid Mobile Number.");
            return true;
        }
        else {
            System.out.println("Invalid Mobile Number!");
            return false;
        }
    }
//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class InputValidator 
{
    /**
     * Validates the first name input.
     *
     * @param input the first name provided by the user
     * @return true if the input is valid, false otherwise
     */
    public static boolean isValidName(String firstname)
    {
        //makes sure the length is more than 2 characters
        return firstname.length() > 2;
    }
    
    /**
     * Validates the postal code input.
     *
     * @param input the postal code provided by the user
     * @return true if the input is valid, false otherwise
     */
    public static boolean isValidPostalCode(String postalcode)
    {
        if(postalcode == null || postalcode.isEmpty())
        {
            return true; // Because no value is also allowed
        }
        if(postalcode.length() == 5) // makes the only valid input 5 digits which is what all postal codes are
        {
            return true;
        }
        return false;
    }

    /**
     * Validates the password input.
     *
     * @param input the password provided by the user
     * @return true if the input is valid, false otherwise
     */
    public static boolean isValidPassWord(String passWord)
    {
        if(passWord.isEmpty()) //if the password filed is empty send out a message
            {
                return false; 
            }
        if(passWord.length() < 8) // Makes sure that the password is at least 8 characters long
            {
                return false;
            }
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;

        for(int i = 0; i < passWord.length(); i++) // Iterates through the characters of the password
        {
            char ch = passWord.charAt(i);
            if(Character.isUpperCase(ch)) //Checks if the character at the point "ch" is capital
            {
                hasUpper = true;
            }
            if(Character.isLowerCase(ch)) //Checks if the character at the point "ch" is lower case 
            {
                hasLower = true;
            }
            if(Character.isDigit(ch)) //Checks if the character at the point "ch" is a digit
            {
                hasDigit = true;
            }
        }
        return hasUpper && hasLower && hasDigit;
    }

    /**
     * Validates the medium input.
     *
     * @param input the medium provided by the user
     * @return true if the input is valid, false otherwise
     */
    static ArrayList<String> acceptedMed = new ArrayList<>(List.of("paint", "graphite", "clay", "digital"));
    public static boolean isValidMedium(String pieceMedium)
    {
        return acceptedMed.contains(pieceMedium); //Checks if the input is in the list of accepted mediums
    }

    /**
     * Validates the last name input.
     *
     * @param input the last name provided by the user
     * @return true if the input is valid, false otherwise
     */
    public static boolean testLastNameField(String input) {
        // This method will validate the input from the user.
        // You can add your validation logic here. For example, you can check if the input is empty or if it matches a certain pattern.
        if (input == null || input.isEmpty()) { // Input is invalid since it's null or empty
            return false;
        }
        if (input.trim().isEmpty()) { // Input is invalid since it's only whitespace
            return false;
        }
        if (input.length() < 2) { // Input is invalid since it's too short
            return false;
        }
        if (input.matches(".*\\d.*")) { // Input is invalid since it contains numbers
            return false; 
        }
        if (input.matches(".*[!@#$%^&*()].*")) { // Input is invalid since it contains special characters
            return false; 
        }
        if (!input.trim().matches("^[\\p{L}]+([ '-][\\p{L}]+)*$")) { // Input is invalid since it doesn't match the allowed pattern
            return false; 
        }
        return true; // Input is valid since it passed all the checks
    }

    /**
     * Validates the email input.
     *
     * @param input the email provided by the user
     * @return true if the input is valid, false otherwise
     */
    public static boolean testEmailField(String input) {
        // This method will validate the input from the user.
        // You can add your validation logic here. For example, you can check if the input is empty or if it matches a certain pattern.
        if (input == null || input.isEmpty()) { // Input is invalid since it's null or empty
            return false;
        }
        if(input.length() != input.trim().length()){ // Input is invalid since it has leading or trailing spaces
            return false;
        }
        if (!input.trim().matches("^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*@[a-zA-Z]+\\.[a-zA-Z]{2,}$")){ // Input is invalid since it doesn't match the expected email pattern
            return false;
        }
        return true;
    }

    /**
     * Validates the dimension input.
     *
     * @param input the dimension provided by the user
     * @return true if the input is valid, false otherwise
     */
    public static boolean testDimension(String input) {
        // This method will validate the input from the user.
        // You can add your validation logic here. For example, you can check if the input is empty or if it matches a certain pattern.
        if (input == null || input.isEmpty()) { // check if the input is null or empty
            return false;
        }
        if(input.length() != input.trim().length()){ // check if the input has leading or trailing spaces
            return false;
        }
        if (!input.trim().matches("^[0-9]+(\\.[0-9]+)?\\s*\\s*x\\s*[0-9]+(\\.[0-9]+)?\\s*\\s*(cm|mm|m|in|ft)$")){ // check if the input matches the expected pattern for dimensions
            return false;
        }
        return true;
    }    
}