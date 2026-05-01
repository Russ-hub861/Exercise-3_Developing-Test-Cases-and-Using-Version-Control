/*
 * This is the InputValidator class. Please complete this class with
 * appropiate JavaDoc comments, method and code comments, and the appropiate
 * methods to validate inputs from the user. 
 */

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class InputValidator {
    static ArrayList<String> userNames = new ArrayList<>();
    static ArrayList<String> acceptedCurr = new ArrayList<>(List.of("US DOLLAR", "CANADIAN DOLLAR", "EURO", "PESO", "BIT COIN"));

    static LocalDate today = LocalDate.now();

    public static boolean validateDescriptionField(String desc){
       return !desc.isEmpty() && desc.length() < 1000;
   }

    public static boolean validateTitleField(String title){
        return !title.isEmpty() && title.length() < 100;
    }

    public static boolean validateUserNameField(String user){

        if(!user.isEmpty() && user.length() <= 20 && !userNames.contains(user) )
        {
            userNames.add(user);
            return true;
        }
        return false;
    }

    public static boolean validateDateOfBirthField(String year, String month, String day){
        if(!year.isEmpty() && !month.isEmpty() && !day.isEmpty())
        {
            int numYear = Integer.parseInt(year);
            int numMonth = Integer.parseInt(month);
            int numDay = Integer.parseInt(day);

            LocalDate birthDay = LocalDate.of(numYear, numMonth, numDay);

            if(birthDay.isAfter(today))
                return false;

            return Period.between(birthDay, today).getYears() >= 18;
        }

        return false;
    }

    public static boolean validateCreationDateField(String year, String month, String day){
        if(!year.isEmpty() && !month.isEmpty() && !day.isEmpty()) {
            int numYear = Integer.parseInt(year);
            int numMonth = Integer.parseInt(month);
            int numDay = Integer.parseInt(day);

            LocalDate creationDate = LocalDate.of(numYear, numMonth, numDay);

            return !creationDate.isAfter(today);
        }
        return false;
    }

    public static boolean validatePriceField(String currency, String price){

       if(price.isEmpty() && currency.isEmpty()){
           return true;
       }
       else if((price.isEmpty() && !currency.isEmpty()) || (!price.isEmpty() && currency.isEmpty()))
           return false;

       float num = Float.parseFloat(price);

       if(acceptedCurr.contains(currency.toUpperCase()) && num >= 0.00)
           return true;
       return false;
    }



}

