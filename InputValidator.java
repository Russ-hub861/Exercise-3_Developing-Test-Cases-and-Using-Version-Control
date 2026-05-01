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
}