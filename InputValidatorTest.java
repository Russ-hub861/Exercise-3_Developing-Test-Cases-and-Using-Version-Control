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
    /*
     * Tests the validateDateOfBirthField method with various inputs.
     * Checks valid age (18+), underage, future-related edge cases, and empty inputs.
     */
    @Test
    public void testDateOfBirthFieldIsValid() {

        assertTrue(InputValidator.validateDateOfBirthField("2008", "01","04"));   // valid (18+)
        assertFalse(InputValidator.validateDateOfBirthField("2010", "01","04"));  // under 18
        assertFalse(InputValidator.validateDateOfBirthField("2008", "07","04"));  // not yet 18 depending on current date
        assertFalse(InputValidator.validateDateOfBirthField("", "",""));          // empty input
        assertFalse(InputValidator.validateDateOfBirthField("2020", "", ""));     // incomplete input
    }

    /*
     * Tests the validateDescriptionField method.
     * Ensures description is non-empty and under 1000 characters.
     */
    @Test
    public void testDescriptionFieldIsValid() {

        assertTrue(InputValidator.validateDescriptionField("Hello World")); // valid
        assertFalse(InputValidator.validateDescriptionField(""));           // empty

        // overly long description (>1000 characters)
        assertFalse(InputValidator.validateDescriptionField(
                "Java is a high-level, object-oriented programming language" +
                        " widely used for building applications, from mobile apps to large-scale enterprise systems. It was designed with the principle of “write once, run anywhere,”" +
                        " meaning that compiled Java code can run on any device that has a Java Virtual Machine (JVM), making it highly portable. Java uses classes and objects as its " +
                        "core structure, which helps organize code in a modular and reusable way. It has strong memory management, automatic garbage collection, and a large standard library " +
                        "that supports data structures, file handling, networking, and graphical user interfaces. Common data structures in Java include arrays and ArrayLists, which are used to " +
                        "store collections of data. Java also supports control structures like loops, conditionals, and exception handling to manage program flow and errors. Because of its reliability, " +
                        "security features, and cross-platform capability, Java is widely used in software development, Android apps, web applications, and backend systems. Its syntax is similar to C++, " +
                        "but it removes many complex features to make programming safer and easier to learn for beginners while still being powerful enough for advanced developers building complex systems" +
                        " and scalable applications."
        ));
    }

    /*
     * Tests the validateTitleField method.
     * Ensures title is non-empty and under 100 characters.
     */
    @Test
    public void testTitleFieldIsValid() {

        assertTrue(InputValidator.validateTitleField("Hello World")); // valid
        assertFalse(InputValidator.validateTitleField(""));           // empty

        // overly long title (>100 characters)
        assertFalse(InputValidator.validateTitleField(
                "Java is a programming language used to " +
                        "build apps, websites, and software across many platforms." +
                        "but it removes many complex features "
        ));
    }

    /*
     * Tests the validateCreationDateField method.
     * Ensures date is valid, not in the future, and not empty.
     */
    @Test
    public void testCreationDateFieldIsValid() {

        assertTrue(InputValidator.validateCreationDateField("2008", "01","04"));   // valid past date
        assertFalse(InputValidator.validateCreationDateField("2026", "07","04"));  // future date
        assertFalse(InputValidator.validateCreationDateField("", "", ""));         // empty input
        assertFalse(InputValidator.validateCreationDateField("2020", "", ""));     // incomplete input
    }

    /*
     * Tests the validatePriceField method.
     * Ensures correct handling of currency/price combinations and validation rules.
     */
    @Test
    public void testPriceFieldIsValid() {

        assertTrue(InputValidator.validatePriceField("euro", "10.99")); // valid
        assertTrue(InputValidator.validatePriceField("", ""));          // both empty (allowed)

        assertFalse(InputValidator.validatePriceField("US DOLLAR", "")); // missing price
        assertFalse(InputValidator.validatePriceField("", "10.00"));     // missing currency
        assertFalse(InputValidator.validatePriceField("Yen", "20.09"));  // unsupported currency
    }

    /*
     * Tests the validateUserNameField method.
     * Ensures username is non-empty, unique, and within length limits.
     */
    @Test
    public void testUserNameFieldIsValid() {

        assertFalse(InputValidator.validateUserNameField(""));        // empty username
        assertTrue(InputValidator.validateUserNameField("Daniel"));   // valid new username
        assertFalse(InputValidator.validateUserNameField("Daniel"));  // duplicate username
        assertTrue(InputValidator.validateUserNameField("Son!"));     // valid unique username
    }
}