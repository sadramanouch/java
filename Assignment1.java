import java.util.Scanner;
public class Assignment1 {
    //Main method
    public static void main(String[] args) {
        //Assigning stock price, number of shares, and commission rate
        double stockPrice, commissionRate;
        int numberOfShares;
        //initiating scanner for input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("\nThis program calculates the net proceeds from a sale of stock.");
        //getting input from the user
        System.out.print("\nPlease enter the value of Stock Price: $");
        stockPrice = input.nextDouble();
        System.out.print("Please enter the number of shares: ");
        numberOfShares = input.nextInt();
        System.out.print("10.12Please enter commission rate (as a percentage): ");
        commissionRate = input.nextDouble();
        //Assigning value of share, commission, and net proceeds
        double valueOfShare, commission, netProceeds;
        //computing value of share, commission, and net proceeds
        valueOfShare = stockPrice * numberOfShares;
        commission = valueOfShare * commissionRate/100;
        netProceeds = valueOfShare - commission;
        // Displaying the results
        System.out.println("\nVlaue of share: $"+valueOfShare+"\nCommission: $"+commission+ "\nNet proceeds: $"+netProceeds);
    }
}
