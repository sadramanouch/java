
// Program Name: Arrays
// Author: Sadra Manouchehrifar
// Date: 2021-11-02
// Course: CPSC 1150
// Compiler: JDK 16

import java.util.*;
// In this arrya, we will get an undefined amount f inputs from the user and shw them in a chart
public class Arrays{
    public static void main(String[] args) {
        // initializing scanner
        Scanner input = new Scanner(System.in);
        int number=0;
        // initializing our arraylist
        ArrayList<Integer> score = new ArrayList<Integer>();
        do{
            // in a do while, starting our main loop and asking the user for input
            System.out.println("Enter a score between 0 and 100: ");
            number=input.nextInt();
            // if the input os valid, storing it
            if (number>=0 && number<=100){
                score.add(number);
            }
            // if not, printing an error message
            else if (number>100){
                System.out.println("Error! Enter a valid number");
            }
        }while(number>=0);
        // running the loop while the input is not negative and then running our method to display the result
        answer(score);
    }
    public static void answer(ArrayList<Integer> score){
        int[] counter = new int[10];
        // devidig each input by 10 and storing it in the right place. 
        for (int i=0; i<score.size(); i++){
            int index = (int) (score.get(i)/10);
            counter[index]++;
            // I felt to leave my past work but realized a better way to do this program after a few hours of playing around

            // if (score.get(i)>=0 && score.get(i)<=9)
            //     counter[0]++;
            // else if (score.get(i)>=10 && score.get(i)<=19)
            //     counter[1]++;
            // else if (score.get(i)>=20 && score.get(i)<=29)
            //     counter[2]++;
            // else if (score.get(i)>=30 && score.get(i)<=39)
            //     counter[3]++;
            // else if (score.get(i)>=40 && score.get(i)<=49)
            //     counter[4]++;
            // else if (score.get(i)>=50 && score.get(i)<=59)
            //     counter[5]++;
            // else if (score.get(i)>=60 && score.get(i)<=69)
            //     counter[6]++;
            // else if (score.get(i)>=70 && score.get(i)<=79)
            //     counter[7]++;
            // else if (score.get(i)>=80 && score.get(i)<=89)
            //     counter[8]++;
            // else
            //     counter[9]++;
            // i++;
        }
        // displaying our table and result
        System.out.println("Range   Number of Scores");
        System.out.println("-----   ----------------");
        System.out.println("0-9             "+counter[0]);
        System.out.println("10-19           "+counter[1]);
        System.out.println("20-29           "+counter[2]);
        System.out.println("30-39           "+counter[3]);
        System.out.println("40-49           "+counter[4]);
        System.out.println("50-59           "+counter[5]);
        System.out.println("60-69           "+counter[6]);
        System.out.println("70-79           "+counter[7]);
        System.out.println("80-89           "+counter[8]);
        System.out.println("90-100          "+counter[9]);
    }
}