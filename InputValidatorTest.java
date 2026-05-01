/*
 * These are the libraries from JUnit that allows you to test
 * Java applications. For more information check the complete tutorial
 * here: https://www.tutorialspoint.com/junit/index.htm
 */
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/*This class shows test cases for boolean methods "isValidPhoneNum" and "isValidImage"
 *
 * @author Lena Barrett, Son Le Dinh Truong, Cole F. Russell, and Daniel E. Celedon
 * @version May 1, 2026
 */
public class InputValidatorTest {

    @Test
    public void testNameFieldIsNotEmpty()
    {
        // isValidPhoneNum Test Cases
        assertTrue(InputValidator.isValidPhoneNum("13109061152")); //returns true because 1 is the only valid country code for US phone number.
        assertFalse(InputValidator.isValidPhoneNum("02118063152")); //returns false because 0 is an invalid country code.
        assertFalse(InputValidator.isValidPhoneNum("1012345678")); //returns false because number is not long enough.@Te
        //isValidImage Test Cases
        assertTrue(InputValidator.isValidImage("bird.png", 4)); //returns true because the file type is <=4, and it is a valid file type.
        assertFalse(InputValidator.isValidImage("bird.png", 5)); //returns false because the file type is > 4.
        assertFalse(InputValidator.isValidImage("bird.gif", 3)); //returns false because it is an invalid file type.

    }
}