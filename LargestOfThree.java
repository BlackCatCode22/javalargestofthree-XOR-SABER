/* LargestOfThree.java
*
* Alexander Betancourt 2/19/2023: 
* "Im bouta, end this man's career"
*
* input: three ints from user
* processing: find the largest of the three ints with decision structures
* output: the largest of three ints, the sum of three ints
 */

import java.util.Scanner;
import java.util.Arrays;
// C++ programers have a saying, if its in standard.. Use standard. 

public class LargestOfThree {
    public static void main(String[] args) {
        // You might as well use an array..
        int input[] = new int [3]; 
        int total = 0, largest = 0;
        // Create a scanner object for user input.
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\tPlease enter an integer for the first integer: ");
        input[0] = Integer.parseInt(scanner.nextLine());
        System.out.print("\tPlease enter the second integer: ");
        input[1] = Integer.parseInt(scanner.nextLine());
        System.out.print("\tPlease enter the third and last integer: ");
        input[2] = Integer.parseInt(scanner.nextLine());
        scanner.close();
        //One liners
        total = Arrays.stream(input).sum();
        // largest = Arrays.stream(input).max().getAsInt();
        // IF statements, take up way to much space. 
        largest = input[0];
        if (input[1] > largest) largest = input[1];
        if (input[2] > largest) largest = input[2];
        System.out.println("\tThe sum of " + input[0] + " and " + input[1] + " and " + input[2] + " is: " + total);
        System.out.println("\tThe largest of the three numbers is: " + largest);
    }
}