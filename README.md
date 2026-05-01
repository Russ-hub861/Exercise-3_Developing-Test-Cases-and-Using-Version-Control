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


## Methods

### 1. testLastNameField(String input)

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

### 2. testEmail(String input)

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

### 3. testDimension(String input)

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

## Return Value

All methods return:
- `true` → input is valid  
- `false` → input is invalid
