package interfaces.exercise;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of emails to validate
        List<String> emails = Arrays.asList("test.email@example.com", "invalid-email@com", "valid.emaildomain.org");

        // Create an instance of Email and validate the emails
        Email emailValidator = new Email(emails);
        emailValidator.validateEmails();
    }
}
