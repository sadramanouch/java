import java.util.*;
public class Noint{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a positive integer number up to 40 digits: ");
        String num = input.next();
        number(num);
    }
    public static void number (String num){
        if (num.length() > 40){
            System.out.println("Your input is incorrect.");
            System.out.println("Expecting up to 40 digit number.");
        }
        else {
            for (int i=0; i<num.length(); i++){
                if (num.charAt(i) < '0' || num.charAt(i) > '9'){
                    System.out.println("Yout input is incorrect.");
                    System.out.println("Expecting all digit characters.");
                    return;
                }
            }
            System.out.println("Your input is correct.");
        }
    }
}