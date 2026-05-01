import java.util.regex.*;
/*
 * This is the InputValidator class. Please complete this class with
 * appropiate JavaDoc comments, method and code comments, and the appropiate
 * methods to validate inputs from the user. 
 */

public class InputValidator {
    public boolean isValidImage(String imageData, int imageSize)
    {
        //Assume file size < 4mb
        String r = "^[A-Za-z0-9._-]+\\.(png|jpg)$";
        return imageData.matches(r) && imageSize <= 4;
    }
    public boolean isValidPhoneNum(String n) {
        // the number starts with 1
        //  followed by 9 digits
        String r = "^1[0-9]{10}$";

        // Check if the number matches
        // the regular expression
        if (n.matches(r)) {
            System.out.println("Valid Mobile Number");
            return true;
        }
        else {
            System.out.println("Invalid Mobile Number");
            return false;
        }
    }
}