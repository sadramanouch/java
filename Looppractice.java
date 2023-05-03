import java.util.*;
public class Looppractice {
    public static void main(String[] args) {
        int num; 
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Enter an integer! Enter 0 to exit");
            num = input.nextInt();
            while (num != 0) {
                System.out.println("Enter an integer! Enter 0 to exit");
                num = input.nextInt();
            }
        } while (num != 0);
    }
}