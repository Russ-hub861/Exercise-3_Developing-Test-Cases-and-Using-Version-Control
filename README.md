# Input Validator

## Methods

### 1. isValidFirstName

Validates a first name.

**Rules:**
- Must not be null or empty
- Must be at least 2 characters long
- Can contain letters and spaces (including diacritics)

**Examples:**
- Valid: `Cole`, `Nguyễn`, `Van Dyke`, 
- Invalid: `A`, `Smith123`, `@Smith`, `""`

---

### 2. isValidPostalCode

Makes sure that the postal code is valid 

**Rules:**
- Must be exactly 5 digits (only for the U.S.A.)
- Can be empty if the postal code is from another country

**Examples** 
- Valid: `49006`, `48219`, ``
- Invalid: `123`, `4800`, `52`

---

### 3. isValidPassword

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

### 4. isValidMedium

Checks whether the medium is on the drop down list of mediums 

**Rules:**
- Should be one of the accepted media (the field for a painting medium is a dropdown    menu).
- Should not be empty.

**Examples:**
- Valid: `clay`, `graphite`, `digital`
- Invalid: `null`, `dirt`, `pineapple`

---

### Return Values

All methods return 
- `True` -> inputs are valid 
- `False` -> inputs are invalid 


