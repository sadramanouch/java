
// Program Name: Stringg
// Author: Sadra Manouchehrifar
// Date: 2021-11-30
// Course: CPSC 1150
// Compiler: JDK 16


import java.util.*;
public class Stringg{
    public static void main(String[] args) {
        // initiating the Scanner
        Scanner input = new Scanner (System.in);
        // asking the user for numbers 1 and 2
        System.out.print("Number1: ");
        String num1 = input.next();
        System.out.print("Number2: ");
        String num2 = input.next();
        // calling the method
        Check(num1, num2);
    }
    public static void Check (String num1, String num2){
        // if the number1 is bigger than 40, provides error
        if (num1.length() > 40){
            System.out.println("Your input for num1 is incorrect.");
            System.out.println("Expecting up to 40 digit number.");
        }
        // if number 2 is bigger than 40, provides error
        else if (num2.length() > 40){
            System.out.println("Your input for num2 is incorrect.");
            System.out.println("Expecting up to 40 digit number.");
        }
        // if any of the numbers have any characters that are not 0 to 9, it provides an error
        else {
            for (int i=0; i<num1.length(); i++){
                if (num1.charAt(i) < '0' || num1.charAt(i) > '9'){
                    System.out.println("Yout input for num1 is incorrect.");
                    System.out.println("Expecting all digit characters.");
                    return;
                }
            }
            for (int i=0; i<num2.length(); i++){
                if (num2.charAt(i) < '0' || num2.charAt(i) > '9'){
                    System.out.println("Yout input for num2 is incorrect.");
                    System.out.println("Expecting all digit characters.");
                    return;
                }
            }
        }
        // if no errors are created, it gets to this part which adds comma to the inputs accordingly
        String res1 = "";
        for (int i=1; i<=num1.length(); ++i){
            char ch = num1.charAt(num1.length()-i);
            if (i % 3 == 1 && i > 1){
                res1 = "," + res1;
            }
            res1 = ch + res1;
        }
        String res2 = "";
        for (int i=1; i<=num2.length(); ++i){
            char ch = num2.charAt(num2.length()-i);
            if (i % 3 == 1 && i > 1){
                res2 = "," + res2;
            }
            res2 = ch + res2;
        }
        // after putting comma's, it adds to the shorter number accordingly so they line up beautifully
        String line1 = "";
        String line2 = "";
        if (res1.length() > res2.length()){
            int spc =  res1.length() - res2.length();
            for (int i = 0; i<spc; i++){
                line2 += " ";
            }
        }
        else{
            int spc =  res2.length() - res1.length();
            for (int i = 0; i<spc; i++){
                line1 += " ";
            }
        }
        // we initate two new String and sotre the number's and comma's into them
        String final1 = line1 + res1;
        String final2 = line2 + res2;
        // initiate a new string for the hash line after the two lines
        String hash = "";
        // we provide the hash line according to the biggest line's length
        if (final1.length() > final2.length()){
            for (int i = 0; i<final1.length(); i++){
                hash += "-";
            }
        }
        else{
            for (int j = 0; j<final2.length(); j++){
                hash += "-";
            }
        }
        // print out an empty line, line 1 plus the + sign indicating this is a addition, line 2, and the hash line
        System.out.println("");
        System.out.println(final1 + " +");
        System.out.println(final2);
        System.out.println(hash);
        // now we turn the two numbers into long to add them into a new long number
        long num11 = Long.parseLong(num1);
        long num22 = Long.parseLong(num2);
        // we add the two numbers and store them
        long num33 = num11 + num22;
        String num3 = String.valueOf(num33);
        String res3 = "";
        // for the result we add the comma's accordingly 
        for (int i=1; i<=num3.length(); ++i){
            char ch = num3.charAt(num3.length()-i);
            if (i % 3 == 1 && i > 1){
                res3 = "," + res3;
            }
            res3 = ch + res3;
            // we display the result and voila 
        }System.out.println(res3);
    }
}