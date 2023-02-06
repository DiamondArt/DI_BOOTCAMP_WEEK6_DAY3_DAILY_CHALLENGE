package xp;

import java.util.Scanner;
/**************************************************************
 * XP EXERCICE
 * @author Melissa Kouadio
 * @link https://github.com/DiamondArt/
 **************************************************************/
 class Xp {
    public static void main(String[] args) {

        XpExercice printStar = new XpExercice(); //create an instance of class

        printStar.generateStar(8); // Exercice 1

        printStar.generateNumberOfTriangle(8); // Exercice 2

        Scanner userInput = new Scanner(System.in); // Exercice 3
        boolean isString = true;

        while (isString) {

            System.out.println("Enter a number please: ");
            try {

                String input = userInput.next();
                Integer inputValue = Integer.parseInt(input);
                printStar.reverdedWord(inputValue);
                printStar.armstrongNumbers(inputValue);

                if(inputValue instanceof  Integer) {
                    isString = false;
                }
            } catch (NumberFormatException nf) {
                System.err.println("this is not a integer");
            }
        }

    }

}
class XpExercice {

    /**************************************************************
     *                        EXERCICE I
     **************************************************************/
    public void generateNumberOfTriangle(int nbre){

        for(int i = 1; i < nbre; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }


    /**************************************************************
     *                        EXERCICE II
     **************************************************************/

    public void generateStar(int nbreStar) {

        for(int i = 1; i < nbreStar; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    /**************************************************************
     *                        EXERCICE III
     **************************************************************/
    public void reverdedWord(int nbre) {

        int reverse = 0;
        int remainder = 0;

        while (nbre > 0) {

            remainder = nbre%10;
            reverse = (reverse*10) +remainder;
            nbre = nbre/10;

        }
        System.out.print("The reverse of number typing is "+ reverse);

    }


    /**************************************************************
     *                        EXERCICE IV
     **************************************************************/
    public void armstrongNumbers(int nbre) {

        int area = 0;
        int nbreValue = nbre;

        while (nbre > 0) {
            int prev = nbre % 10;
            area = area + (prev * prev * prev); // calcul aire
            nbre = (nbre / 10);
        }

        if( area == nbreValue ) {
            System.out.println("\n Nice this number is a armstrong number :"+nbreValue+" \n");
        } else {
            System.out.println("\nThis number is not a armstrong number\n");
        }
   }
}
