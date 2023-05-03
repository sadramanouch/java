/**
 * Program Name: Temp
 * Author: Sadra Manouchehrifar
 * Date: 2021-09-23
 * Course: CPSC 1150
 * Compiler: JDK 16
 */

import java.util.Scanner;
public class Temp {
    //This program calculates the chill index with a formula
    public static void main(String[] args) {
        //We assign three variables that are needed for the result and inputs from the user
        double temp, wind;
        int chill;
        Scanner input = new Scanner (System.in);
        //We start getting input from the user 
        System.out.print("\nEnter the temprature in Celsius: ");
        temp = input.nextInt();
        System.out.print("Enter the wind speed kilometers per hour: ");
        wind = input.nextInt();
        //This is the formula that calculates the result in integer
        chill =(int)(13.112+ (0.6215*temp) - (11.37*Math.pow(wind,0.16)) + (0.3965*temp*Math.pow(wind,0.16)));
        //the following are a series of if statements that determine if the answer is between the guide lines and if yes, displayes the answer
        if (temp < -50 || temp > 5) {
            System.out.println("Invalid temprature input!\n");
        }
        else if (wind < 0 || wind > 100) {
            System.out.println("Invalid wind speed input!\n");
        }
        else {
            System.out.println("The wind chill index is " + chill + "\n");
        }
    }
}
