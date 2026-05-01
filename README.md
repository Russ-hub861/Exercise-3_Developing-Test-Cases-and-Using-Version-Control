# Input Validator

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
