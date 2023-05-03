import java.util.Scanner;
public class Divisible {
  public static void main(String[] args) {
        int positive1, devisor, result;
        Scanner input = new Scanner (System.in);

        System.out.print("\nEnter a positive integer number: ");
        positive1 = input.nextInt();
        System.out.print("Enter a positive integer number: ");
        devisor = input.nextInt(); 
        result = positive1/devisor;

        if (positive1 <= 0 || devisor <=0) {
            System.out.println("\nError: Expecting a positive number");
        }
        else if (positive1 < devisor){
            System.out.println("\nError: First number must be bigger than the second number");
        }
        else if (positive1 % devisor ==0) {
            System.out.println("\n" +positive1 + " is divisible by " + devisor);
        }
        else{
            System.out.println("\n" +positive1 + " is not dvisible by "+ devisor);
        }
    } 
}
