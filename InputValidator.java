/*
 * This is the InputValidator class. Please complete this class with
 * appropiate JavaDoc comments, method and code comments, and the appropiate
 * methods to validate inputs from the user. 
 */

//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class InputValidator 
{
InputValidator isValidName = new InputValidator(); 
    //Function for checking if the first name input is valid
    public static boolean isValidName(String firstname)
    {
        String name = firstname;

        //makes sure the length is more than 2 characters
        if(name.length() < 2)
        {
            System.out.println("Name must be more than 2 characters");
            return false;
        }
        else 
        {
            return true;
        }
    }
    // Function to check if the postal code entered is valid 
InputValidator isValidPostalCode = new InputValidator();
    public static boolean isValidPostalCode(String postalcode)
    {
       String pCode = postalcode;
       if(pCode == null || pCode.isEmpty())
        {
            return true; // Because no value is also allowed
        }
        if(pCode.length() == 5) // makes the only valid input 5 digits which is what all postal codes are
            {
                return true;
            }
        
        else  
        {
            System.out.println("Enter a valid postal code");
            return false;
        }
    }
    // Function to check whether the password entered is valid
    InputValidator isValidPassWord = new InputValidator();
    public static boolean isValidPassWord(String passWord)
    {
        String pass = passWord;
                if(pass.isEmpty()) //if the password filed is empty send out a message
                    {
                        System.out.println("Field cannot be empty");
                        return false; 
                    }
                if(pass.length() < 8) // Makes sure that the password is at least 8 characters long
                    {
                        return false;
                    }
                    boolean hasUpper = false;
                    boolean hasLower = false;
                    boolean hasDigit = false;

        for(int i = 0; i < pass.length(); i++) // Iterates through the characters of the password
            {

                char ch = pass.charAt(i);
                if(Character.isUpperCase(ch)) //Checks if the character at the point "ch" is capital
                    {
                        hasUpper = true;
                    }
                    else {
                        System.out.println("Must have at least one capital letter");
                    }
                if(Character.isLowerCase(ch)) //Checks if the character at the point "ch" is lower case 
                    {
                        hasLower = true;
                    }
                    else {
                        System.out.println("Must have at least one lower case letter");
                    }

                if(Character.isDigit(ch)) //Checks if the character at the point "ch" is a digit
                    {
                        hasDigit = true;
                    }
                    else {
                        System.out.println("Must have at least one digit");
                    }
            }
            return hasUpper && hasLower && hasDigit;
    }

    // Function to check whether the medium of a painting is valid
    static ArrayList<String> acceptedMed = new ArrayList<>(List.of("paint", "graphite", "clay", "digital"));
    InputValidator isValidMedium = new InputValidator();
    public static boolean isValidMedium(String pieceMedium)
    {
        String medium = pieceMedium;
        if(acceptedMed.contains(medium))
            {
                return true;
            }
        else{
            return false;
        }

    }
public class InputValidator {
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