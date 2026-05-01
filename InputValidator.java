/*
 * This is the InputValidator class. Please complete this class with
 * appropiate JavaDoc comments, method and code comments, and the appropiate
 * methods to validate inputs from the user. 
 */

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