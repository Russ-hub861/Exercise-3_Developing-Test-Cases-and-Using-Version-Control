**Team Members:**

Cole F. Russell, Lena Barrett, Daniel E. Celedon,
& Son Le Dinh Truong.


**Class Descriptions:** The *InputValidator* class's purpose is to create methods that check validity of what the user is 
inputting on our website including their personal information and things added by the admin regarding information about a painting.
This includes features such as price, medium, and dimensions.

The *InputValidatorTest* class shows various test cases that account for what is and is not considered a valid input.

A "How To Use" section where your team explain how to use the Validator class and the tester.
A "Reflection" section where your team talks about the experience. You can use these questions to start:

### 5. isValidImage(String imageData, int imageSize)


Validates an image file type and size.

**Rules:**
- Must not be null or empty
- Must be a .png or .jpg file type
- Must be no larger than 4mb

**Examples:**
- Valid: `imageName.png, 4`, `imageName.jpg, 3`
- Invalid: `imageName.gif, 4`, `imageName.png, 5`, `imageName.jpg, 5`, `""`

---

### 6. isValidPhoneNum(String n)

Validates a U.S. phone number.

**Rules:**
- Must begin with U.S. country code `1`. the format: `name@example.com`
- Must be 10 digits long (including the country code).
- Must contain only numbers no special characters.


**Examples:**
- Valid: `13109061152`, `12345678900`
- Invalid: `02118063152`, `1012345678`


---

## Return Value

All methods return:
- `true` → input is valid
- `false` → input is invalid

# Reflection
"How did writing tests first help (or slow down) your development?
Did your team face any conflicts when merging or reviewing code?
How would you expand or refactor your validator for future use?"

Writing tests first helped to structure our ideas before conducting them. I believe the process can feel tedious at time, but 
it can be as necessary as a blueprint is before building a house. There is learning curve to git commands but with the help of Son in our group and group effort to make sure everyone 
was able to push their files smoothly, any conflicts resolved themselves easily. In the future,
expanding in refactoring could be expanded upon once we figure out each other's work ethic and voice when coding,
so cohesion of a final product will also be more cohesive. In addition, file management is important when working on different compilers.