import java.io.*;
import java.util.*;
public class final {
    public static void main(String[] args)throws IOException{
        //we initialize the scanner new File 
        Scanner theData = new Scanner(new File("called ages.txt"));
        Scanner keyboard = new Scanner (System.in);
        Scanner input = new Scanner(System.in);
        getFrequencyData(theData);
    }
    public static int[] getFrequencyData(Scanner theData) throws IOException{
        Scanner keyboard = new Scanner (System.in);
        int[] frequencies = new int[12];
        while (theData.hasNextLine){
            String line = theData.nextLine();
            if (line.contains("18")){
                frequencies[0]++;
            }
            if (line.contains("19")){
                frequencies[1]++;
            }
            if (line.contains("20")){
                frequencies[2]++;
            }
            if (line.contains("21")){
                frequencies[3]++;
            }
            if (line.contains("22")){
                frequencies[4]++;
            }
            if (line.contains("23")){
                frequencies[5]++;
            }
            if (line.contains("24")){
                frequencies[6]++;
            }
            if (line.contains("25")){
                frequencies[7]++;
            }
            if (line.contains("26")){
                frequencies[8]++;
            }
            if (line.contains("27")){
                frequencies[9]++;
            }
            if (line.contains("28")){
                frequencies[10]++;
            }
            if (line.contains("29")){
                frequencies[11]++;
            }
            if (line.contains("30")){
                frequencies[12]++;
            }
        }
        displayFrequencies( frequencies);
    }
    public static void displayFrequencies(int[] frequencies) throws IOException{
        System.out.println("18");
        for (int i = 1; i<frequencies[0].value ; i++){
            System.out.print("-");
        }
        System.out.println("19");
        for (int i = 1; i<frequencies[1].value ; i++){
            System.out.print("-");
        }
        System.out.println("20");
        for (int i = 1; i<frequencies[2].value ; i++){
            System.out.print("-");
        }
        System.out.println("21");
        for (int i = 1; i<frequencies[3].value ; i++){
            System.out.print("-");
        }
        System.out.println("22");
        for (int i = 1; i<frequencies[4].value ; i++){
            System.out.print("-");
        }
        System.out.println("23");
        for (int i = 1; i<frequencies[5].value ; i++){
            System.out.print("-");
        }
        System.out.println("24");
        for (int i = 1; i<frequencies[6].value ; i++){
            System.out.print("-");
        }
        System.out.println("25");
        for (int i = 1; i<frequencies[7].value ; i++){
            System.out.print("-");
        }
        System.out.println("26");
        for (int i = 1; i<frequencies[8].value ; i++){
            System.out.print("-");
        }
        System.out.println("27");
        for (int i = 1; i<frequencies[9].value ; i++){
            System.out.print("-");
        }
        System.out.println("28");
        for (int i = 1; i<frequencies[10].value ; i++){
            System.out.print("-");
        }
        System.out.println("29");
        for (int i = 1; i<frequencies[11].value ; i++){
            System.out.print("-");
        }
        System.out.println("30");
        for (int i = 1; i<frequencies[12].value ; i++){
            System.out.print("-");
        }
        System.out.println("Total:" + + " students");
        
    }
}