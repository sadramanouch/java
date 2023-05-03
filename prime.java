import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,temp;
        System.out.println("Please enter an integer number: ");
        number = input.nextInt();
        temp=2;
        while (temp<number) {
            if (number % temp ==0){
                System.out.println (number+ " is not a prime number.");
                return;
            }
            temp++;
        }
        System.out.println(number+ " is a prime number.");
    }
}
