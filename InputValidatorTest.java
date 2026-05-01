/*
 * These are the libraries from JUnit that allows you to test
 * Java applications. For more information check the complete tutorial
 * here: https://www.tutorialspoint.com/junit/index.htm
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class InputValidatorTest {
    
    /*
     * Example test method for a possible Name field validator method in your 
     * InputValidator class.
     * For more information about assertion tests check: 
     * https://www.tutorialspoint.com/junit/junit_using_assertion.htm
     */
    @Test
    public void testNameFieldIsNotEmpty() {
        assertTrue(InputValidator.isValidPhoneNum("13108061152"));
        assertFalse(InputValidator.isValidPhoneNum("02118063152"));

        // assertFalse (InputValidator.validateNameField("..."));
        assertTrue(InputValidator.isValidImage("bird.png", 4));
        assertFalse(InputValidator.isValidImage("bird.png", 5));
        assertFalse(InputValidator.isValidImage("bird.gif", 3));


    }
    
    // CREATE MORE TESTS HERE
    
}