package gr.ggeorgiadis.emailvalidator;

import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidator {
    private HashSet<String> emailSet = new HashSet<>();
    private Scanner scanner = new Scanner(System.in);
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

    public void run() {
        int choice = 0;

        do {
            System.out.println("\n=== Email Validator ===");
            System.out.println("1. Add Email");
            System.out.println("2. Display Emails");
            System.out.println("3. Check if Email Exists");
            System.out.println("4. Remove Email");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1 -> addEmail();
                case 2 -> displayEmails();
                case 3 -> checkEmail();
                case 4 -> removeEmail();
                case 5 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid input. Please enter a number between 1-5.");
            }
        } while (choice != 5);
    }

    private void addEmail() {
        System.out.print("Enter email to add: ");
        String email = scanner.nextLine().trim();

        if (!isValidEmail(email)) {
            System.out.println("Invalid email format. Please try again.");
            return;
        }

        if (emailSet.add(email)) {
            System.out.println("Email added.");
        } else {
            System.out.println("Email already exists.");
        }
    }

    private boolean isValidEmail(String email) {
        return EMAIL_PATTERN.matcher(email).matches();
    }

    private void displayEmails() {
        if (emailSet.isEmpty()) {
            System.out.println("No emails stored.");
        } else {
            System.out.println("Stored Emails:");
            emailSet.forEach(email -> System.out.println("- " + email));
        }
    }

    private void checkEmail() {
        System.out.print("Enter email to check: ");
        String email = scanner.nextLine().trim();
        if (emailSet.contains(email)) {
            System.out.println("Email exists.");
        } else {
            System.out.println("Email not found.");
        }
    }

    private void removeEmail() {
        System.out.print("Enter email to remove: ");
        String email = scanner.nextLine().trim();
        if (emailSet.remove(email)) {
            System.out.println("Email removed.");
        } else {
            System.out.println("Email not found.");
        }
    }
}
