package xpNinja;

/**************************************************************
 * XP EXERCICE NINJA
 * @author Melissa Kouadio
 * @link https://github.com/DiamondArt/
 **************************************************************/
public class XpNinja {
    public static void main(String[] args) {
        matrix();

        int[] numbers1 = {2, 8, 7, 5};
        System.out.println("warOfNumbers([2, 8, 7, 5]) => " +warOfNumbers(numbers1));

        int[] numbers2 = {12, 90, 75};
        System.out.println("warOfNumbers([12, 90, 75]) => " +warOfNumbers(numbers2));

        int[] numbers3 = {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243};
        System.out.println("warOfNumbers([5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243]) => " +warOfNumbers(numbers3));

    }

    public static void matrix(){
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int warOfNumbers(int[] numbers) {
        int sumOfOdds = 0;
        int sumOfEvens = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0)
                sumOfEvens += numbers[i];
            else
                sumOfOdds += numbers[i];
        }

        return sumOfEvens > sumOfOdds
                ? sumOfEvens - sumOfOdds
                : sumOfOdds - sumOfEvens;
    }
}
