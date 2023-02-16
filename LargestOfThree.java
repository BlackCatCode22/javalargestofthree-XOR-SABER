/* LargestOfThree.java
*
* dH 2/15/23
* Approved solution for Java programming class
* References:
*   https://www.w3schools.com/java/java_user_input.asp
*   https://www.w3schools.com/java/java_conditions.asp
*   https://www.w3schools.com/java/java_variables.asp
*
* input: three ints from user
* processing: find the largest of the three ints with decision structures
* output: the largest of three ints, the sum of three ints
 */

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        System.out.println("\n\n The Largest of Three Program \n\n");

        // Get three ints from the user.
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int total = 0;
        int largest = 0;

        // Create a scanner object for user input.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first integer.
        System.out.println("\n\n Please enter an integer for num1: ");

        // Input user reply to num1
        num1 = Integer.parseInt(scanner.nextLine());

        // Prompt the user for the second integer.
        System.out.println("\n\n Please enter the second integer: ");

        // Input user reply to num1
        num2 = Integer.parseInt(scanner.nextLine());

        // Prompt the user for the third integer.
        System.out.println("\n\n Please enter the third and last integer: ");

        // Input user reply to num1
        num3 = Integer.parseInt(scanner.nextLine());

        total = num1 + num2 + num3;

        System.out.println("\n The sum of " + num1 + " and " + num2 + " and " + num3 + " is: " + total);

        // Find the largest of three ints with decisions.
        if (num1 > num2) {
            if (num1 > num3) {
                largest = num1;
            }
            else {
                largest = num2;
            }
        }
        else {
            if (num2 > num3) {
                largest = num2;
            }
            else {
                largest = num3;
            }
        }

        System.out.println("\n\n The largest of " + num1 + " and " + num2 + " and " + num3 + " is: " + largest);

    }
}