/*
Read in number of scores that is entered by the user, the values of those scores and output the highest score and the average score; then, for each score, output the amount by which that score differs from the average. 

Use the array data structure to save the scores. 
 */

import java.util.*;

public class AvgScore {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.print("How many scores? ");

        int n = user.nextInt();

        int arr[] = new int[n];


        for (int i = 0; i < n; i++) {// for reading array
            System.out.print("\nEnter a score: ");
            arr[i] = user.nextInt();

        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("\nThe highest score is " + max);
        

        //sum scores
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        //average scores
        double avg = total / arr.length;
        System.out.println("\nThe average is: " + avg + "\n\n");

        for (int i : arr) { // for printing array

            if(i < avg)
            {
                System.out.println(i + " is below average by " + (avg-i) + "\n");
            }
            else if (i > avg) {
                System.out.println(i + " is above average by " + (i - avg) + "\n");
            }
            else
            {
                System.out.println(i + " is the average" + "\n");
            }

        }

    }
    
}
