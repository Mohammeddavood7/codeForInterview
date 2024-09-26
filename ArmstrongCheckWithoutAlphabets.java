
import java.util.Scanner;

public class ArmstrongCheckWithoutAlphabets
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string containing numbers and alphabets: ");
        String input = scanner.nextLine();

        // Remove alphabetic characters from the input string
        String numericString = input.replaceAll("[^0-9]", "");

        if (numericString.isEmpty()) {
            System.out.println("No numeric characters found in the input string.");
        } else {
            int number = Integer.parseInt(numericString);
            if (isArmstrong(number)) {
                System.out.println(number + " is an Armstrong number.");
            } else {
                System.out.println(number + " is not an Armstrong number.");
            }
        }

        scanner.close();
    }

    public static boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0, n = 0;
        originalNumber = number;

        // Count digits
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }

        originalNumber = number;

        // Calculate result
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        // Check if number is Armstrong
        return result == number;
    }
}
