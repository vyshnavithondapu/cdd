import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Checking if it's an Armstrong number
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        
        scanner.close();
    }

    // Method to check if a number is Armstrong
    public static boolean isArmstrong(int num) {
        int originalNum = num, sum = 0, digits = 0;

        // Counting the number of digits
        int temp = num;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        // Calculating the sum of digits raised to the power of count
        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        // Checking if the sum equals the original number
        return sum == originalNum;
    }
}
