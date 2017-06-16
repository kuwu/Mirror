import java.util.Scanner;

/**
 * Created by kuwu on 2017/06/10.
 *
 * This program will evaluate a number input by the user
 * and see if the sum of the cubes of the number's digits
 * is equal to the number itself. The result will be output
 * to the console as True or False.
 *
 */


public class Mirror {
    Scanner scnr = new Scanner(System.in);

    void doCheck() {

        // input number
        System.out.println("Enter a number ");
        int input  = scnr.nextInt();
        int num = input;
        int sum = 0;

        // get the number of digits entered
        int numOfDigits = String.valueOf(num).length();

        // loop to check sum of the digits entered
        while (num != 0) {
            int digit = num % 10;
            sum += (int)Math.pow(digit, numOfDigits);
            num /= 10;
        }

        // result of Method
        if (sum == input) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }






    public static void main(String [] args){
        Scanner scnr = new Scanner(System.in);
        char userChar = '_';
        String userInput;


        // loop allows user to input numerous numbers using 'n' until the user
        // types 'q' to quit
        while (userChar != 'q') {

            Mirror check = new Mirror();
            check.doCheck();


            System.out.println("Enter 'n' for next check or 'q' to quit");
            userInput = scnr.next();
            userChar = userInput.charAt(0);

        }

        // Informing the user the program has ended
        System.out.print("Quitting the program");

        return;

        }

    }
