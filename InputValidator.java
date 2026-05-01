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
        if (input == null || input.isEmpty()) {
            return false; // Input is invalid
        }
        if (input.trim().isEmpty()) {
            return false; // Input is invalid since it only contains spaces
        }
        if (input.length() < 2) {
            return false; // Input is invalid since it's too short
        }
        if (input.matches(".*\\d.*")) {
            return false; // Input is invalid since it contains numbers
        }
        if (input.matches(".*[!@#$%^&*()].*")) {
            return false; // Input is invalid since it contains special characters
        }
        if (!input.trim().matches("^[\\p{L}]+([ '-][\\p{L}]+)*$")) {
            return false; // Input is invalid since it doesn't match the allowed pattern
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
        if (input == null || input.isEmpty()) {
            return false; // Input is invalid
        }
        if(input.length() != input.trim().length()){
            return false; // Input is invalid
        }
        if (!input.trim().matches("^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*@[a-zA-Z]+\\.[a-zA-Z]{2,}$")){
            return false; // Input is invalid
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
        if (input == null || input.isEmpty()) {
            return false; // Input is invalid
        }
        if(input.length() != input.trim().length()){
            return false; // Input is invalid
        }
        if (!input.trim().matches("^[0-9]+(\\.[0-9]+)?\\s*\\s*x\\s*[0-9]+(\\.[0-9]+)?\\s*\\s*(cm|mm|m|in|ft)$")){
            return false; // Input is invalid
        }
        return true;
    }    
}
