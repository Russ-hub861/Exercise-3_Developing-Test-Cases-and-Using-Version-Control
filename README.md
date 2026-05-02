
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


