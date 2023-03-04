import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SingIn singIn = new SingIn();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        String firstName = scanner.nextLine();
        singIn.setFirstName(firstName);

        System.out.println("Please enter your last name: ");
        String lastName = scanner.nextLine();
        singIn.setLastName(lastName);

        int age = 0;
        boolean validAge = true;
        while (validAge) {
            try {
                System.out.println("Please enter your age");
                age = Integer.parseInt(scanner.nextLine());
                singIn.setAge((byte) age);
                validAge = false;
            } catch (NumberFormatException e) {
                System.out.println("Invalid age. Please enter a number");
            }
        }

        String email = "";
        boolean validEmail = true;
        while (validEmail) {
            System.out.println("Please enter your email");
            email = scanner.nextLine();
            if (email.contains("@")) {
                singIn.setEmail(email);
                validEmail = false;
            } else {
                System.out.println("Invalid email. Please enter a valid email address");
            }
        }

        String password = "";
        boolean validPassword = true;
        while (validPassword) {
            System.out.println("Please enter your password");
            password = scanner.nextLine();
            if (password.length() >= 7) {
                singIn.setPassword(password);
                validPassword = false;
            } else {
                System.out.println("Password must be at least 7 characters long");
            }
        }
        System.out.println(singIn.toString());
    }
}
