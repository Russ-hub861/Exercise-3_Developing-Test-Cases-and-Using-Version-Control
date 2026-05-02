**Team Members:**

Cole F. Russell, Lena Barrett, Daniel E. Celedon,
& Son Le Dinh Truong.


**Class Descriptions:** The *InputValidator* class's purpose is to create methods that check validity of what the user is 
inputting on our website including their personal information and things added by the admin regarding information about a painting.
This includes features such as price, medium, and dimensions.

The *InputValidatorTest* class shows various test cases that account for what is and is not considered a valid input.

# InputValidator

## Methods

### 1. isValidImage(String imageData, int imageSize)


Validates an image file type and size.

**Rules:**
- Must not be null or empty
- Must be a .png or .jpg file type
- Must be no larger than 4mb

**Examples:**
- Valid: `imageName.png, 4`, `imageName.jpg, 3`
- Invalid: `imageName.gif, 4`, `imageName.png, 5`, `imageName.jpg, 5`, `""`

---

### 2. isValidPhoneNum(String n)

Validates a U.S. phone number.

**Rules:**
- Must begin with U.S. country code `1`. the format: `name@example.com`
- Must be 10 digits long (including the country code).
- Must contain only numbers no special characters.


**Examples:**
- Valid: `13109061152`, `12345678900`
- Invalid: `02118063152`, `1012345678`


### 3. isValidFirstName

Validates a first name.

**Rules:**
- Must not be null or empty
- Must be at least 2 characters long
- Can contain letters and spaces (including diacritics)

**Examples:**
- Valid: `Cole`, `Nguyễn`, `Van Dyke`, 
- Invalid: `A`, `Smith123`, `@Smith`, `""`

---

### 4. isValidPostalCode

Makes sure that the postal code is valid 

**Rules:**
- Must be exactly 5 digits (only for the U.S.A.)
- Can be empty if the postal code is from another country

**Examples** 
- Valid: `49006`, `48219`, ``
- Invalid: `123`, `4800`, `52`

---

### 5. isValidPassword

Makes sure that a passwords meets all needed requirements 

**Rules:** 

- Must not be empty.
- At least 8 characters long.
- At least one uppercase letter, one lowercase letter, and one digit.
- Can use the special characters !, -, *, and ..

**Examples:** 
- Valid: `Password1`, `Secure-123`, `pAssword1`
- Invalid: `password1`, `12345678`, `bobthebest`

---

### 6. isValidMedium

Checks whether the medium is on the drop down list of mediums 

**Rules:**
- Should be one of the accepted media (the field for a painting medium is a dropdown    menu).
- Should not be empty.

**Examples:**
- Valid: `clay`, `graphite`, `digital`
- Invalid: `null`, `dirt`, `pineapple`

---

### 7. testLastNameField(String input)

Validates a last name.

**Rules:**
- Must not be null or empty
- Must be at least 2 characters long
- Can contain letters (including diacritics)
- Can include spaces and dashes
- Cannot contain numbers or special characters

**Examples:**
- Valid: `Smith`, `Nguyễn`, `Van Dyke`, `Smith-Jones`
- Invalid: `A`, `Smith123`, `@Smith`, `""`

---

### 8. testEmail(String input)

Validates an email address.

**Rules:**
- Must follow the format: `name@example.com`
- Must contain exactly one `@`
- Must contain a valid domain and top-level domain
- No spaces or invalid characters allowed

**Examples:**
- Valid: `name@example.com`, `first.last@example.com`
- Invalid: `nameexample.com`, `@example.com`, `name@`, `name@example`

---

### 9. testDimension(String input)

Validates a dimension string.

**Format:**
- `number x number + unit`

**Rules:**
- Accepts integers or decimals
- Allows optional spaces around `x` and before unit
- Must include a valid unit: `cm`, `mm`, `m`, `in`, `ft`
- No extra characters allowed

**Examples:**
- Valid: `10x20cm`, `10 x 20 cm`, `10.5x20.25cm`
- Invalid: `10x20`, `10x20kg`, `x20cm`, `10xx20cm`

---
### 10. validateDescriptionField(String desc)

Validates a description.

**Rules:**
- Must not be null or empty
- Must be less than 1000 characters

Check the code to see examples

---

### 11. validateTitleField(String title)

Validates a title.

**Rules:**
- Must not be null or empty
- Must be less than 100 characters

---

### 12. validateUserNameField(String username)

Validates a username.

**Rules:**
- Must be unique
- Must be less than 20 characters
- Must not be empty

**Examples:**
- Valid: `Daniel`, `Son`
- Invalid: ``, `Daniel`(second time)

---
### 13. validateDateOfBirthField(String year, String month, Dtring day)

Validates a date of birth.

**Rules:**
- Must not be empty
- Must be reasonable
- Must be 18+
- Must be numbers

**Format:**
- `Year, Month, Day`

**Examples:**
- Valid: `2008, 01, 10`, `2000, 08, 19`
- Invalid: ``, `2027, 01, 10`, `2020, 01, 18`
  
---
### 14. validateCreationDateField(String year, String month, Dtring day)

Validates a creation date.

**Rules:**
- Must not be empty
- Must be reasonable
- Must be numbers

**Format:**
- `Year, Month, Day`

**Examples:**
- Valid: `2001, 01, 10`, `1998, 12, 19`
- Invalid: ``, `2027, 01, 10`, `2029, 01, 18`

---
### 15. validatePriceField(String currency, String price)

Validates a Price.

**Rules:**
- Can be empty(either both should be empty or both should be filled
- Must be either "US DOLLAR", "CANADIAN DOLLAR", "EURO", "PESO", or "BIT COIN"
- Price can't be negative

**Format:**
- Price has to be in a 0.00 format

**Examples:**
- Valid: `US dollar, 10.00`, `Euro, 9.99`
- Invalid: `Yen, 7.99`, `US dollar, `


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
