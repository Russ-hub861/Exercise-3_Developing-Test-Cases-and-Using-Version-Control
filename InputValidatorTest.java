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
         assertTrue(InputValidator.isValidName("Cole"));
         assertFalse (InputValidator.isValidName("j"));
    }
    
    /*
     * Tests the postal code and ensures that the value inputed is valid
     * 
     * 
     *  
     */
    @Test
    public void testPostalCode()
    {
        // Test cases for the postal code field 
        assertTrue(InputValidator.isValidPostalCode("49006"));
        assertTrue(InputValidator.isValidPostalCode(null));
        assertFalse(InputValidator.isValidPostalCode("248"));
        
        
    }
    /*
     * Write Comments
     * This test checks the password input field and makes sure that it is valid and
     * meets all requirements 
     */
    @Test
    public void testPassWord()
    {
        // Test cases for password field 
        assertTrue(InputValidator.isValidPassWord("Password1"));
        assertTrue(InputValidator.isValidPassWord("pAssword1"));
        assertFalse(InputValidator.isValidPassWord("password1"));
    }

    //Tests if the medium that was input is from the drop down menu 
    @Test 
    public void testMediumInput()
    {
        //Tests whether values from the list are accepted 
        assertTrue(InputValidator.isValidMedium("clay"));
        assertTrue(InputValidator.isValidMedium("graphite"));
        assertTrue(InputValidator.isValidMedium("paint"));
        //Tests wheter values that are not on the drop down list are accepted
        assertFalse(InputValidator.isValidMedium("dirt"));
        //Tests if no value for the input field is accepted
        assertFalse(InputValidator.isValidMedium(null));
        
    }

    
}