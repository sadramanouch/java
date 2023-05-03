import java.util.Scanner;
public class test{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int positive = input.nextInt();
        int odd;
        for (odd=positive-1; odd>0;odd--){
            if (odd%5==0 && odd%3 != 0){
                System.out.print("The answer is: "+ odd);
                break;
            }
            else {
                System.out.println( odd +" is not the answer ");
            }
        }
    }
}
