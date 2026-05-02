import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
 * These are the libraries from JUnit that allows you to test
 * Java applications. For more information check the complete tutorial
 * here: https://www.tutorialspoint.com/junit/index.htm
 */
import org.junit.jupiter.api.Test;

/*This class shows test cases for boolean methods "isValidPhoneNum" and "isValidImage"
 *
 * @author Lena Barrett, Son Le Dinh Truong, Cole F. Russell, and Daniel E. Celedon
 * @version May 1, 2026
 */
public class InputValidatorTest {

    @Test
    public void testPhoneNumField()
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
    /* Test method for validating the email field */
    @Test
    public void testEmailField(){
        //valid test cases for email field
        assertTrue(InputValidator.testEmailField("name@example.com"));
        assertTrue(InputValidator.testEmailField("sonledinh24@example.com"));
        assertTrue(InputValidator.testEmailField("son.ledinh24@example.com"));

        //invalid test cases for email field
        assertFalse(InputValidator.testEmailField(null));
        assertFalse(InputValidator.testEmailField("nameexample.com"));
        assertFalse(InputValidator.testEmailField("@example.com"));
        assertFalse(InputValidator.testEmailField("name@"));
        assertFalse(InputValidator.testEmailField("name@example"));
        assertFalse(InputValidator.testEmailField("name@@example.com"));
        assertFalse(InputValidator.testEmailField("name@example..com"));
        assertFalse(InputValidator.testEmailField("name@example.com."));
        assertFalse(InputValidator.testEmailField("name@example.o"));
        assertFalse(InputValidator.testEmailField("na..me@example.com"));
        assertFalse(InputValidator.testEmailField(".name@example.com"));
        assertFalse(InputValidator.testEmailField("na$me@example..com"));
        assertFalse(InputValidator.testEmailField("name @example.com"));
    }

    /* Test method for validating the last name field */
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
        assertTrue(InputValidator.isValidPassWord("Secure-123"));
        assertFalse(InputValidator.isValidPassWord("password1"));
        assertFalse(InputValidator.isValidPassWord("12345678"));
        assertFalse(InputValidator.isValidPassWord("bobthebest"));
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

    
    public void testLastName() {
        //valid test cases for last name field
        assertTrue(InputValidator.testLastNameField("Smith"));
        assertTrue(InputValidator.testLastNameField("O'Connor"));
        assertTrue(InputValidator.testLastNameField("Smith-Jones"));
        assertTrue(InputValidator.testLastNameField("Nguyễn"));
        assertTrue(InputValidator.testLastNameField("Đặng"));

        //invalid test cases for last name field
        assertFalse(InputValidator.testLastNameField(null));
        assertFalse(InputValidator.testLastNameField(""));
        assertFalse(InputValidator.testLastNameField("   "));
        assertFalse(InputValidator.testLastNameField("A"));
        assertFalse(InputValidator.testLastNameField("Smith123"));
        assertFalse(InputValidator.testLastNameField("Smith@"));
        assertFalse(InputValidator.testLastNameField("Sm!th-Jones"));
        assertFalse(InputValidator.testLastNameField("-Smith"));
        assertFalse(InputValidator.testLastNameField("Smith-"));
    }

    /* Test method for validating the dimension field */
    @Test
    public void testDimension(){
        //valid test cases for dimension field
        assertTrue(InputValidator.testDimension("10x20cm"));
        assertTrue(InputValidator.testDimension("10 x 20 cm"));
        assertTrue(InputValidator.testDimension("10x20 cm"));
        assertTrue(InputValidator.testDimension("10 x20cm"));
        assertTrue(InputValidator.testDimension("10x 20cm"));
        assertTrue(InputValidator.testDimension("10   x   20   cm"));
        assertTrue(InputValidator.testDimension("5x8in"));
        assertTrue(InputValidator.testDimension("100x200mm"));
        assertTrue(InputValidator.testDimension("10.5x20cm"));
        assertTrue(InputValidator.testDimension("10.5 x 20.25 cm"));

        //invalid test cases for dimension field
        assertFalse(InputValidator.testDimension("10x20"));
        assertFalse(InputValidator.testDimension("10x20kg"));
        assertFalse(InputValidator.testDimension("x20cm"));
        assertFalse(InputValidator.testDimension("10xcm"));
        assertFalse(InputValidator.testDimension("10xx20cm"));
        assertFalse(InputValidator.testDimension("10. x20cm"));
        assertFalse(InputValidator.testDimension("10x20..cm"));
        assertFalse(InputValidator.testDimension("10 x 20 c m"));
        assertFalse(InputValidator.testDimension(""));
        assertFalse(InputValidator.testDimension(null));
    }
}