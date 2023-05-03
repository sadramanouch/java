public class quiz{
    public static void main(String[] args) {
        String object = "Welcome to Java!";
        words(object);
    
    }
    public static void words (String object){
        String word = "";
        object = object.trim();
        String[] words = object.split(" ");
        for (int i=0; i<words.length;i++){
            word = words[i];
            System.out.println("\n"+ word.charAt(0));
    }
}