# Email Slicer 📧

A simple Java console application that extracts the **username** and **domain** from an email address entered by the user.

## Features

* Accepts an email address as user input.
* Validates whether the email contains the `@` symbol.
* Extracts the username (before `@`).
* Extracts the domain (after `@`).
* Displays an error message for invalid email addresses.

## Concepts Used

* Java Strings

    * `contains()`
    * `indexOf()`
    * `substring()`
* Conditional Statements (`if-else`)
* User Input using `Scanner`

## Example

### Input

```text
Enter Your Email:
john.doe@gmail.com
```

### Output

```text
Username: john.doe
Domain: gmail.com
```

## How to Run

1. Compile the program:

   ```bash
   javac EmailSlicer.java
   ```

2. Run the program:

   ```bash
   java EmailSlicer
   ```

## Project Structure

```text
EmailSlicer.java
README.md
```

## Author

Created as part of my Java learning journey.
