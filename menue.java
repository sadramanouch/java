import java.util.Scanner;
public class menue {
    static Scanner input;
    //main method
    public static void main(String[] args) {
        input = new Scanner(System.in);
        // asking the user to enter a sentance and storing that sentance
        System.out.println("Please enter a sentance: ");
        String str =  input.nextLine();
        int choice;
        // start the do while loop
        do {
            // print out the functions and choices that are provided
            System.out.println("Please enter: ");
            System.out.println("1. To display the number of words in a sentance.");
            System.out.println("2. to display the number of vowel characters in the sentance.");
            System.out.println("3. To display the word with the most number of characters.");
            System.out.println("4. To display the word with the most vowels.");
            System.out.println("5. To enter a new statement.");
            System.out.println("6. To terminate the program.");
            choice = input.nextInt();
            // define if the input is out of range
            while (choice <1 || choice>6 && choice>7){
                System.out.println("Enter 1, 2, 3, 4, 5, or 6 ");
                choice = input.nextInt();
            }
            // start the switch statement which has 5 cases and options in it
            switch (choice){
                case 1:
                System.out.println("The number of words in '" + str +"' are: "+ countwords(str)+ "\n");
                break;
                case 2:
                System.out.println(countvowels(str) + "\n");
                break;
                case 3:
                System.out.println("\nThe longest word is: "+longestword(str) + "\n");
                break;
                case 4:
                System.out.println("\nThe word with the most vowels is: "+ mostvowels(str)+"\n");
                break;
                case 5:
                str = sentace();
                break;
            }   
        } while (choice<6);
        // if the choice is 6, program terminates and thisis displayed
        System.out.println("Program terminated.");
        input.close();
    }
    public static int countwords (String str){
        //if the string is empty, return 0
        if (str == null || str.isEmpty())
            return 0;
        //remove the spaces at the end and beggining of the sentance
        str = str.trim();
        String[] words = str.split(" ");
        //counting the number of spaces in the string, adding one and displaying the result
        return words.length;
    }
    public static String countvowels(String str){
        if (str == null)
            return "String is empty!";
        else{
            // define an int for each vowel
            str = str.trim();
            int A=0;
            int E=0;
            int I=0;
            int O=0;
            int U=0;
            // for loop to count each vowel and increment the count for each one
            for (int i=0; i<str.length(); ++i){
                if (str.charAt(i) == 'a' || str.charAt(i) == 'A'){
                    A++;
                }
                if (str.charAt(i) == 'e' || str.charAt(i) == 'E'){
                    E++;
                }   
                if (str.charAt(i) == 'i' || str.charAt(i) == 'I'){
                    I++;
                }
                if (str.charAt(i) == 'o' || str.charAt(i) == 'O'){
                    O++;
                }
                if (str.charAt(i) == 'u' || str.charAt(i) == 'U'){
                    U++;
                } 
            }
            // return this statement when done counting
            return "\nThere are:\n"+ A + " a's, \n"+ E +" e's, \n"+ I +" i's, \n"+ O +" o's, and \n"+ U +" u's in this string.";
        }
    }
    public static String longestword( String str){
        String error = "Error";
        if (str == null || str.isEmpty())
            return error;
        else {
            // trim the word so empty spaces are eliminated
            str = str.trim();
            // split the word by its spaces
            String[] word = str.split(" ");
            String longestword = "";
            // for loop to compare each word and return the longest word
            for (int i=0; i <word.length ; i++){
                if (word[i].length() > longestword.length()){
                    longestword = word[i];
                } 
            }
            return longestword;
        }
    }
    public static int countVowels (String words){
        int count = 0;
        // defining the vowels that need to be counted
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        // setting a for loop to check each letter and count all the vowels
        for (int i=0; i<words.length(); i++){
            char ch = words.charAt(i);
            for (char cc : vowel){
                if (ch == cc){
                    count++;
                }
            }
        }
        // returning the count
        return count;
    }
    public static String mostvowels ( String str){
        str = str.trim();
        int maxvowel = 0;
        String[] words = str.split(" ");
        String mostvowels = "";
        // for loop to compare each word's vowel count and return the one with the most
        for (int i=0; i<words.length; i++){
            // we call our previous method which counts the vowels of each word
            int count = countVowels(words[i]);
            if (count == maxvowel){
                // if none have vowels, display this message and if one does, return it
                mostvowels = "No word has vowels";
            }
            else if (count > maxvowel){
                maxvowel = count;
                mostvowels = words[i];
            }
        }
        return mostvowels;
    }
    public static String sentace(){
        // asks the user to enter a new sentance, inputs the sentance and displays is which replaces the old sentance
        System.out.println("\nPlease enter a sentance: ");
        String str = input.nextLine();
        str = input.nextLine();
        return str;
    }
}
