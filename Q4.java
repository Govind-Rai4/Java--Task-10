import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        System.out.println("Q4");
        System.out.println("Enter your password:");
        String password = scanner.nextLine();
        int strengthLevel;

        if (password.length() < 6) {
        strengthLevel = 1;
        } else if (password.length() <= 10) {
          strengthLevel = 2;
        } else {
        boolean hasUpperCase = !password.equals(password.toLowerCase());
        boolean hasLowerCase = !password.equals(password.toUpperCase());
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasSpecialChar = password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?].*");
         if (hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar) {
        strengthLevel = 3;
    } else {
        strengthLevel = 0;
    }
}
switch (strengthLevel) {
    case 1 -> System.out.println("Weak");
    case 2 -> System.out.println("Moderate");
    case 3 -> System.out.println("Strong");
    default -> System.out.println("Invalid password input.");
}
    }
}