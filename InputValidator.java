import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
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

    //creates a list to hold usernames
    static ArrayList<String> userNames = new ArrayList<>();

    //creates a list of accepted currencies
    static ArrayList<String> acceptedCurr = new ArrayList<>(List.of("US DOLLAR", "CANADIAN DOLLAR", "EURO", "PESO", "BIT COIN"));

    //creates a variable to hold the current date
    static LocalDate today = LocalDate.now();

    //creates a list of accepted mediums
    static ArrayList<String> acceptedMed = new ArrayList<>(List.of("paint", "graphite", "clay", "digital"));

    /**
     * Validates the description field.
     * The description must not be empty and must be less than 1000 characters.
     *
     * @param desc the description string entered by the user
     * @return true if the description is valid, false otherwise
     */
    public static boolean validateDescriptionField(String desc){
        return !desc.isEmpty() && desc.length() < 1000;// checks if the description is not empty and less than 1000 characters
    }

    /**
     * Validates the title field.
     * The title must not be empty and must be less than 100 characters.
     *
     * @param title the title string entered by the user
     * @return true if the title is valid, false otherwise
     */
    public static boolean validateTitleField(String title){
        return !title.isEmpty() && title.length() < 100;// checks if the description is not empty and less than 100 characters
    }

    /**
     * Validates the username field.
     * The username must not be empty, must be 20 characters or fewer,
     * and must be unique (not already in the list).
     *
     * @param user the username entered by the user
     * @return true if the username is valid and unique, false otherwise
     */
    public static boolean validateUserNameField(String user){

        if(!user.isEmpty() && user.length() <= 20 && !userNames.contains(user)) { //checks that username is unique, not empty and less than 20 characters
            userNames.add(user);//adds username to the username list
            return true;
        }
        return false;
    }

    /**
     * Validates the date of birth.
     * The date must be valid, not in the future, and the user must be at least 18 years old.
     *
     * @param year the year portion of the date (String)
     * @param month the month portion of the date (String)
     * @param day the day portion of the date (String)
     * @return true if the date is valid and the user is 18 or older, false otherwise
     */
    public static boolean validateDateOfBirthField(String year, String month, String day){

        if(!year.isEmpty() && !month.isEmpty() && !day.isEmpty()) { //checks if the fields are not empty

            int numYear = Integer.parseInt(year);
            int numMonth = Integer.parseInt(month);
            int numDay = Integer.parseInt(day);

            LocalDate birthDay = LocalDate.of(numYear, numMonth, numDay);

            if(birthDay.isAfter(today)) //checks if the date of birth is realistic
                return false;

            return Period.between(birthDay, today).getYears() >= 18; //checks if the user is 18+
        }
        return false;
    }

    /**
     * Validates the creation date.
     * The date must be valid and must not be in the future.
     *
     * @param year the year portion of the date (String)
     * @param month the month portion of the date (String)
     * @param day the day portion of the date (String)
     * @return true if the creation date is valid and not in the future, false otherwise
     */
    public static boolean validateCreationDateField(String year, String month, String day){

        if(!year.isEmpty() && !month.isEmpty() && !day.isEmpty()) {//checks if the fields are empty

            int numYear = Integer.parseInt(year);
            int numMonth = Integer.parseInt(month);
            int numDay = Integer.parseInt(day);

            LocalDate creationDate = LocalDate.of(numYear, numMonth, numDay);

            return !creationDate.isAfter(today); //checks if the input date is realistic
        }

        return false;
    }

    /**
     * Validates the price and currency fields.
     * Both fields must either be empty (optional), or both must be filled.
     * The currency must be one of the accepted values, and the price must be a non-negative number.
     *
     * @param currency the currency type entered by the user
     * @param price the price entered by the user as a string
     * @return true if the price and currency are valid, false otherwise
     */
    public static boolean validatePriceField(String currency, String price){

        if (price.isEmpty() && currency.isEmpty()) {
            return true;
        }
        if(price.isEmpty() ^ currency.isEmpty()){ //checks if one field is empty and the other is not, if so return false since both fields must be filled or both fields must be empty
            return false;
        }
        if(!acceptedCurr.contains(currency.toUpperCase()) || Float.parseFloat(price) < 0.00){//checks if the currency input is accepted
            return false;
        }
        return true; //if both fields are empty, return true since the price and currency fields are optional
    }

    /**
     * Returns a boolean value that represents whether or not the image is valid.
     * @param imageData String value that represents the image's name.
     * @param imageSize int value the represents the size of a file in mb.
     * @return boolean
     */
    public static boolean isValidImage(String imageData, int imageSize)
    {
        //Assume file size is in megabytes
        return imageData.matches("^[A-Za-z0-9._-]+\\.(png|jpg)$") && imageSize <= 4; // checks if the image name matches the expected pattern and if the size is less than or equal to 4mb
    }

    /**
     * Return a boolean value that represents whether or not the phone number entered
     * by the user is valid.
     * @param n String value that represent the phone number inputted by the user
     * @return boolean
     */
    public static boolean isValidPhoneNum(String number) {
        return number.matches("^1[0-9]{10}$"); // checks if the phone number matches the expected pattern
    }

    /**
     * Validates the first name input.
     *
     * @param input the first name provided by the user
     * @return true if the input is valid, false otherwise
     */
    public static boolean isValidFirstName(String firstname)
    {
        if (firstname == null || firstname.trim().isEmpty()) { // null, empty, or whitespace-only
            return false;
        }
        if (firstname.length() < 2) { // too short
            return false;
        }
        if (firstname.matches(".*\\d.*")) { // contains numbers
            return false;
        }
        if (firstname.matches(".*[!@#$%^&*()].*")) { // contains special characters
            return false;
        }
        if (!firstname.trim().matches("^[\\p{L}]+([ ][\\p{L}]+)*$")) { // letters with optional spaces in between
            return false;
        }
        return true; // valid first name
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
    public static boolean isValidPassword(String passWord)
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
