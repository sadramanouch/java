/**
 * Program Name: triangle
 * Author: Sadra Manouchehrifar
 * Date: 2021-10-01
 * Course: CPSC 1150
 * Compiler: JDK 16
 */

import java.util.Scanner;
public class triangle {
    //This program displayes a triangle of numbers based on the the user's input
    public static void main(String[] args) {

        //we assign one value which is num (user's input)
        int num;
        Scanner input = new Scanner(System.in);

        //we get the input from the user
        System.out.print("Please enter a number between 1-9: ");
        num = input.nextInt();

        //while num is in the range, the following instructions will apply
        while (num<10 && num>0) {
            
            //write a pyramid double for loop but we add a nother for loop at the beginning to apply the amount of spaces needed for our pyramid to display correctly
            for (int i=1; i<=num; i++){
                for (int j=0; j<num-i; ++j){
                    System.out.print(" ");
                }
                for (int j=1;j<=i; j++){
                    System.out.print(j);
                }
                System.out.println();
            }
            break;
        }

        //if num is not in the range, this statement will be executed
        if (num>=10 || num<=0){
            System.out.println("Invalid input.");
        }
    }
}