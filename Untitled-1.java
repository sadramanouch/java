import java.io.*;
import java.util.*;
public class file {
    public static void main(String[] args)throws IOException{
        //we initialize the scanner new File 
        Scanner inFile = new Scanner(new File("names.txt"));
        Scanner keyboard = new Scanner (System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a name:")
        String name = keyboard.nextLine();
        int counter = 0;
        boolean inList = false;
        while (inFile.hasNextLine()){
            String line = inFile.nextLine();
            if (line.contains(name){
                counter += 1;
                inList = true;
            }
        }
        if (!inList){
            System.out.println("there are 0 "+name+" in this file");
        }
        if (inList){
            System.out.println("there are "+counter+" "+name+" in this file");
        }
    }
}