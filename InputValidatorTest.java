/*
 * These are the libraries from JUnit that allows you to test
 * Java applications. For more information check the complete tutorial
 * here: https://www.tutorialspoint.com/junit/index.htm
 */
import org.junit.Test;

import static java.util.Locale.US;
import static org.junit.Assert.*;


public class InputValidatorTest {
    
    /*
     * Example test method for a possible Name field validator method in your
     * InputValidator class.
     * For more information about assertion tests check:
     * https://www.tutorialspoint.com/junit/junit_using_assertion.htm
     */

    @Test
    public void testDateOfBirthFieldIsValid() {

        assertTrue(InputValidator.validateDateOfBirthField("2008", "01","04"));
        assertFalse(InputValidator.validateDateOfBirthField("2010", "01","04"));
        assertFalse(InputValidator.validateDateOfBirthField("2008", "07","04"));
        assertFalse(InputValidator.validateDateOfBirthField("", "",""));
        assertFalse(InputValidator.validateDateOfBirthField("2020", "", ""));
    }

    @Test
    public void testDescriptionFieldIsValid() {

        assertTrue(InputValidator.validateDescriptionField("Hello World"));
        assertFalse(InputValidator.validateDescriptionField(""));
        assertFalse(InputValidator.validateDescriptionField("Java is a high-level, object-oriented programming language" +
                " widely used for building applications, from mobile apps to large-scale enterprise systems. It was designed with the principle of “write once, run anywhere,”" +
                " meaning that compiled Java code can run on any device that has a Java Virtual Machine (JVM), making it highly portable. Java uses classes and objects as its " +
                "core structure, which helps organize code in a modular and reusable way. It has strong memory management, automatic garbage collection, and a large standard library " +
                "that supports data structures, file handling, networking, and graphical user interfaces. Common data structures in Java include arrays and ArrayLists, which are used to " +
                "store collections of data. Java also supports control structures like loops, conditionals, and exception handling to manage program flow and errors. Because of its reliability, " +
                "security features, and cross-platform capability, Java is widely used in software development, Android apps, web applications, and backend systems. Its syntax is similar to C++, " +
                "but it removes many complex features to make programming safer and easier to learn for beginners while still being powerful enough for advanced developers building complex systems" +
                " and scalable applications."));
    }

    @Test
    public void testTitleFieldIsValid() {

        assertTrue(InputValidator.validateTitleField("Hello World"));
        assertFalse(InputValidator.validateTitleField(""));
        assertFalse(InputValidator.validateTitleField("Java is a programming language used to " +
                "build apps, websites, and software across many platforms." + "but it removes many complex features "));
    }
    // CREATE MORE TESTS HERE

    @Test
    public void testCreationDateFieldIsValid() {

        assertTrue(InputValidator.validateCreationDateField("2008", "01","04"));
        assertFalse(InputValidator.validateCreationDateField("2026", "07","04"));
        assertFalse(InputValidator.validateCreationDateField("", "", ""));
        assertFalse(InputValidator.validateCreationDateField("2020", "", ""));

    }
    @Test
    public void testPriceFieldIsValid() {

        assertTrue(InputValidator.validatePriceField("euro", "10.99"));
        assertTrue(InputValidator.validatePriceField("", ""));
        assertFalse(InputValidator.validatePriceField("US DOLLAR", ""));
        assertFalse(InputValidator.validatePriceField("", "10.00"));
        assertFalse(InputValidator.validatePriceField("Yen", "20.09"));
    }

    @Test
    public void testUserNameFieldIsValid() {

        assertFalse(InputValidator.validateUserNameField(""));
        assertTrue(InputValidator.validateUserNameField("Daniel"));
        assertFalse(InputValidator.validateUserNameField("Daniel"));
        assertTrue(InputValidator.validateUserNameField("Son!"));

    }


}