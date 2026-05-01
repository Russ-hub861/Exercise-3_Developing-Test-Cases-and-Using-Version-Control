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
}