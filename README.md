# EmailValidator

A simple Java console application demonstrating **collections** and **regular expressions**.

---

## Overview

This project manages a collection of unique email addresses using a `HashSet` and validates emails with regex.

The main class provides a command-line interface to:

- Add emails (with format validation)
- Display all stored emails
- Check if an email exists
- Remove emails

The program ensures only valid and unique emails are stored, showcasing effective use of Java collections and pattern matching.

---

## How to Run

1. Compile the project in your IDE (e.g., IntelliJ or VS Code).
2. Run the `EmailValidatorApp` main class.
3. Use the menu to add, display, check, or remove emails interactively.

---

## Sample Interaction

Welcome to Email Validator!

Add Email

Display Emails

Check Email

Remove Email

Exit

Choose an option: 1 <br>
Enter email to add: user@example.com <br>
Email added successfully.

Choose an option: 2 <br>
Stored Emails: <br>

- user@example.com

Choose an option: 3 <br>
Enter email to check: user@example.com <br>
Email exists in the collection.

Choose an option: 4 <br>
Enter email to remove: user@example.com <br>
Email removed.

Choose an option: 5 <br>
Process finished with exit code 130

---

## Concepts Demonstrated

- Java Collections (`HashSet`) for uniqueness
- Regular Expressions for email validation
- User input handling via console
- Basic object-oriented design  

---

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

Feel free to extend the project with new features or a graphical interface!