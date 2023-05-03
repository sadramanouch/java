

// Program Name: Roman
// Author: Sadra Manouchehrifar
// Date: 2021-11-17
// Course: CPSC 1150
// Compiler: JDK 16

import java.util.*;
public class Roman{
    public static void main(String[] args){
        // we initiate Scanner 
        Scanner input = new Scanner (System.in);
        // we ask the user to enter a number between 0 and 3999
        System.out.println("Please enter an integer from 0 to 3999: ");
        int num = input.nextInt();
        // if the num is not between 0 and 3999, out program will give nad error of Invalid Input
        if (num>3999 || num<1){
            System.out.println("Invalid input! ");
        }
        else{
            // if the number is valid, we call the method romanChange
            System.out.println("The Roman Number System equivilant of your input is: "+romanChange(num));
        }
    }
    public static String romanChange(int num){
        String roman = "";
        // while the number is more than a specific number, we add a letter to our string and minus the number from its bigger parents number
        // that goes on with all of these while loops 
        // we minus smaller numbers until the number is 0 and return the string back
        while (num >= 1000){
            roman+="M";
            num -=1000;
        }
        while (num >=900){
            roman += "CM";
            num -=900;
        }
        while (num >=500 ){
            roman += "D" ;
            num -= 500;
        }
        while (num >=400){
            roman += "CD";
            num -= 400;
        }
        while (num >=100){
            roman += "C";
            num -= 100;
        }
        while (num >= 90){
            roman += "XC";
            num -= 90;
        }
        while (num >= 50){
            roman += "L";
            num -= 50;
        }
        while (num >= 40){
            roman += "XL";
            num -= 40;
        }
        while (num >= 10){
            roman += "X";
            num -= 10;
        }
        while (num >= 9){
            roman += "IX";
            num -= 9;
        }
        while (num>=5){
            roman += "V";
            num -= 5;
        }
        while (num >= 4){
            roman += "IV";
            num -= 4;
        }
        while (num>= 1){
            roman += "I";
            num -= 1;
        }
        return roman;
    }
}