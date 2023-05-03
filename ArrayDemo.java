public class ArrayDemo{
    public static void main(String[] args){
        int[] numbers = new int[20];
        initializeArray(numbers);
        System.out.println("The random numbers are:");
        displayArray(numbers);
        System.out.println("\nThe smalles number in the list : " + getSmallest(numbers));
        System.out.println("The average of the array elements is: " +
        getAverage(numbers));
        reverseArray(numbers);
        System.out.println("The random numbers in reverse are:");
        displayArray(numbers);
    }
    public static int[] initializeArray(int[] numbers){
        for (int i=0; i<numbers.length; i++){
            numbers[i]= (int) (Math.random()*101);
        }
        return numbers;
    }
    public static void displayArray(int[] numbers){
        for (int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+ ", ");
        }
    }
    public static int getSmallest(int[] numbers){
        int min = numbers[0];
        for (int i=1;i<numbers.length; i++){
            if (numbers[i]<min){
                min = numbers[i];
            }
        }
        return min;
    }
    public static double getAverage(int[] numbers){
        int total=0;
        double average=0;
        for (int i=0;i<numbers.length;i++){
            total = total + numbers[i];
        }
        average = total/20;
        return average;
    }
    public static void reverseArray(int[] numbers){
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start = start + 1;
            end = end - 1;
        }
    }
}