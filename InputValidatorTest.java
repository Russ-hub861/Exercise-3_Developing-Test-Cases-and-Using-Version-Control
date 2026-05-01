import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
 * These are the libraries from JUnit that allows you to test
 * Java applications. For more information check the complete tutorial
 * here: https://www.tutorialspoint.com/junit/index.htm
 */
import org.junit.jupiter.api.Test;

public class InputValidatorTest {

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