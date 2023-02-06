package dailyChallenge;

import java.util.Scanner;

/**************************************************************
 * DAILY CHALLENGE
 * @author Melissa Kouadio
 * @link https://github.com/DiamondArt/
 **************************************************************/
public class DailyChallenge {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        // Multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }

        // Factorial
        int factorial = 1;
        int i = 1;
        while (i <= num) {
            factorial *= i;
            i++;
        }
        System.out.println("The factorial of " + num + " is " + factorial);

        // Fibonacci
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + " " + b + " ");
        do {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        } while (c < num);
        System.out.println();
    }
}
