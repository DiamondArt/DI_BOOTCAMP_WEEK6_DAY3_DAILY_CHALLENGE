package xpGold;

import java.util.Scanner;

/**************************************************************
 * XP EXERCICE GOLD
 * @author Melissa Kouadio
 * @link https://github.com/DiamondArt/
 **************************************************************/

public class XpGold {
    public static void main(String[] args) {
        NaturalLogarithm();
        CountNumbers();
        displayFibonacci();

    }

    /*******************************************************************
     *                  Exercice 1: CountNumbers()
     *******************************************************************/

    public static void CountNumbers(){
        Scanner sc = new Scanner(System.in);
        int positivesCount = 0;
        int negativesCount = 0;
        int zerosCount = 0;
        String input;

        do {
            System.out.println("Input an integer : ");
            input = sc.nextLine();
            try {
                int val = Integer.parseInt(input);
                if(val > 0)
                    positivesCount++;
                else if(val < 0)
                    negativesCount++;
                else
                    zerosCount++;
            } catch (Exception e) {
                input = "";
            }
        } while (input != "");

        System.out.println("Positive values:" + positivesCount);
        System.out.println("Negative values:" + negativesCount);
        System.out.println("Zero values:" + zerosCount);

 }


    /*******************************************************************
     *                  Exercice 2: NaturalLogarithm()
     *******************************************************************/
    public static void NaturalLogarithm() {
        System.out.println("Enter a positive integer: ");
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        scanner.close();

        double res = 0;
            for (double i = 1; i <= n; i++) {
                res += (double) ( (i % 2 == 0)
                        ? (-1 / i)
                        : 1 / i);
            }
         System.out.println("Natural logarithm of " + n + " is " + res +"\n\n");
    }

    /*******************************************************************
     *                  Exercice 3: Fibonacci()
     *******************************************************************/
    public static long fib(long n) {
        if (n == 0 || n == 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void displayFibonacci() {
        System.out.println("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 0; i <= n; i++) {
            System.out.printf("%d\t", fib(i));
        }
    }

}




