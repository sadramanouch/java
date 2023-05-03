import java.util.Scanner;
public class Lab1 {
    public static void main (String[] args) {
        Double radius, area, volume;
        int length;
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the radius of a cylinder: ");
        radius = input.nextDouble();
        System.out.print("Enter the length of a cylinder: ");
        length = input.nextInt();
        area = (Math.pow(radius, 2) * (Math.PI));
        volume = area * length;
        System.out.println("\nThe volume is "+volume);
    }
}