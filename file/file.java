
// Program Name: file
// Author: Sadra Manouchehrifar
// Date: 2021-11-08
// Course: CPSC 1150
// Compiler: JDK 16

import java.io.*;
import java.util.*;
public class file {
    public static void main(String[] args)throws IOException{
        //we initialize the scanner new File 
        Scanner inFile = new Scanner(new File("classList.txt"));
        Scanner keyboard = new Scanner (System.in);
        Scanner input = new Scanner(System.in);
        int choice;
        //ask the user to enter an option
        do{
            //do a dowhile loop so it atleast is ran once
            inFile = new Scanner(new File("classList.txt"));
            System.out.println("Please enter: ");
            System.out.println("1. To display a specific student's record.");
            System.out.println("2. To calculate the final exam average.");
            System.out.println("3. To find a student with the highest score on the final exam.");
            System.out.println("4. To copy the student's record to another file.");
            System.out.println("5. To terminate the program.");
            //store the user's inputs in choice which is passed to a switch statement 
            choice = input.nextInt();
            //if choice is outside of the perameter, en error is displayed as it shows
            while (choice <1 || choice>5){
                System.out.println("Enter 1, 2, 3, 4, or 5 ");
                choice = input.nextInt();
            }
            //the switch runs the appropriate method and displays the results
            switch (choice){
                case 1: 
                findStudent(inFile);
                break;
                case 2:
                System.out.println("The final exam average is: "+averageGrade(inFile));
                break;
                case 3:
                highestScore(inFile);
                break;
                case 4:
                copy(inFile);
                break;
            }
            inFile.close();
        }while(choice<5);
        //program terminates and this message is displayed after they enter number 5
        System.out.println("Program terminated.");
        input.close();
    }
    public static void findStudent (Scanner inFile)throws IOException{
        //call the method that we give us the results
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Please enter the student's name: ");
        String studentName = keyboard.nextLine();
        //initialize a boolean which will tell us if we found the answer or not
        boolean inList=false;
        String number, grade;
        //call nextLine twice to get rid of the first two lines of the program
        inFile.nextLine();
        inFile.nextLine();
        //do a while loop to read every line in the txt file
        while (inFile.hasNextLine()){
            String line = inFile.nextLine();
            //if the name is found, we split the line into 3 seperates and display each accordingly
            if (line.contains(studentName)){
                System.out.println("Name: "+studentName);
                String array[] = line.split(":");
                number = array[0];
                System.out.println("ID: "+number);
                grade = array[2];
                System.out.println("Final: "+grade);
                inList=true;
            }
        }
        // if the name is not found, we display the no match sentance and let the user know
        if(!inList)
            System.out.println("No match.");
    }
    public static double averageGrade(Scanner inFile)throws IOException{
        Scanner keyboard = new Scanner (System.in);
        //in this program, we get the vaerage of the studetns scores
        double average=0;
        int sum=0;
        int count = 0;
        //do this twice to get rid of the first two lines(as its shown in alost every method here)
        inFile.nextLine();
        inFile.nextLine();
        //while loop to split the array and record the grades, add them up and devide them by count
        while (inFile.hasNextLine()){
            String line = inFile.nextLine();
            String array[] = line.split(":");
            String grade = array[2];
            sum+=Double.parseDouble(grade); 
            count++;
        }
        average = sum/count;
        //we pass on the double value and print it in the switch statement
        return average;
    }
    public static void highestScore (Scanner inFile) throws IOException{
        Scanner keyboard = new Scanner (System.in);
        //in this method, we get the highest grade and siplay the name of the student, the grade and their id.
        int num;
        int highestGrade=1;
        String highestName="";
        String highestId="";
        inFile.nextLine();
        inFile.nextLine();
        //we run a while loop to split the strings as usual and store the different values in different arrays
        while (inFile.hasNextLine()){
            String line = inFile.nextLine();
            String array[] = line.split(":");
            //we store the names, grades, and id's in different array components
            String grade = array[2];
            String id = array[0];
            String name = array[1];
            num = Integer.parseInt(grade);
            //this if statement will get us the highest grade and we will know who has it
            if (num>highestGrade){
                highestGrade = num;
                highestName=name;
                highestId=id;
            }
        }
        //we display the results here. I tried the String.format just to ee if it workd and it did :)
        String s1 = String.format("Name: %s",highestName);
        System.out.println("The student with highest score in the final exam: ");
        System.out.println(s1);
        System.out.println("ID: "+ highestId);
        System.out.println("Final: "+ highestGrade);
    }
    public static void copy (Scanner inFile)throws IOException{
        Scanner keyboard = new Scanner (System.in);
        //in this method, we copy the txt file into a different file, line by line
        PrintWriter outFile;
        String outFileName;
        //ask the user to enter a name for their new file and we store that in a printwriter type 
        System.out.println("Please enter the file name: ");
        outFileName = keyboard.nextLine();
        outFile = new PrintWriter(new FileWriter(outFileName));
        //we run a while loop to make sure than every single line in this file is coppied
        while(inFile.hasNextLine()){
            String line = inFile.nextLine();
            outFile.println(line);
        }
        //we cose the file at the end
        outFile.close();
    }
}