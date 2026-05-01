/*
 * This is the InputValidator class. Please complete this class with
 * appropiate JavaDoc comments, method and code comments, and the appropiate
 * methods to validate inputs from the user. 
 */

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.Period;

public class InputValidator {

    static ArrayList<String> userNames = new ArrayList<>(); //creates a list to hold usernames

    //creates a list of accepted currencies
    static ArrayList<String> acceptedCurr = new ArrayList<>(List.of("US DOLLAR", "CANADIAN DOLLAR", "EURO", "PESO", "BIT COIN"));

    static LocalDate today = LocalDate.now();

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

        if(price.isEmpty() && currency.isEmpty()){//checks if price and currency field is empty
            return true;
        }
        else if((price.isEmpty() && !currency.isEmpty()) || (!price.isEmpty() && currency.isEmpty())){// checks if only one field is empty
            return false;
        }

        float num = Float.parseFloat(price);

        if(acceptedCurr.contains(currency.toUpperCase()) && num >= 0.00){//checks if the currency input is accepted
            return true;
        }

        return false;
    }
}

