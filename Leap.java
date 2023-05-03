import java.util.Scanner;
public class Leap {
    public static void main(String[] args) {
        //We initialize the Scanner
        Scanner input = new Scanner (System.in);
        //Initialize string answer for our while loop to be able to read it
        String answer;
        //Start a do while which repeats ou
        do{
            System.out.print("Please enter a year greater than 1582: ");
            int year = input.nextInt();
            int month = 2;
            int day = 29;
            //loops for if the leap year is true or not and it prints and call methods that call the day of the year feb 29 and the next same day for feb29.
            if (leap(year)){
                System.out.println("Year "+year+" is a leap year.");
                System.out.println("Feb 29,  "+year+" is on "+zellers(year,month,day));
                System.out.println("The next leap year where Feb 29 is on "+zellers(year,month,day)+" is year "+(year+28));
            }
            //else statement that says it is not a leap
            else{
                System.out.println("Year "+year+(" is not a leap year."));
            }
            //asking the user if they want to continue
            System.out.println("do you want to repeat the program? ");
            answer = input.next();
            //while loop if the answer is yes, continue
        } while (answer.equalsIgnoreCase("yes"));
        // this statement will print if the answer is anything else but ignorecase(yes)
        System.out.println("Program terminated. ");
    }
    public static String zellers (int year, int month, int day){
        //this method returns what day of a gven date
        int Number;
        String Name = "";
        int StartMonth=2;
        int StartYear=year;
        int LeapFactor;
        // we input, year, moth and day and it return if that is a 0 or a 6 which meand sunday to daturday
        if (month <3){
            StartMonth=0;
            StartYear =year-1; 
        }
        else{
            StartMonth = (int) (0.4*month+2.3);
            StartYear = year;
        }
        //This method also factors in leap years which add a day to the calender at feb 29th.
        LeapFactor=(StartYear/4)-(StartYear/100)+(StartYear/400);
        Number=(((365*year+31*(month-1)+day+LeapFactor-StartMonth)-1)%7);
        //we call out next method that converts a number to a name of the day
        Name = day (Number);
        //return string day
        return Name;
    }
    public static String day(int Number){
        // this method gets a day from the above method and converts it into a string of name of the day
        String day = "";
        //it uses a if and else statements and th days range from 0-sunday to 6-saturday
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
        //returning string name of the day
        return day;
    }
    public static boolean leap (int year){
        //this method returns if a year is a leap year or not
        boolean result = false;
        if (year%4 == 0){
            if (year%100 ==0){
                if (year%400 ==0){
                    //it work if the year is devisibile by 4, 100, and 400.
                    result = true;
                }
            }
        }
        //returning a boolean true or false
        return result;
    } 
}