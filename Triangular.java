import java.util.Scanner;
public class Triangular {
    public static void main(String[] args) {
        String respond;
        int x1,y1,x2,y2,x3,y3;
        Scanner input = new Scanner (System.in);
        do{
        System.out.println("\n This program calculates the perimeter of a Triangle.");
        System.out.print("\nPlease enter the x-coordinate of point1: ");
        x1 = input.nextInt();
        System.out.print("Please enter the y-coordinate of point1: ");
        y1 = input.nextInt();
        System.out.print("Please enter the x-coordinate of point2: ");
        x2 = input.nextInt();
        System.out.print("Please enter the y-coordinate of point2: ");
        y2 = input.nextInt();
        System.out.print("Please enter the x-coordinate of point3: ");
        x3 = input.nextInt();
        System.out.print("Please enter the y-coordinate of point3: ");
        y3 = input.nextInt();

        
        if (verify_input (x1,y1,x2,y2,x3,y3))
            System.out.println("\n Perimeter of a triangle with point 1 ("+ x1 +"," + y1 + "), point2 (" + x2 +","+ y2 + ") and point3 (" + x3 + "," + y3 + ") is: "+ Perimeter(x1,y1,x2,y2,x3,y3));
        
        System.out.println("\n Would you like to rpeat the program? ");
        respond = input.next();
        } while(respond.equalsIgnoreCase("yes"));
          
    }
    public static boolean verify_input (int x1, int y1, int x2, int y2, int x3, int y3){
        if ( x1<0 || x2<0 || x3<0 || y1<0 || y2<0 || y3<0){
            if ( x1>40 || x2>40 || x3>40 || y1>40 || y2>40 || y3>40){
                System.out.println("Error! Input's should be between 0 and 40. ");
                return false;
            }
        }
        if (x1==x2 && x2==x3){
            System.out.println("Error! This makes a straight line.");
            return false;
        }
        if (y1==y2 && y2==y3){
            System.out.println("Error! This makes a straight line.");
            return false;
        }
        if ((x1&y1)==(x2&y2) && (x2&y2)==(x3&y3)){
            System.out.println("Error! This makes a point. ");
            return false;
        }
        if ((x1==y1) && (x2==y2) && (x3==y3)){
            System.out.println("Error! This makes a diagonal line. ");
            return false;
        }
        return true;
    }
    public static double Perimeter(int x1, int y1, int x2, int y2, int x3, int y3){
        double z1,z2,z3, f1, f2, f3;
        double result;
        z1 = (Math.abs(x2-x1))*(Math.abs(x2-x1))+(Math.abs(y2-y1))*(Math.abs(y2-y1));
        f1 = Math.sqrt(z1);
        z2 = (Math.abs(x2-x3))*(Math.abs(x2-x3))+(Math.abs(y2-y3))*(Math.abs(y2-y3));
        f2 = Math.sqrt(z2);
        z3 = (Math.abs(x1-x3))*(Math.abs(x1-x3))+(Math.abs(y1-y3))*(Math.abs(y1-y3));
        f3 = Math.sqrt(z3);
        result = f3+f2+f1;
        return result;
        }
    }

