/**
 * Program Name: Square
 * Author: Sadra Manouchehrifar
 * Date: 2021-10-01
 * Course: CPSC 1150
 * Compiler: JDK 16
 */

import java.util.Scanner;
public class Square {

    //This program displays all squares less than the number inputed by the user
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //initialize num which is user's input
        int num;

        //receive input from the user
        System.out.print("Please enter a positive integer number: ");
        num = input.nextInt();

        //if num is in the range, this for loop displayed all squares before the number
        for (int i=0; Math.pow(i,2)<num; i++){
            System.out.print(" "+ (int)Math.pow(i,2));
        }
        
        // if input is not a positive integer, this statement is executed
        if (num<0){
            System.out.print("Invalid input!");
        }
    }
}
