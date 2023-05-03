import java.util.Scanner;
public class Zeller {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a year greater than 1582: ");
        int year = input.nextInt();
        int month = 1;
        int day = 1;
        System.out.println("The first day of January "+year+" is on "+zellers(year,month,day));
    }
    public static String zellers (int year, int month, int day){
        int Number;
        String Name = "";
        int StartMonth=1;
        int StartYear=year;
        int LeapFactor;
        if (month <3){
            StartMonth=0;
            StartYear =year-1; 
        }
        else{
            StartMonth = (int) (0.4*month+2.3);
            StartYear = year;
        }
        LeapFactor=(StartYear/4)-(StartYear/100)+(StartYear/400);
        Number=(((365*year+31*(month-1)+day+LeapFactor-StartMonth)-1)%7);
        Name = day (Number);
        return Name;
    }
    public static String day(int Number){
        String day = "";
        if (Number == 0){
            day = "Sunday";
        }
        else if (Number == 1){
            day = "Monday";
        }
        else if (Number == 2){
            day = "Tuesday";
        }else if (Number == 3){
            day = "Wednesday";
        }else if (Number == 4){
            day = "Thursday";
        }else if (Number == 5){
            day = "Friday";
        }else {
            day = "Saturday";
        }
        return day;
    }
}
