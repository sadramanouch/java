public class Pantagon {
    public static void main(String[] args) {
        //We initialize i
        int i;
        //Start a loop hat prints and repeats our method 10 times
        for (i=1; i<=10; i++){
            System.out.print(getPentagonalNumber(i) +" ");
        }
    }
    public static int getPentagonalNumber (int num){
        //This is our method which has the formula on it and runs over and over to find the answer
        int result;
        result =num*(num*3-1)/2;
        //our method's output in the result
        return result;
    }
}
